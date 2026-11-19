; EVP_PKEY_get0_description @ 00a6f198
00a6f198	ldr x8,[x0, #0x20]
00a6f19c	cbnz x8,0x00a6f1a8
00a6f1a0	ldr x8,[x0, #0x68]
00a6f1a4	cbz x8,0x00a6f1c4
00a6f1a8	ldr x8,[x0, #0x60]
00a6f1ac	cbz x8,0x00a6f1b8
00a6f1b0	ldr x8,[x8, #0x10]
00a6f1b4	cbnz x8,0x00a6f1c4
00a6f1b8	ldr x8,[x0, #0x8]
00a6f1bc	cbz x8,0x00a6f1c4
00a6f1c0	ldr x8,[x8, #0x18]
00a6f1c4	mov x0,x8
00a6f1c8	ret
