; mbedtls_mpi_core_random @ 00b8498c
00b8498c	sub sp,sp,#0x120
00b84990	stp x28,x27,[sp, #0xc0]
00b84994	stp x26,x25,[sp, #0xd0]
00b84998	stp x24,x23,[sp, #0xe0]
00b8499c	stp x22,x21,[sp, #0xf0]
00b849a0	stp x20,x19,[sp, #0x100]
00b849a4	stp x29,x30,[sp, #0x110]
00b849a8	add x29,sp,#0x110
00b849ac	mov x8,xzr
00b849b0	mov x10,#-0x1
00b849b4	stp x4,x5,[x29, #-0x70]
00b849b8	str x1,[sp, #0x70]
00b849bc	sxtw x9,w3
00b849c0	lsl x8,x9,#0x6
00b849c4	mov x21,x3
00b849c8	mov x22,x2
00b849cc	mov x24,x0
00b849d0	add x8,x8,#0x40
00b849d4	subs x10,x9,#0x1
00b849d8	b.lt 0x00b849fc
00b849dc	add x9,x22,x9, LSL #0x3
00b849e0	ldur x11,[x9, #-0x8]
00b849e4	sub x8,x8,#0x40
00b849e8	mov x9,x10
00b849ec	cbz x11,0x00b849d4
00b849f0	clz x9,x11
00b849f4	sub x8,x8,x9
00b849f8	b 0x00b84a00
00b849fc	mov x8,xzr
00b84a00	add x9,x8,#0x7
00b84a04	sub x13,x21,#0x1
00b84a08	and x14,x9,#-0x8
00b84a0c	mov w10,#0xfa
00b84a10	orr w11,wzr,#0x1e
00b84a14	and x16,x21,#-0x4
00b84a18	stur x13,[x29, #-0x60]
00b84a1c	add x13,x24,#0x8
00b84a20	cmp x9,#0x27
00b84a24	sub x8,x14,x8
00b84a28	lsl x15,x21,#0x3
00b84a2c	stp x16,x13,[sp, #0x20]
00b84a30	lsr x13,x9,#0x6
00b84a34	csel w20,w11,w10,hi
00b84a38	tst x9,#0x38
00b84a3c	lsr x10,x8,#0x6
00b84a40	str x15,[sp, #0x38]
00b84a44	add x15,x24,x15
00b84a48	cinc x19,x13,ne
00b84a4c	cmp x10,x21
00b84a50	lsr x18,x9,#0x3
00b84a54	sub x16,x21,x16
00b84a58	sub x9,x15,#0x10
00b84a5c	sub x23,x21,x10
00b84a60	str x10,[sp, #0x48]
00b84a64	lsl x26,x10,#0x3
00b84a68	cset w10,hi
00b84a6c	cset w11,eq
00b84a70	tst x8,#0x3f
00b84a74	stp x16,x9,[sp]
00b84a78	cset w14,eq
00b84a7c	cset w16,ne
00b84a80	cmp x21,#0x0
00b84a84	and x25,x8,#0x3f
00b84a88	add x8,x24,x23, LSL #0x3
00b84a8c	add x13,x24,x26
00b84a90	cset w17,eq
00b84a94	cmp x15,x24
00b84a98	cset w15,hi
00b84a9c	cmp x13,x8
00b84aa0	sub x8,x21,x19
00b84aa4	lsl x8,x8,#0x3
00b84aa8	str x8,[sp, #0x88]
00b84aac	and w8,w11,w16
00b84ab0	mov w12,#0x40
00b84ab4	lsl x9,x19,#0x3
00b84ab8	orr w8,w10,w8
00b84abc	sub x27,x12,x25
00b84ac0	sub x12,x9,x18
00b84ac4	add x28,x24,x9
00b84ac8	and x9,x23,#-0x4
00b84acc	str w8,[sp, #0x7c]
00b84ad0	cset w8,cc
00b84ad4	dup v0.2D,x25
00b84ad8	str x9,[sp, #0x10]
00b84adc	orr w9,w17,w14
00b84ae0	and w8,w15,w8
00b84ae4	dup v6.2D,x27
00b84ae8	str w9,[sp, #0x34]
00b84aec	add x9,x24,x12
00b84af0	str w8,[sp, #0x1c]
00b84af4	sub x8,x28,#0x10
00b84af8	neg v7.2D,v0.2D
00b84afc	stur x18,[x29, #-0x78]
00b84b00	stur x12,[x29, #-0x80]
00b84b04	str x9,[sp, #0x80]
00b84b08	str x8,[sp, #0x40]
00b84b0c	stp q7,q6,[sp, #0x50]
00b84b10	b 0x00b84b24
00b84b14	mov x8,xzr
00b84b18	cmp x8,x21
00b84b1c	b.cc 0x00b84c3c
00b84b20	b 0x00b84c54
00b84b24	cmp x19,x21
00b84b28	b.hi 0x00b84dec
00b84b2c	ldur x2,[x29, #-0x80]
00b84b30	mov x0,x24
00b84b34	mov w1,wzr
00b84b38	bl 0x00c301c0
00b84b3c	ldr x2,[sp, #0x88]
00b84b40	mov x0,x28
00b84b44	mov w1,wzr
00b84b48	bl 0x00c301c0
00b84b4c	ldp x8,x0,[x29, #-0x70]
00b84b50	ldr x1,[sp, #0x80]
00b84b54	ldur x2,[x29, #-0x78]
00b84b58	blr x8
00b84b5c	cbnz w0,0x00b84df8
00b84b60	cbz x19,0x00b84b94
00b84b64	ldr x8,[sp, #0x40]
00b84b68	mov x9,x24
00b84b6c	ldr x11,[x8, #0x8]
00b84b70	ldr x10,[x9]
00b84b74	rev x11,x11
00b84b78	rev x10,x10
00b84b7c	str x11,[x9], #0x8
00b84b80	sub x11,x8,#0x8
00b84b84	cmp x9,x8
00b84b88	str x10,[x8, #0x8]
00b84b8c	mov x8,x11
00b84b90	b.ls 0x00b84b6c
00b84b94	ldr w8,[sp, #0x7c]
00b84b98	cbz w8,0x00b84bb8
00b84b9c	ldr x2,[sp, #0x38]
00b84ba0	mov x0,x24
00b84ba4	mov w1,wzr
00b84ba8	bl 0x00c301c0
00b84bac	subs w20,w20,#0x1
00b84bb0	b.ne 0x00b84d08
00b84bb4	b 0x00b84df4
00b84bb8	ldr x8,[sp, #0x48]
00b84bbc	ldp q7,q6,[sp, #0x50]
00b84bc0	cbz x8,0x00b84c54
00b84bc4	cbz x23,0x00b84b14
00b84bc8	ldr w9,[sp, #0x1c]
00b84bcc	cmp x23,#0x4
00b84bd0	cset w8,cc
00b84bd4	mov x10,xzr
00b84bd8	orr w8,w8,w9
00b84bdc	tbnz w8,#0x0,0x00b84c0c
00b84be0	ldr x8,[sp, #0x10]
00b84be4	mov x9,x24
00b84be8	add x10,x9,x26
00b84bec	ldp q0,q1,[x10]
00b84bf0	subs x8,x8,#0x4
00b84bf4	stp q0,q1,[x9], #0x20
00b84bf8	b.ne 0x00b84be8
00b84bfc	ldr x10,[sp, #0x10]
00b84c00	mov x8,x23
00b84c04	cmp x23,x10
00b84c08	b.eq 0x00b84c34
00b84c0c	ldr x8,[sp, #0x48]
00b84c10	add x9,x8,x10
00b84c14	sub x8,x23,x10
00b84c18	add x9,x24,x9, LSL #0x3
00b84c1c	add x10,x24,x10, LSL #0x3
00b84c20	ldr x11,[x9], #0x8
00b84c24	subs x8,x8,#0x1
00b84c28	str x11,[x10], #0x8
00b84c2c	b.ne 0x00b84c20
00b84c30	mov x8,x23
00b84c34	cmp x8,x21
00b84c38	b.cs 0x00b84c54
00b84c3c	add x0,x24,x8, LSL #0x3
00b84c40	sub x8,x21,x8
00b84c44	lsl x2,x8,#0x3
00b84c48	mov w1,wzr
00b84c4c	bl 0x00c301c0
00b84c50	ldp q7,q6,[sp, #0x50]
00b84c54	ldr w8,[sp, #0x34]
00b84c58	tbnz w8,#0x0,0x00b84d00
00b84c5c	mov x8,xzr
00b84c60	cmp x21,#0x4
00b84c64	mov x9,x21
00b84c68	b.cc 0x00b84cd4
00b84c6c	ldr x8,[sp, #0x20]
00b84c70	ldr x9,[sp, #0x8]
00b84c74	movi v0.2D,#0x0
00b84c78	ldp q2,q1,[x9, #-0x10]
00b84c7c	subs x8,x8,#0x4
00b84c80	ext v1.16B,v1.16B,v1.16B,0x8
00b84c84	ext v2.16B,v2.16B,v2.16B,0x8
00b84c88	ushl v3.2D,v1.2D,v6.2D
00b84c8c	ushl v1.2D,v1.2D,v7.2D
00b84c90	ext v5.16B,v0.16B,v3.16B,0x8
00b84c94	ushl v0.2D,v2.2D,v6.2D
00b84c98	ushl v4.2D,v2.2D,v7.2D
00b84c9c	ext v2.16B,v3.16B,v0.16B,0x8
00b84ca0	orr v1.16B,v1.16B,v5.16B
00b84ca4	orr v2.16B,v4.16B,v2.16B
00b84ca8	ext v1.16B,v1.16B,v1.16B,0x8
00b84cac	str q1,[x9]
00b84cb0	ext v1.16B,v2.16B,v2.16B,0x8
00b84cb4	stur q1,[x9, #-0x10]
00b84cb8	sub x9,x9,#0x20
00b84cbc	b.ne 0x00b84c78
00b84cc0	ldr x8,[sp, #0x20]
00b84cc4	cmp x8,x21
00b84cc8	b.eq 0x00b84d00
00b84ccc	ldr x9,[sp]
00b84cd0	mov x8,v0.D[0x1]
00b84cd4	sub x9,x9,#0x1
00b84cd8	lsl x10,x9,#0x3
00b84cdc	ldr x11,[x24, x10#0x0]
00b84ce0	sub x9,x9,#0x1
00b84ce4	cmn x9,#0x1
00b84ce8	lsr x12,x11,x25
00b84cec	orr x8,x12,x8
00b84cf0	lsl x11,x11,x27
00b84cf4	str x8,[x24, x10#0x0]
00b84cf8	mov x8,x11
00b84cfc	b.ne 0x00b84cd8
00b84d00	subs w20,w20,#0x1
00b84d04	b.eq 0x00b84df4
00b84d08	ldr x8,[x24]
00b84d0c	ldr x11,[sp, #0x70]
00b84d10	mov x9,xzr
00b84d14	cmp x21,#0x2
00b84d18	eor x10,x11,x8
00b84d1c	sub x8,x8,x11
00b84d20	bic x8,x8,x10
00b84d24	and x10,x10,x11
00b84d28	orr x10,x8,x10
00b84d2c	asr x8,x10,#0x3f
00b84d30	mvn x11,x8
00b84d34	b.cc 0x00b84d5c
00b84d38	ldr x8,[sp, #0x28]
00b84d3c	ldur x10,[x29, #-0x60]
00b84d40	ldr x12,[x8], #0x8
00b84d44	subs x10,x10,#0x1
00b84d48	neg x13,x12
00b84d4c	orr x12,x13,x12
00b84d50	asr x12,x12,#0x3f
00b84d54	orr x9,x12,x9
00b84d58	b.ne 0x00b84d40
00b84d5c	mov x8,xzr
00b84d60	mov x12,xzr
00b84d64	mov x10,xzr
00b84d68	orr x9,x9,x11
00b84d6c	cbz x21,0x00b84dd4
00b84d70	ldur x11,[x29, #-0x60]
00b84d74	lsl x12,x11,#0x3
00b84d78	ldr x13,[x22, x12#0x0]
00b84d7c	ldr x14,[x24, x12#0x0]
00b84d80	sub x11,x11,#0x1
00b84d84	cmn x11,#0x1
00b84d88	eor x15,x14,x13
00b84d8c	sub x13,x13,x14
00b84d90	bic x13,x13,x15
00b84d94	and x15,x15,x14
00b84d98	orr x15,x13,x15
00b84d9c	asr x13,x15,#0x3f
00b84da0	ldr x14,[x24, x12#0x0]
00b84da4	ldr x12,[x22, x12#0x0]
00b84da8	orr x10,x13,x10
00b84dac	eor x13,x12,x14
00b84db0	sub x14,x14,x12
00b84db4	bic x14,x14,x13
00b84db8	and x13,x13,x12
00b84dbc	orr x13,x14,x13
00b84dc0	asr x14,x13,#0x3f
00b84dc4	bic x12,x14,x10
00b84dc8	orr x8,x12,x8
00b84dcc	orr x10,x14,x10
00b84dd0	b.ne 0x00b84d74
00b84dd4	mov x10,xzr
00b84dd8	and x8,x8,x9
00b84ddc	cmp x8,x10
00b84de0	b.eq 0x00b84b24
00b84de4	mov w0,wzr
00b84de8	b 0x00b84df8
00b84dec	orr w0,wzr,#0xfffffffc
00b84df0	b 0x00b84df8
00b84df4	mov w0,#0xfffffff2
00b84df8	ldp x29,x30,[sp, #0x110]
00b84dfc	ldp x20,x19,[sp, #0x100]
00b84e00	ldp x22,x21,[sp, #0xf0]
00b84e04	ldp x24,x23,[sp, #0xe0]
00b84e08	ldp x26,x25,[sp, #0xd0]
00b84e0c	ldp x28,x27,[sp, #0xc0]
00b84e10	add sp,sp,#0x120
00b84e14	ret
