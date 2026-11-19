; EVP_PKEY_print_public @ 00a6e224
00a6e224	ldr x9,[x1, #0x8]
00a6e228	mov x5,x3
00a6e22c	mov x8,x0
00a6e230	cbz x9,0x00a6e23c
00a6e234	ldr x4,[x9, #0x38]
00a6e238	b 0x00a6e240
00a6e23c	mov x4,xzr
00a6e240	mov w3,#0x86
00a6e244	mov x0,x1
00a6e248	mov x1,x8
00a6e24c	b 0x00a6e250
