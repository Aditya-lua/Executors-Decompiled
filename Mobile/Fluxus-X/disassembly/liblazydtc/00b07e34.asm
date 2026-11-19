; X509at_get_attr_by_OBJ @ 00b07e34
00b07e34	stp x22,x21,[sp, #-0x30]!
00b07e38	stp x20,x19,[sp, #0x10]
00b07e3c	stp x29,x30,[sp, #0x20]
00b07e40	add x29,sp,#0x20
00b07e44	cbz x0,0x00b07e90
00b07e48	add w8,w2,#0x1
00b07e4c	mov x20,x1
00b07e50	mov x21,x0
00b07e54	bic w19,w8,w8, ASR #0x1f
00b07e58	bl 0x00c325e0
00b07e5c	cmp w19,w0
00b07e60	b.ge 0x00b07e90
00b07e64	mov w22,w0
00b07e68	mov x0,x21
00b07e6c	mov w1,w19
00b07e70	bl 0x00c32610
00b07e74	ldr x0,[x0]
00b07e78	mov x1,x20
00b07e7c	bl 0x00c37ab0
00b07e80	cbz w0,0x00b07e94
00b07e84	add w19,w19,#0x1
00b07e88	cmp w19,w22
00b07e8c	b.lt 0x00b07e68
00b07e90	mov w19,#0xffffffff
00b07e94	mov w0,w19
00b07e98	ldp x29,x30,[sp, #0x20]
00b07e9c	ldp x20,x19,[sp, #0x10]
00b07ea0	ldp x22,x21,[sp], #0x30
00b07ea4	ret
