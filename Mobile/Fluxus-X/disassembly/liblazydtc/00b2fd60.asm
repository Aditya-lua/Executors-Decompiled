; ossl_blake2s_init_key @ 00b2fd60
00b2fd60	sub sp,sp,#0x70
00b2fd64	str x21,[sp, #0x40]
00b2fd68	stp x20,x19,[sp, #0x50]
00b2fd6c	mov x20,x2
00b2fd70	mov x21,x1
00b2fd74	mov x19,x0
00b2fd78	add x0,x0,#0x20
00b2fd7c	mov w2,#0x58
00b2fd80	mov w1,wzr
00b2fd84	stp x29,x30,[sp, #0x60]
00b2fd88	add x29,sp,#0x60
00b2fd8c	bl 0x00c301c0
00b2fd90	adrp x8,0x364000
00b2fd94	add x8,x8,#0xd70
00b2fd98	ldp q1,q0,[x8]
00b2fd9c	mov w9,#0xe667
00b2fda0	movk w9,#0x6a09, LSL #16
00b2fda4	mov x0,sp
00b2fda8	stp q1,q0,[x19]
00b2fdac	ldrb w8,[x21]
00b2fdb0	movi v0.2D,#0x0
00b2fdb4	mov x1,x20
00b2fdb8	str x8,[x19, #0x78]
00b2fdbc	ldr w8,[x21]
00b2fdc0	eor w8,w8,w9
00b2fdc4	str w8,[x19]
00b2fdc8	ldr w8,[x21, #0x4]
00b2fdcc	mov w9,#0xae85
00b2fdd0	movk w9,#0xbb67, LSL #16
00b2fdd4	eor w8,w8,w9
00b2fdd8	str w8,[x19, #0x4]
00b2fddc	ldr w8,[x21, #0x8]
00b2fde0	mov w9,#0xf372
00b2fde4	movk w9,#0x3c6e, LSL #16
00b2fde8	eor w8,w8,w9
00b2fdec	str w8,[x19, #0x8]
00b2fdf0	ldr w8,[x21, #0xc]
00b2fdf4	mov w9,#0xf53a
00b2fdf8	movk w9,#0xa54f, LSL #16
00b2fdfc	eor w8,w8,w9
00b2fe00	str w8,[x19, #0xc]
00b2fe04	ldr w8,[x21, #0x10]
00b2fe08	mov w9,#0x527f
00b2fe0c	movk w9,#0x510e, LSL #16
00b2fe10	eor w8,w8,w9
00b2fe14	str w8,[x19, #0x10]
00b2fe18	ldr w8,[x21, #0x14]
00b2fe1c	mov w9,#0x688c
00b2fe20	movk w9,#0x9b05, LSL #16
00b2fe24	eor w8,w8,w9
00b2fe28	str w8,[x19, #0x14]
00b2fe2c	ldr w8,[x21, #0x18]
00b2fe30	mov w9,#0xd9ab
00b2fe34	movk w9,#0x1f83, LSL #16
00b2fe38	eor w8,w8,w9
00b2fe3c	str w8,[x19, #0x18]
00b2fe40	ldr w8,[x21, #0x1c]
00b2fe44	mov w9,#0xcd19
00b2fe48	movk w9,#0x5be0, LSL #16
00b2fe4c	eor w8,w8,w9
00b2fe50	str w8,[x19, #0x1c]
00b2fe54	stp q0,q0,[sp, #0x20]
00b2fe58	stp q0,q0,[sp]
00b2fe5c	ldrb w2,[x21, #0x1]
00b2fe60	bl 0x00c2ffd0
00b2fe64	ldr q0,[sp, #0x30]
00b2fe68	mov w8,#0x40
00b2fe6c	mov x0,sp
00b2fe70	mov w1,#0x40
00b2fe74	str q0,[x19, #0x60]
00b2fe78	ldr q0,[sp, #0x20]
00b2fe7c	str q0,[x19, #0x50]
00b2fe80	ldr q0,[sp, #0x10]
00b2fe84	str q0,[x19, #0x40]
00b2fe88	ldr q0,[sp]
00b2fe8c	str x8,[x19, #0x70]
00b2fe90	str q0,[x19, #0x30]
00b2fe94	bl 0x00c34750
00b2fe98	ldp x29,x30,[sp, #0x60]
00b2fe9c	ldp x20,x19,[sp, #0x50]
00b2fea0	ldr x21,[sp, #0x40]
00b2fea4	mov w0,#0x1
00b2fea8	add sp,sp,#0x70
00b2feac	ret
