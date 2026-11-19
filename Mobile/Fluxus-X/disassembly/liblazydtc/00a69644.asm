; EVP_CIPHER_do_all @ 00a69644
00a69644	sub sp,sp,#0x30
00a69648	stp x20,x19,[sp, #0x10]
00a6964c	mov x19,x1
00a69650	mov x20,x0
00a69654	mov w0,#0x4
00a69658	mov x1,xzr
00a6965c	stp x29,x30,[sp, #0x20]
00a69660	add x29,sp,#0x20
00a69664	bl 0x00c35500
00a69668	adrp x1,0xa69000
00a6966c	add x1,x1,#0x690
00a69670	mov w0,#0x2
00a69674	mov x2,sp
00a69678	stp x19,x20,[sp]
00a6967c	bl 0x00c3d830
00a69680	ldp x29,x30,[sp, #0x20]
00a69684	ldp x20,x19,[sp, #0x10]
00a69688	add sp,sp,#0x30
00a6968c	ret
