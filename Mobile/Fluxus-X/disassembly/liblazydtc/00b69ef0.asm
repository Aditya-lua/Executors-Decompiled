; mbedtls_cipher_update @ 00b69ef0
00b69ef0	stp x26,x25,[sp, #-0x50]!
00b69ef4	stp x24,x23,[sp, #0x10]
00b69ef8	stp x22,x21,[sp, #0x20]
00b69efc	stp x20,x19,[sp, #0x30]
00b69f00	stp x29,x30,[sp, #0x40]
00b69f04	add x29,sp,#0x40
00b69f08	ldr x10,[x0]
00b69f0c	mov x19,x4
00b69f10	mov x21,x3
00b69f14	mov x20,x2
00b69f18	mov x23,x0
00b69f1c	mov x22,x1
00b69f20	cbz x10,0x00b6a0d4
00b69f24	str xzr,[x19]
00b69f28	ldr w8,[x10, #0x8]
00b69f2c	and x24,x8,#0x1f
00b69f30	cbz w24,0x00b69f9c
00b69f34	ubfx w9,w8,#0xc,#0x4
00b69f38	cmp w9,#0x9
00b69f3c	b.eq 0x00b69fa4
00b69f40	cmp w9,#0x6
00b69f44	b.eq 0x00b69fd4
00b69f48	cmp w9,#0x1
00b69f4c	b.ne 0x00b6a004
00b69f50	cmp x24,x20
00b69f54	b.ne 0x00b6a03c
00b69f58	str x20,[x19]
00b69f5c	ldr w8,[x10, #0x8]
00b69f60	adrp x9,0xcb5000
00b69f64	ldr x9,[x9, #0xa80]
00b69f68	ldr x0,[x23, #0x50]
00b69f6c	ubfx w8,w8,#0x1a,#0x5
00b69f70	ldr w1,[x23, #0xc]
00b69f74	ldr x8,[x9, w8, UXTW #0x3]
00b69f78	mov x2,x22
00b69f7c	mov x3,x21
00b69f80	ldp x29,x30,[sp, #0x40]
00b69f84	ldr x4,[x8, #0x8]
00b69f88	ldp x20,x19,[sp, #0x30]
00b69f8c	ldp x22,x21,[sp, #0x20]
00b69f90	ldp x24,x23,[sp, #0x10]
00b69f94	ldp x26,x25,[sp], #0x50
00b69f98	br x4
00b69f9c	mov w0,#0xffff9c80
00b69fa0	b 0x00b6a0d8
00b69fa4	ldr x0,[x23, #0x50]
00b69fa8	mov x1,x22
00b69fac	mov x2,x20
00b69fb0	mov x3,x21
00b69fb4	mov x4,x20
00b69fb8	mov x5,x19
00b69fbc	ldp x29,x30,[sp, #0x40]
00b69fc0	ldp x20,x19,[sp, #0x30]
00b69fc4	ldp x22,x21,[sp, #0x20]
00b69fc8	ldp x24,x23,[sp, #0x10]
00b69fcc	ldp x26,x25,[sp], #0x50
00b69fd0	b 0x00c42050
00b69fd4	ldr x0,[x23, #0x50]
00b69fd8	mov x1,x22
00b69fdc	mov x2,x20
00b69fe0	mov x3,x21
00b69fe4	mov x4,x20
00b69fe8	mov x5,x19
00b69fec	ldp x29,x30,[sp, #0x40]
00b69ff0	ldp x20,x19,[sp, #0x30]
00b69ff4	ldp x22,x21,[sp, #0x20]
00b69ff8	ldp x24,x23,[sp, #0x10]
00b69ffc	ldp x26,x25,[sp], #0x50
00b6a000	b 0x00c421e0
00b6a004	and w10,w8,#0xff0000
00b6a008	cmp w10,#0x4d0, LSL #12
00b6a00c	b.ne 0x00b6a044
00b6a010	str x20,[x19]
00b6a014	ldr x0,[x23, #0x50]
00b6a018	mov x1,x20
00b6a01c	mov x2,x22
00b6a020	mov x3,x21
00b6a024	ldp x29,x30,[sp, #0x40]
00b6a028	ldp x20,x19,[sp, #0x30]
00b6a02c	ldp x22,x21,[sp, #0x20]
00b6a030	ldp x24,x23,[sp, #0x10]
00b6a034	ldp x26,x25,[sp], #0x50
00b6a038	b 0x00c42130
00b6a03c	mov w0,#0xffff9d80
00b6a040	b 0x00b6a0d8
00b6a044	cmp x22,x21
00b6a048	b.eq 0x00b6a0c0
00b6a04c	sub w9,w9,#0x2
00b6a050	cmp w9,#0x8
00b6a054	mov w0,#0xffff9f80
00b6a058	b.hi 0x00b6a0d8
00b6a05c	adrp x10,0x77c000
00b6a060	add x10,x10,#0x89c
00b6a064	ldrsw x9,[x10, x9, LSL #0x2]
00b6a068	add x9,x9,x10
00b6a06c	br x9
00b6a070	ldr w8,[x23, #0xc]
00b6a074	cmp w8,#0x1
00b6a078	b.eq 0x00b6a21c
00b6a07c	cbnz w8,0x00b6a22c
00b6a080	ldr x8,[x23, #0x30]
00b6a084	ldr x10,[x23, #0x10]
00b6a088	sub x9,x24,x8
00b6a08c	cbz x10,0x00b6a224
00b6a090	cmp x9,x20
00b6a094	b.cc 0x00b6a22c
00b6a098	add x8,x23,x8
00b6a09c	add x0,x8,#0x20
00b6a0a0	mov x1,x22
00b6a0a4	mov x2,x20
00b6a0a8	bl 0x00c2ffd0
00b6a0ac	ldr x8,[x23, #0x30]
00b6a0b0	mov w0,wzr
00b6a0b4	add x8,x8,x20
00b6a0b8	str x8,[x23, #0x30]
00b6a0bc	b 0x00b6a0d8
00b6a0c0	ldr x10,[x23, #0x30]
00b6a0c4	cbnz x10,0x00b6a0d4
00b6a0c8	udiv x10,x20,x24
00b6a0cc	msub x10,x10,x24,x20
00b6a0d0	cbz x10,0x00b6a04c
00b6a0d4	mov w0,#0xffff9f00
00b6a0d8	ldp x29,x30,[sp, #0x40]
00b6a0dc	ldp x20,x19,[sp, #0x30]
00b6a0e0	ldp x22,x21,[sp, #0x20]
00b6a0e4	ldp x24,x23,[sp, #0x10]
00b6a0e8	ldp x26,x25,[sp], #0x50
00b6a0ec	ret
00b6a0f0	adrp x9,0xcb5000
00b6a0f4	ldr x9,[x9, #0xa80]
00b6a0f8	ubfx w8,w8,#0x1a,#0x5
00b6a0fc	ldr x0,[x23, #0x50]
00b6a100	ldr w1,[x23, #0xc]
00b6a104	ldr x8,[x9, w8, UXTW #0x3]
00b6a108	add x3,x23,#0x30
00b6a10c	add x4,x23,#0x38
00b6a110	mov x2,x20
00b6a114	ldr x8,[x8, #0x18]
00b6a118	mov x5,x22
00b6a11c	mov x6,x21
00b6a120	blr x8
00b6a124	cbnz w0,0x00b6a0d8
00b6a128	b 0x00b6a214
00b6a12c	adrp x9,0xcb5000
00b6a130	ldr x9,[x9, #0xa80]
00b6a134	ubfx w8,w8,#0x1a,#0x5
00b6a138	ldr x0,[x23, #0x50]
00b6a13c	add x2,x23,#0x30
00b6a140	ldr x8,[x9, w8, UXTW #0x3]
00b6a144	add x3,x23,#0x38
00b6a148	mov x1,x20
00b6a14c	mov x4,x22
00b6a150	ldr x8,[x8, #0x20]
00b6a154	mov x5,x21
00b6a158	blr x8
00b6a15c	cbnz w0,0x00b6a0d8
00b6a160	b 0x00b6a214
00b6a164	adrp x9,0xcb5000
00b6a168	ldr x9,[x9, #0xa80]
00b6a16c	ubfx w8,w8,#0x1a,#0x5
00b6a170	ldr x0,[x23, #0x50]
00b6a174	add x2,x23,#0x30
00b6a178	ldr x8,[x9, w8, UXTW #0x3]
00b6a17c	add x3,x23,#0x38
00b6a180	add x4,x23,#0x20
00b6a184	mov x1,x20
00b6a188	ldr x8,[x8, #0x28]
00b6a18c	mov x5,x22
00b6a190	mov x6,x21
00b6a194	blr x8
00b6a198	cbnz w0,0x00b6a0d8
00b6a19c	b 0x00b6a214
00b6a1a0	adrp x9,0xcb5000
00b6a1a4	ldr x9,[x9, #0xa80]
00b6a1a8	ubfx w8,w8,#0x1a,#0x5
00b6a1ac	ldr x0,[x23, #0x50]
00b6a1b0	mov x1,x20
00b6a1b4	ldr x8,[x9, w8, UXTW #0x3]
00b6a1b8	mov x2,x22
00b6a1bc	mov x3,x21
00b6a1c0	ldr x8,[x8, #0x38]
00b6a1c4	blr x8
00b6a1c8	cbnz w0,0x00b6a0d8
00b6a1cc	b 0x00b6a214
00b6a1d0	ldr x9,[x23, #0x30]
00b6a1d4	cbz x9,0x00b6a1e0
00b6a1d8	mov w0,#0xffff9f80
00b6a1dc	b 0x00b6a0d8
00b6a1e0	adrp x9,0xcb5000
00b6a1e4	ldr x9,[x9, #0xa80]
00b6a1e8	ubfx w8,w8,#0x1a,#0x5
00b6a1ec	ldr x0,[x23, #0x50]
00b6a1f0	ldr w1,[x23, #0xc]
00b6a1f4	ldr x8,[x9, w8, UXTW #0x3]
00b6a1f8	add x3,x23,#0x38
00b6a1fc	mov x2,x20
00b6a200	mov x4,x22
00b6a204	ldr x8,[x8, #0x30]
00b6a208	mov x5,x21
00b6a20c	blr x8
00b6a210	cbnz w0,0x00b6a0d8
00b6a214	str x20,[x19]
00b6a218	b 0x00b6a0d8
00b6a21c	ldr x8,[x23, #0x30]
00b6a220	sub x9,x24,x8
00b6a224	cmp x9,x20
00b6a228	b.hi 0x00b6a098
00b6a22c	ldr x8,[x23, #0x30]
00b6a230	cbz x8,0x00b6a2a4
00b6a234	sub x25,x24,x8
00b6a238	add x26,x23,#0x20
00b6a23c	add x0,x26,x8
00b6a240	mov x1,x22
00b6a244	mov x2,x25
00b6a248	bl 0x00c2ffd0
00b6a24c	ldr x8,[x23]
00b6a250	adrp x9,0xcb5000
00b6a254	add x3,x23,#0x38
00b6a258	mov x2,x24
00b6a25c	ldr w8,[x8, #0x8]
00b6a260	ldr x9,[x9, #0xa80]
00b6a264	ldr x0,[x23, #0x50]
00b6a268	ldr w1,[x23, #0xc]
00b6a26c	ubfx w8,w8,#0x1a,#0x5
00b6a270	ldr x8,[x9, w8, UXTW #0x3]
00b6a274	mov x4,x26
00b6a278	mov x5,x21
00b6a27c	ldr x8,[x8, #0x10]
00b6a280	blr x8
00b6a284	cbnz w0,0x00b6a0d8
00b6a288	ldr x8,[x19]
00b6a28c	add x21,x21,x24
00b6a290	add x22,x22,x25
00b6a294	sub x20,x20,x25
00b6a298	add x8,x8,x24
00b6a29c	str x8,[x19]
00b6a2a0	str xzr,[x23, #0x30]
00b6a2a4	cbz x20,0x00b6a338
00b6a2a8	udiv x8,x20,x24
00b6a2ac	msub x25,x8,x24,x20
00b6a2b0	cbnz x25,0x00b6a2c8
00b6a2b4	ldr w8,[x23, #0xc]
00b6a2b8	cbnz w8,0x00b6a2c8
00b6a2bc	ldr x8,[x23, #0x10]
00b6a2c0	cmp x8,#0x0
00b6a2c4	csel x25,xzr,x24,eq
00b6a2c8	sub x20,x20,x25
00b6a2cc	add x0,x23,#0x20
00b6a2d0	add x1,x22,x20
00b6a2d4	mov x2,x25
00b6a2d8	bl 0x00c2ffd0
00b6a2dc	ldr x8,[x23, #0x30]
00b6a2e0	add x8,x8,x25
00b6a2e4	str x8,[x23, #0x30]
00b6a2e8	cbz x20,0x00b6a338
00b6a2ec	ldr x8,[x23]
00b6a2f0	adrp x9,0xcb5000
00b6a2f4	add x3,x23,#0x38
00b6a2f8	mov x2,x20
00b6a2fc	ldr w8,[x8, #0x8]
00b6a300	ldr x9,[x9, #0xa80]
00b6a304	ldr x0,[x23, #0x50]
00b6a308	ldr w1,[x23, #0xc]
00b6a30c	ubfx w8,w8,#0x1a,#0x5
00b6a310	ldr x8,[x9, w8, UXTW #0x3]
00b6a314	mov x4,x22
00b6a318	mov x5,x21
00b6a31c	ldr x8,[x8, #0x10]
00b6a320	blr x8
00b6a324	cbnz w0,0x00b6a0d8
00b6a328	ldr x8,[x19]
00b6a32c	add x8,x8,x20
00b6a330	str x8,[x19]
00b6a334	b 0x00b6a0d8
00b6a338	mov w0,wzr
00b6a33c	b 0x00b6a0d8
