; OSSL_DECODER_CTX_set_selection @ 00a4d324
00a4d324	cbz x0,0x00a4d334
00a4d328	str w1,[x0, #0x10]
00a4d32c	mov w0,#0x1
00a4d330	ret
00a4d334	stp x29,x30,[sp, #-0x10]!
00a4d338	mov x29,sp
00a4d33c	bl 0x00c342a0
00a4d340	adrp x0,0x2bd000
00a4d344	adrp x2,0x2ad000
00a4d348	add x0,x0,#0x9db
00a4d34c	add x2,x2,#0xb66
00a4d350	mov w1,#0xa8
00a4d354	bl 0x00c342b0
00a4d358	mov w1,#0x102
00a4d35c	orr w0,wzr,#0x3c
00a4d360	movk w1,#0xc, LSL #16
00a4d364	mov x2,xzr
00a4d368	bl 0x00c342c0
00a4d36c	mov w0,wzr
00a4d370	ldp x29,x30,[sp], #0x10
00a4d374	ret
