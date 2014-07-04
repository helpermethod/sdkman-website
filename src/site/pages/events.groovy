layout 'layouts/main.groovy',
        currentPage: currentPage,
        menu: menu,
        allEvents: allEvents,
        category: category,
        pageTitle: 'The Groovy programming language - Events',
        mainContent: contents {
            div(id: 'content', class: 'page-1') {
                div(class: 'row') {
                    div(class: 'row-fluid') {
                        div(class: 'col-lg-3') {
                            include template: 'includes/community-navbar.groovy'
                        }

                        div(class: 'col-lg-8 col-lg-pull-0') {
                            h1 'Events'
                            article {
                                p '''
                                    Groovy and its ecosystem are often represented at various Java-oriented conferences,
                                    but there are particular events fully dedicated to the Groovy ecosystem.
                                    Here are the upcoming ones you might interested in learning about.
                                '''
                                hr(class: 'divider')
                                allEvents.each {
                                    String eventName = it.key
                                    Event event = it.value

                                    h2 {
                                        a(href: event.url, eventName)
                                    }
                                    h3 {
                                        yield event.location
                                        yieldUnescaped ' &mdash; '
                                        em event.date
                                    }
                                    div {
                                        yieldUnescaped event.description
                                    }
                                    hr(class: 'divider')
                                }
                            }

                        }
                    }
                }
            }
        }

