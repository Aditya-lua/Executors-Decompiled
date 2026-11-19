; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::operator>> @ 00977028
00977028	sub sp,sp,#0x50
0097702c	str x21,[sp, #0x20]
00977030	stp x20,x19,[sp, #0x30]
00977034	stp x29,x30,[sp, #0x40]
00977038	add x29,sp,#0x40
0097703c	mrs x21,tpidr_el0
00977040	ldr x8,[x21, #0x28]
00977044	mov x20,x1
00977048	mov x19,x0
0097704c	str x8,[sp, #0x18]
00977050	add x0,sp,#0x10
00977054	mov x1,x19
00977058	mov w2,wzr
0097705c	bl 0x00c32f70
00977060	ldrb w8,[sp, #0x10]
00977064	cbz w8,0x009770dc
00977068	str wzr,[sp, #0xc]
0097706c	ldr x8,[x19]
00977070	ldur x8,[x8, #-0x18]
00977074	add x0,x19,x8
00977078	mov x8,sp
0097707c	bl 0x00c30070
00977080	adrp x1,0xcb4000
00977084	ldr x1,[x1, #0xf38]
00977088	mov x0,sp
0097708c	bl 0x00c30080
00977090	ldr x8,[x19]
00977094	ldr x9,[x0]
00977098	ldur x8,[x8, #-0x18]
0097709c	add x3,x19,x8
009770a0	ldr x1,[x3, #0x28]
009770a4	ldr x8,[x9, #0x40]
009770a8	add x4,sp,#0xc
009770ac	mov x2,xzr
009770b0	mov x5,x20
009770b4	blr x8
009770b8	mov x0,sp
009770bc	bl 0x00c30090
009770c0	ldr x8,[x19]
009770c4	ldur x8,[x8, #-0x18]
009770c8	add x0,x19,x8
009770cc	ldr w8,[sp, #0xc]
009770d0	ldr w9,[x0, #0x20]
009770d4	orr w1,w9,w8
009770d8	bl 0x00c30130
009770dc	ldr x8,[x21, #0x28]
009770e0	ldr x9,[sp, #0x18]
009770e4	cmp x8,x9
009770e8	b.ne 0x00977104
009770ec	mov x0,x19
009770f0	ldp x29,x30,[sp, #0x40]
009770f4	ldp x20,x19,[sp, #0x30]
009770f8	ldr x21,[sp, #0x20]
009770fc	add sp,sp,#0x50
00977100	ret
00977104	bl 0x00c2fec0
