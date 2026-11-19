; FUN_009fc050 @ 009fc050
009fc050	stp x22,x21,[sp, #-0x30]!
009fc054	stp x20,x19,[sp, #0x10]
009fc058	stp x29,x30,[sp, #0x20]
009fc05c	add x29,sp,#0x20
009fc060	cbz x0,0x009fc0ec
009fc064	ldr x8,[x0, #0x8]
009fc068	mov x22,x0
009fc06c	cbz x8,0x009fc0b8
009fc070	ldr x8,[x8, #0x20]
009fc074	cbz x8,0x009fc0b8
009fc078	ldp x8,x9,[x22, #0x10]
009fc07c	mov x20,x3
009fc080	mov x19,x2
009fc084	mov x21,x1
009fc088	cbz x8,0x009fc134
009fc08c	cbnz x9,0x009fc138
009fc090	lsr x9,x19,#0x1f
009fc094	cbnz x9,0x009fc11c
009fc098	mov w1,#0x2
009fc09c	mov w5,#0x1
009fc0a0	mov x0,x22
009fc0a4	mov x2,x21
009fc0a8	mov w3,w19
009fc0ac	mov x4,xzr
009fc0b0	blr x8
009fc0b4	b 0x009fc15c
009fc0b8	bl 0x00c342a0
009fc0bc	adrp x0,0x2b2000
009fc0c0	adrp x2,0x2ad000
009fc0c4	add x0,x0,#0x42
009fc0c8	add x2,x2,#0xa2b
009fc0cc	mov w1,#0x116
009fc0d0	bl 0x00c342b0
009fc0d4	mov w0,#0x20
009fc0d8	mov w1,#0x79
009fc0dc	mov x2,xzr
009fc0e0	bl 0x00c342c0
009fc0e4	orr w6,wzr,#0xfffffffe
009fc0e8	b 0x009fc120
009fc0ec	bl 0x00c342a0
009fc0f0	adrp x0,0x2b2000
009fc0f4	adrp x2,0x2ad000
009fc0f8	add x0,x0,#0x42
009fc0fc	add x2,x2,#0xa2b
009fc100	mov w1,#0x112
009fc104	bl 0x00c342b0
009fc108	mov w1,#0x102
009fc10c	mov w0,#0x20
009fc110	movk w1,#0xc, LSL #16
009fc114	mov x2,xzr
009fc118	bl 0x00c342c0
009fc11c	mov w6,#0xffffffff
009fc120	ldp x29,x30,[sp, #0x20]
009fc124	ldp x20,x19,[sp, #0x10]
009fc128	mov w0,w6
009fc12c	ldp x22,x21,[sp], #0x30
009fc130	ret
009fc134	cbz x9,0x009fc168
009fc138	mov w1,#0x2
009fc13c	mov w6,#0x1
009fc140	mov x0,x22
009fc144	mov x2,x21
009fc148	mov x3,x19
009fc14c	mov w4,wzr
009fc150	mov x5,xzr
009fc154	mov x7,xzr
009fc158	blr x9
009fc15c	mov x6,x0
009fc160	cmp w6,#0x1
009fc164	b.lt 0x009fc120
009fc168	ldr w8,[x22, #0x28]
009fc16c	cbz w8,0x009fc1e0
009fc170	ldr x8,[x22, #0x8]
009fc174	mov x0,x22
009fc178	mov x1,x21
009fc17c	mov x2,x19
009fc180	ldr x8,[x8, #0x20]
009fc184	mov x3,x20
009fc188	blr x8
009fc18c	mov w6,w0
009fc190	cmp w0,#0x1
009fc194	b.lt 0x009fc1a8
009fc198	ldr x8,[x20]
009fc19c	ldr x9,[x22, #0x60]
009fc1a0	add x8,x9,x8
009fc1a4	str x8,[x22, #0x60]
009fc1a8	ldp x8,x9,[x22, #0x10]
009fc1ac	cbz x8,0x009fc208
009fc1b0	cbnz x9,0x009fc20c
009fc1b4	lsr x9,x19,#0x1f
009fc1b8	cbnz x9,0x009fc1d0
009fc1bc	cmp w6,#0x1
009fc1c0	b.lt 0x009fc274
009fc1c4	ldr x5,[x20]
009fc1c8	lsr x9,x5,#0x1f
009fc1cc	cbz x9,0x009fc278
009fc1d0	mov x6,#-0x1
009fc1d4	cmp w6,#0x1
009fc1d8	b.ge 0x009fc238
009fc1dc	b 0x009fc120
009fc1e0	bl 0x00c342a0
009fc1e4	adrp x0,0x2b2000
009fc1e8	adrp x2,0x2ad000
009fc1ec	add x0,x0,#0x42
009fc1f0	add x2,x2,#0xa2b
009fc1f4	mov w1,#0x120
009fc1f8	bl 0x00c342b0
009fc1fc	mov w0,#0x20
009fc200	orr w1,wzr,#0x78
009fc204	b 0x009fc114
009fc208	cbz x9,0x009fc230
009fc20c	mov w1,#0x82
009fc210	mov x0,x22
009fc214	mov x2,x21
009fc218	mov x3,x19
009fc21c	mov w4,wzr
009fc220	mov x5,xzr
009fc224	mov x7,x20
009fc228	blr x9
009fc22c	mov x6,x0
009fc230	cmp w6,#0x1
009fc234	b.lt 0x009fc120
009fc238	ldr x8,[x20]
009fc23c	cmp x8,x19
009fc240	b.ls 0x009fc120
009fc244	bl 0x00c342a0
009fc248	adrp x0,0x2b2000
009fc24c	adrp x2,0x2ad000
009fc250	add x0,x0,#0x42
009fc254	add x2,x2,#0xa2b
009fc258	mov w1,#0x12f
009fc25c	bl 0x00c342b0
009fc260	mov w8,#0x102
009fc264	movk w8,#0xc, LSL #16
009fc268	add w1,w8,#0x1
009fc26c	mov w0,#0x20
009fc270	b 0x009fc114
009fc274	sxtw x5,w6
009fc278	mov w1,#0x82
009fc27c	mov x0,x22
009fc280	mov x2,x21
009fc284	mov w3,w19
009fc288	mov x4,xzr
009fc28c	blr x8
009fc290	mov x6,x0
009fc294	cmp x0,#0x1
009fc298	b.lt 0x009fc230
009fc29c	str x6,[x20]
009fc2a0	mov w6,#0x1
009fc2a4	cmp w6,#0x1
009fc2a8	b.ge 0x009fc238
009fc2ac	b 0x009fc120
