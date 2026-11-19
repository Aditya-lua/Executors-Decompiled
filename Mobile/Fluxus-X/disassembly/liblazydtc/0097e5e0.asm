; std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::basic_filebuf @ 0097e5e0
0097e5e0	sub sp,sp,#0x50
0097e5e4	str x23,[sp, #0x10]
0097e5e8	stp x22,x21,[sp, #0x20]
0097e5ec	stp x20,x19,[sp, #0x30]
0097e5f0	stp x29,x30,[sp, #0x40]
0097e5f4	add x29,sp,#0x40
0097e5f8	mrs x23,tpidr_el0
0097e5fc	adrp x22,0xcb4000
0097e600	ldr x8,[x23, #0x28]
0097e604	ldr x22,[x22, #0xa08]
0097e608	add x20,x0,#0x8
0097e60c	mov x19,x0
0097e610	str x8,[sp, #0x8]
0097e614	add x9,x22,#0x10
0097e618	str x9,[x0]
0097e61c	mov x0,x20
0097e620	bl 0x00c30480
0097e624	adrp x8,0xcb4000
0097e628	ldr x8,[x8, #0xf68]
0097e62c	movi v0.2D,#0x0
0097e630	add x0,x19,#0x60
0097e634	mov w2,#0x43
0097e638	add x8,x8,#0x10
0097e63c	mov w1,wzr
0097e640	stp q0,q0,[x19, #0x20]
0097e644	str q0,[x19, #0x10]
0097e648	stur q0,[x19, #0x48]
0097e64c	str x8,[x19]
0097e650	str xzr,[x19, #0x40]
0097e654	bl 0x00c301c0
0097e658	mov x0,sp
0097e65c	mov x1,x20
0097e660	bl 0x00c30660
0097e664	adrp x1,0xcb4000
0097e668	ldr x1,[x1, #0xf70]
0097e66c	mov x0,sp
0097e670	bl 0x00c333b0
0097e674	mov w21,w0
0097e678	mov x0,sp
0097e67c	bl 0x00c30090
0097e680	tbz w21,#0x0,0x0097e6c4
0097e684	mov x0,sp
0097e688	mov x1,x20
0097e68c	bl 0x00c30660
0097e690	adrp x1,0xcb4000
0097e694	ldr x1,[x1, #0xf70]
0097e698	mov x0,sp
0097e69c	bl 0x00c30080
0097e6a0	str x0,[x19, #0x80]
0097e6a4	mov x0,sp
0097e6a8	bl 0x00c30090
0097e6ac	ldr x0,[x19, #0x80]
0097e6b0	ldr x8,[x0]
0097e6b4	ldr x8,[x8, #0x38]
0097e6b8	blr x8
0097e6bc	and w8,w0,#0x1
0097e6c0	strb w8,[x19, #0xa2]
0097e6c4	ldr x8,[x19]
0097e6c8	ldr x8,[x8, #0x18]
0097e6cc	mov w2,#0x1000
0097e6d0	mov x0,x19
0097e6d4	mov x1,xzr
0097e6d8	blr x8
0097e6dc	ldr x8,[x23, #0x28]
0097e6e0	ldr x9,[sp, #0x8]
0097e6e4	cmp x8,x9
0097e6e8	b.ne 0x0097e704
0097e6ec	ldp x29,x30,[sp, #0x40]
0097e6f0	ldp x20,x19,[sp, #0x30]
0097e6f4	ldp x22,x21,[sp, #0x20]
0097e6f8	ldr x23,[sp, #0x10]
0097e6fc	add sp,sp,#0x50
0097e700	ret
0097e704	bl 0x00c2fec0
