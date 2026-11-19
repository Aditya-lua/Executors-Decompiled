; ossl_a2i_ipadd @ 00b06eb8
00b06eb8	sub sp,sp,#0x60
00b06ebc	stp x20,x19,[sp, #0x40]
00b06ec0	mov x20,x1
00b06ec4	mov x19,x0
00b06ec8	mov w1,#0x3a
00b06ecc	mov x0,x20
00b06ed0	stp x22,x21,[sp, #0x30]
00b06ed4	stp x29,x30,[sp, #0x50]
00b06ed8	add x29,sp,#0x50
00b06edc	bl 0x00c30890
00b06ee0	cbz x0,0x00b06f4c
00b06ee4	adrp x3,0xb07000
00b06ee8	movi d0,#-0x100000000
00b06eec	add x3,x3,#0xbf4
00b06ef0	mov w1,#0x3a
00b06ef4	mov x4,sp
00b06ef8	mov x0,x20
00b06efc	mov w2,wzr
00b06f00	str d0,[sp, #0x10]
00b06f04	str wzr,[sp, #0x18]
00b06f08	bl 0x00c35230
00b06f0c	cbz w0,0x00b07068
00b06f10	ldpsw x21,x20,[sp, #0x10]
00b06f14	cmn w20,#0x1
00b06f18	b.eq 0x00b06fdc
00b06f1c	cmp w21,#0x10
00b06f20	b.eq 0x00b07068
00b06f24	ldr w8,[sp, #0x18]
00b06f28	cmp w8,#0x3
00b06f2c	b.gt 0x00b07068
00b06f30	cmp w8,#0x2
00b06f34	b.eq 0x00b06ff4
00b06f38	cmp w8,#0x3
00b06f3c	b.ne 0x00b07004
00b06f40	cmp w21,#0x0
00b06f44	b.gt 0x00b07068
00b06f48	b 0x00b07010
00b06f4c	adrp x1,0x2ca000
00b06f50	add x1,x1,#0x509
00b06f54	mov x2,sp
00b06f58	sub x3,x29,#0x24
00b06f5c	add x4,sp,#0x28
00b06f60	add x5,sp,#0x24
00b06f64	add x6,sp,#0x20
00b06f68	mov x0,x20
00b06f6c	bl 0x00c30c30
00b06f70	cmp w0,#0x4
00b06f74	mov w0,wzr
00b06f78	b.ne 0x00b0706c
00b06f7c	ldr w8,[sp]
00b06f80	ldur w9,[x29, #-0x24]
00b06f84	ldp w11,w10,[sp, #0x24]
00b06f88	mov w0,wzr
00b06f8c	orr w12,w9,w8
00b06f90	orr w12,w12,w10
00b06f94	orr w12,w12,w11
00b06f98	cmp w12,#0xff
00b06f9c	b.hi 0x00b0706c
00b06fa0	ldrsw x12,[sp, #0x20]
00b06fa4	ldrb w0,[x20, x12]
00b06fa8	cbz w0,0x00b06fc4
00b06fac	mov w1,#0x8
00b06fb0	bl 0x00c377c0
00b06fb4	cbz w0,0x00b0706c
00b06fb8	ldr w8,[sp]
00b06fbc	ldur w9,[x29, #-0x24]
00b06fc0	ldp w11,w10,[sp, #0x24]
00b06fc4	mov w0,#0x4
00b06fc8	strb w8,[x19]
00b06fcc	strb w9,[x19, #0x1]
00b06fd0	strb w10,[x19, #0x2]
00b06fd4	strb w11,[x19, #0x3]
00b06fd8	b 0x00b0706c
00b06fdc	cmp w21,#0x10
00b06fe0	b.ne 0x00b07068
00b06fe4	ldr q0,[sp]
00b06fe8	mov w0,#0x10
00b06fec	str q0,[x19]
00b06ff0	b 0x00b0706c
00b06ff4	cbz w20,0x00b07010
00b06ff8	cmp w21,w20
00b06ffc	b.ne 0x00b07068
00b07000	b 0x00b07010
00b07004	cbz w20,0x00b07068
00b07008	cmp w21,w20
00b0700c	b.eq 0x00b07068
00b07010	tbnz w20,#0x1f,0x00b06fe4
00b07014	mov x1,sp
00b07018	mov x0,x19
00b0701c	mov x2,x20
00b07020	mov x22,sp
00b07024	bl 0x00c2ffd0
00b07028	add x19,x19,x20
00b0702c	mov w8,#0x10
00b07030	sub x2,x8,x21
00b07034	mov x0,x19
00b07038	mov w1,wzr
00b0703c	bl 0x00c301c0
00b07040	cmp w21,w20
00b07044	b.eq 0x00b07060
00b07048	sub x8,x19,x21
00b0704c	sub w9,w21,w20
00b07050	add x1,x22,x20
00b07054	add x0,x8,#0x10
00b07058	sxtw x2,w9
00b0705c	bl 0x00c2ffd0
00b07060	mov w0,#0x10
00b07064	b 0x00b0706c
00b07068	mov w0,wzr
00b0706c	ldp x29,x30,[sp, #0x50]
00b07070	ldp x20,x19,[sp, #0x40]
00b07074	ldp x22,x21,[sp, #0x30]
00b07078	add sp,sp,#0x60
00b0707c	ret
