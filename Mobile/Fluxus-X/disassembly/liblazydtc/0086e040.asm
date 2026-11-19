; FUN_0086e040 @ 0086e040
0086e040	sub sp,sp,#0x50
0086e044	stp x29,x30,[sp, #0x20]
0086e048	stp x22,x21,[sp, #0x30]
0086e04c	stp x20,x19,[sp, #0x40]
0086e050	add x29,sp,#0x20
0086e054	mrs x21,tpidr_el0
0086e058	ldr x8,[x21, #0x28]
0086e05c	stur x8,[x29, #-0x8]
0086e060	cbz x1,0x0086e0a8
0086e064	mov x8,sp
0086e068	mov x20,x0
0086e06c	add x0,x0,#0x90
0086e070	mov x19,x1
0086e074	mov x22,sp
0086e078	bl 0x008521fc
0086e07c	ldrb w8,[sp]
0086e080	ldr x9,[sp, #0x10]
0086e084	tst w8,#0x1
0086e088	csinc x4,x9,x22,ne
0086e08c	adrp x2,0x2ab000
0086e090	add x2,x2,#0x3ff
0086e094	add x1,x20,#0x94
0086e098	mov x0,x20
0086e09c	mov x3,x19
0086e0a0	bl 0x00860ecc
0086e0a4	b 0x0086e0e0
0086e0a8	mov x8,sp
0086e0ac	mov x19,x0
0086e0b0	add x0,x0,#0x90
0086e0b4	mov x20,sp
0086e0b8	bl 0x008521fc
0086e0bc	ldrb w8,[sp]
0086e0c0	ldr x9,[sp, #0x10]
0086e0c4	tst w8,#0x1
0086e0c8	csinc x3,x9,x20,ne
0086e0cc	adrp x2,0x2da000
0086e0d0	add x2,x2,#0xffe
0086e0d4	add x1,x19,#0x94
0086e0d8	mov x0,x19
0086e0dc	bl 0x00860ecc
0086e0e0	ldrb w8,[sp]
0086e0e4	tbz w8,#0x0,0x0086e0f8
0086e0e8	ldr x8,[sp]
0086e0ec	ldr x0,[sp, #0x10]
0086e0f0	and x1,x8,#-0x2
0086e0f4	bl 0x00c2fe80
0086e0f8	ldr x8,[x21, #0x28]
0086e0fc	ldur x9,[x29, #-0x8]
0086e100	cmp x8,x9
0086e104	b.ne 0x0086e154
0086e108	ldp x20,x19,[sp, #0x40]
0086e10c	ldp x22,x21,[sp, #0x30]
0086e110	ldp x29,x30,[sp, #0x20]
0086e114	add sp,sp,#0x50
0086e118	ret
0086e154	bl 0x00c2fec0
