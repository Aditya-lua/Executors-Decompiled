; X509_alias_get0 @ 00b1f2a8
00b1f2a8	ldr x8,[x0, #0x150]
00b1f2ac	cbz x8,0x00b1f2cc
00b1f2b0	ldr x8,[x8, #0x10]
00b1f2b4	cbz x8,0x00b1f2d4
00b1f2b8	cbz x1,0x00b1f2c4
00b1f2bc	ldr w9,[x8]
00b1f2c0	str w9,[x1]
00b1f2c4	ldr x0,[x8, #0x8]
00b1f2c8	ret
00b1f2cc	mov x0,xzr
00b1f2d0	ret
00b1f2d4	mov x0,xzr
00b1f2d8	ret
