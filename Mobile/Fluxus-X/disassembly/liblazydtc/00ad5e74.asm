; RSA_padding_check_PKCS1_type_2 @ 00ad5e74
00ad5e74	sub sp,sp,#0x50
00ad5e78	stp x22,x21,[sp, #0x20]
00ad5e7c	stp x20,x19,[sp, #0x30]
00ad5e80	mov w21,w4
00ad5e84	mov x19,x0
00ad5e88	cmp w1,#0x1
00ad5e8c	mov w0,#0xffffffff
00ad5e90	stp x24,x23,[sp, #0x10]
00ad5e94	stp x29,x30,[sp, #0x40]
00ad5e98	add x29,sp,#0x40
00ad5e9c	b.lt 0x00ad61dc
00ad5ea0	mov w23,w3
00ad5ea4	cmp w3,#0x1
00ad5ea8	b.lt 0x00ad61dc
00ad5eac	cmp w23,w21
00ad5eb0	b.gt 0x00ad6180
00ad5eb4	cmp w21,#0xa
00ad5eb8	b.le 0x00ad6180
00ad5ebc	mov w22,w1
00ad5ec0	sxtw x20,w21
00ad5ec4	adrp x1,0x2d8000
00ad5ec8	mov x24,x2
00ad5ecc	add x1,x1,#0x794
00ad5ed0	mov w2,#0xbe
00ad5ed4	mov x0,x20
00ad5ed8	bl 0x00c32320
00ad5edc	cbz x0,0x00ad61a8
00ad5ee0	sub x14,x20,#0x1
00ad5ee4	sub w9,w21,#0x1
00ad5ee8	mov x8,x0
00ad5eec	mov x10,xzr
00ad5ef0	mov w11,w21
00ad5ef4	add x12,x24,w23, SXTW 
00ad5ef8	sub x13,x14,x9
00ad5efc	add x14,x0,x14
00ad5f00	mov w15,#0x1
00ad5f04	sub w16,w23,#0x1
00ad5f08	bic w16,w16,w23
00ad5f0c	bic w17,w15,w16, ASR #0x1f
00ad5f10	sub x12,x12,x17
00ad5f14	ldrb w18,[x12]
00ad5f18	sub w23,w23,w17
00ad5f1c	bic w16,w18,w16, ASR #0x1f
00ad5f20	strb w16,[x14, x10]
00ad5f24	sub x10,x10,#0x1
00ad5f28	cmn w11,w10
00ad5f2c	b.ne 0x00ad5f04
00ad5f30	add x0,x8,x13
00ad5f34	ldrb w13,[x0, #0x1]
00ad5f38	ldrb w12,[x0]
00ad5f3c	mov w10,wzr
00ad5f40	cmp w21,#0x3
00ad5f44	eor w13,w13,#0x2
00ad5f48	sub w12,w12,#0x1
00ad5f4c	sub w13,w13,#0x1
00ad5f50	and w12,w13,w12
00ad5f54	asr w13,w12,#0x1f
00ad5f58	b.lt 0x00ad5fbc
00ad5f5c	add x15,x20,#0x1
00ad5f60	sub x15,x15,x9
00ad5f64	mov x12,xzr
00ad5f68	mov w10,wzr
00ad5f6c	mov w14,wzr
00ad5f70	add x15,x8,x15
00ad5f74	sub x16,x11,#0x2
00ad5f78	ldrb w17,[x15, x12]
00ad5f7c	add w18,w12,#0x2
00ad5f80	add x12,x12,#0x1
00ad5f84	cmp x16,x12
00ad5f88	sub w17,w17,#0x1
00ad5f8c	asr w17,w17,#0x1f
00ad5f90	bic w1,w17,w14
00ad5f94	str w1,[sp, #0xc]
00ad5f98	mvn w1,w1
00ad5f9c	ldr w2,[sp, #0xc]
00ad5fa0	str w1,[sp, #0xc]
00ad5fa4	ldr w1,[sp, #0xc]
00ad5fa8	orr w14,w17,w14
00ad5fac	and w18,w2,w18
00ad5fb0	and w10,w1,w10
00ad5fb4	orr w10,w10,w18
00ad5fb8	b.ne 0x00ad5f78
00ad5fbc	sub w23,w9,w10
00ad5fc0	sub w16,w22,w23
00ad5fc4	sub w14,w10,#0xa
00ad5fc8	sub w12,w21,#0xb
00ad5fcc	eor w15,w23,w22
00ad5fd0	eor w16,w16,w23
00ad5fd4	bic w14,w14,w10
00ad5fd8	orr w15,w16,w15
00ad5fdc	sub w16,w12,w22
00ad5fe0	bic w13,w13,w14, ASR #0x1f
00ad5fe4	eor w14,w12,w22
00ad5fe8	eor w16,w16,w22
00ad5fec	orr w14,w16,w14
00ad5ff0	eor w14,w14,w12
00ad5ff4	asr w14,w14,#0x1f
00ad5ff8	str w14,[sp, #0xc]
00ad5ffc	mvn w14,w14
00ad6000	ldr w16,[sp, #0xc]
00ad6004	str w14,[sp, #0xc]
00ad6008	ldr w14,[sp, #0xc]
00ad600c	eor w15,w15,w22
00ad6010	bic w24,w13,w15, ASR #0x1f
00ad6014	and w13,w16,w12
00ad6018	and w14,w14,w22
00ad601c	cmp w11,#0xd
00ad6020	orr w11,w14,w13
00ad6024	b.lt 0x00ad60b4
00ad6028	add x15,x20,#0xa
00ad602c	sub x15,x15,x9
00ad6030	sub w13,w12,w23
00ad6034	mov w14,#0x1
00ad6038	add x15,x8,x15
00ad603c	orr w16,wzr,#0xff
00ad6040	sub w18,w21,w14
00ad6044	cmp w18,#0xc
00ad6048	b.lt 0x00ad60a8
00ad604c	and w1,w14,w13
00ad6050	mov w2,w18
00ad6054	eor w18,w1,#0x80000000
00ad6058	sub w1,w1,#0x1
00ad605c	and w18,w1,w18
00ad6060	asr w1,w18,#0x1f
00ad6064	sxtw x17,w14
00ad6068	bic w18,w16,w18, ASR #0x1f
00ad606c	orr w1,w1,#0xffffff00
00ad6070	sub x2,x2,#0xb
00ad6074	mov x3,x15
00ad6078	ldrb w4,[x3, x17]
00ad607c	ldrb w5,[x3]
00ad6080	str w18,[sp, #0xc]
00ad6084	ldr w6,[sp, #0xc]
00ad6088	str w1,[sp, #0xc]
00ad608c	ldr w7,[sp, #0xc]
00ad6090	subs x2,x2,#0x1
00ad6094	and w4,w6,w4
00ad6098	and w5,w7,w5
00ad609c	orr w4,w5,w4
00ad60a0	strb w4,[x3], #0x1
00ad60a4	b.ne 0x00ad6078
00ad60a8	lsl w14,w14,#0x1
00ad60ac	cmp w14,w12
00ad60b0	b.lt 0x00ad6040
00ad60b4	cmp w11,#0x1
00ad60b8	b.lt 0x00ad6118
00ad60bc	add x13,x20,#0xa
00ad60c0	add w10,w10,#0x1
00ad60c4	sub x9,x13,x9
00ad60c8	and w12,w24,#0xff
00ad60cc	mov w11,w11
00ad60d0	add x8,x8,x9
00ad60d4	sub w9,w10,w21
00ad60d8	orr w10,w9,w23
00ad60dc	and w10,w12,w10, ASR #0x1f
00ad60e0	ldrb w13,[x8], #0x1
00ad60e4	ldrb w14,[x19]
00ad60e8	str w10,[sp, #0xc]
00ad60ec	mvn w10,w10
00ad60f0	ldr w15,[sp, #0xc]
00ad60f4	str w10,[sp, #0xc]
00ad60f8	ldr w10,[sp, #0xc]
00ad60fc	subs x11,x11,#0x1
00ad6100	and w13,w15,w13
00ad6104	add w9,w9,#0x1
00ad6108	and w10,w10,w14
00ad610c	orr w10,w10,w13
00ad6110	strb w10,[x19], #0x1
00ad6114	b.ne 0x00ad60d8
00ad6118	adrp x19,0x2d8000
00ad611c	add x19,x19,#0x794
00ad6120	mov w3,#0x106
00ad6124	mov x1,x20
00ad6128	mov x2,x19
00ad612c	bl 0x00c345e0
00ad6130	bl 0x00c342a0
00ad6134	adrp x2,0x2a4000
00ad6138	add x2,x2,#0x8a5
00ad613c	mov w1,#0x10d
00ad6140	mov x0,x19
00ad6144	bl 0x00c342b0
00ad6148	mov w0,#0x4
00ad614c	mov w1,#0x9f
00ad6150	mov x2,xzr
00ad6154	bl 0x00c342c0
00ad6158	and w0,w24,#0x1
00ad615c	bl 0x00c3be60
00ad6160	str w24,[sp, #0xc]
00ad6164	mvn w8,w24
00ad6168	ldr w9,[sp, #0xc]
00ad616c	str w8,[sp, #0xc]
00ad6170	ldr w8,[sp, #0xc]
00ad6174	and w9,w9,w23
00ad6178	orr w0,w8,w9
00ad617c	b 0x00ad61dc
00ad6180	bl 0x00c342a0
00ad6184	adrp x0,0x2d8000
00ad6188	adrp x2,0x2a4000
00ad618c	add x0,x0,#0x794
00ad6190	add x2,x2,#0x8a5
00ad6194	mov w1,#0xba
00ad6198	bl 0x00c342b0
00ad619c	mov w0,#0x4
00ad61a0	mov w1,#0x9f
00ad61a4	b 0x00ad61d0
00ad61a8	bl 0x00c342a0
00ad61ac	adrp x0,0x2d8000
00ad61b0	adrp x2,0x2a4000
00ad61b4	add x0,x0,#0x794
00ad61b8	add x2,x2,#0x8a5
00ad61bc	orr w1,wzr,#0xc0
00ad61c0	bl 0x00c342b0
00ad61c4	mov w1,#0x100
00ad61c8	mov w0,#0x4
00ad61cc	movk w1,#0xc, LSL #16
00ad61d0	mov x2,xzr
00ad61d4	bl 0x00c342c0
00ad61d8	mov w0,#0xffffffff
00ad61dc	ldp x29,x30,[sp, #0x40]
00ad61e0	ldp x20,x19,[sp, #0x30]
00ad61e4	ldp x22,x21,[sp, #0x20]
00ad61e8	ldp x24,x23,[sp, #0x10]
00ad61ec	add sp,sp,#0x50
00ad61f0	ret
