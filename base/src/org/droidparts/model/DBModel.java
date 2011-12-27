/**
 * Copyright 2011 Alex Yanchenko
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package org.droidparts.model;

import static org.droidparts.contract.SQLConstants.Column.ID;

import org.droidparts.annotation.sql.Column;

public class DBModel extends Model {
	private static final long serialVersionUID = 1L;

	public DBModel() {
		// subclasses must have a no-arg constructor
	}

	@Column(name = ID)
	public long id;

	@Override
	public String toString() {
		return getClass().getCanonicalName() + ", id: " + id;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		} else if (this == o) {
			return true;
		} else if (getClass() == o.getClass()) {
			return id == ((DBModel) o).id;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getClass().hashCode() + (int) id;
	}

}