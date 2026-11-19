; curl_mvsprintf @ 0092a898
0092a898	sub sp,sp,#0x50
0092a89c	str x19,[sp, #0x30]
0092a8a0	stp x29,x30,[sp, #0x40]
0092a8a4	add x29,sp,#0x40
0092a8a8	mrs x19,tpidr_el0
0092a8ac	ldr x9,[x19, #0x28]
0092a8b0	mov x8,x1
0092a8b4	nop
0092a8b8	adr x1,0x92a704
0092a8bc	stur x9,[x29, #-0x18]
0092a8c0	str x0,[sp, #0x20]
0092a8c4	ldr q0,[x2, #0x10]
0092a8c8	add x0,sp,#0x20
0092a8cc	mov x3,sp
0092a8d0	str q0,[sp, #0x10]
0092a8d4	ldr q0,[x2]
0092a8d8	mov x2,x8
0092a8dc	str q0,[sp]
0092a8e0	bl 0x00929028
0092a8e4	ldr x8,[sp, #0x20]
0092a8e8	strb wzr,[x8]
0092a8ec	ldr x8,[x19, #0x28]
0092a8f0	ldur x9,[x29, #-0x18]
0092a8f4	cmp x8,x9
0092a8f8	b.ne 0x0092a90c
0092a8fc	ldp x29,x30,[sp, #0x40]
0092a900	ldr x19,[sp, #0x30]
0092a904	add sp,sp,#0x50
0092a908	ret
0092a90c	bl 0x00c2fec0
