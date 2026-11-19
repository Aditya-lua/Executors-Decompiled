; cpr::CertInfo::emplace_back @ 008e74f8
008e74f8	str x23,[sp, #-0x40]!
008e74fc	stp x22,x21,[sp, #0x10]
008e7500	stp x20,x19,[sp, #0x20]
008e7504	stp x29,x30,[sp, #0x30]
008e7508	add x29,sp,#0x30
008e750c	ldp x20,x8,[x0, #0x8]
008e7510	mov x19,x0
008e7514	cmp x20,x8
008e7518	b.cs 0x008e7540
008e751c	stp xzr,xzr,[x20, #0x8]
008e7520	str xzr,[x20]
008e7524	ldrb w8,[x1]
008e7528	tbnz w8,#0x0,0x008e7558
008e752c	ldr x8,[x1, #0x10]
008e7530	str x8,[x20, #0x10]
008e7534	ldr q0,[x1]
008e7538	str q0,[x20]
008e753c	b 0x008e75b4
008e7540	mov x0,x19
008e7544	ldp x29,x30,[sp, #0x30]
008e7548	ldp x20,x19,[sp, #0x20]
008e754c	ldp x22,x21,[sp, #0x10]
008e7550	ldr x23,[sp], #0x40
008e7554	b 0x00c30de0
008e7558	ldr x21,[x1, #0x8]
008e755c	cmn x21,#0x10
008e7560	b.cs 0x008e75d4
008e7564	ldr x22,[x1, #0x10]
008e7568	cmp x21,#0x17
008e756c	b.cs 0x008e7580
008e7570	lsl w8,w21,#0x1
008e7574	strb w8,[x20], #0x1
008e7578	cbnz x21,0x008e75a0
008e757c	b 0x008e75b0
008e7580	add x8,x21,#0x10
008e7584	and x23,x8,#-0x10
008e7588	mov x0,x23
008e758c	bl 0x00c2fed0
008e7590	orr x8,x23,#0x1
008e7594	stp x21,x0,[x20, #0x8]
008e7598	str x8,[x20]
008e759c	mov x20,x0
008e75a0	mov x0,x20
008e75a4	mov x1,x22
008e75a8	mov x2,x21
008e75ac	bl 0x00c2ffd0
008e75b0	strb wzr,[x20, x21]
008e75b4	ldr x8,[x19, #0x8]
008e75b8	add x8,x8,#0x18
008e75bc	str x8,[x19, #0x8]
008e75c0	ldp x29,x30,[sp, #0x30]
008e75c4	ldp x20,x19,[sp, #0x20]
008e75c8	ldp x22,x21,[sp, #0x10]
008e75cc	ldr x23,[sp], #0x40
008e75d0	ret
008e75d4	mov x0,x20
008e75d8	bl 0x00c30ce0
