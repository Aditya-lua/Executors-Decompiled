; DES_options @ 00a14dfc
00a14dfc	str x19,[sp, #-0x20]!
00a14e00	adrp x19,0xd21000
00a14e04	ldrb w8,[x19, #0x978]
00a14e08	stp x29,x30,[sp, #0x10]
00a14e0c	add x29,sp,#0x10
00a14e10	tbnz w8,#0x0,0x00a14e34
00a14e14	adrp x0,0xd21000
00a14e18	adrp x1,0x2d1000
00a14e1c	add x0,x0,#0x979
00a14e20	add x1,x1,#0x77b
00a14e24	orr w2,wzr,#0xc
00a14e28	bl 0x00c387f0
00a14e2c	mov w8,#0x1
00a14e30	strb w8,[x19, #0x978]
00a14e34	ldp x29,x30,[sp, #0x10]
00a14e38	adrp x0,0xd21000
00a14e3c	add x0,x0,#0x979
00a14e40	ldr x19,[sp], #0x20
00a14e44	ret
