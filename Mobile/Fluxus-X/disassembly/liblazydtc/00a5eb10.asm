; EVP_CIPHER_get_mode @ 00a5eb10
00a5eb10	ldr w8,[x0, #0x10]
00a5eb14	mov w9,#0x7
00a5eb18	movk w9,#0xf, LSL #16
00a5eb1c	and w0,w8,w9
00a5eb20	ret
