; ossl_ffc_params_get_validate_params @ 00a7d260
00a7d260	cbz x1,0x00a7d26c
00a7d264	ldr x8,[x0, #0x20]
00a7d268	str x8,[x1]
00a7d26c	cbz x2,0x00a7d278
00a7d270	ldr x8,[x0, #0x28]
00a7d274	str x8,[x2]
00a7d278	cbz x3,0x00a7d284
00a7d27c	ldr w8,[x0, #0x30]
00a7d280	str w8,[x3]
00a7d284	ret
