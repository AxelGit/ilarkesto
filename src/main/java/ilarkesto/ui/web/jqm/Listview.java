/*
 * Copyright 2011 Witoslaw Koczewsi <wi@koczewski.de>
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with this program. If not,
 * see <http://www.gnu.org/licenses/>.
 */
package ilarkesto.ui.web.jqm;

import ilarkesto.ui.web.HtmlRenderer;
import ilarkesto.ui.web.HtmlRenderer.Tag;

public class Listview extends AContainerElement {

	private boolean dataInset = true;
	private boolean dataFilter;

	public Listview setDataFilter(boolean dataFilter) {
		this.dataFilter = dataFilter;
		return this;
	}

	public ListItem addItem() {
		return addChild(new ListItem());
	}

	@Override
	protected void renderHeader(HtmlRenderer html) {
		Tag ul = html.startUL();
		ul.setDataRole("listview");
		ul.set("data-inset", dataInset);
		if (dataFilter) ul.set("data-filter", dataFilter);
	}

	@Override
	protected void renderFooter(HtmlRenderer html) {
		html.endUL();
	}

}
