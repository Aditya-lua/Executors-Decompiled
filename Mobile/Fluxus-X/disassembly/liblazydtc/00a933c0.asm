; DES_cfb64_encrypt @ 00a933c0
00a933c0	str x25,[sp, #-0x50]!
00a933c4	stp x24,x23,[sp, #0x10]
00a933c8	stp x22,x21,[sp, #0x20]
00a933cc	stp x20,x19,[sp, #0x30]
00a933d0	stp x29,x30,[sp, #0x40]
00a933d4	ldr w25,[x5]
00a933d8	mov x19,x5
00a933dc	mov x20,x4
00a933e0	mov x21,x3
00a933e4	mov x22,x2
00a933e8	mov x23,x1
00a933ec	mov x24,x0
00a933f0	add x29,sp,#0x40
00a933f4	cbz w6,0x00a9348c
00a933f8	cbz x22,0x00a9351c
00a933fc	cbnz w25,0x00a93460
00a93400	ldr w8,[x20]
00a93404	add x0,sp,#0x8
00a93408	mov w2,#0x1
00a9340c	mov x1,x21
00a93410	str w8,[sp, #0x8]
00a93414	ldr w8,[x20, #0x4]
00a93418	str w8,[sp, #0xc]
00a9341c	bl 0x00c39a00
00a93420	ldr w8,[sp, #0x8]
00a93424	lsr w9,w8,#0x8
00a93428	strb w8,[x20]
00a9342c	strb w9,[x20, #0x1]
00a93430	lsr w9,w8,#0x10
00a93434	lsr w8,w8,#0x18
00a93438	strb w9,[x20, #0x2]
00a9343c	strb w8,[x20, #0x3]
00a93440	ldr w8,[sp, #0xc]
00a93444	lsr w9,w8,#0x8
00a93448	strb w8,[x20, #0x4]
00a9344c	strb w9,[x20, #0x5]
00a93450	lsr w9,w8,#0x10
00a93454	lsr w8,w8,#0x18
00a93458	strb w9,[x20, #0x6]
00a9345c	strb w8,[x20, #0x7]
00a93460	sxtw x9,w25
00a93464	ldrb w8,[x24], #0x1
00a93468	ldrb w10,[x20, x9]
00a9346c	add w11,w25,#0x1
00a93470	subs x22,x22,#0x1
00a93474	and w25,w11,#0x7
00a93478	eor w8,w10,w8
00a9347c	strb w8,[x23], #0x1
00a93480	strb w8,[x20, x9]
00a93484	b.ne 0x00a933fc
00a93488	b 0x00a9351c
00a9348c	cbz x22,0x00a9351c
00a93490	cbnz w25,0x00a934f4
00a93494	ldr w8,[x20]
00a93498	add x0,sp,#0x8
00a9349c	mov w2,#0x1
00a934a0	mov x1,x21
00a934a4	str w8,[sp, #0x8]
00a934a8	ldr w8,[x20, #0x4]
00a934ac	str w8,[sp, #0xc]
00a934b0	bl 0x00c39a00
00a934b4	ldr w8,[sp, #0x8]
00a934b8	lsr w9,w8,#0x8
00a934bc	strb w8,[x20]
00a934c0	strb w9,[x20, #0x1]
00a934c4	lsr w9,w8,#0x10
00a934c8	lsr w8,w8,#0x18
00a934cc	strb w9,[x20, #0x2]
00a934d0	strb w8,[x20, #0x3]
00a934d4	ldr w8,[sp, #0xc]
00a934d8	lsr w9,w8,#0x8
00a934dc	strb w8,[x20, #0x4]
00a934e0	strb w9,[x20, #0x5]
00a934e4	lsr w9,w8,#0x10
00a934e8	lsr w8,w8,#0x18
00a934ec	strb w9,[x20, #0x6]
00a934f0	strb w8,[x20, #0x7]
00a934f4	sxtw x9,w25
00a934f8	ldrb w8,[x24], #0x1
00a934fc	ldrb w10,[x20, x9]
00a93500	add w11,w25,#0x1
00a93504	subs x22,x22,#0x1
00a93508	strb w8,[x20, x9]
00a9350c	eor w8,w10,w8
00a93510	strb w8,[x23], #0x1
00a93514	and w25,w11,#0x7
00a93518	b.ne 0x00a93490
00a9351c	str w25,[x19]
00a93520	ldp x29,x30,[sp, #0x40]
00a93524	ldp x20,x19,[sp, #0x30]
00a93528	ldp x22,x21,[sp, #0x20]
00a9352c	ldp x24,x23,[sp, #0x10]
00a93530	ldr x25,[sp], #0x50
00a93534	ret
