/* ====================================================================
   Copyright 2003-2005   Apache Software Foundation

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package org.apache.poi.hssf.record.formula;

/**
 * Title:        Deleted Area 3D Ptg - 3D referecnce (Sheet + Area)<P>
 * Description:  Defined a area in Extern Sheet. <P>
 * REFERENCE:  <P>
 * @author Patrick Luby
 * @version 1.0-pre
 */

public class DeletedArea3DPtg extends Area3DPtg
{
	public final static byte sid = 0x3d;

    /** Creates new DeletedArea3DPtg */
    public DeletedArea3DPtg( String arearef, short externIdx )
    {
        super(arearef, externIdx);
    }

    public DeletedArea3DPtg( byte[] data, int offset )
    {
        super(data, offset);
    }
}
