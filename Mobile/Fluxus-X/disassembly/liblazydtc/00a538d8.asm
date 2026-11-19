; ENGINE_set_default_EC @ 00a538d8
00a538d8	ldr x8,[x0, #0x28]
00a538dc	cbz x8,0x00a53908
00a538e0	mov x2,x0
00a538e4	adrp x0,0xd21000
00a538e8	adrp x1,0xa53000
00a538ec	adrp x3,0x766000
00a538f0	add x0,x0,#0x9f8
00a538f4	add x1,x1,#0x854
00a538f8	add x3,x3,#0x8
00a538fc	mov w4,#0x1
00a53900	mov w5,#0x1
00a53904	b 0x00c3bce0
00a53908	mov w0,#0x1
00a5390c	ret
