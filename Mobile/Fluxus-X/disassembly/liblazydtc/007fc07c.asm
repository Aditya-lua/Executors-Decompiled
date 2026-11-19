; _INIT_7 @ 007fc07c
007fc07c	sub sp,sp,#0x40
007fc080	stp x29,x30,[sp, #0x20]
007fc084	stp x20,x19,[sp, #0x30]
007fc088	add x29,sp,#0x20
007fc08c	mrs x20,tpidr_el0
007fc090	ldr x8,[x20, #0x28]
007fc094	stur x8,[x29, #-0x8]
007fc098	adrp x8,0xcca000
007fc09c	add x8,x8,#0x8b0
007fc0a0	ldarb w8,[x8]
007fc0a4	tbnz w8,#0x0,0x007fc104
007fc0a8	adrp x0,0xcca000
007fc0ac	add x0,x0,#0x8b0
007fc0b0	bl 0x00c2fe90
007fc0b4	cbz w0,0x007fc104
007fc0b8	adrp x9,0x29d000
007fc0bc	add x9,x9,#0x2e8
007fc0c0	mov w8,#0x45
007fc0c4	ldr q0,[x9]
007fc0c8	strb w8,[sp, #0x10]
007fc0cc	adrp x8,0xcca000
007fc0d0	add x8,x8,#0x9d8
007fc0d4	str q0,[sp]
007fc0d8	ldarb w8,[x8]
007fc0dc	tbz w8,#0x0,0x007fc124
007fc0e0	adrp x19,0xcca000
007fc0e4	add x19,x19,#0x9c0
007fc0e8	mov x0,x19
007fc0ec	bl 0x007fe8c0
007fc0f0	adrp x8,0xcca000
007fc0f4	adrp x0,0xcca000
007fc0f8	add x0,x0,#0x8b0
007fc0fc	str x19,[x8, #0x8a8]
007fc100	bl 0x00c2fea0
007fc104	ldr x8,[x20, #0x28]
007fc108	ldur x9,[x29, #-0x8]
007fc10c	cmp x8,x9
007fc110	b.ne 0x007fc1a4
007fc114	ldp x20,x19,[sp, #0x30]
007fc118	ldp x29,x30,[sp, #0x20]
007fc11c	add sp,sp,#0x40
007fc120	ret
007fc124	adrp x0,0xcca000
007fc128	add x0,x0,#0x9d8
007fc12c	bl 0x00c2fe90
007fc130	cbz w0,0x007fc0e0
007fc134	adrp x0,0xcca000
007fc138	add x0,x0,#0x9c0
007fc13c	mov x1,sp
007fc140	bl 0x007fdd5c
007fc144	nop
007fc148	adr x0,0x7fddf0
007fc14c	adrp x1,0xcca000
007fc150	add x1,x1,#0x9c0
007fc154	adrp x2,0xc48000
007fc158	add x2,x2,#0x880
007fc15c	bl 0x00c2fe70
007fc160	adrp x0,0xcca000
007fc164	add x0,x0,#0x9d8
007fc168	bl 0x00c2fea0
007fc16c	b 0x007fc0e0
007fc1a4	bl 0x00c2fec0
