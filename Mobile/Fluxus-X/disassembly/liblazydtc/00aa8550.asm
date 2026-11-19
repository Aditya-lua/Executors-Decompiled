; CRYPTO_ccm128_decrypt_ccm64 @ 00aa8550
00aa8550	sub sp,sp,#0x70
00aa8554	stp x28,x27,[sp, #0x10]
00aa8558	stp x26,x25,[sp, #0x20]
00aa855c	stp x24,x23,[sp, #0x30]
00aa8560	stp x22,x21,[sp, #0x40]
00aa8564	stp x20,x19,[sp, #0x50]
00aa8568	stp x29,x30,[sp, #0x60]
00aa856c	ldrb w26,[x0]
00aa8570	ldp x27,x20,[x0, #0x28]
00aa8574	mov x24,x4
00aa8578	mov x21,x3
00aa857c	mov x22,x2
00aa8580	mov x19,x0
00aa8584	mov x23,x1
00aa8588	add x29,sp,#0x60
00aa858c	tbnz w26,#0x6,0x00aa85a0
00aa8590	add x1,x19,#0x10
00aa8594	mov x0,x19
00aa8598	mov x2,x20
00aa859c	blr x27
00aa85a0	ands w8,w26,#0x7
00aa85a4	strb w8,[x19]
00aa85a8	eor w28,w8,#0xf
00aa85ac	mov x8,xzr
00aa85b0	b.eq 0x00aa85d4
00aa85b4	mov x9,x28
00aa85b8	ldrb w10,[x19, x9]
00aa85bc	strb wzr,[x19, x9]
00aa85c0	add x9,x9,#0x1
00aa85c4	cmp x9,#0xf
00aa85c8	orr x8,x8,x10
00aa85cc	lsl x8,x8,#0x8
00aa85d0	b.cc 0x00aa85b8
00aa85d4	ldrb w9,[x19, #0xf]
00aa85d8	orr x8,x8,x9
00aa85dc	mov w9,#0x1
00aa85e0	cmp x8,x21
00aa85e4	strb w9,[x19, #0xf]
00aa85e8	b.ne 0x00aa8764
00aa85ec	lsr x25,x21,#0x4
00aa85f0	cbz x25,0x00aa865c
00aa85f4	add x5,x19,#0x10
00aa85f8	mov x0,x23
00aa85fc	mov x1,x22
00aa8600	mov x2,x25
00aa8604	mov x3,x20
00aa8608	mov x4,x19
00aa860c	blr x24
00aa8610	and x8,x21,#-0x10
00aa8614	subs x21,x21,x8
00aa8618	b.eq 0x00aa87b0
00aa861c	mov x9,xzr
00aa8620	add x23,x23,x8
00aa8624	add x22,x22,x8
00aa8628	orr w8,wzr,#0xf
00aa862c	ldrb w10,[x19, x8]
00aa8630	add x9,x9,w25, UXTB 
00aa8634	cmp x8,#0x8
00aa8638	add x10,x9,x10
00aa863c	strb w10,[x19, x8]
00aa8640	b.eq 0x00aa865c
00aa8644	lsr x9,x10,#0x8
00aa8648	orr x10,x10,x25
00aa864c	lsr x25,x25,#0x8
00aa8650	lsr x10,x10,#0x8
00aa8654	sub x8,x8,#0x1
00aa8658	cbnz x10,0x00aa862c
00aa865c	cbz x21,0x00aa87b0
00aa8660	mov x1,sp
00aa8664	mov x0,x19
00aa8668	mov x2,x20
00aa866c	mov x24,sp
00aa8670	blr x27
00aa8674	cmp x21,#0x20
00aa8678	add x0,x19,#0x10
00aa867c	b.cc 0x00aa876c
00aa8680	sub x9,x21,#0x1
00aa8684	cmn w9,#0x1
00aa8688	b.eq 0x00aa876c
00aa868c	mov x8,xzr
00aa8690	lsr x10,x9,#0x20
00aa8694	mov w9,wzr
00aa8698	cbnz x10,0x00aa8774
00aa869c	add x11,x19,#0x10
00aa86a0	add x13,x11,x21
00aa86a4	add x9,x22,x21
00aa86a8	cmp x22,x13
00aa86ac	add x12,x23,x21
00aa86b0	cset w8,cc
00aa86b4	cmp x9,x11
00aa86b8	cset w10,hi
00aa86bc	cmp x22,x12
00aa86c0	and w14,w8,w10
00aa86c4	cset w8,cc
00aa86c8	cmp x23,x9
00aa86cc	cset w10,cc
00aa86d0	cmp x12,x11
00aa86d4	cset w9,hi
00aa86d8	cmp x23,x13
00aa86dc	cset w11,cc
00aa86e0	tbnz w14,#0x0,0x00aa876c
00aa86e4	and w8,w8,w10
00aa86e8	tbnz w8,#0x0,0x00aa876c
00aa86ec	mov x8,xzr
00aa86f0	and w10,w9,w11
00aa86f4	mov w9,wzr
00aa86f8	tbnz w10,#0x0,0x00aa8774
00aa86fc	and x8,x21,#-0x20
00aa8700	mov x12,sp
00aa8704	add x10,x23,#0x10
00aa8708	add x11,x19,#0x20
00aa870c	mov w9,w8
00aa8710	add x12,x12,#0x10
00aa8714	add x13,x22,#0x10
00aa8718	mov x14,x8
00aa871c	ldp q0,q1,[x12, #-0x10]
00aa8720	ldp q2,q3,[x10, #-0x10]
00aa8724	add x12,x12,#0x20
00aa8728	subs x14,x14,#0x20
00aa872c	add x10,x10,#0x20
00aa8730	eor v0.16B,v2.16B,v0.16B
00aa8734	eor v1.16B,v3.16B,v1.16B
00aa8738	stp q0,q1,[x13, #-0x10]
00aa873c	ldp q2,q3,[x11, #-0x10]
00aa8740	add x13,x13,#0x20
00aa8744	eor v0.16B,v2.16B,v0.16B
00aa8748	eor v1.16B,v3.16B,v1.16B
00aa874c	stp q0,q1,[x11, #-0x10]
00aa8750	add x11,x11,#0x20
00aa8754	b.ne 0x00aa871c
00aa8758	cmp x21,x8
00aa875c	b.ne 0x00aa8774
00aa8760	b 0x00aa87a4
00aa8764	mov w0,#0xffffffff
00aa8768	b 0x00aa87ec
00aa876c	mov x8,xzr
00aa8770	mov w9,wzr
00aa8774	add w9,w9,#0x1
00aa8778	ldrb w10,[x24, x8]
00aa877c	ldrb w11,[x23, x8]
00aa8780	eor w10,w11,w10
00aa8784	strb w10,[x22, x8]
00aa8788	ldrb w11,[x0, x8]
00aa878c	eor w10,w11,w10
00aa8790	strb w10,[x0, x8]
00aa8794	mov w8,w9
00aa8798	cmp x21,x8
00aa879c	add w9,w9,#0x1
00aa87a0	b.hi 0x00aa8778
00aa87a4	mov x1,x0
00aa87a8	mov x2,x20
00aa87ac	blr x27
00aa87b0	mov w8,#0x10
00aa87b4	add x0,x19,x28
00aa87b8	sub w2,w8,w28
00aa87bc	mov w1,wzr
00aa87c0	bl 0x00c301c0
00aa87c4	mov x1,sp
00aa87c8	mov x0,x19
00aa87cc	mov x2,x20
00aa87d0	blr x27
00aa87d4	ldr q0,[sp]
00aa87d8	ldr q1,[x19, #0x10]
00aa87dc	mov w0,wzr
00aa87e0	strb w26,[x19]
00aa87e4	eor v0.16B,v1.16B,v0.16B
00aa87e8	str q0,[x19, #0x10]
00aa87ec	ldp x29,x30,[sp, #0x60]
00aa87f0	ldp x20,x19,[sp, #0x50]
00aa87f4	ldp x22,x21,[sp, #0x40]
00aa87f8	ldp x24,x23,[sp, #0x30]
00aa87fc	ldp x26,x25,[sp, #0x20]
00aa8800	ldp x28,x27,[sp, #0x10]
00aa8804	add sp,sp,#0x70
00aa8808	ret
