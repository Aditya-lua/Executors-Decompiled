; X509_OBJECT_new @ 00b0a9cc
00b0a9cc	stp x29,x30,[sp, #-0x10]!
00b0a9d0	adrp x1,0x2aa000
00b0a9d4	add x1,x1,#0xba3
00b0a9d8	mov w0,#0x10
00b0a9dc	orr w2,wzr,#0x1c0
00b0a9e0	mov x29,sp
00b0a9e4	bl 0x00c34250
00b0a9e8	cbz x0,0x00b0a9f8
00b0a9ec	str wzr,[x0]
00b0a9f0	ldp x29,x30,[sp], #0x10
00b0a9f4	ret
00b0a9f8	bl 0x00c342a0
00b0a9fc	adrp x0,0x2aa000
00b0aa00	adrp x2,0x2b0000
00b0aa04	add x0,x0,#0xba3
00b0aa08	add x2,x2,#0xa62
00b0aa0c	mov w1,#0x1c3
00b0aa10	bl 0x00c342b0
00b0aa14	mov w1,#0x100
00b0aa18	mov w0,#0xb
00b0aa1c	movk w1,#0xc, LSL #16
00b0aa20	mov x2,xzr
00b0aa24	bl 0x00c342c0
00b0aa28	mov x0,xzr
00b0aa2c	ldp x29,x30,[sp], #0x10
00b0aa30	ret
