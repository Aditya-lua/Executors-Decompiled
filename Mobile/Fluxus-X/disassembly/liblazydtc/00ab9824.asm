; X509_SIG_getm @ 00ab9824
00ab9824	cbz x1,0x00ab9830
00ab9828	ldr x8,[x0]
00ab982c	str x8,[x1]
00ab9830	cbz x2,0x00ab983c
00ab9834	ldr x8,[x0, #0x8]
00ab9838	str x8,[x2]
00ab983c	ret
