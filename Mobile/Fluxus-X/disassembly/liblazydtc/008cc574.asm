; FUN_008cc574 @ 008cc574
008cc574	sub sp,sp,#0x70
008cc578	stp x29,x30,[sp, #0x20]
008cc57c	str x25,[sp, #0x30]
008cc580	stp x24,x23,[sp, #0x40]
008cc584	stp x22,x21,[sp, #0x50]
008cc588	stp x20,x19,[sp, #0x60]
008cc58c	add x29,sp,#0x20
008cc590	mrs x23,tpidr_el0
008cc594	mov x20,x3
008cc598	mov x21,x2
008cc59c	ldr x8,[x23, #0x28]
008cc5a0	mov x19,x1
008cc5a4	mov x22,x0
008cc5a8	stur x8,[x29, #-0x8]
008cc5ac	ldr w8,[x2, #0xc]
008cc5b0	ldr w11,[x3, #0xc]
008cc5b4	cmp w8,#0x4
008cc5b8	csel x10,x2,xzr,eq
008cc5bc	cmp w11,#0x4
008cc5c0	csel x9,x3,xzr,eq
008cc5c4	cbz x10,0x008cc604
008cc5c8	cbz x9,0x008cc604
008cc5cc	ldr s0,[x10]
008cc5d0	ldr s1,[x9]
008cc5d4	mov w8,#0x4
008cc5d8	fsub s0,s0,s1
008cc5dc	str s0,[x19]
008cc5e0	ldr s0,[x10, #0x4]
008cc5e4	ldr s1,[x9, #0x4]
008cc5e8	fsub s0,s0,s1
008cc5ec	str s0,[x19, #0x4]
008cc5f0	ldr s0,[x10, #0x8]
008cc5f4	ldr s1,[x9, #0x8]
008cc5f8	fsub s0,s0,s1
008cc5fc	str s0,[x19, #0x8]
008cc600	b 0x008cc724
008cc604	cbz x10,0x008cc62c
008cc608	cmp w11,#0x3
008cc60c	b.eq 0x008cc65c
008cc610	cmp w11,#0x5
008cc614	b.ne 0x008cc65c
008cc618	ldr x8,[x20]
008cc61c	add x1,sp,#0x10
008cc620	add x0,x8,#0x18
008cc624	bl 0x008b93c8
008cc628	b 0x008cc65c
008cc62c	cmp w8,#0x3
008cc630	b.eq 0x008cc65c
008cc634	cbz x9,0x008cc65c
008cc638	cmp w8,#0x5
008cc63c	b.ne 0x008cc65c
008cc640	ldr x8,[x21]
008cc644	add x1,sp,#0x10
008cc648	add x0,x8,#0x18
008cc64c	bl 0x008b93c8
008cc650	cbz w0,0x008cc65c
008cc654	ldr d0,[sp, #0x10]
008cc658	str d0,[sp, #0x8]
008cc65c	ldr w8,[x21, #0xc]
008cc660	mov x24,x21
008cc664	cmp w8,#0x3
008cc668	b.eq 0x008cc694
008cc66c	cmp w8,#0x5
008cc670	b.ne 0x008cc6c0
008cc674	ldr x8,[x21]
008cc678	add x1,sp,#0x10
008cc67c	add x0,x8,#0x18
008cc680	bl 0x008b93c8
008cc684	cbz w0,0x008cc6c0
008cc688	ldr d0,[sp, #0x10]
008cc68c	add x24,sp,#0x8
008cc690	str d0,[sp, #0x8]
008cc694	ldr w8,[x20, #0xc]
008cc698	cmp w8,#0x3
008cc69c	b.eq 0x008cc70c
008cc6a0	cmp w8,#0x5
008cc6a4	b.ne 0x008cc6c0
008cc6a8	ldr x8,[x20]
008cc6ac	add x1,sp,#0x10
008cc6b0	add x25,sp,#0x10
008cc6b4	add x0,x8,#0x18
008cc6b8	bl 0x008b93c8
008cc6bc	cbnz w0,0x008cc710
008cc6c0	mov x0,x22
008cc6c4	mov x1,x21
008cc6c8	mov w2,#0x9
008cc6cc	bl 0x008be028
008cc6d0	ldr w8,[x0, #0xc]
008cc6d4	cbnz w8,0x008cc6f0
008cc6d8	mov x0,x22
008cc6dc	mov x1,x20
008cc6e0	mov w2,#0x9
008cc6e4	bl 0x008be028
008cc6e8	ldr w8,[x0, #0xc]
008cc6ec	cbz w8,0x008cc754
008cc6f0	mov x2,x0
008cc6f4	mov x0,x22
008cc6f8	mov x1,x19
008cc6fc	mov x3,x21
008cc700	mov x4,x20
008cc704	bl 0x008cb070
008cc708	b 0x008cc728
008cc70c	mov x25,x20
008cc710	ldr d0,[x25]
008cc714	ldr d1,[x24]
008cc718	mov w8,#0x3
008cc71c	fsub d0,d1,d0
008cc720	str d0,[x19]
008cc724	str w8,[x19, #0xc]
008cc728	ldr x8,[x23, #0x28]
008cc72c	ldur x9,[x29, #-0x8]
008cc730	cmp x8,x9
008cc734	b.ne 0x008cc778
008cc738	ldp x20,x19,[sp, #0x60]
008cc73c	ldr x25,[sp, #0x30]
008cc740	ldp x22,x21,[sp, #0x50]
008cc744	ldp x24,x23,[sp, #0x40]
008cc748	ldp x29,x30,[sp, #0x20]
008cc74c	add sp,sp,#0x70
008cc750	ret
008cc754	ldr x8,[x23, #0x28]
008cc758	ldur x9,[x29, #-0x8]
008cc75c	cmp x8,x9
008cc760	b.ne 0x008cc778
008cc764	mov x0,x22
008cc768	mov x1,x21
008cc76c	mov x2,x20
008cc770	mov w3,#0x9
008cc774	bl 0x008b3afc
008cc778	bl 0x00c2fec0
