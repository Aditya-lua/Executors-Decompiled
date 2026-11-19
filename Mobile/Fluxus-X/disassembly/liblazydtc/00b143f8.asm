; X509_VERIFY_PARAM_set_flags @ 00b143f8
00b143f8	ldr x9,[x0, #0x18]
00b143fc	tst x1,#0x780
00b14400	mov x8,x0
00b14404	mov w0,#0x1
00b14408	orr x9,x9,x1
00b1440c	orr x10,x9,#0x80
00b14410	csel x9,x9,x10,eq
00b14414	str x9,[x8, #0x18]
00b14418	ret
