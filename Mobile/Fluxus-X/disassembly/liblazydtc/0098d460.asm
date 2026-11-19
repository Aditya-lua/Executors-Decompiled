; ix::WebSocket::setPingMessage @ 0098d460
0098d460	str x23,[sp, #-0x40]!
0098d464	stp x22,x21,[sp, #0x10]
0098d468	stp x20,x19,[sp, #0x20]
0098d46c	stp x29,x30,[sp, #0x30]
0098d470	add x29,sp,#0x30
0098d474	add x19,x0,#0x3a0
0098d478	mov x21,x0
0098d47c	mov x0,x19
0098d480	mov w20,w2
0098d484	mov x23,x1
0098d488	bl 0x00c2ff10
0098d48c	add x22,x21,#0x4b0
0098d490	cmp x22,x23
0098d494	b.eq 0x0098d4b8
0098d498	ldrb w8,[x23]
0098d49c	ldp x10,x9,[x23, #0x8]
0098d4a0	tst w8,#0x1
0098d4a4	lsr w11,w8,#0x1
0098d4a8	csinc x1,x9,x23,ne
0098d4ac	csel x2,x11,x10,eq
0098d4b0	mov x0,x22
0098d4b4	bl 0x00c31090
0098d4b8	mov x0,x21
0098d4bc	mov x1,x22
0098d4c0	mov w2,w20
0098d4c4	bl 0x00c33850
0098d4c8	mov x0,x19
0098d4cc	ldp x29,x30,[sp, #0x30]
0098d4d0	ldp x20,x19,[sp, #0x20]
0098d4d4	ldp x22,x21,[sp, #0x10]
0098d4d8	ldr x23,[sp], #0x40
0098d4dc	b 0x00c2ff20
