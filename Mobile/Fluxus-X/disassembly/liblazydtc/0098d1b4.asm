; ix::WebSocket::setUrl @ 0098d1b4
0098d1b4	str x21,[sp, #-0x30]!
0098d1b8	stp x20,x19,[sp, #0x10]
0098d1bc	stp x29,x30,[sp, #0x20]
0098d1c0	add x29,sp,#0x20
0098d1c4	add x19,x0,#0x3a0
0098d1c8	mov x21,x0
0098d1cc	mov x0,x19
0098d1d0	mov x20,x1
0098d1d4	bl 0x00c2ff10
0098d1d8	add x0,x21,#0x2e0
0098d1dc	cmp x0,x20
0098d1e0	b.eq 0x0098d200
0098d1e4	ldrb w8,[x20]
0098d1e8	ldp x10,x9,[x20, #0x8]
0098d1ec	tst w8,#0x1
0098d1f0	lsr w11,w8,#0x1
0098d1f4	csinc x1,x9,x20,ne
0098d1f8	csel x2,x11,x10,eq
0098d1fc	bl 0x00c31090
0098d200	mov x0,x19
0098d204	ldp x29,x30,[sp, #0x20]
0098d208	ldp x20,x19,[sp, #0x10]
0098d20c	ldr x21,[sp], #0x30
0098d210	b 0x00c2ff20
