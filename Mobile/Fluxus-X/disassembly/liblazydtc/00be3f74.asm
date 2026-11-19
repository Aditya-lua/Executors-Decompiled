; std::__ndk1::num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_put @ 00be3f74
00be3f74	bti c
00be3f78	adrp x5,0x2b5000
00be3f7c	add x5,x5,#0x52
00be3f80	b 0x00be3f84
00be3f84	paciasp
00be3f88	sub sp,sp,#0xa0
00be3f8c	stp x29,x30,[sp, #0x60]
00be3f90	str x23,[sp, #0x70]
00be3f94	stp x22,x21,[sp, #0x80]
00be3f98	stp x20,x19,[sp, #0x90]
00be3f9c	add x29,sp,#0x60
00be3fa0	ldr w9,[x2, #0x8]
00be3fa4	mov w8,#0x25
00be3fa8	add x10,x29,#0x18
00be3fac	mov x22,x4
00be3fb0	mov w19,w3
00be3fb4	mov x20,x2
00be3fb8	mov x21,x1
00be3fbc	str x8,[x29, #0x18]
00be3fc0	orr x8,x10,#0x1
00be3fc4	tbz w9,#0xb,0x00be3ff0
00be3fc8	mov w10,#0x4a
00be3fcc	and w10,w9,w10
00be3fd0	cmp w10,#0x8
00be3fd4	b.eq 0x00be3ff0
00be3fd8	cmp w10,#0x40
00be3fdc	b.eq 0x00be3ff0
00be3fe0	add x8,x29,#0x18
00be3fe4	mov w10,#0x2b
00be3fe8	orr x8,x8,#0x2
00be3fec	strb w10,[x29, #0x19]
00be3ff0	tbz w9,#0x9,0x00be3ffc
00be3ff4	mov w10,#0x23
00be3ff8	strb w10,[x8], #0x1
00be3ffc	ldrb w10,[x5]
00be4000	cbz w10,0x00be4014
00be4004	add x11,x5,#0x1
00be4008	strb w10,[x8], #0x1
00be400c	ldrb w10,[x11], #0x1
00be4010	cbnz w10,0x00be4008
00be4014	mov w10,#0x4a
00be4018	and w10,w9,w10
00be401c	cmp w10,#0x40
00be4020	b.eq 0x00be4040
00be4024	cmp w10,#0x8
00be4028	b.ne 0x00be4048
00be402c	tst w9,#0x4000
00be4030	mov w9,#0x58
00be4034	mov w10,#0x78
00be4038	csel w9,w10,w9,eq
00be403c	b 0x00be404c
00be4040	mov w9,#0x6f
00be4044	b 0x00be404c
00be4048	mov w9,#0x64
00be404c	strb w9,[x8]
00be4050	adrp x8,0xd27000
00be4054	add x8,x8,#0xf8
00be4058	ldarb w8,[x8]
00be405c	adrp x23,0xd27000
00be4060	tbz w8,#0x0,0x00be415c
00be4064	ldr x2,[x23, #0xf0]
00be4068	sub x0,x29,#0x18
00be406c	add x3,x29,#0x18
00be4070	mov w1,#0x18
00be4074	mov x4,x22
00be4078	sub x22,x29,#0x18
00be407c	bl 0x00c0cd14
00be4080	ldr w8,[x20, #0x8]
00be4084	mov w9,#0xb0
00be4088	add x22,x22,w0, SXTW 
00be408c	and w8,w8,w9
00be4090	mov x23,x22
00be4094	cmp w8,#0x20
00be4098	b.eq 0x00be40f4
00be409c	cmp w8,#0x10
00be40a0	b.ne 0x00be40f0
00be40a4	ldurb w8,[x29, #-0x18]
00be40a8	cmp w8,#0x2d
00be40ac	b.eq 0x00be40b8
00be40b0	cmp w8,#0x2b
00be40b4	b.ne 0x00be40c4
00be40b8	sub x8,x29,#0x18
00be40bc	orr x23,x8,#0x1
00be40c0	b 0x00be40f4
00be40c4	cmp w0,#0x2
00be40c8	b.lt 0x00be40f0
00be40cc	cmp w8,#0x30
00be40d0	b.ne 0x00be40f0
00be40d4	ldurb w8,[x29, #-0x17]
00be40d8	orr w8,w8,#0x20
00be40dc	cmp w8,#0x78
00be40e0	b.ne 0x00be40f0
00be40e4	sub x8,x29,#0x18
00be40e8	orr x23,x8,#0x2
00be40ec	b 0x00be40f4
00be40f0	sub x23,x29,#0x18
00be40f4	mov x8,sp
00be40f8	mov x0,x20
00be40fc	bl 0x00c30070
00be4100	sub x0,x29,#0x18
00be4104	add x3,sp,#0x1b
00be4108	add x4,sp,#0x10
00be410c	add x5,sp,#0x8
00be4110	mov x6,sp
00be4114	mov x1,x23
00be4118	mov x2,x22
00be411c	bl 0x00c44150
00be4120	mov x0,sp
00be4124	bl 0x00c30090
00be4128	ldp x3,x2,[sp, #0x8]
00be412c	add x1,sp,#0x1b
00be4130	mov x0,x21
00be4134	mov x4,x20
00be4138	mov w5,w19
00be413c	bl 0x00be5420
00be4140	ldp x20,x19,[sp, #0x90]
00be4144	ldr x23,[sp, #0x70]
00be4148	ldp x22,x21,[sp, #0x80]
00be414c	ldp x29,x30,[sp, #0x60]
00be4150	add sp,sp,#0xa0
00be4154	autiasp
00be4158	ret
00be415c	adrp x0,0xd27000
00be4160	add x0,x0,#0xf8
00be4164	bl 0x00c2fe90
00be4168	cbz w0,0x00be4064
00be416c	adrp x1,0x2c6000
00be4170	add x1,x1,#0xbfc
00be4174	mov w0,#0x1fbf
00be4178	mov x2,xzr
00be417c	bl 0x00c43890
00be4180	str x0,[x23, #0xf0]
00be4184	adrp x0,0xd27000
00be4188	add x0,x0,#0xf8
00be418c	bl 0x00c2fea0
00be4190	b 0x00be4064
