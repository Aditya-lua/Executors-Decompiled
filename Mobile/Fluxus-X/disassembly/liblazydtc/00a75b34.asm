; EVP_PKEY_meth_get_count @ 00a75b34
00a75b34	adrp x8,0xd21000
00a75b38	ldr x0,[x8, #0xb48]
00a75b3c	cbz x0,0x00a75b5c
00a75b40	stp x29,x30,[sp, #-0x10]!
00a75b44	mov x29,sp
00a75b48	bl 0x00c325e0
00a75b4c	sxtw x8,w0
00a75b50	add x0,x8,#0xa
00a75b54	ldp x29,x30,[sp], #0x10
00a75b58	ret
00a75b5c	mov w0,#0xa
00a75b60	ret
