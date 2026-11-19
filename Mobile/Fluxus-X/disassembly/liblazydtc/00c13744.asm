; FUN_00c13744 @ 00c13744
00c13744	paciasp
00c13748	stp x29,x30,[sp, #-0x30]!
00c1374c	str x21,[sp, #0x10]
00c13750	stp x20,x19,[sp, #0x20]
00c13754	mov x29,sp
00c13758	ldr x21,[x0, #0x1330]
00c1375c	mov x19,x1
00c13760	ldr x8,[x21, #0x8]
00c13764	sub x9,x8,#0xfc0
00c13768	cmn x9,#0xff1
00c1376c	b.hi 0x00c13790
00c13770	mov x20,x0
00c13774	mov w0,#0x1000
00c13778	bl 0x00c308d0
00c1377c	cbz x0,0x00c137f0
00c13780	mov x8,xzr
00c13784	stp x21,xzr,[x0]
00c13788	mov x21,x0
00c1378c	str x0,[x20, #0x1330]
00c13790	add x9,x8,#0x30
00c13794	add x0,x21,x8
00c13798	adrp x8,0xcb1000
00c1379c	add x8,x8,#0x3c0
00c137a0	str x9,[x21, #0x8]
00c137a4	mov w10,#0x540
00c137a8	str x8,[x0, #0x10]!
00c137ac	ldurh w9,[x0, #0x9]
00c137b0	mov w8,#0x15
00c137b4	mov w11,#0x12
00c137b8	strb w8,[x0, #0x8]
00c137bc	adrp x8,0x2b1000
00c137c0	add x8,x8,#0x1af
00c137c4	and w9,w9,#0xf000
00c137c8	str x8,[x0, #0x10]
00c137cc	orr w8,w9,w10
00c137d0	ldr x9,[x19]
00c137d4	sturh w8,[x0, #0x9]
00c137d8	stp x11,x9,[x0, #0x18]
00c137dc	ldp x20,x19,[sp, #0x20]
00c137e0	ldr x21,[sp, #0x10]
00c137e4	ldp x29,x30,[sp], #0x30
00c137e8	autiasp
00c137ec	ret
00c137f0	bl 0x00c2fff0
