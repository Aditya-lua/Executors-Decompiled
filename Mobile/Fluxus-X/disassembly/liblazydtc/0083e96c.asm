; FUN_0083e96c @ 0083e96c
0083e96c	sub sp,sp,#0x50
0083e970	stp x29,x30,[sp, #0x30]
0083e974	stp x20,x19,[sp, #0x40]
0083e978	add x29,sp,#0x30
0083e97c	mrs x19,tpidr_el0
0083e980	adrp x9,0x35e000
0083e984	add x9,x9,#0x948
0083e988	ldr x8,[x19, #0x28]
0083e98c	ldr q0,[x9]
0083e990	ldur q1,[x9, #0xc]
0083e994	stur x8,[x29, #-0x8]
0083e998	adrp x8,0xd1e000
0083e99c	add x8,x8,#0x428
0083e9a0	str q0,[sp]
0083e9a4	stur q1,[sp, #0xc]
0083e9a8	ldarb w8,[x8]
0083e9ac	tbz w8,#0x0,0x0083e9d0
0083e9b0	ldr x8,[x19, #0x28]
0083e9b4	ldur x9,[x29, #-0x8]
0083e9b8	cmp x8,x9
0083e9bc	b.ne 0x0083ea44
0083e9c0	ldp x20,x19,[sp, #0x40]
0083e9c4	ldp x29,x30,[sp, #0x30]
0083e9c8	add sp,sp,#0x50
0083e9cc	ret
0083e9d0	adrp x0,0xd1e000
0083e9d4	add x0,x0,#0x428
0083e9d8	bl 0x00c2fe90
0083e9dc	cbz w0,0x0083e9b0
0083e9e0	adrp x0,0xd1e000
0083e9e4	add x0,x0,#0x408
0083e9e8	mov x1,sp
0083e9ec	bl 0x0083ebe0
0083e9f0	nop
0083e9f4	adr x0,0x83eccc
0083e9f8	adrp x1,0xd1e000
0083e9fc	add x1,x1,#0x408
0083ea00	adrp x2,0xc48000
0083ea04	add x2,x2,#0x880
0083ea08	bl 0x00c2fe70
0083ea0c	adrp x0,0xd1e000
0083ea10	add x0,x0,#0x428
0083ea14	bl 0x00c2fea0
0083ea18	b 0x0083e9b0
0083ea44	bl 0x00c2fec0
