; X509_check_ca @ 00b02e44
00b02e44	str x19,[sp, #-0x20]!
00b02e48	stp x29,x30,[sp, #0x10]
00b02e4c	add x29,sp,#0x10
00b02e50	mov x19,x0
00b02e54	bl 0x00b01d98
00b02e58	cbz w0,0x00b02eb4
00b02e5c	ldr w8,[x19, #0xe8]
00b02e60	tbz w8,#0x1,0x00b02e70
00b02e64	ldrb w9,[x19, #0xec]
00b02e68	mov w0,wzr
00b02e6c	tbz w9,#0x2,0x00b02eb4
00b02e70	tbnz w8,#0x0,0x00b02ea8
00b02e74	mov w9,#0x2040
00b02e78	and w10,w8,w9
00b02e7c	cmp w10,w9
00b02e80	orr w9,wzr,#0x3
00b02e84	cinc w0,w9,ne
00b02e88	b.eq 0x00b02eb4
00b02e8c	tbnz w8,#0x1,0x00b02eb4
00b02e90	tbz w8,#0x3,0x00b02eb0
00b02e94	ldrb w8,[x19, #0xf4]
00b02e98	tst w8,#0x7
00b02e9c	b.eq 0x00b02eb0
00b02ea0	mov w0,#0x5
00b02ea4	b 0x00b02eb4
00b02ea8	ubfx w0,w8,#0x4,#0x1
00b02eac	b 0x00b02eb4
00b02eb0	mov w0,wzr
00b02eb4	ldp x29,x30,[sp, #0x10]
00b02eb8	ldr x19,[sp], #0x20
00b02ebc	ret
