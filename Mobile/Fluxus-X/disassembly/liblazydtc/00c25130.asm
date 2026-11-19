; FUN_00c25130 @ 00c25130
00c25130	paciasp
00c25134	stp x29,x30,[sp, #-0x30]!
00c25138	str x21,[sp, #0x10]
00c2513c	stp x20,x19,[sp, #0x20]
00c25140	mov x29,sp
00c25144	ldr x21,[x0, #0x1330]
00c25148	mov x19,x1
00c2514c	ldr x8,[x21, #0x8]
00c25150	sub x9,x8,#0xfd0
00c25154	cmn x9,#0xff1
00c25158	b.hi 0x00c2517c
00c2515c	mov x20,x0
00c25160	mov w0,#0x1000
00c25164	bl 0x00c308d0
00c25168	cbz x0,0x00c251d8
00c2516c	mov x8,xzr
00c25170	stp x21,xzr,[x0]
00c25174	mov x21,x0
00c25178	str x0,[x20, #0x1330]
00c2517c	add x9,x8,#0x20
00c25180	mov x0,x19
00c25184	add x20,x21,x8
00c25188	str x9,[x21, #0x8]
00c2518c	bl 0x00c2ff50
00c25190	adrp x9,0xcb1000
00c25194	add x9,x9,#0x4c0
00c25198	mov w11,#0x540
00c2519c	str x9,[x20, #0x10]!
00c251a0	ldurh w9,[x20, #0x9]
00c251a4	mov x8,x0
00c251a8	mov w10,#0x8
00c251ac	and w9,w9,#0xf000
00c251b0	strb w10,[x20, #0x8]
00c251b4	orr w9,w9,w11
00c251b8	stp x19,x8,[x20, #0x10]
00c251bc	sturh w9,[x20, #0x9]
00c251c0	mov x0,x20
00c251c4	ldp x20,x19,[sp, #0x20]
00c251c8	ldr x21,[sp, #0x10]
00c251cc	ldp x29,x30,[sp], #0x30
00c251d0	autiasp
00c251d4	ret
00c251d8	bl 0x00c2fff0
