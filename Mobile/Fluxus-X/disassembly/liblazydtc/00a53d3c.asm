; ENGINE_register_RSA @ 00a53d3c
00a53d3c	ldr x8,[x0, #0x10]
00a53d40	cbz x8,0x00a53d6c
00a53d44	mov x2,x0
00a53d48	adrp x0,0xd21000
00a53d4c	adrp x1,0xa53000
00a53d50	adrp x3,0x766000
00a53d54	add x0,x0,#0xa10
00a53d58	add x1,x1,#0xd74
00a53d5c	add x3,x3,#0x10
00a53d60	mov w4,#0x1
00a53d64	mov w5,wzr
00a53d68	b 0x00c3bce0
00a53d6c	mov w0,#0x1
00a53d70	ret
