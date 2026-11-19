; cpr::Session::SetWriteCallback @ 008ed378
008ed378	sub sp,sp,#0x80
008ed37c	str x23,[sp, #0x40]
008ed380	stp x22,x21,[sp, #0x50]
008ed384	stp x20,x19,[sp, #0x60]
008ed388	stp x29,x30,[sp, #0x70]
008ed38c	add x29,sp,#0x70
008ed390	mrs x23,tpidr_el0
008ed394	ldr x8,[x23, #0x28]
008ed398	adrp x2,0xcb4000
008ed39c	mov x19,x0
008ed3a0	mov x22,x1
008ed3a4	str x8,[sp, #0x38]
008ed3a8	ldr x8,[x0, #0x18]
008ed3ac	mov w1,#0x4e2b
008ed3b0	ldr x0,[x8]
008ed3b4	ldr x2,[x2, #0xcf0]
008ed3b8	bl 0x00c317c0
008ed3bc	ldr x8,[x22]
008ed3c0	add x20,x19,#0x160
008ed3c4	add x21,x19,#0x170
008ed3c8	str x8,[x19, #0x160]
008ed3cc	ldr x0,[x22, #0x30]
008ed3d0	cbz x0,0x008ed3f4
008ed3d4	add x8,x22,#0x10
008ed3d8	cmp x8,x0
008ed3dc	b.eq 0x008ed3fc
008ed3e0	ldr x8,[x0]
008ed3e4	ldr x8,[x8, #0x10]
008ed3e8	blr x8
008ed3ec	str x0,[sp, #0x20]
008ed3f0	b 0x008ed414
008ed3f4	str xzr,[sp, #0x20]
008ed3f8	b 0x008ed414
008ed3fc	mov x8,sp
008ed400	str x8,[sp, #0x20]
008ed404	ldr x8,[x0]
008ed408	mov x1,sp
008ed40c	ldr x8,[x8, #0x18]
008ed410	blr x8
008ed414	mov x0,sp
008ed418	mov x1,x21
008ed41c	mov x22,sp
008ed420	bl 0x00c31720
008ed424	ldr x0,[sp, #0x20]
008ed428	cmp x22,x0
008ed42c	b.eq 0x008ed440
008ed430	cbz x0,0x008ed44c
008ed434	ldr x8,[x0]
008ed438	ldr x8,[x8, #0x28]
008ed43c	b 0x008ed448
008ed440	ldr x8,[x0]
008ed444	ldr x8,[x8, #0x20]
008ed448	blr x8
008ed44c	ldr x8,[x19, #0x18]
008ed450	mov w1,#0x2711
008ed454	mov x2,x20
008ed458	ldr x0,[x8]
008ed45c	bl 0x00c317c0
008ed460	ldr x8,[x23, #0x28]
008ed464	ldr x9,[sp, #0x38]
008ed468	cmp x8,x9
008ed46c	b.ne 0x008ed488
008ed470	ldp x29,x30,[sp, #0x70]
008ed474	ldp x20,x19,[sp, #0x60]
008ed478	ldp x22,x21,[sp, #0x50]
008ed47c	ldr x23,[sp, #0x40]
008ed480	add sp,sp,#0x80
008ed484	ret
008ed488	bl 0x00c2fec0
