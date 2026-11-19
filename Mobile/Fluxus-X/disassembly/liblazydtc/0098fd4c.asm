; ix::WebSocket::sendUtf8Text @ 0098fd4c
0098fd4c	sub sp,sp,#0x40
0098fd50	str x19,[sp, #0x20]
0098fd54	stp x29,x30,[sp, #0x30]
0098fd58	add x29,sp,#0x30
0098fd5c	mrs x19,tpidr_el0
0098fd60	ldr x9,[x19, #0x28]
0098fd64	mov x3,x2
0098fd68	mov w2,wzr
0098fd6c	str x9,[sp, #0x18]
0098fd70	ldrb w9,[x1]
0098fd74	ldr x10,[x1, #0x10]
0098fd78	tst w9,#0x1
0098fd7c	csinc x10,x10,x1,ne
0098fd80	str x10,[sp, #0x8]
0098fd84	ldr x10,[x1, #0x8]
0098fd88	lsr w9,w9,#0x1
0098fd8c	add x1,sp,#0x8
0098fd90	csel x9,x9,x10,eq
0098fd94	str x9,[sp, #0x10]
0098fd98	bl 0x00c33810
0098fd9c	ldr x8,[x19, #0x28]
0098fda0	ldr x9,[sp, #0x18]
0098fda4	cmp x8,x9
0098fda8	b.ne 0x0098fdbc
0098fdac	ldp x29,x30,[sp, #0x30]
0098fdb0	ldr x19,[sp, #0x20]
0098fdb4	add sp,sp,#0x40
0098fdb8	ret
0098fdbc	bl 0x00c2fec0
