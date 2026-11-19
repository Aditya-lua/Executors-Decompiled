; FUN_00845a74 @ 00845a74
00845a74	stp x29,x30,[sp, #-0x20]!
00845a78	str x19,[sp, #0x10]
00845a7c	mov x29,sp
00845a80	adrp x8,0xcb4000
00845a84	mov x19,x0
00845a88	ldr x8,[x8, #0xad8]
00845a8c	add x8,x8,#0x10
00845a90	str x8,[x0], #0x10
00845a94	bl 0x00c30090
00845a98	adrp x8,0xcb4000
00845a9c	ldr x8,[x8, #0xaa0]
00845aa0	ldr x0,[x19, #0x8]
00845aa4	add x8,x8,#0x10
00845aa8	str x8,[x19]
00845aac	cbz x0,0x00845ac4
00845ab0	ldr x8,[x0]
00845ab4	ldr x1,[x8, #0x8]
00845ab8	ldr x19,[sp, #0x10]
00845abc	ldp x29,x30,[sp], #0x20
00845ac0	br x1
00845ac4	ldr x19,[sp, #0x10]
00845ac8	ldp x29,x30,[sp], #0x20
00845acc	ret
