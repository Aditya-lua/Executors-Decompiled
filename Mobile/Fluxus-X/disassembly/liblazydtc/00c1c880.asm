; FUN_00c1c880 @ 00c1c880
00c1c880	paciasp
00c1c884	stp x29,x30,[sp, #-0x30]!
00c1c888	str x21,[sp, #0x10]
00c1c88c	stp x20,x19,[sp, #0x20]
00c1c890	mov x29,sp
00c1c894	ldr x21,[x0, #0x1330]
00c1c898	mov x19,x1
00c1c89c	ldr x8,[x21, #0x8]
00c1c8a0	sub x9,x8,#0xfd0
00c1c8a4	cmn x9,#0xff1
00c1c8a8	b.hi 0x00c1c8cc
00c1c8ac	mov x20,x0
00c1c8b0	mov w0,#0x1000
00c1c8b4	bl 0x00c308d0
00c1c8b8	cbz x0,0x00c1c928
00c1c8bc	mov x8,xzr
00c1c8c0	stp x21,xzr,[x0]
00c1c8c4	mov x21,x0
00c1c8c8	str x0,[x20, #0x1330]
00c1c8cc	add x9,x8,#0x20
00c1c8d0	mov x0,x19
00c1c8d4	add x20,x21,x8
00c1c8d8	str x9,[x21, #0x8]
00c1c8dc	bl 0x00c2ff50
00c1c8e0	adrp x9,0xcb1000
00c1c8e4	add x9,x9,#0x4c0
00c1c8e8	mov w11,#0x540
00c1c8ec	str x9,[x20, #0x10]!
00c1c8f0	ldurh w9,[x20, #0x9]
00c1c8f4	mov x8,x0
00c1c8f8	mov w10,#0x8
00c1c8fc	and w9,w9,#0xf000
00c1c900	strb w10,[x20, #0x8]
00c1c904	orr w9,w9,w11
00c1c908	stp x19,x8,[x20, #0x10]
00c1c90c	sturh w9,[x20, #0x9]
00c1c910	mov x0,x20
00c1c914	ldp x20,x19,[sp, #0x20]
00c1c918	ldr x21,[sp, #0x10]
00c1c91c	ldp x29,x30,[sp], #0x30
00c1c920	autiasp
00c1c924	ret
00c1c928	bl 0x00c2fff0
