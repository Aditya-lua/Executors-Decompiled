; ENGINE_register_DH @ 00a53384
00a53384	ldr x8,[x0, #0x20]
00a53388	cbz x8,0x00a533b4
00a5338c	mov x2,x0
00a53390	adrp x0,0xd21000
00a53394	adrp x1,0xa53000
00a53398	adrp x3,0x766000
00a5339c	add x0,x0,#0x9e0
00a533a0	add x1,x1,#0x3bc
00a533a4	add x3,x3,#0x0
00a533a8	mov w4,#0x1
00a533ac	mov w5,wzr
00a533b0	b 0x00c3bce0
00a533b4	mov w0,#0x1
00a533b8	ret
