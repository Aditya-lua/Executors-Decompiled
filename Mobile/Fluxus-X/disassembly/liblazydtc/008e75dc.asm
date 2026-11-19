; cpr::CertInfo::push_back @ 008e75dc
008e75dc	str x23,[sp, #-0x40]!
008e75e0	stp x22,x21,[sp, #0x10]
008e75e4	stp x20,x19,[sp, #0x20]
008e75e8	stp x29,x30,[sp, #0x30]
008e75ec	add x29,sp,#0x30
008e75f0	ldp x20,x8,[x0, #0x8]
008e75f4	mov x19,x0
008e75f8	cmp x20,x8
008e75fc	b.eq 0x008e7624
008e7600	stp xzr,xzr,[x20, #0x8]
008e7604	str xzr,[x20]
008e7608	ldrb w8,[x1]
008e760c	tbnz w8,#0x0,0x008e763c
008e7610	ldr x8,[x1, #0x10]
008e7614	str x8,[x20, #0x10]
008e7618	ldr q0,[x1]
008e761c	str q0,[x20]
008e7620	b 0x008e7698
008e7624	mov x0,x19
008e7628	ldp x29,x30,[sp, #0x30]
008e762c	ldp x20,x19,[sp, #0x20]
008e7630	ldp x22,x21,[sp, #0x10]
008e7634	ldr x23,[sp], #0x40
008e7638	b 0x00c30dd0
008e763c	ldr x21,[x1, #0x8]
008e7640	cmn x21,#0x10
008e7644	b.cs 0x008e76b8
008e7648	ldr x22,[x1, #0x10]
008e764c	cmp x21,#0x17
008e7650	b.cs 0x008e7664
008e7654	lsl w8,w21,#0x1
008e7658	strb w8,[x20], #0x1
008e765c	cbnz x21,0x008e7684
008e7660	b 0x008e7694
008e7664	add x8,x21,#0x10
008e7668	and x23,x8,#-0x10
008e766c	mov x0,x23
008e7670	bl 0x00c2fed0
008e7674	orr x8,x23,#0x1
008e7678	stp x21,x0,[x20, #0x8]
008e767c	str x8,[x20]
008e7680	mov x20,x0
008e7684	mov x0,x20
008e7688	mov x1,x22
008e768c	mov x2,x21
008e7690	bl 0x00c2ffd0
008e7694	strb wzr,[x20, x21]
008e7698	ldr x8,[x19, #0x8]
008e769c	add x8,x8,#0x18
008e76a0	str x8,[x19, #0x8]
008e76a4	ldp x29,x30,[sp, #0x30]
008e76a8	ldp x20,x19,[sp, #0x20]
008e76ac	ldp x22,x21,[sp, #0x10]
008e76b0	ldr x23,[sp], #0x40
008e76b4	ret
008e76b8	mov x0,x20
008e76bc	bl 0x00c30ce0
