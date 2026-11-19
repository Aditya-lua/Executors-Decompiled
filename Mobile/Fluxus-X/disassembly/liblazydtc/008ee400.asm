; cpr::Session::SetPayload @ 008ee400
008ee400	sub sp,sp,#0x50
008ee404	str x21,[sp, #0x20]
008ee408	stp x20,x19,[sp, #0x30]
008ee40c	stp x29,x30,[sp, #0x40]
008ee410	add x29,sp,#0x40
008ee414	mrs x20,tpidr_el0
008ee418	ldr x8,[x20, #0x28]
008ee41c	mov x9,x1
008ee420	mov x19,x0
008ee424	mov x21,sp
008ee428	str x8,[sp, #0x18]
008ee42c	ldr x1,[x0, #0x18]
008ee430	mov w8,#0x1
008ee434	strb w8,[x0, #0x10]
008ee438	mov x8,sp
008ee43c	mov x0,x9
008ee440	bl 0x00c30f40
008ee444	ldr x8,[x19, #0x18]
008ee448	ldrb w9,[sp]
008ee44c	ldr x10,[sp, #0x8]
008ee450	ldr x0,[x8]
008ee454	lsr w8,w9,#0x1
008ee458	tst w9,#0x1
008ee45c	csel x2,x8,x10,eq
008ee460	mov w1,#0x75a8
008ee464	bl 0x00c317c0
008ee468	ldr x8,[x19, #0x18]
008ee46c	ldrb w9,[sp]
008ee470	ldr x10,[sp, #0x10]
008ee474	ldr x0,[x8]
008ee478	orr x8,x21,#0x1
008ee47c	tst w9,#0x1
008ee480	csel x2,x8,x10,eq
008ee484	mov w1,#0x27b5
008ee488	bl 0x00c317c0
008ee48c	ldrb w8,[sp]
008ee490	tbz w8,#0x0,0x008ee49c
008ee494	ldr x0,[sp, #0x10]
008ee498	bl 0x00c301d0
008ee49c	ldr x8,[x20, #0x28]
008ee4a0	ldr x9,[sp, #0x18]
008ee4a4	cmp x8,x9
008ee4a8	b.ne 0x008ee4c0
008ee4ac	ldp x29,x30,[sp, #0x40]
008ee4b0	ldp x20,x19,[sp, #0x30]
008ee4b4	ldr x21,[sp, #0x20]
008ee4b8	add sp,sp,#0x50
008ee4bc	ret
008ee4c0	bl 0x00c2fec0
