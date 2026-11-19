; X509_TRUST_get_by_id @ 00b0cd48
00b0cd48	mov w8,w0
00b0cd4c	sub w0,w0,#0x1
00b0cd50	cmp w0,#0x8
00b0cd54	b.cc 0x00b0cd90
00b0cd58	adrp x9,0xd22000
00b0cd5c	ldr x0,[x9, #0x7e8]
00b0cd60	cbz x0,0x00b0cd94
00b0cd64	sub sp,sp,#0x40
00b0cd68	add x1,sp,#0x8
00b0cd6c	stp x29,x30,[sp, #0x30]
00b0cd70	add x29,sp,#0x30
00b0cd74	str w8,[sp, #0x8]
00b0cd78	bl 0x00c34760
00b0cd7c	ldp x29,x30,[sp, #0x30]
00b0cd80	add w8,w0,#0x8
00b0cd84	cmp w0,#0x0
00b0cd88	csinv w0,w8,wzr,ge
00b0cd8c	add sp,sp,#0x40
00b0cd90	ret
00b0cd94	mov w0,#0xffffffff
00b0cd98	ret
