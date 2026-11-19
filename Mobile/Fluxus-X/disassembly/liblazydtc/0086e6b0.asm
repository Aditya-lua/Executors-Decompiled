; FUN_0086e6b0 @ 0086e6b0
0086e6b0	sub sp,sp,#0xc0
0086e6b4	stp x29,x30,[sp, #0x80]
0086e6b8	str x23,[sp, #0x90]
0086e6bc	stp x22,x21,[sp, #0xa0]
0086e6c0	stp x20,x19,[sp, #0xb0]
0086e6c4	add x29,sp,#0x80
0086e6c8	mrs x21,tpidr_el0
0086e6cc	mov x20,x0
0086e6d0	mov x19,x1
0086e6d4	ldr x8,[x21, #0x28]
0086e6d8	stur x8,[x29, #-0x8]
0086e6dc	ldp x9,x8,[x0, #0x1d0]
0086e6e0	cmp x9,x8
0086e6e4	b.eq 0x0086e728
0086e6e8	ldr w9,[x19, #0x4]
0086e6ec	ldur w10,[x8, #-0x24]
0086e6f0	cmp w9,w10
0086e6f4	b.ne 0x0086e728
0086e6f8	ldr w9,[x19]
0086e6fc	ldur w10,[x8, #-0x28]
0086e700	cmp w9,w10
0086e704	b.ne 0x0086e728
0086e708	ldr w9,[x19, #0xc]
0086e70c	ldur w10,[x8, #-0x1c]
0086e710	cmp w9,w10
0086e714	b.ne 0x0086e728
0086e718	ldr w9,[x19, #0x8]
0086e71c	ldur w8,[x8, #-0x20]
0086e720	cmp w9,w8
0086e724	b.eq 0x0086e80c
0086e728	ldp q0,q1,[x3]
0086e72c	sub x8,x29,#0x38
0086e730	add x1,sp,#0x20
0086e734	mov x0,x2
0086e738	stp q0,q1,[sp, #0x20]
0086e73c	bl 0x008aa1ac
0086e740	adrp x22,0xd1e000
0086e744	ldr w8,[x22, #0xbe0]
0086e748	cmp w8,#0x1
0086e74c	b.eq 0x0086e834
0086e750	ldp x23,x8,[x20, #0x1d8]
0086e754	cmp x23,x8
0086e758	b.cs 0x0086e778
0086e75c	ldurb w8,[x29, #-0x38]
0086e760	tbnz w8,#0x0,0x0086e78c
0086e764	ldur q0,[x29, #-0x38]
0086e768	ldur x8,[x29, #-0x28]
0086e76c	stur q0,[x29, #-0x20]
0086e770	stur x8,[x29, #-0x10]
0086e774	b 0x0086e798
0086e778	add x0,x20,#0x1d0
0086e77c	sub x2,x29,#0x38
0086e780	mov x1,x19
0086e784	bl 0x008702a0
0086e788	b 0x0086e7c4
0086e78c	ldp x2,x1,[x29, #-0x30]
0086e790	sub x0,x29,#0x20
0086e794	bl 0x007ff40c
0086e798	adrp x8,0xc4a000
0086e79c	add x8,x8,#0x5f8
0086e7a0	add x0,x23,#0x30
0086e7a4	str x8,[x23]
0086e7a8	ldr q0,[x19]
0086e7ac	stur q0,[x23, #0x8]
0086e7b0	ldur q0,[x29, #-0x20]
0086e7b4	ldur x8,[x29, #-0x10]
0086e7b8	stur q0,[x23, #0x18]
0086e7bc	str x8,[x23, #0x28]
0086e7c0	str x0,[x20, #0x1d8]
0086e7c4	ldr x8,[x20, #0x1d0]
0086e7c8	orr x9,xzr,#-0x5555555555555556
0086e7cc	ldr w2,[x22, #0xbe0]
0086e7d0	movk x9,#0xaaab
0086e7d4	str x0,[x20, #0x1d8]
0086e7d8	sub x8,x0,x8
0086e7dc	asr x8,x8,#0x4
0086e7e0	mul x8,x8,x9
0086e7e4	cmp x8,x2
0086e7e8	b.cc 0x0086e7f4
0086e7ec	ldrb w8,[x20, #0x69]
0086e7f0	tbz w8,#0x0,0x0086e8bc
0086e7f4	ldurb w8,[x29, #-0x38]
0086e7f8	tbz w8,#0x0,0x0086e80c
0086e7fc	ldur x8,[x29, #-0x38]
0086e800	ldur x0,[x29, #-0x28]
0086e804	and x1,x8,#-0x2
0086e808	bl 0x00c2fe80
0086e80c	ldr x8,[x21, #0x28]
0086e810	ldur x9,[x29, #-0x8]
0086e814	cmp x8,x9
0086e818	b.ne 0x0086e94c
0086e81c	ldp x20,x19,[sp, #0xb0]
0086e820	ldr x23,[sp, #0x90]
0086e824	ldp x22,x21,[sp, #0xa0]
0086e828	ldp x29,x30,[sp, #0x80]
0086e82c	add sp,sp,#0xc0
0086e830	ret
0086e834	mov w0,#0x30
0086e838	bl 0x00c30000
0086e83c	ldurb w8,[x29, #-0x38]
0086e840	mov x20,x0
0086e844	tbnz w8,#0x0,0x0086e85c
0086e848	ldur q0,[x29, #-0x38]
0086e84c	ldur x8,[x29, #-0x28]
0086e850	str q0,[sp]
0086e854	str x8,[sp, #0x10]
0086e858	b 0x0086e868
0086e85c	ldp x2,x1,[x29, #-0x30]
0086e860	mov x0,sp
0086e864	bl 0x007ff40c
0086e868	adrp x8,0xc4a000
0086e86c	add x8,x8,#0x5f8
0086e870	str x8,[x20]
0086e874	ldr q0,[x19]
0086e878	stur q0,[x20, #0x8]
0086e87c	ldr q0,[sp]
0086e880	ldr x8,[sp, #0x10]
0086e884	stp xzr,xzr,[sp, #0x8]
0086e888	str xzr,[sp]
0086e88c	stur q0,[x20, #0x18]
0086e890	str x8,[x20, #0x28]
0086e894	ldr x8,[x21, #0x28]
0086e898	ldur x9,[x29, #-0x8]
0086e89c	cmp x8,x9
0086e8a0	b.ne 0x0086e94c
0086e8a4	adrp x1,0xc4a000
0086e8a8	add x1,x1,#0x610
0086e8ac	nop
0086e8b0	adr x2,0x857a64
0086e8b4	mov x0,x20
0086e8b8	bl 0x00c30020
0086e8bc	ldr x8,[x21, #0x28]
0086e8c0	ldur x9,[x29, #-0x8]
0086e8c4	cmp x8,x9
0086e8c8	b.ne 0x0086e94c
0086e8cc	adrp x1,0x29f000
0086e8d0	add x1,x1,#0x254
0086e8d4	mov x0,x19
0086e8d8	bl 0x008578f8
0086e8dc	mov x19,x0
0086e8e0	str x23,[x20, #0x1d8]
0086e8e4	b 0x0086e91c
0086e91c	ldurb w8,[x29, #-0x38]
0086e920	tbz w8,#0x0,0x0086e934
0086e924	ldur x8,[x29, #-0x38]
0086e928	ldur x0,[x29, #-0x28]
0086e92c	and x1,x8,#-0x2
0086e930	bl 0x00c2fe80
0086e934	ldr x8,[x21, #0x28]
0086e938	ldur x9,[x29, #-0x8]
0086e93c	cmp x8,x9
0086e940	b.ne 0x0086e94c
0086e944	mov x0,x19
0086e948	bl 0x00c2c090
0086e94c	bl 0x00c2fec0
