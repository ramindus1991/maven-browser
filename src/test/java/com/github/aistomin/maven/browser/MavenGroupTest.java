/*
 * Copyright (c) 2019, Istomin Andrei
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.aistomin.maven.browser;

import java.util.Arrays;
import java.util.HashSet;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * The tests for {@link MavenGroup}.
 *
 * @since 0.1
 */
public final class MavenGroupTest {

    /**
     * Check that we correctly assign and return the name of the group.
     */
    @Test
    void testName() {
        final String name = UUID.randomUUID().toString();
        Assertions.assertEquals(name, new MavenGroup(name).name());
    }

    /**
     * Check that we correctly override equals and hashCode methods.
     */
    @Test
    void testEqualsAndHashCode() {
        final String group = UUID.randomUUID().toString();
        final MavenGroup first = new MavenGroup(group);
        final MavenGroup second = new MavenGroup(group);
        Assertions.assertEquals(first, second);
        Assertions.assertEquals(
            1, new HashSet<>(Arrays.asList(first, second)).size()
        );
    }
}
