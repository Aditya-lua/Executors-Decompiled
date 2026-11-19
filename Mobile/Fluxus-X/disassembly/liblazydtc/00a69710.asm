; EVP_MD_do_all @ 00a69710
00a69710	sub sp,sp,#0x30
00a69714	stp x20,x19,[sp, #0x10]
00a69718	mov x19,x1
00a6971c	mov x20,x0
00a69720	mov w0,#0x8
00a69724	mov x1,xzr
00a69728	stp x29,x30,[sp, #0x20]
00a6972c	add x29,sp,#0x20
00a69730	bl 0x00c35500
00a69734	adrp x1,0xa69000
00a69738	add x1,x1,#0x75c
00a6973c	mov w0,#0x1
00a69740	mov x2,sp
00a69744	stp x19,x20,[sp]
00a69748	bl 0x00c3d830
00a6974c	ldp x29,x30,[sp, #0x20]
00a69750	ldp x20,x19,[sp, #0x10]
00a69754	add sp,sp,#0x30
00a69758	ret
