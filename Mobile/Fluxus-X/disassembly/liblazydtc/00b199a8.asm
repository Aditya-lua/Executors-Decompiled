; BIO_CONNECT_new @ 00b199a8
00b199a8	stp x29,x30,[sp, #-0x10]!
00b199ac	adrp x1,0x2bc000
00b199b0	add x1,x1,#0x77a
00b199b4	orr w0,wzr,#0x38
00b199b8	mov w2,#0x100
00b199bc	mov x29,sp
00b199c0	bl 0x00c34250
00b199c4	cbz x0,0x00b199dc
00b199c8	adrp x8,0x29a000
00b199cc	ldr d0,[x8, #0xd40]
00b199d0	str d0,[x0]
00b199d4	ldp x29,x30,[sp], #0x10
00b199d8	ret
00b199dc	bl 0x00c342a0
00b199e0	adrp x0,0x2bc000
00b199e4	adrp x2,0x2aa000
00b199e8	add x0,x0,#0x77a
00b199ec	add x2,x2,#0xc70
00b199f0	mov w1,#0x101
00b199f4	bl 0x00c342b0
00b199f8	mov w1,#0x100
00b199fc	mov w0,#0x20
00b19a00	movk w1,#0xc, LSL #16
00b19a04	mov x2,xzr
00b19a08	bl 0x00c342c0
00b19a0c	mov x0,xzr
00b19a10	ldp x29,x30,[sp], #0x10
00b19a14	ret
