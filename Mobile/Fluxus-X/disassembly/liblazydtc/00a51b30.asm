; ENGINE_get_prev @ 00a51b30
00a51b30	str x21,[sp, #-0x30]!
00a51b34	stp x20,x19,[sp, #0x10]
00a51b38	stp x29,x30,[sp, #0x20]
00a51b3c	add x29,sp,#0x20
00a51b40	cbz x0,0x00a51b8c
00a51b44	adrp x21,0xcb5000
00a51b48	ldr x21,[x21, #0x5d8]
00a51b4c	mov x19,x0
00a51b50	ldr x0,[x21]
00a51b54	bl 0x00c356a0
00a51b58	cbz w0,0x00a51bbc
00a51b5c	ldr x20,[x19, #0xb8]
00a51b60	cbz x20,0x00a51b78
00a51b64	add x8,x20,#0x9c
00a51b68	ldaxr w9,[x8]
00a51b6c	add w9,w9,#0x1
00a51b70	stlxr w10,w9,[x8]
00a51b74	cbnz w10,0x00a51b68
00a51b78	ldr x0,[x21]
00a51b7c	bl 0x00c35690
00a51b80	mov x0,x19
00a51b84	bl 0x00c32370
00a51b88	b 0x00a51bc0
00a51b8c	bl 0x00c342a0
00a51b90	adrp x0,0x2cd000
00a51b94	adrp x2,0x2cb000
00a51b98	add x0,x0,#0x9e1
00a51b9c	add x2,x2,#0x890
00a51ba0	mov w1,#0x11e
00a51ba4	bl 0x00c342b0
00a51ba8	mov w1,#0x102
00a51bac	mov w0,#0x26
00a51bb0	movk w1,#0xc, LSL #16
00a51bb4	mov x2,xzr
00a51bb8	bl 0x00c342c0
00a51bbc	mov x20,xzr
00a51bc0	mov x0,x20
00a51bc4	ldp x29,x30,[sp, #0x20]
00a51bc8	ldp x20,x19,[sp, #0x10]
00a51bcc	ldr x21,[sp], #0x30
00a51bd0	ret
