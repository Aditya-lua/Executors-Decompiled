; OPENSSL_DIR_end @ 00a9b414
00a9b414	str x19,[sp, #-0x20]!
00a9b418	stp x29,x30,[sp, #0x10]
00a9b41c	add x29,sp,#0x10
00a9b420	cbz x0,0x00a9b45c
00a9b424	ldr x8,[x0]
00a9b428	mov x19,x0
00a9b42c	cbz x8,0x00a9b45c
00a9b430	ldr x0,[x8]
00a9b434	bl 0x00c30440
00a9b438	ldr x8,[x19]
00a9b43c	mov w19,w0
00a9b440	mov x0,x8
00a9b444	bl 0x00c30960
00a9b448	cbz w19,0x00a9b47c
00a9b44c	cmn w19,#0x1
00a9b450	b.ne 0x00a9b45c
00a9b454	mov w0,wzr
00a9b458	b 0x00a9b470
00a9b45c	bl 0x00c30710
00a9b460	mov x8,x0
00a9b464	mov w0,wzr
00a9b468	mov w9,#0x16
00a9b46c	str w9,[x8]
00a9b470	ldp x29,x30,[sp, #0x10]
00a9b474	ldr x19,[sp], #0x20
00a9b478	ret
00a9b47c	mov w0,#0x1
00a9b480	b 0x00a9b470
