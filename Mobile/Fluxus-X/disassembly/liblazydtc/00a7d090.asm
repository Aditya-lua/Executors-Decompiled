; ossl_ffc_params_get0_pqg @ 00a7d090
00a7d090	cbz x1,0x00a7d09c
00a7d094	ldr x8,[x0]
00a7d098	str x8,[x1]
00a7d09c	cbz x2,0x00a7d0a8
00a7d0a0	ldr x8,[x0, #0x8]
00a7d0a4	str x8,[x2]
00a7d0a8	cbz x3,0x00a7d0b4
00a7d0ac	ldr x8,[x0, #0x10]
00a7d0b0	str x8,[x3]
00a7d0b4	ret
