; X509_OBJECT_get0_X509_CRL @ 00b0af28
00b0af28	cbz x0,0x00b0af48
00b0af2c	ldr w8,[x0]
00b0af30	cmp w8,#0x2
00b0af34	mov x8,xzr
00b0af38	b.ne 0x00b0af40
00b0af3c	ldr x8,[x0, #0x8]
00b0af40	mov x0,x8
00b0af44	ret
00b0af48	mov x0,xzr
00b0af4c	ret
