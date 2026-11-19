; EC_KEY_METHOD_get_compute_key @ 00a30108
00a30108	cbz x1,0x00a30114
00a3010c	ldr x8,[x0, #0x48]
00a30110	str x8,[x1]
00a30114	ret
