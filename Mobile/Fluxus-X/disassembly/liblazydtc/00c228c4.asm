; FUN_00c228c4 @ 00c228c4
00c228c4	paciasp
00c228c8	stp x29,x30,[sp, #-0x50]!
00c228cc	str x25,[sp, #0x10]
00c228d0	stp x24,x23,[sp, #0x20]
00c228d4	stp x22,x21,[sp, #0x30]
00c228d8	stp x20,x19,[sp, #0x40]
00c228dc	mov x29,sp
00c228e0	ldp x8,x9,[x0]
00c228e4	mov x20,x1
00c228e8	cmp x8,x9
00c228ec	b.eq 0x00c229a8
00c228f0	mov x19,x0
00c228f4	adrp x23,0xcb3000
00c228f8	add x23,x23,#0x188
00c228fc	mov w24,#0x9
00c22900	b 0x00c2294c
00c22904	add x9,x8,#0x30
00c22908	add x0,x25,x8
00c2290c	str x9,[x25, #0x8]
00c22910	ldurh w8,[x20, #0x9]
00c22914	str x23,[x0, #0x10]!
00c22918	ldurh w9,[x0, #0x9]
00c2291c	str x22,[x0, #0x18]
00c22920	and w8,w8,#0xfc0
00c22924	str x20,[x0, #0x10]
00c22928	mov x20,x0
00c2292c	and w9,w9,#0xf000
00c22930	strb w24,[x0, #0x8]
00c22934	orr w8,w9,w8
00c22938	str x21,[x0, #0x20]
00c2293c	sturh w8,[x0, #0x9]
00c22940	ldp x8,x9,[x19]
00c22944	cmp x8,x9
00c22948	b.eq 0x00c229b4
00c2294c	ldrb w9,[x8]
00c22950	cmp w9,#0x42
00c22954	b.ne 0x00c229a8
00c22958	add x8,x8,#0x1
00c2295c	mov x0,x19
00c22960	str x8,[x19]
00c22964	bl 0x00c22edc
00c22968	cbz x1,0x00c229b0
00c2296c	ldr x25,[x19, #0x1330]
00c22970	mov x21,x1
00c22974	mov x22,x0
00c22978	ldr x8,[x25, #0x8]
00c2297c	sub x9,x8,#0xfc0
00c22980	cmn x9,#0xff1
00c22984	b.hi 0x00c22904
00c22988	mov w0,#0x1000
00c2298c	bl 0x00c308d0
00c22990	cbz x0,0x00c229d0
00c22994	mov x8,xzr
00c22998	stp x25,xzr,[x0]
00c2299c	mov x25,x0
00c229a0	str x0,[x19, #0x1330]
00c229a4	b 0x00c22904
00c229a8	mov x0,x20
00c229ac	b 0x00c229b4
00c229b0	mov x0,xzr
00c229b4	ldp x20,x19,[sp, #0x40]
00c229b8	ldr x25,[sp, #0x10]
00c229bc	ldp x22,x21,[sp, #0x30]
00c229c0	ldp x24,x23,[sp, #0x20]
00c229c4	ldp x29,x30,[sp], #0x50
00c229c8	autiasp
00c229cc	ret
00c229d0	bl 0x00c2fff0
