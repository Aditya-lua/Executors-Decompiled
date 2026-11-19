; EVP_PKEY_get_security_bits @ 00a6bdfc
00a6bdfc	cbz x0,0x00a6be2c
00a6be00	ldr x9,[x0, #0x8]
00a6be04	ldr w8,[x0, #0x8c]
00a6be08	cbz x9,0x00a6be28
00a6be0c	ldr x9,[x9, #0x68]
00a6be10	cbz x9,0x00a6be28
00a6be14	stp x29,x30,[sp, #-0x10]!
00a6be18	mov x29,sp
00a6be1c	blr x9
00a6be20	mov w8,w0
00a6be24	ldp x29,x30,[sp], #0x10
00a6be28	bic w0,w8,w8, ASR #0x1f
00a6be2c	ret
