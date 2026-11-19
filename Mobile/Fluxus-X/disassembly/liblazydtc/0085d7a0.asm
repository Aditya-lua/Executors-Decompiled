; FUN_0085d7a0 @ 0085d7a0
0085d7a0	sub sp,sp,#0xe0
0085d7a4	stp x29,x30,[sp, #0x80]
0085d7a8	str x27,[sp, #0x90]
0085d7ac	stp x26,x25,[sp, #0xa0]
0085d7b0	stp x24,x23,[sp, #0xb0]
0085d7b4	stp x22,x21,[sp, #0xc0]
0085d7b8	stp x20,x19,[sp, #0xd0]
0085d7bc	add x29,sp,#0x80
0085d7c0	mrs x25,tpidr_el0
0085d7c4	mov w21,w2
0085d7c8	mov x19,x0
0085d7cc	ldr x8,[x25, #0x28]
0085d7d0	stur x8,[x29, #-0x8]
0085d7d4	ldr w8,[x0, #0x90]
0085d7d8	cmp w8,#0x12b
0085d7dc	b.ne 0x0085d818
0085d7e0	ldr x8,[x25, #0x28]
0085d7e4	ldur x9,[x29, #-0x8]
0085d7e8	cmp x8,x9
0085d7ec	b.ne 0x0085da00
0085d7f0	and w2,w21,#0x1
0085d7f4	mov x0,x19
0085d7f8	ldp x20,x19,[sp, #0xd0]
0085d7fc	ldr x27,[sp, #0x90]
0085d800	ldp x22,x21,[sp, #0xc0]
0085d804	ldp x24,x23,[sp, #0xb0]
0085d808	ldp x26,x25,[sp, #0xa0]
0085d80c	ldp x29,x30,[sp, #0x80]
0085d810	add sp,sp,#0xe0
0085d814	b 0x008639d4
0085d818	mov x23,x1
0085d81c	mov x20,x3
0085d820	cmp w8,#0x119
0085d824	b.ne 0x0085d84c
0085d828	ldur q0,[x19, #0x94]
0085d82c	ldr x22,[x19, #0xa8]
0085d830	mov x0,x19
0085d834	stur q0,[x29, #-0x20]
0085d838	bl 0x00858f2c
0085d83c	mov w8,#0x1
0085d840	stur x22,[x29, #-0x28]
0085d844	sturb w8,[x29, #-0x10]
0085d848	b 0x0085d874
0085d84c	adrp x1,0x2ca000
0085d850	add x1,x1,#0xa72
0085d854	mov x0,x19
0085d858	bl 0x0086e040
0085d85c	ldur q0,[x19, #0x94]
0085d860	ldr x8,[x19, #0x138]
0085d864	mov w9,#0x1
0085d868	sturb w9,[x29, #-0x10]
0085d86c	stur q0,[x29, #-0x20]
0085d870	stur x8,[x29, #-0x28]
0085d874	ldrb w9,[x19, #0x68]
0085d878	mov x8,#-0x1
0085d87c	stp xzr,x8,[sp, #0x30]
0085d880	stp x8,xzr,[sp, #0x20]
0085d884	cmp w9,#0x1
0085d888	mov x8,sp
0085d88c	b.ne 0x0085d8a8
0085d890	add x2,sp,#0x38
0085d894	add x3,sp,#0x28
0085d898	add x4,sp,#0x20
0085d89c	mov x0,x19
0085d8a0	mov w1,#0x1
0085d8a4	b 0x0085d8bc
0085d8a8	mov x0,x19
0085d8ac	mov w1,#0x1
0085d8b0	mov x2,xzr
0085d8b4	mov x3,xzr
0085d8b8	mov x4,xzr
0085d8bc	bl 0x00863bd4
0085d8c0	ldr w8,[x19, #0x90]
0085d8c4	cmp w8,#0x3d
0085d8c8	b.ne 0x0085d8dc
0085d8cc	mov x0,x19
0085d8d0	bl 0x00858f2c
0085d8d4	ldr x22,[x19, #0xb0]
0085d8d8	b 0x0085d8f4
0085d8dc	adrp x2,0x2d2000
0085d8e0	add x2,x2,#0xbe5
0085d8e4	mov x0,x19
0085d8e8	mov w1,#0x3d
0085d8ec	bl 0x0086e3b4
0085d8f0	mov x22,#-0x1
0085d8f4	ldr w8,[x19, #0x90]
0085d8f8	ldur q0,[x19, #0x94]
0085d8fc	mov x1,xzr
0085d900	ldr w27,[x19, #0x124]
0085d904	mov x26,sp
0085d908	cmp w8,#0x26
0085d90c	str q0,[sp, #0x40]
0085d910	b.eq 0x0085d934
0085d914	cmp w8,#0x7c
0085d918	b.eq 0x0085d934
0085d91c	mov x0,x19
0085d920	mov w1,wzr
0085d924	mov w2,wzr
0085d928	bl 0x008695d4
0085d92c	mov x1,x0
0085d930	str w27,[x19, #0x124]
0085d934	add x2,sp,#0x40
0085d938	mov x0,x19
0085d93c	bl 0x00867310
0085d940	str w27,[x19, #0x124]
0085d944	mov x24,x0
0085d948	mov w1,#0x68
0085d94c	ldr x8,[x23]
0085d950	ldur x9,[x0, #0x14]
0085d954	ldr x0,[x19, #0xe8]
0085d958	sub x27,x29,#0x28
0085d95c	stp x8,x9,[sp, #0x40]
0085d960	bl 0x0084e938
0085d964	add x1,sp,#0x40
0085d968	sub x2,x29,#0x28
0085d96c	add x3,x27,#0x8
0085d970	mov x4,sp
0085d974	add x5,x26,#0x10
0085d978	and w7,w21,#0x1
0085d97c	mov x6,x24
0085d980	mov x23,x0
0085d984	bl 0x00850438
0085d988	ldrb w8,[x19, #0x68]
0085d98c	cmp w8,#0x1
0085d990	b.ne 0x0085d9cc
0085d994	ldr x0,[x19, #0xe8]
0085d998	mov w1,#0x38
0085d99c	bl 0x0084e938
0085d9a0	ldp x4,x2,[sp, #0x30]
0085d9a4	mov x1,x20
0085d9a8	ldp x5,x3,[sp, #0x20]
0085d9ac	mov x6,x22
0085d9b0	mov x21,x0
0085d9b4	bl 0x00852070
0085d9b8	add x0,x19,#0x4b0
0085d9bc	add x1,sp,#0x40
0085d9c0	str x23,[sp, #0x40]
0085d9c4	bl 0x00860fa0
0085d9c8	str x21,[x0]
0085d9cc	ldr x8,[x25, #0x28]
0085d9d0	ldur x9,[x29, #-0x8]
0085d9d4	cmp x8,x9
0085d9d8	b.ne 0x0085da00
0085d9dc	mov x0,x23
0085d9e0	ldp x20,x19,[sp, #0xd0]
0085d9e4	ldr x27,[sp, #0x90]
0085d9e8	ldp x22,x21,[sp, #0xc0]
0085d9ec	ldp x24,x23,[sp, #0xb0]
0085d9f0	ldp x26,x25,[sp, #0xa0]
0085d9f4	ldp x29,x30,[sp, #0x80]
0085d9f8	add sp,sp,#0xe0
0085d9fc	ret
0085da00	bl 0x00c2fec0
