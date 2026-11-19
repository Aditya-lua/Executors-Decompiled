; FUN_00c130a0 @ 00c130a0
00c130a0	paciasp
00c130a4	stp x29,x30,[sp, #-0x30]!
00c130a8	str x21,[sp, #0x10]
00c130ac	stp x20,x19,[sp, #0x20]
00c130b0	mov x29,sp
00c130b4	ldr x21,[x0, #0x1330]
00c130b8	mov x19,x1
00c130bc	ldr x8,[x21, #0x8]
00c130c0	sub x9,x8,#0xfd0
00c130c4	cmn x9,#0xff1
00c130c8	b.hi 0x00c130ec
00c130cc	mov x20,x0
00c130d0	mov w0,#0x1000
00c130d4	bl 0x00c308d0
00c130d8	cbz x0,0x00c1313c
00c130dc	mov x8,xzr
00c130e0	stp x21,xzr,[x0]
00c130e4	mov x21,x0
00c130e8	str x0,[x20, #0x1330]
00c130ec	add x9,x8,#0x20
00c130f0	add x0,x21,x8
00c130f4	adrp x8,0xcb3000
00c130f8	add x8,x8,#0x728
00c130fc	str x9,[x21, #0x8]
00c13100	mov w9,#0xa
00c13104	str x8,[x0, #0x10]!
00c13108	ldurh w8,[x0, #0x9]
00c1310c	strb w9,[x0, #0x8]
00c13110	mov w9,#0x540
00c13114	and w8,w8,#0xf000
00c13118	ldr q0,[x19]
00c1311c	orr w8,w8,w9
00c13120	sturh w8,[x0, #0x9]
00c13124	str q0,[x0, #0x10]
00c13128	ldp x20,x19,[sp, #0x20]
00c1312c	ldr x21,[sp, #0x10]
00c13130	ldp x29,x30,[sp], #0x30
00c13134	autiasp
00c13138	ret
00c1313c	bl 0x00c2fff0
