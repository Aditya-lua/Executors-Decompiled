; cpr::Session::PreparePost @ 008f0138
008f0138	str x19,[sp, #-0x20]!
008f013c	stp x29,x30,[sp, #0x10]
008f0140	add x29,sp,#0x10
008f0144	ldr x8,[x0, #0x18]
008f0148	mov x19,x0
008f014c	mov w1,#0x2c
008f0150	mov x2,xzr
008f0154	ldr x0,[x8]
008f0158	bl 0x00c317c0
008f015c	ldr x8,[x19, #0x18]
008f0160	ldrb w9,[x19, #0x10]
008f0164	ldr x0,[x8]
008f0168	cbz w9,0x008f0178
008f016c	mov w1,#0x2734
008f0170	mov x2,xzr
008f0174	b 0x008f01a8
008f0178	ldr x8,[x19, #0x110]
008f017c	adrp x9,0x2ab000
008f0180	add x9,x9,#0x32c
008f0184	mov w1,#0x271f
008f0188	cmp x8,#0x0
008f018c	csel x2,x9,xzr,eq
008f0190	bl 0x00c317c0
008f0194	ldr x8,[x19, #0x18]
008f0198	adrp x2,0x2c8000
008f019c	add x2,x2,#0xcc3
008f01a0	mov w1,#0x2734
008f01a4	ldr x0,[x8]
008f01a8	bl 0x00c317c0
008f01ac	ldp x29,x30,[sp, #0x10]
008f01b0	mov x0,x19
008f01b4	ldr x19,[sp], #0x20
008f01b8	b 0x00c31270
