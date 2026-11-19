; FUN_00b5f984 @ 00b5f984
00b5f984	str x28,[sp, #-0x40]!
00b5f988	stp x22,x21,[sp, #0x10]
00b5f98c	stp x20,x19,[sp, #0x20]
00b5f990	stp x29,x30,[sp, #0x30]
00b5f994	add x29,sp,#0x30
00b5f998	sub sp,sp,#0x2a0
00b5f99c	mov x20,x1
00b5f9a0	mov x19,x0
00b5f9a4	sub x8,x29,#0x70
00b5f9a8	movi v0.2D,#0x0
00b5f9ac	add x0,sp,#0x158
00b5f9b0	mov w2,#0x100
00b5f9b4	mov w1,wzr
00b5f9b8	sturh wzr,[x29, #-0x40]
00b5f9bc	stp q0,q0,[x8, #0x10]
00b5f9c0	str q0,[x8]
00b5f9c4	stur xzr,[x29, #-0x78]
00b5f9c8	bl 0x00c301c0
00b5f9cc	movi v0.2D,#0x0
00b5f9d0	add x8,sp,#0x39
00b5f9d4	stur q0,[x8, #0xff]
00b5f9d8	add x8,sp,#0x29
00b5f9dc	stur q0,[x8, #0xff]
00b5f9e0	add x8,sp,#0x19
00b5f9e4	add x0,sp,#0x10
00b5f9e8	mov w2,#0x100
00b5f9ec	mov w1,wzr
00b5f9f0	str xzr,[sp, #0x150]
00b5f9f4	strh wzr,[sp, #0x148]
00b5f9f8	stur q0,[x8, #0xff]
00b5f9fc	str xzr,[sp, #0x110]
00b5fa00	bl 0x00c301c0
00b5fa04	str xzr,[sp, #0x8]
00b5fa08	cbz x19,0x00b5fb30
00b5fa0c	cbz x20,0x00b5ff3c
00b5fa10	ldr w8,[x19, #0x68]
00b5fa14	adrp x1,0x29d000
00b5fa18	add x1,x1,#0xe2e
00b5fa1c	mov x0,x20
00b5fa20	stur w8,[x29, #-0x34]
00b5fa24	ldr w8,[x19, #0xb0]
00b5fa28	stur w8,[x29, #-0x38]
00b5fa2c	bl 0x00c36530
00b5fa30	cbz x0,0x00b5fa88
00b5fa34	adrp x1,0x2d3000
00b5fa38	mov x22,x0
00b5fa3c	add x1,x1,#0x7c2
00b5fa40	mov x0,x20
00b5fa44	bl 0x00c36530
00b5fa48	mov x21,x0
00b5fa4c	sub x8,x29,#0x70
00b5fa50	sub x1,x29,#0x78
00b5fa54	mov w2,#0x32
00b5fa58	mov x0,x22
00b5fa5c	stur x8,[x29, #-0x78]
00b5fa60	bl 0x00c3b720
00b5fa64	cbz w0,0x00b5ff40
00b5fa68	cbz x21,0x00b5fa88
00b5fa6c	add x8,sp,#0x158
00b5fa70	add x1,sp,#0x150
00b5fa74	mov w2,#0x100
00b5fa78	mov x0,x21
00b5fa7c	str x8,[sp, #0x150]
00b5fa80	bl 0x00c3b720
00b5fa84	cbz w0,0x00b5ff40
00b5fa88	adrp x1,0x2d1000
00b5fa8c	add x1,x1,#0xaa2
00b5fa90	mov x0,x20
00b5fa94	bl 0x00c36530
00b5fa98	cbz x0,0x00b5fc08
00b5fa9c	ldr w9,[x0, #0x8]
00b5faa0	mov x8,x0
00b5faa4	cmp w9,#0x4
00b5faa8	b.eq 0x00b5fad0
00b5faac	cmp w9,#0x1
00b5fab0	mov w0,wzr
00b5fab4	b.ne 0x00b5ff40
00b5fab8	sub x1,x29,#0x34
00b5fabc	mov x0,x8
00b5fac0	bl 0x00c36510
00b5fac4	cbz w0,0x00b5ff40
00b5fac8	ldur w8,[x29, #-0x34]
00b5facc	b 0x00b5fb50
00b5fad0	ldr x21,[x8, #0x10]
00b5fad4	cbz x21,0x00b5fb30
00b5fad8	adrp x1,0x2d5000
00b5fadc	add x1,x1,#0xd44
00b5fae0	mov x0,x21
00b5fae4	bl 0x00c301f0
00b5fae8	cbz w0,0x00b5fb38
00b5faec	adrp x1,0x2c6000
00b5faf0	add x1,x1,#0xe43
00b5faf4	mov x0,x21
00b5faf8	bl 0x00c301f0
00b5fafc	cbz w0,0x00b5fb40
00b5fb00	adrp x1,0x2c9000
00b5fb04	add x1,x1,#0xa3f
00b5fb08	mov x0,x21
00b5fb0c	bl 0x00c301f0
00b5fb10	cbz w0,0x00b5fb48
00b5fb14	adrp x1,0x2b2000
00b5fb18	add x1,x1,#0x293
00b5fb1c	mov x0,x21
00b5fb20	bl 0x00c301f0
00b5fb24	cbnz w0,0x00b5fac8
00b5fb28	orr w8,wzr,#0x6
00b5fb2c	b 0x00b5fb4c
00b5fb30	mov w0,wzr
00b5fb34	b 0x00b5ff40
00b5fb38	mov w8,#0x1
00b5fb3c	b 0x00b5fb4c
00b5fb40	orr w8,wzr,#0x3
00b5fb44	b 0x00b5fb4c
00b5fb48	mov w8,#0x5
00b5fb4c	stur w8,[x29, #-0x34]
00b5fb50	sub w8,w8,#0x1
00b5fb54	cmp w8,#0x5
00b5fb58	b.hi 0x00b5fb8c
00b5fb5c	adrp x9,0x77c000
00b5fb60	add x9,x9,#0x2b0
00b5fb64	ldrsw x8,[x9, x8, LSL #0x2]
00b5fb68	adrp x22,0x2a3000
00b5fb6c	adrp x21,0x2ca000
00b5fb70	add x22,x22,#0x2c3
00b5fb74	add x8,x8,x9
00b5fb78	add x21,x21,#0x830
00b5fb7c	br x8
00b5fb80	adrp x22,0x2ac000
00b5fb84	add x22,x22,#0xbb2
00b5fb88	b 0x00b5fbbc
00b5fb8c	bl 0x00c342a0
00b5fb90	adrp x0,0x2a3000
00b5fb94	adrp x2,0x29e000
00b5fb98	add x0,x0,#0x265
00b5fb9c	add x2,x2,#0xf9f
00b5fba0	mov w1,#0x4df
00b5fba4	bl 0x00c342b0
00b5fba8	mov w0,#0x39
00b5fbac	mov w1,#0xa5
00b5fbb0	b 0x00b5fec4
00b5fbb4	adrp x22,0x2a3000
00b5fbb8	add x22,x22,#0x2eb
00b5fbbc	ldr x0,[x19, #0x10]
00b5fbc0	orr w1,wzr,#0xf000
00b5fbc4	bl 0x00c3fac0
00b5fbc8	mov x21,x22
00b5fbcc	cbz w0,0x00b5fc08
00b5fbd0	bl 0x00c342a0
00b5fbd4	adrp x0,0x2a3000
00b5fbd8	adrp x2,0x29e000
00b5fbdc	add x0,x0,#0x265
00b5fbe0	add x2,x2,#0xf9f
00b5fbe4	mov w1,#0x4e1
00b5fbe8	bl 0x00c342b0
00b5fbec	mov w0,#0x39
00b5fbf0	mov w1,#0xa5
00b5fbf4	mov x2,x21
00b5fbf8	b 0x00b5fec8
00b5fbfc	ldrb w8,[x19, #0x18]
00b5fc00	tst w8,#0x30
00b5fc04	b.eq 0x00b5fd18
00b5fc08	adrp x1,0x2a2000
00b5fc0c	add x1,x1,#0x40c
00b5fc10	mov x0,x20
00b5fc14	bl 0x00c36530
00b5fc18	cbz x0,0x00b5fe2c
00b5fc1c	ldur w9,[x29, #-0x34]
00b5fc20	cmp w9,#0x6
00b5fc24	b.ne 0x00b5fc64
00b5fc28	ldr w9,[x0, #0x8]
00b5fc2c	mov x8,x0
00b5fc30	cmp w9,#0x4
00b5fc34	b.eq 0x00b5fc94
00b5fc38	cmp w9,#0x1
00b5fc3c	mov w0,wzr
00b5fc40	b.ne 0x00b5ff40
00b5fc44	sub x1,x29,#0x38
00b5fc48	mov x0,x8
00b5fc4c	bl 0x00c36510
00b5fc50	cbz w0,0x00b5ff40
00b5fc54	ldur w0,[x29, #-0x38]
00b5fc58	cmn w0,#0x4
00b5fc5c	b.le 0x00b5fce8
00b5fc60	b 0x00b5fd34
00b5fc64	bl 0x00c342a0
00b5fc68	adrp x0,0x2a3000
00b5fc6c	adrp x2,0x29e000
00b5fc70	add x0,x0,#0x265
00b5fc74	add x2,x2,#0xf9f
00b5fc78	mov w1,#0x4eb
00b5fc7c	bl 0x00c342b0
00b5fc80	adrp x2,0x2c4000
00b5fc84	add x2,x2,#0x77a
00b5fc88	mov w0,#0x39
00b5fc8c	mov w1,#0x88
00b5fc90	b 0x00b5fec8
00b5fc94	ldr x21,[x8, #0x10]
00b5fc98	adrp x1,0x29d000
00b5fc9c	add x1,x1,#0xe2e
00b5fca0	mov x0,x21
00b5fca4	bl 0x00c301f0
00b5fca8	cbz w0,0x00b5fd10
00b5fcac	adrp x1,0x2b3000
00b5fcb0	add x1,x1,#0x3f4
00b5fcb4	mov x0,x21
00b5fcb8	bl 0x00c301f0
00b5fcbc	cbz w0,0x00b5fd24
00b5fcc0	adrp x1,0x2a1000
00b5fcc4	add x1,x1,#0xf81
00b5fcc8	mov x0,x21
00b5fccc	bl 0x00c301f0
00b5fcd0	cbz w0,0x00b5fd2c
00b5fcd4	mov x0,x21
00b5fcd8	bl 0x00c308a0
00b5fcdc	stur w0,[x29, #-0x38]
00b5fce0	cmn w0,#0x4
00b5fce4	b.gt 0x00b5fd34
00b5fce8	bl 0x00c342a0
00b5fcec	adrp x0,0x2a3000
00b5fcf0	adrp x2,0x29e000
00b5fcf4	add x0,x0,#0x265
00b5fcf8	add x2,x2,#0xf9f
00b5fcfc	mov w1,#0x50a
00b5fd00	bl 0x00c342b0
00b5fd04	mov w0,#0x39
00b5fd08	orr w1,wzr,#0x70
00b5fd0c	b 0x00b5fec4
00b5fd10	mov w0,#0xffffffff
00b5fd14	b 0x00b5fd30
00b5fd18	adrp x21,0x2b0000
00b5fd1c	add x21,x21,#0xf06
00b5fd20	b 0x00b5fbd0
00b5fd24	orr w0,wzr,#0xfffffffd
00b5fd28	b 0x00b5fd30
00b5fd2c	orr w0,wzr,#0xfffffffe
00b5fd30	stur w0,[x29, #-0x38]
00b5fd34	ldr w21,[x19, #0xb4]
00b5fd38	cmn w21,#0x1
00b5fd3c	b.eq 0x00b5fe2c
00b5fd40	cmn w0,#0x1
00b5fd44	b.eq 0x00b5fd8c
00b5fd48	cmn w0,#0x2
00b5fd4c	b.ne 0x00b5fde0
00b5fd50	ldr w8,[x19, #0x18]
00b5fd54	cmp w8,#0x20
00b5fd58	b.ne 0x00b5fe2c
00b5fd5c	bl 0x00c342a0
00b5fd60	adrp x0,0x2a3000
00b5fd64	adrp x2,0x29e000
00b5fd68	add x0,x0,#0x265
00b5fd6c	add x2,x2,#0xf9f
00b5fd70	mov w1,#0x512
00b5fd74	bl 0x00c342b0
00b5fd78	adrp x2,0x2c4000
00b5fd7c	add x2,x2,#0x7c4
00b5fd80	mov w0,#0x39
00b5fd84	orr w1,wzr,#0x70
00b5fd88	b 0x00b5fec8
00b5fd8c	ldr x0,[x19, #0x20]
00b5fd90	bl 0x00c34c20
00b5fd94	cmp w21,w0
00b5fd98	b.le 0x00b5fe2c
00b5fd9c	bl 0x00c342a0
00b5fda0	adrp x0,0x2a3000
00b5fda4	adrp x2,0x29e000
00b5fda8	add x0,x0,#0x265
00b5fdac	add x2,x2,#0xf9f
00b5fdb0	mov w1,#0x519
00b5fdb4	bl 0x00c342b0
00b5fdb8	ldr x0,[x19, #0x20]
00b5fdbc	ldr w20,[x19, #0xb4]
00b5fdc0	bl 0x00c34c20
00b5fdc4	adrp x2,0x2c4000
00b5fdc8	mov w4,w0
00b5fdcc	add x2,x2,#0x7e8
00b5fdd0	mov w0,#0x39
00b5fdd4	mov w1,#0xac
00b5fdd8	mov w3,w20
00b5fddc	b 0x00b5fe20
00b5fde0	tbnz w0,#0x1f,0x00b5fe2c
00b5fde4	cmp w0,w21
00b5fde8	b.ge 0x00b5fe2c
00b5fdec	bl 0x00c342a0
00b5fdf0	adrp x0,0x2a3000
00b5fdf4	adrp x2,0x29e000
00b5fdf8	add x0,x0,#0x265
00b5fdfc	add x2,x2,#0xf9f
00b5fe00	mov w1,#0x524
00b5fe04	bl 0x00c342b0
00b5fe08	ldr w3,[x19, #0xb4]
00b5fe0c	ldur w4,[x29, #-0x38]
00b5fe10	adrp x2,0x2cc000
00b5fe14	add x2,x2,#0x7cf
00b5fe18	mov w0,#0x39
00b5fe1c	mov w1,#0xac
00b5fe20	bl 0x00c342c0
00b5fe24	mov w0,wzr
00b5fe28	b 0x00b5ff40
00b5fe2c	adrp x1,0x29e000
00b5fe30	add x1,x1,#0x202
00b5fe34	mov x0,x20
00b5fe38	bl 0x00c36530
00b5fe3c	cbz x0,0x00b5fed4
00b5fe40	adrp x1,0x2a8000
00b5fe44	mov x21,x0
00b5fe48	add x1,x1,#0x802
00b5fe4c	mov x0,x20
00b5fe50	bl 0x00c36530
00b5fe54	mov x20,x0
00b5fe58	add x8,sp,#0x118
00b5fe5c	add x1,sp,#0x110
00b5fe60	mov w2,#0x32
00b5fe64	mov x0,x21
00b5fe68	str x8,[sp, #0x110]
00b5fe6c	bl 0x00c3b720
00b5fe70	cbz w0,0x00b5ff40
00b5fe74	cbz x20,0x00b5fe94
00b5fe78	add x8,sp,#0x10
00b5fe7c	add x1,sp,#0x8
00b5fe80	mov w2,#0x100
00b5fe84	mov x0,x20
00b5fe88	str x8,[sp, #0x8]
00b5fe8c	bl 0x00c3b720
00b5fe90	cbz w0,0x00b5ff40
00b5fe94	ldur w8,[x29, #-0x34]
00b5fe98	cmp w8,#0x6
00b5fe9c	b.eq 0x00b5fed8
00b5fea0	bl 0x00c342a0
00b5fea4	adrp x0,0x2a3000
00b5fea8	adrp x2,0x29e000
00b5feac	add x0,x0,#0x265
00b5feb0	add x2,x2,#0xf9f
00b5feb4	mov w1,#0x541
00b5feb8	bl 0x00c342b0
00b5febc	mov w0,#0x39
00b5fec0	mov w1,#0xa7
00b5fec4	mov x2,xzr
00b5fec8	bl 0x00c342c0
00b5fecc	mov w0,wzr
00b5fed0	b 0x00b5ff40
00b5fed4	ldur w8,[x29, #-0x34]
00b5fed8	ldur w9,[x29, #-0x38]
00b5fedc	str w8,[x19, #0x68]
00b5fee0	cmp w8,#0x6
00b5fee4	str w9,[x19, #0xb0]
00b5fee8	ldur x1,[x29, #-0x78]
00b5feec	b.ne 0x00b5ff08
00b5fef0	ldr x8,[x19, #0x20]
00b5fef4	cbnz x8,0x00b5ff08
00b5fef8	cbnz x1,0x00b5ff08
00b5fefc	adrp x1,0x2d1000
00b5ff00	add x1,x1,#0x42e
00b5ff04	stur x1,[x29, #-0x78]
00b5ff08	ldr x8,[sp, #0x110]
00b5ff0c	cbz x8,0x00b5ff28
00b5ff10	ldr x2,[sp, #0x8]
00b5ff14	mov x0,x19
00b5ff18	mov x1,x8
00b5ff1c	bl 0x00b602e8
00b5ff20	cbz w0,0x00b5ff40
00b5ff24	ldur x1,[x29, #-0x78]
00b5ff28	cbz x1,0x00b5ff58
00b5ff2c	ldr x2,[sp, #0x150]
00b5ff30	mov x0,x19
00b5ff34	bl 0x00b60444
00b5ff38	cbz w0,0x00b5ff40
00b5ff3c	mov w0,#0x1
00b5ff40	add sp,sp,#0x2a0
00b5ff44	ldp x29,x30,[sp, #0x30]
00b5ff48	ldp x20,x19,[sp, #0x20]
00b5ff4c	ldp x22,x21,[sp, #0x10]
00b5ff50	ldr x28,[sp], #0x40
00b5ff54	ret
00b5ff58	ldr w3,[x19, #0x30]
00b5ff5c	mov x0,x19
00b5ff60	mov x2,xzr
00b5ff64	bl 0x00b60684
00b5ff68	cbnz w0,0x00b5ff3c
00b5ff6c	b 0x00b5ff40
