; IDEA_ecb_encrypt @ 00a96dbc
00a96dbc	sub sp,sp,#0x30
00a96dc0	stp x29,x30,[sp, #0x20]
00a96dc4	ldrb w8,[x0]
00a96dc8	ldrb w9,[x0, #0x1]
00a96dcc	ldrb w10,[x0, #0x2]
00a96dd0	ldrb w11,[x0, #0x3]
00a96dd4	lsl x8,x8,#0x18
00a96dd8	bfm x8,x9,#0x30,#0x7
00a96ddc	bfm x8,x10,#0x38,#0x7
00a96de0	orr x8,x8,x11
00a96de4	str x8,[sp]
00a96de8	ldrb w8,[x0, #0x4]
00a96dec	ldrb w9,[x0, #0x5]
00a96df0	ldrb w10,[x0, #0x6]
00a96df4	ldrb w11,[x0, #0x7]
00a96df8	lsl x8,x8,#0x18
00a96dfc	bfm x8,x9,#0x30,#0x7
00a96e00	bfm x8,x10,#0x38,#0x7
00a96e04	str x19,[sp, #0x10]
00a96e08	mov x19,x1
00a96e0c	orr x8,x8,x11
00a96e10	mov x0,sp
00a96e14	mov x1,x2
00a96e18	add x29,sp,#0x20
00a96e1c	str x8,[sp, #0x8]
00a96e20	bl 0x00c3ddb0
00a96e24	ldr x8,[sp]
00a96e28	lsr x9,x8,#0x18
00a96e2c	strb w9,[x19]
00a96e30	lsr x9,x8,#0x10
00a96e34	strb w8,[x19, #0x3]
00a96e38	lsr x8,x8,#0x8
00a96e3c	strb w9,[x19, #0x1]
00a96e40	strb w8,[x19, #0x2]
00a96e44	ldr x8,[sp, #0x8]
00a96e48	lsr x9,x8,#0x18
00a96e4c	strb w9,[x19, #0x4]
00a96e50	lsr x9,x8,#0x10
00a96e54	strb w9,[x19, #0x5]
00a96e58	lsr x9,x8,#0x8
00a96e5c	strb w9,[x19, #0x6]
00a96e60	strb w8,[x19, #0x7]
00a96e64	ldp x29,x30,[sp, #0x20]
00a96e68	ldr x19,[sp, #0x10]
00a96e6c	add sp,sp,#0x30
00a96e70	ret
