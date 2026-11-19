; cpr::Session::SetCancellationParam @ 008f3428
008f3428	sub sp,sp,#0x40
008f342c	stp x22,x21,[sp, #0x10]
008f3430	stp x20,x19,[sp, #0x20]
008f3434	stp x29,x30,[sp, #0x30]
008f3438	add x29,sp,#0x30
008f343c	mrs x22,tpidr_el0
008f3440	ldr x8,[x22, #0x28]
008f3444	mov x19,x0
008f3448	add x20,x0,#0x220
008f344c	str x8,[sp, #0x8]
008f3450	ldp x8,x9,[x1]
008f3454	stp xzr,xzr,[x1]
008f3458	ldr x21,[x0, #0x228]
008f345c	str x8,[x0, #0x220]
008f3460	str x9,[x0, #0x228]
008f3464	cbz x21,0x008f3498
008f3468	add x8,x21,#0x8
008f346c	ldaxr x9,[x8]
008f3470	sub x10,x9,#0x1
008f3474	stlxr w11,x10,[x8]
008f3478	cbnz w11,0x008f346c
008f347c	cbnz x9,0x008f3498
008f3480	ldr x8,[x21]
008f3484	mov x0,x21
008f3488	ldr x8,[x8, #0x10]
008f348c	blr x8
008f3490	mov x0,x21
008f3494	bl 0x00c2ff00
008f3498	strb wzr,[x19, #0x230]
008f349c	ldrb w8,[sp, #0x6]
008f34a0	add x9,x19,#0x235
008f34a4	adrp x2,0xcb4000
008f34a8	mov w1,#0x4efb
008f34ac	strb w8,[x19, #0x237]
008f34b0	ldrh w8,[sp, #0x4]
008f34b4	strh w8,[x9]
008f34b8	ldr w8,[sp]
008f34bc	add x9,x19,#0x231
008f34c0	str w8,[x9]
008f34c4	ldr x8,[x19, #0x18]
008f34c8	mov w9,#0x1
008f34cc	strb wzr,[x19, #0x238]
008f34d0	strb w9,[x19, #0x2a9]
008f34d4	ldr x0,[x8]
008f34d8	ldr x2,[x2, #0xcc0]
008f34dc	bl 0x00c317c0
008f34e0	ldr x8,[x19, #0x18]
008f34e4	mov w1,#0x2749
008f34e8	mov x2,x20
008f34ec	ldr x0,[x8]
008f34f0	bl 0x00c317c0
008f34f4	ldr x8,[x19, #0x18]
008f34f8	mov w1,#0x2b
008f34fc	mov x2,xzr
008f3500	ldr x0,[x8]
008f3504	bl 0x00c317c0
008f3508	ldr x8,[x22, #0x28]
008f350c	ldr x9,[sp, #0x8]
008f3510	cmp x8,x9
008f3514	b.ne 0x008f352c
008f3518	ldp x29,x30,[sp, #0x30]
008f351c	ldp x20,x19,[sp, #0x20]
008f3520	ldp x22,x21,[sp, #0x10]
008f3524	add sp,sp,#0x40
008f3528	ret
008f352c	bl 0x00c2fec0
