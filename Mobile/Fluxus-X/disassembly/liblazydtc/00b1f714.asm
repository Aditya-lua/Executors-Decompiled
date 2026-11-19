; ossl_default_provider_init @ 00b1f714
00b1f714	stp x24,x23,[sp, #-0x40]!
00b1f718	stp x22,x21,[sp, #0x10]
00b1f71c	mov x21,x0
00b1f720	mov x0,x1
00b1f724	stp x20,x19,[sp, #0x20]
00b1f728	stp x29,x30,[sp, #0x30]
00b1f72c	add x29,sp,#0x30
00b1f730	mov x19,x3
00b1f734	mov x20,x2
00b1f738	mov x22,x1
00b1f73c	bl 0x00c40f90
00b1f740	cbz w0,0x00b1f838
00b1f744	mov x0,x22
00b1f748	bl 0x00c41020
00b1f74c	cbz w0,0x00b1f838
00b1f750	adrp x9,0x77b000
00b1f754	mov x24,xzr
00b1f758	add x8,x22,#0x8
00b1f75c	add x9,x9,#0xbd4
00b1f760	adrp x10,0xd22000
00b1f764	adrp x11,0xd22000
00b1f768	b 0x00b1f770
00b1f76c	add x8,x8,#0x10
00b1f770	ldur w12,[x8, #-0x8]
00b1f774	cmp w12,#0x4
00b1f778	b.hi 0x00b1f76c
00b1f77c	ldrsw x12,[x9, x12, LSL #0x2]
00b1f780	add x12,x12,x9
00b1f784	br x12
00b1f788	ldr x12,[x8], #0x10
00b1f78c	str x12,[x10, #0x808]
00b1f790	b 0x00b1f770
00b1f794	ldr x12,[x8], #0x10
00b1f798	str x12,[x11, #0x810]
00b1f79c	b 0x00b1f770
00b1f7a0	ldr x24,[x8]
00b1f7a4	b 0x00b1f76c
00b1f7a8	cbz x24,0x00b1f81c
00b1f7ac	bl 0x00c40fc0
00b1f7b0	str x0,[x19]
00b1f7b4	cbz x0,0x00b1f824
00b1f7b8	bl 0x00c40f80
00b1f7bc	ldr x23,[x19]
00b1f7c0	cbz x0,0x00b1f828
00b1f7c4	mov x22,x0
00b1f7c8	mov x0,x21
00b1f7cc	blr x24
00b1f7d0	mov x1,x0
00b1f7d4	mov x0,x23
00b1f7d8	bl 0x00c40ff0
00b1f7dc	ldr x0,[x19]
00b1f7e0	mov x1,x21
00b1f7e4	bl 0x00c40fe0
00b1f7e8	ldr x0,[x19]
00b1f7ec	mov x1,x22
00b1f7f0	bl 0x00c40fd0
00b1f7f4	adrp x8,0xc84000
00b1f7f8	adrp x0,0xc84000
00b1f7fc	adrp x1,0xd22000
00b1f800	add x8,x8,#0x260
00b1f804	add x0,x0,#0x2c0
00b1f808	add x1,x1,#0x818
00b1f80c	str x8,[x20]
00b1f810	bl 0x00c41010
00b1f814	mov w0,#0x1
00b1f818	b 0x00b1f838
00b1f81c	mov w0,wzr
00b1f820	b 0x00b1f838
00b1f824	mov x23,xzr
00b1f828	mov x0,x23
00b1f82c	bl 0x00c40fa0
00b1f830	mov w0,wzr
00b1f834	str xzr,[x19]
00b1f838	ldp x29,x30,[sp, #0x30]
00b1f83c	ldp x20,x19,[sp, #0x20]
00b1f840	ldp x22,x21,[sp, #0x10]
00b1f844	ldp x24,x23,[sp], #0x40
00b1f848	ret
