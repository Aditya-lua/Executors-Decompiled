; d2i_PKCS7_fp @ 00b15e30
00b15e30	stp x22,x21,[sp, #-0x30]!
00b15e34	stp x20,x19,[sp, #0x10]
00b15e38	mov x19,x1
00b15e3c	mov x20,x0
00b15e40	stp x29,x30,[sp, #0x20]
00b15e44	add x29,sp,#0x20
00b15e48	cbz x1,0x00b15e5c
00b15e4c	ldr x8,[x19]
00b15e50	cbz x8,0x00b15e5c
00b15e54	ldp x21,x22,[x8, #0x28]
00b15e58	b 0x00b15e64
00b15e5c	mov x21,xzr
00b15e60	mov x22,xzr
00b15e64	bl 0x00c3f440
00b15e68	mov x1,x20
00b15e6c	mov x2,x19
00b15e70	mov x3,x21
00b15e74	mov x4,x22
00b15e78	bl 0x00c37450
00b15e7c	mov x19,x0
00b15e80	cbz x0,0x00b15e8c
00b15e84	mov x0,x19
00b15e88	bl 0x00c3f720
00b15e8c	mov x0,x19
00b15e90	ldp x29,x30,[sp, #0x20]
00b15e94	ldp x20,x19,[sp, #0x10]
00b15e98	ldp x22,x21,[sp], #0x30
00b15e9c	ret
