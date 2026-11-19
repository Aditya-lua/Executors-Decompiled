; cpr::Session::GetAsync @ 008f0360
008f0360	sub sp,sp,#0x70
008f0364	str x27,[sp, #0x10]
008f0368	stp x26,x25,[sp, #0x20]
008f036c	stp x24,x23,[sp, #0x30]
008f0370	stp x22,x21,[sp, #0x40]
008f0374	stp x20,x19,[sp, #0x50]
008f0378	stp x29,x30,[sp, #0x60]
008f037c	add x29,sp,#0x60
008f0380	mrs x25,tpidr_el0
008f0384	ldr x9,[x25, #0x28]
008f0388	mov x21,x8
008f038c	str x9,[sp, #0x8]
008f0390	ldr x9,[x0, #0x8]
008f0394	cbz x9,0x008f05dc
008f0398	ldr x23,[x0]
008f039c	mov x0,x9
008f03a0	bl 0x00c2fef0
008f03a4	mov x19,x0
008f03a8	cbz x0,0x008f05dc
008f03ac	add x24,x19,#0x8
008f03b0	ldxr x8,[x24]
008f03b4	add x8,x8,#0x1
008f03b8	stxr w9,x8,[x24]
008f03bc	cbnz w9,0x008f03b0
008f03c0	bl 0x00c30d70
008f03c4	add x8,x0,#0x20
008f03c8	ldar w8,[x8]
008f03cc	mov x22,x0
008f03d0	cbnz w8,0x008f03e0
008f03d4	mov x0,x22
008f03d8	mov x1,xzr
008f03dc	bl 0x00c31330
008f03e0	add x8,x22,#0x30
008f03e4	ldar x8,[x8]
008f03e8	cbnz x8,0x008f0408
008f03ec	add x8,x22,#0x28
008f03f0	ldar x8,[x8]
008f03f4	ldr x9,[x22, #0x10]
008f03f8	cmp x8,x9
008f03fc	b.cs 0x008f0408
008f0400	mov x0,x22
008f0404	bl 0x00c31320
008f0408	orr w0,wzr,#0x60
008f040c	bl 0x00c2fed0
008f0410	str xzr,[x0, #0x10]
008f0414	adrp x8,0xcb4000
008f0418	ldr x8,[x8, #0xd50]
008f041c	adrp x9,0xc4e000
008f0420	add x9,x9,#0x820
008f0424	mov x26,x0
008f0428	mov x27,x0
008f042c	add x8,x8,#0x10
008f0430	add x9,x9,#0x10
008f0434	mov x20,x0
008f0438	str xzr,[x26, #0x8]!
008f043c	str x8,[x0]
008f0440	str x9,[x27, #0x20]!
008f0444	str x27,[x0, #0x40]
008f0448	stp x23,x19,[x0, #0x28]
008f044c	mov w0,#0x188
008f0450	bl 0x00c2fed0
008f0454	mov x23,x0
008f0458	add x0,x0,#0x8
008f045c	mov w2,#0x6c
008f0460	mov w1,wzr
008f0464	bl 0x00c301c0
008f0468	adrp x8,0xcb4000
008f046c	ldr x8,[x8, #0xd40]
008f0470	str x23,[x20, #0x50]
008f0474	add x8,x8,#0x10
008f0478	str x8,[x23]
008f047c	mov x0,sp
008f0480	mov x1,x23
008f0484	bl 0x00c316e0
008f0488	add x23,x22,#0xa8
008f048c	mov x0,x23
008f0490	bl 0x00c2ff10
008f0494	ldxr x8,[x26]
008f0498	add x8,x8,#0x1
008f049c	stxr w9,x8,[x26]
008f04a0	cbnz w9,0x008f0494
008f04a4	ldp x9,x10,[x22, #0x80]
008f04a8	ldp x12,x8,[x22, #0x98]
008f04ac	mov w11,#0x55
008f04b0	subs x13,x10,x9
008f04b4	asr x13,x13,#0x3
008f04b8	mul x11,x13,x11
008f04bc	sub x11,x11,#0x1
008f04c0	csel x13,xzr,x11,eq
008f04c4	add x11,x8,x12
008f04c8	cmp x13,x11
008f04cc	b.ne 0x008f04e4
008f04d0	add x0,x22,#0x78
008f04d4	bl 0x00c31620
008f04d8	ldp x11,x8,[x22, #0x98]
008f04dc	ldp x9,x10,[x22, #0x80]
008f04e0	add x11,x11,x8
008f04e4	cmp x10,x9
008f04e8	b.eq 0x008f0514
008f04ec	orr x10,xzr,#-0x3f3f3f3f3f3f3f40
008f04f0	movk x10,#0xc0c1
008f04f4	umulh x10,x11,x10
008f04f8	lsr x10,x10,#0x6
008f04fc	ldr x9,[x9, x10, LSL #0x3]
008f0500	mov w12,#0x55
008f0504	msub x10,x10,x12,x11
008f0508	orr w11,wzr,#0x30
008f050c	madd x9,x10,x11,x9
008f0510	b 0x008f0518
008f0514	mov x9,xzr
008f0518	adrp x10,0xc4e000
008f051c	add x10,x10,#0x878
008f0520	add x8,x8,#0x1
008f0524	add x10,x10,#0x10
008f0528	mov x0,x23
008f052c	stp x27,x20,[x9, #0x8]
008f0530	str x9,[x9, #0x20]
008f0534	str x10,[x9]
008f0538	str x8,[x22, #0xa0]
008f053c	bl 0x00c2ff20
008f0540	add x0,x22,#0xd0
008f0544	bl 0x00c315f0
008f0548	ldr x22,[sp]
008f054c	ldaxr x8,[x26]
008f0550	sub x9,x8,#0x1
008f0554	stlxr w10,x9,[x26]
008f0558	cbnz w10,0x008f054c
008f055c	cbnz x8,0x008f0578
008f0560	ldr x8,[x20]
008f0564	mov x0,x20
008f0568	ldr x8,[x8, #0x10]
008f056c	blr x8
008f0570	mov x0,x20
008f0574	bl 0x00c2ff00
008f0578	stp xzr,xzr,[x21, #0x8]
008f057c	str x22,[x21]
008f0580	ldaxr x8,[x24]
008f0584	sub x9,x8,#0x1
008f0588	stlxr w10,x9,[x24]
008f058c	cbnz w10,0x008f0580
008f0590	cbnz x8,0x008f05ac
008f0594	ldr x8,[x19]
008f0598	mov x0,x19
008f059c	ldr x8,[x8, #0x10]
008f05a0	blr x8
008f05a4	mov x0,x19
008f05a8	bl 0x00c2ff00
008f05ac	ldr x8,[x25, #0x28]
008f05b0	ldr x9,[sp, #0x8]
008f05b4	cmp x8,x9
008f05b8	b.ne 0x008f0608
008f05bc	ldp x29,x30,[sp, #0x60]
008f05c0	ldp x20,x19,[sp, #0x50]
008f05c4	ldp x22,x21,[sp, #0x40]
008f05c8	ldp x24,x23,[sp, #0x30]
008f05cc	ldp x26,x25,[sp, #0x20]
008f05d0	ldr x27,[sp, #0x10]
008f05d4	add sp,sp,#0x70
008f05d8	ret
008f05dc	mov w0,#0x8
008f05e0	bl 0x00c30000
008f05e4	adrp x8,0xcb4000
008f05e8	ldr x8,[x8, #0xd30]
008f05ec	adrp x1,0xcb4000
008f05f0	adrp x2,0xcb4000
008f05f4	add x8,x8,#0x10
008f05f8	str x8,[x0]
008f05fc	ldr x1,[x1, #0xd18]
008f0600	ldr x2,[x2, #0xd00]
008f0604	bl 0x00c30020
008f0608	bl 0x00c2fec0
