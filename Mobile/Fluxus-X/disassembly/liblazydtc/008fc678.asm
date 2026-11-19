; cpr::Pair::Pair @ 008fc678
008fc678	stp x24,x23,[sp, #-0x40]!
008fc67c	stp x22,x21,[sp, #0x10]
008fc680	stp x20,x19,[sp, #0x20]
008fc684	stp x29,x30,[sp, #0x30]
008fc688	add x29,sp,#0x30
008fc68c	stp xzr,xzr,[x0, #0x8]
008fc690	str xzr,[x0]
008fc694	ldrb w8,[x1]
008fc698	mov x20,x1
008fc69c	mov x19,x0
008fc6a0	tbnz w8,#0x0,0x008fc6b8
008fc6a4	ldr x8,[x20, #0x10]
008fc6a8	str x8,[x19, #0x10]
008fc6ac	ldr q0,[x20]
008fc6b0	str q0,[x19]
008fc6b4	b 0x008fc718
008fc6b8	ldr x21,[x20, #0x8]
008fc6bc	cmn x21,#0x10
008fc6c0	b.cs 0x008fc7b4
008fc6c4	ldr x22,[x20, #0x10]
008fc6c8	cmp x21,#0x17
008fc6cc	b.cs 0x008fc6e4
008fc6d0	lsl w8,w21,#0x1
008fc6d4	mov x23,x19
008fc6d8	strb w8,[x23], #0x1
008fc6dc	cbnz x21,0x008fc704
008fc6e0	b 0x008fc714
008fc6e4	add x8,x21,#0x10
008fc6e8	and x24,x8,#-0x10
008fc6ec	mov x0,x24
008fc6f0	bl 0x00c2fed0
008fc6f4	orr x8,x24,#0x1
008fc6f8	mov x23,x0
008fc6fc	stp x21,x0,[x19, #0x8]
008fc700	str x8,[x19]
008fc704	mov x0,x23
008fc708	mov x1,x22
008fc70c	mov x2,x21
008fc710	bl 0x00c2ffd0
008fc714	strb wzr,[x23, x21]
008fc718	mov x21,x19
008fc71c	str xzr,[x21, #0x18]!
008fc720	stp xzr,xzr,[x21, #0x8]
008fc724	mov x8,x20
008fc728	ldrb w9,[x8, #0x18]!
008fc72c	tbnz w9,#0x0,0x008fc744
008fc730	ldr x9,[x8, #0x10]
008fc734	str x9,[x21, #0x10]
008fc738	ldr q0,[x8]
008fc73c	str q0,[x21]
008fc740	b 0x008fc7a0
008fc744	ldr x22,[x20, #0x20]
008fc748	cmn x22,#0x10
008fc74c	b.cs 0x008fc7bc
008fc750	ldr x20,[x20, #0x28]
008fc754	cmp x22,#0x17
008fc758	b.cs 0x008fc76c
008fc75c	lsl w8,w22,#0x1
008fc760	strb w8,[x21], #0x1
008fc764	cbnz x22,0x008fc78c
008fc768	b 0x008fc79c
008fc76c	add x8,x22,#0x10
008fc770	and x23,x8,#-0x10
008fc774	mov x0,x23
008fc778	bl 0x00c2fed0
008fc77c	orr x8,x23,#0x1
008fc780	mov x21,x0
008fc784	stp x22,x0,[x19, #0x20]
008fc788	str x8,[x19, #0x18]
008fc78c	mov x0,x21
008fc790	mov x1,x20
008fc794	mov x2,x22
008fc798	bl 0x00c2ffd0
008fc79c	strb wzr,[x21, x22]
008fc7a0	ldp x29,x30,[sp, #0x30]
008fc7a4	ldp x20,x19,[sp, #0x20]
008fc7a8	ldp x22,x21,[sp, #0x10]
008fc7ac	ldp x24,x23,[sp], #0x40
008fc7b0	ret
008fc7b4	mov x0,x19
008fc7b8	bl 0x00c30ce0
008fc7bc	mov x0,x21
008fc7c0	bl 0x00c30ce0
