; FUN_00a81b30 @ 00a81b30
00a81b30	sub sp,sp,#0x40
00a81b34	stp x22,x21,[sp, #0x10]
00a81b38	stp x20,x19,[sp, #0x20]
00a81b3c	stp x29,x30,[sp, #0x30]
00a81b40	mov x22,x0
00a81b44	ldr x0,[x0]
00a81b48	mov x20,x2
00a81b4c	adrp x2,0xc61000
00a81b50	mov x21,x1
00a81b54	add x2,x2,#0x408
00a81b58	mov w1,#0x11
00a81b5c	add x29,sp,#0x30
00a81b60	mov x19,x3
00a81b64	bl 0x00c3b520
00a81b68	cbz x0,0x00a81ba4
00a81b6c	ldr x0,[x0, #0x8]
00a81b70	cbz x0,0x00a81ba4
00a81b74	str x0,[sp, #0x8]
00a81b78	mov x0,x22
00a81b7c	bl 0x00c321b0
00a81b80	mov x1,x21
00a81b84	mov x2,x20
00a81b88	mov x3,x19
00a81b8c	ldr x4,[sp, #0x8]
00a81b90	ldp x29,x30,[sp, #0x30]
00a81b94	ldp x20,x19,[sp, #0x20]
00a81b98	ldp x22,x21,[sp, #0x10]
00a81b9c	add sp,sp,#0x40
00a81ba0	br x4
00a81ba4	ldp x29,x30,[sp, #0x30]
00a81ba8	ldp x20,x19,[sp, #0x20]
00a81bac	ldp x22,x21,[sp, #0x10]
00a81bb0	mov w0,wzr
00a81bb4	add sp,sp,#0x40
00a81bb8	ret
