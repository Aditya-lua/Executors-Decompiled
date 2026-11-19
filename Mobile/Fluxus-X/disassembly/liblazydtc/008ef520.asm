; cpr::Session::SetMultiRange @ 008ef520
008ef520	sub sp,sp,#0x50
008ef524	str x21,[sp, #0x20]
008ef528	stp x20,x19,[sp, #0x30]
008ef52c	stp x29,x30,[sp, #0x40]
008ef530	add x29,sp,#0x40
008ef534	mrs x20,tpidr_el0
008ef538	ldr x8,[x20, #0x28]
008ef53c	mov x19,x0
008ef540	mov x0,x1
008ef544	mov x21,sp
008ef548	str x8,[sp, #0x18]
008ef54c	mov x8,sp
008ef550	bl 0x00c313e0
008ef554	ldr x8,[x19, #0x18]
008ef558	ldrb w9,[sp]
008ef55c	ldr x10,[sp, #0x10]
008ef560	ldr x0,[x8]
008ef564	orr x8,x21,#0x1
008ef568	tst w9,#0x1
008ef56c	csel x2,x8,x10,eq
008ef570	mov w1,#0x2717
008ef574	bl 0x00c317c0
008ef578	ldrb w8,[sp]
008ef57c	tbz w8,#0x0,0x008ef588
008ef580	ldr x0,[sp, #0x10]
008ef584	bl 0x00c301d0
008ef588	ldr x8,[x20, #0x28]
008ef58c	ldr x9,[sp, #0x18]
008ef590	cmp x8,x9
008ef594	b.ne 0x008ef5ac
008ef598	ldp x29,x30,[sp, #0x40]
008ef59c	ldp x20,x19,[sp, #0x30]
008ef5a0	ldr x21,[sp, #0x20]
008ef5a4	add sp,sp,#0x50
008ef5a8	ret
008ef5ac	bl 0x00c2fec0
