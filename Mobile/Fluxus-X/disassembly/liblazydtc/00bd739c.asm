; std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::seekp @ 00bd739c
00bd739c	paciasp
00bd73a0	sub sp,sp,#0x40
00bd73a4	stp x29,x30,[sp, #0x10]
00bd73a8	str x21,[sp, #0x20]
00bd73ac	stp x20,x19,[sp, #0x30]
00bd73b0	add x29,sp,#0x10
00bd73b4	mov x19,x0
00bd73b8	mov x21,x1
00bd73bc	mov x0,sp
00bd73c0	mov x1,x19
00bd73c4	mov x20,x2
00bd73c8	bl 0x00c44040
00bd73cc	ldr x8,[x19]
00bd73d0	mov w10,#0x5
00bd73d4	ldur x8,[x8, #-0x18]
00bd73d8	add x8,x19,x8
00bd73dc	ldrb w9,[x8, #0x20]
00bd73e0	tst w9,w10
00bd73e4	b.ne 0x00bd7424
00bd73e8	ldr x0,[x8, #0x28]
00bd73ec	ldr x8,[x0]
00bd73f0	ldr x8,[x8, #0x28]
00bd73f4	mov x1,x21
00bd73f8	mov x2,x20
00bd73fc	mov w3,#0x10
00bd7400	blr x8
00bd7404	cmn x1,#0x1
00bd7408	b.ne 0x00bd7424
00bd740c	ldr x8,[x19]
00bd7410	ldur x8,[x8, #-0x18]
00bd7414	add x0,x19,x8
00bd7418	ldr w8,[x0, #0x20]
00bd741c	orr w1,w8,#0x4
00bd7420	bl 0x00c30130
00bd7424	mov x0,sp
00bd7428	bl 0x00c44050
00bd742c	mov x0,x19
00bd7430	ldp x20,x19,[sp, #0x30]
00bd7434	ldr x21,[sp, #0x20]
00bd7438	ldp x29,x30,[sp, #0x10]
00bd743c	add sp,sp,#0x40
00bd7440	autiasp
00bd7444	ret
