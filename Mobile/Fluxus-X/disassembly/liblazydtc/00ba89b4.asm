; mbedtls_rsa_rsassa_pss_verify @ 00ba89b4
00ba89b4	mov x6,x4
00ba89b8	orr w8,w2,w1
00ba89bc	cbz w8,0x00ba89cc
00ba89c0	cbnz x3,0x00ba89cc
00ba89c4	mov w0,#0xffffbf80
00ba89c8	ret
00ba89cc	ldr w8,[x0, #0xe4]
00ba89d0	mov w5,#0xffffffff
00ba89d4	cmp w8,#0x0
00ba89d8	csel w4,w1,w8,eq
00ba89dc	b 0x00c433a0
