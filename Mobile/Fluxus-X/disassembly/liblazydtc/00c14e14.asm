; FUN_00c14e14 @ 00c14e14
00c14e14	paciasp
00c14e18	stp x29,x30,[sp, #-0x30]!
00c14e1c	stp x22,x21,[sp, #0x10]
00c14e20	stp x20,x19,[sp, #0x20]
00c14e24	mov x29,sp
00c14e28	ldr x22,[x0, #0x1330]
00c14e2c	mov x19,x2
00c14e30	mov x20,x1
00c14e34	ldr x8,[x22, #0x8]
00c14e38	sub x9,x8,#0xfd0
00c14e3c	cmn x9,#0xff1
00c14e40	b.hi 0x00c14e64
00c14e44	mov x21,x0
00c14e48	mov w0,#0x1000
00c14e4c	bl 0x00c308d0
00c14e50	cbz x0,0x00c14eb8
00c14e54	mov x8,xzr
00c14e58	stp x22,xzr,[x0]
00c14e5c	mov x22,x0
00c14e60	str x0,[x21, #0x1330]
00c14e64	add x9,x8,#0x20
00c14e68	add x0,x22,x8
00c14e6c	adrp x8,0xcb3000
00c14e70	add x8,x8,#0x5c0
00c14e74	str x9,[x22, #0x8]
00c14e78	mov w9,#0x2d
00c14e7c	str x8,[x0, #0x10]!
00c14e80	ldurh w8,[x0, #0x9]
00c14e84	mov w10,#0x540
00c14e88	strb w9,[x0, #0x8]
00c14e8c	ldr x9,[x20]
00c14e90	and w8,w8,#0xf000
00c14e94	orr w8,w8,w10
00c14e98	ldr x10,[x19]
00c14e9c	sturh w8,[x0, #0x9]
00c14ea0	stp x9,x10,[x0, #0x10]
00c14ea4	ldp x20,x19,[sp, #0x20]
00c14ea8	ldp x22,x21,[sp, #0x10]
00c14eac	ldp x29,x30,[sp], #0x30
00c14eb0	autiasp
00c14eb4	ret
00c14eb8	bl 0x00c2fff0
