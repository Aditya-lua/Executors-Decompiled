; cpr::Session::SetPayload @ 008ee4e0
008ee4e0	sub sp,sp,#0x50
008ee4e4	str x21,[sp, #0x20]
008ee4e8	stp x20,x19,[sp, #0x30]
008ee4ec	stp x29,x30,[sp, #0x40]
008ee4f0	add x29,sp,#0x40
008ee4f4	mrs x20,tpidr_el0
008ee4f8	ldr x8,[x20, #0x28]
008ee4fc	mov x9,x1
008ee500	mov x19,x0
008ee504	mov x21,sp
008ee508	str x8,[sp, #0x18]
008ee50c	ldr x1,[x0, #0x18]
008ee510	mov w8,#0x1
008ee514	strb w8,[x0, #0x10]
008ee518	mov x8,sp
008ee51c	mov x0,x9
008ee520	bl 0x00c30f40
008ee524	ldr x8,[x19, #0x18]
008ee528	ldrb w9,[sp]
008ee52c	ldr x10,[sp, #0x8]
008ee530	ldr x0,[x8]
008ee534	lsr w8,w9,#0x1
008ee538	tst w9,#0x1
008ee53c	csel x2,x8,x10,eq
008ee540	mov w1,#0x75a8
008ee544	bl 0x00c317c0
008ee548	ldr x8,[x19, #0x18]
008ee54c	ldrb w9,[sp]
008ee550	ldr x10,[sp, #0x10]
008ee554	ldr x0,[x8]
008ee558	orr x8,x21,#0x1
008ee55c	tst w9,#0x1
008ee560	csel x2,x8,x10,eq
008ee564	mov w1,#0x27b5
008ee568	bl 0x00c317c0
008ee56c	ldrb w8,[sp]
008ee570	tbz w8,#0x0,0x008ee57c
008ee574	ldr x0,[sp, #0x10]
008ee578	bl 0x00c301d0
008ee57c	ldr x8,[x20, #0x28]
008ee580	ldr x9,[sp, #0x18]
008ee584	cmp x8,x9
008ee588	b.ne 0x008ee5a0
008ee58c	ldp x29,x30,[sp, #0x40]
008ee590	ldp x20,x19,[sp, #0x30]
008ee594	ldr x21,[sp, #0x20]
008ee598	add sp,sp,#0x50
008ee59c	ret
008ee5a0	bl 0x00c2fec0
