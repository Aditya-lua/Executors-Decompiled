; FUN_00bd8a10 @ 00bd8a10
00bd8a10	paciasp
00bd8a14	stp x29,x30,[sp, #-0x20]!
00bd8a18	stp x20,x19,[sp, #0x10]
00bd8a1c	mov x29,sp
00bd8a20	adrp x8,0xcb4000
00bd8a24	mov x20,x0
00bd8a28	mov x19,x0
00bd8a2c	ldr x8,[x8, #0xa20]
00bd8a30	add x9,x8,#0x18
00bd8a34	add x8,x8,#0x40
00bd8a38	str x9,[x0], #0x8
00bd8a3c	str x8,[x20, #0xb0]!
00bd8a40	bl 0x00c300d0
00bd8a44	mov x0,x20
00bd8a48	bl 0x00c30ee0
00bd8a4c	mov x0,x19
00bd8a50	mov w1,#0x148
00bd8a54	ldp x20,x19,[sp, #0x10]
00bd8a58	ldp x29,x30,[sp], #0x20
00bd8a5c	autiasp
00bd8a60	b 0x00c2fe80
