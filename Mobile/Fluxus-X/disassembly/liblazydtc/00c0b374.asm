; FUN_00c0b374 @ 00c0b374
00c0b374	paciasp
00c0b378	stp x29,x30,[sp, #-0x20]!
00c0b37c	str x19,[sp, #0x10]
00c0b380	mov x29,sp
00c0b384	mov x19,x0
00c0b388	bl 0x00c0b2b4
00c0b38c	mov x0,x19
00c0b390	mov w1,#0x88
00c0b394	ldr x19,[sp, #0x10]
00c0b398	ldp x29,x30,[sp], #0x20
00c0b39c	autiasp
00c0b3a0	b 0x00c2fe80
