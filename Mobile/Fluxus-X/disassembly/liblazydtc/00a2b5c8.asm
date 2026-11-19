; BN_GF2m_add @ 00a2b5c8
00a2b5c8	str x21,[sp, #-0x30]!
00a2b5cc	stp x20,x19,[sp, #0x10]
00a2b5d0	stp x29,x30,[sp, #0x20]
00a2b5d4	ldr w8,[x1, #0x8]
00a2b5d8	ldr w9,[x2, #0x8]
00a2b5dc	add x29,sp,#0x20
00a2b5e0	mov x19,x0
00a2b5e4	cmp w8,w9
00a2b5e8	csel x20,x2,x1,lt
00a2b5ec	ldr w8,[x20, #0x8]
00a2b5f0	csel x21,x1,x2,lt
00a2b5f4	mov w1,w8
00a2b5f8	bl 0x00c38e80
00a2b5fc	cbz x0,0x00a2b7a0
00a2b600	ldrsw x8,[x21, #0x8]
00a2b604	cmp w8,#0x1
00a2b608	b.lt 0x00a2b6b0
00a2b60c	ldr x9,[x20]
00a2b610	ldr x10,[x21]
00a2b614	ldr x11,[x19]
00a2b618	cmp w8,#0x3
00a2b61c	mov x12,xzr
00a2b620	b.ls 0x00a2b6bc
00a2b624	lsl x12,x8,#0x3
00a2b628	add x14,x9,x12
00a2b62c	add x13,x11,x12
00a2b630	cmp x11,x14
00a2b634	add x12,x10,x12
00a2b638	cset w14,cc
00a2b63c	cmp x9,x13
00a2b640	cset w15,cc
00a2b644	cmp x11,x12
00a2b648	cset w12,cc
00a2b64c	cmp x10,x13
00a2b650	and w14,w14,w15
00a2b654	cset w13,cc
00a2b658	tbnz w14,#0x0,0x00a2b6b8
00a2b65c	and w13,w12,w13
00a2b660	mov x12,xzr
00a2b664	tbnz w13,#0x0,0x00a2b6bc
00a2b668	and x12,x8,#-0x4
00a2b66c	add x13,x9,#0x10
00a2b670	add x14,x10,#0x10
00a2b674	add x15,x11,#0x10
00a2b678	mov x16,x12
00a2b67c	ldp q0,q1,[x13, #-0x10]
00a2b680	ldp q2,q3,[x14, #-0x10]
00a2b684	add x13,x13,#0x20
00a2b688	add x14,x14,#0x20
00a2b68c	subs x16,x16,#0x4
00a2b690	eor v0.16B,v2.16B,v0.16B
00a2b694	eor v1.16B,v3.16B,v1.16B
00a2b698	stp q0,q1,[x15, #-0x10]
00a2b69c	add x15,x15,#0x20
00a2b6a0	b.ne 0x00a2b67c
00a2b6a4	cmp x12,x8
00a2b6a8	b.ne 0x00a2b6bc
00a2b6ac	b 0x00a2b6dc
00a2b6b0	mov w12,wzr
00a2b6b4	b 0x00a2b6dc
00a2b6b8	mov x12,xzr
00a2b6bc	lsl x13,x12,#0x3
00a2b6c0	ldr x14,[x9, x13#0x0]
00a2b6c4	ldr x15,[x10, x13#0x0]
00a2b6c8	add x12,x12,#0x1
00a2b6cc	cmp x12,x8
00a2b6d0	eor x14,x15,x14
00a2b6d4	str x14,[x11, x13#0x0]
00a2b6d8	b.lt 0x00a2b6bc
00a2b6dc	ldr w8,[x20, #0x8]
00a2b6e0	cmp w12,w8
00a2b6e4	b.ge 0x00a2b790
00a2b6e8	ldr x9,[x20]
00a2b6ec	ldr x10,[x19]
00a2b6f0	sub w11,w8,#0x1
00a2b6f4	sub w14,w11,w12
00a2b6f8	add x13,x14,#0x1
00a2b6fc	cmp x13,#0x3
00a2b700	mov w11,w12
00a2b704	b.ls 0x00a2b778
00a2b708	add x15,x11,x14
00a2b70c	lsl x15,x15,#0x3
00a2b710	lsl x12,x11,#0x3
00a2b714	add x15,x15,#0x8
00a2b718	add x16,x10,x12
00a2b71c	add x17,x9,x15
00a2b720	cmp x16,x17
00a2b724	b.cs 0x00a2b738
00a2b728	add x15,x10,x15
00a2b72c	add x16,x9,x12
00a2b730	cmp x16,x15
00a2b734	b.cc 0x00a2b778
00a2b738	add w15,w14,#0x1
00a2b73c	add x16,x12,#0x10
00a2b740	and w12,w15,#0x3
00a2b744	add x17,x14,#0x1
00a2b748	sub x13,x13,x12
00a2b74c	add x14,x10,x16
00a2b750	add x15,x9,x16
00a2b754	add x11,x13,x11
00a2b758	sub x13,x17,x12
00a2b75c	ldp q0,q1,[x15, #-0x10]
00a2b760	subs x13,x13,#0x4
00a2b764	add x15,x15,#0x20
00a2b768	stp q0,q1,[x14, #-0x10]
00a2b76c	add x14,x14,#0x20
00a2b770	b.ne 0x00a2b75c
00a2b774	cbz w12,0x00a2b790
00a2b778	lsl x12,x11,#0x3
00a2b77c	ldr x13,[x9, x12#0x0]
00a2b780	add x11,x11,#0x1
00a2b784	cmp w8,w11
00a2b788	str x13,[x10, x12#0x0]
00a2b78c	b.gt 0x00a2b778
00a2b790	mov x0,x19
00a2b794	str w8,[x19, #0x8]
00a2b798	bl 0x00c38e40
00a2b79c	mov w0,#0x1
00a2b7a0	ldp x29,x30,[sp, #0x20]
00a2b7a4	ldp x20,x19,[sp, #0x10]
00a2b7a8	ldr x21,[sp], #0x30
00a2b7ac	ret
