; EVP_PKEY_get_size @ 00a6f164
00a6f164	cbz x0,0x00a6f194
00a6f168	ldr x9,[x0, #0x8]
00a6f16c	ldr w8,[x0, #0x90]
00a6f170	cbz x9,0x00a6f190
00a6f174	ldr x9,[x9, #0x58]
00a6f178	cbz x9,0x00a6f190
00a6f17c	stp x29,x30,[sp, #-0x10]!
00a6f180	mov x29,sp
00a6f184	blr x9
00a6f188	mov w8,w0
00a6f18c	ldp x29,x30,[sp], #0x10
00a6f190	bic w0,w8,w8, ASR #0x1f
00a6f194	ret
