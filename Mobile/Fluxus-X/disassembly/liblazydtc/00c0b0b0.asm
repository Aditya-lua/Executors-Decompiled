; FUN_00c0b0b0 @ 00c0b0b0
00c0b0b0	paciasp
00c0b0b4	stp x29,x30,[sp, #-0x20]!
00c0b0b8	str x19,[sp, #0x10]
00c0b0bc	mov x29,sp
00c0b0c0	mov x19,x0
00c0b0c4	bl 0x00c0affc
00c0b0c8	mov x0,x19
00c0b0cc	mov w1,#0x88
00c0b0d0	ldr x19,[sp, #0x10]
00c0b0d4	ldp x29,x30,[sp], #0x20
00c0b0d8	autiasp
00c0b0dc	b 0x00c2fe80
