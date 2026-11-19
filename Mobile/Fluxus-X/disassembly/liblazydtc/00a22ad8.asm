; DSO_merge @ 00a22ad8
00a22ad8	cbz x0,0x00a22b00
00a22adc	cbz x1,0x00a22b00
00a22ae0	ldrb w8,[x0, #0x14]
00a22ae4	tbnz w8,#0x0,0x00a22b44
00a22ae8	ldr x3,[x0, #0x30]
00a22aec	cbnz x3,0x00a22afc
00a22af0	ldr x8,[x0]
00a22af4	ldr x3,[x8, #0x30]
00a22af8	cbz x3,0x00a22b44
00a22afc	br x3
00a22b00	stp x29,x30,[sp, #-0x10]!
00a22b04	mov x29,sp
00a22b08	bl 0x00c342a0
00a22b0c	adrp x0,0x2a7000
00a22b10	adrp x2,0x2a5000
00a22b14	add x0,x0,#0xdd6
00a22b18	add x2,x2,#0xd6e
00a22b1c	mov w1,#0x102
00a22b20	bl 0x00c342b0
00a22b24	mov w1,#0x102
00a22b28	mov w0,#0x25
00a22b2c	movk w1,#0xc, LSL #16
00a22b30	mov x2,xzr
00a22b34	bl 0x00c342c0
00a22b38	ldp x29,x30,[sp], #0x10
00a22b3c	mov x0,xzr
00a22b40	ret
00a22b44	mov x0,xzr
00a22b48	ret
