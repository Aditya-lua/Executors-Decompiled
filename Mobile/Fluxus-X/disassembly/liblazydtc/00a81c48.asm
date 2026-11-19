; FUN_00a81c48 @ 00a81c48
00a81c48	sub sp,sp,#0x30
00a81c4c	stp x20,x19,[sp, #0x10]
00a81c50	stp x29,x30,[sp, #0x20]
00a81c54	mov x20,x0
00a81c58	ldr x0,[x0]
00a81c5c	adrp x2,0xc61000
00a81c60	mov x19,x1
00a81c64	add x2,x2,#0x408
00a81c68	mov w1,#0x11
00a81c6c	add x29,sp,#0x20
00a81c70	bl 0x00c3b520
00a81c74	cbz x0,0x00a81ca4
00a81c78	ldr x0,[x0, #0x18]
00a81c7c	cbz x0,0x00a81ca4
00a81c80	str x0,[sp, #0x8]
00a81c84	mov x0,x20
00a81c88	bl 0x00c321b0
00a81c8c	mov x1,x19
00a81c90	ldr x2,[sp, #0x8]
00a81c94	ldp x29,x30,[sp, #0x20]
00a81c98	ldp x20,x19,[sp, #0x10]
00a81c9c	add sp,sp,#0x30
00a81ca0	br x2
00a81ca4	ldp x29,x30,[sp, #0x20]
00a81ca8	ldp x20,x19,[sp, #0x10]
00a81cac	mov w0,#0xffffffff
00a81cb0	add sp,sp,#0x30
00a81cb4	ret
