; OSSL_PARAM_BLD_push_size_t @ 00a9d35c
00a9d35c	str x19,[sp, #-0x20]!
00a9d360	mov x19,x2
00a9d364	mov w2,#0x8
00a9d368	mov w3,#0x8
00a9d36c	mov w4,#0x2
00a9d370	mov w5,wzr
00a9d374	stp x29,x30,[sp, #0x10]
00a9d378	add x29,sp,#0x10
00a9d37c	bl 0x00a9d5b4
00a9d380	cbz x0,0x00a9d38c
00a9d384	str x19,[x0, #0x30]
00a9d388	mov w0,#0x1
00a9d38c	ldp x29,x30,[sp, #0x10]
00a9d390	ldr x19,[sp], #0x20
00a9d394	ret
