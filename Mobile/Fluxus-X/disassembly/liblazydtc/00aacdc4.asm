; CRYPTO_xts128_encrypt @ 00aacdc4
00aacdc4	sub sp,sp,#0x60
00aacdc8	stp x24,x23,[sp, #0x20]
00aacdcc	subs x24,x4,#0x10
00aacdd0	stp x22,x21,[sp, #0x30]
00aacdd4	stp x20,x19,[sp, #0x40]
00aacdd8	stp x29,x30,[sp, #0x50]
00aacddc	add x29,sp,#0x50
00aacde0	b.cs 0x00aacdec
00aacde4	mov w0,#0xffffffff
00aacde8	b 0x00aad0f0
00aacdec	ldr q0,[x1]
00aacdf0	mov x21,x2
00aacdf4	mov x20,x0
00aacdf8	add x1,sp,#0x10
00aacdfc	str q0,[sp, #0x10]
00aace00	ldr x8,[x0, #0x18]
00aace04	ldr x2,[x0, #0x8]
00aace08	add x0,sp,#0x10
00aace0c	mov w22,w5
00aace10	mov x23,x4
00aace14	mov x19,x3
00aace18	blr x8
00aace1c	tst x23,#0xf
00aace20	ccmp w22,#0x0,#0x0,ne
00aace24	csel x23,x23,x24,ne
00aace28	cmp x23,#0x10
00aace2c	b.cc 0x00aacf90
00aace30	ldp x11,x10,[sp, #0x10]
00aace34	mov w24,#0x87
00aace38	ldr x8,[x21]
00aace3c	mov x0,sp
00aace40	mov x1,sp
00aace44	eor x8,x11,x8
00aace48	str x8,[sp]
00aace4c	ldr x8,[x21, #0x8]
00aace50	eor x8,x10,x8
00aace54	str x8,[sp, #0x8]
00aace58	ldr x8,[x20, #0x10]
00aace5c	ldr x2,[x20]
00aace60	blr x8
00aace64	ldr x11,[sp, #0x10]
00aace68	ldr x8,[sp]
00aace6c	subs x23,x23,#0x10
00aace70	eor x8,x8,x11
00aace74	str x8,[sp]
00aace78	str x8,[x19]
00aace7c	ldr x10,[sp, #0x18]
00aace80	ldr x9,[sp, #0x8]
00aace84	eor x9,x9,x10
00aace88	str x9,[sp, #0x8]
00aace8c	str x9,[x19, #0x8]
00aace90	b.eq 0x00aad064
00aace94	ldr w12,[sp, #0x1c]
00aace98	add x19,x19,#0x10
00aace9c	add x21,x21,#0x10
00aacea0	extr x10,x10,x11,#0x3f
00aacea4	and w12,w24,w12, ASR #0x1f
00aacea8	cmp x23,#0xf
00aaceac	eor x11,x12,x11, LSL #0x1
00aaceb0	stp x11,x10,[sp, #0x10]
00aaceb4	b.hi 0x00aace38
00aaceb8	cbz w22,0x00aacf94
00aacebc	cbz x23,0x00aad0a0
00aacec0	cmp x23,#0x20
00aacec4	b.cc 0x00aad06c
00aacec8	sub x9,x23,#0x1
00aacecc	cmn w9,#0x1
00aaced0	b.eq 0x00aad06c
00aaced4	mov x8,xzr
00aaced8	lsr x10,x9,#0x20
00aacedc	mov w9,wzr
00aacee0	cbnz x10,0x00aad074
00aacee4	mov x11,sp
00aacee8	add x13,x11,x23
00aaceec	add x9,x19,x23
00aacef0	cmp x19,x13
00aacef4	add x12,x21,x23
00aacef8	cset w8,cc
00aacefc	cmp x9,x11
00aacf00	cset w10,hi
00aacf04	cmp x19,x12
00aacf08	and w14,w8,w10
00aacf0c	cset w8,cc
00aacf10	cmp x21,x9
00aacf14	cset w10,cc
00aacf18	cmp x12,x11
00aacf1c	cset w9,hi
00aacf20	cmp x21,x13
00aacf24	cset w11,cc
00aacf28	tbnz w14,#0x0,0x00aad06c
00aacf2c	and w8,w8,w10
00aacf30	tbnz w8,#0x0,0x00aad06c
00aacf34	mov x8,xzr
00aacf38	and w10,w9,w11
00aacf3c	mov w9,wzr
00aacf40	tbnz w10,#0x0,0x00aad074
00aacf44	and x8,x23,#-0x20
00aacf48	mov x11,sp
00aacf4c	add x10,x21,#0x10
00aacf50	mov w9,w8
00aacf54	add x11,x11,#0x10
00aacf58	add x12,x19,#0x10
00aacf5c	mov x13,x8
00aacf60	ldp q0,q1,[x10, #-0x10]
00aacf64	ldp q2,q3,[x11, #-0x10]
00aacf68	add x10,x10,#0x20
00aacf6c	subs x13,x13,#0x20
00aacf70	stp q2,q3,[x12, #-0x10]
00aacf74	stp q0,q1,[x11, #-0x10]
00aacf78	add x11,x11,#0x20
00aacf7c	add x12,x12,#0x20
00aacf80	b.ne 0x00aacf60
00aacf84	cmp x23,x8
00aacf88	b.ne 0x00aad074
00aacf8c	b 0x00aad09c
00aacf90	cbnz w22,0x00aacebc
00aacf94	ldr w8,[sp, #0x1c]
00aacf98	ldp x10,x12,[sp, #0x10]
00aacf9c	ldr x11,[x21]
00aacfa0	mov w9,#0x87
00aacfa4	and w8,w9,w8, ASR #0x1f
00aacfa8	eor x22,x8,x10, LSL #0x1
00aacfac	eor x8,x22,x11
00aacfb0	str x8,[sp]
00aacfb4	ldr x8,[x21, #0x8]
00aacfb8	extr x24,x12,x10,#0x3f
00aacfbc	mov x0,sp
00aacfc0	mov x1,sp
00aacfc4	eor x8,x8,x24
00aacfc8	str x8,[sp, #0x8]
00aacfcc	ldr x8,[x20, #0x10]
00aacfd0	ldr x2,[x20]
00aacfd4	blr x8
00aacfd8	ldp x8,x9,[sp]
00aacfdc	eor x8,x8,x22
00aacfe0	eor x9,x9,x24
00aacfe4	stp x8,x9,[sp]
00aacfe8	cbz x23,0x00aad02c
00aacfec	cmp x23,#0x20
00aacff0	b.cs 0x00aad108
00aacff4	mov x8,xzr
00aacff8	mov w9,wzr
00aacffc	add w9,w9,#0x10
00aad000	mov x10,sp
00aad004	mov w11,w9
00aad008	ldrb w12,[x10, x8]
00aad00c	ldrb w13,[x21, x11]
00aad010	strb w12,[x19, x11]
00aad014	strb w13,[x10, x8]
00aad018	sub w8,w9,#0xf
00aad01c	cmp x23,x8
00aad020	add w9,w9,#0x1
00aad024	b.hi 0x00aad004
00aad028	ldp x8,x9,[sp]
00aad02c	ldp x10,x11,[sp, #0x10]
00aad030	mov x0,sp
00aad034	mov x1,sp
00aad038	eor x8,x8,x10
00aad03c	eor x9,x9,x11
00aad040	stp x8,x9,[sp]
00aad044	ldr x8,[x20, #0x10]
00aad048	ldr x2,[x20]
00aad04c	blr x8
00aad050	ldp q0,q1,[sp]
00aad054	mov w0,wzr
00aad058	eor v0.16B,v1.16B,v0.16B
00aad05c	str q0,[x19]
00aad060	b 0x00aad0f0
00aad064	mov w0,wzr
00aad068	b 0x00aad0f0
00aad06c	mov x8,xzr
00aad070	mov w9,wzr
00aad074	add w9,w9,#0x1
00aad078	mov x10,sp
00aad07c	ldrb w11,[x10, x8]
00aad080	ldrb w12,[x21, x8]
00aad084	strb w11,[x19, x8]
00aad088	strb w12,[x10, x8]
00aad08c	mov w8,w9
00aad090	cmp x23,x8
00aad094	add w9,w9,#0x1
00aad098	b.hi 0x00aad07c
00aad09c	ldp x8,x9,[sp]
00aad0a0	ldp x10,x11,[sp, #0x10]
00aad0a4	mov x0,sp
00aad0a8	mov x1,sp
00aad0ac	eor x8,x8,x10
00aad0b0	eor x9,x9,x11
00aad0b4	stp x8,x9,[sp]
00aad0b8	ldr x8,[x20, #0x10]
00aad0bc	ldr x2,[x20]
00aad0c0	blr x8
00aad0c4	ldr x8,[sp, #0x10]
00aad0c8	ldr x9,[sp]
00aad0cc	mov w0,wzr
00aad0d0	eor x8,x9,x8
00aad0d4	str x8,[sp]
00aad0d8	ldr x8,[sp, #0x18]
00aad0dc	ldr x9,[sp, #0x8]
00aad0e0	eor x8,x9,x8
00aad0e4	str x8,[sp, #0x8]
00aad0e8	ldr q0,[sp]
00aad0ec	stur q0,[x19, #-0x10]
00aad0f0	ldp x29,x30,[sp, #0x50]
00aad0f4	ldp x20,x19,[sp, #0x40]
00aad0f8	ldp x22,x21,[sp, #0x30]
00aad0fc	ldp x24,x23,[sp, #0x20]
00aad100	add sp,sp,#0x60
00aad104	ret
00aad108	sub x8,x23,#0x1
00aad10c	cmn w8,#0x1
00aad110	b.eq 0x00aacff4
00aad114	lsr x10,x8,#0x20
00aad118	cbnz x10,0x00aacff4
00aad11c	cmn w8,#0x11
00aad120	b.hi 0x00aacff4
00aad124	mov x8,xzr
00aad128	mov w9,wzr
00aad12c	cbnz x10,0x00aacffc
00aad130	mov x11,sp
00aad134	add x8,x19,#0x10
00aad138	add x9,x23,#0x10
00aad13c	add x13,x11,x23
00aad140	add x10,x19,x9
00aad144	cmp x8,x13
00aad148	add x9,x21,x9
00aad14c	cset w14,cc
00aad150	cmp x10,x11
00aad154	add x12,x21,#0x10
00aad158	cset w15,hi
00aad15c	cmp x8,x9
00aad160	cset w8,cc
00aad164	cmp x12,x10
00aad168	cset w10,cc
00aad16c	cmp x9,x11
00aad170	cset w9,hi
00aad174	cmp x12,x13
00aad178	and w14,w14,w15
00aad17c	cset w11,cc
00aad180	tbnz w14,#0x0,0x00aacff4
00aad184	and w8,w8,w10
00aad188	tbnz w8,#0x0,0x00aacff4
00aad18c	mov x8,xzr
00aad190	and w10,w9,w11
00aad194	mov w9,wzr
00aad198	tbnz w10,#0x0,0x00aacffc
00aad19c	and x8,x23,#-0x20
00aad1a0	mov x10,xzr
00aad1a4	mov w9,w8
00aad1a8	mov x11,sp
00aad1ac	and x12,x10,#0xffffffe0
00aad1b0	orr x12,x12,#0x10
00aad1b4	add x13,x11,x10
00aad1b8	add x14,x21,x12
00aad1bc	ldp q0,q1,[x13]
00aad1c0	ldp q2,q3,[x14]
00aad1c4	add x10,x10,#0x20
00aad1c8	cmp x8,x10
00aad1cc	add x12,x19,x12
00aad1d0	stp q0,q1,[x12]
00aad1d4	stp q2,q3,[x13]
00aad1d8	b.ne 0x00aad1ac
00aad1dc	cmp x23,x8
00aad1e0	b.ne 0x00aacffc
00aad1e4	b 0x00aad028
