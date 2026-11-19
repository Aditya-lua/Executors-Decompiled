; FUN_0090a42c @ 0090a42c
0090a42c	sub sp,sp,#0x50
0090a430	stp x24,x23,[sp, #0x10]
0090a434	stp x22,x21,[sp, #0x20]
0090a438	stp x20,x19,[sp, #0x30]
0090a43c	stp x29,x30,[sp, #0x40]
0090a440	add x29,sp,#0x40
0090a444	mrs x24,tpidr_el0
0090a448	ldr x8,[x24, #0x28]
0090a44c	mov x19,x0
0090a450	mov w0,#0x1
0090a454	orr w1,wzr,#0x18
0090a458	str x8,[sp, #0x8]
0090a45c	adrp x8,0xcc4000
0090a460	add x8,x8,#0x690
0090a464	mov w21,w4
0090a468	mov w20,w3
0090a46c	mov x22,x2
0090a470	ldr x8,[x8]
0090a474	str xzr,[sp]
0090a478	blr x8
0090a47c	mov x23,x0
0090a480	cbz x0,0x0090a4bc
0090a484	adrp x1,0xcc4000
0090a488	add x1,x1,#0x7b8
0090a48c	mov x0,sp
0090a490	mov x2,x23
0090a494	str wzr,[x23]
0090a498	str x22,[x23, #0x8]
0090a49c	stp w21,w20,[x23, #0x10]
0090a4a0	bl 0x00907328
0090a4a4	ldr x8,[sp]
0090a4a8	cmp w0,#0x0
0090a4ac	mov w20,w0
0090a4b0	csel x0,xzr,x23,eq
0090a4b4	csel x21,x8,xzr,eq
0090a4b8	b 0x0090a4c4
0090a4bc	mov x21,xzr
0090a4c0	mov w20,#0x1b
0090a4c4	adrp x8,0xcc4000
0090a4c8	add x8,x8,#0x678
0090a4cc	ldr x8,[x8]
0090a4d0	blr x8
0090a4d4	cbnz w20,0x0090a4e4
0090a4d8	mov x0,x19
0090a4dc	mov x1,x21
0090a4e0	bl 0x009073e8
0090a4e4	ldr x8,[x24, #0x28]
0090a4e8	ldr x9,[sp, #0x8]
0090a4ec	cmp x8,x9
0090a4f0	b.ne 0x0090a510
0090a4f4	mov w0,w20
0090a4f8	ldp x29,x30,[sp, #0x40]
0090a4fc	ldp x20,x19,[sp, #0x30]
0090a500	ldp x22,x21,[sp, #0x20]
0090a504	ldp x24,x23,[sp, #0x10]
0090a508	add sp,sp,#0x50
0090a50c	ret
0090a510	bl 0x00c2fec0
