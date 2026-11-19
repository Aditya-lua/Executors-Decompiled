; FUN_008bb074 @ 008bb074
008bb074	sub sp,sp,#0x40
008bb078	stp x29,x30,[sp, #0x10]
008bb07c	stp x22,x21,[sp, #0x20]
008bb080	stp x20,x19,[sp, #0x30]
008bb084	add x29,sp,#0x10
008bb088	adrp x9,0xd1f000
008bb08c	add x9,x9,#0xc90
008bb090	ldr x8,[x1, #0x28]
008bb094	ldarb w10,[x9]
008bb098	mov x19,x2
008bb09c	mov x20,x1
008bb0a0	mov x21,x0
008bb0a4	adrp x9,0xd1f000
008bb0a8	tbz w10,#0x0,0x008bb13c
008bb0ac	ldr x9,[x9, #0xc88]
008bb0b0	add x9,x9,#0x7f3, LSL #12
008bb0b4	add x9,x9,#0x700
008bb0b8	cmp x8,x9
008bb0bc	b.eq 0x008bb0e0
008bb0c0	ldrb w8,[x20, #0x5]
008bb0c4	mov w9,#0x1
008bb0c8	ldr x1,[x20, #0x28]
008bb0cc	ldrb w3,[x20, #0x1]
008bb0d0	mov x0,x21
008bb0d4	lsl w8,w9,w8
008bb0d8	sbfiz x2,x8,#0x5,#0x20
008bb0dc	bl 0x008b7a9c
008bb0e0	ldr x1,[x20, #0x20]
008bb0e4	cbz x1,0x008bb114
008bb0e8	ldrb w8,[x20, #0x7]
008bb0ec	tbnz w8,#0x1,0x008bb0f8
008bb0f0	ldr w8,[x20, #0x8]
008bb0f4	b 0x008bb104
008bb0f8	ldr w8,[x20, #0x8]
008bb0fc	sub x1,x1,#0x150
008bb100	add w8,w8,#0x15
008bb104	sbfiz x2,x8,#0x4,#0x20
008bb108	ldrb w3,[x20, #0x1]
008bb10c	mov x0,x21
008bb110	bl 0x008b7a9c
008bb114	ldrb w3,[x20, #0x1]
008bb118	mov x0,x21
008bb11c	mov x1,x20
008bb120	mov w2,#0x30
008bb124	mov x4,x19
008bb128	ldp x20,x19,[sp, #0x30]
008bb12c	ldp x22,x21,[sp, #0x20]
008bb130	ldp x29,x30,[sp, #0x10]
008bb134	add sp,sp,#0x40
008bb138	b 0x008b7bd4
008bb13c	adrp x0,0xd1f000
008bb140	add x0,x0,#0xc90
008bb144	str x8,[sp, #0x8]
008bb148	bl 0x00c2fe90
008bb14c	ldr x8,[sp, #0x8]
008bb150	adrp x9,0xd1f000
008bb154	cbz w0,0x008bb0ac
008bb158	adrp x8,0xcca000
008bb15c	ldr x0,[x8, #0x8c8]
008bb160	bl 0x007fe1ec
008bb164	adrp x22,0xd1f000
008bb168	str x0,[x22, #0xc88]
008bb16c	adrp x0,0xd1f000
008bb170	add x0,x0,#0xc90
008bb174	bl 0x00c2fea0
008bb178	ldr x8,[sp, #0x8]
008bb17c	mov x9,x22
008bb180	b 0x008bb0ac
