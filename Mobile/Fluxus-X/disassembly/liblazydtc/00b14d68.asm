; X509_NAME_get_index_by_NID @ 00b14d68
00b14d68	stp x22,x21,[sp, #-0x30]!
00b14d6c	mov x21,x0
00b14d70	mov w0,w1
00b14d74	stp x20,x19,[sp, #0x10]
00b14d78	stp x29,x30,[sp, #0x20]
00b14d7c	add x29,sp,#0x20
00b14d80	mov w19,w2
00b14d84	bl 0x00c37740
00b14d88	cbz x0,0x00b14de0
00b14d8c	cbz x21,0x00b14dd8
00b14d90	ldr x21,[x21]
00b14d94	mov x20,x0
00b14d98	cmp w19,#0x0
00b14d9c	csinv w19,w19,wzr,ge
00b14da0	mov x0,x21
00b14da4	bl 0x00c325e0
00b14da8	mov w22,w0
00b14dac	add w19,w19,#0x1
00b14db0	cmp w19,w22
00b14db4	b.ge 0x00b14dd8
00b14db8	mov x0,x21
00b14dbc	mov w1,w19
00b14dc0	bl 0x00c32610
00b14dc4	ldr x0,[x0]
00b14dc8	mov x1,x20
00b14dcc	bl 0x00c37ab0
00b14dd0	cbnz w0,0x00b14dac
00b14dd4	b 0x00b14de4
00b14dd8	mov w19,#0xffffffff
00b14ddc	b 0x00b14de4
00b14de0	orr w19,wzr,#0xfffffffe
00b14de4	mov w0,w19
00b14de8	ldp x29,x30,[sp, #0x20]
00b14dec	ldp x20,x19,[sp, #0x10]
00b14df0	ldp x22,x21,[sp], #0x30
00b14df4	ret
