records.collectMany { Invoice i -> i.invoiceLines }.each { il ->
	csv << [
			"Invoice Number"                : il.invoice.invoiceNumber,
			"Invoice Date"                  : il.invoice.invoiceDate?.format("yyyy-MM-dd"),
			"Invoice line Title"            : il.title,
			"Invoice line Description"      : il.description,
			"Invoice To Last Name"          : il.invoice.contact.lastName,
			"Invoice To First Name"         : il.invoice.contact.firstName,
			"Invoice line Account Code"     : il.account.accountCode,
			"Invoice line Account name"     : il.account.description,
			"Invoice line amount"           : il.priceTotalIncTax?.toPlainString(),
			"Invoice line Tax"              : il.taxEach?.toPlainString(),
			"Tax Type"                      : il.tax.taxCode,
			"Invoice line discount"         : il.discountTotalExTax?.toPlainString(),
			"Invoice Owing"                 : il.invoice.amountOwing?.toPlainString(),
			"Invoice prepaid fees remaining": il.prepaidFeesRemaining?.toPlainString(),
			"Invoice line Quantity"         : il.quantity,
			"Invoice description"           : il.invoice.description,
			"Invoice Due Date"              : il.invoice.dateDue?.format("yyyy-MM-dd"),
			"Invoice Created by"            : il.invoice.createdByUserName,
			"Invoice Source"                : il.invoice.source.displayName,
			"Invoice modified on"           : il.invoice.modifiedOn?.format("d/M/Y hh:mm"),
			"Invoice created on"            : il.invoice.createdOn?.format("d/M/Y hh:mm")
	]
}
