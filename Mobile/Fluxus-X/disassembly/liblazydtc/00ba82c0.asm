; mbedtls_rsa_rsassa_pss_sign @ 00ba82c0
00ba82c0	ldr w8,[x0, #0xe0]
00ba82c4	mov x7,x6
00ba82c8	cmp w8,#0x1
00ba82cc	b.ne 0x00ba82e4
00ba82d0	ldr w8,[x0, #0xe4]
00ba82d4	orr w8,w8,w3
00ba82d8	cbz w8,0x00ba82e4
00ba82dc	mov w6,#0xffffffff
00ba82e0	b 0x00ba8060
00ba82e4	mov w0,#0xffffbf80
00ba82e8	ret
