; ENGINE_register_DSA @ 00a536e0
00a536e0	ldr x8,[x0, #0x18]
00a536e4	cbz x8,0x00a53710
00a536e8	mov x2,x0
00a536ec	adrp x0,0xd21000
00a536f0	adrp x1,0xa53000
00a536f4	adrp x3,0x766000
00a536f8	add x0,x0,#0x9f0
00a536fc	add x1,x1,#0x718
00a53700	add x3,x3,#0x4
00a53704	mov w4,#0x1
00a53708	mov w5,wzr
00a5370c	b 0x00c3bce0
00a53710	mov w0,#0x1
00a53714	ret
