; ENGINE_set_default_RSA @ 00a53df8
00a53df8	ldr x8,[x0, #0x10]
00a53dfc	cbz x8,0x00a53e28
00a53e00	mov x2,x0
00a53e04	adrp x0,0xd21000
00a53e08	adrp x1,0xa53000
00a53e0c	adrp x3,0x766000
00a53e10	add x0,x0,#0xa10
00a53e14	add x1,x1,#0xd74
00a53e18	add x3,x3,#0x10
00a53e1c	mov w4,#0x1
00a53e20	mov w5,#0x1
00a53e24	b 0x00c3bce0
00a53e28	mov w0,#0x1
00a53e2c	ret
