; __gxx_personality_v0 @ 00c29e10
00c29e10	paciasp
00c29e14	sub sp,sp,#0xc0
00c29e18	stp x29,x30,[sp, #0x60]
00c29e1c	stp x28,x27,[sp, #0x70]
00c29e20	stp x26,x25,[sp, #0x80]
00c29e24	stp x24,x23,[sp, #0x90]
00c29e28	stp x22,x21,[sp, #0xa0]
00c29e2c	stp x20,x19,[sp, #0xb0]
00c29e30	add x29,sp,#0x60
00c29e34	cmp w0,#0x1
00c29e38	mov w0,#0x3
00c29e3c	b.ne 0x00c2a2f0
00c29e40	mov x19,x3
00c29e44	cbz x3,0x00c2a2f0
00c29e48	mov x20,x4
00c29e4c	cbz x4,0x00c2a2f0
00c29e50	mov x8,#0x2b01
00c29e54	mov w21,w1
00c29e58	cmp w1,#0x6
00c29e5c	movk x8,#0x432b, LSL #16
00c29e60	and x22,x2,#-0x100
00c29e64	movk x8,#0x4e47, LSL #32
00c29e68	movk x8,#0x434c, LSL #48
00c29e6c	sub x25,x8,#0x1
00c29e70	b.ne 0x00c29ec0
00c29e74	cmp x22,x25
00c29e78	b.ne 0x00c29ec0
00c29e7c	ldursw x21,[x19, #-0x24]
00c29e80	ldur x22,[x19, #-0x10]
00c29e84	mov x0,x20
00c29e88	mov w1,wzr
00c29e8c	mov x2,x19
00c29e90	bl 0x00c2c2ec
00c29e94	mov x0,x20
00c29e98	mov w1,#0x1
00c29e9c	mov x2,x21
00c29ea0	bl 0x00c2c2ec
00c29ea4	mov x0,x20
00c29ea8	mov x1,x22
00c29eac	bl 0x00c2c324
00c29eb0	tbz w21,#0x1f,0x00c29eb8
00c29eb4	stur xzr,[x19, #-0x10]
00c29eb8	mov w0,#0x7
00c29ebc	b 0x00c2a2f0
00c29ec0	tbnz w21,#0x0,0x00c29f10
00c29ec4	tbz w21,#0x1,0x00c2a2f0
00c29ec8	mov w8,#0xc
00c29ecc	bics wzr,w8,w21
00c29ed0	b.ne 0x00c29f18
00c29ed4	mov x22,xzr
00c29ed8	mov x26,xzr
00c29edc	mov x0,x20
00c29ee0	mov w1,wzr
00c29ee4	mov x2,x19
00c29ee8	bl 0x00c2c2ec
00c29eec	mov x0,x20
00c29ef0	mov w1,#0x1
00c29ef4	mov x2,x26
00c29ef8	bl 0x00c2c2ec
00c29efc	mov x0,x20
00c29f00	mov x1,x22
00c29f04	bl 0x00c2c324
00c29f08	tbz x26,#0x3f,0x00c29eb8
00c29f0c	b 0x00c29eb4
00c29f10	tst w21,#0xe
00c29f14	b.ne 0x00c2a2f0
00c29f18	mov x0,x20
00c29f1c	bl 0x00c2c268
00c29f20	cbz x0,0x00c2a2ec
00c29f24	mov x23,x0
00c29f28	mov x0,x20
00c29f2c	bl 0x00c2c2f4
00c29f30	mov x27,x0
00c29f34	mov x0,x20
00c29f38	bl 0x00c2c29c
00c29f3c	mov x8,x23
00c29f40	mov x24,x0
00c29f44	ldrb w1,[x8], #0x1
00c29f48	stur x8,[x29, #-0x10]
00c29f4c	cmp w1,#0xff
00c29f50	b.eq 0x00c29f6c
00c29f54	sub x0,x29,#0x10
00c29f58	mov x2,xzr
00c29f5c	bl 0x00c2a5f8
00c29f60	ldur x8,[x29, #-0x10]
00c29f64	stur x0,[x29, #-0x28]
00c29f68	b 0x00c29f70
00c29f6c	stur x24,[x29, #-0x28]
00c29f70	ldrb w9,[x8], #0x1
00c29f74	stur x8,[x29, #-0x10]
00c29f78	str x23,[sp, #0x10]
00c29f7c	str x9,[sp, #0x30]
00c29f80	cmp x9,#0xff
00c29f84	mvn x9,x24
00c29f88	b.eq 0x00c29fb8
00c29f8c	mov x11,xzr
00c29f90	mov x10,xzr
00c29f94	ldrb w12,[x8], #0x1
00c29f98	and x13,x12,#0x7f
00c29f9c	lsl x13,x13,x11
00c29fa0	add x11,x11,#0x7
00c29fa4	orr x10,x13,x10
00c29fa8	tbnz w12,#0x7,0x00c29f94
00c29fac	add x10,x8,x10
00c29fb0	stur x10,[x29, #-0x20]
00c29fb4	b 0x00c29fbc
00c29fb8	stur xzr,[x29, #-0x20]
00c29fbc	add x23,x8,#0x1
00c29fc0	mov x11,xzr
00c29fc4	mov x10,xzr
00c29fc8	stur x23,[x29, #-0x10]
00c29fcc	add x24,x27,x9
00c29fd0	ldrb w26,[x8]
00c29fd4	str x22,[sp, #0x20]
00c29fd8	ldrb w8,[x23], #0x1
00c29fdc	and x9,x8,#0x7f
00c29fe0	lsl x9,x9,x11
00c29fe4	add x11,x11,#0x7
00c29fe8	orr x10,x9,x10
00c29fec	tbnz w8,#0x7,0x00c29fd8
00c29ff0	mov w8,w10
00c29ff4	mov x9,x23
00c29ff8	stp x23,x23,[x29, #-0x18]
00c29ffc	add x22,x23,x8
00c2a000	str x8,[sp, #0x28]
00c2a004	b 0x00c2a010
00c2a008	cmp x24,x27
00c2a00c	b.cc 0x00c2a36c
00c2a010	cmp x9,x22
00c2a014	b.cs 0x00c2a36c
00c2a018	sub x0,x29,#0x18
00c2a01c	mov w1,w26
00c2a020	mov x2,xzr
00c2a024	bl 0x00c2a5f8
00c2a028	mov x27,x0
00c2a02c	sub x0,x29,#0x18
00c2a030	mov w1,w26
00c2a034	mov x2,xzr
00c2a038	bl 0x00c2a5f8
00c2a03c	mov x28,x0
00c2a040	sub x0,x29,#0x18
00c2a044	mov w1,w26
00c2a048	mov x2,xzr
00c2a04c	bl 0x00c2a5f8
00c2a050	ldur x9,[x29, #-0x18]
00c2a054	mov x10,xzr
00c2a058	mov x8,xzr
00c2a05c	ldrb w11,[x9], #0x1
00c2a060	and x12,x11,#0x7f
00c2a064	lsl x12,x12,x10
00c2a068	add x10,x10,#0x7
00c2a06c	orr x8,x12,x8
00c2a070	tbnz w11,#0x7,0x00c2a05c
00c2a074	cmp x27,x24
00c2a078	stur x9,[x29, #-0x18]
00c2a07c	b.hi 0x00c2a008
00c2a080	add x10,x28,x27
00c2a084	cmp x24,x10
00c2a088	b.cs 0x00c2a008
00c2a08c	cbz x0,0x00c2a2ec
00c2a090	ldur x9,[x29, #-0x28]
00c2a094	add x22,x0,x9
00c2a098	cbz x8,0x00c2a2a4
00c2a09c	add x10,x19,#0x20
00c2a0a0	ldr x9,[sp, #0x28]
00c2a0a4	str x22,[sp, #0x8]
00c2a0a8	str x10,[sp, #0x18]
00c2a0ac	ldr x10,[sp, #0x30]
00c2a0b0	ldr x22,[sp, #0x20]
00c2a0b4	add x9,x23,x9
00c2a0b8	mov w28,wzr
00c2a0bc	mov w14,#0x3f
00c2a0c0	and x11,x10,#0xf
00c2a0c4	mov w10,#0x1c1d
00c2a0c8	add x8,x9,x8
00c2a0cc	lsr w9,w10,w11
00c2a0d0	sub x24,x8,#0x1
00c2a0d4	mov x15,#-0x1
00c2a0d8	stur x11,[x29, #-0x28]
00c2a0dc	str w9,[sp, #0x28]
00c2a0e0	mov x9,xzr
00c2a0e4	mov x8,xzr
00c2a0e8	mov x23,x24
00c2a0ec	ldrb w10,[x23], #0x1
00c2a0f0	and x11,x10,#0x7f
00c2a0f4	lsl x11,x11,x9
00c2a0f8	add x9,x9,#0x7
00c2a0fc	orr x8,x11,x8
00c2a100	tbnz w10,#0x7,0x00c2a0ec
00c2a104	cmp x9,#0x40
00c2a108	lsl x9,x15,x9
00c2a10c	ccmp w10,w14,#0x0,cc
00c2a110	csel x9,x9,xzr,hi
00c2a114	orr x26,x8,x9
00c2a118	cmp x26,#0x1
00c2a11c	b.lt 0x00c2a1e0
00c2a120	ldur x8,[x29, #-0x20]
00c2a124	cbz x8,0x00c2a38c
00c2a128	ldur x8,[x29, #-0x28]
00c2a12c	cmp w8,#0xc
00c2a130	b.hi 0x00c2a38c
00c2a134	ldr w8,[sp, #0x28]
00c2a138	tbz w8,#0x0,0x00c2a38c
00c2a13c	ldur x8,[x29, #-0x28]
00c2a140	adrp x9,0x78d000
00c2a144	add x9,x9,#0x6f8
00c2a148	sub x0,x29,#0x8
00c2a14c	ldr x1,[sp, #0x30]
00c2a150	mov x2,xzr
00c2a154	ldr x8,[x9, x8, LSL #0x3]
00c2a158	ldur x9,[x29, #-0x20]
00c2a15c	nop
00c2a160	madd x8,x8,x26,x9
00c2a164	stur x8,[x29, #-0x8]
00c2a168	bl 0x00c2a5f8
00c2a16c	cbz x0,0x00c2a314
00c2a170	cmp x22,x25
00c2a174	b.ne 0x00c2a1d0
00c2a178	mov x22,x0
00c2a17c	mov x0,x19
00c2a180	bl 0x00c292fc
00c2a184	mov x8,#0x2b01
00c2a188	movk x8,#0x432b, LSL #16
00c2a18c	movk x8,#0x4e47, LSL #32
00c2a190	movk x8,#0x434c, LSL #48
00c2a194	cmp x0,x8
00c2a198	ldr x8,[sp, #0x18]
00c2a19c	b.ne 0x00c2a1a4
00c2a1a0	ldur x8,[x19, #-0x58]
00c2a1a4	stur x8,[x29, #-0x8]
00c2a1a8	cbz x8,0x00c2a39c
00c2a1ac	ldur x1,[x19, #-0x50]
00c2a1b0	cbz x1,0x00c2a39c
00c2a1b4	ldr x8,[x22]
00c2a1b8	mov x0,x22
00c2a1bc	sub x2,x29,#0x8
00c2a1c0	ldr x8,[x8, #0x20]
00c2a1c4	blr x8
00c2a1c8	ldr x22,[sp, #0x20]
00c2a1cc	tbnz w0,#0x0,0x00c2a34c
00c2a1d0	mov w8,w28
00c2a1d4	mov w14,#0x3f
00c2a1d8	mov x15,#-0x1
00c2a1dc	b 0x00c2a25c
00c2a1e0	cmp x26,#0x0
00c2a1e4	cset w8,eq
00c2a1e8	orr w8,w8,w28
00c2a1ec	tbnz w21,#0x3,0x00c2a25c
00c2a1f0	cbz x26,0x00c2a25c
00c2a1f4	mov x0,x19
00c2a1f8	bl 0x00c292fc
00c2a1fc	mov x8,#0x2b01
00c2a200	cmp x22,x25
00c2a204	movk x8,#0x432b, LSL #16
00c2a208	movk x8,#0x4e47, LSL #32
00c2a20c	movk x8,#0x434c, LSL #48
00c2a210	b.ne 0x00c2a358
00c2a214	ldr x27,[sp, #0x18]
00c2a218	cmp x0,x8
00c2a21c	b.ne 0x00c2a224
00c2a220	ldur x27,[x19, #-0x58]
00c2a224	cbz x27,0x00c2a39c
00c2a228	ldur x3,[x19, #-0x50]
00c2a22c	cbz x3,0x00c2a39c
00c2a230	ldur x1,[x29, #-0x20]
00c2a234	mov x0,x26
00c2a238	ldr x2,[sp, #0x30]
00c2a23c	mov x4,x27
00c2a240	mov x5,x19
00c2a244	mov x6,xzr
00c2a248	bl 0x00c2a7a0
00c2a24c	mov w8,w28
00c2a250	mov w14,#0x3f
00c2a254	mov x15,#-0x1
00c2a258	tbnz w0,#0x0,0x00c2a338
00c2a25c	mov x10,xzr
00c2a260	mov x9,xzr
00c2a264	mov x11,x23
00c2a268	ldrb w12,[x11], #0x1
00c2a26c	and x13,x12,#0x7f
00c2a270	lsl x13,x13,x10
00c2a274	add x10,x10,#0x7
00c2a278	orr x9,x13,x9
00c2a27c	tbnz w12,#0x7,0x00c2a268
00c2a280	cmp x10,#0x40
00c2a284	lsl x10,x15,x10
00c2a288	ccmp w12,w14,#0x0,cc
00c2a28c	csel x10,x10,xzr,hi
00c2a290	orr x9,x9,x10
00c2a294	cbz x9,0x00c2a2ac
00c2a298	add x24,x23,x9
00c2a29c	mov w28,w8
00c2a2a0	b 0x00c2a0e0
00c2a2a4	tbz w21,#0x0,0x00c29ed8
00c2a2a8	b 0x00c2a2ec
00c2a2ac	and w9,w21,#0x2
00c2a2b0	and w8,w8,w9, LSR #0x1
00c2a2b4	tbz w8,#0x0,0x00c2a2ec
00c2a2b8	ldr x22,[sp, #0x20]
00c2a2bc	mov x24,xzr
00c2a2c0	mov x26,xzr
00c2a2c4	mov x27,xzr
00c2a2c8	tbz w21,#0x0,0x00c2a33c
00c2a2cc	cmp x22,x25
00c2a2d0	b.ne 0x00c2a344
00c2a2d4	ldp x8,x9,[sp, #0x8]
00c2a2d8	mov w0,#0x6
00c2a2dc	stur w26,[x19, #-0x24]
00c2a2e0	stp x24,x9,[x19, #-0x20]
00c2a2e4	stp x8,x27,[x19, #-0x10]
00c2a2e8	b 0x00c2a2f0
00c2a2ec	mov w0,#0x8
00c2a2f0	ldp x20,x19,[sp, #0xb0]
00c2a2f4	ldp x22,x21,[sp, #0xa0]
00c2a2f8	ldp x24,x23,[sp, #0x90]
00c2a2fc	ldp x26,x25,[sp, #0x80]
00c2a300	ldp x28,x27,[sp, #0x70]
00c2a304	ldp x29,x30,[sp, #0x60]
00c2a308	add sp,sp,#0xc0
00c2a30c	autiasp
00c2a310	ret
00c2a314	mov x0,x19
00c2a318	bl 0x00c292fc
00c2a31c	mov x8,#0x2b01
00c2a320	movk x8,#0x432b, LSL #16
00c2a324	movk x8,#0x4e47, LSL #32
00c2a328	movk x8,#0x434c, LSL #48
00c2a32c	cmp x0,x8
00c2a330	b.ne 0x00c2a360
00c2a334	ldur x27,[x19, #-0x58]
00c2a338	tbnz w21,#0x0,0x00c2a2cc
00c2a33c	ldr x22,[sp, #0x8]
00c2a340	b 0x00c29edc
00c2a344	mov w0,#0x6
00c2a348	b 0x00c2a2f0
00c2a34c	ldur x27,[x29, #-0x8]
00c2a350	tbz w21,#0x0,0x00c2a33c
00c2a354	b 0x00c2a2cc
00c2a358	cmp x0,x8
00c2a35c	b.eq 0x00c2a334
00c2a360	ldr x27,[sp, #0x18]
00c2a364	tbz w21,#0x0,0x00c2a33c
00c2a368	b 0x00c2a2cc
00c2a36c	mov x0,x19
00c2a370	bl 0x00c2ffe0
00c2a374	ldr x8,[sp, #0x20]
00c2a378	cmp x8,x25
00c2a37c	b.ne 0x00c2a388
00c2a380	ldur x0,[x19, #-0x38]
00c2a384	bl 0x00c0d774
00c2a388	bl 0x00c2fff0
00c2a38c	cmp x22,x25
00c2a390	mov x1,x19
00c2a394	cset w0,eq
00c2a398	bl 0x00c2a5c8
00c2a39c	mov x0,x19
00c2a3a0	bl 0x00c2ffe0
00c2a3a4	ldur x0,[x19, #-0x38]
00c2a3a8	bl 0x00c0d774
