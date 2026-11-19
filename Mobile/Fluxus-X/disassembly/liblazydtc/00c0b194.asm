; FUN_00c0b194 @ 00c0b194
00c0b194	paciasp
00c0b198	stp x29,x30,[sp, #-0x20]!
00c0b19c	str x19,[sp, #0x10]
00c0b1a0	mov x29,sp
00c0b1a4	mov x19,x0
00c0b1a8	bl 0x00c0b0e0
00c0b1ac	mov x0,x19
00c0b1b0	mov w1,#0x88
00c0b1b4	ldr x19,[sp, #0x10]
00c0b1b8	ldp x29,x30,[sp], #0x20
00c0b1bc	autiasp
00c0b1c0	b 0x00c2fe80
