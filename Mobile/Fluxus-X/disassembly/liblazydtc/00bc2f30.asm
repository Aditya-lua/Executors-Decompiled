; FUN_00bc2f30 @ 00bc2f30
00bc2f30	paciasp
00bc2f34	stp x29,x30,[sp, #-0x20]!
00bc2f38	str x19,[sp, #0x10]
00bc2f3c	mov x29,sp
00bc2f40	mov x19,x0
00bc2f44	bl 0x00c43cb0
00bc2f48	adrp x8,0xcb5000
00bc2f4c	ldr x8,[x8, #0xaf8]
00bc2f50	add x8,x8,#0x10
00bc2f54	str x8,[x19]
00bc2f58	ldr x19,[sp, #0x10]
00bc2f5c	ldp x29,x30,[sp], #0x20
00bc2f60	autiasp
00bc2f64	ret
