; ossl_ec_GF2m_simple_point_get_affine_coordinates @ 00a2a208
00a2a208	stp x22,x21,[sp, #-0x30]!
00a2a20c	stp x20,x19,[sp, #0x10]
00a2a210	stp x29,x30,[sp, #0x20]
00a2a214	add x29,sp,#0x20
00a2a218	mov x19,x3
00a2a21c	mov x21,x2
00a2a220	mov x20,x1
00a2a224	bl 0x00c3ae10
00a2a228	cbz w0,0x00a2a254
00a2a22c	bl 0x00c342a0
00a2a230	adrp x0,0x29e000
00a2a234	adrp x2,0x2b4000
00a2a238	add x0,x0,#0x82
00a2a23c	add x2,x2,#0x113
00a2a240	mov w1,#0x148
00a2a244	bl 0x00c342b0
00a2a248	mov w0,#0x10
00a2a24c	mov w1,#0x6a
00a2a250	b 0x00a2a294
00a2a254	ldr x22,[x20, #0x20]
00a2a258	bl 0x00c38de0
00a2a25c	mov x1,x0
00a2a260	mov x0,x22
00a2a264	bl 0x00c38cc0
00a2a268	cbz w0,0x00a2a2b0
00a2a26c	bl 0x00c342a0
00a2a270	adrp x0,0x29e000
00a2a274	adrp x2,0x2b4000
00a2a278	add x0,x0,#0x82
00a2a27c	add x2,x2,#0x113
00a2a280	mov w1,#0x14d
00a2a284	bl 0x00c342b0
00a2a288	mov w1,#0x101
00a2a28c	mov w0,#0x10
00a2a290	movk w1,#0xc, LSL #16
00a2a294	mov x2,xzr
00a2a298	bl 0x00c342c0
00a2a29c	mov w0,wzr
00a2a2a0	ldp x29,x30,[sp, #0x20]
00a2a2a4	ldp x20,x19,[sp, #0x10]
00a2a2a8	ldp x22,x21,[sp], #0x30
00a2a2ac	ret
00a2a2b0	cbz x21,0x00a2a2d0
00a2a2b4	ldr x1,[x20, #0x10]
00a2a2b8	mov x0,x21
00a2a2bc	bl 0x00c36990
00a2a2c0	cbz x0,0x00a2a2a0
00a2a2c4	mov x0,x21
00a2a2c8	mov w1,wzr
00a2a2cc	bl 0x00c37f50
00a2a2d0	cbz x19,0x00a2a2f0
00a2a2d4	ldr x1,[x20, #0x18]
00a2a2d8	mov x0,x19
00a2a2dc	bl 0x00c36990
00a2a2e0	cbz x0,0x00a2a2a0
00a2a2e4	mov x0,x19
00a2a2e8	mov w1,wzr
00a2a2ec	bl 0x00c37f50
00a2a2f0	mov w0,#0x1
00a2a2f4	b 0x00a2a2a0
