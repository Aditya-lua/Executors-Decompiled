; FUN_0096fa34 @ 0096fa34
0096fa34	stp x28,x27,[sp, #-0x60]!
0096fa38	stp x26,x25,[sp, #0x10]
0096fa3c	stp x24,x23,[sp, #0x20]
0096fa40	stp x22,x21,[sp, #0x30]
0096fa44	stp x20,x19,[sp, #0x40]
0096fa48	stp x29,x30,[sp, #0x50]
0096fa4c	add x29,sp,#0x50
0096fa50	sub sp,sp,#0x430
0096fa54	mrs x10,tpidr_el0
0096fa58	ldr x8,[x10, #0x28]
0096fa5c	add x11,sp,#0x10
0096fa60	mov x19,x0
0096fa64	mov x20,x3
0096fa68	str x8,[x11]
0096fa6c	ldr x27,[x0, #0x10]
0096fa70	mov w22,w2
0096fa74	mov x21,x1
0096fa78	ldr x25,[x27, #0x30]
0096fa7c	ldr x0,[x25, #0x8]
0096fa80	cbz x0,0x0096fbb0
0096fa84	ldrb w8,[x19, #0x24]
0096fa88	tbnz w8,#0x1,0x0096fbb0
0096fa8c	str x10,[sp, #0x8]
0096fa90	str wzr,[x27, #0x58]
0096fa94	strb wzr,[x20]
0096fa98	bl 0x00c32960
0096fa9c	tbnz w0,#0x0,0x0096fbbc
0096faa0	str x20,[sp]
0096faa4	bl 0x00c323e0
0096faa8	mov w8,#0x12a0
0096faac	adrp x23,0x2ab000
0096fab0	add x26,x21,#0xa82
0096fab4	mov w20,#0x1
0096fab8	add x28,x21,x8
0096fabc	add x23,x23,#0x90d
0096fac0	ldr x0,[x25, #0x8]
0096fac4	add x1,sp,#0x20
0096fac8	mov w2,#0x400
0096facc	bl 0x00c329b0
0096fad0	mov w24,w0
0096fad4	cbz x21,0x0096fb18
0096fad8	ldrb w8,[x26, #0x3]
0096fadc	tbz w8,#0x4,0x0096fb18
0096fae0	ldr x8,[x28]
0096fae4	cbz x8,0x0096faf4
0096fae8	ldr w8,[x8, #0x8]
0096faec	cmp w8,#0x1
0096faf0	b.lt 0x0096fb18
0096faf4	ldr x8,[x19]
0096faf8	ldr w8,[x8, #0xc]
0096fafc	cmp w8,#0x1
0096fb00	b.lt 0x0096fb18
0096fb04	mov x0,x21
0096fb08	mov x1,x19
0096fb0c	mov x2,x23
0096fb10	mov w3,w24
0096fb14	bl 0x00904ddc
0096fb18	cmp w24,#0x1
0096fb1c	b.lt 0x0096fb2c
0096fb20	cmp x20,#0xa
0096fb24	add x20,x20,#0x1
0096fb28	b.cc 0x0096fac0
0096fb2c	ldr x0,[x25, #0x8]
0096fb30	mov w1,w24
0096fb34	bl 0x00c32910
0096fb38	cbnz w24,0x0096fcdc
0096fb3c	cmp w0,#0x6
0096fb40	b.ne 0x0096fcdc
0096fb44	ldr x20,[sp]
0096fb48	tbz w22,#0x0,0x0096fd30
0096fb4c	ldr x0,[x19, #0x8]
0096fb50	add x2,sp,#0x1c
0096fb54	mov x1,x21
0096fb58	ldr x8,[x0]
0096fb5c	ldr x8,[x8, #0x60]
0096fb60	blr x8
0096fb64	tbnz w0,#0x0,0x0096fce4
0096fb68	ldrb w8,[x27, #0x5c]
0096fb6c	orr w8,w8,#0x2
0096fb70	strb w8,[x27, #0x5c]
0096fb74	cbz x21,0x0096fe14
0096fb78	ldrb w8,[x26, #0x3]
0096fb7c	tbz w8,#0x4,0x0096fe14
0096fb80	ldr x8,[x28]
0096fb84	cbz x8,0x0096fb94
0096fb88	ldr w8,[x8, #0x8]
0096fb8c	cmp w8,#0x1
0096fb90	b.lt 0x0096fe14
0096fb94	ldr x8,[x19]
0096fb98	ldr w8,[x8, #0xc]
0096fb9c	cmp w8,#0x1
0096fba0	b.lt 0x0096fe14
0096fba4	adrp x2,0x2bd000
0096fba8	add x2,x2,#0x2bd
0096fbac	b 0x0096fe08
0096fbb0	mov w8,#0x1
0096fbb4	strb w8,[x20]
0096fbb8	b 0x0096fe24
0096fbbc	mov w8,#0x12a0
0096fbc0	add x26,x21,#0xa82
0096fbc4	add x28,x21,x8
0096fbc8	adrp x22,0x2a1000
0096fbcc	mov w24,#0x1
0096fbd0	add x22,x22,#0xb6d
0096fbd4	bl 0x00c323e0
0096fbd8	ldr x0,[x25, #0x8]
0096fbdc	add x1,sp,#0x20
0096fbe0	mov w2,#0x400
0096fbe4	bl 0x00c329b0
0096fbe8	mov w23,w0
0096fbec	cbz x21,0x0096fc3c
0096fbf0	ldrb w8,[x26, #0x3]
0096fbf4	tbz w8,#0x4,0x0096fc3c
0096fbf8	ldr x8,[x28]
0096fbfc	cbz x8,0x0096fc14
0096fc00	cbz x19,0x0096fc3c
0096fc04	ldr w8,[x8, #0x8]
0096fc08	cmp w8,#0x0
0096fc0c	b.gt 0x0096fc18
0096fc10	b 0x0096fc3c
0096fc14	cbz x19,0x0096fc3c
0096fc18	ldr x8,[x19]
0096fc1c	ldr w8,[x8, #0xc]
0096fc20	cmp w8,#0x1
0096fc24	b.lt 0x0096fc3c
0096fc28	mov x0,x21
0096fc2c	mov x1,x19
0096fc30	mov x2,x22
0096fc34	mov w3,w23
0096fc38	bl 0x00904ddc
0096fc3c	cmp w23,#0x1
0096fc40	b.lt 0x0096fc50
0096fc44	cmp x24,#0xa
0096fc48	add x24,x24,#0x1
0096fc4c	b.cc 0x0096fbd4
0096fc50	ldr x0,[x25, #0x8]
0096fc54	bl 0x00c32960
0096fc58	tbnz w0,#0x1,0x0096fcb4
0096fc5c	ldr x0,[x25, #0x8]
0096fc60	mov w1,w23
0096fc64	bl 0x00c32910
0096fc68	mov w22,w0
0096fc6c	cmp w0,#0x6
0096fc70	b.hi 0x0096fdbc
0096fc74	adrp x9,0x749000
0096fc78	mov w8,w22
0096fc7c	add x9,x9,#0x3b4
0096fc80	ldrsw x8,[x9, x8, LSL #0x2]
0096fc84	add x8,x8,x9
0096fc88	br x8
0096fc8c	cbz x21,0x0096fe94
0096fc90	ldrb w8,[x26, #0x3]
0096fc94	tbz w8,#0x4,0x0096fe94
0096fc98	ldr x8,[x28]
0096fc9c	cbz x8,0x0096fe6c
0096fca0	cbz x19,0x0096fe94
0096fca4	ldr w8,[x8, #0x8]
0096fca8	cmp w8,#0x0
0096fcac	b.gt 0x0096fe70
0096fcb0	b 0x0096fe94
0096fcb4	cbz x21,0x0096fe14
0096fcb8	ldrb w8,[x26, #0x3]
0096fcbc	tbz w8,#0x4,0x0096fe14
0096fcc0	ldr x8,[x28]
0096fcc4	cbz x8,0x0096fdec
0096fcc8	cbz x19,0x0096fe14
0096fccc	ldr w8,[x8, #0x8]
0096fcd0	cmp w8,#0x0
0096fcd4	b.gt 0x0096fdf0
0096fcd8	b 0x0096fe14
0096fcdc	ldr x20,[sp]
0096fce0	tbz w22,#0x0,0x0096fbc8
0096fce4	ldr x0,[x25, #0x8]
0096fce8	bl 0x00c32a10
0096fcec	cmp w0,#0x1
0096fcf0	b.ne 0x0096fbc8
0096fcf4	cbz x21,0x0096fe14
0096fcf8	ldrb w8,[x26, #0x3]
0096fcfc	tbz w8,#0x4,0x0096fe14
0096fd00	ldr x8,[x28]
0096fd04	cbz x8,0x0096fd14
0096fd08	ldr w8,[x8, #0x8]
0096fd0c	cmp w8,#0x1
0096fd10	b.lt 0x0096fe14
0096fd14	ldr x8,[x19]
0096fd18	ldr w8,[x8, #0xc]
0096fd1c	cmp w8,#0x1
0096fd20	b.lt 0x0096fe14
0096fd24	adrp x2,0x29f000
0096fd28	add x2,x2,#0x98a
0096fd2c	b 0x0096fe08
0096fd30	cbz x21,0x0096fe14
0096fd34	ldrb w8,[x26, #0x3]
0096fd38	tbz w8,#0x4,0x0096fe14
0096fd3c	ldr x8,[x28]
0096fd40	cbz x8,0x0096fd50
0096fd44	ldr w8,[x8, #0x8]
0096fd48	cmp w8,#0x1
0096fd4c	b.lt 0x0096fe14
0096fd50	ldr x8,[x19]
0096fd54	ldr w8,[x8, #0xc]
0096fd58	cmp w8,#0x1
0096fd5c	b.lt 0x0096fe14
0096fd60	adrp x2,0x2a5000
0096fd64	add x2,x2,#0x6ed
0096fd68	b 0x0096fe08
0096fd6c	cbz x21,0x0096fec8
0096fd70	ldrb w8,[x26, #0x3]
0096fd74	tbz w8,#0x4,0x0096fec8
0096fd78	ldr x8,[x28]
0096fd7c	cbz x8,0x0096fea0
0096fd80	cbz x19,0x0096fec8
0096fd84	ldr w8,[x8, #0x8]
0096fd88	cmp w8,#0x0
0096fd8c	b.gt 0x0096fea4
0096fd90	b 0x0096fec8
0096fd94	cbz x21,0x0096fe14
0096fd98	ldrb w8,[x26, #0x3]
0096fd9c	tbz w8,#0x4,0x0096fe14
0096fda0	ldr x8,[x28]
0096fda4	cbz x8,0x0096fed4
0096fda8	cbz x19,0x0096fe14
0096fdac	ldr w8,[x8, #0x8]
0096fdb0	cmp w8,#0x0
0096fdb4	b.gt 0x0096fed8
0096fdb8	b 0x0096fe14
0096fdbc	bl 0x00c32400
0096fdc0	mov x23,x0
0096fdc4	cbz x21,0x0096fe14
0096fdc8	ldrb w8,[x26, #0x3]
0096fdcc	tbz w8,#0x4,0x0096fe14
0096fdd0	ldr x8,[x28]
0096fdd4	cbz x8,0x0096fef4
0096fdd8	cbz x19,0x0096fe14
0096fddc	ldr w8,[x8, #0x8]
0096fde0	cmp w8,#0x0
0096fde4	b.gt 0x0096fef8
0096fde8	b 0x0096fe14
0096fdec	cbz x19,0x0096fe14
0096fdf0	ldr x8,[x19]
0096fdf4	ldr w8,[x8, #0xc]
0096fdf8	cmp w8,#0x1
0096fdfc	b.lt 0x0096fe14
0096fe00	adrp x2,0x2c5000
0096fe04	add x2,x2,#0x361
0096fe08	mov x0,x21
0096fe0c	mov x1,x19
0096fe10	bl 0x00904ddc
0096fe14	mov w8,#0x1
0096fe18	strb w8,[x20]
0096fe1c	ldr x10,[sp, #0x8]
0096fe20	add x11,sp,#0x10
0096fe24	ldrb w8,[x19, #0x24]
0096fe28	ldrb w9,[x20]
0096fe2c	and w8,w8,#0xfffffffd
0096fe30	orr w8,w8,w9, LSL #0x1
0096fe34	strb w8,[x19, #0x24]
0096fe38	ldr x8,[x10, #0x28]
0096fe3c	ldr x9,[x11]
0096fe40	cmp x8,x9
0096fe44	b.ne 0x0096ffe4
0096fe48	mov w0,wzr
0096fe4c	add sp,sp,#0x430
0096fe50	ldp x29,x30,[sp, #0x50]
0096fe54	ldp x20,x19,[sp, #0x40]
0096fe58	ldp x22,x21,[sp, #0x30]
0096fe5c	ldp x24,x23,[sp, #0x20]
0096fe60	ldp x26,x25,[sp, #0x10]
0096fe64	ldp x28,x27,[sp], #0x60
0096fe68	ret
0096fe6c	cbz x19,0x0096fe94
0096fe70	ldr x8,[x19]
0096fe74	ldr w8,[x8, #0xc]
0096fe78	cmp w8,#0x1
0096fe7c	b.lt 0x0096fe94
0096fe80	adrp x2,0x2d7000
0096fe84	add x2,x2,#0x69a
0096fe88	mov x0,x21
0096fe8c	mov x1,x19
0096fe90	bl 0x00904ddc
0096fe94	mov w8,#0x1
0096fe98	str w8,[x27, #0x58]
0096fe9c	b 0x0096fe1c
0096fea0	cbz x19,0x0096fec8
0096fea4	ldr x8,[x19]
0096fea8	ldr w8,[x8, #0xc]
0096feac	cmp w8,#0x1
0096feb0	b.lt 0x0096fec8
0096feb4	adrp x2,0x2c5000
0096feb8	add x2,x2,#0x381
0096febc	mov x0,x21
0096fec0	mov x1,x19
0096fec4	bl 0x00904ddc
0096fec8	mov w8,#0x2
0096fecc	str w8,[x27, #0x58]
0096fed0	b 0x0096fe1c
0096fed4	cbz x19,0x0096fe14
0096fed8	ldr x8,[x19]
0096fedc	ldr w8,[x8, #0xc]
0096fee0	cmp w8,#0x1
0096fee4	b.lt 0x0096fe14
0096fee8	adrp x2,0x2a5000
0096feec	add x2,x2,#0x710
0096fef0	b 0x0096fe08
0096fef4	cbz x19,0x0096fe14
0096fef8	ldr x8,[x19]
0096fefc	ldr w8,[x8, #0xc]
0096ff00	cmp w8,#0x1
0096ff04	b.lt 0x0096fe14
0096ff08	cbz x23,0x0096ffa0
0096ff0c	orr w0,wzr,#0x6
0096ff10	add x22,sp,#0x20
0096ff14	strb wzr,[sp, #0x20]
0096ff18	bl 0x00c32620
0096ff1c	adrp x2,0x2a5000
0096ff20	adrp x3,0x2db000
0096ff24	mov x4,x0
0096ff28	add x2,x2,#0x600
0096ff2c	add x3,x3,#0x707
0096ff30	add x0,sp,#0x20
0096ff34	mov w1,#0x400
0096ff38	mov w24,#0x400
0096ff3c	bl 0x00c31b70
0096ff40	cmp w0,#0x3fd
0096ff44	b.hi 0x0096ff64
0096ff48	sxtw x8,w0
0096ff4c	mov w9,#0x203a
0096ff50	strh w9,[x22, x8#0x0]
0096ff54	add x22,x22,x8
0096ff58	orr w9,wzr,#0x3fe
0096ff5c	strb wzr,[x22, #0x2]!
0096ff60	sub x24,x9,x8
0096ff64	mov x0,x23
0096ff68	mov x1,x22
0096ff6c	mov x2,x24
0096ff70	bl 0x00c323f0
0096ff74	cmp x24,#0xe
0096ff78	b.cc 0x0096ffc0
0096ff7c	ldrb w8,[x22]
0096ff80	cbnz w8,0x0096ffc0
0096ff84	adrp x8,0x2a7000
0096ff88	add x8,x8,#0x503
0096ff8c	ldur x9,[x8, #0x6]
0096ff90	ldr x8,[x8]
0096ff94	stur x9,[x22, #0x6]
0096ff98	str x8,[x22]
0096ff9c	b 0x0096ffc0
0096ffa0	cmp w22,#0xa
0096ffa4	b.hi 0x0096ffb8
0096ffa8	adrp x8,0xc51000
0096ffac	add x8,x8,#0x700
0096ffb0	ldr x22,[x8, w22, SXTW #0x3]
0096ffb4	b 0x0096ffc0
0096ffb8	adrp x22,0x2ab000
0096ffbc	add x22,x22,#0x944
0096ffc0	bl 0x00c30710
0096ffc4	ldr w4,[x0]
0096ffc8	adrp x2,0x2a7000
0096ffcc	add x2,x2,#0x6ea
0096ffd0	mov x0,x21
0096ffd4	mov x1,x19
0096ffd8	mov x3,x22
0096ffdc	bl 0x00904ddc
0096ffe0	b 0x0096fe14
0096ffe4	bl 0x00c2fec0
