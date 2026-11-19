; ix::WebSocketOpenInfo::WebSocketOpenInfo @ 0098e59c
0098e59c	sub sp,sp,#0x90
0098e5a0	str x27,[sp, #0x30]
0098e5a4	stp x26,x25,[sp, #0x40]
0098e5a8	stp x24,x23,[sp, #0x50]
0098e5ac	stp x22,x21,[sp, #0x60]
0098e5b0	stp x20,x19,[sp, #0x70]
0098e5b4	stp x29,x30,[sp, #0x80]
0098e5b8	add x29,sp,#0x80
0098e5bc	mrs x26,tpidr_el0
0098e5c0	ldr x8,[x26, #0x28]
0098e5c4	mov x20,x3
0098e5c8	mov x19,x0
0098e5cc	mov x21,x2
0098e5d0	str x8,[sp, #0x28]
0098e5d4	stp xzr,xzr,[x0, #0x8]
0098e5d8	str xzr,[x0]
0098e5dc	ldrb w8,[x1]
0098e5e0	tbnz w8,#0x0,0x0098e5f8
0098e5e4	ldr x8,[x1, #0x10]
0098e5e8	str x8,[x19, #0x10]
0098e5ec	ldr q0,[x1]
0098e5f0	str q0,[x19]
0098e5f4	b 0x0098e658
0098e5f8	ldr x22,[x1, #0x8]
0098e5fc	cmn x22,#0x10
0098e600	b.cs 0x0098e808
0098e604	ldr x23,[x1, #0x10]
0098e608	cmp x22,#0x17
0098e60c	b.cs 0x0098e624
0098e610	lsl w8,w22,#0x1
0098e614	mov x24,x19
0098e618	strb w8,[x24], #0x1
0098e61c	cbnz x22,0x0098e644
0098e620	b 0x0098e654
0098e624	add x8,x22,#0x10
0098e628	and x25,x8,#-0x10
0098e62c	mov x0,x25
0098e630	bl 0x00c2fed0
0098e634	orr x8,x25,#0x1
0098e638	mov x24,x0
0098e63c	stp x22,x0,[x19, #0x8]
0098e640	str x8,[x19]
0098e644	mov x0,x24
0098e648	mov x1,x23
0098e64c	mov x2,x22
0098e650	bl 0x00c2ffd0
0098e654	strb wzr,[x24, x22]
0098e658	mov x22,x19
0098e65c	str xzr,[x22, #0x20]!
0098e660	str xzr,[x22, #0x8]
0098e664	stur x22,[x22, #-0x8]
0098e668	ldr x27,[x21], #0x8
0098e66c	sub x23,x22,#0x8
0098e670	cmp x27,x21
0098e674	b.eq 0x0098e750
0098e678	add x25,x27,#0x20
0098e67c	add x2,sp,#0x8
0098e680	mov x3,sp
0098e684	mov x0,x23
0098e688	mov x1,x22
0098e68c	mov x4,x25
0098e690	bl 0x00c32f90
0098e694	ldr x8,[x0]
0098e698	mov x24,x0
0098e69c	cbz x8,0x0098e6ac
0098e6a0	ldr x8,[x27, #0x8]
0098e6a4	cbnz x8,0x0098e6fc
0098e6a8	b 0x0098e70c
0098e6ac	add x8,sp,#0x10
0098e6b0	mov x0,x23
0098e6b4	mov x1,x25
0098e6b8	bl 0x00c32fa0
0098e6bc	ldp x8,x1,[sp, #0x8]
0098e6c0	stp xzr,xzr,[x1]
0098e6c4	str x8,[x1, #0x10]
0098e6c8	str x1,[x24]
0098e6cc	ldr x8,[x23]
0098e6d0	ldr x8,[x8]
0098e6d4	cbz x8,0x0098e6e0
0098e6d8	str x8,[x23]
0098e6dc	ldr x1,[x24]
0098e6e0	ldr x0,[x19, #0x20]
0098e6e4	bl 0x00c30c90
0098e6e8	ldr x8,[x19, #0x28]
0098e6ec	add x8,x8,#0x1
0098e6f0	str x8,[x19, #0x28]
0098e6f4	ldr x8,[x27, #0x8]
0098e6f8	cbz x8,0x0098e70c
0098e6fc	mov x27,x8
0098e700	ldr x8,[x8]
0098e704	cbnz x8,0x0098e6fc
0098e708	b 0x0098e738
0098e70c	mov x8,x27
0098e710	ldr x9,[x8, #0x10]!
0098e714	ldr x10,[x9]
0098e718	cmp x10,x27
0098e71c	b.eq 0x0098e744
0098e720	ldr x9,[x8]
0098e724	mov x8,x9
0098e728	ldr x27,[x8, #0x10]!
0098e72c	ldr x10,[x27]
0098e730	cmp x10,x9
0098e734	b.ne 0x0098e720
0098e738	cmp x27,x21
0098e73c	b.ne 0x0098e678
0098e740	b 0x0098e750
0098e744	mov x27,x9
0098e748	cmp x27,x21
0098e74c	b.ne 0x0098e678
0098e750	mov x21,x19
0098e754	str xzr,[x21, #0x30]!
0098e758	stp xzr,xzr,[x21, #0x8]
0098e75c	ldrb w8,[x20]
0098e760	tbnz w8,#0x0,0x0098e778
0098e764	ldr x8,[x20, #0x10]
0098e768	str x8,[x21, #0x10]
0098e76c	ldr q0,[x20]
0098e770	str q0,[x21]
0098e774	b 0x0098e7d4
0098e778	ldr x24,[x20, #0x8]
0098e77c	cmn x24,#0x10
0098e780	b.cs 0x0098e810
0098e784	ldr x20,[x20, #0x10]
0098e788	cmp x24,#0x17
0098e78c	b.cs 0x0098e7a0
0098e790	lsl w8,w24,#0x1
0098e794	strb w8,[x21], #0x1
0098e798	cbnz x24,0x0098e7c0
0098e79c	b 0x0098e7d0
0098e7a0	add x8,x24,#0x10
0098e7a4	and x25,x8,#-0x10
0098e7a8	mov x0,x25
0098e7ac	bl 0x00c2fed0
0098e7b0	orr x8,x25,#0x1
0098e7b4	mov x21,x0
0098e7b8	stp x24,x0,[x19, #0x38]
0098e7bc	str x8,[x19, #0x30]
0098e7c0	mov x0,x21
0098e7c4	mov x1,x20
0098e7c8	mov x2,x24
0098e7cc	bl 0x00c2ffd0
0098e7d0	strb wzr,[x21, x24]
0098e7d4	ldr x8,[x26, #0x28]
0098e7d8	ldr x9,[sp, #0x28]
0098e7dc	cmp x8,x9
0098e7e0	b.ne 0x0098e804
0098e7e4	ldp x29,x30,[sp, #0x80]
0098e7e8	ldp x20,x19,[sp, #0x70]
0098e7ec	ldp x22,x21,[sp, #0x60]
0098e7f0	ldp x24,x23,[sp, #0x50]
0098e7f4	ldp x26,x25,[sp, #0x40]
0098e7f8	ldr x27,[sp, #0x30]
0098e7fc	add sp,sp,#0x90
0098e800	ret
0098e804	bl 0x00c2fec0
0098e808	mov x0,x19
0098e80c	bl 0x00c30ce0
0098e810	mov x0,x21
0098e814	bl 0x00c30ce0
