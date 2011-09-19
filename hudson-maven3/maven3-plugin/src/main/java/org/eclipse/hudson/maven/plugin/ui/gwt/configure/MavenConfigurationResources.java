/*******************************************************************************
 *
 * Copyright (c) 2010-2011 Sonatype, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: 
 *
 *   
 *     
 *
 *******************************************************************************/ 

package org.eclipse.hudson.maven.plugin.ui.gwt.configure;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

/**
 * Global resources for the MavenConfiguration module.
 *
 * @author <a href="mailto:jason@planet57.com">Jason Dillon</a>
 * @since 2.1.0
 */
public interface MavenConfigurationResources
    extends ClientBundle
{
    // FIXME: This is currently unused, pending a reason to keep it

    @Source("MavenConfiguration.css")
    Style style();

    interface Style
        extends CssResource
    {
        String maven3Bold();
    }
}