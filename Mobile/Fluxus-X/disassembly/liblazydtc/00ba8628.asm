; mbedtls_rsa_pkcs1_sign @ 00ba8628
00ba8628	mov x7,x6
00ba862c	orr w8,w4,w3
00ba8630	cbz w8,0x00ba8640
00ba8634	cbnz x5,0x00ba8640
00ba8638	mov w0,#0xffffbf80
00ba863c	ret
00ba8640	ldr w8,[x0, #0xe0]
00ba8644	cmp w8,#0x1
00ba8648	b.eq 0x00ba8658
00ba864c	cbnz w8,0x00ba866c
00ba8650	mov x6,x7
00ba8654	b 0x00c43490
00ba8658	ldr w8,[x0, #0xe4]
00ba865c	orr w8,w8,w3
00ba8660	cbz w8,0x00ba8638
00ba8664	mov w6,#0xffffffff
00ba8668	b 0x00ba8060
00ba866c	mov w0,#0xffffbf00
00ba8670	ret
