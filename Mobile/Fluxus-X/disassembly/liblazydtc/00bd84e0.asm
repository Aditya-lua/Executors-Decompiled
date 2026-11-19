; std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::swap @ 00bd84e0
00bd84e0	paciasp
00bd84e4	sub sp,sp,#0x30
00bd84e8	stp x29,x30,[sp, #0x10]
00bd84ec	stp x20,x19,[sp, #0x20]
00bd84f0	add x29,sp,#0x10
00bd84f4	mov x20,x0
00bd84f8	mov x19,x1
00bd84fc	add x0,sp,#0x8
00bd8500	add x1,x20,#0x8
00bd8504	bl 0x00c30660
00bd8508	add x0,x20,#0x8
00bd850c	add x1,x19,#0x8
00bd8510	bl 0x00c43f00
00bd8514	add x0,x19,#0x8
00bd8518	add x1,sp,#0x8
00bd851c	bl 0x00c43f00
00bd8520	add x0,sp,#0x8
00bd8524	bl 0x00c30090
00bd8528	ldr x8,[x19, #0x10]
00bd852c	ldr x9,[x20, #0x10]
00bd8530	add x11,x19,#0x58
00bd8534	str x8,[x20, #0x10]
00bd8538	str x9,[x19, #0x10]
00bd853c	ldr x8,[x19, #0x18]
00bd8540	ldr x9,[x20, #0x18]
00bd8544	str x8,[x20, #0x18]
00bd8548	str x9,[x19, #0x18]
00bd854c	ldr x8,[x19, #0x20]
00bd8550	ldr x9,[x20, #0x20]
00bd8554	str x8,[x20, #0x20]
00bd8558	str x9,[x19, #0x20]
00bd855c	ldr x8,[x19, #0x28]
00bd8560	ldr x9,[x20, #0x28]
00bd8564	str x8,[x20, #0x28]
00bd8568	str x9,[x19, #0x28]
00bd856c	ldr x8,[x19, #0x30]
00bd8570	ldr x9,[x20, #0x30]
00bd8574	str x8,[x20, #0x30]
00bd8578	str x9,[x19, #0x30]
00bd857c	ldr x8,[x19, #0x38]
00bd8580	ldr x9,[x20, #0x38]
00bd8584	str x8,[x20, #0x38]
00bd8588	add x8,x20,#0x58
00bd858c	str x9,[x19, #0x38]
00bd8590	ldr x10,[x19, #0x40]
00bd8594	ldr x9,[x20, #0x40]
00bd8598	cmp x9,x8
00bd859c	b.eq 0x00bd85d4
00bd85a0	cmp x10,x11
00bd85a4	b.eq 0x00bd85d4
00bd85a8	str x10,[x20, #0x40]
00bd85ac	str x9,[x19, #0x40]
00bd85b0	ldr x9,[x19, #0x48]
00bd85b4	ldr x10,[x20, #0x48]
00bd85b8	str x9,[x20, #0x48]
00bd85bc	str x10,[x19, #0x48]
00bd85c0	ldr x9,[x19, #0x50]
00bd85c4	ldr x10,[x20, #0x50]
00bd85c8	str x9,[x20, #0x50]
00bd85cc	str x10,[x19, #0x50]
00bd85d0	b 0x00bd867c
00bd85d4	dup v1.2D,x9
00bd85d8	dup v2.2D,x10
00bd85dc	ldur q0,[x20, #0x48]
00bd85e0	ldur q3,[x19, #0x48]
00bd85e4	cmp x9,x8
00bd85e8	cmeq v4.2D,v0.2D,#0
00bd85ec	sub v0.2D,v0.2D,v1.2D
00bd85f0	cmeq v1.2D,v3.2D,#0
00bd85f4	sub v2.2D,v3.2D,v2.2D
00bd85f8	bic v0.16B,v0.16B,v4.16B
00bd85fc	bic v1.16B,v2.16B,v1.16B
00bd8600	b.eq 0x00bd8620
00bd8604	cmp x10,x11
00bd8608	b.ne 0x00bd863c
00bd860c	str x9,[x19, #0x40]
00bd8610	str x8,[x20, #0x40]
00bd8614	ldr x9,[x19, #0x58]
00bd8618	str x9,[x20, #0x58]
00bd861c	b 0x00bd864c
00bd8620	cmp x10,x11
00bd8624	b.eq 0x00bd863c
00bd8628	str x10,[x20, #0x40]
00bd862c	str x11,[x19, #0x40]
00bd8630	ldr x9,[x20, #0x58]
00bd8634	str x9,[x19, #0x58]
00bd8638	b 0x00bd864c
00bd863c	ldr x9,[x19, #0x58]
00bd8640	ldr x10,[x8]
00bd8644	str x9,[x8]
00bd8648	str x10,[x19, #0x58]
00bd864c	mov x9,v1.D[0x1]
00bd8650	fmov x11,d1
00bd8654	ldr x10,[x20, #0x40]
00bd8658	mov x12,v0.D[0x1]
00bd865c	fmov x14,d0
00bd8660	ldr x13,[x19, #0x40]
00bd8664	add x11,x10,x11
00bd8668	add x9,x10,x9
00bd866c	add x10,x13,x14
00bd8670	stp x11,x9,[x20, #0x48]
00bd8674	add x9,x13,x12
00bd8678	stp x10,x9,[x19, #0x48]
00bd867c	ldp x9,x10,[x19, #0x60]
00bd8680	ldp x11,x12,[x20, #0x60]
00bd8684	stp x9,x10,[x20, #0x60]
00bd8688	ldr x9,[x19, #0x70]
00bd868c	stp x11,x12,[x19, #0x60]
00bd8690	ldur q0,[x19, #0x78]
00bd8694	ldr x10,[x20, #0x70]
00bd8698	ldur q1,[x20, #0x78]
00bd869c	str x9,[x20, #0x70]
00bd86a0	stur q0,[x20, #0x78]
00bd86a4	str x10,[x19, #0x70]
00bd86a8	ldr x9,[x19, #0x88]
00bd86ac	stur q1,[x19, #0x78]
00bd86b0	ldr x10,[x20, #0x88]
00bd86b4	str x9,[x20, #0x88]
00bd86b8	ldr x9,[x19, #0x90]
00bd86bc	str x10,[x19, #0x88]
00bd86c0	ldr x10,[x20, #0x90]
00bd86c4	str x9,[x20, #0x90]
00bd86c8	ldr w9,[x19, #0x98]
00bd86cc	ldrb w11,[x19, #0xa0]
00bd86d0	str x10,[x19, #0x90]
00bd86d4	ldr w10,[x20, #0x98]
00bd86d8	str w9,[x20, #0x98]
00bd86dc	ldrb w9,[x20, #0xa0]
00bd86e0	strb w11,[x20, #0xa0]
00bd86e4	ldr x12,[x20, #0x10]
00bd86e8	str w10,[x19, #0x98]
00bd86ec	ldr w10,[x19, #0x9c]
00bd86f0	strb w9,[x19, #0xa0]
00bd86f4	ldrb w9,[x19, #0xa1]
00bd86f8	ldr w11,[x20, #0x9c]
00bd86fc	str w10,[x20, #0x9c]
00bd8700	ldrb w10,[x20, #0xa1]
00bd8704	strb w9,[x20, #0xa1]
00bd8708	add x9,x19,#0x58
00bd870c	strb w10,[x19, #0xa1]
00bd8710	ldrb w10,[x19, #0xa2]
00bd8714	cmp x12,x9
00bd8718	str w11,[x19, #0x9c]
00bd871c	ldrb w11,[x20, #0xa2]
00bd8720	strb w10,[x20, #0xa2]
00bd8724	strb w11,[x19, #0xa2]
00bd8728	b.eq 0x00bd8758
00bd872c	ldr x10,[x20, #0x28]
00bd8730	cmp x10,x9
00bd8734	b.ne 0x00bd8774
00bd8738	ldp x11,x10,[x20, #0x30]
00bd873c	sub x10,x10,x9
00bd8740	sub x11,x11,x9
00bd8744	add x10,x8,x10
00bd8748	str x10,[x20, #0x38]
00bd874c	add x10,x8,x11
00bd8750	stp x8,x10,[x20, #0x28]
00bd8754	b 0x00bd8774
00bd8758	ldp x10,x11,[x20, #0x18]
00bd875c	sub x10,x10,x9
00bd8760	sub x11,x11,x9
00bd8764	add x10,x8,x10
00bd8768	add x11,x8,x11
00bd876c	stp x8,x10,[x20, #0x10]
00bd8770	str x11,[x20, #0x20]
00bd8774	ldr x10,[x19, #0x10]
00bd8778	cmp x10,x8
00bd877c	b.eq 0x00bd87ac
00bd8780	ldr x10,[x19, #0x28]
00bd8784	cmp x10,x8
00bd8788	b.ne 0x00bd87c8
00bd878c	ldp x11,x10,[x19, #0x30]
00bd8790	str x9,[x19, #0x28]
00bd8794	sub x10,x10,x8
00bd8798	sub x8,x11,x8
00bd879c	add x10,x9,x10
00bd87a0	add x8,x9,x8
00bd87a4	stp x8,x10,[x19, #0x30]
00bd87a8	b 0x00bd87c8
00bd87ac	ldp x10,x11,[x19, #0x18]
00bd87b0	sub x10,x10,x8
00bd87b4	sub x8,x11,x8
00bd87b8	add x10,x9,x10
00bd87bc	add x8,x9,x8
00bd87c0	stp x9,x10,[x19, #0x10]
00bd87c4	str x8,[x19, #0x20]
00bd87c8	ldp x20,x19,[sp, #0x20]
00bd87cc	ldp x29,x30,[sp, #0x10]
00bd87d0	add sp,sp,#0x30
00bd87d4	autiasp
00bd87d8	ret
