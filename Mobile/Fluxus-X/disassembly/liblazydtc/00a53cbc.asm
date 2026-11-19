; ENGINE_set_default_RAND @ 00a53cbc
00a53cbc	ldr x8,[x0, #0x30]
00a53cc0	cbz x8,0x00a53cec
00a53cc4	mov x2,x0
00a53cc8	adrp x0,0xd21000
00a53ccc	adrp x1,0xa53000
00a53cd0	adrp x3,0x766000
00a53cd4	add x0,x0,#0xa08
00a53cd8	add x1,x1,#0xc38
00a53cdc	add x3,x3,#0xc
00a53ce0	mov w4,#0x1
00a53ce4	mov w5,#0x1
00a53ce8	b 0x00c3bce0
00a53cec	mov w0,#0x1
00a53cf0	ret
