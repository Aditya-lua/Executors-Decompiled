; FUN_00b4fc00 @ 00b4fc00
00b4fc00	sub sp,sp,#0x70
00b4fc04	stp x28,x27,[sp, #0x10]
00b4fc08	stp x26,x25,[sp, #0x20]
00b4fc0c	stp x24,x23,[sp, #0x30]
00b4fc10	stp x22,x21,[sp, #0x40]
00b4fc14	stp x20,x19,[sp, #0x50]
00b4fc18	stp x29,x30,[sp, #0x60]
00b4fc1c	add x29,sp,#0x60
00b4fc20	cbz x0,0x00b4fd30
00b4fc24	mov x28,x4
00b4fc28	mov w23,w3
00b4fc2c	mov x20,x2
00b4fc30	mov x21,x1
00b4fc34	mov x26,x0
00b4fc38	bl 0x00c36880
00b4fc3c	cbz x0,0x00b4fd30
00b4fc40	mov x24,x0
00b4fc44	mov x0,x26
00b4fc48	bl 0x00c3a7d0
00b4fc4c	mov x22,x0
00b4fc50	mov x0,x26
00b4fc54	bl 0x00c3a7e0
00b4fc58	cbz x0,0x00b4fd38
00b4fc5c	mov x25,x0
00b4fc60	mov x0,x26
00b4fc64	bl 0x00c3ad30
00b4fc68	bl 0x00c38a60
00b4fc6c	mov x19,x0
00b4fc70	cbz x0,0x00b4fe1c
00b4fc74	stp x22,xzr,[sp]
00b4fc78	mov x22,xzr
00b4fc7c	mov x27,xzr
00b4fc80	cbnz x21,0x00b4fcc4
00b4fc84	adrp x1,0x2ad000
00b4fc88	add x1,x1,#0x463
00b4fc8c	mov x0,x20
00b4fc90	bl 0x00c3e8c0
00b4fc94	adrp x1,0x2a1000
00b4fc98	mov x27,x0
00b4fc9c	add x1,x1,#0x68
00b4fca0	mov x0,x20
00b4fca4	bl 0x00c3e8c0
00b4fca8	adrp x1,0x2c6000
00b4fcac	str x0,[sp, #0x8]
00b4fcb0	add x1,x1,#0x764
00b4fcb4	mov x0,x20
00b4fcb8	bl 0x00c3e8c0
00b4fcbc	mov x22,x0
00b4fcc0	cbz x27,0x00b4fd08
00b4fcc4	mov x0,x26
00b4fcc8	bl 0x00c3a7f0
00b4fccc	mov w2,w0
00b4fcd0	mov x0,x24
00b4fcd4	mov x1,x25
00b4fcd8	mov x3,x28
00b4fcdc	mov x4,x19
00b4fce0	bl 0x00c3a8a0
00b4fce4	cbz x0,0x00b4fe1c
00b4fce8	ldr x3,[x28]
00b4fcec	adrp x2,0x2ad000
00b4fcf0	mov x4,x0
00b4fcf4	add x2,x2,#0x463
00b4fcf8	mov x0,x21
00b4fcfc	mov x1,x27
00b4fd00	bl 0x00c3adc0
00b4fd04	cbz w0,0x00b4fe1c
00b4fd08	mov x28,x22
00b4fd0c	ldr x22,[sp, #0x8]
00b4fd10	orr x8,x28,x22
00b4fd14	cbz x8,0x00b4fe0c
00b4fd18	cbz x22,0x00b4fd90
00b4fd1c	mov x0,x19
00b4fd20	bl 0x00c38a40
00b4fd24	mov x26,x0
00b4fd28	cbnz x0,0x00b4fd94
00b4fd2c	b 0x00b4fe1c
00b4fd30	mov w25,wzr
00b4fd34	b 0x00b4fe28
00b4fd38	mov x19,xzr
00b4fd3c	mov w25,#0x1
00b4fd40	cbz w23,0x00b4fe20
00b4fd44	cbz x22,0x00b4fe20
00b4fd48	mov x0,x24
00b4fd4c	bl 0x00c3a790
00b4fd50	cmp w0,#0x1
00b4fd54	b.lt 0x00b4fe1c
00b4fd58	add w8,w0,#0x7
00b4fd5c	add w9,w0,#0xe
00b4fd60	cmp w8,#0x0
00b4fd64	csel w8,w9,w8,lt
00b4fd68	adrp x2,0x2a3000
00b4fd6c	sbfx x4,x8,#0x3,#0x1d
00b4fd70	add x2,x2,#0xe83
00b4fd74	mov x0,x21
00b4fd78	mov x1,x20
00b4fd7c	mov x3,x22
00b4fd80	bl 0x00c3e8e0
00b4fd84	cbz w0,0x00b4fe1c
00b4fd88	mov w25,#0x1
00b4fd8c	b 0x00b4fe20
00b4fd90	mov x26,xzr
00b4fd94	cbz x28,0x00b4fdac
00b4fd98	mov x0,x19
00b4fd9c	bl 0x00c38a40
00b4fda0	mov x27,x0
00b4fda4	cbnz x0,0x00b4fdb0
00b4fda8	b 0x00b4fe1c
00b4fdac	mov x27,xzr
00b4fdb0	mov x0,x24
00b4fdb4	mov x1,x25
00b4fdb8	mov x2,x26
00b4fdbc	mov x3,x27
00b4fdc0	mov x4,x19
00b4fdc4	bl 0x00c3ae70
00b4fdc8	cbz w0,0x00b4fe1c
00b4fdcc	cbz x22,0x00b4fdec
00b4fdd0	adrp x2,0x2a1000
00b4fdd4	add x2,x2,#0x68
00b4fdd8	mov x0,x21
00b4fddc	mov x1,x22
00b4fde0	mov x3,x26
00b4fde4	bl 0x00c39de0
00b4fde8	cbz w0,0x00b4fe1c
00b4fdec	cbz x28,0x00b4fe0c
00b4fdf0	adrp x2,0x2c6000
00b4fdf4	add x2,x2,#0x764
00b4fdf8	mov x0,x21
00b4fdfc	mov x1,x28
00b4fe00	mov x3,x27
00b4fe04	bl 0x00c39de0
00b4fe08	cbz w0,0x00b4fe1c
00b4fe0c	ldr x22,[sp]
00b4fe10	mov w25,#0x1
00b4fe14	cbnz w23,0x00b4fd44
00b4fe18	b 0x00b4fe20
00b4fe1c	mov w25,wzr
00b4fe20	mov x0,x19
00b4fe24	bl 0x00c38a30
00b4fe28	mov w0,w25
00b4fe2c	ldp x29,x30,[sp, #0x60]
00b4fe30	ldp x20,x19,[sp, #0x50]
00b4fe34	ldp x22,x21,[sp, #0x40]
00b4fe38	ldp x24,x23,[sp, #0x30]
00b4fe3c	ldp x26,x25,[sp, #0x20]
00b4fe40	ldp x28,x27,[sp, #0x10]
00b4fe44	add sp,sp,#0x70
00b4fe48	ret
