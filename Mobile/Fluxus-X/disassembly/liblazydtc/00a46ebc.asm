; ossl_c448_ed448_sign @ 00a46ebc
00a46ebc	stp x28,x27,[sp, #-0x60]!
00a46ec0	stp x26,x25,[sp, #0x10]
00a46ec4	stp x24,x23,[sp, #0x20]
00a46ec8	stp x22,x21,[sp, #0x30]
00a46ecc	stp x20,x19,[sp, #0x40]
00a46ed0	stp x29,x30,[sp, #0x50]
00a46ed4	add x29,sp,#0x50
00a46ed8	sub sp,sp,#0x200
00a46edc	mov x24,x7
00a46ee0	mov w25,w6
00a46ee4	mov x21,x5
00a46ee8	mov x22,x4
00a46eec	mov x23,x3
00a46ef0	mov x28,x2
00a46ef4	mov x20,x1
00a46ef8	mov x26,x0
00a46efc	bl 0x00c31fa0
00a46f00	movi v0.2D,#0x0
00a46f04	add x8,sp,#0x69
00a46f08	stur q0,[x8, #0xff]
00a46f0c	add x8,sp,#0x59
00a46f10	stur q0,[x8, #0xff]
00a46f14	add x8,sp,#0x49
00a46f18	strb wzr,[sp, #0x180]
00a46f1c	str xzr,[sp, #0x178]
00a46f20	stur q0,[x8, #0xff]
00a46f24	cbz x0,0x00a4716c
00a46f28	ldr x27,[x29, #0x18]
00a46f2c	mov x19,x0
00a46f30	add x1,sp,#0x10
00a46f34	mov w2,#0x72
00a46f38	mov x0,x26
00a46f3c	mov x3,x28
00a46f40	mov x4,x27
00a46f44	bl 0x00a46d30
00a46f48	cbz w0,0x00a47180
00a46f4c	ldrb w8,[sp, #0x10]
00a46f50	ldr x28,[x29, #0x10]
00a46f54	sub x0,x29,#0x90
00a46f58	add x1,sp,#0x10
00a46f5c	and w8,w8,#0xfc
00a46f60	strb w8,[sp, #0x10]
00a46f64	ldrb w8,[sp, #0x47]
00a46f68	mov w2,#0x39
00a46f6c	str x23,[sp, #0x8]
00a46f70	mov x23,x20
00a46f74	orr w8,w8,#0x80
00a46f78	strb wzr,[sp, #0x48]
00a46f7c	strb w8,[sp, #0x47]
00a46f80	add x20,sp,#0x10
00a46f84	bl 0x00c3a610
00a46f88	mov x0,x26
00a46f8c	mov x1,x19
00a46f90	mov w2,w25
00a46f94	mov x3,x24
00a46f98	mov x4,x28
00a46f9c	mov x5,x27
00a46fa0	bl 0x00a471b0
00a46fa4	cbz w0,0x00a47174
00a46fa8	add x1,x20,#0x39
00a46fac	mov w2,#0x39
00a46fb0	mov x0,x19
00a46fb4	bl 0x00c31f80
00a46fb8	cbz w0,0x00a47174
00a46fbc	mov x0,x19
00a46fc0	mov x1,x22
00a46fc4	mov x2,x21
00a46fc8	bl 0x00c31f80
00a46fcc	cbz w0,0x00a47174
00a46fd0	add x0,sp,#0x10
00a46fd4	mov w1,#0x72
00a46fd8	bl 0x00c34750
00a46fdc	add x1,sp,#0x10
00a46fe0	mov w2,#0x72
00a46fe4	mov x0,x19
00a46fe8	bl 0x00c3b300
00a46fec	cbz w0,0x00a47180
00a46ff0	sub x0,x29,#0xc8
00a46ff4	add x1,sp,#0x10
00a46ff8	mov w2,#0x72
00a46ffc	bl 0x00c3a610
00a47000	add x0,sp,#0x10
00a47004	mov w1,#0x72
00a47008	bl 0x00c34750
00a4700c	add x0,sp,#0x110
00a47010	sub x1,x29,#0xc8
00a47014	bl 0x00c3a640
00a47018	add x0,sp,#0x110
00a4701c	add x1,sp,#0x110
00a47020	bl 0x00c3a640
00a47024	adrp x8,0xcb5000
00a47028	ldr x8,[x8, #0x528]
00a4702c	add x0,sp,#0x10
00a47030	add x2,sp,#0x110
00a47034	ldr x1,[x8]
00a47038	bl 0x00c3a530
00a4703c	add x0,sp,#0x148
00a47040	add x1,sp,#0x10
00a47044	bl 0x00c3a520
00a47048	add x0,sp,#0x10
00a4704c	bl 0x00c3a500
00a47050	add x0,sp,#0x110
00a47054	bl 0x00c3a620
00a47058	mov x0,x26
00a4705c	mov x1,x19
00a47060	mov w2,w25
00a47064	mov x3,x24
00a47068	mov x4,x28
00a4706c	mov x5,x27
00a47070	bl 0x00a471b0
00a47074	cbz w0,0x00a47180
00a47078	add x1,sp,#0x148
00a4707c	mov w2,#0x39
00a47080	mov x0,x19
00a47084	bl 0x00c31f80
00a47088	cbz w0,0x00a47180
00a4708c	ldr x1,[sp, #0x8]
00a47090	mov w2,#0x39
00a47094	mov x0,x19
00a47098	bl 0x00c31f80
00a4709c	cbz w0,0x00a47180
00a470a0	mov x0,x19
00a470a4	mov x1,x22
00a470a8	mov x2,x21
00a470ac	bl 0x00c31f80
00a470b0	cbz w0,0x00a47180
00a470b4	add x1,sp,#0x10
00a470b8	mov w2,#0x72
00a470bc	mov x0,x19
00a470c0	bl 0x00c3b300
00a470c4	cbz w0,0x00a47180
00a470c8	add x0,sp,#0x110
00a470cc	add x1,sp,#0x10
00a470d0	mov w2,#0x72
00a470d4	bl 0x00c3a610
00a470d8	add x0,sp,#0x10
00a470dc	mov w1,#0x72
00a470e0	bl 0x00c34750
00a470e4	add x0,sp,#0x110
00a470e8	add x1,sp,#0x110
00a470ec	sub x2,x29,#0x90
00a470f0	bl 0x00c3a650
00a470f4	add x0,sp,#0x110
00a470f8	add x1,sp,#0x110
00a470fc	sub x2,x29,#0xc8
00a47100	bl 0x00c3a600
00a47104	mov w1,#0x72
00a47108	mov x0,x23
00a4710c	bl 0x00c34750
00a47110	add x8,sp,#0x72
00a47114	ldur q0,[x8, #0xff]
00a47118	add x8,sp,#0x69
00a4711c	add x0,x23,#0x39
00a47120	add x1,sp,#0x110
00a47124	stur q0,[x23, #0x29]
00a47128	ldur q0,[x8, #0xff]
00a4712c	add x8,sp,#0x59
00a47130	str q0,[x23, #0x20]
00a47134	ldur q0,[x8, #0xff]
00a47138	add x8,sp,#0x49
00a4713c	str q0,[x23, #0x10]
00a47140	ldur q0,[x8, #0xff]
00a47144	str q0,[x23]
00a47148	bl 0x00c3a630
00a4714c	sub x0,x29,#0x90
00a47150	bl 0x00c3a620
00a47154	sub x0,x29,#0xc8
00a47158	bl 0x00c3a620
00a4715c	add x0,sp,#0x110
00a47160	bl 0x00c3a620
00a47164	mov w20,#0xffffffff
00a47168	b 0x00a47184
00a4716c	mov w20,wzr
00a47170	b 0x00a4718c
00a47174	add x0,sp,#0x10
00a47178	mov w1,#0x72
00a4717c	bl 0x00c34750
00a47180	mov w20,wzr
00a47184	mov x0,x19
00a47188	bl 0x00c31f90
00a4718c	mov w0,w20
00a47190	add sp,sp,#0x200
00a47194	ldp x29,x30,[sp, #0x50]
00a47198	ldp x20,x19,[sp, #0x40]
00a4719c	ldp x22,x21,[sp, #0x30]
00a471a0	ldp x24,x23,[sp, #0x20]
00a471a4	ldp x26,x25,[sp, #0x10]
00a471a8	ldp x28,x27,[sp], #0x60
00a471ac	ret
