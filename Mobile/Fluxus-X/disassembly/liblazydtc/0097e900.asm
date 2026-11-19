; std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::imbue @ 0097e900
0097e900	stp x20,x19,[sp, #-0x20]!
0097e904	stp x29,x30,[sp, #0x10]
0097e908	add x29,sp,#0x10
0097e90c	ldr x8,[x0]
0097e910	mov x19,x0
0097e914	mov x20,x1
0097e918	ldr x8,[x8, #0x30]
0097e91c	blr x8
0097e920	adrp x1,0xcb4000
0097e924	ldr x1,[x1, #0xf70]
0097e928	mov x0,x20
0097e92c	bl 0x00c30080
0097e930	str x0,[x19, #0x80]
0097e934	ldr x8,[x0]
0097e938	ldrb w20,[x19, #0xa2]
0097e93c	ldr x8,[x8, #0x38]
0097e940	blr x8
0097e944	and w8,w0,#0x1
0097e948	cmp w20,w8
0097e94c	strb w8,[x19, #0xa2]
0097e950	b.eq 0x0097e9e4
0097e954	ldrb w8,[x19, #0xa0]
0097e958	movi v0.2D,#0x0
0097e95c	stp q0,q0,[x19, #0x20]
0097e960	str q0,[x19, #0x10]
0097e964	tbz w0,#0x0,0x0097e998
0097e968	cbz w8,0x0097e978
0097e96c	ldr x0,[x19, #0x40]
0097e970	cbz x0,0x0097e978
0097e974	bl 0x00c333e0
0097e978	ldrb w8,[x19, #0xa1]
0097e97c	ldp x9,x10,[x19, #0x68]
0097e980	strb wzr,[x19, #0xa1]
0097e984	str xzr,[x19, #0x70]
0097e988	strb w8,[x19, #0xa0]
0097e98c	stp x10,xzr,[x19, #0x60]
0097e990	str x9,[x19, #0x40]
0097e994	b 0x0097e9e4
0097e998	cbz w8,0x0097e9b8
0097e99c	ldr x0,[x19, #0x60]
0097e9a0	str x0,[x19, #0x70]
0097e9a4	bl 0x00c333f0
0097e9a8	mov w8,#0x1
0097e9ac	str x0,[x19, #0x68]
0097e9b0	strb w8,[x19, #0xa1]
0097e9b4	b 0x0097e9e4
0097e9b8	ldr x8,[x19, #0x40]
0097e9bc	add x9,x19,#0x58
0097e9c0	cmp x8,x9
0097e9c4	b.eq 0x0097e99c
0097e9c8	ldr x0,[x19, #0x60]
0097e9cc	strb wzr,[x19, #0xa1]
0097e9d0	stp x8,x0,[x19, #0x68]
0097e9d4	bl 0x00c333f0
0097e9d8	mov w8,#0x1
0097e9dc	str x0,[x19, #0x40]
0097e9e0	strb w8,[x19, #0xa0]
0097e9e4	ldp x29,x30,[sp, #0x10]
0097e9e8	ldp x20,x19,[sp], #0x20
0097e9ec	ret
