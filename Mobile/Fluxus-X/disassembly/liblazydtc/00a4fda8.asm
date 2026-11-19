; OSSL_DECODER_CTX_new_for_pkey @ 00a4fda8
00a4fda8	stp x26,x25,[sp, #-0x50]!
00a4fdac	stp x24,x23,[sp, #0x10]
00a4fdb0	stp x22,x21,[sp, #0x20]
00a4fdb4	stp x20,x19,[sp, #0x30]
00a4fdb8	stp x29,x30,[sp, #0x40]
00a4fdbc	add x29,sp,#0x40
00a4fdc0	mov x20,x6
00a4fdc4	mov x21,x5
00a4fdc8	mov w24,w4
00a4fdcc	mov x22,x3
00a4fdd0	mov x25,x2
00a4fdd4	mov x26,x1
00a4fdd8	mov x23,x0
00a4fddc	bl 0x00c3b4d0
00a4fde0	mov x19,x0
00a4fde4	cbz x0,0x00a4fe58
00a4fde8	mov x0,x19
00a4fdec	mov x1,x26
00a4fdf0	bl 0x00c3b370
00a4fdf4	cbz w0,0x00a4fe48
00a4fdf8	mov x0,x19
00a4fdfc	mov x1,x25
00a4fe00	bl 0x00c3b360
00a4fe04	cbz w0,0x00a4fe48
00a4fe08	mov x0,x19
00a4fe0c	mov w1,w24
00a4fe10	bl 0x00c3b380
00a4fe14	cbz w0,0x00a4fe48
00a4fe18	mov x0,x19
00a4fe1c	mov x1,x23
00a4fe20	mov x2,x22
00a4fe24	mov x3,x21
00a4fe28	mov x4,x20
00a4fe2c	bl 0x00a4f6d4
00a4fe30	cbz w0,0x00a4fe48
00a4fe34	mov x0,x19
00a4fe38	mov x1,x21
00a4fe3c	mov x2,x20
00a4fe40	bl 0x00c3b310
00a4fe44	cbnz w0,0x00a4fe88
00a4fe48	mov x0,x19
00a4fe4c	bl 0x00c35f00
00a4fe50	mov x19,xzr
00a4fe54	b 0x00a4fe88
00a4fe58	bl 0x00c342a0
00a4fe5c	adrp x0,0x2c5000
00a4fe60	adrp x2,0x2c5000
00a4fe64	add x0,x0,#0x9ce
00a4fe68	add x2,x2,#0x9f2
00a4fe6c	mov w1,#0x1b7
00a4fe70	bl 0x00c342b0
00a4fe74	mov w1,#0x100
00a4fe78	orr w0,wzr,#0x3c
00a4fe7c	movk w1,#0xc, LSL #16
00a4fe80	mov x2,xzr
00a4fe84	bl 0x00c342c0
00a4fe88	mov x0,x19
00a4fe8c	ldp x29,x30,[sp, #0x40]
00a4fe90	ldp x20,x19,[sp, #0x30]
00a4fe94	ldp x22,x21,[sp, #0x20]
00a4fe98	ldp x24,x23,[sp, #0x10]
00a4fe9c	ldp x26,x25,[sp], #0x50
00a4fea0	ret
