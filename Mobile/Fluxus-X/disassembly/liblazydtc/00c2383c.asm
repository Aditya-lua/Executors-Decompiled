; FUN_00c2383c @ 00c2383c
00c2383c	paciasp
00c23840	stp x29,x30,[sp, #-0x30]!
00c23844	str x21,[sp, #0x10]
00c23848	stp x20,x19,[sp, #0x20]
00c2384c	mov x29,sp
00c23850	ldr x21,[x0, #0x1330]
00c23854	mov x19,x1
00c23858	ldr x8,[x21, #0x8]
00c2385c	sub x9,x8,#0xfd0
00c23860	cmn x9,#0xff1
00c23864	b.hi 0x00c23888
00c23868	mov x20,x0
00c2386c	mov w0,#0x1000
00c23870	bl 0x00c308d0
00c23874	cbz x0,0x00c238e4
00c23878	mov x8,xzr
00c2387c	stp x21,xzr,[x0]
00c23880	mov x21,x0
00c23884	str x0,[x20, #0x1330]
00c23888	add x9,x8,#0x20
00c2388c	mov x0,x19
00c23890	add x20,x21,x8
00c23894	str x9,[x21, #0x8]
00c23898	bl 0x00c2ff50
00c2389c	adrp x9,0xcb1000
00c238a0	add x9,x9,#0x4c0
00c238a4	mov w11,#0x540
00c238a8	str x9,[x20, #0x10]!
00c238ac	ldurh w9,[x20, #0x9]
00c238b0	mov x8,x0
00c238b4	mov w10,#0x8
00c238b8	and w9,w9,#0xf000
00c238bc	strb w10,[x20, #0x8]
00c238c0	orr w9,w9,w11
00c238c4	stp x19,x8,[x20, #0x10]
00c238c8	sturh w9,[x20, #0x9]
00c238cc	mov x0,x20
00c238d0	ldp x20,x19,[sp, #0x20]
00c238d4	ldr x21,[sp, #0x10]
00c238d8	ldp x29,x30,[sp], #0x30
00c238dc	autiasp
00c238e0	ret
00c238e4	bl 0x00c2fff0
