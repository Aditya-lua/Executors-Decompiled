; FUN_00a4a084 @ 00a4a084
00a4a084	sub sp,sp,#0x140
00a4a088	stp x28,x27,[sp, #0xe0]
00a4a08c	stp x26,x25,[sp, #0xf0]
00a4a090	stp x24,x23,[sp, #0x100]
00a4a094	stp x22,x21,[sp, #0x110]
00a4a098	stp x20,x19,[sp, #0x120]
00a4a09c	stp x29,x30,[sp, #0x130]
00a4a0a0	str w2,[sp, #0xc]
00a4a0a4	mov x20,x0
00a4a0a8	ldr x8,[x20, #0x40]!
00a4a0ac	ldp x11,x12,[x0, #0x48]
00a4a0b0	ldp x9,x10,[x0]
00a4a0b4	ldp x13,x14,[x0, #0x10]
00a4a0b8	orr x23,xzr,#0x1fffffffffffffe
00a4a0bc	ldp x15,x16,[x0, #0x58]
00a4a0c0	add x11,x11,x23
00a4a0c4	add x12,x12,x23
00a4a0c8	add x8,x8,x23
00a4a0cc	sub x10,x11,x10
00a4a0d0	sub x11,x12,x13
00a4a0d4	ldp x12,x13,[x0, #0x68]
00a4a0d8	sub x8,x8,x9
00a4a0dc	ldp x9,x17,[x0, #0x20]
00a4a0e0	orr x24,xzr,#0x1fffffffffffffc
00a4a0e4	add x15,x15,x23
00a4a0e8	sub x14,x15,x14
00a4a0ec	ldr x15,[x0, #0x78]
00a4a0f0	add x16,x16,x24
00a4a0f4	add x12,x12,x23
00a4a0f8	sub x9,x16,x9
00a4a0fc	sub x12,x12,x17
00a4a100	ldp x16,x17,[x0, #0x30]
00a4a104	add x15,x15,x23
00a4a108	add x13,x13,x23
00a4a10c	mov x22,x1
00a4a110	sub x15,x15,x17
00a4a114	sub x13,x13,x16
00a4a118	lsr x16,x15,#0x38
00a4a11c	and x17,x14,#0xffffffffffffff
00a4a120	and x15,x15,#0xffffffffffffff
00a4a124	add x17,x17,x11, LSR #0x38
00a4a128	and x11,x11,#0xffffffffffffff
00a4a12c	add x15,x15,x13, LSR #0x38
00a4a130	and x13,x13,#0xffffffffffffff
00a4a134	add x11,x11,x10, LSR #0x38
00a4a138	and x10,x10,#0xffffffffffffff
00a4a13c	add x9,x16,x9
00a4a140	add x13,x13,x12, LSR #0x38
00a4a144	and x12,x12,#0xffffffffffffff
00a4a148	add x10,x10,x8, LSR #0x38
00a4a14c	and x8,x8,#0xffffffffffffff
00a4a150	add x12,x12,x9, LSR #0x38
00a4a154	and x9,x9,#0xffffffffffffff
00a4a158	mov x21,x0
00a4a15c	add x8,x16,x8
00a4a160	add x9,x9,x14, LSR #0x38
00a4a164	add x1,x1,#0x40
00a4a168	add x0,sp,#0x90
00a4a16c	add x2,sp,#0x50
00a4a170	add x29,sp,#0x130
00a4a174	stp x13,x15,[sp, #0x80]
00a4a178	stp x9,x12,[sp, #0x70]
00a4a17c	stp x11,x17,[sp, #0x60]
00a4a180	stp x8,x10,[sp, #0x50]
00a4a184	bl 0x00c3a4b0
00a4a188	ldp x9,x10,[x21]
00a4a18c	ldp x11,x12,[x21, #0x48]
00a4a190	ldp x13,x14,[x21, #0x10]
00a4a194	ldp x15,x16,[x21, #0x58]
00a4a198	ldr x8,[x20]
00a4a19c	add x10,x11,x10
00a4a1a0	add x11,x12,x13
00a4a1a4	ldp x12,x13,[x21, #0x30]
00a4a1a8	add x14,x15,x14
00a4a1ac	ldr x15,[x21, #0x78]
00a4a1b0	ldp x17,x18,[x21, #0x20]
00a4a1b4	add x8,x8,x9
00a4a1b8	ldp x9,x0,[x21, #0x68]
00a4a1bc	add x13,x15,x13
00a4a1c0	add x16,x16,x17
00a4a1c4	lsr x15,x13,#0x38
00a4a1c8	add x12,x0,x12
00a4a1cc	and x17,x14,#0xffffffffffffff
00a4a1d0	and x13,x13,#0xffffffffffffff
00a4a1d4	add x9,x9,x18
00a4a1d8	add x17,x17,x11, LSR #0x38
00a4a1dc	and x11,x11,#0xffffffffffffff
00a4a1e0	add x13,x13,x12, LSR #0x38
00a4a1e4	and x12,x12,#0xffffffffffffff
00a4a1e8	add x11,x11,x10, LSR #0x38
00a4a1ec	and x10,x10,#0xffffffffffffff
00a4a1f0	add x16,x15,x16
00a4a1f4	add x12,x12,x9, LSR #0x38
00a4a1f8	and x9,x9,#0xffffffffffffff
00a4a1fc	add x10,x10,x8, LSR #0x38
00a4a200	and x8,x8,#0xffffffffffffff
00a4a204	stp x12,x13,[sp, #0x80]
00a4a208	add x9,x9,x16, LSR #0x38
00a4a20c	and x12,x16,#0xffffffffffffff
00a4a210	add x8,x15,x8
00a4a214	str x9,[sp, #0x78]
00a4a218	add x9,x12,x14, LSR #0x38
00a4a21c	add x2,sp,#0x50
00a4a220	mov x0,x20
00a4a224	mov x1,x22
00a4a228	stp x17,x9,[sp, #0x68]
00a4a22c	stp x10,x11,[sp, #0x58]
00a4a230	str x8,[sp, #0x50]
00a4a234	bl 0x00c3a4b0
00a4a238	add x1,x22,#0x80
00a4a23c	add x2,x21,#0xc0
00a4a240	mov x0,x21
00a4a244	str x2,[sp]
00a4a248	bl 0x00c3a4b0
00a4a24c	ldp x10,x12,[sp, #0x90]
00a4a250	ldr x8,[x20]
00a4a254	ldp x11,x9,[x21, #0x48]
00a4a258	ldp x1,x3,[sp, #0xb0]
00a4a25c	ldp x14,x13,[x21, #0x58]
00a4a260	ldp x4,x5,[sp, #0xc0]
00a4a264	ldp x18,x17,[x21, #0x68]
00a4a268	ldr x2,[x21, #0x78]
00a4a26c	ldp x15,x16,[sp, #0xa0]
00a4a270	add x6,x8,x10
00a4a274	add x7,x11,x12
00a4a278	add x27,x13,x1
00a4a27c	add x30,x17,x4
00a4a280	add x22,x2,x5
00a4a284	sub x10,x23,x10
00a4a288	sub x1,x24,x1
00a4a28c	sub x5,x23,x5
00a4a290	add x28,x18,x3
00a4a294	sub x12,x23,x12
00a4a298	sub x3,x23,x3
00a4a29c	sub x4,x23,x4
00a4a2a0	lsr x19,x22,#0x38
00a4a2a4	and x22,x22,#0xffffffffffffff
00a4a2a8	add x8,x10,x8
00a4a2ac	and x10,x30,#0xffffffffffffff
00a4a2b0	add x13,x1,x13
00a4a2b4	and x1,x7,#0xffffffffffffff
00a4a2b8	add x2,x5,x2
00a4a2bc	add x25,x9,x15
00a4a2c0	add x26,x14,x16
00a4a2c4	sub x15,x23,x15
00a4a2c8	sub x16,x23,x16
00a4a2cc	add x11,x12,x11
00a4a2d0	and x12,x28,#0xffffffffffffff
00a4a2d4	add x18,x3,x18
00a4a2d8	and x3,x6,#0xffffffffffffff
00a4a2dc	add x17,x4,x17
00a4a2e0	add x4,x19,x27
00a4a2e4	add x5,x22,x30, LSR #0x38
00a4a2e8	add x10,x10,x28, LSR #0x38
00a4a2ec	add x1,x1,x6, LSR #0x38
00a4a2f0	lsr x6,x2,#0x38
00a4a2f4	add x9,x15,x9
00a4a2f8	and x15,x26,#0xffffffffffffff
00a4a2fc	add x14,x16,x14
00a4a300	and x16,x25,#0xffffffffffffff
00a4a304	add x3,x19,x3
00a4a308	and x19,x18,#0xffffffffffffff
00a4a30c	stp x10,x5,[sp, #0x40]
00a4a310	add x10,x12,x4, LSR #0x38
00a4a314	and x12,x4,#0xffffffffffffff
00a4a318	add x13,x6,x13
00a4a31c	add x15,x15,x25, LSR #0x38
00a4a320	add x16,x16,x7, LSR #0x38
00a4a324	and x2,x2,#0xffffffffffffff
00a4a328	and x7,x17,#0xffffffffffffff
00a4a32c	and x22,x14,#0xffffffffffffff
00a4a330	and x25,x9,#0xffffffffffffff
00a4a334	and x27,x11,#0xffffffffffffff
00a4a338	and x28,x8,#0xffffffffffffff
00a4a33c	str x10,[sp, #0x38]
00a4a340	add x10,x12,x26, LSR #0x38
00a4a344	add x12,x19,x13, LSR #0x38
00a4a348	and x13,x13,#0xffffffffffffff
00a4a34c	add x17,x2,x17, LSR #0x38
00a4a350	add x18,x7,x18, LSR #0x38
00a4a354	add x9,x22,x9, LSR #0x38
00a4a358	add x11,x25,x11, LSR #0x38
00a4a35c	add x8,x27,x8, LSR #0x38
00a4a360	add x2,x6,x28
00a4a364	stp x15,x10,[sp, #0x28]
00a4a368	add x10,x13,x14, LSR #0x38
00a4a36c	mov x0,x21
00a4a370	stp x18,x17,[sp, #0x80]
00a4a374	stp x1,x16,[sp, #0x18]
00a4a378	str x3,[sp, #0x10]
00a4a37c	stp x10,x12,[sp, #0x70]
00a4a380	stp x11,x9,[sp, #0x60]
00a4a384	stp x2,x8,[sp, #0x50]
00a4a388	ldr x8,[x0, #0x80]!
00a4a38c	ldp x9,x10,[x21]
00a4a390	ldp x11,x12,[x21, #0x88]
00a4a394	ldp x13,x14,[x21, #0x10]
00a4a398	ldp x15,x16,[x21, #0x98]
00a4a39c	ldp x17,x18,[x21, #0x20]
00a4a3a0	ldp x1,x2,[x21, #0xa8]
00a4a3a4	ldr x3,[x21, #0xb8]
00a4a3a8	ldp x4,x5,[x21, #0x30]
00a4a3ac	add x7,x10,x11
00a4a3b0	add x19,x13,x12
00a4a3b4	add x25,x17,x16
00a4a3b8	add x26,x18,x1
00a4a3bc	add x28,x5,x3
00a4a3c0	add x11,x11,x23
00a4a3c4	add x12,x12,x23
00a4a3c8	add x16,x16,x24
00a4a3cc	add x1,x1,x23
00a4a3d0	add x3,x3,x23
00a4a3d4	add x6,x9,x8
00a4a3d8	add x27,x4,x2
00a4a3dc	sub x10,x11,x10
00a4a3e0	and x11,x19,#0xffffffffffffff
00a4a3e4	sub x12,x12,x13
00a4a3e8	and x13,x7,#0xffffffffffffff
00a4a3ec	sub x16,x16,x17
00a4a3f0	sub x17,x1,x18
00a4a3f4	sub x1,x3,x5
00a4a3f8	add x22,x14,x15
00a4a3fc	add x8,x8,x23
00a4a400	add x15,x15,x23
00a4a404	add x2,x2,x23
00a4a408	lsr x23,x28,#0x38
00a4a40c	and x28,x28,#0xffffffffffffff
00a4a410	and x30,x27,#0xffffffffffffff
00a4a414	add x11,x11,x7, LSR #0x38
00a4a418	add x13,x13,x6, LSR #0x38
00a4a41c	lsr x5,x1,#0x38
00a4a420	and x24,x26,#0xffffffffffffff
00a4a424	sub x8,x8,x9
00a4a428	and x9,x22,#0xffffffffffffff
00a4a42c	sub x18,x2,x4
00a4a430	add x2,x23,x25
00a4a434	add x3,x28,x27, LSR #0x38
00a4a438	add x4,x30,x26, LSR #0x38
00a4a43c	and x1,x1,#0xffffffffffffff
00a4a440	and x7,x17,#0xffffffffffffff
00a4a444	stp x13,x11,[x21, #0x48]
00a4a448	add x11,x5,x16
00a4a44c	sub x14,x15,x14
00a4a450	and x15,x6,#0xffffffffffffff
00a4a454	add x9,x9,x19, LSR #0x38
00a4a458	stp x4,x3,[x21, #0x70]
00a4a45c	add x3,x24,x2, LSR #0x38
00a4a460	and x2,x2,#0xffffffffffffff
00a4a464	add x13,x1,x18, LSR #0x38
00a4a468	add x1,x7,x11, LSR #0x38
00a4a46c	and x11,x11,#0xffffffffffffff
00a4a470	add x15,x23,x15
00a4a474	and x6,x18,#0xffffffffffffff
00a4a478	and x19,x14,#0xffffffffffffff
00a4a47c	and x23,x12,#0xffffffffffffff
00a4a480	and x25,x10,#0xffffffffffffff
00a4a484	and x26,x8,#0xffffffffffffff
00a4a488	add x18,x2,x22, LSR #0x38
00a4a48c	str x9,[x21, #0x58]
00a4a490	add x9,x11,x14, LSR #0x38
00a4a494	add x16,x6,x17, LSR #0x38
00a4a498	add x12,x19,x12, LSR #0x38
00a4a49c	add x10,x23,x10, LSR #0x38
00a4a4a0	add x8,x25,x8, LSR #0x38
00a4a4a4	add x17,x5,x26
00a4a4a8	stp x18,x3,[x21, #0x60]
00a4a4ac	str x15,[x20]
00a4a4b0	stp x9,x1,[sp, #0xb0]
00a4a4b4	add x1,sp,#0x90
00a4a4b8	mov x2,x20
00a4a4bc	stp x16,x13,[sp, #0xc0]
00a4a4c0	stp x10,x12,[sp, #0xa0]
00a4a4c4	stp x17,x8,[sp, #0x90]
00a4a4c8	bl 0x00c3a4b0
00a4a4cc	add x2,sp,#0x50
00a4a4d0	mov x0,x21
00a4a4d4	mov x1,x20
00a4a4d8	bl 0x00c3a4b0
00a4a4dc	add x1,sp,#0x90
00a4a4e0	add x2,sp,#0x10
00a4a4e4	mov x0,x20
00a4a4e8	bl 0x00c3a4b0
00a4a4ec	ldr w8,[sp, #0xc]
00a4a4f0	cbnz w8,0x00a4a504
00a4a4f4	ldr x0,[sp]
00a4a4f8	add x1,sp,#0x50
00a4a4fc	add x2,sp,#0x10
00a4a500	bl 0x00c3a4b0
00a4a504	ldp x29,x30,[sp, #0x130]
00a4a508	ldp x20,x19,[sp, #0x120]
00a4a50c	ldp x22,x21,[sp, #0x110]
00a4a510	ldp x24,x23,[sp, #0x100]
00a4a514	ldp x26,x25,[sp, #0xf0]
00a4a518	ldp x28,x27,[sp, #0xe0]
00a4a51c	add sp,sp,#0x140
00a4a520	ret
