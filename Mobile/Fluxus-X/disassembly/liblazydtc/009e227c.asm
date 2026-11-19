; dtls1_set_handshake_header @ 009e227c
009e227c	str x19,[sp, #-0x20]!
009e2280	mov x19,x1
009e2284	cmp w2,#0x101
009e2288	stp x29,x30,[sp, #0x10]
009e228c	add x29,sp,#0x10
009e2290	b.ne 0x009e22cc
009e2294	ldr x8,[x0, #0x4b8]
009e2298	mov w10,#0x1
009e229c	mov w1,#0x1
009e22a0	mov w2,#0x1
009e22a4	ldrh w9,[x8, #0x10e]
009e22a8	mov x0,x19
009e22ac	strb w10,[x8, #0x138]
009e22b0	str xzr,[x8, #0x140]
009e22b4	strh w9,[x8, #0x10c]
009e22b8	strh w9,[x8, #0x148]
009e22bc	stp xzr,xzr,[x8, #0x150]
009e22c0	bl 0x00c343a0
009e22c4	cbnz w0,0x009e2310
009e22c8	b 0x009e2314
009e22cc	ldr x8,[x0, #0x4b8]
009e22d0	orr w1,wzr,#0xc
009e22d4	mov x0,x19
009e22d8	ldrh w9,[x8, #0x10e]
009e22dc	strb w2,[x8, #0x138]
009e22e0	add x2,sp,#0x8
009e22e4	str xzr,[x8, #0x140]
009e22e8	add w10,w9,#0x1
009e22ec	strh w9,[x8, #0x10c]
009e22f0	strh w9,[x8, #0x148]
009e22f4	strh w10,[x8, #0x10e]
009e22f8	stp xzr,xzr,[x8, #0x150]
009e22fc	bl 0x00c36c40
009e2300	cbz w0,0x009e2314
009e2304	mov x0,x19
009e2308	bl 0x00c37240
009e230c	cbz w0,0x009e2314
009e2310	mov w0,#0x1
009e2314	ldp x29,x30,[sp, #0x10]
009e2318	ldr x19,[sp], #0x20
009e231c	ret
