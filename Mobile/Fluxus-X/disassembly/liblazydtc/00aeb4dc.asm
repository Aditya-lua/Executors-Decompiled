; OSSL_STORE_LOADER_get0_properties @ 00aeb4dc
00aeb4dc	cbz x0,0x00aeb4e8
00aeb4e0	ldr x0,[x0, #0x70]
00aeb4e4	ret
00aeb4e8	stp x29,x30,[sp, #-0x10]!
00aeb4ec	mov x29,sp
00aeb4f0	bl 0x00c342a0
00aeb4f4	adrp x0,0x2d0000
00aeb4f8	adrp x2,0x2ae000
00aeb4fc	add x0,x0,#0x406
00aeb500	add x2,x2,#0x692
00aeb504	mov w1,#0x1ca
00aeb508	bl 0x00c342b0
00aeb50c	mov w1,#0x102
00aeb510	mov w0,#0x2c
00aeb514	movk w1,#0xc, LSL #16
00aeb518	mov x2,xzr
00aeb51c	bl 0x00c342c0
00aeb520	mov x0,xzr
00aeb524	ldp x29,x30,[sp], #0x10
00aeb528	ret
