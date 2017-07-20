package org.pentaho.osgi.metastore.locator.api.impl;

import org.pentaho.di.core.extension.ExtensionPoint;
import org.pentaho.di.core.osgi.api.MetastoreLocatorOsgi;

/**
 * Created by tkafalas on 7/13/2017.
 * <p>
 * This class exists because two ExtensionPoint annotations are not allowed on the same class.
 */
@ExtensionPoint( id = "MetastoreLocatorNewTransExtensionPoint", extensionPointId = "TransformationCreateNew",
  description = "" )
public class MetastoreLocatorNewTransExtensionPoint extends MetastoreLocatorExtensionPoint {
  public MetastoreLocatorNewTransExtensionPoint( MetastoreLocatorOsgi metastoreLocatorOsgi ) {
    super( metastoreLocatorOsgi );
  }

}
