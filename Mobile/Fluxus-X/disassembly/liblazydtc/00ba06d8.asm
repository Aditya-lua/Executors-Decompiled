; mbedtls_ecjpake_check @ 00ba06d8
00ba06d8	ldr w8,[x0]
00ba06dc	cbz w8,0x00ba06fc
00ba06e0	ldr w8,[x0, #0x8]
00ba06e4	cbz w8,0x00ba06fc
00ba06e8	ldr x8,[x0, #0x1e0]
00ba06ec	cmp x8,#0x0
00ba06f0	mov w8,#0xffffb080
00ba06f4	csel w0,w8,wzr,eq
00ba06f8	ret
00ba06fc	mov w0,#0xffffb080
00ba0700	ret
