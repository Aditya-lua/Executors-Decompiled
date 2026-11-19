; bn_mul_part_recursive @ 00a09fe0
00a09fe0	sub sp,sp,#0x90
00a09fe4	stp x28,x27,[sp, #0x30]
00a09fe8	stp x26,x25,[sp, #0x40]
00a09fec	stp x24,x23,[sp, #0x50]
00a09ff0	stp x22,x21,[sp, #0x60]
00a09ff4	stp x20,x19,[sp, #0x70]
00a09ff8	mov w22,w5
00a09ffc	mov w23,w4
00a0a000	mov w27,w3
00a0a004	mov x28,x2
00a0a008	mov x25,x1
00a0a00c	cmp w3,#0x7
00a0a010	mov x19,x0
00a0a014	stp x29,x30,[sp, #0x80]
00a0a018	add x29,sp,#0x80
00a0a01c	b.gt 0x00a0a054
00a0a020	add w2,w23,w27
00a0a024	add w4,w22,w27
00a0a028	mov x0,x19
00a0a02c	mov x1,x25
00a0a030	mov x3,x28
00a0a034	ldp x29,x30,[sp, #0x80]
00a0a038	ldp x20,x19,[sp, #0x70]
00a0a03c	ldp x22,x21,[sp, #0x60]
00a0a040	ldp x24,x23,[sp, #0x50]
00a0a044	ldp x26,x25,[sp, #0x40]
00a0a048	ldp x28,x27,[sp, #0x30]
00a0a04c	add sp,sp,#0x90
00a0a050	b 0x00a09e78
00a0a054	sxtw x8,w27
00a0a058	lsl x24,x8,#0x3
00a0a05c	sub w26,w27,w23
00a0a060	sbfiz x9,x27,#0x1,#0x20
00a0a064	add x1,x25,x24
00a0a068	mov x0,x25
00a0a06c	mov w2,w23
00a0a070	mov w3,w26
00a0a074	mov x21,x6
00a0a078	str x9,[sp, #0x10]
00a0a07c	stp x1,x8,[sp, #0x20]
00a0a080	bl 0x00c38e20
00a0a084	mov w20,w0
00a0a088	add x0,x28,x24
00a0a08c	sub w24,w22,w27
00a0a090	mov x1,x28
00a0a094	mov w2,w22
00a0a098	mov w3,w24
00a0a09c	str x0,[sp, #0x18]
00a0a0a0	bl 0x00c38e20
00a0a0a4	add w8,w20,w20, LSL #0x1
00a0a0a8	add w8,w8,w0
00a0a0ac	add w8,w8,#0x4
00a0a0b0	cmp w8,#0x8
00a0a0b4	b.hi 0x00a0a220
00a0a0b8	adrp x9,0x751000
00a0a0bc	add x9,x9,#0xf14
00a0a0c0	ldrsw x8,[x9, x8, LSL #0x2]
00a0a0c4	add x8,x8,x9
00a0a0c8	br x8
00a0a0cc	ldr x2,[sp, #0x20]
00a0a0d0	mov x0,x21
00a0a0d4	mov x1,x25
00a0a0d8	mov w3,w23
00a0a0dc	mov w4,w26
00a0a0e0	bl 0x00a097e8
00a0a0e4	ldr x8,[sp, #0x28]
00a0a0e8	ldr x2,[sp, #0x18]
00a0a0ec	sub w4,w27,w22
00a0a0f0	mov x1,x28
00a0a0f4	add x0,x21,x8, LSL #0x3
00a0a0f8	mov w3,w22
00a0a0fc	b 0x00a0a130
00a0a100	ldr x1,[sp, #0x20]
00a0a104	sub w4,w23,w27
00a0a108	mov x0,x21
00a0a10c	mov x2,x25
00a0a110	mov w3,w23
00a0a114	bl 0x00a097e8
00a0a118	ldr x8,[sp, #0x28]
00a0a11c	ldr x1,[sp, #0x18]
00a0a120	mov x2,x28
00a0a124	mov w3,w22
00a0a128	add x0,x21,x8, LSL #0x3
00a0a12c	mov w4,w24
00a0a130	bl 0x00a097e8
00a0a134	mov w8,#0x1
00a0a138	str w8,[sp, #0xc]
00a0a13c	cmp w27,#0x8
00a0a140	b.ne 0x00a0a22c
00a0a144	ldr x20,[sp, #0x10]
00a0a148	ldr x27,[sp, #0x28]
00a0a14c	mov x1,x21
00a0a150	lsl x26,x20,#0x3
00a0a154	add x24,x21,x26
00a0a158	add x2,x21,x27, LSL #0x3
00a0a15c	mov x0,x24
00a0a160	bl 0x00c388f0
00a0a164	mov x0,x19
00a0a168	mov x1,x25
00a0a16c	mov x2,x28
00a0a170	mov x28,x20
00a0a174	bl 0x00c388f0
00a0a178	ldp x3,x1,[sp, #0x18]
00a0a17c	add x25,x19,x26
00a0a180	mov x0,x25
00a0a184	mov w2,w23
00a0a188	mov w4,w22
00a0a18c	bl 0x00a09e78
00a0a190	add w8,w28,w23
00a0a194	sub w9,w28,w23
00a0a198	add w8,w8,w22
00a0a19c	sub w9,w9,w22
00a0a1a0	add x0,x19,w8, SXTW  #0x3
00a0a1a4	sbfiz x2,x9,#0x3,#0x20
00a0a1a8	mov w1,wzr
00a0a1ac	bl 0x00c301c0
00a0a1b0	ldr w20,[sp, #0xc]
00a0a1b4	b 0x00a0a334
00a0a1b8	ldr x2,[sp, #0x20]
00a0a1bc	mov x0,x21
00a0a1c0	mov x1,x25
00a0a1c4	mov w3,w23
00a0a1c8	mov w4,w26
00a0a1cc	bl 0x00a097e8
00a0a1d0	ldr x8,[sp, #0x28]
00a0a1d4	ldr x1,[sp, #0x18]
00a0a1d8	mov x2,x28
00a0a1dc	mov w3,w22
00a0a1e0	add x0,x21,x8, LSL #0x3
00a0a1e4	mov w4,w24
00a0a1e8	b 0x00a0a21c
00a0a1ec	ldr x1,[sp, #0x20]
00a0a1f0	sub w4,w23,w27
00a0a1f4	mov x0,x21
00a0a1f8	mov x2,x25
00a0a1fc	mov w3,w23
00a0a200	bl 0x00a097e8
00a0a204	ldr x8,[sp, #0x28]
00a0a208	ldr x2,[sp, #0x18]
00a0a20c	sub w4,w27,w22
00a0a210	mov x1,x28
00a0a214	add x0,x21,x8, LSL #0x3
00a0a218	mov w3,w22
00a0a21c	bl 0x00a097e8
00a0a220	str wzr,[sp, #0xc]
00a0a224	cmp w27,#0x8
00a0a228	b.eq 0x00a0a144
00a0a22c	ldr x8,[sp, #0x28]
00a0a230	ldr x20,[sp, #0x10]
00a0a234	mov x1,x21
00a0a238	mov w3,w27
00a0a23c	add x24,x21,x8, LSL #0x5
00a0a240	add x0,x21,w20, SXTW  #0x3
00a0a244	add x2,x21,x8, LSL #0x3
00a0a248	mov w4,wzr
00a0a24c	mov w5,wzr
00a0a250	mov x6,x24
00a0a254	sxtw x26,w20
00a0a258	str x0,[sp]
00a0a25c	bl 0x00a09a04
00a0a260	mov x0,x19
00a0a264	mov x1,x25
00a0a268	mov x2,x28
00a0a26c	mov w3,w27
00a0a270	mov w4,wzr
00a0a274	mov w5,wzr
00a0a278	mov x6,x24
00a0a27c	bl 0x00a09a04
00a0a280	cmp w23,w22
00a0a284	lsr w28,w27,#0x1
00a0a288	csel w8,w23,w22,gt
00a0a28c	subs w8,w8,w28
00a0a290	b.eq 0x00a0a2e8
00a0a294	cmp w8,#0x1
00a0a298	add x25,x19,x26, LSL #0x3
00a0a29c	b.lt 0x00a0a3ec
00a0a2a0	ldp x2,x1,[sp, #0x18]
00a0a2a4	sub w4,w23,w28
00a0a2a8	sub w5,w22,w28
00a0a2ac	mov x0,x25
00a0a2b0	mov w3,w28
00a0a2b4	mov x6,x24
00a0a2b8	bl 0x00a09fe0
00a0a2bc	ldr x28,[sp, #0x10]
00a0a2c0	mov w1,wzr
00a0a2c4	add w8,w28,w23
00a0a2c8	sub w9,w28,w23
00a0a2cc	add w8,w8,w22
00a0a2d0	sub w9,w9,w22
00a0a2d4	add x0,x19,w8, SXTW  #0x3
00a0a2d8	sbfiz x2,x9,#0x3,#0x20
00a0a2dc	bl 0x00c301c0
00a0a2e0	ldr x27,[sp, #0x28]
00a0a2e4	b 0x00a0a32c
00a0a2e8	ldp x2,x1,[sp, #0x18]
00a0a2ec	add x25,x19,x26, LSL #0x3
00a0a2f0	sub w4,w23,w28
00a0a2f4	sub w5,w22,w28
00a0a2f8	mov x0,x25
00a0a2fc	mov w3,w28
00a0a300	mov x6,x24
00a0a304	bl 0x00a09a04
00a0a308	and w8,w27,#0xfffffffe
00a0a30c	add w9,w20,w8
00a0a310	sub w8,w20,w8
00a0a314	add x0,x19,w9, SXTW  #0x3
00a0a318	sbfiz x2,x8,#0x3,#0x20
00a0a31c	mov w1,wzr
00a0a320	bl 0x00c301c0
00a0a324	ldr x27,[sp, #0x28]
00a0a328	mov x28,x20
00a0a32c	ldr w20,[sp, #0xc]
00a0a330	ldr x24,[sp]
00a0a334	mov x0,x21
00a0a338	mov x1,x19
00a0a33c	mov x2,x25
00a0a340	mov w3,w28
00a0a344	bl 0x00c388b0
00a0a348	mov x22,x0
00a0a34c	mov x0,x24
00a0a350	cbz w20,0x00a0a36c
00a0a354	mov x1,x21
00a0a358	mov x2,x24
00a0a35c	mov w3,w28
00a0a360	bl 0x00c38940
00a0a364	sub w20,w22,w0
00a0a368	b 0x00a0a380
00a0a36c	mov x1,x24
00a0a370	mov x2,x21
00a0a374	mov w3,w28
00a0a378	bl 0x00c388b0
00a0a37c	add w20,w0,w22
00a0a380	add x0,x19,x27, LSL #0x3
00a0a384	mov x1,x0
00a0a388	mov x2,x24
00a0a38c	mov w3,w28
00a0a390	bl 0x00c388b0
00a0a394	adds w9,w20,w0
00a0a398	b.eq 0x00a0a3cc
00a0a39c	add x8,x27,x27, LSL #0x1
00a0a3a0	lsl x10,x8,#0x3
00a0a3a4	ldr x11,[x19, x10#0x0]
00a0a3a8	adds x9,x11,w9, SXTW 
00a0a3ac	str x9,[x19, x10#0x0]
00a0a3b0	b.cc 0x00a0a3cc
00a0a3b4	add x8,x19,x8, LSL #0x3
00a0a3b8	add x8,x8,#0x8
00a0a3bc	ldr x9,[x8]
00a0a3c0	adds x9,x9,#0x1
00a0a3c4	str x9,[x8], #0x8
00a0a3c8	b.eq 0x00a0a3bc
00a0a3cc	ldp x29,x30,[sp, #0x80]
00a0a3d0	ldp x20,x19,[sp, #0x70]
00a0a3d4	ldp x22,x21,[sp, #0x60]
00a0a3d8	ldp x24,x23,[sp, #0x50]
00a0a3dc	ldp x26,x25,[sp, #0x40]
00a0a3e0	ldp x28,x27,[sp, #0x30]
00a0a3e4	add sp,sp,#0x90
00a0a3e8	ret
00a0a3ec	lsl x2,x26,#0x3
00a0a3f0	mov x0,x25
00a0a3f4	mov w1,wzr
00a0a3f8	bl 0x00c301c0
00a0a3fc	cmp w23,#0xf
00a0a400	b.gt 0x00a0a430
00a0a404	ldr x27,[sp, #0x28]
00a0a408	mov x6,x24
00a0a40c	ldr x24,[sp]
00a0a410	cmp w22,#0x10
00a0a414	b.ge 0x00a0a43c
00a0a418	ldp x3,x1,[sp, #0x18]
00a0a41c	mov x0,x25
00a0a420	mov w2,w23
00a0a424	mov w4,w22
00a0a428	bl 0x00a09e78
00a0a42c	b 0x00a0a49c
00a0a430	ldr x27,[sp, #0x28]
00a0a434	mov x6,x24
00a0a438	ldr x24,[sp]
00a0a43c	cmp w28,#0x0
00a0a440	cinc w8,w28,lt
00a0a444	asr w28,w8,#0x1
00a0a448	cmp w28,w23
00a0a44c	b.lt 0x00a0a484
00a0a450	cmp w28,w22
00a0a454	b.lt 0x00a0a484
00a0a458	cmp w28,w23
00a0a45c	b.eq 0x00a0a468
00a0a460	cmp w28,w22
00a0a464	b.ne 0x00a0a43c
00a0a468	ldp x2,x1,[sp, #0x18]
00a0a46c	sub w4,w23,w28
00a0a470	sub w5,w22,w28
00a0a474	mov x0,x25
00a0a478	mov w3,w28
00a0a47c	bl 0x00a09a04
00a0a480	b 0x00a0a49c
00a0a484	ldp x2,x1,[sp, #0x18]
00a0a488	sub w4,w23,w28
00a0a48c	sub w5,w22,w28
00a0a490	mov x0,x25
00a0a494	mov w3,w28
00a0a498	bl 0x00a09fe0
00a0a49c	ldr x28,[sp, #0x10]
00a0a4a0	b 0x00a0a1b0
