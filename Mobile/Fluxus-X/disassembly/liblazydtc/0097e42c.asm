; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::tellg @ 0097e42c
0097e42c	str x19,[sp, #-0x20]!
0097e430	stp x29,x30,[sp, #0x10]
0097e434	add x29,sp,#0x10
0097e438	ldr x8,[x0]
0097e43c	mov x19,x0
0097e440	ldur x8,[x8, #-0x18]
0097e444	add x0,x0,x8
0097e448	ldr w9,[x0, #0x20]
0097e44c	cbz w9,0x0097e464
0097e450	orr w1,w9,#0x4
0097e454	bl 0x00c30130
0097e458	mov x0,xzr
0097e45c	mov x1,#-0x1
0097e460	b 0x0097e4a4
0097e464	ldr x0,[x0, #0x88]
0097e468	cbz x0,0x0097e484
0097e46c	bl 0x00c30e50
0097e470	ldr x8,[x19]
0097e474	ldur x8,[x8, #-0x18]
0097e478	add x9,x19,x8
0097e47c	ldr w9,[x9, #0x20]
0097e480	cbnz w9,0x0097e458
0097e484	add x8,x19,x8
0097e488	ldr x0,[x8, #0x28]
0097e48c	ldr x8,[x0]
0097e490	ldr x8,[x8, #0x20]
0097e494	mov w2,#0x1
0097e498	mov w3,#0x8
0097e49c	mov x1,xzr
0097e4a0	blr x8
0097e4a4	ldp x29,x30,[sp, #0x10]
0097e4a8	ldr x19,[sp], #0x20
0097e4ac	ret
