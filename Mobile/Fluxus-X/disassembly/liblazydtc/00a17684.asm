; DES_set_key @ 00a17684
00a17684	stp x24,x23,[sp, #-0x40]!
00a17688	stp x22,x21,[sp, #0x10]
00a1768c	stp x20,x19,[sp, #0x20]
00a17690	stp x29,x30,[sp, #0x30]
00a17694	ldrb w8,[x0]
00a17698	ldrb w9,[x0, #0x1]
00a1769c	ldrb w10,[x0, #0x2]
00a176a0	ldrb w11,[x0, #0x3]
00a176a4	eor w8,w8,w8, LSR #0x4
00a176a8	eor w9,w9,w9, LSR #0x4
00a176ac	ldrb w12,[x0, #0x4]
00a176b0	eor w8,w8,w8, LSR #0x2
00a176b4	eor w9,w9,w9, LSR #0x2
00a176b8	eor w10,w10,w10, LSR #0x4
00a176bc	ldrb w13,[x0, #0x5]
00a176c0	eor w8,w8,w8, LSR #0x1
00a176c4	eor w9,w9,w9, LSR #0x1
00a176c8	eor w10,w10,w10, LSR #0x2
00a176cc	and w8,w8,w9
00a176d0	ldrb w9,[x0, #0x6]
00a176d4	eor w10,w10,w10, LSR #0x1
00a176d8	and w8,w8,w10
00a176dc	ldrb w10,[x0, #0x7]
00a176e0	eor w11,w11,w11, LSR #0x4
00a176e4	eor w12,w12,w12, LSR #0x4
00a176e8	eor w11,w11,w11, LSR #0x2
00a176ec	eor w13,w13,w13, LSR #0x4
00a176f0	eor w12,w12,w12, LSR #0x2
00a176f4	eor w11,w11,w11, LSR #0x1
00a176f8	eor w9,w9,w9, LSR #0x4
00a176fc	eor w13,w13,w13, LSR #0x2
00a17700	eor w12,w12,w12, LSR #0x1
00a17704	and w8,w8,w11
00a17708	eor w10,w10,w10, LSR #0x4
00a1770c	eor w9,w9,w9, LSR #0x2
00a17710	eor w13,w13,w13, LSR #0x1
00a17714	and w8,w8,w12
00a17718	eor w10,w10,w10, LSR #0x2
00a1771c	eor w9,w9,w9, LSR #0x1
00a17720	and w8,w8,w13
00a17724	eor w10,w10,w10, LSR #0x1
00a17728	and w8,w8,w9
00a1772c	and w8,w8,w10
00a17730	and w8,w8,#0x1
00a17734	adrp x24,0x753000
00a17738	mov x19,x1
00a1773c	mov x20,x0
00a17740	mov x22,xzr
00a17744	mov w21,wzr
00a17748	sub w23,w8,#0x1
00a1774c	add x24,x24,#0x40
00a17750	add x29,sp,#0x30
00a17754	add x0,x24,x22
00a17758	mov w2,#0x8
00a1775c	mov x1,x20
00a17760	bl 0x00c362f0
00a17764	sub w8,w0,#0x1
00a17768	add x22,x22,#0x8
00a1776c	bic w8,w8,w0
00a17770	cmp x22,#0x80
00a17774	orr w21,w21,w8, ASR #0x1f
00a17778	b.ne 0x00a17754
00a1777c	tst w21,#0x1
00a17780	orr w8,wzr,#0xfffffffe
00a17784	mov x0,x20
00a17788	mov x1,x19
00a1778c	csel w21,w23,w8,eq
00a17790	bl 0x00a177ac
00a17794	mov w0,w21
00a17798	ldp x29,x30,[sp, #0x30]
00a1779c	ldp x20,x19,[sp, #0x20]
00a177a0	ldp x22,x21,[sp, #0x10]
00a177a4	ldp x24,x23,[sp], #0x40
00a177a8	ret
