; ossl_rsa_pss_params_30_set_defaults @ 00ad8e24
00ad8e24	cbz x0,0x00ad8e44
00ad8e28	adrp x8,0x774000
00ad8e2c	add x8,x8,#0x91c
00ad8e30	ldr w9,[x8, #0x10]
00ad8e34	ldr q0,[x8]
00ad8e38	str w9,[x0, #0x10]
00ad8e3c	str q0,[x0]
00ad8e40	mov w0,#0x1
00ad8e44	ret
