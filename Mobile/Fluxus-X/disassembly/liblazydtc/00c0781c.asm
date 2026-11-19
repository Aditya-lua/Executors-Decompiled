; std::__ndk1::ctype_byname<char>::~ctype_byname @ 00c0781c
00c0781c	paciasp
00c07820	stp x29,x30,[sp, #-0x20]!
00c07824	str x19,[sp, #0x10]
00c07828	mov x29,sp
00c0782c	adrp x8,0xcb5000
00c07830	mov x19,x0
00c07834	ldr x8,[x8, #0xe20]
00c07838	ldr x0,[x0, #0x20]
00c0783c	add x8,x8,#0x10
00c07840	str x8,[x19]
00c07844	bl 0x00c43980
00c07848	adrp x8,0xcb5000
00c0784c	ldr x8,[x8, #0xe18]
00c07850	ldr x0,[x19, #0x10]
00c07854	add x8,x8,#0x10
00c07858	str x8,[x19]
00c0785c	cbz x0,0x00c07870
00c07860	ldrb w8,[x19, #0x18]
00c07864	cmp w8,#0x1
00c07868	b.ne 0x00c07870
00c0786c	bl 0x00c333e0
00c07870	mov x0,x19
00c07874	ldr x19,[sp, #0x10]
00c07878	ldp x29,x30,[sp], #0x20
00c0787c	autiasp
00c07880	b 0x00c31530
