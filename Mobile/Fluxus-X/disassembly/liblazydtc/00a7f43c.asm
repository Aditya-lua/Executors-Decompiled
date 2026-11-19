; HMAC_Init_ex @ 00a7f43c
00a7f43c	sub sp,sp,#0x170
00a7f440	stp x24,x23,[sp, #0x130]
00a7f444	stp x22,x21,[sp, #0x140]
00a7f448	stp x20,x19,[sp, #0x150]
00a7f44c	stp x29,x30,[sp, #0x160]
00a7f450	ldr x8,[x0]
00a7f454	mov x21,x4
00a7f458	mov w22,w2
00a7f45c	mov x19,x0
00a7f460	mov x23,x1
00a7f464	str x28,[sp, #0x120]
00a7f468	add x29,sp,#0x160
00a7f46c	cbz x3,0x00a7f490
00a7f470	mov x20,x3
00a7f474	cmp x8,x3
00a7f478	b.eq 0x00a7f488
00a7f47c	cbz x23,0x00a7f514
00a7f480	mov w24,wzr
00a7f484	tbnz w22,#0x1f,0x00a7f818
00a7f488	str x20,[x19]
00a7f48c	b 0x00a7f498
00a7f490	mov x20,x8
00a7f494	cbz x8,0x00a7f514
00a7f498	mov x0,x20
00a7f49c	bl 0x00c3cf50
00a7f4a0	mov w24,wzr
00a7f4a4	tbnz w0,#0x1,0x00a7f818
00a7f4a8	cbz x23,0x00a7f51c
00a7f4ac	mov x0,x20
00a7f4b0	bl 0x00c3cf40
00a7f4b4	cmp w0,#0x90
00a7f4b8	mov w24,wzr
00a7f4bc	b.hi 0x00a7f818
00a7f4c0	cmp w0,w22
00a7f4c4	b.ge 0x00a7f538
00a7f4c8	ldr x0,[x19, #0x8]
00a7f4cc	mov x1,x20
00a7f4d0	mov x2,x21
00a7f4d4	bl 0x00c31f70
00a7f4d8	cbz w0,0x00a7f514
00a7f4dc	ldr x0,[x19, #0x8]
00a7f4e0	sxtw x2,w22
00a7f4e4	mov x1,x23
00a7f4e8	bl 0x00c31f80
00a7f4ec	cbz w0,0x00a7f514
00a7f4f0	ldr x0,[x19, #0x8]
00a7f4f4	mov x1,sp
00a7f4f8	sub x2,x29,#0x34
00a7f4fc	bl 0x00c31f60
00a7f500	cbz w0,0x00a7f514
00a7f504	ldur w22,[x29, #-0x34]
00a7f508	cmp w22,#0x90
00a7f50c	b.ne 0x00a7f560
00a7f510	b 0x00a7f578
00a7f514	mov w24,wzr
00a7f518	b 0x00a7f818
00a7f51c	mov w20,#0x1
00a7f520	ldp x0,x1,[x19, #0x8]
00a7f524	bl 0x00c34bf0
00a7f528	cmp w0,#0x0
00a7f52c	cset w24,ne
00a7f530	tbz w20,#0x0,0x00a7f800
00a7f534	b 0x00a7f818
00a7f538	cmp w22,#0x90
00a7f53c	mov w24,wzr
00a7f540	b.hi 0x00a7f818
00a7f544	sxtw x2,w22
00a7f548	mov x0,sp
00a7f54c	mov x1,x23
00a7f550	bl 0x00c2ffd0
00a7f554	stur w22,[x29, #-0x34]
00a7f558	cmp w22,#0x90
00a7f55c	b.eq 0x00a7f578
00a7f560	mov x8,sp
00a7f564	mov w9,#0x90
00a7f568	add x0,x8,w22, UXTW 
00a7f56c	sub w2,w9,w22
00a7f570	mov w1,wzr
00a7f574	bl 0x00c301c0
00a7f578	ldp q0,q1,[sp]
00a7f57c	ldp q3,q4,[sp, #0x20]
00a7f580	ldp q5,q6,[sp, #0x40]
00a7f584	ldp q7,q16,[sp, #0x60]
00a7f588	ldrb w8,[sp, #0x80]
00a7f58c	ldrb w10,[sp, #0x81]
00a7f590	ldrb w11,[sp, #0x82]
00a7f594	ldrb w12,[sp, #0x83]
00a7f598	ldrb w13,[sp, #0x84]
00a7f59c	ldrb w14,[sp, #0x85]
00a7f5a0	ldrb w15,[sp, #0x86]
00a7f5a4	ldrb w16,[sp, #0x87]
00a7f5a8	ldrb w17,[sp, #0x88]
00a7f5ac	ldrb w18,[sp, #0x89]
00a7f5b0	ldrb w0,[sp, #0x8a]
00a7f5b4	ldrb w1,[sp, #0x8b]
00a7f5b8	ldrb w2,[sp, #0x8c]
00a7f5bc	ldrb w3,[sp, #0x8d]
00a7f5c0	ldrb w4,[sp, #0x8e]
00a7f5c4	ldrb w5,[sp, #0x8f]
00a7f5c8	movi v2.16B,#0x36
00a7f5cc	mov w9,#0x36
00a7f5d0	eor v0.16B,v0.16B,v2.16B
00a7f5d4	eor v1.16B,v1.16B,v2.16B
00a7f5d8	eor v3.16B,v3.16B,v2.16B
00a7f5dc	eor v4.16B,v4.16B,v2.16B
00a7f5e0	eor v5.16B,v5.16B,v2.16B
00a7f5e4	eor v6.16B,v6.16B,v2.16B
00a7f5e8	eor v7.16B,v7.16B,v2.16B
00a7f5ec	eor v2.16B,v16.16B,v2.16B
00a7f5f0	eor w8,w8,w9
00a7f5f4	eor w10,w10,w9
00a7f5f8	eor w11,w11,w9
00a7f5fc	eor w12,w12,w9
00a7f600	eor w13,w13,w9
00a7f604	eor w14,w14,w9
00a7f608	eor w15,w15,w9
00a7f60c	eor w16,w16,w9
00a7f610	eor w17,w17,w9
00a7f614	eor w18,w18,w9
00a7f618	eor w0,w0,w9
00a7f61c	eor w1,w1,w9
00a7f620	eor w2,w2,w9
00a7f624	eor w3,w3,w9
00a7f628	eor w4,w4,w9
00a7f62c	eor w9,w5,w9
00a7f630	stp q0,q1,[sp, #0x90]
00a7f634	stp q3,q4,[sp, #0xb0]
00a7f638	str q5,[sp, #0xd0]
00a7f63c	stp q6,q7,[sp, #0xe0]
00a7f640	str q2,[sp, #0x100]
00a7f644	strb w8,[sp, #0x110]
00a7f648	strb w10,[sp, #0x111]
00a7f64c	strb w11,[sp, #0x112]
00a7f650	strb w12,[sp, #0x113]
00a7f654	strb w13,[sp, #0x114]
00a7f658	strb w14,[sp, #0x115]
00a7f65c	strb w15,[sp, #0x116]
00a7f660	strb w16,[sp, #0x117]
00a7f664	strb w17,[sp, #0x118]
00a7f668	strb w18,[sp, #0x119]
00a7f66c	strb w0,[sp, #0x11a]
00a7f670	strb w1,[sp, #0x11b]
00a7f674	strb w2,[sp, #0x11c]
00a7f678	strb w3,[sp, #0x11d]
00a7f67c	strb w4,[sp, #0x11e]
00a7f680	strb w9,[sp, #0x11f]
00a7f684	ldr x0,[x19, #0x10]
00a7f688	mov x1,x20
00a7f68c	mov x2,x21
00a7f690	bl 0x00c31f70
00a7f694	cbz w0,0x00a7f7fc
00a7f698	ldr x22,[x19, #0x10]
00a7f69c	mov x0,x20
00a7f6a0	bl 0x00c3cf40
00a7f6a4	sxtw x2,w0
00a7f6a8	add x1,sp,#0x90
00a7f6ac	mov x0,x22
00a7f6b0	bl 0x00c31f80
00a7f6b4	cbz w0,0x00a7f7fc
00a7f6b8	ldp q0,q1,[sp]
00a7f6bc	ldp q3,q4,[sp, #0x20]
00a7f6c0	ldp q5,q6,[sp, #0x40]
00a7f6c4	ldp q7,q16,[sp, #0x60]
00a7f6c8	ldrb w8,[sp, #0x80]
00a7f6cc	ldrb w10,[sp, #0x81]
00a7f6d0	ldrb w11,[sp, #0x82]
00a7f6d4	ldrb w12,[sp, #0x83]
00a7f6d8	ldrb w13,[sp, #0x84]
00a7f6dc	ldrb w14,[sp, #0x85]
00a7f6e0	ldrb w15,[sp, #0x86]
00a7f6e4	ldrb w16,[sp, #0x87]
00a7f6e8	ldrb w17,[sp, #0x88]
00a7f6ec	ldrb w18,[sp, #0x89]
00a7f6f0	ldrb w0,[sp, #0x8a]
00a7f6f4	ldrb w1,[sp, #0x8b]
00a7f6f8	ldrb w2,[sp, #0x8c]
00a7f6fc	ldrb w3,[sp, #0x8d]
00a7f700	ldrb w4,[sp, #0x8e]
00a7f704	ldrb w5,[sp, #0x8f]
00a7f708	movi v2.16B,#0x5c
00a7f70c	mov w9,#0x5c
00a7f710	eor v0.16B,v0.16B,v2.16B
00a7f714	eor v1.16B,v1.16B,v2.16B
00a7f718	eor v3.16B,v3.16B,v2.16B
00a7f71c	eor v4.16B,v4.16B,v2.16B
00a7f720	eor v5.16B,v5.16B,v2.16B
00a7f724	eor v6.16B,v6.16B,v2.16B
00a7f728	eor v7.16B,v7.16B,v2.16B
00a7f72c	eor v2.16B,v16.16B,v2.16B
00a7f730	eor w8,w8,w9
00a7f734	eor w10,w10,w9
00a7f738	eor w11,w11,w9
00a7f73c	eor w12,w12,w9
00a7f740	eor w13,w13,w9
00a7f744	eor w14,w14,w9
00a7f748	eor w15,w15,w9
00a7f74c	eor w16,w16,w9
00a7f750	eor w17,w17,w9
00a7f754	eor w18,w18,w9
00a7f758	eor w0,w0,w9
00a7f75c	eor w1,w1,w9
00a7f760	eor w2,w2,w9
00a7f764	eor w3,w3,w9
00a7f768	eor w4,w4,w9
00a7f76c	eor w9,w5,w9
00a7f770	stp q0,q1,[sp, #0x90]
00a7f774	stp q3,q4,[sp, #0xb0]
00a7f778	str q5,[sp, #0xd0]
00a7f77c	stp q6,q7,[sp, #0xe0]
00a7f780	str q2,[sp, #0x100]
00a7f784	strb w8,[sp, #0x110]
00a7f788	strb w10,[sp, #0x111]
00a7f78c	strb w11,[sp, #0x112]
00a7f790	strb w12,[sp, #0x113]
00a7f794	strb w13,[sp, #0x114]
00a7f798	strb w14,[sp, #0x115]
00a7f79c	strb w15,[sp, #0x116]
00a7f7a0	strb w16,[sp, #0x117]
00a7f7a4	strb w17,[sp, #0x118]
00a7f7a8	strb w18,[sp, #0x119]
00a7f7ac	strb w0,[sp, #0x11a]
00a7f7b0	strb w1,[sp, #0x11b]
00a7f7b4	strb w2,[sp, #0x11c]
00a7f7b8	strb w3,[sp, #0x11d]
00a7f7bc	strb w4,[sp, #0x11e]
00a7f7c0	strb w9,[sp, #0x11f]
00a7f7c4	ldr x0,[x19, #0x18]
00a7f7c8	mov x1,x20
00a7f7cc	mov x2,x21
00a7f7d0	bl 0x00c31f70
00a7f7d4	cbz w0,0x00a7f7fc
00a7f7d8	ldr x21,[x19, #0x18]
00a7f7dc	mov x0,x20
00a7f7e0	bl 0x00c3cf40
00a7f7e4	sxtw x2,w0
00a7f7e8	add x1,sp,#0x90
00a7f7ec	mov x0,x21
00a7f7f0	bl 0x00c31f80
00a7f7f4	mov w20,wzr
00a7f7f8	cbnz w0,0x00a7f520
00a7f7fc	mov w24,wzr
00a7f800	mov x0,sp
00a7f804	mov w1,#0x90
00a7f808	bl 0x00c34750
00a7f80c	add x0,sp,#0x90
00a7f810	mov w1,#0x90
00a7f814	bl 0x00c34750
00a7f818	mov w0,w24
00a7f81c	ldp x29,x30,[sp, #0x160]
00a7f820	ldp x20,x19,[sp, #0x150]
00a7f824	ldp x22,x21,[sp, #0x140]
00a7f828	ldp x24,x23,[sp, #0x130]
00a7f82c	ldr x28,[sp, #0x120]
00a7f830	add sp,sp,#0x170
00a7f834	ret
