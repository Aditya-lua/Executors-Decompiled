; curl_share_init @ 0093f11c
0093f11c	str x19,[sp, #-0x20]!
0093f120	stp x29,x30,[sp, #0x10]
0093f124	add x29,sp,#0x10
0093f128	adrp x8,0xcc4000
0093f12c	add x8,x8,#0x690
0093f130	mov w0,#0x1
0093f134	mov w1,#0x110
0093f138	ldr x8,[x8]
0093f13c	blr x8
0093f140	mov x19,x0
0093f144	cbz x0,0x0093f168
0093f148	ldr w8,[x19, #0x4]
0093f14c	mov w9,#0x7a1e
0093f150	movk w9,#0x7e11, LSL #16
0093f154	add x0,x19,#0xb8
0093f158	orr w8,w8,#0x2
0093f15c	mov w1,#0x17
0093f160	stp w9,w8,[x19]
0093f164	bl 0x00917c68
0093f168	ldp x29,x30,[sp, #0x10]
0093f16c	mov x0,x19
0093f170	ldr x19,[sp], #0x20
0093f174	ret
