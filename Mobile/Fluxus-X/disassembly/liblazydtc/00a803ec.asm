; ossl_lh_strcasehash @ 00a803ec
00a803ec	cbz x0,0x00a80464
00a803f0	ldrb w8,[x0]
00a803f4	cbz w8,0x00a80468
00a803f8	stp x22,x21,[sp, #-0x30]!
00a803fc	stp x20,x19,[sp, #0x10]
00a80400	mov x19,xzr
00a80404	add x20,x0,#0x1
00a80408	mov w21,#0x100
00a8040c	mov w22,#0x20
00a80410	stp x29,x30,[sp, #0x20]
00a80414	add x29,sp,#0x20
00a80418	and w0,w8,#0xff
00a8041c	bl 0x00c3de30
00a80420	eor w10,w0,w0, LSR #0x2
00a80424	and w10,w10,#0xf
00a80428	sxtw x9,w0
00a8042c	ldrb w8,[x20], #0x1
00a80430	sub w11,w22,w10
00a80434	orr x9,x21,x9
00a80438	lsl w10,w19,w10
00a8043c	lsr x11,x19,x11
00a80440	mul x9,x9,x9
00a80444	orr w10,w11,w10
00a80448	eor x19,x10,x9
00a8044c	add x21,x21,#0x100
00a80450	cbnz w8,0x00a80418
00a80454	eor x0,x19,x19, LSR #0x10
00a80458	ldp x29,x30,[sp, #0x20]
00a8045c	ldp x20,x19,[sp, #0x10]
00a80460	ldp x22,x21,[sp], #0x30
00a80464	ret
00a80468	mov x0,xzr
00a8046c	ret
