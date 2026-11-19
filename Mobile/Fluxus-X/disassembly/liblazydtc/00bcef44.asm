; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::operator>> @ 00bcef44
00bcef44	paciasp
00bcef48	sub sp,sp,#0x40
00bcef4c	stp x29,x30,[sp, #0x10]
00bcef50	stp x22,x21,[sp, #0x20]
00bcef54	stp x20,x19,[sp, #0x30]
00bcef58	add x29,sp,#0x10
00bcef5c	mov x19,x0
00bcef60	mov x20,x1
00bcef64	str xzr,[x0, #0x8]
00bcef68	sub x0,x29,#0x4
00bcef6c	mov x1,x19
00bcef70	mov w2,#0x1
00bcef74	bl 0x00c30140
00bcef78	ldurb w8,[x29, #-0x4]
00bcef7c	cmp w8,#0x1
00bcef80	b.ne 0x00bcf084
00bcef84	cbz x20,0x00bcf048
00bcef88	add x21,x19,#0x28
00bcef8c	mov x22,#0x7fffffffffffffff
00bcef90	b 0x00bcefb4
00bcef94	ldr x8,[x19]
00bcef98	ldur x8,[x8, #-0x18]
00bcef9c	ldr x0,[x21, x8#0x0]
00bcefa0	ldp x8,x9,[x0, #0x18]
00bcefa4	cmp x8,x9
00bcefa8	b.eq 0x00bcf038
00bcefac	add x8,x8,#0x1
00bcefb0	str x8,[x0, #0x18]
00bcefb4	ldr x8,[x19]
00bcefb8	ldur x8,[x8, #-0x18]
00bcefbc	ldr x0,[x21, x8#0x0]
00bcefc0	ldp x8,x9,[x0, #0x18]
00bcefc4	cmp x8,x9
00bcefc8	b.eq 0x00bcefd4
00bcefcc	ldrb w0,[x8]
00bcefd0	b 0x00bcefe8
00bcefd4	ldr x8,[x0]
00bcefd8	ldr x8,[x8, #0x48]
00bcefdc	blr x8
00bcefe0	cmn w0,#0x1
00bcefe4	b.eq 0x00bcf050
00bcefe8	ldp x8,x9,[x20, #0x30]
00bcefec	cmp x8,x9
00bceff0	b.eq 0x00bcf004
00bceff4	add x9,x8,#0x1
00bceff8	str x9,[x20, #0x30]
00bceffc	strb w0,[x8]
00bcf000	b 0x00bcf020
00bcf004	ldr x8,[x20]
00bcf008	ldr x8,[x8, #0x68]
00bcf00c	and w1,w0,#0xff
00bcf010	mov x0,x20
00bcf014	blr x8
00bcf018	cmn w0,#0x1
00bcf01c	b.eq 0x00bcf058
00bcf020	ldr x8,[x19, #0x8]
00bcf024	cmp x8,x22
00bcf028	b.eq 0x00bcef94
00bcf02c	add x8,x8,#0x1
00bcf030	str x8,[x19, #0x8]
00bcf034	b 0x00bcef94
00bcf038	ldr x8,[x0]
00bcf03c	ldr x8,[x8, #0x50]
00bcf040	blr x8
00bcf044	b 0x00bcefb4
00bcf048	mov w20,#0x4
00bcf04c	b 0x00bcf06c
00bcf050	mov w8,#0x2
00bcf054	b 0x00bcf05c
00bcf058	mov w8,wzr
00bcf05c	ldr x9,[x19, #0x8]
00bcf060	orr w10,w8,#0x4
00bcf064	cmp x9,#0x0
00bcf068	csel w20,w10,w8,eq
00bcf06c	ldr x8,[x19]
00bcf070	ldur x8,[x8, #-0x18]
00bcf074	add x0,x19,x8
00bcf078	ldr w8,[x0, #0x20]
00bcf07c	orr w1,w8,w20
00bcf080	bl 0x00c30130
00bcf084	mov x0,x19
00bcf088	ldp x20,x19,[sp, #0x30]
00bcf08c	ldp x22,x21,[sp, #0x20]
00bcf090	ldp x29,x30,[sp, #0x10]
00bcf094	add sp,sp,#0x40
00bcf098	autiasp
00bcf09c	ret
