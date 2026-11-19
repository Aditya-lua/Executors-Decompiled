; EVP_PKEY_get_bits @ 00a6bdc8
00a6bdc8	cbz x0,0x00a6bdf8
00a6bdcc	ldr x9,[x0, #0x8]
00a6bdd0	ldr w8,[x0, #0x88]
00a6bdd4	cbz x9,0x00a6bdf4
00a6bdd8	ldr x9,[x9, #0x60]
00a6bddc	cbz x9,0x00a6bdf4
00a6bde0	stp x29,x30,[sp, #-0x10]!
00a6bde4	mov x29,sp
00a6bde8	blr x9
00a6bdec	mov w8,w0
00a6bdf0	ldp x29,x30,[sp], #0x10
00a6bdf4	bic w0,w8,w8, ASR #0x1f
00a6bdf8	ret
