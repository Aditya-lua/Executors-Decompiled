; ix::WebSocket::getPingMessage @ 0098d4f4
0098d4f4	str x23,[sp, #-0x40]!
0098d4f8	stp x22,x21,[sp, #0x10]
0098d4fc	stp x20,x19,[sp, #0x20]
0098d500	stp x29,x30,[sp, #0x30]
0098d504	add x29,sp,#0x30
0098d508	add x19,x0,#0x3a0
0098d50c	mov x22,x0
0098d510	mov x0,x19
0098d514	mov x20,x8
0098d518	bl 0x00c2ff10
0098d51c	stp xzr,xzr,[x20, #0x8]
0098d520	str xzr,[x20]
0098d524	ldrb w8,[x22, #0x4b0]
0098d528	tbnz w8,#0x0,0x0098d544
0098d52c	add x8,x22,#0x4b0
0098d530	ldr x9,[x8, #0x10]
0098d534	str x9,[x20, #0x10]
0098d538	ldr q0,[x8]
0098d53c	str q0,[x20]
0098d540	b 0x0098d5a0
0098d544	ldr x21,[x22, #0x4b8]
0098d548	cmn x21,#0x10
0098d54c	b.cs 0x0098d5b8
0098d550	ldr x22,[x22, #0x4c0]
0098d554	cmp x21,#0x17
0098d558	b.cs 0x0098d56c
0098d55c	lsl w8,w21,#0x1
0098d560	strb w8,[x20], #0x1
0098d564	cbnz x21,0x0098d58c
0098d568	b 0x0098d59c
0098d56c	add x8,x21,#0x10
0098d570	and x23,x8,#-0x10
0098d574	mov x0,x23
0098d578	bl 0x00c2fed0
0098d57c	orr x8,x23,#0x1
0098d580	stp x21,x0,[x20, #0x8]
0098d584	str x8,[x20]
0098d588	mov x20,x0
0098d58c	mov x0,x20
0098d590	mov x1,x22
0098d594	mov x2,x21
0098d598	bl 0x00c2ffd0
0098d59c	strb wzr,[x20, x21]
0098d5a0	mov x0,x19
0098d5a4	ldp x29,x30,[sp, #0x30]
0098d5a8	ldp x20,x19,[sp, #0x20]
0098d5ac	ldp x22,x21,[sp, #0x10]
0098d5b0	ldr x23,[sp], #0x40
0098d5b4	b 0x00c2ff20
0098d5b8	mov x0,x20
0098d5bc	bl 0x00c30ce0
