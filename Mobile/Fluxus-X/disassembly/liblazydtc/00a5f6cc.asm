; EVP_MD_get_block_size @ 00a5f6cc
00a5f6cc	cbz x0,0x00a5f6d8
00a5f6d0	ldr w0,[x0, #0x48]
00a5f6d4	ret
00a5f6d8	stp x29,x30,[sp, #-0x10]!
00a5f6dc	mov x29,sp
00a5f6e0	bl 0x00c342a0
00a5f6e4	adrp x0,0x2a0000
00a5f6e8	adrp x2,0x2bb000
00a5f6ec	add x0,x0,#0x246
00a5f6f0	add x2,x2,#0xc71
00a5f6f4	mov w1,#0x31d
00a5f6f8	bl 0x00c342b0
00a5f6fc	orr w0,wzr,#0x6
00a5f700	mov w1,#0x9f
00a5f704	mov x2,xzr
00a5f708	bl 0x00c342c0
00a5f70c	mov w0,#0xffffffff
00a5f710	ldp x29,x30,[sp], #0x10
00a5f714	ret
