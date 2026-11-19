; FUN_00847c68 @ 00847c68
00847c68	sub sp,sp,#0x80
00847c6c	stp x29,x30,[sp, #0x40]
00847c70	str x23,[sp, #0x50]
00847c74	stp x22,x21,[sp, #0x60]
00847c78	stp x20,x19,[sp, #0x70]
00847c7c	add x29,sp,#0x40
00847c80	mrs x23,tpidr_el0
00847c84	sub x8,x2,x1
00847c88	ldr x9,[x23, #0x28]
00847c8c	subs x8,x8,#0x2
00847c90	stur x9,[x29, #-0x8]
00847c94	b.lt 0x00847ed0
00847c98	mov x20,x3
00847c9c	mov x21,x0
00847ca0	mov x19,x1
00847ca4	mov x9,x1
00847ca8	ldrb w10,[x9], #0x1
00847cac	cmp w10,#0x3d
00847cb0	b.ne 0x00847cc0
00847cb4	ldrb w10,[x9]
00847cb8	cmp w10,#0x5d
00847cbc	b.eq 0x00847cd0
00847cc0	cbz x8,0x00847ed0
00847cc4	sub x8,x8,#0x1
00847cc8	mov x19,x9
00847ccc	b 0x00847ca8
00847cd0	cmp x19,x2
00847cd4	b.eq 0x00847ed0
00847cd8	add x8,sp,#0x18
00847cdc	mov x0,x21
00847ce0	mov x2,x19
00847ce4	mov w3,wzr
00847ce8	add x22,sp,#0x18
00847cec	bl 0x00848aa8
00847cf0	ldrb w8,[sp, #0x18]
00847cf4	ldr x9,[sp, #0x20]
00847cf8	lsr x10,x8,#0x1
00847cfc	tst w8,#0x1
00847d00	csel x9,x10,x9,eq
00847d04	cbz x9,0x00847ee4
00847d08	ldr x10,[sp, #0x28]
00847d0c	tst w8,#0x1
00847d10	csinc x1,x10,x22,ne
00847d14	mov x8,sp
00847d18	add x2,x1,x9
00847d1c	mov x0,x21
00847d20	mov w3,wzr
00847d24	bl 0x00848d68
00847d28	ldrb w8,[sp]
00847d2c	ldr x2,[sp, #0x8]
00847d30	lsr x9,x8,#0x1
00847d34	tst w8,#0x1
00847d38	csel x9,x9,x2,eq
00847d3c	cbz x9,0x00847d64
00847d40	ldp x21,x9,[x20, #0x90]
00847d44	cmp x21,x9
00847d48	b.cs 0x00847da8
00847d4c	tbnz w8,#0x0,0x00847e24
00847d50	ldr x8,[sp, #0x10]
00847d54	ldr q0,[sp]
00847d58	str x8,[x21, #0x10]
00847d5c	str q0,[x21]
00847d60	b 0x00847e30
00847d64	ldrb w8,[sp, #0x18]
00847d68	ldr x9,[sp, #0x20]
00847d6c	lsr x10,x8,#0x1
00847d70	tst w8,#0x1
00847d74	csel x10,x10,x9,eq
00847d78	orr x9,x22,#0x1
00847d7c	cmp x10,#0x2
00847d80	b.eq 0x00847db8
00847d84	cmp x10,#0x1
00847d88	b.ne 0x00847ef8
00847d8c	ldr x10,[sp, #0x28]
00847d90	tst w8,#0x1
00847d94	csel x8,x9,x10,eq
00847d98	ldrb w1,[x8]
00847d9c	mov x0,x20
00847da0	bl 0x0084612c
00847da4	b 0x00847e3c
00847da8	add x0,x20,#0x88
00847dac	mov x1,sp
00847db0	bl 0x00848f3c
00847db4	b 0x00847e38
00847db8	ldr x10,[sp, #0x28]
00847dbc	add x11,sp,#0x18
00847dc0	tst w8,#0x1
00847dc4	orr x8,x11,#0x2
00847dc8	ldrb w11,[x20, #0xa5]
00847dcc	csel x9,x9,x10,eq
00847dd0	csinc x8,x8,x10,eq
00847dd4	ldrb w1,[x9]
00847dd8	ldrb w21,[x8]
00847ddc	cmp w11,#0x1
00847de0	b.ne 0x00847e98
00847de4	ldr x0,[x20, #0x18]
00847de8	ldr x8,[x0]
00847dec	ldr x8,[x8, #0x28]
00847df0	blr x8
00847df4	mov w22,w0
00847df8	ldr x0,[x20, #0x18]
00847dfc	ldr x8,[x0]
00847e00	ldr x8,[x8, #0x28]
00847e04	mov w1,w21
00847e08	blr x8
00847e0c	bfm w22,w0,#0x18,#0x17
00847e10	sturh w22,[x29, #-0xc]
00847e14	add x0,x20,#0x70
00847e18	sub x1,x29,#0xc
00847e1c	bl 0x008497f0
00847e20	b 0x00847e3c
00847e24	ldr x1,[sp, #0x10]
00847e28	mov x0,x21
00847e2c	bl 0x007ff40c
00847e30	add x0,x21,#0x18
00847e34	str x0,[x20, #0x90]
00847e38	str x0,[x20, #0x90]
00847e3c	ldrb w8,[sp]
00847e40	tbz w8,#0x0,0x00847e54
00847e44	ldr x8,[sp]
00847e48	ldr x0,[sp, #0x10]
00847e4c	and x1,x8,#-0x2
00847e50	bl 0x00c2fe80
00847e54	ldrb w8,[sp, #0x18]
00847e58	tbz w8,#0x0,0x00847e6c
00847e5c	ldr x8,[sp, #0x18]
00847e60	ldr x0,[sp, #0x28]
00847e64	and x1,x8,#-0x2
00847e68	bl 0x00c2fe80
00847e6c	ldr x8,[x23, #0x28]
00847e70	ldur x9,[x29, #-0x8]
00847e74	cmp x8,x9
00847e78	b.ne 0x00847f70
00847e7c	add x0,x19,#0x2
00847e80	ldp x20,x19,[sp, #0x70]
00847e84	ldr x23,[sp, #0x50]
00847e88	ldp x22,x21,[sp, #0x60]
00847e8c	ldp x29,x30,[sp, #0x40]
00847e90	add sp,sp,#0x80
00847e94	ret
00847e98	ldrb w9,[x20, #0xa6]
00847e9c	orr w8,w1,w21, LSL #0x8
00847ea0	cmp w9,#0x1
00847ea4	b.ne 0x00847ebc
00847ea8	sturh w8,[x29, #-0xc]
00847eac	add x0,x20,#0x70
00847eb0	sub x1,x29,#0xc
00847eb4	bl 0x008497f0
00847eb8	b 0x00847e3c
00847ebc	sturh w8,[x29, #-0xc]
00847ec0	add x0,x20,#0x70
00847ec4	sub x1,x29,#0xc
00847ec8	bl 0x008497f0
00847ecc	b 0x00847e3c
00847ed0	ldr x8,[x23, #0x28]
00847ed4	ldur x9,[x29, #-0x8]
00847ed8	cmp x8,x9
00847edc	b.ne 0x00847f70
00847ee0	bl 0x00847644
00847ee4	ldr x8,[x23, #0x28]
00847ee8	ldur x9,[x29, #-0x8]
00847eec	cmp x8,x9
00847ef0	b.ne 0x00847f70
00847ef4	bl 0x00848a5c
00847ef8	ldr x8,[x23, #0x28]
00847efc	ldur x9,[x29, #-0x8]
00847f00	cmp x8,x9
00847f04	b.ne 0x00847f70
00847f08	bl 0x00848a5c
00847f0c	mov x19,x0
00847f10	str x21,[x20, #0x90]
00847f14	b 0x00847f28
00847f28	ldrb w8,[sp]
00847f2c	tbz w8,#0x0,0x00847f40
00847f30	ldr x8,[sp]
00847f34	ldr x0,[sp, #0x10]
00847f38	and x1,x8,#-0x2
00847f3c	bl 0x00c2fe80
00847f40	ldrb w8,[sp, #0x18]
00847f44	tbz w8,#0x0,0x00847f58
00847f48	ldr x8,[sp, #0x18]
00847f4c	ldr x0,[sp, #0x28]
00847f50	and x1,x8,#-0x2
00847f54	bl 0x00c2fe80
00847f58	ldr x8,[x23, #0x28]
00847f5c	ldur x9,[x29, #-0x8]
00847f60	cmp x8,x9
00847f64	b.ne 0x00847f70
00847f68	mov x0,x19
00847f6c	bl 0x00c2c090
00847f70	bl 0x00c2fec0
