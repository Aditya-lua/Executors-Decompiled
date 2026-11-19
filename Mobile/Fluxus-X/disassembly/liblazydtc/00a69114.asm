; EVP_MAC_gettable_params @ 00a69114
00a69114	ldr x1,[x0, #0x60]
00a69118	cbz x1,0x00a69144
00a6911c	sub sp,sp,#0x20
00a69120	stp x29,x30,[sp, #0x10]
00a69124	ldr x0,[x0]
00a69128	add x29,sp,#0x10
00a6912c	str x1,[sp, #0x8]
00a69130	bl 0x00c3b680
00a69134	ldr x1,[sp, #0x8]
00a69138	ldp x29,x30,[sp, #0x10]
00a6913c	add sp,sp,#0x20
00a69140	br x1
00a69144	mov x0,xzr
00a69148	ret
