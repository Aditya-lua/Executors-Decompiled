; ix::DNSLookup::resolveCancellable @ 009869b8
009869b8	sub sp,sp,#0xc0
009869bc	stp x28,x27,[sp, #0x60]
009869c0	stp x26,x25,[sp, #0x70]
009869c4	stp x24,x23,[sp, #0x80]
009869c8	stp x22,x21,[sp, #0x90]
009869cc	stp x20,x19,[sp, #0xa0]
009869d0	stp x29,x30,[sp, #0xb0]
009869d4	add x29,sp,#0xb0
009869d8	mrs x28,tpidr_el0
009869dc	mov x20,x8
009869e0	ldr x8,[x28, #0x28]
009869e4	mov x23,x1
009869e8	adrp x1,0x2cb000
009869ec	mov x24,x2
009869f0	mov x22,x0
009869f4	add x1,x1,#0x28f
009869f8	mov w2,#0x8
009869fc	mov x0,x23
00986a00	str x8,[sp, #0x58]
00986a04	bl 0x00c31090
00986a08	add x8,x22,#0xb0
00986a0c	ldarb w8,[x8]
00986a10	tbnz w8,#0x0,0x00986a74
00986a14	ldr x0,[x22, #0x8]
00986a18	cbz x0,0x00986d5c
00986a1c	ldr x19,[x22]
00986a20	bl 0x00c2fef0
00986a24	cbz x0,0x00986d5c
00986a28	add x8,x0,#0x10
00986a2c	stp x19,x0,[sp, #0x48]
00986a30	ldxr x9,[x8]
00986a34	add x9,x9,#0x1
00986a38	stxr w10,x9,[x8]
00986a3c	cbnz w10,0x00986a30
00986a40	ldr w8,[x22, #0x28]
00986a44	stp xzr,xzr,[sp, #0x28]
00986a48	str xzr,[sp, #0x20]
00986a4c	str w8,[sp, #0x44]
00986a50	mov x8,x22
00986a54	ldrb w9,[x8, #0x10]!
00986a58	str x0,[sp]
00986a5c	tbnz w9,#0x0,0x00986a7c
00986a60	ldr x9,[x8, #0x10]
00986a64	str x9,[sp, #0x30]
00986a68	ldr q0,[x8]
00986a6c	str q0,[sp, #0x20]
00986a70	b 0x00986ae0
00986a74	stp xzr,xzr,[x20]
00986a78	b 0x00986ccc
00986a7c	ldr x21,[x22, #0x18]
00986a80	cmn x21,#0x10
00986a84	b.cs 0x00986d8c
00986a88	ldr x25,[x22, #0x20]
00986a8c	cmp x21,#0x17
00986a90	b.cs 0x00986aac
00986a94	add x9,sp,#0x20
00986a98	lsl w8,w21,#0x1
00986a9c	orr x26,x9,#0x1
00986aa0	strb w8,[sp, #0x20]
00986aa4	cbnz x21,0x00986acc
00986aa8	b 0x00986adc
00986aac	add x8,x21,#0x10
00986ab0	and x27,x8,#-0x10
00986ab4	mov x0,x27
00986ab8	bl 0x00c2fed0
00986abc	orr x8,x27,#0x1
00986ac0	mov x26,x0
00986ac4	stp x21,x0,[sp, #0x28]
00986ac8	str x8,[sp, #0x20]
00986acc	mov x0,x26
00986ad0	mov x1,x25
00986ad4	mov x2,x21
00986ad8	bl 0x00c2ffd0
00986adc	strb wzr,[x26, x21]
00986ae0	adrp x8,0xcb4000
00986ae4	ldr x8,[x8, #0xeb8]
00986ae8	movi v0.2D,#0x0
00986aec	str x22,[sp, #0x8]
00986af0	mov v0.D[0x0],x8
00986af4	str q0,[sp, #0x10]
00986af8	mov w0,#0x20
00986afc	bl 0x00c2fed0
00986b00	str xzr,[x0, #0x10]
00986b04	adrp x8,0xcb4000
00986b08	ldr x8,[x8, #0xed0]
00986b0c	mov x26,x0
00986b10	mov x21,x0
00986b14	str xzr,[x26, #0x8]!
00986b18	add x8,x8,#0x10
00986b1c	add x25,x0,#0x18
00986b20	str x8,[x0]
00986b24	add x1,sp,#0x10
00986b28	add x2,sp,#0x8
00986b2c	add x3,sp,#0x48
00986b30	add x4,sp,#0x20
00986b34	add x5,sp,#0x44
00986b38	mov x0,x25
00986b3c	bl 0x00987494
00986b40	mov x0,x25
00986b44	bl 0x00c2ff70
00986b48	mov x27,#0x5af7
00986b4c	mov w25,#0x4240
00986b50	movk x27,#0x7bd0, LSL #16
00986b54	movk w25,#0xf, LSL #16
00986b58	movk x27,#0x863, LSL #32
00986b5c	orr x19,xzr,#0x7fffffffffffffff
00986b60	add x8,x22,#0xb0
00986b64	ldarb w8,[x8]
00986b68	tbnz w8,#0x0,0x00986bc0
00986b6c	ldr x8,[x22, #0x30]
00986b70	cmp x8,#0x1
00986b74	b.lt 0x00986b90
00986b78	mul x9,x8,x25
00986b7c	cmp x8,x27
00986b80	csel x8,x9,x19,lt
00986b84	str x8,[sp, #0x10]
00986b88	add x0,sp,#0x10
00986b8c	bl 0x00c2ff90
00986b90	ldr x0,[x24, #0x20]
00986b94	cbz x0,0x00986d30
00986b98	ldr x8,[x0]
00986b9c	ldr x8,[x8, #0x30]
00986ba0	blr x8
00986ba4	tbz w0,#0x0,0x00986b60
00986ba8	adrp x1,0x2a9000
00986bac	add x1,x1,#0xa70
00986bb0	mov w2,#0x16
00986bb4	mov x0,x23
00986bb8	bl 0x00c31090
00986bbc	b 0x00986bec
00986bc0	ldr x0,[x24, #0x20]
00986bc4	cbz x0,0x00986d94
00986bc8	ldr x8,[x0]
00986bcc	ldr x8,[x8, #0x30]
00986bd0	blr x8
00986bd4	tbz w0,#0x0,0x00986bf4
00986bd8	adrp x1,0x2a9000
00986bdc	add x1,x1,#0xa70
00986be0	mov w2,#0x16
00986be4	mov x0,x23
00986be8	bl 0x00c31090
00986bec	stp xzr,xzr,[x20]
00986bf0	b 0x00986c70
00986bf4	add x24,x22,#0x88
00986bf8	mov x0,x24
00986bfc	bl 0x00c2ff10
00986c00	mov x0,x24
00986c04	add x19,x22,#0x70
00986c08	bl 0x00c2ff20
00986c0c	cmp x19,x23
00986c10	b.eq 0x00986c34
00986c14	ldrb w8,[x22, #0x70]
00986c18	ldp x10,x9,[x22, #0x78]
00986c1c	tst w8,#0x1
00986c20	lsr w11,w8,#0x1
00986c24	csinc x1,x9,x19,ne
00986c28	csel x2,x11,x10,eq
00986c2c	mov x0,x23
00986c30	bl 0x00c31090
00986c34	add x23,x22,#0x48
00986c38	mov x0,x23
00986c3c	bl 0x00c2ff10
00986c40	ldr x8,[x22, #0x38]
00986c44	str x8,[x20]
00986c48	ldr x8,[x22, #0x40]
00986c4c	str x8,[x20, #0x8]
00986c50	cbz x8,0x00986c68
00986c54	add x8,x8,#0x8
00986c58	ldxr x9,[x8]
00986c5c	add x9,x9,#0x1
00986c60	stxr w10,x9,[x8]
00986c64	cbnz w10,0x00986c58
00986c68	mov x0,x23
00986c6c	bl 0x00c2ff20
00986c70	ldr x19,[sp]
00986c74	ldaxr x8,[x26]
00986c78	sub x9,x8,#0x1
00986c7c	stlxr w10,x9,[x26]
00986c80	cbnz w10,0x00986c74
00986c84	cbz x8,0x00986cfc
00986c88	ldrb w8,[sp, #0x20]
00986c8c	tbnz w8,#0x0,0x00986d1c
00986c90	ldr x0,[sp, #0x50]
00986c94	cbz x0,0x00986c9c
00986c98	bl 0x00c2ff00
00986c9c	add x8,x19,#0x8
00986ca0	ldaxr x9,[x8]
00986ca4	sub x10,x9,#0x1
00986ca8	stlxr w11,x10,[x8]
00986cac	cbnz w11,0x00986ca0
00986cb0	cbnz x9,0x00986ccc
00986cb4	ldr x8,[x19]
00986cb8	mov x0,x19
00986cbc	ldr x8,[x8, #0x10]
00986cc0	blr x8
00986cc4	mov x0,x19
00986cc8	bl 0x00c2ff00
00986ccc	ldr x8,[x28, #0x28]
00986cd0	ldr x9,[sp, #0x58]
00986cd4	cmp x8,x9
00986cd8	b.ne 0x00986d88
00986cdc	ldp x29,x30,[sp, #0xb0]
00986ce0	ldp x20,x19,[sp, #0xa0]
00986ce4	ldp x22,x21,[sp, #0x90]
00986ce8	ldp x24,x23,[sp, #0x80]
00986cec	ldp x26,x25,[sp, #0x70]
00986cf0	ldp x28,x27,[sp, #0x60]
00986cf4	add sp,sp,#0xc0
00986cf8	ret
00986cfc	ldr x8,[x21]
00986d00	mov x0,x21
00986d04	ldr x8,[x8, #0x10]
00986d08	blr x8
00986d0c	mov x0,x21
00986d10	bl 0x00c2ff00
00986d14	ldrb w8,[sp, #0x20]
00986d18	tbz w8,#0x0,0x00986c90
00986d1c	ldr x0,[sp, #0x30]
00986d20	bl 0x00c301d0
00986d24	ldr x0,[sp, #0x50]
00986d28	cbnz x0,0x00986c98
00986d2c	b 0x00986c9c
00986d30	mov w0,#0x8
00986d34	bl 0x00c30000
00986d38	adrp x8,0xcb4000
00986d3c	ldr x8,[x8, #0xb50]
00986d40	add x8,x8,#0x10
00986d44	str x8,[x0]
00986d48	adrp x1,0xcb4000
00986d4c	adrp x2,0xcb4000
00986d50	ldr x1,[x1, #0xb58]
00986d54	ldr x2,[x2, #0xb38]
00986d58	bl 0x00c30020
00986d5c	mov w0,#0x8
00986d60	bl 0x00c30000
00986d64	adrp x8,0xcb4000
00986d68	ldr x8,[x8, #0xd30]
00986d6c	adrp x1,0xcb4000
00986d70	adrp x2,0xcb4000
00986d74	add x8,x8,#0x10
00986d78	str x8,[x0]
00986d7c	ldr x1,[x1, #0xd18]
00986d80	ldr x2,[x2, #0xd00]
00986d84	bl 0x00c30020
00986d88	bl 0x00c2fec0
00986d8c	add x0,sp,#0x20
00986d90	bl 0x00c30ce0
00986d94	mov w0,#0x8
00986d98	bl 0x00c30000
00986d9c	adrp x8,0xcb4000
00986da0	ldr x8,[x8, #0xb50]
00986da4	add x8,x8,#0x10
00986da8	str x8,[x0]
00986dac	adrp x1,0xcb4000
00986db0	adrp x2,0xcb4000
00986db4	ldr x1,[x1, #0xb58]
00986db8	ldr x2,[x2, #0xb38]
00986dbc	bl 0x00c30020
