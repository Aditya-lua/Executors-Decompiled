; X509_OBJECT_get0_X509 @ 00b0af00
00b0af00	cbz x0,0x00b0af20
00b0af04	ldr w8,[x0]
00b0af08	cmp w8,#0x1
00b0af0c	mov x8,xzr
00b0af10	b.ne 0x00b0af18
00b0af14	ldr x8,[x0, #0x8]
00b0af18	mov x0,x8
00b0af1c	ret
00b0af20	mov x0,xzr
00b0af24	ret
