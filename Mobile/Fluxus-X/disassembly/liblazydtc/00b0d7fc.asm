; X509_EXTENSION_get_data @ 00b0d7fc
00b0d7fc	add x8,x0,#0x10
00b0d800	cmp x0,#0x0
00b0d804	csel x0,xzr,x8,eq
00b0d808	ret
