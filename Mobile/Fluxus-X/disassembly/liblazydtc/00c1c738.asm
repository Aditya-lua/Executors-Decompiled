; FUN_00c1c738 @ 00c1c738
00c1c738	paciasp
00c1c73c	stp x29,x30,[sp, #-0x30]!
00c1c740	str x21,[sp, #0x10]
00c1c744	stp x20,x19,[sp, #0x20]
00c1c748	mov x29,sp
00c1c74c	ldr x21,[x0, #0x1330]
00c1c750	mov x19,x1
00c1c754	ldr x8,[x21, #0x8]
00c1c758	sub x9,x8,#0xfe0
00c1c75c	cmn x9,#0xff1
00c1c760	b.hi 0x00c1c784
00c1c764	mov x20,x0
00c1c768	mov w0,#0x1000
00c1c76c	bl 0x00c308d0
00c1c770	cbz x0,0x00c1c7dc
00c1c774	mov x8,xzr
00c1c778	stp x21,xzr,[x0]
00c1c77c	mov x21,x0
00c1c780	str x0,[x20, #0x1330]
00c1c784	add x8,x8,#0x10
00c1c788	ldr w10,[x19]
00c1c78c	mov w11,#0x540
00c1c790	str x8,[x21, #0x8]
00c1c794	add x0,x8,x21
00c1c798	mov w8,#0x49
00c1c79c	ldurh w9,[x0, #0x9]
00c1c7a0	strb w8,[x0, #0x8]
00c1c7a4	adrp x8,0xcb2000
00c1c7a8	add x8,x8,#0x30
00c1c7ac	cmp w10,#0x0
00c1c7b0	and w9,w9,#0xf000
00c1c7b4	str x8,[x0]
00c1c7b8	orr w8,w9,w11
00c1c7bc	cset w9,ne
00c1c7c0	sturh w8,[x0, #0x9]
00c1c7c4	strb w9,[x0, #0xb]
00c1c7c8	ldp x20,x19,[sp, #0x20]
00c1c7cc	ldr x21,[sp, #0x10]
00c1c7d0	ldp x29,x30,[sp], #0x30
00c1c7d4	autiasp
00c1c7d8	ret
00c1c7dc	bl 0x00c2fff0
