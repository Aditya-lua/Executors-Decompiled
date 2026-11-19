; FUN_00c04c58 @ 00c04c58
00c04c58	paciasp
00c04c5c	sub sp,sp,#0x100
00c04c60	stp x29,x30,[sp, #0xa0]
00c04c64	stp x28,x27,[sp, #0xb0]
00c04c68	stp x26,x25,[sp, #0xc0]
00c04c6c	stp x24,x23,[sp, #0xd0]
00c04c70	stp x22,x21,[sp, #0xe0]
00c04c74	stp x20,x19,[sp, #0xf0]
00c04c78	add x29,sp,#0xa0
00c04c7c	sub x8,x3,x2
00c04c80	orr x9,xzr,#-0x5555555555555556
00c04c84	mov x20,x5
00c04c88	asr x8,x8,#0x3
00c04c8c	movk x9,#0xaaab
00c04c90	mov x25,x4
00c04c94	mov x22,x3
00c04c98	mov x19,x2
00c04c9c	mov x23,x0
00c04ca0	mul x26,x8,x9
00c04ca4	str x1,[sp, #0x30]
00c04ca8	str w6,[sp, #0x38]
00c04cac	cmp x26,#0x65
00c04cb0	b.cc 0x00c04ccc
00c04cb4	mov x0,x26
00c04cb8	bl 0x00c308d0
00c04cbc	ldr w6,[sp, #0x38]
00c04cc0	mov x28,x0
00c04cc4	cbnz x0,0x00c04cd4
00c04cc8	bl 0x00c43cc0
00c04ccc	mov x0,xzr
00c04cd0	add x28,sp,#0x3c
00c04cd4	cmp x19,x22
00c04cd8	stp x20,x0,[sp, #0x8]
00c04cdc	b.eq 0x00c04e9c
00c04ce0	mov x21,xzr
00c04ce4	mov w8,#0x1
00c04ce8	mov x9,x19
00c04cec	mov x10,x28
00c04cf0	ldrb w11,[x9]
00c04cf4	ldr x12,[x9, #0x8]
00c04cf8	add x9,x9,#0x18
00c04cfc	lsr x13,x11,#0x1
00c04d00	tst w11,#0x1
00c04d04	csel x11,x13,x12,eq
00c04d08	cmp x11,#0x0
00c04d0c	cset w11,eq
00c04d10	cinc w12,w8,eq
00c04d14	cinc x21,x21,eq
00c04d18	cmp x9,x22
00c04d1c	sub x26,x26,x11
00c04d20	strb w12,[x10], #0x1
00c04d24	b.ne 0x00c04cf0
00c04d28	ldr x8,[x23]
00c04d2c	ldr x9,[sp, #0x30]
00c04d30	cmp x8,x9
00c04d34	b.eq 0x00c04ea0
00c04d38	cbz x26,0x00c04ea0
00c04d3c	mov x20,xzr
00c04d40	stp x23,x28,[sp, #0x18]
00c04d44	str x19,[sp, #0x28]
00c04d48	ldrb w1,[x8]
00c04d4c	tbnz w6,#0x0,0x00c04d68
00c04d50	ldr x8,[x25]
00c04d54	ldr x8,[x8, #0x18]
00c04d58	mov x0,x25
00c04d5c	blr x8
00c04d60	mov w1,w0
00c04d64	ldr w6,[sp, #0x38]
00c04d68	mov w24,wzr
00c04d6c	add x27,x20,#0x1
00c04d70	and w23,w1,#0xff
00c04d74	b 0x00c04d90
00c04d78	sub x26,x26,#0x1
00c04d7c	strb wzr,[x28]
00c04d80	add x19,x19,#0x18
00c04d84	add x28,x28,#0x1
00c04d88	cmp x19,x22
00c04d8c	b.eq 0x00c04e08
00c04d90	ldrb w8,[x28]
00c04d94	cmp w8,#0x1
00c04d98	b.ne 0x00c04d80
00c04d9c	ldrb w8,[x19]
00c04da0	ldr x9,[x19, #0x10]
00c04da4	tst w8,#0x1
00c04da8	csinc x8,x9,x19,ne
00c04dac	ldrb w1,[x8, x20]
00c04db0	tbnz w6,#0x0,0x00c04dcc
00c04db4	ldr x8,[x25]
00c04db8	ldr x8,[x8, #0x18]
00c04dbc	mov x0,x25
00c04dc0	blr x8
00c04dc4	mov w1,w0
00c04dc8	ldr w6,[sp, #0x38]
00c04dcc	cmp w23,w1, UXTB 
00c04dd0	b.ne 0x00c04d78
00c04dd4	ldrb w8,[x19]
00c04dd8	ldr x9,[x19, #0x8]
00c04ddc	lsr x10,x8,#0x1
00c04de0	tst w8,#0x1
00c04de4	csel x8,x10,x9,eq
00c04de8	cmp x8,x27
00c04dec	b.ne 0x00c04e00
00c04df0	mov w8,#0x2
00c04df4	sub x26,x26,#0x1
00c04df8	add x21,x21,#0x1
00c04dfc	strb w8,[x28]
00c04e00	mov w24,#0x1
00c04e04	b 0x00c04d80
00c04e08	ldr x10,[sp, #0x18]
00c04e0c	ldr x8,[x10]
00c04e10	tbz w24,#0x0,0x00c04e80
00c04e14	ldp x28,x19,[sp, #0x20]
00c04e18	add x9,x21,x26
00c04e1c	add x8,x8,#0x1
00c04e20	cmp x9,#0x2
00c04e24	str x8,[x10]
00c04e28	b.cc 0x00c04e84
00c04e2c	add x9,x20,#0x1
00c04e30	mov x10,x19
00c04e34	mov x11,x28
00c04e38	b 0x00c04e4c
00c04e3c	add x10,x10,#0x18
00c04e40	add x11,x11,#0x1
00c04e44	cmp x10,x22
00c04e48	b.eq 0x00c04e84
00c04e4c	ldrb w12,[x11]
00c04e50	cmp w12,#0x2
00c04e54	b.ne 0x00c04e3c
00c04e58	ldrb w12,[x10]
00c04e5c	ldr x13,[x10, #0x8]
00c04e60	lsr x14,x12,#0x1
00c04e64	tst w12,#0x1
00c04e68	csel x12,x14,x13,eq
00c04e6c	cmp x12,x9
00c04e70	b.eq 0x00c04e3c
00c04e74	sub x21,x21,#0x1
00c04e78	strb wzr,[x11]
00c04e7c	b 0x00c04e3c
00c04e80	ldp x28,x19,[sp, #0x20]
00c04e84	ldr x9,[sp, #0x30]
00c04e88	cmp x8,x9
00c04e8c	b.eq 0x00c04ea0
00c04e90	add x20,x20,#0x1
00c04e94	cbnz x26,0x00c04d48
00c04e98	b 0x00c04ea0
00c04e9c	ldr x8,[x23]
00c04ea0	ldr x9,[sp, #0x30]
00c04ea4	cmp x8,x9
00c04ea8	ldr x9,[sp, #0x8]
00c04eac	b.ne 0x00c04ebc
00c04eb0	ldr w8,[x9]
00c04eb4	orr w8,w8,#0x2
00c04eb8	str w8,[x9]
00c04ebc	ldr x0,[sp, #0x10]
00c04ec0	cmp x19,x22
00c04ec4	b.eq 0x00c04ee4
00c04ec8	ldrb w8,[x28]
00c04ecc	cmp w8,#0x2
00c04ed0	b.eq 0x00c04ef0
00c04ed4	add x19,x19,#0x18
00c04ed8	add x28,x28,#0x1
00c04edc	cmp x19,x22
00c04ee0	b.ne 0x00c04ec8
00c04ee4	ldr w8,[x9]
00c04ee8	orr w8,w8,#0x4
00c04eec	str w8,[x9]
00c04ef0	cbz x0,0x00c04ef8
00c04ef4	bl 0x00c30960
00c04ef8	mov x0,x19
00c04efc	ldp x20,x19,[sp, #0xf0]
00c04f00	ldp x22,x21,[sp, #0xe0]
00c04f04	ldp x24,x23,[sp, #0xd0]
00c04f08	ldp x26,x25,[sp, #0xc0]
00c04f0c	ldp x28,x27,[sp, #0xb0]
00c04f10	ldp x29,x30,[sp, #0xa0]
00c04f14	add sp,sp,#0x100
00c04f18	autiasp
00c04f1c	ret
