; FUN_00bd8ab4 @ 00bd8ab4
00bd8ab4	paciasp
00bd8ab8	stp x29,x30,[sp, #-0x20]!
00bd8abc	stp x20,x19,[sp, #0x10]
00bd8ac0	mov x29,sp
00bd8ac4	adrp x8,0xcb4000
00bd8ac8	ldr x8,[x8, #0xa20]
00bd8acc	ldr x9,[x0]
00bd8ad0	ldur x9,[x9, #-0x18]
00bd8ad4	add x19,x0,x9
00bd8ad8	add x9,x8,#0x18
00bd8adc	add x8,x8,#0x40
00bd8ae0	mov x0,x19
00bd8ae4	mov x20,x19
00bd8ae8	str x9,[x0], #0x8
00bd8aec	str x8,[x20, #0xb0]!
00bd8af0	bl 0x00c300d0
00bd8af4	mov x0,x20
00bd8af8	bl 0x00c30ee0
00bd8afc	mov x0,x19
00bd8b00	mov w1,#0x148
00bd8b04	ldp x20,x19,[sp, #0x10]
00bd8b08	ldp x29,x30,[sp], #0x20
00bd8b0c	autiasp
00bd8b10	b 0x00c2fe80
