; FUN_0080ea2c @ 0080ea2c
0080ea2c	sub sp,sp,#0x40
0080ea30	stp x29,x30,[sp, #0x20]
0080ea34	stp x20,x19,[sp, #0x30]
0080ea38	add x29,sp,#0x20
0080ea3c	mrs x19,tpidr_el0
0080ea40	adrp x9,0x32d000
0080ea44	add x9,x9,#0x61b
0080ea48	ldr x8,[x19, #0x28]
0080ea4c	ldr q0,[x9]
0080ea50	stur x8,[x29, #-0x8]
0080ea54	mov w8,#0x5f
0080ea58	str q0,[sp]
0080ea5c	strb w8,[sp, #0x10]
0080ea60	adrp x8,0xd1b000
0080ea64	add x8,x8,#0x980
0080ea68	ldarb w8,[x8]
0080ea6c	tbz w8,#0x0,0x0080ea90
0080ea70	ldr x8,[x19, #0x28]
0080ea74	ldur x9,[x29, #-0x8]
0080ea78	cmp x8,x9
0080ea7c	b.ne 0x0080eb04
0080ea80	ldp x20,x19,[sp, #0x30]
0080ea84	ldp x29,x30,[sp, #0x20]
0080ea88	add sp,sp,#0x40
0080ea8c	ret
0080ea90	adrp x0,0xd1b000
0080ea94	add x0,x0,#0x980
0080ea98	bl 0x00c2fe90
0080ea9c	cbz w0,0x0080ea70
0080eaa0	adrp x0,0xd1b000
0080eaa4	add x0,x0,#0x968
0080eaa8	mov x1,sp
0080eaac	bl 0x0080eb08
0080eab0	nop
0080eab4	adr x0,0x80eb9c
0080eab8	adrp x1,0xd1b000
0080eabc	add x1,x1,#0x968
0080eac0	adrp x2,0xc48000
0080eac4	add x2,x2,#0x880
0080eac8	bl 0x00c2fe70
0080eacc	adrp x0,0xd1b000
0080ead0	add x0,x0,#0x980
0080ead4	bl 0x00c2fea0
0080ead8	b 0x0080ea70
0080eb04	bl 0x00c2fec0
