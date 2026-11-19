; ENGINE_set_default_DSA @ 00a5379c
00a5379c	ldr x8,[x0, #0x18]
00a537a0	cbz x8,0x00a537cc
00a537a4	mov x2,x0
00a537a8	adrp x0,0xd21000
00a537ac	adrp x1,0xa53000
00a537b0	adrp x3,0x766000
00a537b4	add x0,x0,#0x9f0
00a537b8	add x1,x1,#0x718
00a537bc	add x3,x3,#0x4
00a537c0	mov w4,#0x1
00a537c4	mov w5,#0x1
00a537c8	b 0x00c3bce0
00a537cc	mov w0,#0x1
00a537d0	ret
