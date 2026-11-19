; ix::WebSocket::sendBinary @ 0098fa68
0098fa68	sub sp,sp,#0x40
0098fa6c	str x19,[sp, #0x20]
0098fa70	stp x29,x30,[sp, #0x30]
0098fa74	add x29,sp,#0x30
0098fa78	mrs x19,tpidr_el0
0098fa7c	ldr x9,[x19, #0x28]
0098fa80	mov x3,x2
0098fa84	mov w2,#0x1
0098fa88	str x9,[sp, #0x18]
0098fa8c	ldrb w9,[x1]
0098fa90	ldr x10,[x1, #0x10]
0098fa94	tst w9,#0x1
0098fa98	csinc x10,x10,x1,ne
0098fa9c	str x10,[sp, #0x8]
0098faa0	ldr x10,[x1, #0x8]
0098faa4	lsr w9,w9,#0x1
0098faa8	add x1,sp,#0x8
0098faac	csel x9,x9,x10,eq
0098fab0	str x9,[sp, #0x10]
0098fab4	bl 0x00c33810
0098fab8	ldr x8,[x19, #0x28]
0098fabc	ldr x9,[sp, #0x18]
0098fac0	cmp x8,x9
0098fac4	b.ne 0x0098fad8
0098fac8	ldp x29,x30,[sp, #0x30]
0098facc	ldr x19,[sp, #0x20]
0098fad0	add sp,sp,#0x40
0098fad4	ret
0098fad8	bl 0x00c2fec0
