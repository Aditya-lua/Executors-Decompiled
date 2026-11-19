; FUN_0086cb0c @ 0086cb0c
0086cb0c	str d8,[sp, #-0x70]!
0086cb10	stp x29,x30,[sp, #0x10]
0086cb14	stp x28,x27,[sp, #0x20]
0086cb18	stp x26,x25,[sp, #0x30]
0086cb1c	stp x24,x23,[sp, #0x40]
0086cb20	stp x22,x21,[sp, #0x50]
0086cb24	stp x20,x19,[sp, #0x60]
0086cb28	add x29,sp,#0x10
0086cb2c	sub sp,sp,#0x230
0086cb30	mrs x22,tpidr_el0
0086cb34	mov x19,x0
0086cb38	ldr x8,[x22, #0x28]
0086cb3c	stur x8,[x29, #-0x18]
0086cb40	ldur q0,[x0, #0x94]
0086cb44	ldr x20,[x0, #0xa8]
0086cb48	add x0,x0,#0x90
0086cb4c	str q0,[sp, #0x10]
0086cb50	bl 0x008521f4
0086cb54	mov w2,w0
0086cb58	add x0,x19,#0x498
0086cb5c	mov x1,x20
0086cb60	bl 0x00802564
0086cb64	ldrb w8,[x19, #0x68]
0086cb68	ldrb w23,[x19, #0x498]
0086cb6c	stp xzr,xzr,[sp]
0086cb70	tbz w8,#0x0,0x0086cba0
0086cb74	ldr x24,[x19, #0x4a0]
0086cb78	lsr x8,x23,#0x1
0086cb7c	ands w9,w23,#0x1
0086cb80	ldr x10,[x19, #0x4a8]
0086cb84	add x11,x19,#0x499
0086cb88	csel x25,x8,x24,eq
0086cb8c	csel x21,x11,x10,eq
0086cb90	adds x20,x25,#0x1
0086cb94	b.cc 0x0086cba8
0086cb98	mov x0,xzr
0086cb9c	b 0x0086cc70
0086cba0	ldr x24,[x19, #0x4a0]
0086cba4	b 0x0086cc7c
0086cba8	ldr x0,[x19, #0xe8]
0086cbac	mov x1,x20
0086cbb0	bl 0x0084e938
0086cbb4	cmp x20,#0x8
0086cbb8	mov x8,xzr
0086cbbc	b.cc 0x0086cc40
0086cbc0	sub x9,x0,x21
0086cbc4	cmp x9,#0x20
0086cbc8	b.cc 0x0086cc40
0086cbcc	cmp x20,#0x20
0086cbd0	b.cs 0x0086cbdc
0086cbd4	mov x8,xzr
0086cbd8	b 0x0086cc14
0086cbdc	and x8,x20,#-0x20
0086cbe0	add x9,x0,#0x10
0086cbe4	add x10,x21,#0x10
0086cbe8	mov x11,x8
0086cbec	ldp q0,q1,[x10, #-0x10]
0086cbf0	subs x11,x11,#0x20
0086cbf4	add x10,x10,#0x20
0086cbf8	stp q0,q1,[x9, #-0x10]
0086cbfc	add x9,x9,#0x20
0086cc00	b.ne 0x0086cbec
0086cc04	cmp x20,x8
0086cc08	b.eq 0x0086cc60
0086cc0c	tst x20,#0x18
0086cc10	b.eq 0x0086cc40
0086cc14	mov x11,x8
0086cc18	and x8,x20,#-0x8
0086cc1c	add x9,x0,x11
0086cc20	add x10,x21,x11
0086cc24	sub x11,x11,x8
0086cc28	ldr d0,[x10], #0x8
0086cc2c	adds x11,x11,#0x8
0086cc30	str d0,[x9], #0x8
0086cc34	b.ne 0x0086cc28
0086cc38	cmp x20,x8
0086cc3c	b.eq 0x0086cc60
0086cc40	sub x9,x25,x8
0086cc44	add x10,x21,x8
0086cc48	add x8,x0,x8
0086cc4c	add x9,x9,#0x1
0086cc50	ldrb w11,[x10], #0x1
0086cc54	subs x9,x9,#0x1
0086cc58	strb w11,[x8], #0x1
0086cc5c	b.ne 0x0086cc50
0086cc60	ldrb w23,[x19, #0x498]
0086cc64	ldr x24,[x19, #0x4a0]
0086cc68	lsr x8,x23,#0x1
0086cc6c	and w9,w23,#0x1
0086cc70	cmp w9,#0x0
0086cc74	csel x8,x8,x24,eq
0086cc78	stp x0,x8,[sp]
0086cc7c	lsr w27,w23,#0x1
0086cc80	tst w23,#0x1
0086cc84	csel x20,x27,x24,eq
0086cc88	cbz x20,0x0086cd58
0086cc8c	ldr x26,[x19, #0x4a8]
0086cc90	add x25,x19,#0x499
0086cc94	tst w23,#0x1
0086cc98	mov w1,#0x5f
0086cc9c	mov x2,x20
0086cca0	csel x21,x25,x26,eq
0086cca4	mov x0,x21
0086cca8	bl 0x00c300a0
0086ccac	cbz x0,0x0086cd58
0086ccb0	sub x8,x0,x21
0086ccb4	cmn x8,#0x1
0086ccb8	b.eq 0x0086cd58
0086ccbc	add x8,x21,x20
0086ccc0	cmp x0,x8
0086ccc4	b.eq 0x0086cd08
0086ccc8	add x9,x0,#0x1
0086cccc	cmp x9,x8
0086ccd0	b.ne 0x0086cce4
0086ccd4	b 0x0086cd08
0086ccd8	add x9,x9,#0x1
0086ccdc	cmp x9,x8
0086cce0	b.eq 0x0086ccf8
0086cce4	ldrb w10,[x9]
0086cce8	cmp w10,#0x5f
0086ccec	b.eq 0x0086ccd8
0086ccf0	strb w10,[x0], #0x1
0086ccf4	b 0x0086ccd8
0086ccf8	ldrb w23,[x19, #0x498]
0086ccfc	ldr x26,[x19, #0x4a8]
0086cd00	ldr x24,[x19, #0x4a0]
0086cd04	lsr x27,x23,#0x1
0086cd08	tst w23,#0x1
0086cd0c	csel x8,x25,x26,eq
0086cd10	csel x9,x27,x24,eq
0086cd14	sub x1,x0,x8
0086cd18	cmp x1,x9
0086cd1c	b.hi 0x0086d030
0086cd20	add x8,x8,x9
0086cd24	sub x2,x8,x0
0086cd28	cmn x2,#0x1
0086cd2c	b.eq 0x0086cd3c
0086cd30	add x0,x19,#0x498
0086cd34	bl 0x0081ff10
0086cd38	b 0x0086cd58
0086cd3c	tbnz w23,#0x0,0x0086cd50
0086cd40	lsl w8,w1,#0x1
0086cd44	strb w8,[x19, #0x498]
0086cd48	strb wzr,[x25, x1]
0086cd4c	b 0x0086cd58
0086cd50	str x1,[x19, #0x4a0]
0086cd54	strb wzr,[x26, x1]
0086cd58	ldrb w8,[x19, #0x498]
0086cd5c	ldr x9,[x19, #0x4a8]
0086cd60	add x10,x19,#0x499
0086cd64	tst w8,#0x1
0086cd68	csel x20,x10,x9,eq
0086cd6c	ldrb w8,[x20]
0086cd70	cmp w8,#0x30
0086cd74	b.ne 0x0086ce48
0086cd78	ldrb w8,[x20, #0x1]
0086cd7c	cmp w8,#0x61
0086cd80	b.gt 0x0086cd90
0086cd84	cmp w8,#0x42
0086cd88	b.ne 0x0086cdd0
0086cd8c	b 0x0086cda0
0086cd90	cmp w8,#0x78
0086cd94	b.eq 0x0086cdd8
0086cd98	cmp w8,#0x62
0086cd9c	b.ne 0x0086ce48
0086cda0	mov x21,x20
0086cda4	ldrb w9,[x21, #0x2]!
0086cda8	cbz w9,0x0086cdd0
0086cdac	cmp w9,#0x30
0086cdb0	b.ne 0x0086cec8
0086cdb4	ldrb w8,[x20, #0x3]
0086cdb8	orr w8,w8,#0x20
0086cdbc	cmp w8,#0x62
0086cdc0	b.ne 0x0086cec8
0086cdc4	mov x0,x19
0086cdc8	bl 0x00858f2c
0086cdcc	b 0x0086cf6c
0086cdd0	cmp w8,#0x58
0086cdd4	b.ne 0x0086ce48
0086cdd8	ldrb w8,[x20, #0x2]
0086cddc	cbz w8,0x0086ce48
0086cde0	add x1,sp,#0x28
0086cde4	mov x0,x20
0086cde8	mov w2,#0x10
0086cdec	str xzr,[sp, #0x28]
0086cdf0	bl 0x00c30700
0086cdf4	ldr x8,[sp, #0x28]
0086cdf8	ldrb w8,[x8]
0086cdfc	cbnz w8,0x0086ce64
0086ce00	ucvtf d8,x0
0086ce04	cmn x0,#0x1
0086ce08	b.ne 0x0086cf00
0086ce0c	bl 0x00c30710
0086ce10	ldr w8,[x0]
0086ce14	cmp w8,#0x22
0086ce18	b.ne 0x0086cf48
0086ce1c	str wzr,[x0]
0086ce20	add x1,sp,#0x28
0086ce24	mov x21,x0
0086ce28	mov x0,x20
0086ce2c	mov w2,#0x10
0086ce30	bl 0x00c30700
0086ce34	ldr w8,[x21]
0086ce38	cmp w8,#0x22
0086ce3c	b.ne 0x0086cf00
0086ce40	mov w20,#0x4
0086ce44	b 0x0086cf5c
0086ce48	add x1,sp,#0x20
0086ce4c	mov x0,x20
0086ce50	str xzr,[sp, #0x20]
0086ce54	bl 0x00c30720
0086ce58	ldr x8,[sp, #0x20]
0086ce5c	ldrb w8,[x8]
0086ce60	cbz w8,0x0086ce70
0086ce64	movi d8,#0x0
0086ce68	mov w20,#0x2
0086ce6c	b 0x0086cf5c
0086ce70	fmov d8,d0
0086ce74	mov x8,#0x4340000000000000
0086ce78	fmov d0,x8
0086ce7c	fcmp d8,d0
0086ce80	b.lt 0x0086cf58
0086ce84	adrp x1,0x29d000
0086ce88	add x1,x1,#0x4da
0086ce8c	mov x0,x20
0086ce90	bl 0x00c30730
0086ce94	mov x21,x0
0086ce98	mov x0,x20
0086ce9c	bl 0x00c2ff50
0086cea0	cmp x21,x0
0086cea4	b.ne 0x0086cf58
0086cea8	fmov d0,d8
0086ceac	add x0,sp,#0x28
0086ceb0	bl 0x008700d8
0086ceb4	add x0,sp,#0x28
0086ceb8	mov x1,x20
0086cebc	bl 0x00c301f0
0086cec0	cbnz w0,0x0086d028
0086cec4	b 0x0086cf58
0086cec8	add x1,sp,#0x28
0086cecc	mov x0,x21
0086ced0	mov w2,#0x2
0086ced4	str xzr,[sp, #0x28]
0086ced8	mov w20,#0x2
0086cedc	bl 0x00c30700
0086cee0	ldr x8,[sp, #0x28]
0086cee4	ldrb w8,[x8]
0086cee8	cbz w8,0x0086cef4
0086ceec	movi d8,#0x0
0086cef0	b 0x0086cf5c
0086cef4	ucvtf d8,x0
0086cef8	cmn x0,#0x1
0086cefc	b.eq 0x0086cf0c
0086cf00	lsr x8,x0,#0x35
0086cf04	cbnz x8,0x0086cf4c
0086cf08	b 0x0086cf58
0086cf0c	bl 0x00c30710
0086cf10	ldr w8,[x0]
0086cf14	cmp w8,#0x22
0086cf18	b.ne 0x0086cf48
0086cf1c	str wzr,[x0]
0086cf20	add x1,sp,#0x28
0086cf24	mov x20,x0
0086cf28	mov x0,x21
0086cf2c	mov w2,#0x2
0086cf30	bl 0x00c30700
0086cf34	ldr w8,[x20]
0086cf38	cmp w8,#0x22
0086cf3c	b.ne 0x0086cf00
0086cf40	mov w20,#0x3
0086cf44	b 0x0086cf5c
0086cf48	mov x0,#-0x1
0086cf4c	fcvtzu x8,d8
0086cf50	cmp x0,x8
0086cf54	b.ne 0x0086d028
0086cf58	mov w20,wzr
0086cf5c	mov x0,x19
0086cf60	bl 0x00858f2c
0086cf64	cmp w20,#0x2
0086cf68	b.ne 0x0086cf8c
0086cf6c	adrp x3,0x2ab000
0086cf70	add x3,x3,#0x3ee
0086cf74	add x1,sp,#0x10
0086cf78	add x2,sp,#0x28
0086cf7c	mov x0,x19
0086cf80	stp xzr,xzr,[sp, #0x28]
0086cf84	bl 0x008659e8
0086cf88	b 0x0086cff4
0086cf8c	ldr x0,[x19, #0xe8]
0086cf90	mov w1,#0x30
0086cf94	bl 0x0084e938
0086cf98	fmov d0,d8
0086cf9c	add x1,sp,#0x10
0086cfa0	mov w2,w20
0086cfa4	mov x21,x0
0086cfa8	bl 0x0084ec44
0086cfac	ldrb w8,[x19, #0x68]
0086cfb0	cmp w8,#0x1
0086cfb4	b.ne 0x0086cff0
0086cfb8	ldr x0,[x19, #0xe8]
0086cfbc	mov w1,#0x18
0086cfc0	bl 0x0084e938
0086cfc4	mov x1,sp
0086cfc8	mov x20,x0
0086cfcc	bl 0x00851dc0
0086cfd0	add x0,x19,#0x4b0
0086cfd4	add x1,sp,#0x28
0086cfd8	str x21,[sp, #0x28]
0086cfdc	bl 0x00860fa0
0086cfe0	mov x8,x0
0086cfe4	mov x0,x21
0086cfe8	str x20,[x8]
0086cfec	b 0x0086cff4
0086cff0	mov x0,x21
0086cff4	ldr x8,[x22, #0x28]
0086cff8	ldur x9,[x29, #-0x18]
0086cffc	cmp x8,x9
0086d000	b.ne 0x0086d044
0086d004	add sp,sp,#0x230
0086d008	ldp x20,x19,[sp, #0x60]
0086d00c	ldp x22,x21,[sp, #0x50]
0086d010	ldp x24,x23,[sp, #0x40]
0086d014	ldp x26,x25,[sp, #0x30]
0086d018	ldp x28,x27,[sp, #0x20]
0086d01c	ldp x29,x30,[sp, #0x10]
0086d020	ldr d8,[sp], #0x70
0086d024	ret
0086d028	mov w20,#0x1
0086d02c	b 0x0086cf5c
0086d030	ldr x8,[x22, #0x28]
0086d034	ldur x9,[x29, #-0x18]
0086d038	cmp x8,x9
0086d03c	b.ne 0x0086d044
0086d040	bl 0x00814f80
0086d044	bl 0x00c2fec0
