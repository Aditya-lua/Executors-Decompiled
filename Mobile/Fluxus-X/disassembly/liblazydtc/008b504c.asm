; FUN_008b504c @ 008b504c
008b504c	stp x29,x30,[sp, #-0x30]!
008b5050	str x21,[sp, #0x10]
008b5054	stp x20,x19,[sp, #0x20]
008b5058	mov x29,sp
008b505c	mov x20,x1
008b5060	ldr x1,[x1, #0xe8]
008b5064	mov x19,x2
008b5068	mov x21,x0
008b506c	cbz x1,0x008b507c
008b5070	mov x0,x21
008b5074	bl 0x008c8f9c
008b5078	b 0x008b5094
008b507c	ldrsw x8,[x20, #0xb8]
008b5080	ldr x1,[x20, #0x30]
008b5084	mov x0,x21
008b5088	ldrb w3,[x20, #0x1]
008b508c	lsl x2,x8,#0x2
008b5090	bl 0x008b7a9c
008b5094	ldrsw x8,[x20, #0xac]
008b5098	ldr x1,[x20, #0x38]
008b509c	mov x0,x21
008b50a0	ldrb w3,[x20, #0x1]
008b50a4	lsl x2,x8,#0x3
008b50a8	bl 0x008b7a9c
008b50ac	ldrsw x8,[x20, #0x9c]
008b50b0	ldr x1,[x20, #0x28]
008b50b4	mov x0,x21
008b50b8	ldrb w3,[x20, #0x1]
008b50bc	lsl x2,x8,#0x4
008b50c0	bl 0x008b7a9c
008b50c4	ldr x1,[x20, #0x90]
008b50c8	cbz x1,0x008b50dc
008b50cc	ldrsw x2,[x20, #0xb0]
008b50d0	ldrb w3,[x20, #0x1]
008b50d4	mov x0,x21
008b50d8	bl 0x008b7a9c
008b50dc	ldrsw x8,[x20, #0xa4]
008b50e0	ldr x1,[x20, #0x80]
008b50e4	mov x0,x21
008b50e8	ldrb w3,[x20, #0x1]
008b50ec	add x8,x8,x8, LSL #0x1
008b50f0	lsl x2,x8,#0x3
008b50f4	bl 0x008b7a9c
008b50f8	ldrsw x8,[x20, #0xb4]
008b50fc	ldr x1,[x20, #0x10]
008b5100	mov x0,x21
008b5104	ldrb w3,[x20, #0x1]
008b5108	lsl x2,x8,#0x3
008b510c	bl 0x008b7a9c
008b5110	ldr x1,[x20, #0x60]
008b5114	cbz x1,0x008b5128
008b5118	ldrsw x2,[x20, #0xb8]
008b511c	ldrb w3,[x20, #0x1]
008b5120	mov x0,x21
008b5124	bl 0x008b7a9c
008b5128	ldr x8,[x20, #0x50]
008b512c	cbz x8,0x008b5144
008b5130	ldr x8,[x21, #0x60]
008b5134	mov x0,x21
008b5138	mov x1,x20
008b513c	ldr x8,[x8, #0x6e8]
008b5140	blr x8
008b5144	ldr x1,[x20, #0x40]
008b5148	cbz x1,0x008b515c
008b514c	ldrsw x2,[x20, #0xbc]
008b5150	ldrb w3,[x20, #0x1]
008b5154	mov x0,x21
008b5158	bl 0x008b7a9c
008b515c	ldr x1,[x20, #0xc0]
008b5160	cbz x1,0x008b5178
008b5164	ldr w8,[x20, #0xc8]
008b5168	ldrb w3,[x20, #0x1]
008b516c	mov x0,x21
008b5170	lsl x2,x8,#0x4
008b5174	bl 0x008b7a9c
008b5178	ldrb w3,[x20, #0x1]
008b517c	mov x0,x21
008b5180	mov x1,x20
008b5184	mov w2,#0xf0
008b5188	mov x4,x19
008b518c	ldp x20,x19,[sp, #0x20]
008b5190	ldr x21,[sp, #0x10]
008b5194	ldp x29,x30,[sp], #0x30
008b5198	b 0x008b7bd4
