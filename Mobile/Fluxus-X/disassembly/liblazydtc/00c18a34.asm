; FUN_00c18a34 @ 00c18a34
00c18a34	paciasp
00c18a38	stp x29,x30,[sp, #-0x30]!
00c18a3c	str x21,[sp, #0x10]
00c18a40	stp x20,x19,[sp, #0x20]
00c18a44	mov x29,sp
00c18a48	ldr x21,[x0, #0x1330]
00c18a4c	mov x19,x1
00c18a50	ldr x8,[x21, #0x8]
00c18a54	sub x9,x8,#0xfc0
00c18a58	cmn x9,#0xff1
00c18a5c	b.hi 0x00c18a80
00c18a60	mov x20,x0
00c18a64	mov w0,#0x1000
00c18a68	bl 0x00c308d0
00c18a6c	cbz x0,0x00c18ad4
00c18a70	mov x8,xzr
00c18a74	stp x21,xzr,[x0]
00c18a78	mov x21,x0
00c18a7c	str x0,[x20, #0x1330]
00c18a80	add x9,x8,#0x30
00c18a84	add x0,x21,x8
00c18a88	adrp x8,0xcb2000
00c18a8c	add x8,x8,#0x990
00c18a90	str x9,[x21, #0x8]
00c18a94	mov w9,#0x46
00c18a98	str x8,[x0, #0x10]!
00c18a9c	ldurh w8,[x0, #0x9]
00c18aa0	strb w9,[x0, #0x8]
00c18aa4	mov w9,#0x540
00c18aa8	str xzr,[x0, #0x10]
00c18aac	and w8,w8,#0xf000
00c18ab0	ldr q0,[x19]
00c18ab4	orr w8,w8,w9
00c18ab8	sturh w8,[x0, #0x9]
00c18abc	stur q0,[x0, #0x18]
00c18ac0	ldp x20,x19,[sp, #0x20]
00c18ac4	ldr x21,[sp, #0x10]
00c18ac8	ldp x29,x30,[sp], #0x30
00c18acc	autiasp
00c18ad0	ret
00c18ad4	bl 0x00c2fff0
