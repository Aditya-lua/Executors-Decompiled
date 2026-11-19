; cpr::File::File @ 008fd6a8
008fd6a8	stp x24,x23,[sp, #-0x40]!
008fd6ac	stp x22,x21,[sp, #0x10]
008fd6b0	stp x20,x19,[sp, #0x20]
008fd6b4	stp x29,x30,[sp, #0x30]
008fd6b8	add x29,sp,#0x30
008fd6bc	stp xzr,xzr,[x0, #0x8]
008fd6c0	str xzr,[x0]
008fd6c4	ldrb w8,[x1]
008fd6c8	mov x20,x1
008fd6cc	mov x19,x0
008fd6d0	tbnz w8,#0x0,0x008fd6e8
008fd6d4	ldr x8,[x20, #0x10]
008fd6d8	str x8,[x19, #0x10]
008fd6dc	ldr q0,[x20]
008fd6e0	str q0,[x19]
008fd6e4	b 0x008fd748
008fd6e8	ldr x21,[x20, #0x8]
008fd6ec	cmn x21,#0x10
008fd6f0	b.cs 0x008fd7e4
008fd6f4	ldr x22,[x20, #0x10]
008fd6f8	cmp x21,#0x17
008fd6fc	b.cs 0x008fd714
008fd700	lsl w8,w21,#0x1
008fd704	mov x23,x19
008fd708	strb w8,[x23], #0x1
008fd70c	cbnz x21,0x008fd734
008fd710	b 0x008fd744
008fd714	add x8,x21,#0x10
008fd718	and x24,x8,#-0x10
008fd71c	mov x0,x24
008fd720	bl 0x00c2fed0
008fd724	orr x8,x24,#0x1
008fd728	mov x23,x0
008fd72c	stp x21,x0,[x19, #0x8]
008fd730	str x8,[x19]
008fd734	mov x0,x23
008fd738	mov x1,x22
008fd73c	mov x2,x21
008fd740	bl 0x00c2ffd0
008fd744	strb wzr,[x23, x21]
008fd748	mov x21,x19
008fd74c	str xzr,[x21, #0x18]!
008fd750	stp xzr,xzr,[x21, #0x8]
008fd754	mov x8,x20
008fd758	ldrb w9,[x8, #0x18]!
008fd75c	tbnz w9,#0x0,0x008fd774
008fd760	ldr x9,[x8, #0x10]
008fd764	str x9,[x21, #0x10]
008fd768	ldr q0,[x8]
008fd76c	str q0,[x21]
008fd770	b 0x008fd7d0
008fd774	ldr x22,[x20, #0x20]
008fd778	cmn x22,#0x10
008fd77c	b.cs 0x008fd7ec
008fd780	ldr x20,[x20, #0x28]
008fd784	cmp x22,#0x17
008fd788	b.cs 0x008fd79c
008fd78c	lsl w8,w22,#0x1
008fd790	strb w8,[x21], #0x1
008fd794	cbnz x22,0x008fd7bc
008fd798	b 0x008fd7cc
008fd79c	add x8,x22,#0x10
008fd7a0	and x23,x8,#-0x10
008fd7a4	mov x0,x23
008fd7a8	bl 0x00c2fed0
008fd7ac	orr x8,x23,#0x1
008fd7b0	mov x21,x0
008fd7b4	stp x22,x0,[x19, #0x20]
008fd7b8	str x8,[x19, #0x18]
008fd7bc	mov x0,x21
008fd7c0	mov x1,x20
008fd7c4	mov x2,x22
008fd7c8	bl 0x00c2ffd0
008fd7cc	strb wzr,[x21, x22]
008fd7d0	ldp x29,x30,[sp, #0x30]
008fd7d4	ldp x20,x19,[sp, #0x20]
008fd7d8	ldp x22,x21,[sp, #0x10]
008fd7dc	ldp x24,x23,[sp], #0x40
008fd7e0	ret
008fd7e4	mov x0,x19
008fd7e8	bl 0x00c30ce0
008fd7ec	mov x0,x21
008fd7f0	bl 0x00c30ce0
