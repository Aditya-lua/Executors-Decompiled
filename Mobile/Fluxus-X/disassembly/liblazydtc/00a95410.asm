; DES_ede3_ofb64_encrypt @ 00a95410
00a95410	sub sp,sp,#0x80
00a95414	stp x28,x27,[sp, #0x20]
00a95418	stp x26,x25,[sp, #0x30]
00a9541c	stp x24,x23,[sp, #0x40]
00a95420	stp x22,x21,[sp, #0x50]
00a95424	stp x20,x19,[sp, #0x60]
00a95428	stp x29,x30,[sp, #0x70]
00a9542c	ldrb w9,[x6]
00a95430	ldrb w10,[x6, #0x1]
00a95434	ldrb w8,[x6, #0x4]
00a95438	ldrb w13,[x6, #0x5]
00a9543c	ldrb w11,[x6, #0x2]
00a95440	ldrb w14,[x6, #0x6]
00a95444	ldrb w12,[x6, #0x3]
00a95448	ldrb w15,[x6, #0x7]
00a9544c	ldr w27,[x7]
00a95450	strb w9,[sp, #0x18]
00a95454	strb w8,[sp, #0x1c]
00a95458	bfm w9,w10,#0x18,#0x7
00a9545c	bfm w8,w13,#0x18,#0x7
00a95460	bfm w9,w11,#0x10,#0x7
00a95464	bfm w8,w14,#0x10,#0x7
00a95468	bfm w9,w12,#0x8,#0x7
00a9546c	bfm w8,w15,#0x8,#0x7
00a95470	add x29,sp,#0x70
00a95474	strb w10,[sp, #0x19]
00a95478	strb w11,[sp, #0x1a]
00a9547c	strb w12,[sp, #0x1b]
00a95480	strb w13,[sp, #0x1d]
00a95484	strb w14,[sp, #0x1e]
00a95488	stp w9,w8,[sp, #0x10]
00a9548c	strb w15,[sp, #0x1f]
00a95490	cbz x2,0x00a95574
00a95494	mov x20,x6
00a95498	mov x21,x5
00a9549c	mov x22,x4
00a954a0	mov x23,x3
00a954a4	mov x24,x2
00a954a8	mov x25,x1
00a954ac	mov x26,x0
00a954b0	mov w28,wzr
00a954b4	add x19,sp,#0x18
00a954b8	str x7,[sp, #0x8]
00a954bc	sub x24,x24,#0x1
00a954c0	cbnz w27,0x00a95518
00a954c4	add x0,sp,#0x10
00a954c8	mov x1,x23
00a954cc	mov x2,x22
00a954d0	mov x3,x21
00a954d4	bl 0x00c39a10
00a954d8	ldp w9,w8,[sp, #0x10]
00a954dc	add w28,w28,#0x1
00a954e0	lsr w10,w9,#0x8
00a954e4	strb w10,[sp, #0x19]
00a954e8	lsr w10,w9,#0x10
00a954ec	strb w10,[sp, #0x1a]
00a954f0	lsr w10,w9,#0x18
00a954f4	strb w10,[sp, #0x1b]
00a954f8	lsr w10,w8,#0x8
00a954fc	strb w10,[sp, #0x1d]
00a95500	lsr w10,w8,#0x10
00a95504	strb w10,[sp, #0x1e]
00a95508	lsr w10,w8,#0x18
00a9550c	strb w9,[sp, #0x18]
00a95510	strb w8,[sp, #0x1c]
00a95514	strb w10,[sp, #0x1f]
00a95518	ldrb w10,[x26], #0x1
00a9551c	ldrb w11,[x19, w27, SXTW ]
00a95520	add w12,w27,#0x1
00a95524	and w27,w12,#0x7
00a95528	eor w10,w11,w10
00a9552c	strb w10,[x25], #0x1
00a95530	cbnz x24,0x00a954bc
00a95534	cbz w28,0x00a95570
00a95538	strb w9,[x20]
00a9553c	lsr w10,w9,#0x8
00a95540	lsr w11,w9,#0x10
00a95544	lsr w9,w9,#0x18
00a95548	strb w8,[x20, #0x4]
00a9554c	lsr w12,w8,#0x8
00a95550	lsr w13,w8,#0x10
00a95554	lsr w8,w8,#0x18
00a95558	strb w10,[x20, #0x1]
00a9555c	strb w11,[x20, #0x2]
00a95560	strb w9,[x20, #0x3]
00a95564	strb w12,[x20, #0x5]
00a95568	strb w13,[x20, #0x6]
00a9556c	strb w8,[x20, #0x7]
00a95570	ldr x7,[sp, #0x8]
00a95574	str w27,[x7]
00a95578	ldp x29,x30,[sp, #0x70]
00a9557c	ldp x20,x19,[sp, #0x60]
00a95580	ldp x22,x21,[sp, #0x50]
00a95584	ldp x24,x23,[sp, #0x40]
00a95588	ldp x26,x25,[sp, #0x30]
00a9558c	ldp x28,x27,[sp, #0x20]
00a95590	add sp,sp,#0x80
00a95594	ret
