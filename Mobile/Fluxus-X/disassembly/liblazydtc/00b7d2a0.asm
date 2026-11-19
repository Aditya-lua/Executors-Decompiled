; mbedtls_mpi_safe_cond_assign @ 00b7d2a0
00b7d2a0	str x25,[sp, #-0x50]!
00b7d2a4	stp x24,x23,[sp, #0x10]
00b7d2a8	stp x22,x21,[sp, #0x20]
00b7d2ac	stp x20,x19,[sp, #0x30]
00b7d2b0	stp x29,x30,[sp, #0x40]
00b7d2b4	add x29,sp,#0x40
00b7d2b8	ldrh w22,[x1, #0xa]
00b7d2bc	mov w8,#0x2710
00b7d2c0	mov w21,w2
00b7d2c4	mov x20,x1
00b7d2c8	cmp x22,x8
00b7d2cc	mov x19,x0
00b7d2d0	b.ls 0x00b7d2dc
00b7d2d4	orr w0,wzr,#0xfffffff0
00b7d2d8	b 0x00b7d404
00b7d2dc	ldrh w25,[x19, #0xa]
00b7d2e0	cmp w25,w22
00b7d2e4	b.cs 0x00b7d32c
00b7d2e8	mov w1,#0x8
00b7d2ec	mov x0,x22
00b7d2f0	bl 0x00c30a30
00b7d2f4	mov x23,x0
00b7d2f8	cbz x0,0x00b7d2d4
00b7d2fc	ldr x24,[x19]
00b7d300	cbz x24,0x00b7d324
00b7d304	lsl x25,x25,#0x3
00b7d308	mov x0,x23
00b7d30c	mov x1,x24
00b7d310	mov x2,x25
00b7d314	bl 0x00c2ffd0
00b7d318	mov x0,x24
00b7d31c	mov x1,x25
00b7d320	bl 0x00c42230
00b7d324	strh w22,[x19, #0xa]
00b7d328	str x23,[x19]
00b7d32c	and x21,x21,#0xff
00b7d330	neg x8,x21
00b7d334	orr x21,x8,x21
00b7d338	asr x21,x21,#0x3f
00b7d33c	ldrsh w8,[x20, #0x8]
00b7d340	ldrsh w9,[x19, #0x8]
00b7d344	mov x10,x21
00b7d348	mov x3,x21
00b7d34c	add w8,w8,#0x1
00b7d350	add w9,w9,#0x1
00b7d354	and x8,x8,x10
00b7d358	mvn x10,x10
00b7d35c	and x10,x10,x9
00b7d360	orr x10,x8,x10
00b7d364	sub w8,w10,#0x1
00b7d368	strh w8,[x19, #0x8]
00b7d36c	ldr x0,[x19]
00b7d370	ldr x1,[x20]
00b7d374	ldrh w2,[x20, #0xa]
00b7d378	bl 0x00c41de0
00b7d37c	ldrh w11,[x20, #0xa]
00b7d380	ldrh w8,[x19, #0xa]
00b7d384	mov w0,wzr
00b7d388	cmp w11,w8
00b7d38c	b.cs 0x00b7d404
00b7d390	ldr x9,[x19]
00b7d394	sub x12,x8,x11
00b7d398	cmp x12,#0x4
00b7d39c	mvn x10,x21
00b7d3a0	b.cc 0x00b7d3e4
00b7d3a4	and x13,x12,#-0x4
00b7d3a8	add x14,x9,x11, LSL #0x3
00b7d3ac	dup v0.2D,x10
00b7d3b0	add x11,x13,x11
00b7d3b4	add x14,x14,#0x10
00b7d3b8	mov x15,x13
00b7d3bc	ldp q1,q2,[x14, #-0x10]
00b7d3c0	subs x15,x15,#0x4
00b7d3c4	and v1.16B,v1.16B,v0.16B
00b7d3c8	and v2.16B,v2.16B,v0.16B
00b7d3cc	stp q1,q2,[x14, #-0x10]
00b7d3d0	add x14,x14,#0x20
00b7d3d4	b.ne 0x00b7d3bc
00b7d3d8	cmp x12,x13
00b7d3dc	mov w0,wzr
00b7d3e0	b.eq 0x00b7d404
00b7d3e4	lsl x12,x11,#0x3
00b7d3e8	ldr x13,[x9, x12#0x0]
00b7d3ec	add x11,x11,#0x1
00b7d3f0	cmp x11,x8
00b7d3f4	and x13,x13,x10
00b7d3f8	str x13,[x9, x12#0x0]
00b7d3fc	b.cc 0x00b7d3e4
00b7d400	mov w0,wzr
00b7d404	ldp x29,x30,[sp, #0x40]
00b7d408	ldp x20,x19,[sp, #0x30]
00b7d40c	ldp x22,x21,[sp, #0x20]
00b7d410	ldp x24,x23,[sp, #0x10]
00b7d414	ldr x25,[sp], #0x50
00b7d418	ret
