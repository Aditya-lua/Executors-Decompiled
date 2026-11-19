; std::__throw_bad_alloc @ 00bce638
00bce638	paciasp
00bce63c	stp x29,x30,[sp, #-0x20]!
00bce640	str x19,[sp, #0x10]
00bce644	mov x29,sp
00bce648	mov w0,#0x8
00bce64c	bl 0x00c30000
00bce650	mov x19,x0
00bce654	bl 0x00c43f60
00bce658	adrp x1,0xcb5000
00bce65c	adrp x2,0xcb5000
00bce660	mov x0,x19
00bce664	ldr x1,[x1, #0xb58]
00bce668	ldr x2,[x2, #0xb60]
00bce66c	bl 0x00c30020
