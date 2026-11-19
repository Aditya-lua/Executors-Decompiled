; FUN_0086b5f8 @ 0086b5f8
0086b5f8	sub sp,sp,#0xd0
0086b5fc	stp x29,x30,[sp, #0x70]
0086b600	stp x28,x27,[sp, #0x80]
0086b604	stp x26,x25,[sp, #0x90]
0086b608	stp x24,x23,[sp, #0xa0]
0086b60c	stp x22,x21,[sp, #0xb0]
0086b610	stp x20,x19,[sp, #0xc0]
0086b614	add x29,sp,#0x70
0086b618	mrs x23,tpidr_el0
0086b61c	mov x22,x2
0086b620	mov w2,w1
0086b624	ldr x8,[x23, #0x28]
0086b628	mov x19,x0
0086b62c	add x0,sp,#0x30
0086b630	add x1,sp,#0x18
0086b634	mov x20,x3
0086b638	stur x8,[x29, #-0x8]
0086b63c	stp xzr,xzr,[sp, #0x18]
0086b640	bl 0x008521dc
0086b644	sub x8,x29,#0x20
0086b648	add x0,sp,#0x30
0086b64c	bl 0x008521fc
0086b650	ldr w2,[x22]
0086b654	stp xzr,xzr,[sp, #0x8]
0086b658	add x0,sp,#0x30
0086b65c	add x1,sp,#0x8
0086b660	bl 0x008521dc
0086b664	add x8,sp,#0x18
0086b668	add x0,sp,#0x30
0086b66c	bl 0x008521fc
0086b670	mov x21,x19
0086b674	ldr w26,[x22, #0x4]
0086b678	ldurb w25,[x29, #-0x20]
0086b67c	ldr w8,[x21, #0x94]!
0086b680	ldur x24,[x29, #-0x10]
0086b684	ldrb w28,[sp, #0x18]
0086b688	ldr x27,[sp, #0x28]
0086b68c	sub x0,x21,#0x4
0086b690	cmp w8,w26
0086b694	b.ne 0x0086b6fc
0086b698	ldr w22,[x22, #0x8]
0086b69c	add x8,sp,#0x30
0086b6a0	add x26,sp,#0x30
0086b6a4	bl 0x008521fc
0086b6a8	tst w28,#0x1
0086b6ac	add x8,sp,#0x18
0086b6b0	ldrb w9,[sp, #0x30]
0086b6b4	csinc x4,x27,x8,ne
0086b6b8	tst w25,#0x1
0086b6bc	sub x8,x29,#0x20
0086b6c0	ldr x10,[sp, #0x40]
0086b6c4	csinc x3,x24,x8,ne
0086b6c8	tst w9,#0x1
0086b6cc	adrp x8,0x2ab000
0086b6d0	add x8,x8,#0x32c
0086b6d4	csinc x6,x10,x26,ne
0086b6d8	cmp x20,#0x0
0086b6dc	csel x7,x8,x20,eq
0086b6e0	adrp x2,0x29f000
0086b6e4	add x2,x2,#0x223
0086b6e8	add w5,w22,#0x1
0086b6ec	mov x0,x19
0086b6f0	mov x1,x21
0086b6f4	bl 0x00860ecc
0086b6f8	b 0x0086b758
0086b6fc	add x8,sp,#0x30
0086b700	add x22,sp,#0x30
0086b704	bl 0x008521fc
0086b708	tst w28,#0x1
0086b70c	add x8,sp,#0x18
0086b710	ldrb w9,[sp, #0x30]
0086b714	csinc x4,x27,x8,ne
0086b718	tst w25,#0x1
0086b71c	sub x8,x29,#0x20
0086b720	ldr x10,[sp, #0x40]
0086b724	csinc x3,x24,x8,ne
0086b728	tst w9,#0x1
0086b72c	adrp x8,0x2ab000
0086b730	add x8,x8,#0x32c
0086b734	csinc x6,x10,x22,ne
0086b738	cmp x20,#0x0
0086b73c	csel x7,x8,x20,eq
0086b740	adrp x2,0x2da000
0086b744	add x2,x2,#0xfcf
0086b748	add w5,w26,#0x1
0086b74c	mov x0,x19
0086b750	mov x1,x21
0086b754	bl 0x00860ecc
0086b758	ldrb w8,[sp, #0x30]
0086b75c	tbnz w8,#0x0,0x0086b7b0
0086b760	ldrb w8,[sp, #0x18]
0086b764	tbnz w8,#0x0,0x0086b7c8
0086b768	ldurb w8,[x29, #-0x20]
0086b76c	tbz w8,#0x0,0x0086b780
0086b770	ldur x8,[x29, #-0x20]
0086b774	ldur x0,[x29, #-0x10]
0086b778	and x1,x8,#-0x2
0086b77c	bl 0x00c2fe80
0086b780	ldr x8,[x23, #0x28]
0086b784	ldur x9,[x29, #-0x8]
0086b788	cmp x8,x9
0086b78c	b.ne 0x0086b82c
0086b790	ldp x20,x19,[sp, #0xc0]
0086b794	ldp x22,x21,[sp, #0xb0]
0086b798	ldp x24,x23,[sp, #0xa0]
0086b79c	ldp x26,x25,[sp, #0x90]
0086b7a0	ldp x28,x27,[sp, #0x80]
0086b7a4	ldp x29,x30,[sp, #0x70]
0086b7a8	add sp,sp,#0xd0
0086b7ac	ret
0086b7b0	ldr x8,[sp, #0x30]
0086b7b4	ldr x0,[sp, #0x40]
0086b7b8	and x1,x8,#-0x2
0086b7bc	bl 0x00c2fe80
0086b7c0	ldrb w8,[sp, #0x18]
0086b7c4	tbz w8,#0x0,0x0086b768
0086b7c8	ldr x8,[sp, #0x18]
0086b7cc	ldr x0,[sp, #0x28]
0086b7d0	and x1,x8,#-0x2
0086b7d4	bl 0x00c2fe80
0086b7d8	ldurb w8,[x29, #-0x20]
0086b7dc	tbnz w8,#0x0,0x0086b770
0086b7e0	b 0x0086b780
0086b82c	bl 0x00c2fec0
