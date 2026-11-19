; engine_table_unregister @ 00a52e20
00a52e20	str x21,[sp, #-0x30]!
00a52e24	stp x20,x19,[sp, #0x10]
00a52e28	stp x29,x30,[sp, #0x20]
00a52e2c	adrp x21,0xcb5000
00a52e30	ldr x21,[x21, #0x5d8]
00a52e34	mov x20,x0
00a52e38	add x29,sp,#0x20
00a52e3c	mov x19,x1
00a52e40	ldr x8,[x21]
00a52e44	mov x0,x8
00a52e48	bl 0x00c356a0
00a52e4c	cbz w0,0x00a52e7c
00a52e50	ldr x0,[x20]
00a52e54	cbz x0,0x00a52e68
00a52e58	adrp x1,0xa52000
00a52e5c	add x1,x1,#0xe8c
00a52e60	mov x2,x19
00a52e64	bl 0x00c395c0
00a52e68	ldr x0,[x21]
00a52e6c	ldp x29,x30,[sp, #0x20]
00a52e70	ldp x20,x19,[sp, #0x10]
00a52e74	ldr x21,[sp], #0x30
00a52e78	b 0x00c35690
00a52e7c	ldp x29,x30,[sp, #0x20]
00a52e80	ldp x20,x19,[sp, #0x10]
00a52e84	ldr x21,[sp], #0x30
00a52e88	ret
