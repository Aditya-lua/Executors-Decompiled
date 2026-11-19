; FUN_00c25934 @ 00c25934
00c25934	paciasp
00c25938	stp x29,x30,[sp, #-0x30]!
00c2593c	str x21,[sp, #0x10]
00c25940	stp x20,x19,[sp, #0x20]
00c25944	mov x29,sp
00c25948	ldr x21,[x0, #0x1330]
00c2594c	mov x19,x1
00c25950	ldr x8,[x21, #0x8]
00c25954	sub x9,x8,#0xfd0
00c25958	cmn x9,#0xff1
00c2595c	b.hi 0x00c25980
00c25960	mov x20,x0
00c25964	mov w0,#0x1000
00c25968	bl 0x00c308d0
00c2596c	cbz x0,0x00c259dc
00c25970	mov x8,xzr
00c25974	stp x21,xzr,[x0]
00c25978	mov x21,x0
00c2597c	str x0,[x20, #0x1330]
00c25980	add x9,x8,#0x20
00c25984	mov x0,x19
00c25988	add x20,x21,x8
00c2598c	str x9,[x21, #0x8]
00c25990	bl 0x00c2ff50
00c25994	adrp x9,0xcb1000
00c25998	add x9,x9,#0x4c0
00c2599c	mov w11,#0x540
00c259a0	str x9,[x20, #0x10]!
00c259a4	ldurh w9,[x20, #0x9]
00c259a8	mov x8,x0
00c259ac	mov w10,#0x8
00c259b0	and w9,w9,#0xf000
00c259b4	strb w10,[x20, #0x8]
00c259b8	orr w9,w9,w11
00c259bc	stp x19,x8,[x20, #0x10]
00c259c0	sturh w9,[x20, #0x9]
00c259c4	mov x0,x20
00c259c8	ldp x20,x19,[sp, #0x20]
00c259cc	ldr x21,[sp, #0x10]
00c259d0	ldp x29,x30,[sp], #0x30
00c259d4	autiasp
00c259d8	ret
00c259dc	bl 0x00c2fff0
