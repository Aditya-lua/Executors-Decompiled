; CRYPTO_ccm128_decrypt @ 00aa7edc
00aa7edc	sub sp,sp,#0x90
00aa7ee0	stp x28,x27,[sp, #0x30]
00aa7ee4	stp x26,x25,[sp, #0x40]
00aa7ee8	stp x24,x23,[sp, #0x50]
00aa7eec	stp x22,x21,[sp, #0x60]
00aa7ef0	stp x20,x19,[sp, #0x70]
00aa7ef4	stp x29,x30,[sp, #0x80]
00aa7ef8	ldrb w22,[x0]
00aa7efc	ldp x26,x20,[x0, #0x28]
00aa7f00	mov x21,x3
00aa7f04	mov x23,x2
00aa7f08	mov x19,x0
00aa7f0c	mov x25,x1
00aa7f10	add x29,sp,#0x80
00aa7f14	tbnz w22,#0x6,0x00aa7f28
00aa7f18	add x1,x19,#0x10
00aa7f1c	mov x0,x19
00aa7f20	mov x2,x20
00aa7f24	blr x26
00aa7f28	ands w8,w22,#0x7
00aa7f2c	strb w8,[x19]
00aa7f30	eor w24,w8,#0xf
00aa7f34	mov x8,xzr
00aa7f38	b.eq 0x00aa7f5c
00aa7f3c	mov x9,x24
00aa7f40	ldrb w10,[x19, x9]
00aa7f44	strb wzr,[x19, x9]
00aa7f48	add x9,x9,#0x1
00aa7f4c	cmp x9,#0xf
00aa7f50	orr x8,x8,x10
00aa7f54	lsl x8,x8,#0x8
00aa7f58	b.cc 0x00aa7f40
00aa7f5c	ldrb w9,[x19, #0xf]
00aa7f60	orr x8,x8,x9
00aa7f64	mov w9,#0x1
00aa7f68	cmp x8,x21
00aa7f6c	strb w9,[x19, #0xf]
00aa7f70	b.ne 0x00aa804c
00aa7f74	subs x27,x21,#0x10
00aa7f78	b.cc 0x00aa8054
00aa7f7c	and x8,x27,#-0x10
00aa7f80	str x8,[sp, #0x8]
00aa7f84	add x8,x8,#0x10
00aa7f88	str x24,[sp, #0x10]
00aa7f8c	str w22,[sp, #0x1c]
00aa7f90	add x24,x19,#0x10
00aa7f94	add x28,x23,x8
00aa7f98	mov x22,x25
00aa7f9c	str x8,[sp]
00aa7fa0	add x1,sp,#0x20
00aa7fa4	mov x0,x19
00aa7fa8	mov x2,x20
00aa7fac	blr x26
00aa7fb0	orr w8,wzr,#0xf
00aa7fb4	ldrb w9,[x19, x8]
00aa7fb8	cmp x8,#0x8
00aa7fbc	add w9,w9,#0x1
00aa7fc0	strb w9,[x19, x8]
00aa7fc4	b.eq 0x00aa7fd4
00aa7fc8	tst w9,#0xff
00aa7fcc	sub x8,x8,#0x1
00aa7fd0	b.eq 0x00aa7fb4
00aa7fd4	ldr x8,[sp, #0x20]
00aa7fd8	ldr x9,[x22]
00aa7fdc	mov x0,x24
00aa7fe0	mov x1,x24
00aa7fe4	mov x2,x20
00aa7fe8	eor x8,x9,x8
00aa7fec	str x8,[x23]
00aa7ff0	ldr x9,[x19, #0x10]
00aa7ff4	eor x8,x9,x8
00aa7ff8	str x8,[x19, #0x10]
00aa7ffc	ldr x8,[sp, #0x28]
00aa8000	ldr x9,[x22, #0x8]
00aa8004	eor x8,x9,x8
00aa8008	str x8,[x23, #0x8]
00aa800c	ldr x9,[x19, #0x18]
00aa8010	eor x8,x9,x8
00aa8014	str x8,[x19, #0x18]
00aa8018	blr x26
00aa801c	sub x21,x21,#0x10
00aa8020	add x22,x22,#0x10
00aa8024	cmp x21,#0xf
00aa8028	add x23,x23,#0x10
00aa802c	b.hi 0x00aa7fa0
00aa8030	ldr x8,[sp]
00aa8034	ldr w22,[sp, #0x1c]
00aa8038	add x25,x25,x8
00aa803c	ldp x8,x24,[sp, #0x8]
00aa8040	sub x21,x27,x8
00aa8044	cbnz x21,0x00aa805c
00aa8048	b 0x00aa81a4
00aa804c	mov w0,#0xffffffff
00aa8050	b 0x00aa81e0
00aa8054	mov x28,x23
00aa8058	cbz x21,0x00aa81a4
00aa805c	add x1,sp,#0x20
00aa8060	mov x0,x19
00aa8064	mov x2,x20
00aa8068	add x23,sp,#0x20
00aa806c	blr x26
00aa8070	cmp x21,#0x20
00aa8074	add x0,x19,#0x10
00aa8078	b.cc 0x00aa8160
00aa807c	sub x9,x21,#0x1
00aa8080	cmn w9,#0x1
00aa8084	b.eq 0x00aa8160
00aa8088	mov x8,xzr
00aa808c	lsr x10,x9,#0x20
00aa8090	mov w9,wzr
00aa8094	cbnz x10,0x00aa8168
00aa8098	add x11,x19,#0x10
00aa809c	add x13,x11,x21
00aa80a0	add x9,x28,x21
00aa80a4	cmp x28,x13
00aa80a8	add x12,x25,x21
00aa80ac	cset w8,cc
00aa80b0	cmp x9,x11
00aa80b4	cset w10,hi
00aa80b8	cmp x28,x12
00aa80bc	and w14,w8,w10
00aa80c0	cset w8,cc
00aa80c4	cmp x25,x9
00aa80c8	cset w10,cc
00aa80cc	cmp x12,x11
00aa80d0	cset w9,hi
00aa80d4	cmp x25,x13
00aa80d8	cset w11,cc
00aa80dc	tbnz w14,#0x0,0x00aa8160
00aa80e0	and w8,w8,w10
00aa80e4	tbnz w8,#0x0,0x00aa8160
00aa80e8	mov x8,xzr
00aa80ec	and w10,w9,w11
00aa80f0	mov w9,wzr
00aa80f4	tbnz w10,#0x0,0x00aa8168
00aa80f8	and x8,x21,#-0x20
00aa80fc	add x12,sp,#0x20
00aa8100	add x10,x25,#0x10
00aa8104	add x11,x19,#0x20
00aa8108	mov w9,w8
00aa810c	add x12,x12,#0x10
00aa8110	add x13,x28,#0x10
00aa8114	mov x14,x8
00aa8118	ldp q0,q1,[x12, #-0x10]
00aa811c	ldp q2,q3,[x10, #-0x10]
00aa8120	add x12,x12,#0x20
00aa8124	subs x14,x14,#0x20
00aa8128	add x10,x10,#0x20
00aa812c	eor v0.16B,v2.16B,v0.16B
00aa8130	eor v1.16B,v3.16B,v1.16B
00aa8134	stp q0,q1,[x13, #-0x10]
00aa8138	ldp q2,q3,[x11, #-0x10]
00aa813c	add x13,x13,#0x20
00aa8140	eor v0.16B,v2.16B,v0.16B
00aa8144	eor v1.16B,v3.16B,v1.16B
00aa8148	stp q0,q1,[x11, #-0x10]
00aa814c	add x11,x11,#0x20
00aa8150	b.ne 0x00aa8118
00aa8154	cmp x21,x8
00aa8158	b.ne 0x00aa8168
00aa815c	b 0x00aa8198
00aa8160	mov x8,xzr
00aa8164	mov w9,wzr
00aa8168	add w9,w9,#0x1
00aa816c	ldrb w10,[x23, x8]
00aa8170	ldrb w11,[x25, x8]
00aa8174	eor w10,w11,w10
00aa8178	strb w10,[x28, x8]
00aa817c	ldrb w11,[x0, x8]
00aa8180	eor w10,w11,w10
00aa8184	strb w10,[x0, x8]
00aa8188	mov w8,w9
00aa818c	cmp x21,x8
00aa8190	add w9,w9,#0x1
00aa8194	b.hi 0x00aa816c
00aa8198	mov x1,x0
00aa819c	mov x2,x20
00aa81a0	blr x26
00aa81a4	mov w8,#0x10
00aa81a8	add x0,x19,x24
00aa81ac	sub w2,w8,w24
00aa81b0	mov w1,wzr
00aa81b4	bl 0x00c301c0
00aa81b8	add x1,sp,#0x20
00aa81bc	mov x0,x19
00aa81c0	mov x2,x20
00aa81c4	blr x26
00aa81c8	ldr q0,[sp, #0x20]
00aa81cc	ldr q1,[x19, #0x10]
00aa81d0	mov w0,wzr
00aa81d4	strb w22,[x19]
00aa81d8	eor v0.16B,v1.16B,v0.16B
00aa81dc	str q0,[x19, #0x10]
00aa81e0	ldp x29,x30,[sp, #0x80]
00aa81e4	ldp x20,x19,[sp, #0x70]
00aa81e8	ldp x22,x21,[sp, #0x60]
00aa81ec	ldp x24,x23,[sp, #0x50]
00aa81f0	ldp x26,x25,[sp, #0x40]
00aa81f4	ldp x28,x27,[sp, #0x30]
00aa81f8	add sp,sp,#0x90
00aa81fc	ret
