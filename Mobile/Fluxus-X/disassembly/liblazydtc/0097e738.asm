; std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::~basic_filebuf @ 0097e738
0097e738	str x21,[sp, #-0x30]!
0097e73c	stp x20,x19,[sp, #0x10]
0097e740	stp x29,x30,[sp, #0x20]
0097e744	add x29,sp,#0x20
0097e748	adrp x8,0xcb4000
0097e74c	ldr x20,[x0, #0x78]
0097e750	ldr x8,[x8, #0xf68]
0097e754	mov x19,x0
0097e758	add x8,x8,#0x10
0097e75c	str x8,[x0]
0097e760	cbz x20,0x0097e77c
0097e764	mov x0,x19
0097e768	bl 0x00c332d0
0097e76c	mov x0,x20
0097e770	bl 0x00c30be0
0097e774	cbnz w0,0x0097e77c
0097e778	str xzr,[x19, #0x78]
0097e77c	ldrb w8,[x19, #0xa0]
0097e780	cbz w8,0x0097e790
0097e784	ldr x0,[x19, #0x40]
0097e788	cbz x0,0x0097e790
0097e78c	bl 0x00c333e0
0097e790	ldrb w8,[x19, #0xa1]
0097e794	cbz w8,0x0097e7a4
0097e798	ldr x0,[x19, #0x68]
0097e79c	cbz x0,0x0097e7a4
0097e7a0	bl 0x00c333e0
0097e7a4	adrp x8,0xcb4000
0097e7a8	ldr x8,[x8, #0xa08]
0097e7ac	add x8,x8,#0x10
0097e7b0	str x8,[x19], #0x8
0097e7b4	mov x0,x19
0097e7b8	ldp x29,x30,[sp, #0x20]
0097e7bc	ldp x20,x19,[sp, #0x10]
0097e7c0	ldr x21,[sp], #0x30
0097e7c4	b 0x00c30090
