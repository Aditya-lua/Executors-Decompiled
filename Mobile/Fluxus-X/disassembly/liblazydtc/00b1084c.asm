; X509_STORE_CTX_set0_verified_chain @ 00b1084c
00b1084c	stp x20,x19,[sp, #-0x20]!
00b10850	stp x29,x30,[sp, #0x10]
00b10854	mov x20,x1
00b10858	adrp x1,0xcb4000
00b1085c	mov x19,x0
00b10860	ldr x0,[x0, #0x98]
00b10864	ldr x1,[x1, #0xd88]
00b10868	add x29,sp,#0x10
00b1086c	bl 0x00c32600
00b10870	str x20,[x19, #0x98]
00b10874	ldp x29,x30,[sp, #0x10]
00b10878	ldp x20,x19,[sp], #0x20
00b1087c	ret
