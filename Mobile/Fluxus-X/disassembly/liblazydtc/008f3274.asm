; cpr::Session::SetOption @ 008f3274
008f3274	sub sp,sp,#0x50
008f3278	str x21,[sp, #0x20]
008f327c	stp x20,x19,[sp, #0x30]
008f3280	stp x29,x30,[sp, #0x40]
008f3284	add x29,sp,#0x40
008f3288	mrs x20,tpidr_el0
008f328c	ldr x8,[x20, #0x28]
008f3290	mov x19,x0
008f3294	mov x0,x1
008f3298	mov x21,sp
008f329c	str x8,[sp, #0x18]
008f32a0	mov x8,sp
008f32a4	bl 0x00c31400
008f32a8	ldr x8,[x19, #0x18]
008f32ac	ldrb w9,[sp]
008f32b0	ldr x10,[sp, #0x10]
008f32b4	ldr x0,[x8]
008f32b8	orr x8,x21,#0x1
008f32bc	tst w9,#0x1
008f32c0	csel x2,x8,x10,eq
008f32c4	mov w1,#0x2717
008f32c8	bl 0x00c317c0
008f32cc	ldrb w8,[sp]
008f32d0	tbz w8,#0x0,0x008f32dc
008f32d4	ldr x0,[sp, #0x10]
008f32d8	bl 0x00c301d0
008f32dc	ldr x8,[x20, #0x28]
008f32e0	ldr x9,[sp, #0x18]
008f32e4	cmp x8,x9
008f32e8	b.ne 0x008f3300
008f32ec	ldp x29,x30,[sp, #0x40]
008f32f0	ldp x20,x19,[sp, #0x30]
008f32f4	ldr x21,[sp, #0x20]
008f32f8	add sp,sp,#0x50
008f32fc	ret
008f3300	bl 0x00c2fec0
