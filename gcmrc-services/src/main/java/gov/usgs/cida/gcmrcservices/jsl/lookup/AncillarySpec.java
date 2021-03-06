package gov.usgs.cida.gcmrcservices.jsl.lookup;

import gov.usgs.webservices.jdbc.spec.GCMRCSpec;
import gov.usgs.webservices.jdbc.spec.mapping.ColumnMapping;
import gov.usgs.webservices.jdbc.spec.mapping.SearchMapping;
import gov.usgs.webservices.jdbc.spec.mapping.WhereClauseType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author dmsibley
 */
public class AncillarySpec extends GCMRCSpec {
	private static final Logger log = LoggerFactory.getLogger(AncillarySpec.class);

	@Override
	public boolean setupAccess_DELETE() {
		return false;
	}

	@Override
	public boolean setupAccess_INSERT() {
		return false;
	}

	@Override
	public boolean setupAccess_READ() {
		return true;
	}

	@Override
	public boolean setupAccess_UPDATE() {
		return false;
	}

	@Override
	public ColumnMapping[] setupColumnMap() {
		return new ColumnMapping[] {
			new ColumnMapping(C_GROUP_ID, S_GROUP_ID),
			new ColumnMapping(C_ANCILLARY_GROUP_ID, S_ANCILLARY_GROUP_ID),
			new ColumnMapping(C_ANCILLARY_NAME, S_ANCILLARY_NAME),
			new ColumnMapping(C_ANCILLARY_SERVICE_COLUMN, S_ANCILLARY_SERVICE_COLUMN)
		};
	}

	@Override
	public String setupDocTag() {
		return "success";
	}

	@Override
	public String setupRowTag() {
		return "data";
	}

	@Override
	public SearchMapping[] setupSearchMap() {
		return new SearchMapping[] {
			new SearchMapping(null, null, null, null, null, null, null),
		};
	}

	@Override
	public String setupTableName() {
		StringBuilder result = new StringBuilder();
		
		result.append("ANCILLARY_COLUMN");
		
		return result.toString();
	}

	public static final String C_GROUP_ID = "GROUP_ID";
	public static final String S_GROUP_ID = "groupId";
	public static final String C_ANCILLARY_GROUP_ID = "ANCILLARY_GROUP_ID";
	public static final String S_ANCILLARY_GROUP_ID = "ancillaryGroupId";
	public static final String C_ANCILLARY_NAME = "ANCILLARY_NAME";
	public static final String S_ANCILLARY_NAME = "ancillaryName";
	public static final String C_ANCILLARY_SERVICE_COLUMN = "ANCILLARY_SERVICE_COLUMN";
	public static final String S_ANCILLARY_SERVICE_COLUMN = "ancillaryColumn";
}
