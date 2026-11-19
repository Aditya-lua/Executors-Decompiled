; X509_get0_reject_objects @ 00b1f4cc
00b1f4cc	ldr x8,[x0, #0x150]
00b1f4d0	cbz x8,0x00b1f4dc
00b1f4d4	ldr x0,[x8, #0x8]
00b1f4d8	ret
00b1f4dc	mov x0,xzr
00b1f4e0	ret
