; X509_get_proxy_pathlen @ 00b03198
00b03198	str x19,[sp, #-0x20]!
00b0319c	stp x29,x30,[sp, #0x10]
00b031a0	add x29,sp,#0x10
00b031a4	mov x19,x0
00b031a8	bl 0x00b01d98
00b031ac	cbz w0,0x00b031b8
00b031b0	ldrb w8,[x19, #0xe9]
00b031b4	tbnz w8,#0x2,0x00b031c0
00b031b8	mov x0,#-0x1
00b031bc	b 0x00b031c4
00b031c0	ldr x0,[x19, #0xe0]
00b031c4	ldp x29,x30,[sp, #0x10]
00b031c8	ldr x19,[sp], #0x20
00b031cc	ret
