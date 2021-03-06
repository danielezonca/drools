/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.dmn.feel.gwt.functions.api;

/**
 * FEEL DMN GWT functions type enum
 *
 * These types are used by the GWT-friendly/generated function instances.
 */
public enum Type {
    NUMBER("number"),
    PERIOD("Period"),
    DURATION("Duration"),
    COMPARABLE("Comparable"),
    BOOLEAN("boolean"),
    RANGE("Range");

    private String name;

    Type(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
