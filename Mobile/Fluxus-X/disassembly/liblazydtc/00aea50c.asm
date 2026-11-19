; OSSL_STORE_INFO_new_CRL @ 00aea50c
00aea50c	str x19,[sp, #-0x20]!
00aea510	adrp x1,0x2c2000
00aea514	mov x19,x0
00aea518	add x1,x1,#0x3bd
00aea51c	orr w0,wzr,#0x18
00aea520	mov w2,#0x220
00aea524	stp x29,x30,[sp, #0x10]
00aea528	add x29,sp,#0x10
00aea52c	bl 0x00c34250
00aea530	cbz x0,0x00aea544
00aea534	orr w8,wzr,#0x6
00aea538	str w8,[x0]
00aea53c	str x19,[x0, #0x8]
00aea540	b 0x00aea578
00aea544	bl 0x00c342a0
00aea548	adrp x0,0x2c2000
00aea54c	adrp x2,0x2c8000
00aea550	add x0,x0,#0x3bd
00aea554	add x2,x2,#0x2a8
00aea558	mov w1,#0x26d
00aea55c	bl 0x00c342b0
00aea560	mov w1,#0x100
00aea564	mov w0,#0x2c
00aea568	movk w1,#0xc, LSL #16
00aea56c	mov x2,xzr
00aea570	bl 0x00c342c0
00aea574	mov x0,xzr
00aea578	ldp x29,x30,[sp, #0x10]
00aea57c	ldr x19,[sp], #0x20
00aea580	ret
