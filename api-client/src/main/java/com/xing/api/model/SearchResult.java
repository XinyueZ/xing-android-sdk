/*
 * Copyright (С) 2015 XING AG (http://xing.com/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xing.api.model;

import com.squareup.moshi.Json;
import com.xing.api.model.user.XingUser;

/**
 * @author daniel.hartwich
 */
public class SearchResult {
    @Json(name = "user")
    private XingUser searchResultItem;

    @Json(name = "total")
    private int total;

    public XingUser getSearchResultItem() {
        return searchResultItem;
    }

    public void setSearchResultItem(XingUser searchResultItem) {
        this.searchResultItem = searchResultItem;
    }
}