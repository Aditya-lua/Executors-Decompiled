; FUN_00b5f124 @ 00b5f124
00b5f124	stp x22,x21,[sp, #-0x30]!
00b5f128	stp x20,x19,[sp, #0x10]
00b5f12c	stp x29,x30,[sp, #0x20]
00b5f130	add x29,sp,#0x20
00b5f134	mov x19,x3
00b5f138	mov x20,x2
00b5f13c	mov x21,x1
00b5f140	mov x22,x0
00b5f144	bl 0x00c41000
00b5f148	cbz w0,0x00b5f170
00b5f14c	mov x2,x20
00b5f150	mov x3,x19
00b5f154	ldp x29,x30,[sp, #0x20]
00b5f158	ldp x20,x19,[sp, #0x10]
00b5f15c	mov w4,#0x10
00b5f160	mov x0,x22
00b5f164	mov x1,x21
00b5f168	ldp x22,x21,[sp], #0x30
00b5f16c	b 0x00b60790
00b5f170	ldp x29,x30,[sp, #0x20]
00b5f174	ldp x20,x19,[sp, #0x10]
00b5f178	ldp x22,x21,[sp], #0x30
00b5f17c	ret
