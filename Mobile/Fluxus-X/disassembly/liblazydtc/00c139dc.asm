; FUN_00c139dc @ 00c139dc
00c139dc	paciasp
00c139e0	stp x29,x30,[sp, #-0x30]!
00c139e4	str x21,[sp, #0x10]
00c139e8	stp x20,x19,[sp, #0x20]
00c139ec	mov x29,sp
00c139f0	ldr x21,[x0, #0x1330]
00c139f4	mov x19,x1
00c139f8	ldr x8,[x21, #0x8]
00c139fc	sub x9,x8,#0xfc0
00c13a00	cmn x9,#0xff1
00c13a04	b.hi 0x00c13a28
00c13a08	mov x20,x0
00c13a0c	mov w0,#0x1000
00c13a10	bl 0x00c308d0
00c13a14	cbz x0,0x00c13a88
00c13a18	mov x8,xzr
00c13a1c	stp x21,xzr,[x0]
00c13a20	mov x21,x0
00c13a24	str x0,[x20, #0x1330]
00c13a28	add x9,x8,#0x30
00c13a2c	add x0,x21,x8
00c13a30	adrp x8,0xcb1000
00c13a34	add x8,x8,#0x3c0
00c13a38	str x9,[x21, #0x8]
00c13a3c	mov w10,#0x540
00c13a40	str x8,[x0, #0x10]!
00c13a44	ldurh w9,[x0, #0x9]
00c13a48	mov w8,#0x15
00c13a4c	mov w11,#0x1a
00c13a50	strb w8,[x0, #0x8]
00c13a54	adrp x8,0x2ce000
00c13a58	add x8,x8,#0xbbb
00c13a5c	and w9,w9,#0xf000
00c13a60	str x8,[x0, #0x10]
00c13a64	orr w8,w9,w10
00c13a68	ldr x9,[x19]
00c13a6c	sturh w8,[x0, #0x9]
00c13a70	stp x11,x9,[x0, #0x18]
00c13a74	ldp x20,x19,[sp, #0x20]
00c13a78	ldr x21,[sp, #0x10]
00c13a7c	ldp x29,x30,[sp], #0x30
00c13a80	autiasp
00c13a84	ret
00c13a88	bl 0x00c2fff0
