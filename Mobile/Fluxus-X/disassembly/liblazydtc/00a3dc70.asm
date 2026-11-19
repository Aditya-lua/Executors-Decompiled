; ossl_ecx_key_dup @ 00a3dc70
00a3dc70	str x21,[sp, #-0x30]!
00a3dc74	mov w21,w1
00a3dc78	adrp x1,0x2a0000
00a3dc7c	stp x20,x19,[sp, #0x10]
00a3dc80	mov x20,x0
00a3dc84	add x1,x1,#0x174
00a3dc88	orr w0,wzr,#0x70
00a3dc8c	mov w2,#0x6f
00a3dc90	stp x29,x30,[sp, #0x20]
00a3dc94	add x29,sp,#0x20
00a3dc98	bl 0x00c34250
00a3dc9c	mov x19,x0
00a3dca0	cbz x0,0x00a3dd60
00a3dca4	bl 0x00c34d50
00a3dca8	str x0,[x19, #0x68]
00a3dcac	cbz x0,0x00a3dd94
00a3dcb0	ldr x8,[x20]
00a3dcb4	ldrb w9,[x19, #0x10]
00a3dcb8	mov w10,#0x1
00a3dcbc	str x8,[x19]
00a3dcc0	and w8,w9,#0xfe
00a3dcc4	strb w8,[x19, #0x10]
00a3dcc8	ldr x8,[x20, #0x58]
00a3dccc	add x9,x19,#0x64
00a3dcd0	str x8,[x19, #0x58]
00a3dcd4	ldr w8,[x20, #0x60]
00a3dcd8	str w8,[x19, #0x60]
00a3dcdc	stlr w10,[x9]
00a3dce0	ldr x0,[x20, #0x8]
00a3dce4	cbz x0,0x00a3dd00
00a3dce8	adrp x1,0x2a0000
00a3dcec	add x1,x1,#0x174
00a3dcf0	mov w2,#0x83
00a3dcf4	bl 0x00c34600
00a3dcf8	str x0,[x19, #0x8]
00a3dcfc	cbz x0,0x00a3ddac
00a3dd00	tbz w21,#0x1,0x00a3dd38
00a3dd04	ldrb w8,[x20, #0x10]
00a3dd08	tbz w8,#0x0,0x00a3dd38
00a3dd0c	ldur q0,[x20, #0x3a]
00a3dd10	ldrb w8,[x19, #0x10]
00a3dd14	stur q0,[x19, #0x3a]
00a3dd18	ldur q0,[x20, #0x31]
00a3dd1c	orr w8,w8,#0x1
00a3dd20	stur q0,[x19, #0x31]
00a3dd24	ldur q0,[x20, #0x21]
00a3dd28	stur q0,[x19, #0x21]
00a3dd2c	ldur q0,[x20, #0x11]
00a3dd30	strb w8,[x19, #0x10]
00a3dd34	stur q0,[x19, #0x11]
00a3dd38	tbz w21,#0x0,0x00a3dde8
00a3dd3c	ldr x8,[x20, #0x50]
00a3dd40	cbz x8,0x00a3dde8
00a3dd44	mov x0,x19
00a3dd48	bl 0x00c3b260
00a3dd4c	cbz x0,0x00a3ddac
00a3dd50	ldr x1,[x20, #0x50]
00a3dd54	ldp x0,x2,[x19, #0x50]
00a3dd58	bl 0x00c2ffd0
00a3dd5c	b 0x00a3dde8
00a3dd60	bl 0x00c342a0
00a3dd64	adrp x0,0x2a0000
00a3dd68	adrp x2,0x2b7000
00a3dd6c	add x0,x0,#0x174
00a3dd70	add x2,x2,#0xb3f
00a3dd74	mov w1,#0x72
00a3dd78	bl 0x00c342b0
00a3dd7c	mov w1,#0x100
00a3dd80	mov w0,#0x10
00a3dd84	movk w1,#0xc, LSL #16
00a3dd88	mov x2,xzr
00a3dd8c	bl 0x00c342c0
00a3dd90	b 0x00a3dde8
00a3dd94	adrp x1,0x2a0000
00a3dd98	add x1,x1,#0x174
00a3dd9c	orr w2,wzr,#0x78
00a3dda0	mov x0,x19
00a3dda4	bl 0x00c32310
00a3dda8	b 0x00a3dde4
00a3ddac	mov x0,x19
00a3ddb0	bl 0x00c3b270
00a3ddb4	bl 0x00c342a0
00a3ddb8	adrp x0,0x2a0000
00a3ddbc	adrp x2,0x2b7000
00a3ddc0	add x0,x0,#0x174
00a3ddc4	add x2,x2,#0xb3f
00a3ddc8	mov w1,#0x99
00a3ddcc	bl 0x00c342b0
00a3ddd0	mov w1,#0x100
00a3ddd4	mov w0,#0x10
00a3ddd8	movk w1,#0xc, LSL #16
00a3dddc	mov x2,xzr
00a3dde0	bl 0x00c342c0
00a3dde4	mov x19,xzr
00a3dde8	mov x0,x19
00a3ddec	ldp x29,x30,[sp, #0x20]
00a3ddf0	ldp x20,x19,[sp, #0x10]
00a3ddf4	ldr x21,[sp], #0x30
00a3ddf8	ret
