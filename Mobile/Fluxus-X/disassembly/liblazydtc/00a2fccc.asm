; ossl_ec_key_new_method_int @ 00a2fccc
00a2fccc	stp x22,x21,[sp, #-0x30]!
00a2fcd0	mov x21,x1
00a2fcd4	adrp x1,0x2cd000
00a2fcd8	stp x20,x19,[sp, #0x10]
00a2fcdc	mov x20,x2
00a2fce0	mov x22,x0
00a2fce4	add x1,x1,#0x943
00a2fce8	orr w0,wzr,#0x70
00a2fcec	mov w2,#0x54
00a2fcf0	stp x29,x30,[sp, #0x20]
00a2fcf4	add x29,sp,#0x20
00a2fcf8	bl 0x00c34250
00a2fcfc	mov x19,x0
00a2fd00	cbz x0,0x00a2fd64
00a2fd04	str x22,[x19, #0x58]
00a2fd08	cbz x21,0x00a2fd28
00a2fd0c	adrp x1,0x2cd000
00a2fd10	add x1,x1,#0x943
00a2fd14	mov w2,#0x5d
00a2fd18	mov x0,x21
00a2fd1c	bl 0x00c34600
00a2fd20	str x0,[x19, #0x60]
00a2fd24	cbz x0,0x00a2fdb4
00a2fd28	add x8,x19,#0x38
00a2fd2c	mov w9,#0x1
00a2fd30	stlr w9,[x8]
00a2fd34	bl 0x00c34d50
00a2fd38	str x0,[x19, #0x50]
00a2fd3c	cbz x0,0x00a2fd98
00a2fd40	adrp x8,0xcc8000
00a2fd44	ldr x8,[x8, #0x978]
00a2fd48	str x8,[x19]
00a2fd4c	cbz x20,0x00a2fde0
00a2fd50	mov x0,x20
00a2fd54	bl 0x00c323b0
00a2fd58	cbz w0,0x00a2fe6c
00a2fd5c	str x20,[x19, #0x8]
00a2fd60	b 0x00a2fdf0
00a2fd64	bl 0x00c342a0
00a2fd68	adrp x0,0x2cd000
00a2fd6c	adrp x2,0x2a5000
00a2fd70	add x0,x0,#0x943
00a2fd74	add x2,x2,#0xe2c
00a2fd78	mov w1,#0x57
00a2fd7c	bl 0x00c342b0
00a2fd80	mov w1,#0x100
00a2fd84	mov w0,#0x10
00a2fd88	movk w1,#0xc, LSL #16
00a2fd8c	mov x2,xzr
00a2fd90	bl 0x00c342c0
00a2fd94	b 0x00a2fec4
00a2fd98	bl 0x00c342a0
00a2fd9c	adrp x0,0x2cd000
00a2fda0	adrp x2,0x2a5000
00a2fda4	add x0,x0,#0x943
00a2fda8	add x2,x2,#0xe2c
00a2fdac	mov w1,#0x67
00a2fdb0	b 0x00a2fdcc
00a2fdb4	bl 0x00c342a0
00a2fdb8	adrp x0,0x2cd000
00a2fdbc	adrp x2,0x2a5000
00a2fdc0	add x0,x0,#0x943
00a2fdc4	add x2,x2,#0xe2c
00a2fdc8	mov w1,#0x5f
00a2fdcc	bl 0x00c342b0
00a2fdd0	mov w1,#0x100
00a2fdd4	mov w0,#0x10
00a2fdd8	movk w1,#0xc, LSL #16
00a2fddc	b 0x00a2feb0
00a2fde0	bl 0x00c3b040
00a2fde4	mov x20,x0
00a2fde8	str x0,[x19, #0x8]
00a2fdec	cbz x0,0x00a2fe00
00a2fdf0	mov x0,x20
00a2fdf4	bl 0x00c3b030
00a2fdf8	str x0,[x19]
00a2fdfc	cbz x0,0x00a2fe88
00a2fe00	mov w8,#0x1
00a2fe04	mov w9,#0x4
00a2fe08	add x2,x19,#0x40
00a2fe0c	mov w0,#0x8
00a2fe10	mov x1,x19
00a2fe14	str w8,[x19, #0x10]
00a2fe18	str w9,[x19, #0x34]
00a2fe1c	bl 0x00c356e0
00a2fe20	cbz w0,0x00a2feb8
00a2fe24	ldr x8,[x19]
00a2fe28	ldr x8,[x8, #0x10]
00a2fe2c	cbz x8,0x00a2fec4
00a2fe30	mov x0,x19
00a2fe34	blr x8
00a2fe38	cbnz w0,0x00a2fec4
00a2fe3c	bl 0x00c342a0
00a2fe40	adrp x0,0x2cd000
00a2fe44	adrp x2,0x2a5000
00a2fe48	add x0,x0,#0x943
00a2fe4c	add x2,x2,#0xe2c
00a2fe50	mov w1,#0x89
00a2fe54	bl 0x00c342b0
00a2fe58	mov w8,#0x100
00a2fe5c	movk w8,#0xc, LSL #16
00a2fe60	add w1,w8,#0x5
00a2fe64	mov w0,#0x10
00a2fe68	b 0x00a2feb0
00a2fe6c	bl 0x00c342a0
00a2fe70	adrp x0,0x2cd000
00a2fe74	adrp x2,0x2a5000
00a2fe78	add x0,x0,#0x943
00a2fe7c	add x2,x2,#0xe2c
00a2fe80	mov w1,#0x6f
00a2fe84	b 0x00a2fea0
00a2fe88	bl 0x00c342a0
00a2fe8c	adrp x0,0x2cd000
00a2fe90	adrp x2,0x2a5000
00a2fe94	add x0,x0,#0x943
00a2fe98	add x2,x2,#0xe2c
00a2fe9c	orr w1,wzr,#0x78
00a2fea0	bl 0x00c342b0
00a2fea4	mov w1,#0x26
00a2fea8	mov w0,#0x10
00a2feac	movk w1,#0x8, LSL #16
00a2feb0	mov x2,xzr
00a2feb4	bl 0x00c342c0
00a2feb8	mov x0,x19
00a2febc	bl 0x00c3a7c0
00a2fec0	mov x19,xzr
00a2fec4	mov x0,x19
00a2fec8	ldp x29,x30,[sp, #0x20]
00a2fecc	ldp x20,x19,[sp, #0x10]
00a2fed0	ldp x22,x21,[sp], #0x30
00a2fed4	ret
