; FUN_008a3454 @ 008a3454
008a3454	stp x29,x30,[sp, #-0x20]!
008a3458	stp x20,x19,[sp, #0x10]
008a345c	mov x29,sp
008a3460	mov x20,x1
008a3464	mov x19,x0
008a3468	bl 0x008a354c
008a346c	ldr x8,[x20]
008a3470	mov x11,#0x2d69
008a3474	movk x11,#0xeb38, LSL #16
008a3478	lsl w9,w8,#0x3
008a347c	lsr x10,x8,#0x20
008a3480	movk x11,#0xea08, LSL #32
008a3484	movk x11,#0x9ddf, LSL #48
008a3488	add x9,x9,#0x8
008a348c	eor x9,x9,x10
008a3490	mul x9,x9,x11
008a3494	eor x10,x10,x9, LSR #0x2f
008a3498	eor x9,x10,x9
008a349c	mov x10,#0x959d
008a34a0	mul x9,x9,x11
008a34a4	movk x10,#0xb8f4, LSL #16
008a34a8	ldr x11,[x19, #0x18]
008a34ac	movk x10,#0xd34f, LSL #32
008a34b0	movk x10,#0x949d, LSL #48
008a34b4	eor x9,x9,x9, LSR #0x2f
008a34b8	mul x9,x9,x10
008a34bc	ldrb w10,[x19, #0x30]
008a34c0	lsr x9,x9,x10
008a34c4	mov w10,#0x1
008a34c8	lsr x12,x9,#0x6
008a34cc	lsl x14,x10,x9
008a34d0	ldr x10,[x19]
008a34d4	ldr x13,[x11, x12, LSL #0x3]
008a34d8	tst x14,x13
008a34dc	b.eq 0x008a3518
008a34e0	ldr x12,[x19, #0x20]
008a34e4	mov w16,#0x1
008a34e8	sub x15,x12,#0x1
008a34ec	lsl x12,x9,#0x4
008a34f0	ldr x12,[x10, x12#0x0]
008a34f4	cmp x12,x8
008a34f8	b.eq 0x008a3538
008a34fc	add x9,x9,#0x1
008a3500	and x9,x9,x15
008a3504	lsr x12,x9,#0x6
008a3508	lsl x14,x16,x9
008a350c	ldr x13,[x11, x12, LSL #0x3]
008a3510	tst x13,x14
008a3514	b.ne 0x008a34ec
008a3518	orr x13,x13,x14
008a351c	str x13,[x11, x12, LSL #0x3]
008a3520	add x11,x10,x9, LSL #0x4
008a3524	ldr x12,[x19, #0x28]
008a3528	str x8,[x11]
008a352c	add x8,x12,#0x1
008a3530	str wzr,[x11, #0x8]
008a3534	str x8,[x19, #0x28]
008a3538	add x8,x10,x9, LSL #0x4
008a353c	add x0,x8,#0x8
008a3540	ldp x20,x19,[sp, #0x10]
008a3544	ldp x29,x30,[sp], #0x20
008a3548	ret
