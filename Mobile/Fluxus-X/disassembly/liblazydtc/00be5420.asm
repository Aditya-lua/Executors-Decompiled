; FUN_00be5420 @ 00be5420
00be5420	paciasp
00be5424	sub sp,sp,#0x70
00be5428	stp x29,x30,[sp, #0x20]
00be542c	stp x26,x25,[sp, #0x30]
00be5430	stp x24,x23,[sp, #0x40]
00be5434	stp x22,x21,[sp, #0x50]
00be5438	stp x20,x19,[sp, #0x60]
00be543c	add x29,sp,#0x20
00be5440	mov x19,x0
00be5444	cbz x0,0x00be5574
00be5448	ldr x8,[x4, #0x18]
00be544c	sub x9,x3,x1
00be5450	sub x25,x2,x1
00be5454	mov w24,w5
00be5458	mov x20,x4
00be545c	mov x22,x3
00be5460	subs x8,x8,x9
00be5464	mov x21,x2
00be5468	csel x23,x8,xzr,gt
00be546c	cmp x25,#0x1
00be5470	b.lt 0x00be5490
00be5474	ldr x8,[x19]
00be5478	mov x0,x19
00be547c	mov x2,x25
00be5480	ldr x8,[x8, #0x60]
00be5484	blr x8
00be5488	cmp x0,x25
00be548c	b.ne 0x00be5570
00be5490	cmp x23,#0x1
00be5494	b.lt 0x00be553c
00be5498	cmp x23,#0x17
00be549c	b.cs 0x00be54b4
00be54a0	lsl w8,w23,#0x1
00be54a4	add x9,sp,#0x8
00be54a8	orr x25,x9,#0x1
00be54ac	strb w8,[sp, #0x8]
00be54b0	b 0x00be54dc
00be54b4	orr x8,x23,#0x7
00be54b8	mov w9,#0x1a
00be54bc	cmp x8,#0x17
00be54c0	csinc x26,x9,x8,eq
00be54c4	mov x0,x26
00be54c8	bl 0x00c2fed0
00be54cc	orr x8,x26,#0x1
00be54d0	mov x25,x0
00be54d4	stp x23,x0,[sp, #0x10]
00be54d8	str x8,[sp, #0x8]
00be54dc	mov x0,x25
00be54e0	mov w1,w24
00be54e4	mov x2,x23
00be54e8	bl 0x00c301c0
00be54ec	strb wzr,[x25, x23]
00be54f0	ldr x9,[x19]
00be54f4	ldrb w8,[sp, #0x8]
00be54f8	ldr x10,[sp, #0x18]
00be54fc	ldr x9,[x9, #0x60]
00be5500	tst w8,#0x1
00be5504	add x8,sp,#0x8
00be5508	csinc x1,x10,x8,ne
00be550c	mov x0,x19
00be5510	mov x2,x23
00be5514	blr x9
00be5518	ldrb w8,[sp, #0x8]
00be551c	mov x24,x0
00be5520	tbz w8,#0x0,0x00be5534
00be5524	ldr x8,[sp, #0x8]
00be5528	ldr x0,[sp, #0x18]
00be552c	and x1,x8,#-0x2
00be5530	bl 0x00c2fe80
00be5534	cmp x24,x23
00be5538	b.ne 0x00be5570
00be553c	sub x22,x22,x21
00be5540	cmp x22,#0x1
00be5544	b.lt 0x00be5568
00be5548	ldr x8,[x19]
00be554c	mov x0,x19
00be5550	mov x1,x21
00be5554	mov x2,x22
00be5558	ldr x8,[x8, #0x60]
00be555c	blr x8
00be5560	cmp x0,x22
00be5564	b.ne 0x00be5570
00be5568	str xzr,[x20, #0x18]
00be556c	b 0x00be5574
00be5570	mov x19,xzr
00be5574	mov x0,x19
00be5578	ldp x20,x19,[sp, #0x60]
00be557c	ldp x22,x21,[sp, #0x50]
00be5580	ldp x24,x23,[sp, #0x40]
00be5584	ldp x26,x25,[sp, #0x30]
00be5588	ldp x29,x30,[sp, #0x20]
00be558c	add sp,sp,#0x70
00be5590	autiasp
00be5594	ret
