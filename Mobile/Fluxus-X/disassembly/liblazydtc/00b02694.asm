; X509_PURPOSE_get_by_id @ 00b02694
00b02694	mov w8,w0
00b02698	sub w0,w0,#0x1
00b0269c	cmp w0,#0x9
00b026a0	b.cc 0x00b026dc
00b026a4	adrp x9,0xd22000
00b026a8	ldr x0,[x9, #0x7e0]
00b026ac	cbz x0,0x00b026e0
00b026b0	sub sp,sp,#0x40
00b026b4	mov x1,sp
00b026b8	stp x29,x30,[sp, #0x30]
00b026bc	add x29,sp,#0x30
00b026c0	str w8,[sp]
00b026c4	bl 0x00c34760
00b026c8	ldp x29,x30,[sp, #0x30]
00b026cc	add w8,w0,#0x9
00b026d0	cmp w0,#0x0
00b026d4	csinv w0,w8,wzr,ge
00b026d8	add sp,sp,#0x40
00b026dc	ret
00b026e0	mov w0,#0xffffffff
00b026e4	ret
