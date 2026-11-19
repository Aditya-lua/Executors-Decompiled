; mbedtls_psa_ecp_load_representation @ 00b9a24c
00b9a24c	stp x26,x25,[sp, #-0x50]!
00b9a250	stp x24,x23,[sp, #0x10]
00b9a254	stp x22,x21,[sp, #0x20]
00b9a258	stp x20,x19,[sp, #0x30]
00b9a25c	stp x29,x30,[sp, #0x40]
00b9a260	add x29,sp,#0x40
00b9a264	and w25,w0,#0x7000
00b9a268	mov x19,x4
00b9a26c	mov x21,x3
00b9a270	mov x22,x2
00b9a274	mov x23,x1
00b9a278	mov w24,w0
00b9a27c	cmp w25,#0x4, LSL #12
00b9a280	and w26,w0,#0xffff
00b9a284	mov x8,x3
00b9a288	b.ne 0x00b9a2b0
00b9a28c	and w8,w24,#0xff
00b9a290	cmp w8,#0x41
00b9a294	b.ne 0x00b9a2c4
00b9a298	mov w8,#0xcf00
00b9a29c	and w8,w26,w8
00b9a2a0	mov w9,#0x4100
00b9a2a4	cmp w8,w9
00b9a2a8	mov x8,x21
00b9a2ac	b.ne 0x00b9a2c4
00b9a2b0	cbz x23,0x00b9a2d8
00b9a2b4	add x9,x23,#0x7
00b9a2b8	cmp x8,x9, LSR #0x3
00b9a2bc	b.ne 0x00b9a2c8
00b9a2c0	b 0x00b9a2dc
00b9a2c4	tbnz w21,#0x0,0x00b9a2d0
00b9a2c8	mov w24,#0xffffff79
00b9a2cc	b 0x00b9a474
00b9a2d0	lsr x8,x21,#0x1
00b9a2d4	cbnz x23,0x00b9a2b4
00b9a2d8	lsl x23,x8,#0x3
00b9a2dc	mov w0,#0x1
00b9a2e0	mov w1,#0x100
00b9a2e4	bl 0x00c30a30
00b9a2e8	mov x20,x0
00b9a2ec	cbz x0,0x00b9a340
00b9a2f0	mov x0,x20
00b9a2f4	bl 0x00c426f0
00b9a2f8	mov w8,#0xcf00
00b9a2fc	and w8,w26,w8
00b9a300	mov w9,#0x4100
00b9a304	cmp w8,w9
00b9a308	csel w0,w24,wzr,eq
00b9a30c	and w8,w0,#0xff
00b9a310	cmp w8,#0x2f
00b9a314	mov w24,#0xffffff79
00b9a318	b.gt 0x00b9a348
00b9a31c	cmp w8,#0x12
00b9a320	b.eq 0x00b9a378
00b9a324	cmp w8,#0x17
00b9a328	b.ne 0x00b9a464
00b9a32c	cmp x23,#0x100
00b9a330	b.eq 0x00b9a3dc
00b9a334	cmp x23,#0xc0
00b9a338	b.eq 0x00b9a3dc
00b9a33c	b 0x00b9a3b8
00b9a340	mov w24,#0xffffff73
00b9a344	b 0x00b9a474
00b9a348	cmp w8,#0x30
00b9a34c	b.eq 0x00b9a3a0
00b9a350	cmp w8,#0x41
00b9a354	b.ne 0x00b9a464
00b9a358	cmp x23,#0xff
00b9a35c	b.eq 0x00b9a3dc
00b9a360	cmp x23,#0x1c0
00b9a364	b.eq 0x00b9a3dc
00b9a368	cmp x23,#0x100
00b9a36c	b.ne 0x00b9a3b8
00b9a370	orr w23,wzr,#0xff
00b9a374	b 0x00b9a3dc
00b9a378	cmp x23,#0x17f
00b9a37c	mov w24,#0xffffff79
00b9a380	b.gt 0x00b9a3c0
00b9a384	cmp x23,#0xc0
00b9a388	b.eq 0x00b9a3dc
00b9a38c	cmp x23,#0xe0
00b9a390	b.eq 0x00b9a3dc
00b9a394	cmp x23,#0x100
00b9a398	b.eq 0x00b9a3dc
00b9a39c	b 0x00b9a464
00b9a3a0	cmp x23,#0x100
00b9a3a4	b.eq 0x00b9a3dc
00b9a3a8	cmp x23,#0x180
00b9a3ac	b.eq 0x00b9a3dc
00b9a3b0	cmp x23,#0x200
00b9a3b4	b.eq 0x00b9a3dc
00b9a3b8	mov w24,#0xffffff79
00b9a3bc	b 0x00b9a464
00b9a3c0	cmp x23,#0x180
00b9a3c4	b.eq 0x00b9a3dc
00b9a3c8	cmp x23,#0x209
00b9a3cc	b.eq 0x00b9a3dc
00b9a3d0	cmp x23,#0x210
00b9a3d4	b.ne 0x00b9a464
00b9a3d8	mov w23,#0x209
00b9a3dc	mov x1,x23
00b9a3e0	bl 0x00c432a0
00b9a3e4	mov w1,w0
00b9a3e8	cbz w0,0x00b9a43c
00b9a3ec	mov x0,x20
00b9a3f0	bl 0x00c42800
00b9a3f4	bl 0x00c42bf0
00b9a3f8	mov w24,w0
00b9a3fc	cbnz w0,0x00b9a464
00b9a400	cmp w25,#0x4, LSL #12
00b9a404	b.ne 0x00b9a444
00b9a408	add x23,x20,#0xd0
00b9a40c	mov x0,x20
00b9a410	mov x1,x23
00b9a414	mov x2,x22
00b9a418	mov x3,x21
00b9a41c	bl 0x00c42770
00b9a420	bl 0x00c42bf0
00b9a424	mov w24,w0
00b9a428	cbnz w0,0x00b9a464
00b9a42c	mov x0,x20
00b9a430	mov x1,x23
00b9a434	bl 0x00c42620
00b9a438	b 0x00b9a458
00b9a43c	mov w24,#0xffffff7a
00b9a440	b 0x00b9a464
00b9a444	ldr w0,[x20]
00b9a448	mov x1,x20
00b9a44c	mov x2,x22
00b9a450	mov x3,x21
00b9a454	bl 0x00c42790
00b9a458	bl 0x00c42bf0
00b9a45c	mov w24,w0
00b9a460	cbz w0,0x00b9a490
00b9a464	mov x0,x20
00b9a468	bl 0x00c426e0
00b9a46c	mov x0,x20
00b9a470	bl 0x00c30960
00b9a474	mov w0,w24
00b9a478	ldp x29,x30,[sp, #0x40]
00b9a47c	ldp x20,x19,[sp, #0x30]
00b9a480	ldp x22,x21,[sp, #0x20]
00b9a484	ldp x24,x23,[sp, #0x10]
00b9a488	ldp x26,x25,[sp], #0x50
00b9a48c	ret
00b9a490	mov w24,wzr
00b9a494	str x20,[x19]
00b9a498	b 0x00b9a474
