; cpr::Session::SetProgressCallback @ 008ed48c
008ed48c	sub sp,sp,#0x80
008ed490	str x23,[sp, #0x40]
008ed494	stp x22,x21,[sp, #0x50]
008ed498	stp x20,x19,[sp, #0x60]
008ed49c	stp x29,x30,[sp, #0x70]
008ed4a0	add x29,sp,#0x70
008ed4a4	mrs x22,tpidr_el0
008ed4a8	ldr x8,[x22, #0x28]
008ed4ac	mov x19,x0
008ed4b0	add x21,x19,#0x1b0
008ed4b4	str x8,[sp, #0x38]
008ed4b8	ldr x8,[x1]
008ed4bc	str x8,[x0, #0x1a0]
008ed4c0	ldr x0,[x1, #0x30]
008ed4c4	cbz x0,0x008ed4e8
008ed4c8	add x8,x1,#0x10
008ed4cc	cmp x8,x0
008ed4d0	b.eq 0x008ed4f0
008ed4d4	ldr x8,[x0]
008ed4d8	ldr x8,[x8, #0x10]
008ed4dc	blr x8
008ed4e0	str x0,[sp, #0x20]
008ed4e4	b 0x008ed508
008ed4e8	str xzr,[sp, #0x20]
008ed4ec	b 0x008ed508
008ed4f0	mov x8,sp
008ed4f4	str x8,[sp, #0x20]
008ed4f8	ldr x8,[x0]
008ed4fc	mov x1,sp
008ed500	ldr x8,[x8, #0x18]
008ed504	blr x8
008ed508	mov x0,sp
008ed50c	mov x1,x21
008ed510	add x20,x19,#0x1a0
008ed514	mov x23,sp
008ed518	bl 0x00c31740
008ed51c	ldr x0,[sp, #0x20]
008ed520	cmp x23,x0
008ed524	b.eq 0x008ed538
008ed528	cbz x0,0x008ed544
008ed52c	ldr x8,[x0]
008ed530	ldr x8,[x8, #0x28]
008ed534	b 0x008ed540
008ed538	ldr x8,[x0]
008ed53c	ldr x8,[x8, #0x20]
008ed540	blr x8
008ed544	ldrb w8,[x19, #0x2a9]
008ed548	cbz w8,0x008ed55c
008ed54c	add x0,x19,#0x220
008ed550	mov x1,x20
008ed554	bl 0x00c30da0
008ed558	b 0x008ed59c
008ed55c	ldr x8,[x19, #0x18]
008ed560	adrp x2,0xcb4000
008ed564	mov w1,#0x4efb
008ed568	ldr x0,[x8]
008ed56c	ldr x2,[x2, #0xcb8]
008ed570	bl 0x00c317c0
008ed574	ldr x8,[x19, #0x18]
008ed578	mov w1,#0x2749
008ed57c	mov x2,x20
008ed580	ldr x0,[x8]
008ed584	bl 0x00c317c0
008ed588	ldr x8,[x19, #0x18]
008ed58c	mov w1,#0x2b
008ed590	mov x2,xzr
008ed594	ldr x0,[x8]
008ed598	bl 0x00c317c0
008ed59c	ldr x8,[x22, #0x28]
008ed5a0	ldr x9,[sp, #0x38]
008ed5a4	cmp x8,x9
008ed5a8	b.ne 0x008ed5c4
008ed5ac	ldp x29,x30,[sp, #0x70]
008ed5b0	ldp x20,x19,[sp, #0x60]
008ed5b4	ldp x22,x21,[sp, #0x50]
008ed5b8	ldr x23,[sp, #0x40]
008ed5bc	add sp,sp,#0x80
008ed5c0	ret
008ed5c4	bl 0x00c2fec0
