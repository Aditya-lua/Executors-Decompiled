; FUN_0092a3d4 @ 0092a3d4
0092a3d4	sub sp,sp,#0x60
0092a3d8	str x19,[sp, #0x40]
0092a3dc	stp x29,x30,[sp, #0x50]
0092a3e0	add x29,sp,#0x50
0092a3e4	mrs x19,tpidr_el0
0092a3e8	ldr x9,[x19, #0x28]
0092a3ec	mov x8,x1
0092a3f0	nop
0092a3f4	adr x1,0x92a464
0092a3f8	stur x9,[x29, #-0x18]
0092a3fc	str x0,[sp, #0x28]
0092a400	strb wzr,[sp, #0x30]
0092a404	ldr q0,[x2, #0x10]
0092a408	add x0,sp,#0x28
0092a40c	mov x3,sp
0092a410	str q0,[sp, #0x10]
0092a414	ldr q0,[x2]
0092a418	mov x2,x8
0092a41c	str q0,[sp]
0092a420	bl 0x00929028
0092a424	ldrb w8,[sp, #0x30]
0092a428	cbz w8,0x0092a43c
0092a42c	ldr x0,[sp, #0x28]
0092a430	bl 0x00904534
0092a434	ldrb w0,[sp, #0x30]
0092a438	b 0x0092a440
0092a43c	mov w0,wzr
0092a440	ldr x8,[x19, #0x28]
0092a444	ldur x9,[x29, #-0x18]
0092a448	cmp x8,x9
0092a44c	b.ne 0x0092a460
0092a450	ldp x29,x30,[sp, #0x50]
0092a454	ldr x19,[sp, #0x40]
0092a458	add sp,sp,#0x60
0092a45c	ret
0092a460	bl 0x00c2fec0
