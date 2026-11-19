; ENGINE_register_RAND @ 00a53c00
00a53c00	ldr x8,[x0, #0x30]
00a53c04	cbz x8,0x00a53c30
00a53c08	mov x2,x0
00a53c0c	adrp x0,0xd21000
00a53c10	adrp x1,0xa53000
00a53c14	adrp x3,0x766000
00a53c18	add x0,x0,#0xa08
00a53c1c	add x1,x1,#0xc38
00a53c20	add x3,x3,#0xc
00a53c24	mov w4,#0x1
00a53c28	mov w5,wzr
00a53c2c	b 0x00c3bce0
00a53c30	mov w0,#0x1
00a53c34	ret
