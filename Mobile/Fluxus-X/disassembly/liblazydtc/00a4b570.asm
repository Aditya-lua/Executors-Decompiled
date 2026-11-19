; gf_mul @ 00a4b570
00a4b570	sub sp,sp,#0xa0
00a4b574	stp x24,x23,[sp, #0x70]
00a4b578	stp x22,x21,[sp, #0x80]
00a4b57c	stp x20,x19,[sp, #0x90]
00a4b580	ldr q0,[x2]
00a4b584	ldr q1,[x2, #0x20]
00a4b588	add x13,sp,#0x20
00a4b58c	str x25,[sp, #0x60]
00a4b590	mov x14,x1
00a4b594	add v0.2D,v1.2D,v0.2D
00a4b598	st1 {v0.D}[0],[x13]
00a4b59c	ldr q2,[x1]
00a4b5a0	ldr q3,[x14, #0x20]!
00a4b5a4	add x15,x13,#0x8
00a4b5a8	add v1.2D,v0.2D,v1.2D
00a4b5ac	st1 {v0.D}[1],[x15]
00a4b5b0	add v0.2D,v3.2D,v2.2D
00a4b5b4	str q1,[sp]
00a4b5b8	str q0,[sp, #0x40]
00a4b5bc	ldr q0,[x2, #0x10]
00a4b5c0	ldr q1,[x2, #0x30]
00a4b5c4	add x16,x13,#0x10
00a4b5c8	add x17,sp,#0x40
00a4b5cc	add x18,x13,#0x18
00a4b5d0	add v0.2D,v1.2D,v0.2D
00a4b5d4	st1 {v0.D}[0],[x16]
00a4b5d8	ldr q2,[x1, #0x10]
00a4b5dc	ldr q3,[x1, #0x30]
00a4b5e0	mov x10,xzr
00a4b5e4	mov x12,xzr
00a4b5e8	mov x9,xzr
00a4b5ec	mov x11,xzr
00a4b5f0	mov x8,xzr
00a4b5f4	add x15,x1,#0x28
00a4b5f8	mov w16,#0x1
00a4b5fc	orr x17,x17,#0x8
00a4b600	add v1.2D,v0.2D,v1.2D
00a4b604	st1 {v0.D}[1],[x18]
00a4b608	add v0.2D,v3.2D,v2.2D
00a4b60c	mov x18,sp
00a4b610	str q1,[sp, #0x10]
00a4b614	str q0,[sp, #0x50]
00a4b618	mov x3,xzr
00a4b61c	mov x1,xzr
00a4b620	add x4,sp,#0x40
00a4b624	mov x5,x14
00a4b628	mov x6,x10
00a4b62c	lsl x7,x6,#0x3
00a4b630	and x20,x7,#0x7fffffff8
00a4b634	ldur x19,[x5, #-0x20]
00a4b638	ldr x21,[x2, x20#0x0]
00a4b63c	ldr x22,[x4], #0x8
00a4b640	ldr x20,[x13, x20#0x0]
00a4b644	add x7,x2,x7
00a4b648	ldr x23,[x5], #0x8
00a4b64c	ldr x7,[x7, #0x20]
00a4b650	umulh x24,x21,x19
00a4b654	mul x19,x21,x19
00a4b658	adds x3,x19,x3
00a4b65c	umulh x21,x20,x22
00a4b660	mul x20,x20,x22
00a4b664	adcs x1,x24,x1
00a4b668	adds x11,x20,x11
00a4b66c	umulh x22,x7,x23
00a4b670	mul x7,x7,x23
00a4b674	adcs x8,x21,x8
00a4b678	adds x12,x7,x12
00a4b67c	adcs x9,x22,x9
00a4b680	sub x6,x6,#0x1
00a4b684	cmn x6,#0x1
00a4b688	b.ne 0x00a4b62c
00a4b68c	cmp w16,#0x4
00a4b690	b.cs 0x00a4b70c
00a4b694	mov x5,xzr
00a4b698	add x4,x10,#0x4
00a4b69c	sub x6,x10,#0x3
00a4b6a0	mov x7,x15
00a4b6a4	mov x19,x17
00a4b6a8	add w20,w5,#0x7
00a4b6ac	ldur x21,[x7, #-0x20]
00a4b6b0	add w22,w5,#0x3
00a4b6b4	ldr x20,[x2, w20, UXTW #0x3]
00a4b6b8	lsl x22,x22,#0x3
00a4b6bc	ldr x23,[x19], #0x8
00a4b6c0	ldr x24,[x18, x22#0x0]
00a4b6c4	umulh x25,x20,x21
00a4b6c8	mul x20,x20,x21
00a4b6cc	ldr x21,[x7], #0x8
00a4b6d0	ldr x22,[x13, x22#0x0]
00a4b6d4	adds x3,x20,x3
00a4b6d8	umulh x20,x24,x23
00a4b6dc	mul x23,x24,x23
00a4b6e0	adcs x1,x25,x1
00a4b6e4	adds x11,x23,x11
00a4b6e8	umulh x24,x22,x21
00a4b6ec	mul x21,x22,x21
00a4b6f0	adcs x8,x20,x8
00a4b6f4	adds x12,x21,x12
00a4b6f8	adcs x9,x24,x9
00a4b6fc	sub x5,x5,#0x1
00a4b700	cmp x6,x5
00a4b704	b.ne 0x00a4b6a8
00a4b708	b 0x00a4b710
00a4b70c	add x4,x10,#0x4
00a4b710	subs x11,x11,x3
00a4b714	sbcs x8,x8,x1
00a4b718	adds x12,x12,x3
00a4b71c	adcs x9,x9,x1
00a4b720	and x1,x12,#0xffffffffffffff
00a4b724	str x1,[x0, x10, LSL #0x3]
00a4b728	add x10,x10,#0x1
00a4b72c	add x16,x16,#0x1
00a4b730	and x3,x11,#0xffffffffffffff
00a4b734	extr x11,x8,x11,#0x38
00a4b738	lsr x8,x8,#0x38
00a4b73c	extr x12,x9,x12,#0x38
00a4b740	lsr x9,x9,#0x38
00a4b744	add x17,x17,#0x8
00a4b748	cmp x10,#0x4
00a4b74c	add x15,x15,#0x8
00a4b750	str x3,[x0, x4, LSL #0x3]
00a4b754	b.ne 0x00a4b618
00a4b758	adds x10,x12,x11
00a4b75c	ldp x12,x13,[x0, #0x20]
00a4b760	adcs x9,x9,x8
00a4b764	ldp x20,x19,[sp, #0x90]
00a4b768	ldp x22,x21,[sp, #0x80]
00a4b76c	adds x10,x10,x12
00a4b770	ldp x14,x12,[x0]
00a4b774	adcs x9,x9,xzr
00a4b778	ldp x24,x23,[sp, #0x70]
00a4b77c	ldr x25,[sp, #0x60]
00a4b780	adds x11,x11,x14
00a4b784	adcs x8,x8,xzr
00a4b788	extr x9,x9,x10,#0x38
00a4b78c	extr x8,x8,x11,#0x38
00a4b790	and x14,x10,#0xffffffffffffff
00a4b794	add x9,x13,x9
00a4b798	and x10,x11,#0xffffffffffffff
00a4b79c	add x8,x12,x8
00a4b7a0	stp x14,x9,[x0, #0x20]
00a4b7a4	stp x10,x8,[x0]
00a4b7a8	add sp,sp,#0xa0
00a4b7ac	ret
