/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2002-2008, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.jdbc;

/**
 * Represents a column of a primary key which is not auto incrementing.
 *
 * <p>If the type of the column is integral, new values are generated by selecting the max value of
 * the key and adding 1 to it. If the column is character based a random string is generated.
 *
 * @author Justin Deoliveira, OpenGEO
 */
public class NonIncrementingPrimaryKeyColumn extends PrimaryKeyColumn {

    public NonIncrementingPrimaryKeyColumn(String name, Class type) {
        super(name, type);
    }
    //
    //    @Override
    //    public Object generate(Connection cx, SQLDialect dialect)
    //            throws SQLException, IOException {
    //
    //        Class t = getType();
    //
    //        //is the column numeric?
    //        if ( Number.class.isAssignableFrom( t ) ) {
    //            //is the column integral?
    //            if ( t == Short.class || t == Integer.class || t == Long.class
    //                || BigInteger.class.isAssignableFrom( t ) ) {
    //
    //                StringBuffer sql = new StringBuffer();
    //                sql.append( "SELECT MAX(");
    //                dialect.encodeColumnName( getName() , sql );
    //                sql.append( ") + 1 FROM ");
    //                dialect.encodeTableName( getPrimaryKey().getTableName(), sql);
    //
    //                Statement st = cx.createStatement();
    //                try {
    //
    //                }
    //                finally {
    //
    //                }
    //            }
    //        }
    //        else if ( CharSequence.class.isAssignableFrom( t ) ) {
    //
    //        }
    //
    //        throw new IOException( "Cannot generate key value for column of type: " + t.getName()
    // );
    //
    //    }

}
