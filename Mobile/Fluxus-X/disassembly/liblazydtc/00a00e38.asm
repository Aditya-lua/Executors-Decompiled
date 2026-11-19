; FUN_00a00e38 @ 00a00e38
00a00e38	cbz x0,0x00a00ea8
00a00e3c	stp x20,x19,[sp, #-0x20]!
00a00e40	stp x29,x30,[sp, #0x10]
00a00e44	ldr w8,[x0, #0x2c]
00a00e48	ldr x19,[x0, #0x40]
00a00e4c	add x29,sp,#0x10
00a00e50	cbz w8,0x00a00e74
00a00e54	cbz x19,0x00a00e74
00a00e58	ldr w8,[x0, #0x28]
00a00e5c	cbz w8,0x00a00e74
00a00e60	ldrb w8,[x0, #0x31]
00a00e64	ldr x0,[x19]
00a00e68	tbz w8,#0x1,0x00a00e70
00a00e6c	str xzr,[x0, #0x8]
00a00e70	bl 0x00c35660
00a00e74	ldr x0,[x19, #0x8]
00a00e78	adrp x20,0x29f000
00a00e7c	add x20,x20,#0xf2e
00a00e80	mov w2,#0x98
00a00e84	mov x1,x20
00a00e88	bl 0x00c32310
00a00e8c	mov w2,#0x99
00a00e90	mov x0,x19
00a00e94	mov x1,x20
00a00e98	bl 0x00c32310
00a00e9c	ldp x29,x30,[sp, #0x10]
00a00ea0	mov w0,#0x1
00a00ea4	ldp x20,x19,[sp], #0x20
00a00ea8	ret
