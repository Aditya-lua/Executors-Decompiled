; ix::SocketServer::getHost @ 0098ab2c
0098ab2c	stp x22,x21,[sp, #-0x30]!
0098ab30	stp x20,x19,[sp, #0x10]
0098ab34	stp x29,x30,[sp, #0x20]
0098ab38	add x29,sp,#0x20
0098ab3c	mov x19,x8
0098ab40	stp xzr,xzr,[x8, #0x8]
0098ab44	str xzr,[x8]
0098ab48	mov x8,x0
0098ab4c	ldrb w9,[x8, #0x10]!
0098ab50	tbnz w9,#0x0,0x0098ab68
0098ab54	ldr x9,[x8, #0x10]
0098ab58	str x9,[x19, #0x10]
0098ab5c	ldr q0,[x8]
0098ab60	str q0,[x19]
0098ab64	b 0x0098abc4
0098ab68	ldr x20,[x0, #0x18]
0098ab6c	cmn x20,#0x10
0098ab70	b.cs 0x0098abd4
0098ab74	ldr x21,[x0, #0x20]
0098ab78	cmp x20,#0x17
0098ab7c	b.cs 0x0098ab90
0098ab80	lsl w8,w20,#0x1
0098ab84	strb w8,[x19], #0x1
0098ab88	cbnz x20,0x0098abb0
0098ab8c	b 0x0098abc0
0098ab90	add x8,x20,#0x10
0098ab94	and x22,x8,#-0x10
0098ab98	mov x0,x22
0098ab9c	bl 0x00c2fed0
0098aba0	orr x8,x22,#0x1
0098aba4	stp x20,x0,[x19, #0x8]
0098aba8	str x8,[x19]
0098abac	mov x19,x0
0098abb0	mov x0,x19
0098abb4	mov x1,x21
0098abb8	mov x2,x20
0098abbc	bl 0x00c2ffd0
0098abc0	strb wzr,[x19, x20]
0098abc4	ldp x29,x30,[sp, #0x20]
0098abc8	ldp x20,x19,[sp, #0x10]
0098abcc	ldp x22,x21,[sp], #0x30
0098abd0	ret
0098abd4	mov x0,x19
0098abd8	bl 0x00c30ce0
