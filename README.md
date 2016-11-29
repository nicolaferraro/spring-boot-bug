# spring-boot-bug

Shows that `@ConditionalOnBean` together with `@ConfigureAfter` have just the effect of disabling the configuration in the application module
(`spring-boot-bug-app`), while they work as expected in other modules (`spring-boot-bug-core`, `spring-boot-bug-mod1`). 