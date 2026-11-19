; FUN_00a3fd34 @ 00a3fd34
00a3fd34	stp x28,x27,[sp, #-0x60]!
00a3fd38	stp x26,x25,[sp, #0x10]
00a3fd3c	stp x24,x23,[sp, #0x20]
00a3fd40	stp x22,x21,[sp, #0x30]
00a3fd44	stp x20,x19,[sp, #0x40]
00a3fd48	stp x29,x30,[sp, #0x50]
00a3fd4c	add x29,sp,#0x50
00a3fd50	sub sp,sp,#0x1f0
00a3fd54	ldr q0,[x1]
00a3fd58	movi v1.16B,#0xf
00a3fd5c	add x10,sp,#0x120
00a3fd60	mov x19,x0
00a3fd64	and v2.16B,v0.16B,v1.16B
00a3fd68	ushr v3.16B,v0.16B,#0x4
00a3fd6c	st2 {v2.16B,v3.16B},[x10], #0x20
00a3fd70	ldr q0,[x1, #0x10]
00a3fd74	mov x9,xzr
00a3fd78	mov w8,wzr
00a3fd7c	and v1.16B,v0.16B,v1.16B
00a3fd80	ushr v2.16B,v0.16B,#0x4
00a3fd84	st2 {v1.16B,v2.16B},[x10]
00a3fd88	add x10,sp,#0x120
00a3fd8c	ldrb w11,[x10, x9]
00a3fd90	add w8,w11,w8
00a3fd94	add w11,w8,#0x8
00a3fd98	and w12,w11,#0xf0
00a3fd9c	sub w8,w8,w12
00a3fda0	strb w8,[x10, x9]
00a3fda4	add x9,x9,#0x1
00a3fda8	cmp x9,#0x3f
00a3fdac	sbfx w8,w11,#0x4,#0x4
00a3fdb0	b.ne 0x00a3fd8c
00a3fdb4	ldrb w9,[sp, #0x15f]
00a3fdb8	movi v0.2D,#0x0
00a3fdbc	mov w28,#0x1
00a3fdc0	mov x20,x19
00a3fdc4	orr x10,xzr,#0x100000000
00a3fdc8	mov x22,x19
00a3fdcc	add x11,sp,#0x80
00a3fdd0	add w8,w9,w8
00a3fdd4	mov w26,wzr
00a3fdd8	add x21,x19,#0x50
00a3fddc	add x23,x11,#0x78
00a3fde0	strb w8,[sp, #0x15f]
00a3fde4	add x24,x11,#0x28
00a3fde8	add x25,x11,#0x50
00a3fdec	str xzr,[x19, #0x20]
00a3fdf0	stp q0,q0,[x19]
00a3fdf4	str w28,[x20, #0x28]!
00a3fdf8	stur q0,[x19, #0x3c]
00a3fdfc	stur q0,[x19, #0x2c]
00a3fe00	stur x10,[x19, #0x4c]
00a3fe04	stur q0,[x19, #0x64]
00a3fe08	stur q0,[x19, #0x54]
00a3fe0c	str wzr,[x19, #0x74]
00a3fe10	str q0,[x22, #0x78]!
00a3fe14	add x27,sp,#0x120
00a3fe18	str xzr,[x19, #0x98]
00a3fe1c	stur q0,[x19, #0x88]
00a3fe20	ldrb w2,[x27, x28]
00a3fe24	add x0,sp,#0x8
00a3fe28	mov w1,w26
00a3fe2c	bl 0x00a45304
00a3fe30	add x0,sp,#0x80
00a3fe34	add x2,sp,#0x8
00a3fe38	mov x1,x19
00a3fe3c	bl 0x00a45d34
00a3fe40	add x1,sp,#0x80
00a3fe44	mov x0,x19
00a3fe48	mov x2,x23
00a3fe4c	bl 0x00a44e38
00a3fe50	mov x0,x20
00a3fe54	mov x1,x24
00a3fe58	mov x2,x25
00a3fe5c	bl 0x00a44e38
00a3fe60	mov x0,x21
00a3fe64	mov x1,x25
00a3fe68	mov x2,x23
00a3fe6c	bl 0x00a44e38
00a3fe70	add x1,sp,#0x80
00a3fe74	mov x0,x22
00a3fe78	mov x2,x24
00a3fe7c	bl 0x00a44e38
00a3fe80	add x28,x28,#0x2
00a3fe84	cmp x28,#0x40
00a3fe88	add w26,w26,#0x1
00a3fe8c	b.cc 0x00a3fe20
00a3fe90	ldr x8,[x19, #0x20]
00a3fe94	sub x9,x29,#0xe0
00a3fe98	add x0,sp,#0x80
00a3fe9c	sub x1,x29,#0xe0
00a3fea0	stur x8,[x29, #-0xc0]
00a3fea4	ldr q0,[x19, #0x10]
00a3fea8	sub x27,x29,#0xe0
00a3feac	str q0,[x9, #0x10]
00a3feb0	ldr q0,[x19]
00a3feb4	str q0,[x9]
00a3feb8	ldr x8,[x20, #0x20]
00a3febc	stur x8,[x29, #-0x98]
00a3fec0	ldr q0,[x20, #0x10]
00a3fec4	stur q0,[x9, #0x38]
00a3fec8	ldr q0,[x20]
00a3fecc	stur q0,[x9, #0x28]
00a3fed0	ldr q0,[x21, #0x10]
00a3fed4	str q0,[x9, #0x60]
00a3fed8	ldr x8,[x21, #0x20]
00a3fedc	stur x8,[x29, #-0x70]
00a3fee0	ldr q0,[x21]
00a3fee4	str q0,[x9, #0x50]
00a3fee8	bl 0x00a46060
00a3feec	sub x0,x29,#0xe0
00a3fef0	add x1,sp,#0x80
00a3fef4	mov x2,x23
00a3fef8	bl 0x00a44e38
00a3fefc	add x26,x27,#0x28
00a3ff00	mov x0,x26
00a3ff04	mov x1,x24
00a3ff08	mov x2,x25
00a3ff0c	bl 0x00a44e38
00a3ff10	add x27,x27,#0x50
00a3ff14	mov x0,x27
00a3ff18	mov x1,x25
00a3ff1c	mov x2,x23
00a3ff20	bl 0x00a44e38
00a3ff24	add x0,sp,#0x80
00a3ff28	sub x1,x29,#0xe0
00a3ff2c	bl 0x00a46060
00a3ff30	sub x0,x29,#0xe0
00a3ff34	add x1,sp,#0x80
00a3ff38	mov x2,x23
00a3ff3c	bl 0x00a44e38
00a3ff40	mov x0,x26
00a3ff44	mov x1,x24
00a3ff48	mov x2,x25
00a3ff4c	bl 0x00a44e38
00a3ff50	mov x0,x27
00a3ff54	mov x1,x25
00a3ff58	mov x2,x23
00a3ff5c	bl 0x00a44e38
00a3ff60	add x0,sp,#0x80
00a3ff64	sub x1,x29,#0xe0
00a3ff68	bl 0x00a46060
00a3ff6c	sub x0,x29,#0xe0
00a3ff70	add x1,sp,#0x80
00a3ff74	mov x2,x23
00a3ff78	bl 0x00a44e38
00a3ff7c	mov x0,x26
00a3ff80	mov x1,x24
00a3ff84	mov x2,x25
00a3ff88	bl 0x00a44e38
00a3ff8c	mov x0,x27
00a3ff90	mov x1,x25
00a3ff94	mov x2,x23
00a3ff98	bl 0x00a44e38
00a3ff9c	add x0,sp,#0x80
00a3ffa0	sub x1,x29,#0xe0
00a3ffa4	bl 0x00a46060
00a3ffa8	add x1,sp,#0x80
00a3ffac	mov x0,x19
00a3ffb0	mov x2,x23
00a3ffb4	bl 0x00a44e38
00a3ffb8	mov x0,x20
00a3ffbc	mov x1,x24
00a3ffc0	mov x2,x25
00a3ffc4	bl 0x00a44e38
00a3ffc8	mov x0,x21
00a3ffcc	mov x1,x25
00a3ffd0	mov x2,x23
00a3ffd4	bl 0x00a44e38
00a3ffd8	add x1,sp,#0x80
00a3ffdc	mov x0,x22
00a3ffe0	mov x2,x24
00a3ffe4	bl 0x00a44e38
00a3ffe8	mov w26,wzr
00a3ffec	mov x27,xzr
00a3fff0	add x28,sp,#0x120
00a3fff4	ldrb w2,[x28, x27]
00a3fff8	add x0,sp,#0x8
00a3fffc	mov w1,w26
00a40000	bl 0x00a45304
00a40004	add x0,sp,#0x80
00a40008	add x2,sp,#0x8
00a4000c	mov x1,x19
00a40010	bl 0x00a45d34
00a40014	add x1,sp,#0x80
00a40018	mov x0,x19
00a4001c	mov x2,x23
00a40020	bl 0x00a44e38
00a40024	mov x0,x20
00a40028	mov x1,x24
00a4002c	mov x2,x25
00a40030	bl 0x00a44e38
00a40034	mov x0,x21
00a40038	mov x1,x25
00a4003c	mov x2,x23
00a40040	bl 0x00a44e38
00a40044	add x1,sp,#0x80
00a40048	mov x0,x22
00a4004c	mov x2,x24
00a40050	bl 0x00a44e38
00a40054	add x27,x27,#0x2
00a40058	cmp x27,#0x40
00a4005c	add w26,w26,#0x1
00a40060	b.cc 0x00a3fff4
00a40064	add x0,sp,#0x120
00a40068	mov w1,#0x40
00a4006c	bl 0x00c34750
00a40070	add sp,sp,#0x1f0
00a40074	ldp x29,x30,[sp, #0x50]
00a40078	ldp x20,x19,[sp, #0x40]
00a4007c	ldp x22,x21,[sp, #0x30]
00a40080	ldp x24,x23,[sp, #0x20]
00a40084	ldp x26,x25,[sp, #0x10]
00a40088	ldp x28,x27,[sp], #0x60
00a4008c	ret
