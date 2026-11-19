; X509_TRUST_set @ 00b0ce14
00b0ce14	sub sp,sp,#0x50
00b0ce18	sub w8,w1,#0x1
00b0ce1c	stp x20,x19,[sp, #0x30]
00b0ce20	mov w19,w1
00b0ce24	cmp w8,#0x7
00b0ce28	mov x20,x0
00b0ce2c	stp x29,x30,[sp, #0x40]
00b0ce30	add x29,sp,#0x40
00b0ce34	b.hi 0x00b0ce44
00b0ce38	mov w0,#0x1
00b0ce3c	str w19,[x20]
00b0ce40	b 0x00b0ce98
00b0ce44	adrp x8,0xd22000
00b0ce48	ldr x0,[x8, #0x7e8]
00b0ce4c	cbz x0,0x00b0ce68
00b0ce50	add x1,sp,#0x8
00b0ce54	str w19,[sp, #0x8]
00b0ce58	bl 0x00c34760
00b0ce5c	tbnz w0,#0x1f,0x00b0ce68
00b0ce60	cmn w0,#0x8
00b0ce64	b.pl 0x00b0ce38
00b0ce68	bl 0x00c342a0
00b0ce6c	adrp x0,0x2b4000
00b0ce70	adrp x2,0x2da000
00b0ce74	add x0,x0,#0xb27
00b0ce78	add x2,x2,#0x7d2
00b0ce7c	mov w1,#0x74
00b0ce80	bl 0x00c342b0
00b0ce84	mov w0,#0xb
00b0ce88	mov w1,#0x7b
00b0ce8c	mov x2,xzr
00b0ce90	bl 0x00c342c0
00b0ce94	mov w0,wzr
00b0ce98	ldp x29,x30,[sp, #0x40]
00b0ce9c	ldp x20,x19,[sp, #0x30]
00b0cea0	add sp,sp,#0x50
00b0cea4	ret
