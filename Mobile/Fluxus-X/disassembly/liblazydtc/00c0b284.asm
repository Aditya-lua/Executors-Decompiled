; FUN_00c0b284 @ 00c0b284
00c0b284	paciasp
00c0b288	stp x29,x30,[sp, #-0x20]!
00c0b28c	str x19,[sp, #0x10]
00c0b290	mov x29,sp
00c0b294	mov x19,x0
00c0b298	bl 0x00c0b1c4
00c0b29c	mov x0,x19
00c0b2a0	mov w1,#0x88
00c0b2a4	ldr x19,[sp, #0x10]
00c0b2a8	ldp x29,x30,[sp], #0x20
00c0b2ac	autiasp
00c0b2b0	b 0x00c2fe80
