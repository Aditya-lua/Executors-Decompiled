; UI_destroy_method @ 00aeed3c
00aeed3c	cbz x0,0x00aeed94
00aeed40	stp x20,x19,[sp, #-0x20]!
00aeed44	mov x19,x0
00aeed48	add x2,x0,#0x48
00aeed4c	orr w0,wzr,#0xe
00aeed50	mov x1,x19
00aeed54	stp x29,x30,[sp, #0x10]
00aeed58	add x29,sp,#0x10
00aeed5c	bl 0x00c356c0
00aeed60	ldr x0,[x19]
00aeed64	adrp x20,0x2a0000
00aeed68	add x20,x20,#0xc2f
00aeed6c	mov w2,#0x272
00aeed70	mov x1,x20
00aeed74	bl 0x00c32310
00aeed78	str xzr,[x19]
00aeed7c	ldp x29,x30,[sp, #0x10]
00aeed80	mov w2,#0x274
00aeed84	mov x0,x19
00aeed88	mov x1,x20
00aeed8c	ldp x20,x19,[sp], #0x20
00aeed90	b 0x00c32310
00aeed94	ret
