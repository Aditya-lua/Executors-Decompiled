; EVP_KDF_CTX_set_params @ 00a64304
00a64304	ldr x8,[x0]
00a64308	ldr x2,[x8, #0x80]
00a6430c	cbz x2,0x00a64318
00a64310	ldr x0,[x0, #0x8]
00a64314	br x2
00a64318	mov w0,#0x1
00a6431c	ret
