; evp_names_do_all @ 00a5df28
00a5df28	str x21,[sp, #-0x30]!
00a5df2c	stp x20,x19,[sp, #0x10]
00a5df30	stp x29,x30,[sp, #0x20]
00a5df34	add x29,sp,#0x20
00a5df38	mov x19,x3
00a5df3c	mov x20,x2
00a5df40	mov w21,w1
00a5df44	bl 0x00c3b2f0
00a5df48	bl 0x00c3b650
00a5df4c	mov x2,x20
00a5df50	mov x3,x19
00a5df54	ldp x29,x30,[sp, #0x20]
00a5df58	ldp x20,x19,[sp, #0x10]
00a5df5c	mov w1,w21
00a5df60	ldr x21,[sp], #0x30
00a5df64	b 0x00c3b610
