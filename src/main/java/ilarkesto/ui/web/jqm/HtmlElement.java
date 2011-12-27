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

import ilarkesto.io.IO;
import ilarkesto.ui.web.HtmlRenderer;

import java.io.PrintWriter;
import java.io.StringWriter;

public class HtmlElement extends AElement {

	private StringWriter out;
	private HtmlRenderer renderer;

	public HtmlElement() {
		out = new StringWriter();
		renderer = new HtmlRenderer(new PrintWriter(out), IO.UTF_8);
	}

	public HtmlRenderer getRenderer() {
		return renderer;
	}

	@Override
	public void render(HtmlRenderer html) {
		this.renderer.flush();
		html.html(out.toString());
	}

}
