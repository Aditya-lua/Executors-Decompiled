; FUN_0086f804 @ 0086f804
0086f804	sub sp,sp,#0x70
0086f808	stp x29,x30,[sp, #0x40]
0086f80c	str x21,[sp, #0x50]
0086f810	stp x20,x19,[sp, #0x60]
0086f814	add x29,sp,#0x40
0086f818	mrs x20,tpidr_el0
0086f81c	mov x19,x0
0086f820	ldr x8,[x20, #0x28]
0086f824	cmp x0,x1
0086f828	stur x8,[x29, #-0x8]
0086f82c	b.eq 0x0086f8f4
0086f830	mov x0,sp
0086f834	mov x21,sp
0086f838	bl 0x0086f5d8
0086f83c	cmp x19,x21
0086f840	b.eq 0x0086f8b8
0086f844	ldr x0,[x19]
0086f848	cbz x0,0x0086f878
0086f84c	bl 0x00c301d0
0086f850	ldr x0,[x19, #0x18]
0086f854	str xzr,[x19]
0086f858	bl 0x00c301d0
0086f85c	mov x0,xzr
0086f860	stp xzr,xzr,[x19, #0x8]
0086f864	str xzr,[x19, #0x18]
0086f868	bl 0x00c301d0
0086f86c	mov w8,#0x40
0086f870	str xzr,[x19, #0x20]
0086f874	strb w8,[x19, #0x30]
0086f878	ldr x8,[sp]
0086f87c	ldr x0,[x19, #0x18]
0086f880	str x8,[x19]
0086f884	bl 0x00c301d0
0086f888	ldr x8,[sp, #0x18]
0086f88c	ldur q0,[sp, #0x8]
0086f890	stp xzr,xzr,[sp, #0x10]
0086f894	stp xzr,xzr,[sp]
0086f898	str x8,[x19, #0x18]
0086f89c	ldrb w8,[sp, #0x30]
0086f8a0	stur q0,[x19, #0x8]
0086f8a4	ldr q0,[sp, #0x20]
0086f8a8	strb w8,[x19, #0x30]
0086f8ac	str q0,[x19, #0x20]
0086f8b0	stp xzr,xzr,[sp, #0x20]
0086f8b4	b 0x0086f8e4
0086f8b8	ldr x0,[sp]
0086f8bc	cbz x0,0x0086f8ec
0086f8c0	bl 0x00c301d0
0086f8c4	ldr x0,[sp, #0x18]
0086f8c8	str xzr,[sp]
0086f8cc	bl 0x00c301d0
0086f8d0	mov x0,xzr
0086f8d4	stp xzr,xzr,[sp, #0x8]
0086f8d8	str xzr,[sp, #0x18]
0086f8dc	bl 0x00c301d0
0086f8e0	str xzr,[sp, #0x20]
0086f8e4	mov w8,#0x40
0086f8e8	strb w8,[sp, #0x30]
0086f8ec	ldr x0,[sp, #0x18]
0086f8f0	bl 0x00c301d0
0086f8f4	ldr x8,[x20, #0x28]
0086f8f8	ldur x9,[x29, #-0x8]
0086f8fc	cmp x8,x9
0086f900	b.ne 0x0086f91c
0086f904	mov x0,x19
0086f908	ldp x20,x19,[sp, #0x60]
0086f90c	ldr x21,[sp, #0x50]
0086f910	ldp x29,x30,[sp, #0x40]
0086f914	add sp,sp,#0x70
0086f918	ret
0086f91c	bl 0x00c2fec0
