; FUN_00bd8a64 @ 00bd8a64
00bd8a64	paciasp
00bd8a68	stp x29,x30,[sp, #-0x20]!
00bd8a6c	str x19,[sp, #0x10]
00bd8a70	mov x29,sp
00bd8a74	adrp x8,0xcb4000
00bd8a78	ldr x8,[x8, #0xa20]
00bd8a7c	ldr x9,[x0]
00bd8a80	ldur x9,[x9, #-0x18]
00bd8a84	add x10,x8,#0x18
00bd8a88	add x8,x8,#0x40
00bd8a8c	add x19,x0,x9
00bd8a90	mov x0,x19
00bd8a94	str x8,[x19, #0xb0]!
00bd8a98	str x10,[x0], #0x8
00bd8a9c	bl 0x00c300d0
00bd8aa0	mov x0,x19
00bd8aa4	ldr x19,[sp, #0x10]
00bd8aa8	ldp x29,x30,[sp], #0x20
00bd8aac	autiasp
00bd8ab0	b 0x00c30ee0
