; FUN_0089a06c @ 0089a06c
0089a06c	sub sp,sp,#0x140
0089a070	stp x29,x30,[sp, #0xe0]
0089a074	stp x28,x27,[sp, #0xf0]
0089a078	stp x26,x25,[sp, #0x100]
0089a07c	stp x24,x23,[sp, #0x110]
0089a080	stp x22,x21,[sp, #0x120]
0089a084	stp x20,x19,[sp, #0x130]
0089a088	add x29,sp,#0xe0
0089a08c	mrs x8,tpidr_el0
0089a090	mov x20,x1
0089a094	mov x19,x0
0089a098	str x8,[sp, #0x10]
0089a09c	ldr x8,[x8, #0x28]
0089a0a0	stur x8,[x29, #-0x10]
0089a0a4	ldr x1,[x1, #0x28]
0089a0a8	ldr w8,[x0, #0x64c]
0089a0ac	ldrb w21,[x20, #0x44]
0089a0b0	sturb w2,[x29, #-0x14]
0089a0b4	str w8,[sp, #0xc]
0089a0b8	cbz x1,0x0089a104
0089a0bc	mov x0,x19
0089a0c0	bl 0x0088df20
0089a0c4	ldr x1,[x20, #0x28]
0089a0c8	cmp w0,#0x0
0089a0cc	ldr w22,[x19, #0x64c]
0089a0d0	ccmp x1,#0x0,#0x4,lt
0089a0d4	cinc w8,w22,ne
0089a0d8	cset w2,ne
0089a0dc	cmp w8,#0x100
0089a0e0	b.cs 0x0089a4b4
0089a0e4	ldr w9,[x19, #0x650]
0089a0e8	str w8,[x19, #0x64c]
0089a0ec	cmp w9,w8
0089a0f0	csel w8,w9,w8,hi
0089a0f4	str w8,[x19, #0x650]
0089a0f8	tbnz w0,#0x1f,0x0089a11c
0089a0fc	mov w22,w0
0089a100	b 0x0089a12c
0089a104	ldr x0,[x19]
0089a108	mov w1,#0x5a
0089a10c	mov w3,#0xff
0089a110	mov w4,w21
0089a114	bl 0x00875b54
0089a118	b 0x0089a144
0089a11c	mov x0,x19
0089a120	mov w2,w22
0089a124	mov w3,wzr
0089a128	bl 0x0088d1d0
0089a12c	ldr x0,[x19]
0089a130	ldurb w2,[x29, #-0x14]
0089a134	mov w1,#0x5a
0089a138	mov w3,w22
0089a13c	mov w4,w21
0089a140	bl 0x00875b54
0089a144	ldr x0,[x19]
0089a148	bl 0x00875ec8
0089a14c	mov x28,x0
0089a150	ldr x0,[x19]
0089a154	mov w1,#0xbeef
0089a158	movk w1,#0xdead, LSL #16
0089a15c	bl 0x00875d18
0089a160	movi v0.2D,#0x0
0089a164	ldr x22,[x19]
0089a168	sub x8,x29,#0x50
0089a16c	sturh wzr,[x29, #-0x4c]
0089a170	stur q0,[x8, #0x8]
0089a174	stur q0,[x8, #0x18]
0089a178	stur q0,[x8, #0x28]
0089a17c	mov x0,x20
0089a180	bl 0x008507d0
0089a184	mov x23,x0
0089a188	bl 0x00c2ff50
0089a18c	mov x2,x0
0089a190	mov x0,x22
0089a194	mov x1,x23
0089a198	bl 0x00875070
0089a19c	mov w22,w0
0089a1a0	stur w0,[x29, #-0x50]
0089a1a4	mov x0,x20
0089a1a8	bl 0x00850840
0089a1ac	stp x0,x1,[sp, #0x50]
0089a1b0	tbnz w22,#0x1f,0x0089a41c
0089a1b4	ldr w8,[x19, #0x64c]
0089a1b8	add w9,w8,#0x1
0089a1bc	cmp w9,#0x100
0089a1c0	b.cs 0x0089a440
0089a1c4	ldr w10,[x19, #0x650]
0089a1c8	str w9,[x19, #0x64c]
0089a1cc	sturb w8,[x29, #-0x54]
0089a1d0	cmp w10,w9
0089a1d4	sturb wzr,[x29, #-0x58]
0089a1d8	csel w9,w10,w9,hi
0089a1dc	str w9,[x19, #0x650]
0089a1e0	ldr x9,[x20, #0x38]
0089a1e4	cbz x9,0x0089a250
0089a1e8	mov w8,#0x58
0089a1ec	ldr x22,[x20, #0x30]
0089a1f0	sub x24,x29,#0x50
0089a1f4	madd x23,x9,x8,x22
0089a1f8	sub x25,x29,#0x54
0089a1fc	sub x26,x29,#0x14
0089a200	sub x27,x29,#0x58
0089a204	adrp x21,0xc4b000
0089a208	add x21,x21,#0x748
0089a20c	stp x19,x24,[sp, #0x50]
0089a210	stp x19,x25,[sp, #0x60]
0089a214	stp x26,x24,[sp, #0x70]
0089a218	str x27,[sp, #0x80]
0089a21c	ldrsw x8,[x22], #0x8
0089a220	ldr x8,[x21, x8, LSL #0x3]
0089a224	add x0,sp,#0x50
0089a228	mov x1,x22
0089a22c	blr x8
0089a230	add x22,x22,#0x50
0089a234	cmp x22,x23
0089a238	b.ne 0x0089a20c
0089a23c	ldurb w8,[x29, #-0x58]
0089a240	tbz w8,#0x0,0x0089a250
0089a244	ldur x27,[x29, #-0x28]
0089a248	sub x10,x29,#0x50
0089a24c	b 0x0089a320
0089a250	ldr x22,[x19]
0089a254	ldr x0,[x19, #0x638]
0089a258	adrp x1,0x2c0000
0089a25c	add x1,x1,#0xe42
0089a260	bl 0x00853198
0089a264	mov x23,x0
0089a268	bl 0x00c2ff50
0089a26c	mov x2,x0
0089a270	mov x0,x22
0089a274	mov x1,x23
0089a278	bl 0x00875070
0089a27c	mov w22,w0
0089a280	tbnz w0,#0x1f,0x0089a490
0089a284	ldp x27,x8,[x29, #-0x28]
0089a288	cmp x27,x8
0089a28c	b.cs 0x0089a298
0089a290	str w22,[x27], #0x4
0089a294	b 0x0089a318
0089a298	ldur x23,[x29, #-0x30]
0089a29c	sub x25,x27,x23
0089a2a0	asr x26,x25,#0x2
0089a2a4	add x9,x26,#0x1
0089a2a8	lsr x10,x9,#0x3e
0089a2ac	cbnz x10,0x0089a4dc
0089a2b0	sub x24,x8,x23
0089a2b4	orr x10,xzr,#0x7ffffffffffffffc
0089a2b8	asr x8,x24,#0x1
0089a2bc	cmp x8,x9
0089a2c0	csel x8,x8,x9,hi
0089a2c4	cmp x24,x10
0089a2c8	mov x9,#0x3fffffffffffffff
0089a2cc	csel x21,x8,x9,cc
0089a2d0	lsr x8,x21,#0x3e
0089a2d4	cbnz x8,0x0089a4f4
0089a2d8	lsl x0,x21,#0x2
0089a2dc	bl 0x00c2fed0
0089a2e0	add x27,x0,x25
0089a2e4	add x21,x0,x21, LSL #0x2
0089a2e8	mov x1,x23
0089a2ec	sub x26,x27,x26, LSL #0x2
0089a2f0	mov x2,x25
0089a2f4	str w22,[x27], #0x4
0089a2f8	mov x0,x26
0089a2fc	bl 0x00c2ffd0
0089a300	stp x26,x27,[x29, #-0x30]
0089a304	stur x21,[x29, #-0x20]
0089a308	cbz x23,0x0089a318
0089a30c	mov x0,x23
0089a310	mov x1,x24
0089a314	bl 0x00c2fe80
0089a318	sub x10,x29,#0x50
0089a31c	stur x27,[x29, #-0x28]
0089a320	ldur w8,[x29, #-0x50]
0089a324	ldurh w9,[x29, #-0x4c]
0089a328	ldur q0,[x10, #0x8]
0089a32c	ldr x0,[x19]
0089a330	str w8,[sp, #0x18]
0089a334	sub x8,x29,#0x50
0089a338	strh w9,[sp, #0x1c]
0089a33c	ldp x9,x10,[x29, #-0x38]
0089a340	stp xzr,xzr,[x8, #0x10]
0089a344	stur xzr,[x8, #0x8]
0089a348	ldur x8,[x29, #-0x20]
0089a34c	stur q0,[sp, #0x20]
0089a350	stp x9,x10,[sp, #0x30]
0089a354	stp x27,x8,[sp, #0x40]
0089a358	stp xzr,xzr,[x29, #-0x28]
0089a35c	stur xzr,[x29, #-0x30]
0089a360	add x1,sp,#0x18
0089a364	bl 0x00875a20
0089a368	mov w22,w0
0089a36c	ldr x0,[sp, #0x38]
0089a370	cbz x0,0x0089a384
0089a374	ldr x8,[sp, #0x48]
0089a378	str x0,[sp, #0x40]
0089a37c	sub x1,x8,x0
0089a380	bl 0x00c2fe80
0089a384	ldr x0,[sp, #0x20]
0089a388	cbz x0,0x0089a39c
0089a38c	ldr x8,[sp, #0x30]
0089a390	str x0,[sp, #0x28]
0089a394	sub x1,x8,x0
0089a398	bl 0x00c2fe80
0089a39c	tbnz w22,#0x1f,0x0089a46c
0089a3a0	ldr x0,[x19]
0089a3a4	mov x1,x28
0089a3a8	mov w2,w22
0089a3ac	bl 0x00876080
0089a3b0	ldur x0,[x29, #-0x30]
0089a3b4	cbz x0,0x0089a3c8
0089a3b8	ldur x8,[x29, #-0x20]
0089a3bc	stur x0,[x29, #-0x28]
0089a3c0	sub x1,x8,x0
0089a3c4	bl 0x00c2fe80
0089a3c8	ldur x0,[x29, #-0x48]
0089a3cc	cbz x0,0x0089a3e0
0089a3d0	ldur x8,[x29, #-0x38]
0089a3d4	stur x0,[x29, #-0x40]
0089a3d8	sub x1,x8,x0
0089a3dc	bl 0x00c2fe80
0089a3e0	ldr w8,[sp, #0xc]
0089a3e4	str w8,[x19, #0x64c]
0089a3e8	ldr x8,[sp, #0x10]
0089a3ec	ldr x8,[x8, #0x28]
0089a3f0	ldur x9,[x29, #-0x10]
0089a3f4	cmp x8,x9
0089a3f8	b.ne 0x0089a580
0089a3fc	ldp x20,x19,[sp, #0x130]
0089a400	ldp x22,x21,[sp, #0x120]
0089a404	ldp x24,x23,[sp, #0x110]
0089a408	ldp x26,x25,[sp, #0x100]
0089a40c	ldp x28,x27,[sp, #0xf0]
0089a410	ldp x29,x30,[sp, #0xe0]
0089a414	add sp,sp,#0x140
0089a418	ret
0089a41c	ldr x8,[sp, #0x10]
0089a420	ldr x8,[x8, #0x28]
0089a424	ldur x9,[x29, #-0x10]
0089a428	cmp x8,x9
0089a42c	b.ne 0x0089a580
0089a430	adrp x1,0x2a7000
0089a434	add x1,x1,#0x164
0089a438	add x0,sp,#0x50
0089a43c	bl 0x0087fcd8
0089a440	ldr x8,[sp, #0x10]
0089a444	ldr x8,[x8, #0x28]
0089a448	ldur x9,[x29, #-0x10]
0089a44c	cmp x8,x9
0089a450	b.ne 0x0089a580
0089a454	adrp x1,0x2d0000
0089a458	add x1,x1,#0xc00
0089a45c	add x0,x20,#0xc
0089a460	mov w2,#0x1
0089a464	mov w3,#0xff
0089a468	bl 0x0087fcd8
0089a46c	ldr x8,[sp, #0x10]
0089a470	ldr x8,[x8, #0x28]
0089a474	ldur x9,[x29, #-0x10]
0089a478	cmp x8,x9
0089a47c	b.ne 0x0089a580
0089a480	adrp x1,0x2a7000
0089a484	add x1,x1,#0x164
0089a488	add x0,x20,#0xc
0089a48c	bl 0x0087fcd8
0089a490	ldr x8,[sp, #0x10]
0089a494	ldr x8,[x8, #0x28]
0089a498	ldur x9,[x29, #-0x10]
0089a49c	cmp x8,x9
0089a4a0	b.ne 0x0089a580
0089a4a4	adrp x1,0x2a7000
0089a4a8	add x1,x1,#0x164
0089a4ac	add x0,x20,#0xc
0089a4b0	bl 0x0087fcd8
0089a4b4	ldr x8,[sp, #0x10]
0089a4b8	ldr x8,[x8, #0x28]
0089a4bc	ldur x9,[x29, #-0x10]
0089a4c0	cmp x8,x9
0089a4c4	b.ne 0x0089a580
0089a4c8	adrp x1,0x2d0000
0089a4cc	add x1,x1,#0xc00
0089a4d0	add x0,x20,#0xc
0089a4d4	mov w3,#0xff
0089a4d8	bl 0x0087fcd8
0089a4dc	ldr x8,[sp, #0x10]
0089a4e0	ldr x8,[x8, #0x28]
0089a4e4	ldur x9,[x29, #-0x10]
0089a4e8	cmp x8,x9
0089a4ec	b.ne 0x0089a580
0089a4f0	bl 0x00879790
0089a4f4	ldr x8,[sp, #0x10]
0089a4f8	ldr x8,[x8, #0x28]
0089a4fc	ldur x9,[x29, #-0x10]
0089a500	cmp x8,x9
0089a504	b.ne 0x0089a580
0089a508	bl 0x007fe1b8
0089a580	bl 0x00c2fec0
