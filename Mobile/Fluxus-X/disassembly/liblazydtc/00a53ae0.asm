; ENGINE_get_pkey_meth @ 00a53ae0
00a53ae0	sub sp,sp,#0x20
00a53ae4	stp x29,x30,[sp, #0x10]
00a53ae8	ldr x8,[x0, #0x48]
00a53aec	add x29,sp,#0x10
00a53af0	cbz x8,0x00a53b10
00a53af4	mov w3,w1
00a53af8	add x1,sp,#0x8
00a53afc	mov x2,xzr
00a53b00	blr x8
00a53b04	cbz w0,0x00a53b10
00a53b08	ldr x0,[sp, #0x8]
00a53b0c	b 0x00a53b40
00a53b10	bl 0x00c342a0
00a53b14	adrp x0,0x2cb000
00a53b18	adrp x2,0x2bf000
00a53b1c	add x0,x0,#0x8b8
00a53b20	add x2,x2,#0xc22
00a53b24	mov w1,#0x4f
00a53b28	bl 0x00c342b0
00a53b2c	mov w0,#0x26
00a53b30	mov w1,#0x65
00a53b34	mov x2,xzr
00a53b38	bl 0x00c342c0
00a53b3c	mov x0,xzr
00a53b40	ldp x29,x30,[sp, #0x10]
00a53b44	add sp,sp,#0x20
00a53b48	ret
