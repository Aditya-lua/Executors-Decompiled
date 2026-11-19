; BN_ucmp @ 00a02550
00a02550	sub sp,sp,#0x10
00a02554	ldr x8,[x0]
00a02558	ldr x9,[x1]
00a0255c	ldr w12,[x0, #0x14]
00a02560	ldr w10,[x0, #0x8]
00a02564	ldr w11,[x1, #0x8]
00a02568	tbz w12,#0x2,0x00a025fc
00a0256c	cmp w10,w11
00a02570	b.ne 0x00a025fc
00a02574	cmp w10,#0x1
00a02578	b.lt 0x00a0260c
00a0257c	mov w0,wzr
00a02580	ldr x11,[x8], #0x8
00a02584	ldr x12,[x9], #0x8
00a02588	subs x10,x10,#0x1
00a0258c	sub x14,x11,x12
00a02590	eor x13,x12,x11
00a02594	eor x14,x14,x12
00a02598	sub x15,x12,x11
00a0259c	orr x14,x14,x13
00a025a0	eor x15,x15,x11
00a025a4	eor x11,x14,x11
00a025a8	orr x13,x15,x13
00a025ac	asr x11,x11,#0x3f
00a025b0	eor x12,x13,x12
00a025b4	str w11,[sp, #0xc]
00a025b8	mvn w11,w11
00a025bc	asr x12,x12,#0x3f
00a025c0	ldr w14,[sp, #0xc]
00a025c4	str w11,[sp, #0xc]
00a025c8	mvn w13,w12
00a025cc	ldr w11,[sp, #0xc]
00a025d0	str w12,[sp, #0xc]
00a025d4	ldr w12,[sp, #0xc]
00a025d8	str w13,[sp, #0xc]
00a025dc	ldr w13,[sp, #0xc]
00a025e0	and w11,w11,w0
00a025e4	orr w11,w11,w14
00a025e8	and w12,w12,#0x1
00a025ec	and w11,w13,w11
00a025f0	orr w0,w11,w12
00a025f4	b.ne 0x00a02580
00a025f8	b 0x00a02604
00a025fc	subs w0,w10,w11
00a02600	b.eq 0x00a02618
00a02604	add sp,sp,#0x10
00a02608	ret
00a0260c	mov w0,wzr
00a02610	add sp,sp,#0x10
00a02614	ret
00a02618	sxtw x10,w10
00a0261c	sub x10,x10,#0x1
00a02620	add x11,x10,#0x1
00a02624	cmp x11,#0x1
00a02628	b.lt 0x00a02654
00a0262c	lsl x11,x10,#0x3
00a02630	ldr x12,[x8, x11#0x0]
00a02634	ldr x11,[x9, x11#0x0]
00a02638	sub x10,x10,#0x1
00a0263c	cmp x12,x11
00a02640	b.eq 0x00a02620
00a02644	mov w8,#0x1
00a02648	cneg w0,w8,ls
00a0264c	add sp,sp,#0x10
00a02650	ret
00a02654	mov w0,wzr
00a02658	add sp,sp,#0x10
00a0265c	ret
