; FUN_00b3ff2c @ 00b3ff2c
00b3ff2c	stp x20,x19,[sp, #-0x20]!
00b3ff30	stp x29,x30,[sp, #0x10]
00b3ff34	add x29,sp,#0x10
00b3ff38	mov x19,x1
00b3ff3c	bl 0x00c3a0d0
00b3ff40	cbz x0,0x00b3ff70
00b3ff44	mov x1,xzr
00b3ff48	bl 0x00c375f0
00b3ff4c	cbz x0,0x00b3ff98
00b3ff50	mov x1,x19
00b3ff54	mov x20,x0
00b3ff58	bl 0x00c381c0
00b3ff5c	mov w19,w0
00b3ff60	mov x0,x20
00b3ff64	bl 0x00c37bd0
00b3ff68	mov w0,w19
00b3ff6c	b 0x00b3ffc8
00b3ff70	bl 0x00c342a0
00b3ff74	adrp x0,0x2c2000
00b3ff78	adrp x2,0x2da000
00b3ff7c	add x0,x0,#0x9ea
00b3ff80	add x2,x2,#0xc07
00b3ff84	mov w1,#0x265
00b3ff88	bl 0x00c342b0
00b3ff8c	mov w0,#0x39
00b3ff90	mov w1,#0xdd
00b3ff94	b 0x00b3ffbc
00b3ff98	bl 0x00c342a0
00b3ff9c	adrp x0,0x2c2000
00b3ffa0	adrp x2,0x2da000
00b3ffa4	add x0,x0,#0x9ea
00b3ffa8	add x2,x2,#0xc07
00b3ffac	mov w1,#0x269
00b3ffb0	bl 0x00c342b0
00b3ffb4	mov w0,#0x39
00b3ffb8	mov w1,#0xa0
00b3ffbc	mov x2,xzr
00b3ffc0	bl 0x00c342c0
00b3ffc4	mov w0,wzr
00b3ffc8	ldp x29,x30,[sp, #0x10]
00b3ffcc	ldp x20,x19,[sp], #0x20
00b3ffd0	ret
