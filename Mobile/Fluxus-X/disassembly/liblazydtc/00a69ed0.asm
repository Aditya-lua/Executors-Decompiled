; PKCS5_pbe2_set_scrypt @ 00a69ed0
00a69ed0	sub sp,sp,#0x80
00a69ed4	stp x28,x27,[sp, #0x20]
00a69ed8	stp x26,x25,[sp, #0x30]
00a69edc	stp x24,x23,[sp, #0x40]
00a69ee0	stp x22,x21,[sp, #0x50]
00a69ee4	stp x20,x19,[sp, #0x60]
00a69ee8	stp x29,x30,[sp, #0x70]
00a69eec	add x29,sp,#0x70
00a69ef0	cbz x0,0x00a69fd8
00a69ef4	mov x27,x3
00a69ef8	mov w25,w2
00a69efc	mov x23,x1
00a69f00	mov x24,x0
00a69f04	mov x0,xzr
00a69f08	mov x1,xzr
00a69f0c	mov x2,xzr
00a69f10	mov x3,xzr
00a69f14	mov x7,xzr
00a69f18	mov x20,x6
00a69f1c	mov x21,x5
00a69f20	mov x22,x4
00a69f24	stp xzr,xzr,[sp]
00a69f28	bl 0x00c3d890
00a69f2c	cbz w0,0x00a6a008
00a69f30	mov x0,x24
00a69f34	bl 0x00c3cf00
00a69f38	cbz w0,0x00a6a030
00a69f3c	mov w26,w0
00a69f40	bl 0x00c37e40
00a69f44	mov x19,x0
00a69f48	cbz x0,0x00a69f9c
00a69f4c	ldr x28,[x19, #0x8]
00a69f50	mov w0,w26
00a69f54	bl 0x00c37740
00a69f58	str x0,[x28]
00a69f5c	bl 0x00c37a40
00a69f60	str x0,[x28, #0x8]
00a69f64	cbz x0,0x00a69f9c
00a69f68	mov x0,x24
00a69f6c	bl 0x00c34bc0
00a69f70	cbz w0,0x00a6a0b8
00a69f74	mov x0,x24
00a69f78	bl 0x00c34bc0
00a69f7c	mov w1,w0
00a69f80	cbz x27,0x00a6a0a8
00a69f84	sxtw x2,w1
00a69f88	add x0,sp,#0x10
00a69f8c	mov x1,x27
00a69f90	bl 0x00c2ffd0
00a69f94	bl 0x00c34b90
00a69f98	cbnz x0,0x00a6a0c0
00a69f9c	mov x20,xzr
00a69fa0	bl 0x00c342a0
00a69fa4	adrp x0,0x29e000
00a69fa8	adrp x2,0x2bd000
00a69fac	add x0,x0,#0x1b0
00a69fb0	add x2,x2,#0xb1a
00a69fb4	mov w1,#0x89
00a69fb8	bl 0x00c342b0
00a69fbc	mov w1,#0x100
00a69fc0	mov w0,#0xd
00a69fc4	movk w1,#0xc, LSL #16
00a69fc8	mov x2,xzr
00a69fcc	bl 0x00c342c0
00a69fd0	mov x27,xzr
00a69fd4	b 0x00a6a068
00a69fd8	bl 0x00c342a0
00a69fdc	adrp x0,0x29e000
00a69fe0	adrp x2,0x2bd000
00a69fe4	add x0,x0,#0x1b0
00a69fe8	add x2,x2,#0xb1a
00a69fec	mov w1,#0x36
00a69ff0	bl 0x00c342b0
00a69ff4	mov w8,#0x100
00a69ff8	movk w8,#0xc, LSL #16
00a69ffc	add w1,w8,#0x2
00a6a000	mov w0,#0xd
00a6a004	b 0x00a6a054
00a6a008	bl 0x00c342a0
00a6a00c	adrp x0,0x29e000
00a6a010	adrp x2,0x2bd000
00a6a014	add x0,x0,#0x1b0
00a6a018	add x2,x2,#0xb1a
00a6a01c	mov w1,#0x3b
00a6a020	bl 0x00c342b0
00a6a024	mov w0,#0xd
00a6a028	mov w1,#0xe3
00a6a02c	b 0x00a6a054
00a6a030	bl 0x00c342a0
00a6a034	adrp x0,0x29e000
00a6a038	adrp x2,0x2bd000
00a6a03c	add x0,x0,#0x1b0
00a6a040	add x2,x2,#0xb1a
00a6a044	mov w1,#0x41
00a6a048	bl 0x00c342b0
00a6a04c	mov w0,#0xd
00a6a050	mov w1,#0x6c
00a6a054	mov x2,xzr
00a6a058	bl 0x00c342c0
00a6a05c	mov x20,xzr
00a6a060	mov x27,xzr
00a6a064	mov x19,xzr
00a6a068	mov x0,x19
00a6a06c	bl 0x00c37e20
00a6a070	mov x0,x20
00a6a074	bl 0x00c38240
00a6a078	mov x0,x27
00a6a07c	bl 0x00c342d0
00a6a080	mov x20,xzr
00a6a084	mov x0,x20
00a6a088	ldp x29,x30,[sp, #0x70]
00a6a08c	ldp x20,x19,[sp, #0x60]
00a6a090	ldp x22,x21,[sp, #0x50]
00a6a094	ldp x24,x23,[sp, #0x40]
00a6a098	ldp x26,x25,[sp, #0x30]
00a6a09c	ldp x28,x27,[sp, #0x20]
00a6a0a0	add sp,sp,#0x80
00a6a0a4	ret
00a6a0a8	add x0,sp,#0x10
00a6a0ac	bl 0x00c326a0
00a6a0b0	cmp w0,#0x1
00a6a0b4	b.lt 0x00a6a2c4
00a6a0b8	bl 0x00c34b90
00a6a0bc	cbz x0,0x00a69f9c
00a6a0c0	add x4,sp,#0x10
00a6a0c4	mov x1,x24
00a6a0c8	mov x2,xzr
00a6a0cc	mov x3,xzr
00a6a0d0	mov w5,wzr
00a6a0d4	mov x27,x0
00a6a0d8	bl 0x00c34be0
00a6a0dc	cbz w0,0x00a6a2bc
00a6a0e0	ldr x1,[x28, #0x8]
00a6a0e4	mov x0,x27
00a6a0e8	bl 0x00c3cf20
00a6a0ec	cmp w0,#0x0
00a6a0f0	b.le 0x00a6a290
00a6a0f4	mov x0,x27
00a6a0f8	bl 0x00c342d0
00a6a0fc	cmp w26,#0x25
00a6a100	mov x26,xzr
00a6a104	b.ne 0x00a6a114
00a6a108	mov x0,x24
00a6a10c	bl 0x00c34bd0
00a6a110	sxtw x26,w0
00a6a114	ldr x0,[x19]
00a6a118	bl 0x00c38240
00a6a11c	adrp x0,0xc5e000
00a6a120	add x0,x0,#0x8f0
00a6a124	bl 0x00c372e0
00a6a128	mov x24,x0
00a6a12c	cbz x0,0x00a6a238
00a6a130	ldr x0,[x24]
00a6a134	cmp w25,#0x0
00a6a138	mov w8,#0x8
00a6a13c	csel w25,w8,w25,eq
00a6a140	mov x1,x23
00a6a144	mov w2,w25
00a6a148	bl 0x00c378a0
00a6a14c	cbz w0,0x00a6a238
00a6a150	cbnz x23,0x00a6a16c
00a6a154	ldr x8,[x24]
00a6a158	mov w1,w25
00a6a15c	ldr x0,[x8, #0x8]
00a6a160	bl 0x00c326a0
00a6a164	cmp w0,#0x1
00a6a168	b.lt 0x00a6a2cc
00a6a16c	ldr x0,[x24, #0x8]
00a6a170	mov x1,x22
00a6a174	bl 0x00c375d0
00a6a178	cbz w0,0x00a6a238
00a6a17c	ldr x0,[x24, #0x10]
00a6a180	mov x1,x21
00a6a184	bl 0x00c375d0
00a6a188	cbz w0,0x00a6a238
00a6a18c	ldr x0,[x24, #0x18]
00a6a190	mov x1,x20
00a6a194	bl 0x00c375d0
00a6a198	cbz w0,0x00a6a238
00a6a19c	cbz x26,0x00a6a1b8
00a6a1a0	bl 0x00c37f30
00a6a1a4	str x0,[x24, #0x20]
00a6a1a8	cbz x0,0x00a6a238
00a6a1ac	mov x1,x26
00a6a1b0	bl 0x00c375c0
00a6a1b4	cbz w0,0x00a6a238
00a6a1b8	bl 0x00c38250
00a6a1bc	mov x20,x0
00a6a1c0	cbz x0,0x00a6a23c
00a6a1c4	mov w0,#0x3cd
00a6a1c8	bl 0x00c37740
00a6a1cc	mov x2,x20
00a6a1d0	str x0,[x2], #0x8
00a6a1d4	adrp x0,0xc5e000
00a6a1d8	add x0,x0,#0x8f0
00a6a1dc	mov x1,x24
00a6a1e0	bl 0x00c37a50
00a6a1e4	cbz x0,0x00a6a23c
00a6a1e8	adrp x1,0xc5e000
00a6a1ec	add x1,x1,#0x8f0
00a6a1f0	mov x0,x24
00a6a1f4	bl 0x00c36160
00a6a1f8	str x20,[x19]
00a6a1fc	bl 0x00c38250
00a6a200	mov x20,x0
00a6a204	cbz x0,0x00a69fa0
00a6a208	mov w0,#0xa1
00a6a20c	bl 0x00c37740
00a6a210	mov x21,x20
00a6a214	str x0,[x21], #0x8
00a6a218	bl 0x00c37e30
00a6a21c	mov x1,x19
00a6a220	mov x2,x21
00a6a224	bl 0x00c37a50
00a6a228	cbz x0,0x00a69fa0
00a6a22c	mov x0,x19
00a6a230	bl 0x00c37e20
00a6a234	b 0x00a6a084
00a6a238	mov x20,xzr
00a6a23c	bl 0x00c342a0
00a6a240	adrp x0,0x29e000
00a6a244	adrp x2,0x2bd000
00a6a248	add x0,x0,#0x1b0
00a6a24c	add x2,x2,#0xb30
00a6a250	mov w1,#0xcc
00a6a254	bl 0x00c342b0
00a6a258	mov w1,#0x100
00a6a25c	mov w0,#0xd
00a6a260	movk w1,#0xc, LSL #16
00a6a264	mov x2,xzr
00a6a268	bl 0x00c342c0
00a6a26c	adrp x1,0xc5e000
00a6a270	add x1,x1,#0x8f0
00a6a274	mov x0,x24
00a6a278	bl 0x00c36160
00a6a27c	mov x0,x20
00a6a280	bl 0x00c38240
00a6a284	mov x20,xzr
00a6a288	str xzr,[x19]
00a6a28c	b 0x00a69fa0
00a6a290	bl 0x00c342a0
00a6a294	adrp x0,0x29e000
00a6a298	adrp x2,0x2bd000
00a6a29c	add x0,x0,#0x1b0
00a6a2a0	add x2,x2,#0xb1a
00a6a2a4	mov w1,#0x61
00a6a2a8	bl 0x00c342b0
00a6a2ac	mov w0,#0xd
00a6a2b0	mov w1,#0x72
00a6a2b4	mov x2,xzr
00a6a2b8	bl 0x00c342c0
00a6a2bc	mov x20,xzr
00a6a2c0	b 0x00a6a068
00a6a2c4	mov x20,xzr
00a6a2c8	b 0x00a69fd0
00a6a2cc	mov x20,xzr
00a6a2d0	b 0x00a6a26c
