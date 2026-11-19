; FUN_00af0108 @ 00af0108
00af0108	stp x29,x30,[sp, #-0x10]!
00af010c	adrp x3,0xaf0000
00af0110	adrp x4,0xaf0000
00af0114	adrp x5,0xaf0000
00af0118	add x3,x3,#0x154
00af011c	add x4,x4,#0x158
00af0120	add x5,x5,#0x1a4
00af0124	orr w0,wzr,#0xe
00af0128	mov x1,xzr
00af012c	mov x2,xzr
00af0130	mov x29,sp
00af0134	bl 0x00c34d70
00af0138	adrp x8,0xcc9000
00af013c	adrp x9,0xd22000
00af0140	mov w10,#0x1
00af0144	str w0,[x8, #0x468]
00af0148	strb w10,[x9, #0x790]
00af014c	ldp x29,x30,[sp], #0x10
00af0150	ret
