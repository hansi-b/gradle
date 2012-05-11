/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.tooling.model;

import java.io.File;

/**
 * Represents an external artifact dependency.
 */
public interface ExternalDependency extends Dependency {
    /**
     * Returns the file for this dependency.
     *
     * @return The file. Never null.
     */
    File getFile();

    /**
     * Returns the source directory/archive for this dependency.
     *
     * @return The source file. Returns null when the source is not available for this dependency.
     */
    File getSource();

    /**
     * Returns the Javadoc directory/archive for this dependency.
     *
     * @return The Javadoc file. Returns null when the Javadoc is not available for this dependency.
     */
    File getJavadoc();

    /**
     * Returns the gradle module information about this dependency.
     *
     * @return Gradle module information.
     *      May be null - it means the external dependency was not a remote-repository dependency.
     * @since 1.1-rc-1
     */
    ExternalGradleModule getExternalGradleModule();
}
