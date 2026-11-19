; mbedtls_md5_finish @ 00b7a21c
00b7a21c	stp x22,x21,[sp, #-0x30]!
00b7a220	stp x20,x19,[sp, #0x10]
00b7a224	stp x29,x30,[sp, #0x20]
00b7a228	add x29,sp,#0x20
00b7a22c	mov x21,x0
00b7a230	ldr w22,[x21], #0x18
00b7a234	mov x20,x1
00b7a238	mov x19,x0
00b7a23c	mov w9,#0x80
00b7a240	and w8,w22,#0x3f
00b7a244	add w10,w8,#0x1
00b7a248	cmp w10,#0x38
00b7a24c	add x0,x21,x10
00b7a250	strb w9,[x21, w8, UXTW ]
00b7a254	b.hi 0x00b7a26c
00b7a258	mov w9,#0x37
00b7a25c	sub w2,w9,w8
00b7a260	mov w1,wzr
00b7a264	bl 0x00c301c0
00b7a268	b 0x00b7a298
00b7a26c	eor w2,w8,#0x3f
00b7a270	mov w1,wzr
00b7a274	bl 0x00c301c0
00b7a278	mov x0,x19
00b7a27c	mov x1,x21
00b7a280	bl 0x00c42bc0
00b7a284	stp xzr,xzr,[x21, #0x28]
00b7a288	stp xzr,xzr,[x21, #0x18]
00b7a28c	stp xzr,xzr,[x21, #0x8]
00b7a290	str xzr,[x21]
00b7a294	ldr w22,[x19]
00b7a298	ldr w8,[x19, #0x4]
00b7a29c	lsl w9,w22,#0x3
00b7a2a0	mov x0,x19
00b7a2a4	mov x1,x21
00b7a2a8	extr w8,w8,w22,#0x1d
00b7a2ac	stp w9,w8,[x19, #0x50]
00b7a2b0	bl 0x00c42bc0
00b7a2b4	ldr w8,[x19, #0x8]
00b7a2b8	mov w1,#0x58
00b7a2bc	mov x0,x19
00b7a2c0	str w8,[x20]
00b7a2c4	ldr w8,[x19, #0xc]
00b7a2c8	str w8,[x20, #0x4]
00b7a2cc	ldr w8,[x19, #0x10]
00b7a2d0	str w8,[x20, #0x8]
00b7a2d4	ldr w8,[x19, #0x14]
00b7a2d8	str w8,[x20, #0xc]
00b7a2dc	bl 0x00c42220
00b7a2e0	ldp x29,x30,[sp, #0x20]
00b7a2e4	ldp x20,x19,[sp, #0x10]
00b7a2e8	mov w0,wzr
00b7a2ec	ldp x22,x21,[sp], #0x30
00b7a2f0	ret
