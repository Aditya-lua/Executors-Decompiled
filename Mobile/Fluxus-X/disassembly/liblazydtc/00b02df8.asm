; X509_set_proxy_flag @ 00b02df8
00b02df8	str x19,[sp, #-0x20]!
00b02dfc	stp x29,x30,[sp, #0x10]
00b02e00	mov x19,x0
00b02e04	ldr x0,[x0, #0x158]
00b02e08	add x29,sp,#0x10
00b02e0c	bl 0x00c356a0
00b02e10	cbz w0,0x00b02e30
00b02e14	ldr w8,[x19, #0xe8]
00b02e18	ldr x0,[x19, #0x158]
00b02e1c	orr w8,w8,#0x400
00b02e20	str w8,[x19, #0xe8]
00b02e24	ldp x29,x30,[sp, #0x10]
00b02e28	ldr x19,[sp], #0x20
00b02e2c	b 0x00c35690
00b02e30	ldp x29,x30,[sp, #0x10]
00b02e34	ldr x19,[sp], #0x20
00b02e38	ret
