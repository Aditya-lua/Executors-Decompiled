; WPACKET_init_null_der @ 00a9c9c0
00a9c9c0	str x19,[sp, #-0x20]!
00a9c9c4	stp x29,x30,[sp, #0x10]
00a9c9c8	ldrb w8,[x0, #0x30]
00a9c9cc	mov x9,#-0x1
00a9c9d0	adrp x1,0x2bd000
00a9c9d4	mov x19,x0
00a9c9d8	orr w8,w8,#0x1
00a9c9dc	stp xzr,xzr,[x0]
00a9c9e0	stp xzr,x9,[x0, #0x18]
00a9c9e4	strb w8,[x0, #0x30]
00a9c9e8	str xzr,[x0, #0x10]
00a9c9ec	add x1,x1,#0xe31
00a9c9f0	mov w0,#0x28
00a9c9f4	mov w2,#0x6b
00a9c9f8	add x29,sp,#0x10
00a9c9fc	bl 0x00c34250
00a9ca00	str x0,[x19, #0x28]
00a9ca04	cbz x0,0x00a9ca10
00a9ca08	mov w0,#0x1
00a9ca0c	b 0x00a9ca44
00a9ca10	bl 0x00c342a0
00a9ca14	adrp x0,0x2bd000
00a9ca18	adrp x2,0x2b0000
00a9ca1c	add x0,x0,#0xe31
00a9ca20	add x2,x2,#0x35a
00a9ca24	mov w1,#0x6c
00a9ca28	bl 0x00c342b0
00a9ca2c	mov w1,#0x100
00a9ca30	orr w0,wzr,#0xf
00a9ca34	movk w1,#0xc, LSL #16
00a9ca38	mov x2,xzr
00a9ca3c	bl 0x00c342c0
00a9ca40	mov w0,wzr
00a9ca44	ldp x29,x30,[sp, #0x10]
00a9ca48	ldr x19,[sp], #0x20
00a9ca4c	ret
