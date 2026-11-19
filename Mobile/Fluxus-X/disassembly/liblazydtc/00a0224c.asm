; BN_bn2bin @ 00a0224c
00a0224c	str x21,[sp, #-0x30]!
00a02250	stp x20,x19,[sp, #0x10]
00a02254	stp x29,x30,[sp, #0x20]
00a02258	add x29,sp,#0x20
00a0225c	mov x20,x1
00a02260	mov x19,x0
00a02264	bl 0x00a015e8
00a02268	add w9,w0,#0x7
00a0226c	ldrsw x11,[x19, #0xc]
00a02270	add w8,w0,#0xe
00a02274	cmp w9,#0x0
00a02278	csel w9,w8,w9,lt
00a0227c	asr w21,w9,#0x3
00a02280	cmp w8,#0xf
00a02284	mov w0,wzr
00a02288	cbz w11,0x00a022f4
00a0228c	b.cc 0x00a0230c
00a02290	ldrsw x12,[x19, #0x8]
00a02294	sxtw x10,w21
00a02298	mov w13,#0x1
00a0229c	sub x11,x13,x11, LSL #0x3
00a022a0	add x13,x20,x10
00a022a4	lsl x14,x12,#0x3
00a022a8	mov x8,xzr
00a022ac	mov x9,xzr
00a022b0	sub x12,x13,#0x1
00a022b4	neg x13,x14
00a022b8	ldr x14,[x19]
00a022bc	and x15,x9,#-0x8
00a022c0	add x16,x13,x8
00a022c4	ubfiz x17,x9,#0x3,#0x3
00a022c8	ldr x14,[x14, x15#0x0]
00a022cc	asr x15,x16,#0x3f
00a022d0	add x18,x11,x9
00a022d4	add x8,x8,#0x1
00a022d8	lsr x14,x14,x17
00a022dc	and w14,w14,w15
00a022e0	cmp x8,x10
00a022e4	strb w14,[x12], #-0x1
00a022e8	add x9,x9,x18, LSR #0x3f
00a022ec	b.cc 0x00a022b8
00a022f0	b 0x00a02308
00a022f4	b.cc 0x00a0230c
00a022f8	sxtw x2,w21
00a022fc	mov x0,x20
00a02300	mov w1,wzr
00a02304	bl 0x00c301c0
00a02308	mov w0,w21
00a0230c	ldp x29,x30,[sp, #0x20]
00a02310	ldp x20,x19,[sp, #0x10]
00a02314	ldr x21,[sp], #0x30
00a02318	ret
