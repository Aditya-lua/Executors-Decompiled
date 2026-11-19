; EVP_PKEY_get_params @ 00a6f360
00a6f360	stp x29,x30,[sp, #-0x10]!
00a6f364	mov x29,sp
00a6f368	cbz x0,0x00a6f3a8
00a6f36c	ldr x8,[x0, #0x60]
00a6f370	mov x2,x1
00a6f374	cbz x8,0x00a6f388
00a6f378	ldr x1,[x0, #0x68]
00a6f37c	mov x0,x8
00a6f380	bl 0x00c3d380
00a6f384	b 0x00a6f398
00a6f388	ldr w8,[x0]
00a6f38c	cbz w8,0x00a6f3a8
00a6f390	mov x1,x2
00a6f394	bl 0x00c3c0c0
00a6f398	cmp w0,#0x0
00a6f39c	cset w0,gt
00a6f3a0	ldp x29,x30,[sp], #0x10
00a6f3a4	ret
00a6f3a8	bl 0x00c342a0
00a6f3ac	adrp x0,0x2c1000
00a6f3b0	adrp x2,0x2c7000
00a6f3b4	add x0,x0,#0xcf9
00a6f3b8	add x2,x2,#0x9f0
00a6f3bc	mov w1,#0x961
00a6f3c0	bl 0x00c342b0
00a6f3c4	orr w0,wzr,#0x6
00a6f3c8	mov w1,#0xa3
00a6f3cc	mov x2,xzr
00a6f3d0	bl 0x00c342c0
00a6f3d4	mov w0,wzr
00a6f3d8	ldp x29,x30,[sp], #0x10
00a6f3dc	ret
