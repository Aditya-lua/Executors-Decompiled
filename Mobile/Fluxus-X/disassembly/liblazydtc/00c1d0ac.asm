; FUN_00c1d0ac @ 00c1d0ac
00c1d0ac	paciasp
00c1d0b0	stp x29,x30,[sp, #-0x30]!
00c1d0b4	str x21,[sp, #0x10]
00c1d0b8	stp x20,x19,[sp, #0x20]
00c1d0bc	mov x29,sp
00c1d0c0	ldr x21,[x0, #0x1330]
00c1d0c4	mov x19,x1
00c1d0c8	ldr x8,[x21, #0x8]
00c1d0cc	sub x9,x8,#0xfd0
00c1d0d0	cmn x9,#0xff1
00c1d0d4	b.hi 0x00c1d0f8
00c1d0d8	mov x20,x0
00c1d0dc	mov w0,#0x1000
00c1d0e0	bl 0x00c308d0
00c1d0e4	cbz x0,0x00c1d148
00c1d0e8	mov x8,xzr
00c1d0ec	stp x21,xzr,[x0]
00c1d0f0	mov x21,x0
00c1d0f4	str x0,[x20, #0x1330]
00c1d0f8	add x9,x8,#0x20
00c1d0fc	add x0,x21,x8
00c1d100	adrp x8,0xcb2000
00c1d104	add x8,x8,#0x648
00c1d108	str x9,[x21, #0x8]
00c1d10c	mov w9,#0x4b
00c1d110	str x8,[x0, #0x10]!
00c1d114	ldurh w8,[x0, #0x9]
00c1d118	mov w10,#0x540
00c1d11c	strb w9,[x0, #0x8]
00c1d120	ldr x9,[x19]
00c1d124	and w8,w8,#0xf000
00c1d128	orr w8,w8,w10
00c1d12c	sturh w8,[x0, #0x9]
00c1d130	str x9,[x0, #0x10]
00c1d134	ldp x20,x19,[sp, #0x20]
00c1d138	ldr x21,[sp, #0x10]
00c1d13c	ldp x29,x30,[sp], #0x30
00c1d140	autiasp
00c1d144	ret
00c1d148	bl 0x00c2fff0
