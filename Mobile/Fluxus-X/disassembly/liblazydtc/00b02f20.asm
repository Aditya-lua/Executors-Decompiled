; ossl_x509_likely_issued @ 00b02f20
00b02f20	str x21,[sp, #-0x30]!
00b02f24	stp x20,x19,[sp, #0x10]
00b02f28	stp x29,x30,[sp, #0x20]
00b02f2c	add x29,sp,#0x20
00b02f30	mov x19,x1
00b02f34	mov x20,x0
00b02f38	bl 0x00c32d20
00b02f3c	mov x21,x0
00b02f40	mov x0,x19
00b02f44	bl 0x00c32cf0
00b02f48	mov x1,x0
00b02f4c	mov x0,x21
00b02f50	bl 0x00c36560
00b02f54	cbz w0,0x00b02f60
00b02f58	mov w0,#0x1d
00b02f5c	b 0x00b02fa8
00b02f60	mov x0,x20
00b02f64	bl 0x00b01d98
00b02f68	cbz w0,0x00b02fa4
00b02f6c	mov x0,x19
00b02f70	bl 0x00b01d98
00b02f74	cbz w0,0x00b02fa4
00b02f78	ldr x1,[x19, #0x100]
00b02f7c	mov x0,x20
00b02f80	bl 0x00b02c8c
00b02f84	cbnz w0,0x00b02fa8
00b02f88	mov x0,x20
00b02f8c	bl 0x00c32cb0
00b02f90	mov x1,x19
00b02f94	ldp x29,x30,[sp, #0x20]
00b02f98	ldp x20,x19,[sp, #0x10]
00b02f9c	ldr x21,[sp], #0x30
00b02fa0	b 0x00b02d6c
00b02fa4	mov w0,#0x1
00b02fa8	ldp x29,x30,[sp, #0x20]
00b02fac	ldp x20,x19,[sp, #0x10]
00b02fb0	ldr x21,[sp], #0x30
00b02fb4	ret
