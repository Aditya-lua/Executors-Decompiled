; DSO_bind_func @ 00a229d0
00a229d0	stp x29,x30,[sp, #-0x10]!
00a229d4	mov x29,sp
00a229d8	cbz x0,0x00a229fc
00a229dc	cbz x1,0x00a229fc
00a229e0	ldr x8,[x0]
00a229e4	ldr x8,[x8, #0x18]
00a229e8	cbz x8,0x00a22a28
00a229ec	blr x8
00a229f0	cbz x0,0x00a22a50
00a229f4	ldp x29,x30,[sp], #0x10
00a229f8	ret
00a229fc	bl 0x00c342a0
00a22a00	adrp x0,0x2a7000
00a22a04	adrp x2,0x2c1000
00a22a08	add x0,x0,#0xdd6
00a22a0c	add x2,x2,#0xac9
00a22a10	mov w1,#0xa8
00a22a14	bl 0x00c342b0
00a22a18	mov w1,#0x102
00a22a1c	mov w0,#0x25
00a22a20	movk w1,#0xc, LSL #16
00a22a24	b 0x00a22a74
00a22a28	bl 0x00c342a0
00a22a2c	adrp x0,0x2a7000
00a22a30	adrp x2,0x2c1000
00a22a34	add x0,x0,#0xdd6
00a22a38	add x2,x2,#0xac9
00a22a3c	mov w1,#0xac
00a22a40	bl 0x00c342b0
00a22a44	mov w0,#0x25
00a22a48	mov w1,#0x6c
00a22a4c	b 0x00a22a74
00a22a50	bl 0x00c342a0
00a22a54	adrp x0,0x2a7000
00a22a58	adrp x2,0x2c1000
00a22a5c	add x0,x0,#0xdd6
00a22a60	add x2,x2,#0xac9
00a22a64	mov w1,#0xb0
00a22a68	bl 0x00c342b0
00a22a6c	mov w0,#0x25
00a22a70	mov w1,#0x6a
00a22a74	mov x2,xzr
00a22a78	bl 0x00c342c0
00a22a7c	mov x0,xzr
00a22a80	ldp x29,x30,[sp], #0x10
00a22a84	ret
