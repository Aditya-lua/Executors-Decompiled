; EVP_CIPHER_meth_set_do_cipher @ 00a86608
00a86608	ldr x9,[x0, #0x28]
00a8660c	mov x8,x0
00a86610	mov w0,wzr
00a86614	cbz x9,0x00a8661c
00a86618	ret
00a8661c	mov w0,#0x1
00a86620	str x1,[x8, #0x28]
00a86624	ret
