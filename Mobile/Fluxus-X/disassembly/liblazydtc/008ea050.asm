; FUN_008ea050 @ 008ea050
008ea050	sub sp,sp,#0x80
008ea054	str x27,[sp, #0x20]
008ea058	stp x26,x25,[sp, #0x30]
008ea05c	stp x24,x23,[sp, #0x40]
008ea060	stp x22,x21,[sp, #0x50]
008ea064	stp x20,x19,[sp, #0x60]
008ea068	stp x29,x30,[sp, #0x70]
008ea06c	add x29,sp,#0x70
008ea070	mrs x27,tpidr_el0
008ea074	ldr x8,[x27, #0x28]
008ea078	mov w24,w5
008ea07c	mov x19,x4
008ea080	mov x22,x3
008ea084	mov x21,x2
008ea088	mov x20,x0
008ea08c	str x8,[sp, #0x18]
008ea090	cbz x0,0x008ea1b4
008ea094	ldr x8,[x19, #0x18]
008ea098	sub x9,x22,x1
008ea09c	sub x25,x21,x1
008ea0a0	subs x8,x8,x9
008ea0a4	csel x23,x8,xzr,gt
008ea0a8	cmp x25,#0x1
008ea0ac	b.lt 0x008ea0d0
008ea0b0	ldr x8,[x20]
008ea0b4	mov x0,x20
008ea0b8	mov x2,x25
008ea0bc	ldr x8,[x8, #0x60]
008ea0c0	blr x8
008ea0c4	cmp x0,x25
008ea0c8	mov x0,xzr
008ea0cc	b.ne 0x008ea1b8
008ea0d0	cmp x23,#0x1
008ea0d4	b.lt 0x008ea180
008ea0d8	cmp x23,#0x17
008ea0dc	stp xzr,xzr,[sp]
008ea0e0	str xzr,[sp, #0x10]
008ea0e4	b.cs 0x008ea100
008ea0e8	mov x9,sp
008ea0ec	orr x26,x9,#0x1
008ea0f0	lsl w8,w23,#0x1
008ea0f4	mov x25,x26
008ea0f8	strb w8,[sp]
008ea0fc	b 0x008ea128
008ea100	add x8,x23,#0x10
008ea104	and x26,x8,#-0x10
008ea108	mov x0,x26
008ea10c	bl 0x00c2fed0
008ea110	orr x8,x26,#0x1
008ea114	mov x9,sp
008ea118	mov x25,x0
008ea11c	stp x23,x0,[sp, #0x8]
008ea120	str x8,[sp]
008ea124	orr x26,x9,#0x1
008ea128	mov x0,x25
008ea12c	mov w1,w24
008ea130	mov x2,x23
008ea134	bl 0x00c301c0
008ea138	strb wzr,[x25, x23]
008ea13c	ldr x8,[x20]
008ea140	ldrb w9,[sp]
008ea144	ldr x10,[sp, #0x10]
008ea148	ldr x8,[x8, #0x60]
008ea14c	tst w9,#0x1
008ea150	csel x1,x26,x10,eq
008ea154	mov x0,x20
008ea158	mov x2,x23
008ea15c	blr x8
008ea160	ldrb w8,[sp]
008ea164	mov x24,x0
008ea168	tbz w8,#0x0,0x008ea174
008ea16c	ldr x0,[sp, #0x10]
008ea170	bl 0x00c301d0
008ea174	cmp x24,x23
008ea178	mov x0,xzr
008ea17c	b.ne 0x008ea1b8
008ea180	sub x22,x22,x21
008ea184	cmp x22,#0x1
008ea188	b.lt 0x008ea1b0
008ea18c	ldr x8,[x20]
008ea190	mov x0,x20
008ea194	mov x1,x21
008ea198	mov x2,x22
008ea19c	ldr x8,[x8, #0x60]
008ea1a0	blr x8
008ea1a4	cmp x0,x22
008ea1a8	mov x0,xzr
008ea1ac	b.ne 0x008ea1b8
008ea1b0	str xzr,[x19, #0x18]
008ea1b4	mov x0,x20
008ea1b8	ldr x8,[x27, #0x28]
008ea1bc	ldr x9,[sp, #0x18]
008ea1c0	cmp x8,x9
008ea1c4	b.ne 0x008ea1e8
008ea1c8	ldp x29,x30,[sp, #0x70]
008ea1cc	ldp x20,x19,[sp, #0x60]
008ea1d0	ldp x22,x21,[sp, #0x50]
008ea1d4	ldp x24,x23,[sp, #0x40]
008ea1d8	ldp x26,x25,[sp, #0x30]
008ea1dc	ldr x27,[sp, #0x20]
008ea1e0	add sp,sp,#0x80
008ea1e4	ret
008ea1e8	bl 0x00c2fec0
