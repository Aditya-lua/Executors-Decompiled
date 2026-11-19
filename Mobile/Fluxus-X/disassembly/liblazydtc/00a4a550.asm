; gf_serialize @ 00a4a550
00a4a550	sub sp,sp,#0x60
00a4a554	stp x20,x19,[sp, #0x40]
00a4a558	stp x29,x30,[sp, #0x50]
00a4a55c	ldr q0,[x1, #0x30]
00a4a560	mov x19,x0
00a4a564	mov x0,sp
00a4a568	add x29,sp,#0x50
00a4a56c	str q0,[sp, #0x30]
00a4a570	ldr q0,[x1, #0x20]
00a4a574	mov x20,sp
00a4a578	str q0,[sp, #0x20]
00a4a57c	ldr q0,[x1, #0x10]
00a4a580	str q0,[sp, #0x10]
00a4a584	ldr q0,[x1]
00a4a588	str q0,[sp]
00a4a58c	bl 0x00a4a620
00a4a590	mov x8,xzr
00a4a594	mov x9,xzr
00a4a598	mov x10,xzr
00a4a59c	mov w11,wzr
00a4a5a0	mov w12,wzr
00a4a5a4	mov w13,#0x40
00a4a5a8	orr w14,w11,w12
00a4a5ac	cmp w14,#0x7
00a4a5b0	b.hi 0x00a4a5f4
00a4a5b4	ldr x14,[x20, w12, UXTW #0x3]
00a4a5b8	mov w15,w11
00a4a5bc	sub x16,x13,x15
00a4a5c0	cmp x15,#0x0
00a4a5c4	sub x17,x15,#0x40
00a4a5c8	lsr x16,x14,x16
00a4a5cc	lsl x18,x14,x17
00a4a5d0	lsl x14,x14,x15
00a4a5d4	csel x15,xzr,x16,eq
00a4a5d8	cmp x17,#0x0
00a4a5dc	csel x15,x18,x15,ge
00a4a5e0	csel x14,xzr,x14,ge
00a4a5e4	add w11,w11,#0x38
00a4a5e8	orr x10,x15,x10
00a4a5ec	orr x9,x14,x9
00a4a5f0	add w12,w12,#0x1
00a4a5f4	strb w9,[x19, x8]
00a4a5f8	add x8,x8,#0x1
00a4a5fc	sub w11,w11,#0x8
00a4a600	extr x9,x10,x9,#0x8
00a4a604	cmp x8,#0x38
00a4a608	lsr x10,x10,#0x8
00a4a60c	b.ne 0x00a4a5a8
00a4a610	ldp x29,x30,[sp, #0x50]
00a4a614	ldp x20,x19,[sp, #0x40]
00a4a618	add sp,sp,#0x60
00a4a61c	ret
