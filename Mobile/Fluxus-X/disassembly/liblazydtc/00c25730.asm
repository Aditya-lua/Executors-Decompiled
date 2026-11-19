; FUN_00c25730 @ 00c25730
00c25730	paciasp
00c25734	stp x29,x30,[sp, #-0x30]!
00c25738	str x21,[sp, #0x10]
00c2573c	stp x20,x19,[sp, #0x20]
00c25740	mov x29,sp
00c25744	ldr x21,[x0, #0x1330]
00c25748	mov x19,x1
00c2574c	ldr x8,[x21, #0x8]
00c25750	sub x9,x8,#0xfd0
00c25754	cmn x9,#0xff1
00c25758	b.hi 0x00c2577c
00c2575c	mov x20,x0
00c25760	mov w0,#0x1000
00c25764	bl 0x00c308d0
00c25768	cbz x0,0x00c257d8
00c2576c	mov x8,xzr
00c25770	stp x21,xzr,[x0]
00c25774	mov x21,x0
00c25778	str x0,[x20, #0x1330]
00c2577c	add x9,x8,#0x20
00c25780	mov x0,x19
00c25784	add x20,x21,x8
00c25788	str x9,[x21, #0x8]
00c2578c	bl 0x00c2ff50
00c25790	adrp x9,0xcb1000
00c25794	add x9,x9,#0x4c0
00c25798	mov w11,#0x540
00c2579c	str x9,[x20, #0x10]!
00c257a0	ldurh w9,[x20, #0x9]
00c257a4	mov x8,x0
00c257a8	mov w10,#0x8
00c257ac	and w9,w9,#0xf000
00c257b0	strb w10,[x20, #0x8]
00c257b4	orr w9,w9,w11
00c257b8	stp x19,x8,[x20, #0x10]
00c257bc	sturh w9,[x20, #0x9]
00c257c0	mov x0,x20
00c257c4	ldp x20,x19,[sp, #0x20]
00c257c8	ldr x21,[sp, #0x10]
00c257cc	ldp x29,x30,[sp], #0x30
00c257d0	autiasp
00c257d4	ret
00c257d8	bl 0x00c2fff0
