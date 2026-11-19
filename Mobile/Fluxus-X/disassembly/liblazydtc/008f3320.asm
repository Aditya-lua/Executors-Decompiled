; cpr::Session::SetOption @ 008f3320
008f3320	sub sp,sp,#0x50
008f3324	str x21,[sp, #0x20]
008f3328	stp x20,x19,[sp, #0x30]
008f332c	stp x29,x30,[sp, #0x40]
008f3330	add x29,sp,#0x40
008f3334	mrs x20,tpidr_el0
008f3338	ldr x8,[x20, #0x28]
008f333c	mov x19,x0
008f3340	mov x0,x1
008f3344	mov x21,sp
008f3348	str x8,[sp, #0x18]
008f334c	mov x8,sp
008f3350	bl 0x00c313e0
008f3354	ldr x8,[x19, #0x18]
008f3358	ldrb w9,[sp]
008f335c	ldr x10,[sp, #0x10]
008f3360	ldr x0,[x8]
008f3364	orr x8,x21,#0x1
008f3368	tst w9,#0x1
008f336c	csel x2,x8,x10,eq
008f3370	mov w1,#0x2717
008f3374	bl 0x00c317c0
008f3378	ldrb w8,[sp]
008f337c	tbz w8,#0x0,0x008f3388
008f3380	ldr x0,[sp, #0x10]
008f3384	bl 0x00c301d0
008f3388	ldr x8,[x20, #0x28]
008f338c	ldr x9,[sp, #0x18]
008f3390	cmp x8,x9
008f3394	b.ne 0x008f33ac
008f3398	ldp x29,x30,[sp, #0x40]
008f339c	ldp x20,x19,[sp, #0x30]
008f33a0	ldr x21,[sp, #0x20]
008f33a4	add sp,sp,#0x50
008f33a8	ret
008f33ac	bl 0x00c2fec0
