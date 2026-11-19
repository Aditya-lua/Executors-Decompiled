; mbedtls_psa_asymmetric_decrypt @ 00b9a0bc
00b9a0bc	sub sp,sp,#0x80
00b9a0c0	stp x28,x27,[sp, #0x20]
00b9a0c4	stp x26,x25,[sp, #0x30]
00b9a0c8	stp x24,x23,[sp, #0x40]
00b9a0cc	stp x22,x21,[sp, #0x50]
00b9a0d0	stp x20,x19,[sp, #0x60]
00b9a0d4	stp x29,x30,[sp, #0x70]
00b9a0d8	add x29,sp,#0x70
00b9a0dc	mrs x28,tpidr_el0
00b9a0e0	ldr x8,[x28, #0x28]
00b9a0e4	ldr x23,[x29, #0x20]
00b9a0e8	mov w9,#0x7001
00b9a0ec	mov x21,x7
00b9a0f0	str x8,[sp, #0x18]
00b9a0f4	str xzr,[x23]
00b9a0f8	ldrh w8,[x0]
00b9a0fc	mov x22,x6
00b9a100	mov x24,x5
00b9a104	mov x20,x4
00b9a108	mov w26,w3
00b9a10c	cmp w8,w9
00b9a110	b.ne 0x00b9a184
00b9a114	mov w0,#0x7001
00b9a118	add x3,sp,#0x10
00b9a11c	str xzr,[sp, #0x10]
00b9a120	bl 0x00c43150
00b9a124	ldr x19,[sp, #0x10]
00b9a128	mov w27,w0
00b9a12c	cbnz w0,0x00b9a1c4
00b9a130	mov x0,x19
00b9a134	bl 0x00c432f0
00b9a138	cmp x0,x24
00b9a13c	b.ne 0x00b9a1c0
00b9a140	ldp x24,x25,[x29, #0x10]
00b9a144	mov w8,#0x200
00b9a148	movk w8,#0x700, LSL #16
00b9a14c	cmp w26,w8
00b9a150	b.ne 0x00b9a18c
00b9a154	adrp x1,0xcb5000
00b9a158	ldr x1,[x1, #0xac0]
00b9a15c	mov x0,x19
00b9a160	mov x2,xzr
00b9a164	mov x3,x23
00b9a168	mov x4,x20
00b9a16c	mov x5,x24
00b9a170	mov x6,x25
00b9a174	bl 0x00c43330
00b9a178	bl 0x00c42bf0
00b9a17c	mov w27,w0
00b9a180	b 0x00b9a1c4
00b9a184	mov w27,#0xffffff7a
00b9a188	b 0x00b9a1d4
00b9a18c	and w9,w26,#0xffffff00
00b9a190	add w8,w8,#0x100
00b9a194	cmp w9,w8
00b9a198	b.ne 0x00b9a1c0
00b9a19c	and w26,w26,#0xff
00b9a1a0	mov w0,w26
00b9a1a4	bl 0x00c30210
00b9a1a8	cbz x0,0x00b9a208
00b9a1ac	mov w1,#0x1
00b9a1b0	mov x0,x19
00b9a1b4	mov w2,w26
00b9a1b8	bl 0x00c433b0
00b9a1bc	b 0x00b9a20c
00b9a1c0	mov w27,#0xffffff79
00b9a1c4	mov x0,x19
00b9a1c8	bl 0x00c432d0
00b9a1cc	mov x0,x19
00b9a1d0	bl 0x00c30960
00b9a1d4	ldr x8,[x28, #0x28]
00b9a1d8	ldr x9,[sp, #0x18]
00b9a1dc	cmp x8,x9
00b9a1e0	b.ne 0x00b9a248
00b9a1e4	mov w0,w27
00b9a1e8	ldp x29,x30,[sp, #0x70]
00b9a1ec	ldp x20,x19,[sp, #0x60]
00b9a1f0	ldp x22,x21,[sp, #0x50]
00b9a1f4	ldp x24,x23,[sp, #0x40]
00b9a1f8	ldp x26,x25,[sp, #0x30]
00b9a1fc	ldp x28,x27,[sp, #0x20]
00b9a200	add sp,sp,#0x80
00b9a204	ret
00b9a208	mov w0,#0xffffff7a
00b9a20c	bl 0x00c42bf0
00b9a210	mov w27,w0
00b9a214	cbnz w0,0x00b9a1c4
00b9a218	adrp x1,0xcb5000
00b9a21c	ldr x1,[x1, #0xac0]
00b9a220	mov x0,x19
00b9a224	mov x2,xzr
00b9a228	mov x3,x22
00b9a22c	mov x4,x21
00b9a230	mov x5,x23
00b9a234	mov x6,x20
00b9a238	mov x7,x24
00b9a23c	str x25,[sp]
00b9a240	bl 0x00c43370
00b9a244	b 0x00b9a178
00b9a248	bl 0x00c2fec0
