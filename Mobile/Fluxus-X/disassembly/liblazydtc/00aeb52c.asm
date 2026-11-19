; ossl_store_loader_get_number @ 00aeb52c
00aeb52c	cbz x0,0x00aeb538
00aeb530	ldr w0,[x0, #0x68]
00aeb534	ret
00aeb538	stp x29,x30,[sp, #-0x10]!
00aeb53c	mov x29,sp
00aeb540	bl 0x00c342a0
00aeb544	adrp x0,0x2d0000
00aeb548	adrp x2,0x2dc000
00aeb54c	add x0,x0,#0x406
00aeb550	add x2,x2,#0x9bb
00aeb554	mov w1,#0x1d4
00aeb558	bl 0x00c342b0
00aeb55c	mov w1,#0x102
00aeb560	mov w0,#0x2c
00aeb564	movk w1,#0xc, LSL #16
00aeb568	mov x2,xzr
00aeb56c	bl 0x00c342c0
00aeb570	mov w0,wzr
00aeb574	ldp x29,x30,[sp], #0x10
00aeb578	ret
