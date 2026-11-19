; EVP_MD_get_size @ 00a5f718
00a5f718	cbz x0,0x00a5f724
00a5f71c	ldr w0,[x0, #0x8]
00a5f720	ret
00a5f724	stp x29,x30,[sp, #-0x10]!
00a5f728	mov x29,sp
00a5f72c	bl 0x00c342a0
00a5f730	adrp x0,0x2a0000
00a5f734	adrp x2,0x2bf000
00a5f738	add x0,x0,#0x246
00a5f73c	add x2,x2,#0xc94
00a5f740	mov w1,#0x326
00a5f744	bl 0x00c342b0
00a5f748	orr w0,wzr,#0x6
00a5f74c	mov w1,#0x9f
00a5f750	mov x2,xzr
00a5f754	bl 0x00c342c0
00a5f758	mov w0,#0xffffffff
00a5f75c	ldp x29,x30,[sp], #0x10
00a5f760	ret
