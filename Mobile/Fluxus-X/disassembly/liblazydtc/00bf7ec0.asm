; FUN_00bf7ec0 @ 00bf7ec0
00bf7ec0	paciasp
00bf7ec4	stp x29,x30,[sp, #-0x50]!
00bf7ec8	str x25,[sp, #0x10]
00bf7ecc	stp x24,x23,[sp, #0x20]
00bf7ed0	stp x22,x21,[sp, #0x30]
00bf7ed4	stp x20,x19,[sp, #0x40]
00bf7ed8	mov x29,sp
00bf7edc	movi v0.2D,#0x0
00bf7ee0	mov x8,#-0x1
00bf7ee4	adrp x9,0xcad000
00bf7ee8	add x9,x9,#0x530
00bf7eec	mov x20,x0
00bf7ef0	mov w21,w3
00bf7ef4	stp x9,x8,[x0]
00bf7ef8	mov w9,#0x1
00bf7efc	mov x8,x0
00bf7f00	str x9,[x0, #0x118]
00bf7f04	add x9,x0,#0x118
00bf7f08	mov x19,x0
00bf7f0c	str q0,[x8, #0x28]!
00bf7f10	mov x22,x2
00bf7f14	str x8,[x20, #0x10]!
00bf7f18	stur q0,[x0, #0x38]
00bf7f1c	stur q0,[x0, #0x48]
00bf7f20	stur q0,[x0, #0x58]
00bf7f24	stur q0,[x0, #0x68]
00bf7f28	stur q0,[x0, #0x78]
00bf7f2c	stur q0,[x0, #0x88]
00bf7f30	stur q0,[x0, #0x98]
00bf7f34	stur q0,[x0, #0xa8]
00bf7f38	stur q0,[x0, #0xb8]
00bf7f3c	stur q0,[x0, #0xc8]
00bf7f40	stur q0,[x0, #0xd8]
00bf7f44	stur q0,[x0, #0xe8]
00bf7f48	stur q0,[x0, #0xf8]
00bf7f4c	str q0,[x8, #0xe0]
00bf7f50	stp x9,x9,[x0, #0x18]
00bf7f54	ldrb w24,[x1, #0x120]
00bf7f58	ldr x23,[x1, #0x128]
00bf7f5c	ubfx w8,w24,#0x1,#0x7
00bf7f60	tst w24,#0x1
00bf7f64	csel x8,x8,x23,eq
00bf7f68	cmp x8,#0x1
00bf7f6c	b.ne 0x00bf7f8c
00bf7f70	ldr x9,[x1, #0x130]
00bf7f74	add x10,x1,#0x121
00bf7f78	tst w24,#0x1
00bf7f7c	csel x9,x10,x9,eq
00bf7f80	ldrb w9,[x9]
00bf7f84	cmp w9,#0x2a
00bf7f88	b.eq 0x00bf8008
00bf7f8c	ldrb w9,[x22, #0x120]
00bf7f90	ldr x10,[x22, #0x128]
00bf7f94	ubfx w11,w9,#0x1,#0x7
00bf7f98	tst w9,#0x1
00bf7f9c	csel x10,x11,x10,eq
00bf7fa0	cmp x10,#0x1
00bf7fa4	b.ne 0x00bf7fc4
00bf7fa8	ldr x11,[x22, #0x130]
00bf7fac	add x12,x22,#0x121
00bf7fb0	tst w9,#0x1
00bf7fb4	csel x11,x12,x11,eq
00bf7fb8	ldrb w11,[x11]
00bf7fbc	cmp w11,#0x2a
00bf7fc0	b.eq 0x00bf8008
00bf7fc4	cbz w21,0x00bf8218
00bf7fc8	cmp x8,x10
00bf7fcc	b.ne 0x00bf8008
00bf7fd0	ldr x10,[x1, #0x130]
00bf7fd4	add x11,x1,#0x121
00bf7fd8	tst w24,#0x1
00bf7fdc	ldr x12,[x22, #0x130]
00bf7fe0	mov x25,x1
00bf7fe4	mov x2,x8
00bf7fe8	csel x0,x11,x10,eq
00bf7fec	add x10,x22,#0x121
00bf7ff0	tst w9,#0x1
00bf7ff4	csel x9,x10,x12,eq
00bf7ff8	mov x1,x9
00bf7ffc	bl 0x00c300b0
00bf8000	mov x1,x25
00bf8004	cbz w0,0x00bf8218
00bf8008	mov w8,#0x2a02
00bf800c	strb wzr,[x19, #0x122]
00bf8010	strh w8,[x19, #0x120]
00bf8014	cmp x19,x1
00bf8018	b.eq 0x00bf8034
00bf801c	ldp x8,x2,[x1, #0x10]
00bf8020	sub x9,x2,x8
00bf8024	asr x3,x9,#0x3
00bf8028	mov x0,x20
00bf802c	mov x1,x8
00bf8030	bl 0x00c0b578
00bf8034	ldp x9,x8,[x19, #0x10]
00bf8038	cmp x8,x9
00bf803c	b.eq 0x00bf807c
00bf8040	mov x10,xzr
00bf8044	mov w23,#0x1
00bf8048	b 0x00bf8060
00bf804c	mov w10,w23
00bf8050	sub x11,x8,x9
00bf8054	add w23,w23,#0x1
00bf8058	cmp x10,x11, ASR #0x3
00bf805c	b.cs 0x00bf807c
00bf8060	ldr x10,[x9, x10, LSL #0x3]
00bf8064	cbz x10,0x00bf804c
00bf8068	add x1,x10,#0x8
00bf806c	mov w0,#0x1
00bf8070	bl 0x00c2bce0
00bf8074	ldp x9,x8,[x19, #0x10]
00bf8078	b 0x00bf804c
00bf807c	tbz w21,#0x3,0x00bf8098
00bf8080	mov x0,x19
00bf8084	mov x1,x22
00bf8088	bl 0x00bf8300
00bf808c	mov x0,x19
00bf8090	mov x1,x22
00bf8094	bl 0x00bf8444
00bf8098	tbz w21,#0x0,0x00bf80fc
00bf809c	mov x0,x19
00bf80a0	mov x1,x22
00bf80a4	bl 0x00bf8588
00bf80a8	mov x0,x19
00bf80ac	mov x1,x22
00bf80b0	bl 0x00bf86cc
00bf80b4	mov x0,x19
00bf80b8	mov x1,x22
00bf80bc	bl 0x00bf8810
00bf80c0	mov x0,x19
00bf80c4	mov x1,x22
00bf80c8	bl 0x00bf8954
00bf80cc	mov x0,x19
00bf80d0	mov x1,x22
00bf80d4	bl 0x00bf8a98
00bf80d8	mov x0,x19
00bf80dc	mov x1,x22
00bf80e0	bl 0x00bf8bdc
00bf80e4	mov x0,x19
00bf80e8	mov x1,x22
00bf80ec	bl 0x00bf8d20
00bf80f0	mov x0,x19
00bf80f4	mov x1,x22
00bf80f8	bl 0x00bf8e64
00bf80fc	tbz w21,#0x4,0x00bf8160
00bf8100	mov x0,x19
00bf8104	mov x1,x22
00bf8108	bl 0x00bf8fa8
00bf810c	mov x0,x19
00bf8110	mov x1,x22
00bf8114	bl 0x00bf90ec
00bf8118	mov x0,x19
00bf811c	mov x1,x22
00bf8120	bl 0x00bf9230
00bf8124	mov x0,x19
00bf8128	mov x1,x22
00bf812c	bl 0x00bf9374
00bf8130	mov x0,x19
00bf8134	mov x1,x22
00bf8138	bl 0x00bf94b8
00bf813c	mov x0,x19
00bf8140	mov x1,x22
00bf8144	bl 0x00bf95fc
00bf8148	mov x0,x19
00bf814c	mov x1,x22
00bf8150	bl 0x00bf9740
00bf8154	mov x0,x19
00bf8158	mov x1,x22
00bf815c	bl 0x00bf9884
00bf8160	tbz w21,#0x1,0x00bf81ac
00bf8164	mov x0,x19
00bf8168	mov x1,x22
00bf816c	bl 0x00bf99c8
00bf8170	mov x0,x19
00bf8174	mov x1,x22
00bf8178	bl 0x00bf9b0c
00bf817c	mov x0,x19
00bf8180	mov x1,x22
00bf8184	bl 0x00bf9c50
00bf8188	mov x0,x19
00bf818c	mov x1,x22
00bf8190	bl 0x00bf9d94
00bf8194	mov x0,x19
00bf8198	mov x1,x22
00bf819c	bl 0x00bf9ed8
00bf81a0	mov x0,x19
00bf81a4	mov x1,x22
00bf81a8	bl 0x00bfa01c
00bf81ac	tbz w21,#0x2,0x00bf81e0
00bf81b0	mov x0,x19
00bf81b4	mov x1,x22
00bf81b8	bl 0x00bfa160
00bf81bc	mov x0,x19
00bf81c0	mov x1,x22
00bf81c4	bl 0x00bfa2a4
00bf81c8	mov x0,x19
00bf81cc	mov x1,x22
00bf81d0	bl 0x00bfa3e8
00bf81d4	mov x0,x19
00bf81d8	mov x1,x22
00bf81dc	bl 0x00bfa52c
00bf81e0	tbz w21,#0x5,0x00bf81fc
00bf81e4	mov x0,x19
00bf81e8	mov x1,x22
00bf81ec	bl 0x00bfa670
00bf81f0	mov x0,x19
00bf81f4	mov x1,x22
00bf81f8	bl 0x00bfa7b4
00bf81fc	ldp x20,x19,[sp, #0x40]
00bf8200	ldr x25,[sp, #0x10]
00bf8204	ldp x22,x21,[sp, #0x30]
00bf8208	ldp x24,x23,[sp, #0x20]
00bf820c	ldp x29,x30,[sp], #0x50
00bf8210	autiasp
00bf8214	ret
00bf8218	tbnz w24,#0x0,0x00bf8230
00bf821c	ldr x8,[x1, #0x130]
00bf8220	ldr q0,[x1, #0x120]
00bf8224	str x8,[x19, #0x130]
00bf8228	str q0,[x19, #0x120]
00bf822c	b 0x00bf8014
00bf8230	ldr x8,[x1, #0x130]
00bf8234	add x0,x19,#0x120
00bf8238	mov x24,x1
00bf823c	mov x1,x8
00bf8240	mov x2,x23
00bf8244	bl 0x007ff40c
00bf8248	mov x1,x24
00bf824c	b 0x00bf8014
