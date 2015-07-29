records.each { Course c ->
	csv << [
			"code"                        : c.code,
			"name"                        : c.name,
			"createdOn"                   : c.createdOn?.format("yyyy-MM-dd'T'HH:mm:ssZ"),
			"modifiedOn"                  : c.modifiedOn?.format("yyyy-MM-dd'T'HH:mm:ssZ"),
			"currentlyOffered"            : c.currentlyOffered,
			"fieldOfEducation"            : c.fieldOfEducation,
			"isWebVisible"                : c.isShownOnWeb,
			"isVET"                       : c.isVET,
			"reportableHours"             : c.reportableHours,
			"webDescription"              : c.webDescription,
			"allowWaitingLists"           : c.allowWaitingLists,
			"isShownOnWeb"                : c.isShownOnWeb,
			"isSufficientForQualification": c.isSufficientForQualification,
			"printedBrochureDescription"  : c.printedBrochureDescription
	]
}
