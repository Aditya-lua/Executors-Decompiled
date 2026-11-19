; curl_mvfprintf @ 0092a980
0092a980	sub sp,sp,#0x50
0092a984	str x19,[sp, #0x30]
0092a988	stp x29,x30,[sp, #0x40]
0092a98c	add x29,sp,#0x40
0092a990	mrs x19,tpidr_el0
0092a994	ldr x9,[x19, #0x28]
0092a998	mov x8,x1
0092a99c	nop
0092a9a0	adr x1,0x92a7d4
0092a9a4	stur x9,[x29, #-0x18]
0092a9a8	ldr q0,[x2, #0x10]
0092a9ac	mov x3,sp
0092a9b0	str q0,[sp, #0x10]
0092a9b4	ldr q0,[x2]
0092a9b8	mov x2,x8
0092a9bc	str q0,[sp]
0092a9c0	bl 0x00929028
0092a9c4	ldr x8,[x19, #0x28]
0092a9c8	ldur x9,[x29, #-0x18]
0092a9cc	cmp x8,x9
0092a9d0	b.ne 0x0092a9e4
0092a9d4	ldp x29,x30,[sp, #0x40]
0092a9d8	ldr x19,[sp, #0x30]
0092a9dc	add sp,sp,#0x50
0092a9e0	ret
0092a9e4	bl 0x00c2fec0
