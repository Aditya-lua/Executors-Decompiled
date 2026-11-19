; FUN_00c1f4e4 @ 00c1f4e4
00c1f4e4	paciasp
00c1f4e8	stp x29,x30,[sp, #-0x30]!
00c1f4ec	stp x22,x21,[sp, #0x10]
00c1f4f0	stp x20,x19,[sp, #0x20]
00c1f4f4	mov x29,sp
00c1f4f8	ldr x8,[x0, #0x18]
00c1f4fc	mov x20,x0
00c1f500	mov x19,x1
00c1f504	cbz x8,0x00c1f5b8
00c1f508	ldp x8,x9,[x19, #0x8]
00c1f50c	ldr x0,[x19]
00c1f510	ldr w21,[x19, #0x20]
00c1f514	str wzr,[x19, #0x20]
00c1f518	add x10,x8,#0x1
00c1f51c	cmp x10,x9
00c1f520	b.ls 0x00c1f548
00c1f524	lsl x9,x9,#0x1
00c1f528	add x8,x8,#0x3e1
00c1f52c	cmp x9,x8
00c1f530	csel x1,x9,x8,hi
00c1f534	str x1,[x19, #0x10]
00c1f538	bl 0x00c30950
00c1f53c	str x0,[x19]
00c1f540	cbz x0,0x00c1f828
00c1f544	ldr x8,[x19, #0x8]
00c1f548	mov w9,#0x3c
00c1f54c	strb w9,[x0, x8]
00c1f550	ldr x8,[x19, #0x8]
00c1f554	add x8,x8,#0x1
00c1f558	str x8,[x19, #0x8]
00c1f55c	add x0,x20,#0x10
00c1f560	mov x1,x19
00c1f564	bl 0x00c1b464
00c1f568	ldp x8,x9,[x19, #0x8]
00c1f56c	ldr x0,[x19]
00c1f570	add x10,x8,#0x1
00c1f574	cmp x10,x9
00c1f578	b.ls 0x00c1f5a0
00c1f57c	lsl x9,x9,#0x1
00c1f580	add x8,x8,#0x3e1
00c1f584	cmp x9,x8
00c1f588	csel x1,x9,x8,hi
00c1f58c	str x1,[x19, #0x10]
00c1f590	bl 0x00c30950
00c1f594	str x0,[x19]
00c1f598	cbz x0,0x00c1f830
00c1f59c	ldr x8,[x19, #0x8]
00c1f5a0	mov w9,#0x3e
00c1f5a4	strb w9,[x0, x8]
00c1f5a8	ldr x8,[x19, #0x8]
00c1f5ac	str w21,[x19, #0x20]
00c1f5b0	add x8,x8,#0x1
00c1f5b4	str x8,[x19, #0x8]
00c1f5b8	ldr x9,[x20, #0x20]
00c1f5bc	ldr x8,[x19, #0x8]
00c1f5c0	adrp x22,0x2da000
00c1f5c4	add x22,x22,#0xe28
00c1f5c8	cbz x9,0x00c1f6ac
00c1f5cc	ldr x9,[x19, #0x10]
00c1f5d0	add x10,x8,#0xa
00c1f5d4	ldr x0,[x19]
00c1f5d8	cmp x10,x9
00c1f5dc	b.ls 0x00c1f604
00c1f5e0	lsl x9,x9,#0x1
00c1f5e4	add x8,x8,#0x3ea
00c1f5e8	cmp x9,x8
00c1f5ec	csel x1,x9,x8,hi
00c1f5f0	str x1,[x19, #0x10]
00c1f5f4	bl 0x00c30950
00c1f5f8	str x0,[x19]
00c1f5fc	cbz x0,0x00c1f82c
00c1f600	ldr x8,[x19, #0x8]
00c1f604	ldr x9,[x22]
00c1f608	add x8,x0,x8
00c1f60c	mov w10,#0x2073
00c1f610	strh w10,[x8, #0x8]
00c1f614	mov x1,x19
00c1f618	str x9,[x8]
00c1f61c	ldr x8,[x19, #0x8]
00c1f620	ldr x21,[x20, #0x20]
00c1f624	add x8,x8,#0xa
00c1f628	ldr x9,[x21]
00c1f62c	mov x0,x21
00c1f630	str x8,[x19, #0x8]
00c1f634	ldr x8,[x9, #0x20]
00c1f638	blr x8
00c1f63c	ldurh w8,[x21, #0x9]
00c1f640	and w8,w8,#0xc0
00c1f644	cmp w8,#0x40
00c1f648	b.eq 0x00c1f660
00c1f64c	ldr x8,[x21]
00c1f650	mov x0,x21
00c1f654	mov x1,x19
00c1f658	ldr x8,[x8, #0x28]
00c1f65c	blr x8
00c1f660	ldp x8,x9,[x19, #0x8]
00c1f664	ldr x0,[x19]
00c1f668	add x10,x8,#0x1
00c1f66c	cmp x10,x9
00c1f670	b.ls 0x00c1f698
00c1f674	lsl x9,x9,#0x1
00c1f678	add x8,x8,#0x3e1
00c1f67c	cmp x9,x8
00c1f680	csel x1,x9,x8,hi
00c1f684	str x1,[x19, #0x10]
00c1f688	bl 0x00c30950
00c1f68c	str x0,[x19]
00c1f690	cbz x0,0x00c1f834
00c1f694	ldr x8,[x19, #0x8]
00c1f698	mov w9,#0x20
00c1f69c	strb w9,[x0, x8]
00c1f6a0	ldr x8,[x19, #0x8]
00c1f6a4	add x8,x8,#0x1
00c1f6a8	str x8,[x19, #0x8]
00c1f6ac	ldr w11,[x19, #0x20]
00c1f6b0	ldr x10,[x19, #0x10]
00c1f6b4	add x9,x8,#0x1
00c1f6b8	ldr x0,[x19]
00c1f6bc	add w11,w11,#0x1
00c1f6c0	cmp x9,x10
00c1f6c4	str w11,[x19, #0x20]
00c1f6c8	b.ls 0x00c1f6f4
00c1f6cc	lsl x9,x10,#0x1
00c1f6d0	add x8,x8,#0x3e1
00c1f6d4	cmp x9,x8
00c1f6d8	csel x1,x9,x8,hi
00c1f6dc	str x1,[x19, #0x10]
00c1f6e0	bl 0x00c30950
00c1f6e4	str x0,[x19]
00c1f6e8	cbz x0,0x00c1f820
00c1f6ec	ldr x8,[x19, #0x8]
00c1f6f0	add x9,x8,#0x1
00c1f6f4	str x9,[x19, #0x8]
00c1f6f8	mov w9,#0x28
00c1f6fc	mov x1,x19
00c1f700	strb w9,[x0, x8]
00c1f704	add x0,x20,#0x28
00c1f708	bl 0x00c1b464
00c1f70c	ldp x8,x10,[x19, #0x8]
00c1f710	ldr w11,[x19, #0x20]
00c1f714	ldr x0,[x19]
00c1f718	sub w11,w11,#0x1
00c1f71c	add x9,x8,#0x1
00c1f720	str w11,[x19, #0x20]
00c1f724	cmp x9,x10
00c1f728	b.ls 0x00c1f754
00c1f72c	lsl x9,x10,#0x1
00c1f730	add x8,x8,#0x3e1
00c1f734	cmp x9,x8
00c1f738	csel x1,x9,x8,hi
00c1f73c	str x1,[x19, #0x10]
00c1f740	bl 0x00c30950
00c1f744	str x0,[x19]
00c1f748	cbz x0,0x00c1f824
00c1f74c	ldr x8,[x19, #0x8]
00c1f750	add x9,x8,#0x1
00c1f754	str x9,[x19, #0x8]
00c1f758	mov w9,#0x29
00c1f75c	strb w9,[x0, x8]
00c1f760	ldr x8,[x20, #0x38]
00c1f764	cbz x8,0x00c1f7e8
00c1f768	ldp x8,x9,[x19, #0x8]
00c1f76c	ldr x0,[x19]
00c1f770	add x10,x8,#0xa
00c1f774	cmp x10,x9
00c1f778	b.ls 0x00c1f7a0
00c1f77c	lsl x9,x9,#0x1
00c1f780	add x8,x8,#0x3ea
00c1f784	cmp x9,x8
00c1f788	csel x1,x9,x8,hi
00c1f78c	str x1,[x19, #0x10]
00c1f790	bl 0x00c30950
00c1f794	str x0,[x19]
00c1f798	cbz x0,0x00c1f838
00c1f79c	ldr x8,[x19, #0x8]
00c1f7a0	ldr x9,[x22]
00c1f7a4	add x8,x0,x8
00c1f7a8	mov w10,#0x2073
00c1f7ac	strh w10,[x8, #0x8]
00c1f7b0	mov x1,x19
00c1f7b4	str x9,[x8]
00c1f7b8	ldr x8,[x19, #0x8]
00c1f7bc	ldr x20,[x20, #0x38]
00c1f7c0	add x8,x8,#0xa
00c1f7c4	ldr x9,[x20]
00c1f7c8	mov x0,x20
00c1f7cc	str x8,[x19, #0x8]
00c1f7d0	ldr x8,[x9, #0x20]
00c1f7d4	blr x8
00c1f7d8	ldurh w8,[x20, #0x9]
00c1f7dc	and w8,w8,#0xc0
00c1f7e0	cmp w8,#0x40
00c1f7e4	b.ne 0x00c1f7fc
00c1f7e8	ldp x20,x19,[sp, #0x20]
00c1f7ec	ldp x22,x21,[sp, #0x10]
00c1f7f0	ldp x29,x30,[sp], #0x30
00c1f7f4	autiasp
00c1f7f8	ret
00c1f7fc	ldr x8,[x20]
00c1f800	mov x0,x20
00c1f804	ldr x16,[x8, #0x28]
00c1f808	mov x1,x19
00c1f80c	ldp x20,x19,[sp, #0x20]
00c1f810	ldp x22,x21,[sp, #0x10]
00c1f814	ldp x29,x30,[sp], #0x30
00c1f818	autiasp
00c1f81c	br x16
00c1f820	bl 0x00c30b40
00c1f824	bl 0x00c30b40
00c1f828	bl 0x00c30b40
00c1f82c	bl 0x00c30b40
00c1f830	bl 0x00c30b40
00c1f834	bl 0x00c30b40
00c1f838	bl 0x00c30b40
