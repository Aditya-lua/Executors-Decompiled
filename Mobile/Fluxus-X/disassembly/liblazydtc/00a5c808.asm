; EVP_CIPHER_CTX_set_params @ 00a5c808
00a5c808	ldr x8,[x0]
00a5c80c	cbz x8,0x00a5c82c
00a5c810	ldr x2,[x8, #0xe0]
00a5c814	cbz x2,0x00a5c82c
00a5c818	ldr x8,[x0, #0xa8]
00a5c81c	mov w9,#0xffffffff
00a5c820	str w9,[x0, #0x6c]
00a5c824	mov x0,x8
00a5c828	br x2
00a5c82c	mov w0,wzr
00a5c830	ret
