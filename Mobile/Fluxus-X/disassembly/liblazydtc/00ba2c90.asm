; psa_driver_wrapper_export_public_key @ 00ba2c90
00ba2c90	ldr w8,[x0, #0x4]
00ba2c94	cmp w8,#0xff
00ba2c98	b.hi 0x00ba2ca0
00ba2c9c	b 0x00c42c80
00ba2ca0	mov w0,#0xffffff79
00ba2ca4	ret
