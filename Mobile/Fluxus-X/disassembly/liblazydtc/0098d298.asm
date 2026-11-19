; ix::WebSocket::getUrl @ 0098d298
0098d298	str x23,[sp, #-0x40]!
0098d29c	stp x22,x21,[sp, #0x10]
0098d2a0	stp x20,x19,[sp, #0x20]
0098d2a4	stp x29,x30,[sp, #0x30]
0098d2a8	add x29,sp,#0x30
0098d2ac	add x19,x0,#0x3a0
0098d2b0	mov x22,x0
0098d2b4	mov x0,x19
0098d2b8	mov x20,x8
0098d2bc	bl 0x00c2ff10
0098d2c0	stp xzr,xzr,[x20, #0x8]
0098d2c4	str xzr,[x20]
0098d2c8	ldrb w8,[x22, #0x2e0]
0098d2cc	tbnz w8,#0x0,0x0098d2e8
0098d2d0	add x8,x22,#0x2e0
0098d2d4	ldr x9,[x8, #0x10]
0098d2d8	str x9,[x20, #0x10]
0098d2dc	ldr q0,[x8]
0098d2e0	str q0,[x20]
0098d2e4	b 0x0098d344
0098d2e8	ldr x21,[x22, #0x2e8]
0098d2ec	cmn x21,#0x10
0098d2f0	b.cs 0x0098d35c
0098d2f4	ldr x22,[x22, #0x2f0]
0098d2f8	cmp x21,#0x17
0098d2fc	b.cs 0x0098d310
0098d300	lsl w8,w21,#0x1
0098d304	strb w8,[x20], #0x1
0098d308	cbnz x21,0x0098d330
0098d30c	b 0x0098d340
0098d310	add x8,x21,#0x10
0098d314	and x23,x8,#-0x10
0098d318	mov x0,x23
0098d31c	bl 0x00c2fed0
0098d320	orr x8,x23,#0x1
0098d324	stp x21,x0,[x20, #0x8]
0098d328	str x8,[x20]
0098d32c	mov x20,x0
0098d330	mov x0,x20
0098d334	mov x1,x22
0098d338	mov x2,x21
0098d33c	bl 0x00c2ffd0
0098d340	strb wzr,[x20, x21]
0098d344	mov x0,x19
0098d348	ldp x29,x30,[sp, #0x30]
0098d34c	ldp x20,x19,[sp, #0x20]
0098d350	ldp x22,x21,[sp, #0x10]
0098d354	ldr x23,[sp], #0x40
0098d358	b 0x00c2ff20
0098d35c	mov x0,x20
0098d360	bl 0x00c30ce0
