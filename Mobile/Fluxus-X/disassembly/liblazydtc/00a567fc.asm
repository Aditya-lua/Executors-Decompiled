; EVP_ASYM_CIPHER_names_do_all @ 00a567fc
00a567fc	mov x8,x0
00a56800	ldr x0,[x0, #0x18]
00a56804	cbz x0,0x00a56818
00a56808	mov x3,x2
00a5680c	mov x2,x1
00a56810	ldr w1,[x8]
00a56814	b 0x00c3bfa0
00a56818	mov w0,#0x1
00a5681c	ret
