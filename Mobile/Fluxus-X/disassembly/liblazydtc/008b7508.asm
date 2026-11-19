; FUN_008b7508 @ 008b7508
008b7508	stp x29,x30,[sp, #-0x20]!
008b750c	stp x20,x19,[sp, #0x10]
008b7510	mov x29,sp
008b7514	movi v0.2D,#0x0
008b7518	add x20,x0,#0xa0
008b751c	mov x19,x0
008b7520	mov w1,#0xff
008b7524	mov w2,#0x401
008b7528	stp q0,q0,[x0]
008b752c	stp q0,q0,[x0, #0x20]
008b7530	stp q0,q0,[x0, #0x40]
008b7534	stp q0,q0,[x0, #0x60]
008b7538	stp q0,q0,[x0, #0x80]
008b753c	mov x0,x20
008b7540	bl 0x00c301c0
008b7544	adrp x9,0x29d000
008b7548	mov x8,xzr
008b754c	ldr q0,[x9, #0xf0]
008b7550	adrp x9,0x29c000
008b7554	ldr q1,[x9, #0xaf0]
008b7558	adrp x9,0x29c000
008b755c	ldr q2,[x9, #0xb50]
008b7560	adrp x9,0x29c000
008b7564	stp q0,q1,[x19]
008b7568	ldr q0,[x9, #0x8e0]
008b756c	adrp x9,0x29c000
008b7570	ldr q1,[x9, #0x640]
008b7574	adrp x9,0x29c000
008b7578	stp q2,q0,[x19, #0x20]
008b757c	ldr q0,[x9, #0x7a0]
008b7580	adrp x9,0x29c000
008b7584	ldr q2,[x9, #0x590]
008b7588	adrp x9,0x29c000
008b758c	stp q1,q0,[x19, #0x40]
008b7590	ldr q0,[x9, #0xb60]
008b7594	adrp x9,0x29d000
008b7598	stp q2,q0,[x19, #0x60]
008b759c	ldr q0,[x9, #0x50]
008b75a0	mov w9,#0x24
008b75a4	str w9,[x19, #0x4a4]
008b75a8	str q0,[x19, #0x80]
008b75ac	ldrsw x9,[x19, x8, LSL #0x2]
008b75b0	strb w8,[x20, x9]
008b75b4	add x8,x8,#0x1
008b75b8	ldrsw x9,[x19, #0x4a4]
008b75bc	cmp x8,x9
008b75c0	b.lt 0x008b75ac
008b75c4	add x8,x19,#0x49f
008b75c8	mov x9,#-0x400
008b75cc	b 0x008b75dc
008b75d0	adds x9,x9,#0x1
008b75d4	sub x8,x8,#0x1
008b75d8	b.cs 0x008b75f0
008b75dc	ldrsb w10,[x8]
008b75e0	tbz w10,#0x1f,0x008b75d0
008b75e4	ldrb w10,[x8, #0x1]
008b75e8	strb w10,[x8]
008b75ec	b 0x008b75d0
008b75f0	ldp x20,x19,[sp, #0x10]
008b75f4	ldp x29,x30,[sp], #0x20
008b75f8	ret
