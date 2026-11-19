; ossl_cipher_hw_generic_cfb1 @ 00b6841c
00b6841c	sub sp,sp,#0x80
00b68420	stp x28,x27,[sp, #0x20]
00b68424	stp x26,x25,[sp, #0x30]
00b68428	stp x24,x23,[sp, #0x40]
00b6842c	stp x22,x21,[sp, #0x50]
00b68430	stp x20,x19,[sp, #0x60]
00b68434	stp x29,x30,[sp, #0x70]
00b68438	ldr w8,[x0, #0xa0]
00b6843c	mov x20,x2
00b68440	mov x19,x0
00b68444	mov x22,x1
00b68448	str w8,[sp, #0x1c]
00b6844c	ldrsb w9,[x0, #0x6c]
00b68450	add x29,sp,#0x70
00b68454	tbnz w9,#0x1f,0x00b684e0
00b68458	lsr x8,x3,#0x3c
00b6845c	cbz x8,0x00b68504
00b68460	orr x26,xzr,#-0x1000000000000000
00b68464	add x27,x3,x26
00b68468	and x8,x27,#-0x1000000000000000
00b6846c	orr x21,xzr,#0x1000000000000000
00b68470	add x28,x8,x21
00b68474	add x23,x19,#0x20
00b68478	str x8,[sp, #0x8]
00b6847c	add x8,x22,x28
00b68480	mov x25,x27
00b68484	mov x24,x20
00b68488	str x8,[sp, #0x10]
00b6848c	b 0x00b684a0
00b68490	ldrb w9,[x19, #0x6c]
00b68494	add x24,x24,x21
00b68498	add x22,x22,x21
00b6849c	add x25,x25,x26
00b684a0	ldr x3,[x19, #0xb0]
00b684a4	ldr x7,[x19, #0x30]
00b684a8	ubfx w6,w9,#0x1,#0x1
00b684ac	orr x2,xzr,#-0x8000000000000000
00b684b0	add x5,sp,#0x1c
00b684b4	mov x0,x24
00b684b8	mov x1,x22
00b684bc	mov x4,x23
00b684c0	bl 0x00c3e2e0
00b684c4	lsr x8,x25,#0x3c
00b684c8	cbnz x8,0x00b68490
00b684cc	ldp x8,x1,[sp, #0x8]
00b684d0	add x20,x20,x28
00b684d4	sub x3,x27,x8
00b684d8	cbnz x3,0x00b6850c
00b684dc	b 0x00b68534
00b684e0	ldr x8,[x19, #0xb0]
00b684e4	ldr x7,[x19, #0x30]
00b684e8	add x4,x19,#0x20
00b684ec	ubfx w6,w9,#0x1,#0x1
00b684f0	add x5,sp,#0x1c
00b684f4	mov x0,x20
00b684f8	mov x1,x22
00b684fc	mov x2,x3
00b68500	b 0x00b6852c
00b68504	mov x1,x22
00b68508	cbz x3,0x00b68534
00b6850c	ldrb w9,[x19, #0x6c]
00b68510	ldr x8,[x19, #0xb0]
00b68514	ldr x7,[x19, #0x30]
00b68518	lsl x2,x3,#0x3
00b6851c	add x4,x19,#0x20
00b68520	ubfx w6,w9,#0x1,#0x1
00b68524	add x5,sp,#0x1c
00b68528	mov x0,x20
00b6852c	mov x3,x8
00b68530	bl 0x00c3e2e0
00b68534	ldr w8,[sp, #0x1c]
00b68538	mov w0,#0x1
00b6853c	str w8,[x19, #0xa0]
00b68540	ldp x29,x30,[sp, #0x70]
00b68544	ldp x20,x19,[sp, #0x60]
00b68548	ldp x22,x21,[sp, #0x50]
00b6854c	ldp x24,x23,[sp, #0x40]
00b68550	ldp x26,x25,[sp, #0x30]
00b68554	ldp x28,x27,[sp, #0x20]
00b68558	add sp,sp,#0x80
00b6855c	ret
