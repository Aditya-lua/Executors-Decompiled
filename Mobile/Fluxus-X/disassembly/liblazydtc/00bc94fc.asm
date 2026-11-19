; std::__ndk1::to_wstring @ 00bc94fc
00bc94fc	paciasp
00bc9500	sub sp,sp,#0x40
00bc9504	stp x29,x30,[sp, #0x10]
00bc9508	stp x22,x21,[sp, #0x20]
00bc950c	stp x20,x19,[sp, #0x30]
00bc9510	add x29,sp,#0x10
00bc9514	mov w1,w0
00bc9518	add x0,sp,#0x4
00bc951c	mov x20,x8
00bc9520	add x19,x0,#0xb
00bc9524	tbz w1,#0x1f,0x00bc9538
00bc9528	mov w8,#0x2d
00bc952c	orr x0,x0,#0x1
00bc9530	neg w1,w1
00bc9534	strb w8,[sp, #0x4]
00bc9538	sub x8,x19,x0
00bc953c	cmp x8,#0x9
00bc9540	b.gt 0x00bc9584
00bc9544	orr w9,w1,#0x1
00bc9548	mov w10,#0x20
00bc954c	clz w9,w9
00bc9550	sub w9,w10,w9
00bc9554	mov w10,#0x4d1
00bc9558	mul w9,w9,w10
00bc955c	adrp x10,0x78a000
00bc9560	add x10,x10,#0x158
00bc9564	lsr w9,w9,#0xc
00bc9568	ldr w10,[x10, w9, UXTW #0x2]
00bc956c	cmp w1,w10
00bc9570	cset w10,cc
00bc9574	sub w9,w9,w10
00bc9578	add w9,w9,#0x1
00bc957c	cmp x8,x9
00bc9580	b.lt 0x00bc958c
00bc9584	bl 0x00bcac54
00bc9588	mov x19,x0
00bc958c	add x8,sp,#0x4
00bc9590	sub x21,x19,x8
00bc9594	orr x8,xzr,#0x3ffffffffffffff8
00bc9598	cmp x21,x8
00bc959c	b.cs 0x00bc96b4
00bc95a0	cmp x21,#0x4
00bc95a4	b.hi 0x00bc95b4
00bc95a8	lsl w8,w21,#0x1
00bc95ac	strb w8,[x20], #0x4
00bc95b0	b 0x00bc95dc
00bc95b4	orr x8,x21,#0x1
00bc95b8	mov w9,#0x8
00bc95bc	cmp x8,#0x5
00bc95c0	csinc x22,x9,x8,eq
00bc95c4	lsl x0,x22,#0x2
00bc95c8	bl 0x00c2fed0
00bc95cc	orr x8,x22,#0x1
00bc95d0	stp x21,x0,[x20, #0x8]
00bc95d4	str x8,[x20]
00bc95d8	mov x20,x0
00bc95dc	add x9,sp,#0x4
00bc95e0	cmp x9,x19
00bc95e4	b.eq 0x00bc95fc
00bc95e8	sub x10,x19,x9
00bc95ec	cmp x10,#0x20
00bc95f0	b.cs 0x00bc9604
00bc95f4	mov x8,x20
00bc95f8	b 0x00bc9688
00bc95fc	mov x8,x20
00bc9600	b 0x00bc9698
00bc9604	adrp x9,0x29c000
00bc9608	adrp x13,0x29d000
00bc960c	and x11,x10,#-0x20
00bc9610	ldr q0,[x9, #0x890]
00bc9614	ldr q1,[x13, #0xa0]
00bc9618	adrp x9,0x29c000
00bc961c	adrp x13,0x29c000
00bc9620	add x12,sp,#0x4
00bc9624	add x8,x20,x11, LSL #0x2
00bc9628	ldr q2,[x9, #0xcc0]
00bc962c	ldr q3,[x13, #0x20]
00bc9630	add x9,x12,x11
00bc9634	add x12,x12,#0x10
00bc9638	add x13,x20,#0x40
00bc963c	mov x14,x11
00bc9640	ldp q4,q5,[x12, #-0x10]
00bc9644	subs x14,x14,#0x20
00bc9648	add x12,x12,#0x20
00bc964c	tbl v6.16B,{v4.16B},v3.16B
00bc9650	tbl v7.16B,{v4.16B},v2.16B
00bc9654	tbl v16.16B,{v4.16B},v1.16B
00bc9658	tbl v4.16B,{v4.16B},v0.16B
00bc965c	tbl v17.16B,{v5.16B},v3.16B
00bc9660	stp q7,q6,[x13, #-0x20]
00bc9664	tbl v6.16B,{v5.16B},v2.16B
00bc9668	tbl v7.16B,{v5.16B},v1.16B
00bc966c	tbl v5.16B,{v5.16B},v0.16B
00bc9670	stp q4,q16,[x13, #-0x40]
00bc9674	stp q6,q17,[x13, #0x20]
00bc9678	stp q5,q7,[x13], #0x80
00bc967c	b.ne 0x00bc9640
00bc9680	cmp x10,x11
00bc9684	b.eq 0x00bc9698
00bc9688	ldrb w10,[x9], #0x1
00bc968c	cmp x9,x19
00bc9690	str w10,[x8], #0x4
00bc9694	b.ne 0x00bc9688
00bc9698	str wzr,[x8]
00bc969c	ldp x20,x19,[sp, #0x30]
00bc96a0	ldp x22,x21,[sp, #0x20]
00bc96a4	ldp x29,x30,[sp, #0x10]
00bc96a8	add sp,sp,#0x40
00bc96ac	autiasp
00bc96b0	ret
00bc96b4	bl 0x00bc5610
