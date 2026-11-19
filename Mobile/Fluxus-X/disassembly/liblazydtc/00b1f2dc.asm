; X509_keyid_get0 @ 00b1f2dc
00b1f2dc	ldr x8,[x0, #0x150]
00b1f2e0	cbz x8,0x00b1f300
00b1f2e4	ldr x8,[x8, #0x18]
00b1f2e8	cbz x8,0x00b1f308
00b1f2ec	cbz x1,0x00b1f2f8
00b1f2f0	ldr w9,[x8]
00b1f2f4	str w9,[x1]
00b1f2f8	ldr x0,[x8, #0x8]
00b1f2fc	ret
00b1f300	mov x0,xzr
00b1f304	ret
00b1f308	mov x0,xzr
00b1f30c	ret
