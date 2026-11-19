; SSL_CTX_use_PrivateKey @ 009bbf50
009bbf50	cbz x1,0x009bbf5c
009bbf54	ldr x0,[x0, #0x158]
009bbf58	b 0x009bb8c0
009bbf5c	stp x29,x30,[sp, #-0x10]!
009bbf60	mov x29,sp
009bbf64	bl 0x00c342a0
009bbf68	adrp x0,0x2db000
009bbf6c	adrp x2,0x2cd000
009bbf70	add x0,x0,#0xaec
009bbf74	add x2,x2,#0x648
009bbf78	mov w1,#0x15c
009bbf7c	bl 0x00c342b0
009bbf80	mov w1,#0x102
009bbf84	mov w0,#0x14
009bbf88	movk w1,#0xc, LSL #16
009bbf8c	mov x2,xzr
009bbf90	bl 0x00c342c0
009bbf94	mov w0,wzr
009bbf98	ldp x29,x30,[sp], #0x10
009bbf9c	ret
