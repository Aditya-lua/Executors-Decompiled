; FUN_00c1e870 @ 00c1e870
00c1e870	paciasp
00c1e874	stp x29,x30,[sp, #-0x30]!
00c1e878	str x21,[sp, #0x10]
00c1e87c	stp x20,x19,[sp, #0x20]
00c1e880	mov x29,sp
00c1e884	ldr x21,[x0, #0x1330]
00c1e888	mov x19,x1
00c1e88c	ldr x8,[x21, #0x8]
00c1e890	sub x9,x8,#0xfd0
00c1e894	cmn x9,#0xff1
00c1e898	b.hi 0x00c1e8bc
00c1e89c	mov x20,x0
00c1e8a0	mov w0,#0x1000
00c1e8a4	bl 0x00c308d0
00c1e8a8	cbz x0,0x00c1e918
00c1e8ac	mov x8,xzr
00c1e8b0	stp x21,xzr,[x0]
00c1e8b4	mov x21,x0
00c1e8b8	str x0,[x20, #0x1330]
00c1e8bc	add x9,x8,#0x20
00c1e8c0	mov x0,x19
00c1e8c4	add x20,x21,x8
00c1e8c8	str x9,[x21, #0x8]
00c1e8cc	bl 0x00c2ff50
00c1e8d0	adrp x9,0xcb1000
00c1e8d4	add x9,x9,#0x4c0
00c1e8d8	mov w11,#0x540
00c1e8dc	str x9,[x20, #0x10]!
00c1e8e0	ldurh w9,[x20, #0x9]
00c1e8e4	mov x8,x0
00c1e8e8	mov w10,#0x8
00c1e8ec	and w9,w9,#0xf000
00c1e8f0	strb w10,[x20, #0x8]
00c1e8f4	orr w9,w9,w11
00c1e8f8	stp x19,x8,[x20, #0x10]
00c1e8fc	sturh w9,[x20, #0x9]
00c1e900	mov x0,x20
00c1e904	ldp x20,x19,[sp, #0x20]
00c1e908	ldr x21,[sp, #0x10]
00c1e90c	ldp x29,x30,[sp], #0x30
00c1e910	autiasp
00c1e914	ret
00c1e918	bl 0x00c2fff0
