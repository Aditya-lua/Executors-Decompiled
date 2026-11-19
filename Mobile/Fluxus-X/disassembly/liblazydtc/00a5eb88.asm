; evp_cipher_set_asn1_aead_params @ 00a5eb88
00a5eb88	cbz x1,0x00a5eba0
00a5eb8c	cbz x2,0x00a5eba0
00a5eb90	ldp w3,w8,[x2, #0x10]
00a5eb94	mov x0,x1
00a5eb98	mov x1,x8
00a5eb9c	b 0x00c37dc0
00a5eba0	mov w0,wzr
00a5eba4	ret
