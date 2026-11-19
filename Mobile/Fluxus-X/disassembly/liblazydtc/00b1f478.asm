; X509_reject_clear @ 00b1f478
00b1f478	ldr x8,[x0, #0x150]
00b1f47c	cbz x8,0x00b1f4b0
00b1f480	str x19,[sp, #-0x20]!
00b1f484	stp x29,x30,[sp, #0x10]
00b1f488	adrp x1,0xcb5000
00b1f48c	mov x19,x0
00b1f490	ldr x0,[x8, #0x8]
00b1f494	ldr x1,[x1, #0x320]
00b1f498	add x29,sp,#0x10
00b1f49c	bl 0x00c32600
00b1f4a0	ldr x8,[x19, #0x150]
00b1f4a4	str xzr,[x8, #0x8]
00b1f4a8	ldp x29,x30,[sp, #0x10]
00b1f4ac	ldr x19,[sp], #0x20
00b1f4b0	ret
