; FUN_00bc5654 @ 00bc5654
00bc5654	paciasp
00bc5658	stp x29,x30,[sp, #-0x30]!
00bc565c	stp x22,x21,[sp, #0x10]
00bc5660	stp x20,x19,[sp, #0x20]
00bc5664	mov x29,sp
00bc5668	mov x19,x2
00bc566c	cmp x2,#0x4
00bc5670	b.hi 0x00bc5680
00bc5674	lsl w8,w19,#0x1
00bc5678	strb w8,[x0], #0x4
00bc567c	b 0x00bc56bc
00bc5680	orr x8,xzr,#0x3ffffffffffffff8
00bc5684	cmp x19,x8
00bc5688	b.cs 0x00bc56d8
00bc568c	orr x8,x19,#0x1
00bc5690	mov w9,#0x8
00bc5694	mov x21,x0
00bc5698	cmp x8,#0x5
00bc569c	mov x20,x1
00bc56a0	csinc x22,x9,x8,eq
00bc56a4	lsl x0,x22,#0x2
00bc56a8	bl 0x00c2fed0
00bc56ac	orr x8,x22,#0x1
00bc56b0	mov x1,x20
00bc56b4	stp x19,x0,[x21, #0x8]
00bc56b8	str x8,[x21]
00bc56bc	lsl x8,x19,#0x2
00bc56c0	add x2,x8,#0x4
00bc56c4	ldp x20,x19,[sp, #0x20]
00bc56c8	ldp x22,x21,[sp, #0x10]
00bc56cc	ldp x29,x30,[sp], #0x30
00bc56d0	autiasp
00bc56d4	b 0x00c2ff60
00bc56d8	bl 0x00bc5610
