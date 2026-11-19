; COMP_CTX_new @ 00a0bdc4
00a0bdc4	stp x20,x19,[sp, #-0x20]!
00a0bdc8	adrp x1,0x2d9000
00a0bdcc	mov x20,x0
00a0bdd0	add x1,x1,#0x9e3
00a0bdd4	orr w0,wzr,#0x30
00a0bdd8	mov w2,#0x16
00a0bddc	stp x29,x30,[sp, #0x10]
00a0bde0	add x29,sp,#0x10
00a0bde4	bl 0x00c34250
00a0bde8	mov x19,x0
00a0bdec	cbz x0,0x00a0be24
00a0bdf0	str x20,[x19]
00a0bdf4	ldr x8,[x20, #0x10]
00a0bdf8	cbz x8,0x00a0be54
00a0bdfc	mov x0,x19
00a0be00	blr x8
00a0be04	cbnz w0,0x00a0be54
00a0be08	adrp x1,0x2d9000
00a0be0c	add x1,x1,#0x9e3
00a0be10	orr w2,wzr,#0x1c
00a0be14	mov x0,x19
00a0be18	bl 0x00c32310
00a0be1c	mov x19,xzr
00a0be20	b 0x00a0be54
00a0be24	bl 0x00c342a0
00a0be28	adrp x0,0x2d9000
00a0be2c	adrp x2,0x2b9000
00a0be30	add x0,x0,#0x9e3
00a0be34	add x2,x2,#0xb85
00a0be38	mov w1,#0x17
00a0be3c	bl 0x00c342b0
00a0be40	mov w1,#0x100
00a0be44	mov w0,#0x29
00a0be48	movk w1,#0xc, LSL #16
00a0be4c	mov x2,xzr
00a0be50	bl 0x00c342c0
00a0be54	ldp x29,x30,[sp, #0x10]
00a0be58	mov x0,x19
00a0be5c	ldp x20,x19,[sp], #0x20
00a0be60	ret
