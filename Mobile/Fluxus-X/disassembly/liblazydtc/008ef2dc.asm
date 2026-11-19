; cpr::Session::SetRange @ 008ef2dc
008ef2dc	sub sp,sp,#0x50
008ef2e0	str x21,[sp, #0x20]
008ef2e4	stp x20,x19,[sp, #0x30]
008ef2e8	stp x29,x30,[sp, #0x40]
008ef2ec	add x29,sp,#0x40
008ef2f0	mrs x20,tpidr_el0
008ef2f4	ldr x8,[x20, #0x28]
008ef2f8	mov x19,x0
008ef2fc	mov x0,x1
008ef300	mov x21,sp
008ef304	str x8,[sp, #0x18]
008ef308	mov x8,sp
008ef30c	bl 0x00c31400
008ef310	ldr x8,[x19, #0x18]
008ef314	ldrb w9,[sp]
008ef318	ldr x10,[sp, #0x10]
008ef31c	ldr x0,[x8]
008ef320	orr x8,x21,#0x1
008ef324	tst w9,#0x1
008ef328	csel x2,x8,x10,eq
008ef32c	mov w1,#0x2717
008ef330	bl 0x00c317c0
008ef334	ldrb w8,[sp]
008ef338	tbz w8,#0x0,0x008ef344
008ef33c	ldr x0,[sp, #0x10]
008ef340	bl 0x00c301d0
008ef344	ldr x8,[x20, #0x28]
008ef348	ldr x9,[sp, #0x18]
008ef34c	cmp x8,x9
008ef350	b.ne 0x008ef368
008ef354	ldp x29,x30,[sp, #0x40]
008ef358	ldp x20,x19,[sp, #0x30]
008ef35c	ldr x21,[sp, #0x20]
008ef360	add sp,sp,#0x50
008ef364	ret
008ef368	bl 0x00c2fec0
