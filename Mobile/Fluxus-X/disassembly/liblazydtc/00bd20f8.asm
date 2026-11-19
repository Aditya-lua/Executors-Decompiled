; std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::seekp @ 00bd20f8
00bd20f8	paciasp
00bd20fc	sub sp,sp,#0x40
00bd2100	stp x29,x30,[sp, #0x10]
00bd2104	str x21,[sp, #0x20]
00bd2108	stp x20,x19,[sp, #0x30]
00bd210c	add x29,sp,#0x10
00bd2110	mov x19,x0
00bd2114	mov x21,x1
00bd2118	mov x0,sp
00bd211c	mov x1,x19
00bd2120	mov x20,x2
00bd2124	bl 0x00c43fa0
00bd2128	ldr x8,[x19]
00bd212c	mov w10,#0x5
00bd2130	ldur x8,[x8, #-0x18]
00bd2134	add x8,x19,x8
00bd2138	ldrb w9,[x8, #0x20]
00bd213c	tst w9,w10
00bd2140	b.ne 0x00bd2180
00bd2144	ldr x0,[x8, #0x28]
00bd2148	ldr x8,[x0]
00bd214c	ldr x8,[x8, #0x28]
00bd2150	mov x1,x21
00bd2154	mov x2,x20
00bd2158	mov w3,#0x10
00bd215c	blr x8
00bd2160	cmn x1,#0x1
00bd2164	b.ne 0x00bd2180
00bd2168	ldr x8,[x19]
00bd216c	ldur x8,[x8, #-0x18]
00bd2170	add x0,x19,x8
00bd2174	ldr w8,[x0, #0x20]
00bd2178	orr w1,w8,#0x4
00bd217c	bl 0x00c30130
00bd2180	mov x0,sp
00bd2184	bl 0x00c43fb0
00bd2188	mov x0,x19
00bd218c	ldp x20,x19,[sp, #0x30]
00bd2190	ldr x21,[sp, #0x20]
00bd2194	ldp x29,x30,[sp, #0x10]
00bd2198	add sp,sp,#0x40
00bd219c	autiasp
00bd21a0	ret
