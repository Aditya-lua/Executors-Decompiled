; FUN_00c23198 @ 00c23198
00c23198	paciasp
00c2319c	stp x29,x30,[sp, #-0x30]!
00c231a0	str x21,[sp, #0x10]
00c231a4	stp x20,x19,[sp, #0x20]
00c231a8	mov x29,sp
00c231ac	ldr x21,[x0, #0x1330]
00c231b0	mov x19,x1
00c231b4	ldr x8,[x21, #0x8]
00c231b8	sub x9,x8,#0xfe0
00c231bc	cmn x9,#0xff1
00c231c0	b.hi 0x00c231e4
00c231c4	mov x20,x0
00c231c8	mov w0,#0x1000
00c231cc	bl 0x00c308d0
00c231d0	cbz x0,0x00c23238
00c231d4	mov x8,xzr
00c231d8	stp x21,xzr,[x0]
00c231dc	mov x21,x0
00c231e0	str x0,[x20, #0x1330]
00c231e4	add x8,x8,#0x10
00c231e8	ldr x10,[x19]
00c231ec	mov w11,#0x540
00c231f0	str x8,[x21, #0x8]
00c231f4	add x0,x8,x21
00c231f8	mov w8,#0x2f
00c231fc	ldurh w9,[x0, #0x9]
00c23200	strb w8,[x0, #0x8]
00c23204	adrp x8,0xcb3000
00c23208	add x8,x8,#0x128
00c2320c	and w9,w9,#0xf000
00c23210	str x8,[x0]
00c23214	ldr w8,[x10, #0xc]
00c23218	orr w9,w9,w11
00c2321c	sturh w9,[x0, #0x9]
00c23220	str w8,[x0, #0xc]
00c23224	ldp x20,x19,[sp, #0x20]
00c23228	ldr x21,[sp, #0x10]
00c2322c	ldp x29,x30,[sp], #0x30
00c23230	autiasp
00c23234	ret
00c23238	bl 0x00c2fff0
