; FUN_00891ba0 @ 00891ba0
00891ba0	stp x29,x30,[sp, #-0x30]!
00891ba4	str x21,[sp, #0x10]
00891ba8	stp x20,x19,[sp, #0x20]
00891bac	mov x29,sp
00891bb0	ldr x9,[x0, #0x170]
00891bb4	mov x19,x2
00891bb8	mov x21,x0
00891bbc	mov x20,x8
00891bc0	cbz x9,0x00891cec
00891bc4	lsl w8,w19,#0x3
00891bc8	mov x10,#0x2d69
00891bcc	lsr x9,x19,#0x20
00891bd0	movk x10,#0xeb38, LSL #16
00891bd4	add x8,x8,#0x8
00891bd8	movk x10,#0xea08, LSL #32
00891bdc	eor x8,x8,x9
00891be0	movk x10,#0x9ddf, LSL #48
00891be4	mul x8,x8,x10
00891be8	eor x9,x9,x8, LSR #0x2f
00891bec	eor x8,x9,x8
00891bf0	mov x9,#0x959d
00891bf4	mul x8,x8,x10
00891bf8	movk x9,#0xb8f4, LSL #16
00891bfc	movk x9,#0xd34f, LSL #32
00891c00	movk x9,#0x949d, LSL #48
00891c04	eor x8,x8,x8, LSR #0x2f
00891c08	mul x8,x8,x9
00891c0c	ldrb w9,[x21, #0x178]
00891c10	lsr x9,x8,x9
00891c14	ldr x8,[x21, #0x160]
00891c18	lsr x10,x9,#0x6
00891c1c	ldr x10,[x8, x10, LSL #0x3]
00891c20	lsr x10,x10,x9
00891c24	tbz w10,#0x0,0x00891cec
00891c28	ldr x10,[x21, #0x168]
00891c2c	ldr x11,[x21, #0x148]
00891c30	mov w13,#0x30
00891c34	sub x12,x10,#0x1
00891c38	madd x10,x9,x13,x11
00891c3c	ldr x14,[x10]
00891c40	cmp x14,x19
00891c44	b.eq 0x00891c64
00891c48	add x9,x9,#0x1
00891c4c	and x9,x9,x12
00891c50	lsr x10,x9,#0x6
00891c54	ldr x10,[x8, x10, LSL #0x3]
00891c58	lsr x10,x10,x9
00891c5c	tbnz w10,#0x0,0x00891c38
00891c60	b 0x00891cec
00891c64	ldr w8,[x10, #0x8]
00891c68	fmov d1,0x3ff0000000000000
00891c6c	ldr d0,[x10, #0x10]
00891c70	mov x9,#0x4070000000000000
00891c74	cmp w8,#0x3
00891c78	fccmp d0,d1,#0x8,eq
00891c7c	fmov d1,x9
00891c80	fccmp d0,d1,#0x2,ge
00891c84	b.ls 0x00891cb4
00891c88	cmp w8,#0x6
00891c8c	b.ne 0x00891cec
00891c90	mov w8,#0x3
00891c94	stur xzr,[x20, #0x4]
00891c98	str w8,[x20]
00891c9c	ldr w8,[x10, #0xc]
00891ca0	str wzr,[x20, #0xc]
00891ca4	strb w1,[x20, #0x4]
00891ca8	str d0,[x20, #0x10]
00891cac	str x8,[x20, #0x18]
00891cb0	b 0x00891d50
00891cb4	fcvtzs w8,d0
00891cb8	scvtf d1,w8
00891cbc	fcmp d0,d1
00891cc0	b.ne 0x00891cec
00891cc4	mov w9,#0x4
00891cc8	sub w8,w8,#0x1
00891ccc	stur xzr,[x20, #0x4]
00891cd0	str w9,[x20]
00891cd4	stur xzr,[x20, #0x14]
00891cd8	stur xzr,[x20, #0xc]
00891cdc	str wzr,[x20, #0x1c]
00891ce0	strb w1,[x20, #0x4]
00891ce4	strb w8,[x20, #0x7]
00891ce8	b 0x00891d50
00891cec	mov w8,#0x5
00891cf0	stur xzr,[x20, #0x4]
00891cf4	mov x0,x21
00891cf8	strb w1,[x20, #0x4]
00891cfc	mov x1,x19
00891d00	str w8,[x20]
00891d04	stur xzr,[x20, #0x14]
00891d08	stur xzr,[x20, #0xc]
00891d0c	str wzr,[x20, #0x1c]
00891d10	bl 0x0088df20
00891d14	tbz w0,#0x1f,0x00891d4c
00891d18	ldr w2,[x21, #0x64c]
00891d1c	add w8,w2,#0x1
00891d20	cmp w8,#0x100
00891d24	b.cs 0x00891d68
00891d28	ldr w9,[x21, #0x650]
00891d2c	str w8,[x21, #0x64c]
00891d30	mov x0,x21
00891d34	mov x1,x19
00891d38	mov w3,#0xff
00891d3c	cmp w9,w8
00891d40	csel w8,w9,w8,hi
00891d44	str w8,[x21, #0x650]
00891d48	bl 0x00891438
00891d4c	strb w0,[x20, #0x6]
00891d50	ldur q0,[x19, #0xc]
00891d54	str q0,[x20, #0x20]
00891d58	ldp x20,x19,[sp, #0x20]
00891d5c	ldr x21,[sp, #0x10]
00891d60	ldp x29,x30,[sp], #0x30
00891d64	ret
00891d68	adrp x1,0x2d0000
00891d6c	add x1,x1,#0xc00
00891d70	add x0,x19,#0xc
00891d74	mov w2,#0x1
00891d78	mov w3,#0xff
00891d7c	bl 0x0087fcd8
