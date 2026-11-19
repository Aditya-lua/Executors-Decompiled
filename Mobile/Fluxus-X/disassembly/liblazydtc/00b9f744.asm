; FUN_00b9f744 @ 00b9f744
00b9f744	sub sp,sp,#0x100
00b9f748	stp x28,x27,[sp, #0xa0]
00b9f74c	stp x26,x25,[sp, #0xb0]
00b9f750	stp x24,x23,[sp, #0xc0]
00b9f754	stp x22,x21,[sp, #0xd0]
00b9f758	stp x20,x19,[sp, #0xe0]
00b9f75c	stp x29,x30,[sp, #0xf0]
00b9f760	add x29,sp,#0xf0
00b9f764	mrs x27,tpidr_el0
00b9f768	ldr x8,[x27, #0x28]
00b9f76c	mov w19,w0
00b9f770	mov w0,w5
00b9f774	mov w26,w6
00b9f778	mov w20,w5
00b9f77c	mov x21,x4
00b9f780	mov w22,w3
00b9f784	mov x23,x2
00b9f788	mov x24,x1
00b9f78c	stur x8,[x29, #-0x60]
00b9f790	bl 0x00c30270
00b9f794	mov x25,x0
00b9f798	cbz x0,0x00b9f8ac
00b9f79c	sxtw x26,w26
00b9f7a0	str x27,[sp]
00b9f7a4	mov w27,#0x1
00b9f7a8	add x8,x21,x26
00b9f7ac	str x8,[sp, #0x8]
00b9f7b0	cbz w19,0x00b9f7c8
00b9f7b4	adrp x0,0x2b6000
00b9f7b8	add x0,x0,#0xac1
00b9f7bc	mov x1,x24
00b9f7c0	mov w2,w27
00b9f7c4	bl 0x00c41af0
00b9f7c8	add x0,sp,#0x30
00b9f7cc	bl 0x00c30260
00b9f7d0	add x0,sp,#0x30
00b9f7d4	mov x1,x25
00b9f7d8	bl 0x00c30280
00b9f7dc	mov w28,w0
00b9f7e0	cbnz w0,0x00b9f8b4
00b9f7e4	add x0,sp,#0x30
00b9f7e8	mov w3,#0x1
00b9f7ec	mov x1,x23
00b9f7f0	mov w2,w22
00b9f7f4	bl 0x00c302a0
00b9f7f8	mov w28,w0
00b9f7fc	cbz w0,0x00b9f834
00b9f800	cmn w28,#0x72
00b9f804	mov w9,#0xffff9f80
00b9f808	cset w8,eq
00b9f80c	cmp w28,w9
00b9f810	cset w9,eq
00b9f814	cmp w20,#0x3
00b9f818	b.ne 0x00b9f8b4
00b9f81c	orr w8,w8,w9
00b9f820	cbz w8,0x00b9f8b4
00b9f824	cbz w19,0x00b9f88c
00b9f828	adrp x0,0x77c000
00b9f82c	add x0,x0,#0x884
00b9f830	b 0x00b9f888
00b9f834	add x0,sp,#0x30
00b9f838	add x1,sp,#0x20
00b9f83c	add x2,sp,#0x10
00b9f840	bl 0x00b9ee70
00b9f844	mov w28,w0
00b9f848	cbnz w0,0x00b9f91c
00b9f84c	add x0,sp,#0x20
00b9f850	mov x1,x21
00b9f854	mov x2,x26
00b9f858	bl 0x00c300b0
00b9f85c	mov w28,w0
00b9f860	cbnz w0,0x00b9f904
00b9f864	ldr x1,[sp, #0x8]
00b9f868	add x0,sp,#0x10
00b9f86c	mov x2,x26
00b9f870	bl 0x00c300b0
00b9f874	mov w28,w0
00b9f878	cbnz w0,0x00b9f904
00b9f87c	cbz w19,0x00b9f88c
00b9f880	adrp x0,0x77c000
00b9f884	add x0,x0,#0x87c
00b9f888	bl 0x00c30760
00b9f88c	add x0,sp,#0x30
00b9f890	bl 0x00c30290
00b9f894	cmp w27,#0x4
00b9f898	add w27,w27,#0x1
00b9f89c	b.cc 0x00b9f7b0
00b9f8a0	ldr x27,[sp]
00b9f8a4	mov w28,wzr
00b9f8a8	b 0x00b9f8d0
00b9f8ac	mov w28,#0xffff9f80
00b9f8b0	b 0x00b9f8d0
00b9f8b4	cbz w19,0x00b9f8c4
00b9f8b8	adrp x0,0x746000
00b9f8bc	add x0,x0,#0x330
00b9f8c0	bl 0x00c30760
00b9f8c4	ldr x27,[sp]
00b9f8c8	add x0,sp,#0x30
00b9f8cc	bl 0x00c30290
00b9f8d0	ldr x8,[x27, #0x28]
00b9f8d4	ldur x9,[x29, #-0x60]
00b9f8d8	cmp x8,x9
00b9f8dc	b.ne 0x00b9f92c
00b9f8e0	mov w0,w28
00b9f8e4	ldp x29,x30,[sp, #0xf0]
00b9f8e8	ldp x20,x19,[sp, #0xe0]
00b9f8ec	ldp x22,x21,[sp, #0xd0]
00b9f8f0	ldp x24,x23,[sp, #0xc0]
00b9f8f4	ldp x26,x25,[sp, #0xb0]
00b9f8f8	ldp x28,x27,[sp, #0xa0]
00b9f8fc	add sp,sp,#0x100
00b9f900	ret
00b9f904	ldr x27,[sp]
00b9f908	cbz w19,0x00b9f8c8
00b9f90c	adrp x0,0x77c000
00b9f910	add x0,x0,#0x854
00b9f914	bl 0x00c30760
00b9f918	b 0x00b9f8c8
00b9f91c	cbz w19,0x00b9f8c4
00b9f920	adrp x0,0x77c000
00b9f924	add x0,x0,#0x854
00b9f928	b 0x00b9f8c0
00b9f92c	bl 0x00c2fec0
