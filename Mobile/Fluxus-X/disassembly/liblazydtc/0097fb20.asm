; FUN_0097fb20 @ 0097fb20
0097fb20	stp x28,x27,[sp, #-0x60]!
0097fb24	stp x26,x25,[sp, #0x10]
0097fb28	stp x24,x23,[sp, #0x20]
0097fb2c	stp x22,x21,[sp, #0x30]
0097fb30	stp x20,x19,[sp, #0x40]
0097fb34	stp x29,x30,[sp, #0x50]
0097fb38	add x29,sp,#0x50
0097fb3c	sub sp,sp,#0x1a0
0097fb40	mrs x23,tpidr_el0
0097fb44	mov x20,x8
0097fb48	ldr x8,[x23, #0x28]
0097fb4c	add x9,sp,#0x50
0097fb50	mov x24,x0
0097fb54	str x8,[sp, #0x28]
0097fb58	ldp x25,x19,[x1]
0097fb5c	stp xzr,xzr,[x1]
0097fb60	ldp x28,x22,[x2]
0097fb64	stp xzr,xzr,[x2]
0097fb68	ldr x26,[x0, #0x8]
0097fb6c	add x8,x9,#0x8
0097fb70	stp xzr,xzr,[sp, #0x58]
0097fb74	str x8,[sp, #0x50]
0097fb78	add x8,sp,#0x70
0097fb7c	stp x22,x19,[sp, #0x18]
0097fb80	bl 0x00c331c0
0097fb84	mov w10,#0x6553
0097fb88	orr w8,wzr,#0xc
0097fb8c	mov w9,#0x7265
0097fb90	movk w10,#0x7672, LSL #16
0097fb94	add x11,sp,#0x38
0097fb98	str x20,[sp, #0x10]
0097fb9c	stp xzr,xzr,[sp, #0x40]
0097fba0	strb w8,[sp, #0x38]
0097fba4	sturh w9,[sp, #0x3d]
0097fba8	stur w10,[sp, #0x39]
0097fbac	strb wzr,[sp, #0x3f]
0097fbb0	str x11,[sp, #0x68]
0097fbb4	adrp x2,0x749000
0097fbb8	add x2,x2,#0x7e2
0097fbbc	add x0,sp,#0x50
0097fbc0	add x1,sp,#0x38
0097fbc4	add x3,sp,#0x68
0097fbc8	add x4,sp,#0x30
0097fbcc	bl 0x00c32fb0
0097fbd0	mov x20,x0
0097fbd4	ldrb w8,[x20, #0x38]!
0097fbd8	mov x21,x0
0097fbdc	tbnz w8,#0x0,0x0097fbe8
0097fbe0	strh wzr,[x20]
0097fbe4	b 0x0097fc08
0097fbe8	ldr x8,[x21, #0x48]
0097fbec	strb wzr,[x8]
0097fbf0	ldrb w8,[x21, #0x38]
0097fbf4	str xzr,[x21, #0x40]
0097fbf8	tbz w8,#0x0,0x0097fc08
0097fbfc	ldr x0,[x21, #0x48]
0097fc00	bl 0x00c301d0
0097fc04	str xzr,[x21, #0x38]
0097fc08	ldr x8,[sp, #0x80]
0097fc0c	str x23,[sp, #0x8]
0097fc10	str x8,[x20, #0x10]
0097fc14	ldr q0,[sp, #0x70]
0097fc18	str q0,[x20]
0097fc1c	ldrb w8,[sp, #0x38]
0097fc20	stp xzr,xzr,[sp, #0x70]
0097fc24	str xzr,[sp, #0x80]
0097fc28	tbz w8,#0x0,0x0097fc44
0097fc2c	ldr x0,[sp, #0x48]
0097fc30	bl 0x00c301d0
0097fc34	ldrb w8,[sp, #0x70]
0097fc38	tbz w8,#0x0,0x0097fc44
0097fc3c	ldr x0,[sp, #0x80]
0097fc40	bl 0x00c301d0
0097fc44	adrp x20,0xcb4000
0097fc48	adrp x8,0xcb4000
0097fc4c	ldr x20,[x20, #0xc90]
0097fc50	ldr x8,[x8, #0xc88]
0097fc54	add x22,sp,#0x70
0097fc58	movi v0.2D,#0x0
0097fc5c	add x21,x22,#0x80
0097fc60	add x9,x8,#0x40
0097fc64	add x8,x8,#0x18
0097fc68	add x23,x20,#0x40
0097fc6c	add x27,x22,#0x18
0097fc70	mov v0.D[0x0],x8
0097fc74	str x23,[sp, #0x80]
0097fc78	str x9,[sp, #0xf0]
0097fc7c	str q0,[sp, #0x70]
0097fc80	mov x0,x21
0097fc84	mov x1,x27
0097fc88	bl 0x00c30100
0097fc8c	str xzr,[sp, #0x178]
0097fc90	adrp x11,0xcb4000
0097fc94	ldr x11,[x11, #0xa08]
0097fc98	mov w8,#0xffffffff
0097fc9c	fmov d0,x23
0097fca0	str w8,[sp, #0x180]
0097fca4	add x8,x11,#0x10
0097fca8	add x22,x22,#0x20
0097fcac	add x9,x20,#0x18
0097fcb0	add x10,x20,#0x68
0097fcb4	mov v0.D[0x1],x8
0097fcb8	mov x0,x22
0097fcbc	add x19,sp,#0x70
0097fcc0	str x9,[sp, #0x70]
0097fcc4	str x10,[sp, #0xf0]
0097fcc8	str q0,[sp, #0x80]
0097fccc	bl 0x00c30480
0097fcd0	movi v0.2D,#0x0
0097fcd4	stur q0,[x19, #0x48]
0097fcd8	stur q0,[sp, #0xa8]
0097fcdc	stur q0,[sp, #0x98]
0097fce0	adrp x9,0xcb4000
0097fce4	ldr x9,[x9, #0xa00]
0097fce8	orr w8,wzr,#0x18
0097fcec	add x9,x9,#0x10
0097fcf0	str x9,[sp, #0x88]
0097fcf4	stur q0,[x19, #0x68]
0097fcf8	stur q0,[x19, #0x58]
0097fcfc	str w8,[sp, #0xe8]
0097fd00	mov x0,x28
0097fd04	bl 0x00c32e10
0097fd08	ldrb w9,[x0]
0097fd0c	ldp x10,x11,[x0, #0x8]
0097fd10	add x8,sp,#0x70
0097fd14	add x19,x8,#0x10
0097fd18	tst w9,#0x1
0097fd1c	lsr w8,w9,#0x1
0097fd20	csinc x1,x11,x0,ne
0097fd24	csel x2,x8,x10,eq
0097fd28	mov x0,x19
0097fd2c	bl 0x00c30e90
0097fd30	adrp x1,0x2bc000
0097fd34	add x1,x1,#0xda4
0097fd38	mov w2,#0x1
0097fd3c	bl 0x00c30e90
0097fd40	mov x23,x0
0097fd44	mov x0,x28
0097fd48	bl 0x00c32e30
0097fd4c	mov w1,w0
0097fd50	mov x0,x23
0097fd54	bl 0x00c31aa0
0097fd58	adrp x1,0x2a1000
0097fd5c	add x1,x1,#0x9a2
0097fd60	mov w2,#0x1
0097fd64	bl 0x00c30e90
0097fd68	ldrb w8,[x25, #0x18]
0097fd6c	ldp x9,x10,[x25, #0x20]
0097fd70	add x23,x25,#0x19
0097fd74	tst w8,#0x1
0097fd78	lsr w11,w8,#0x1
0097fd7c	csel x1,x23,x10,eq
0097fd80	csel x2,x11,x9,eq
0097fd84	bl 0x00c30e90
0097fd88	adrp x1,0x2a1000
0097fd8c	add x1,x1,#0x9a2
0097fd90	mov w2,#0x1
0097fd94	bl 0x00c30e90
0097fd98	adrp x10,0x2cc000
0097fd9c	add x10,x10,#0xd84
0097fda0	ldr x10,[x10]
0097fda4	mov x28,x0
0097fda8	mov w8,#0x14
0097fdac	mov w9,#0x746e
0097fdb0	add x0,x25,#0x60
0097fdb4	add x11,sp,#0x38
0097fdb8	stp xzr,xzr,[sp, #0x38]
0097fdbc	str xzr,[sp, #0x48]
0097fdc0	strb w8,[sp, #0x38]
0097fdc4	sturh w9,[sp, #0x41]
0097fdc8	stur x10,[sp, #0x39]
0097fdcc	strb wzr,[sp, #0x43]
0097fdd0	str x11,[sp, #0x68]
0097fdd4	adrp x2,0x749000
0097fdd8	add x2,x2,#0x7e2
0097fddc	add x1,sp,#0x38
0097fde0	add x3,sp,#0x68
0097fde4	add x4,sp,#0x30
0097fde8	bl 0x00c32fb0
0097fdec	ldrb w8,[x0, #0x38]
0097fdf0	ldp x9,x10,[x0, #0x40]
0097fdf4	add x11,x0,#0x39
0097fdf8	tst w8,#0x1
0097fdfc	lsr w12,w8,#0x1
0097fe00	csel x1,x11,x10,eq
0097fe04	csel x2,x12,x9,eq
0097fe08	mov x0,x28
0097fe0c	bl 0x00c30e90
0097fe10	adrp x1,0x2a1000
0097fe14	add x1,x1,#0x9a2
0097fe18	mov w2,#0x1
0097fe1c	bl 0x00c30e90
0097fe20	ldrb w8,[x25]
0097fe24	ldp x10,x9,[x25, #0x8]
0097fe28	tst w8,#0x1
0097fe2c	lsr w11,w8,#0x1
0097fe30	csinc x1,x9,x25,ne
0097fe34	csel x2,x11,x10,eq
0097fe38	bl 0x00c30e90
0097fe3c	ldrb w8,[sp, #0x38]
0097fe40	tbz w8,#0x0,0x0097fe4c
0097fe44	ldr x0,[sp, #0x48]
0097fe48	bl 0x00c301d0
0097fe4c	add x8,sp,#0x38
0097fe50	mov x0,x27
0097fe54	bl 0x00c30e20
0097fe58	add x1,sp,#0x38
0097fe5c	mov x0,x26
0097fe60	bl 0x00c33350
0097fe64	ldrb w8,[sp, #0x38]
0097fe68	tbz w8,#0x0,0x0097fe74
0097fe6c	ldr x0,[sp, #0x48]
0097fe70	bl 0x00c301d0
0097fe74	ldrb w8,[x25, #0x18]
0097fe78	ldr x9,[x25, #0x20]
0097fe7c	lsr w10,w8,#0x1
0097fe80	tst w8,#0x1
0097fe84	csel x9,x10,x9,eq
0097fe88	cmp x9,#0x4
0097fe8c	b.ne 0x0097feb0
0097fe90	ldr x9,[x25, #0x28]
0097fe94	tst w8,#0x1
0097fe98	csel x8,x23,x9,eq
0097fe9c	ldr w8,[x8]
0097fea0	mov w9,#0x4f50
0097fea4	movk w9,#0x5453, LSL #16
0097fea8	cmp w8,w9
0097feac	b.eq 0x0098007c
0097feb0	mov x9,#0x6f4c
0097feb4	movk x9,#0x6163, LSL #16
0097feb8	movk x9,#0x6974, LSL #32
0097febc	mov w8,#0x10
0097fec0	movk x9,#0x6e6f, LSL #48
0097fec4	add x10,sp,#0x38
0097fec8	stp xzr,xzr,[sp, #0x38]
0097fecc	str xzr,[sp, #0x48]
0097fed0	strb w8,[sp, #0x38]
0097fed4	stur x9,[sp, #0x39]
0097fed8	strb wzr,[sp, #0x41]
0097fedc	str x10,[sp, #0x68]
0097fee0	adrp x2,0x749000
0097fee4	add x2,x2,#0x7e2
0097fee8	add x0,sp,#0x50
0097feec	add x1,sp,#0x38
0097fef0	add x3,sp,#0x68
0097fef4	add x4,sp,#0x30
0097fef8	bl 0x00c32fb0
0097fefc	add x8,x24,#0x10
0097ff00	add x0,x0,#0x38
0097ff04	cmp x0,x8
0097ff08	b.eq 0x0097ff28
0097ff0c	ldrb w9,[x24, #0x10]
0097ff10	ldp x11,x10,[x24, #0x18]
0097ff14	tst w9,#0x1
0097ff18	lsr w12,w9,#0x1
0097ff1c	csinc x1,x10,x8,ne
0097ff20	csel x2,x12,x11,eq
0097ff24	bl 0x00c31090
0097ff28	ldrb w8,[sp, #0x38]
0097ff2c	ldr x23,[sp, #0x8]
0097ff30	tbz w8,#0x0,0x0097ff3c
0097ff34	ldr x0,[sp, #0x48]
0097ff38	bl 0x00c301d0
0097ff3c	mov w8,#0x12d
0097ff40	str wzr,[sp, #0x30]
0097ff44	stp xzr,xzr,[sp, #0x38]
0097ff48	str w8,[sp, #0x68]
0097ff4c	str xzr,[sp, #0x48]
0097ff50	ldr x8,[sp, #0x10]
0097ff54	adrp x1,0x2af000
0097ff58	add x1,x1,#0x2e0
0097ff5c	add x0,sp,#0x68
0097ff60	add x2,sp,#0x30
0097ff64	add x3,sp,#0x50
0097ff68	add x4,sp,#0x38
0097ff6c	bl 0x00c332c0
0097ff70	ldrb w8,[sp, #0x38]
0097ff74	tbz w8,#0x0,0x0097ff80
0097ff78	ldr x0,[sp, #0x48]
0097ff7c	bl 0x00c301d0
0097ff80	adrp x11,0xcb4000
0097ff84	add x8,x20,#0x18
0097ff88	ldr x11,[x11, #0xa00]
0097ff8c	str x8,[sp, #0x70]
0097ff90	ldrb w8,[sp, #0xc8]
0097ff94	add x9,x20,#0x68
0097ff98	add x10,x20,#0x40
0097ff9c	add x11,x11,#0x10
0097ffa0	str x9,[sp, #0xf0]
0097ffa4	stp x10,x11,[sp, #0x80]
0097ffa8	tbz w8,#0x0,0x0097ffb4
0097ffac	ldr x0,[sp, #0xd8]
0097ffb0	bl 0x00c301d0
0097ffb4	adrp x8,0xcb4000
0097ffb8	ldr x8,[x8, #0xa08]
0097ffbc	mov x0,x22
0097ffc0	add x8,x8,#0x10
0097ffc4	str x8,[sp, #0x88]
0097ffc8	bl 0x00c30090
0097ffcc	mov x0,x21
0097ffd0	bl 0x00c30ee0
0097ffd4	ldr x1,[sp, #0x58]
0097ffd8	add x0,sp,#0x50
0097ffdc	bl 0x00c32fc0
0097ffe0	ldp x20,x19,[sp, #0x18]
0097ffe4	cbz x20,0x00980018
0097ffe8	add x8,x20,#0x8
0097ffec	ldaxr x9,[x8]
0097fff0	sub x10,x9,#0x1
0097fff4	stlxr w11,x10,[x8]
0097fff8	cbnz w11,0x0097ffec
0097fffc	cbnz x9,0x00980018
00980000	ldr x8,[x20]
00980004	mov x0,x20
00980008	ldr x8,[x8, #0x10]
0098000c	blr x8
00980010	mov x0,x20
00980014	bl 0x00c2ff00
00980018	cbz x19,0x0098004c
0098001c	add x8,x19,#0x8
00980020	ldaxr x9,[x8]
00980024	sub x10,x9,#0x1
00980028	stlxr w11,x10,[x8]
0098002c	cbnz w11,0x00980020
00980030	cbnz x9,0x0098004c
00980034	ldr x8,[x19]
00980038	mov x0,x19
0098003c	ldr x8,[x8, #0x10]
00980040	blr x8
00980044	mov x0,x19
00980048	bl 0x00c2ff00
0098004c	ldr x8,[x23, #0x28]
00980050	ldr x9,[sp, #0x28]
00980054	cmp x8,x9
00980058	b.ne 0x009800c0
0098005c	add sp,sp,#0x1a0
00980060	ldp x29,x30,[sp, #0x50]
00980064	ldp x20,x19,[sp, #0x40]
00980068	ldp x22,x21,[sp, #0x30]
0098006c	ldp x24,x23,[sp, #0x20]
00980070	ldp x26,x25,[sp, #0x10]
00980074	ldp x28,x27,[sp], #0x60
00980078	ret
0098007c	mov w8,#0xc8
00980080	str wzr,[sp, #0x30]
00980084	stp xzr,xzr,[sp, #0x38]
00980088	str w8,[sp, #0x68]
0098008c	str xzr,[sp, #0x48]
00980090	ldr x8,[sp, #0x10]
00980094	adrp x1,0x2af000
00980098	add x1,x1,#0x2e0
0098009c	add x0,sp,#0x68
009800a0	add x2,sp,#0x30
009800a4	add x3,sp,#0x50
009800a8	add x4,sp,#0x38
009800ac	bl 0x00c332c0
009800b0	ldrb w8,[sp, #0x38]
009800b4	ldr x23,[sp, #0x8]
009800b8	tbnz w8,#0x0,0x0097ff78
009800bc	b 0x0097ff80
009800c0	bl 0x00c2fec0
