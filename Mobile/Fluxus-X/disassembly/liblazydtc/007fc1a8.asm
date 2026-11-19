; _INIT_8 @ 007fc1a8
007fc1a8	sub sp,sp,#0x40
007fc1ac	stp x29,x30,[sp, #0x20]
007fc1b0	stp x20,x19,[sp, #0x30]
007fc1b4	add x29,sp,#0x20
007fc1b8	mrs x19,tpidr_el0
007fc1bc	ldr x8,[x19, #0x28]
007fc1c0	stur x8,[x29, #-0x8]
007fc1c4	adrp x8,0xcca000
007fc1c8	add x8,x8,#0x8c0
007fc1cc	ldarb w8,[x8]
007fc1d0	tbnz w8,#0x0,0x007fc260
007fc1d4	adrp x0,0xcca000
007fc1d8	add x0,x0,#0x8c0
007fc1dc	bl 0x00c2fe90
007fc1e0	cbz w0,0x007fc260
007fc1e4	adrp x8,0x29d000
007fc1e8	add x8,x8,#0x2f9
007fc1ec	ldr q0,[x8]
007fc1f0	ldr x8,[x8, #0x10]
007fc1f4	str q0,[sp]
007fc1f8	str x8,[sp, #0x10]
007fc1fc	adrp x8,0xcca000
007fc200	add x8,x8,#0xa00
007fc204	ldarb w8,[x8]
007fc208	tbz w8,#0x0,0x007fc280
007fc20c	adrp x8,0xcca000
007fc210	ldrb w8,[x8, #0x9f8]
007fc214	cmp w8,#0x1
007fc218	adrp x8,0xcca000
007fc21c	add x8,x8,#0x9e0
007fc220	b.ne 0x007fc24c
007fc224	adrp x9,0x29a000
007fc228	ldp d1,d2,[x8]
007fc22c	ldr d0,[x9, #0x7a0]
007fc230	ldr d3,[x8, #0x10]
007fc234	strb wzr,[x8, #0x18]
007fc238	eor v1.8B,v1.8B,v0.8B
007fc23c	eor v2.8B,v2.8B,v0.8B
007fc240	eor v0.8B,v3.8B,v0.8B
007fc244	stp d1,d2,[x8]
007fc248	str d0,[x8, #0x10]
007fc24c	adrp x9,0xcca000
007fc250	adrp x0,0xcca000
007fc254	add x0,x0,#0x8c0
007fc258	str x8,[x9, #0x8b8]
007fc25c	bl 0x00c2fea0
007fc260	ldr x8,[x19, #0x28]
007fc264	ldur x9,[x29, #-0x8]
007fc268	cmp x8,x9
007fc26c	b.ne 0x007fc300
007fc270	ldp x20,x19,[sp, #0x30]
007fc274	ldp x29,x30,[sp, #0x20]
007fc278	add sp,sp,#0x40
007fc27c	ret
007fc280	adrp x0,0xcca000
007fc284	add x0,x0,#0xa00
007fc288	bl 0x00c2fe90
007fc28c	cbz w0,0x007fc20c
007fc290	adrp x0,0xcca000
007fc294	add x0,x0,#0x9e0
007fc298	mov x1,sp
007fc29c	bl 0x007fddfc
007fc2a0	nop
007fc2a4	adr x0,0x7fdec8
007fc2a8	adrp x1,0xcca000
007fc2ac	add x1,x1,#0x9e0
007fc2b0	adrp x2,0xc48000
007fc2b4	add x2,x2,#0x880
007fc2b8	bl 0x00c2fe70
007fc2bc	adrp x0,0xcca000
007fc2c0	add x0,x0,#0xa00
007fc2c4	bl 0x00c2fea0
007fc2c8	b 0x007fc20c
007fc300	bl 0x00c2fec0
