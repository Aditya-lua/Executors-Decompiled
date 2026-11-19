; BN_div_word @ 00a0b574
00a0b574	stp x24,x23,[sp, #-0x40]!
00a0b578	stp x22,x21,[sp, #0x10]
00a0b57c	stp x20,x19,[sp, #0x20]
00a0b580	stp x29,x30,[sp, #0x30]
00a0b584	add x29,sp,#0x30
00a0b588	cbz x1,0x00a0b634
00a0b58c	ldr w8,[x0, #0x8]
00a0b590	mov x19,x0
00a0b594	cbz w8,0x00a0b63c
00a0b598	mov x0,x1
00a0b59c	mov x21,x1
00a0b5a0	bl 0x00c38d80
00a0b5a4	mov w8,#0x40
00a0b5a8	sub w20,w8,w0
00a0b5ac	mov x0,x19
00a0b5b0	mov x1,x19
00a0b5b4	mov w2,w20
00a0b5b8	bl 0x00c38fc0
00a0b5bc	cbz w0,0x00a0b634
00a0b5c0	ldr w8,[x19, #0x8]
00a0b5c4	cmp w8,#0x1
00a0b5c8	b.lt 0x00a0b644
00a0b5cc	ldr x9,[x19]
00a0b5d0	sxtw x8,w8
00a0b5d4	mov x0,xzr
00a0b5d8	lsl x21,x21,x20
00a0b5dc	sub x23,x8,#0x1
00a0b5e0	lsl x24,x23,#0x3
00a0b5e4	ldr x22,[x9, x24#0x0]
00a0b5e8	mov x2,x21
00a0b5ec	mov x1,x22
00a0b5f0	bl 0x00c388c0
00a0b5f4	ldr x9,[x19]
00a0b5f8	add x10,x23,#0x1
00a0b5fc	mov x8,x0
00a0b600	msub x0,x0,x21,x22
00a0b604	sub x23,x23,#0x1
00a0b608	cmp x10,#0x1
00a0b60c	str x8,[x9, x24#0x0]
00a0b610	b.gt 0x00a0b5e0
00a0b614	ldr w8,[x19, #0x8]
00a0b618	subs w9,w8,#0x1
00a0b61c	b.lt 0x00a0b648
00a0b620	ldr x8,[x19]
00a0b624	ldr x8,[x8, w9, SXTW #0x3]
00a0b628	cbz x8,0x00a0b668
00a0b62c	lsr x0,x0,x20
00a0b630	b 0x00a0b654
00a0b634	mov x0,#-0x1
00a0b638	b 0x00a0b654
00a0b63c	mov x0,xzr
00a0b640	b 0x00a0b654
00a0b644	mov x0,xzr
00a0b648	lsr x0,x0,x20
00a0b64c	cbnz w8,0x00a0b654
00a0b650	str wzr,[x19, #0x10]
00a0b654	ldp x29,x30,[sp, #0x30]
00a0b658	ldp x20,x19,[sp, #0x20]
00a0b65c	ldp x22,x21,[sp, #0x10]
00a0b660	ldp x24,x23,[sp], #0x40
00a0b664	ret
00a0b668	mov w8,w9
00a0b66c	str w9,[x19, #0x8]
00a0b670	lsr x0,x0,x20
00a0b674	cbnz w8,0x00a0b654
00a0b678	b 0x00a0b650
