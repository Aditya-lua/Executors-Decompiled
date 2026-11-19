; X509_trust_clear @ 00b1f43c
00b1f43c	ldr x8,[x0, #0x150]
00b1f440	cbz x8,0x00b1f474
00b1f444	str x19,[sp, #-0x20]!
00b1f448	stp x29,x30,[sp, #0x10]
00b1f44c	adrp x1,0xcb5000
00b1f450	mov x19,x0
00b1f454	ldr x0,[x8]
00b1f458	ldr x1,[x1, #0x320]
00b1f45c	add x29,sp,#0x10
00b1f460	bl 0x00c32600
00b1f464	ldr x8,[x19, #0x150]
00b1f468	str xzr,[x8]
00b1f46c	ldp x29,x30,[sp, #0x10]
00b1f470	ldr x19,[sp], #0x20
00b1f474	ret
