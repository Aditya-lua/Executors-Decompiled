; FUN_0090a93c @ 0090a93c
0090a93c	sub sp,sp,#0x60
0090a940	stp x24,x23,[sp, #0x20]
0090a944	stp x22,x21,[sp, #0x30]
0090a948	stp x20,x19,[sp, #0x40]
0090a94c	stp x29,x30,[sp, #0x50]
0090a950	add x29,sp,#0x50
0090a954	mrs x23,tpidr_el0
0090a958	ldr x8,[x23, #0x28]
0090a95c	mov w19,w2
0090a960	mov x21,x1
0090a964	str x8,[sp, #0x18]
0090a968	ldr x24,[x0, #0x10]
0090a96c	ldr x8,[x24, #0x20]
0090a970	stp xzr,xzr,[sp, #0x8]
0090a974	cbz x8,0x0090a9e0
0090a978	ldr x0,[x8, #0x28]
0090a97c	cbz x0,0x0090a9e0
0090a980	ldr x8,[x0]
0090a984	add x4,sp,#0x8
0090a988	mov x1,x21
0090a98c	mov w2,w19
0090a990	ldr x8,[x8, #0x70]
0090a994	mov x3,xzr
0090a998	blr x8
0090a99c	mov x20,xzr
0090a9a0	mov x22,xzr
0090a9a4	cbnz w0,0x0090a9e8
0090a9a8	ldr x0,[sp, #0x8]
0090a9ac	cbnz x0,0x0090a9c0
0090a9b0	ldr w8,[sp, #0x10]
0090a9b4	mov x20,xzr
0090a9b8	mov x22,xzr
0090a9bc	cbz w8,0x0090a9e8
0090a9c0	ldr x1,[sp, #0x10]
0090a9c4	mov x2,xzr
0090a9c8	mov x3,xzr
0090a9cc	bl 0x00941e38
0090a9d0	cmp x0,#0x1
0090a9d4	b.lt 0x0090a9e0
0090a9d8	ldp x20,x22,[sp, #0x8]
0090a9dc	b 0x0090a9e8
0090a9e0	mov x20,xzr
0090a9e4	mov x22,xzr
0090a9e8	ldr x8,[x24, #0x28]
0090a9ec	stp xzr,xzr,[sp, #0x8]
0090a9f0	cbz x8,0x0090aa48
0090a9f4	ldr x0,[x8, #0x28]
0090a9f8	cbz x0,0x0090aa48
0090a9fc	ldr x8,[x0]
0090aa00	add x4,sp,#0x8
0090aa04	mov x1,x21
0090aa08	mov w2,w19
0090aa0c	ldr x8,[x8, #0x70]
0090aa10	mov x3,xzr
0090aa14	blr x8
0090aa18	cbnz w0,0x0090aa48
0090aa1c	ldr x0,[sp, #0x8]
0090aa20	cbnz x0,0x0090aa2c
0090aa24	ldr w8,[sp, #0x10]
0090aa28	cbz w8,0x0090aa48
0090aa2c	ldr x1,[sp, #0x10]
0090aa30	mov x2,x20
0090aa34	mov x3,x22
0090aa38	bl 0x00941e38
0090aa3c	cmp x0,#0x1
0090aa40	b.lt 0x0090aa48
0090aa44	ldp x20,x22,[sp, #0x8]
0090aa48	ldr x8,[x23, #0x28]
0090aa4c	ldr x9,[sp, #0x18]
0090aa50	cmp x8,x9
0090aa54	b.ne 0x0090aa78
0090aa58	mov x0,x20
0090aa5c	mov x1,x22
0090aa60	ldp x29,x30,[sp, #0x50]
0090aa64	ldp x20,x19,[sp, #0x40]
0090aa68	ldp x22,x21,[sp, #0x30]
0090aa6c	ldp x24,x23,[sp, #0x20]
0090aa70	add sp,sp,#0x60
0090aa74	ret
0090aa78	bl 0x00c2fec0
