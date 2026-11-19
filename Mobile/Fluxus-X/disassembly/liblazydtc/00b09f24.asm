; X509_STORE_load_locations_ex @ 00b09f24
00b09f24	str x23,[sp, #-0x40]!
00b09f28	stp x20,x19,[sp, #0x20]
00b09f2c	mov x20,x0
00b09f30	orr x8,x1,x2
00b09f34	mov w0,wzr
00b09f38	stp x22,x21,[sp, #0x10]
00b09f3c	stp x29,x30,[sp, #0x30]
00b09f40	add x29,sp,#0x30
00b09f44	cbz x8,0x00b09fd4
00b09f48	mov x19,x2
00b09f4c	mov x23,x1
00b09f50	cbz x1,0x00b09f94
00b09f54	mov x21,x4
00b09f58	mov x22,x3
00b09f5c	bl 0x00c32b90
00b09f60	mov x1,x0
00b09f64	mov x0,x20
00b09f68	bl 0x00c32c00
00b09f6c	cbz x0,0x00b09fd4
00b09f70	mov w1,#0x1
00b09f74	mov w3,#0x1
00b09f78	mov x2,x23
00b09f7c	mov x4,xzr
00b09f80	mov x5,x22
00b09f84	mov x6,x21
00b09f88	bl 0x00c35b20
00b09f8c	cmp w0,#0x1
00b09f90	b.lt 0x00b09fd0
00b09f94	cbz x19,0x00b09fc8
00b09f98	bl 0x00c35b30
00b09f9c	mov x1,x0
00b09fa0	mov x0,x20
00b09fa4	bl 0x00c32c00
00b09fa8	cbz x0,0x00b09fd4
00b09fac	mov w1,#0x2
00b09fb0	mov w3,#0x1
00b09fb4	mov x2,x19
00b09fb8	mov x4,xzr
00b09fbc	bl 0x00c35b10
00b09fc0	cmp w0,#0x1
00b09fc4	b.lt 0x00b09fd0
00b09fc8	mov w0,#0x1
00b09fcc	b 0x00b09fd4
00b09fd0	mov w0,wzr
00b09fd4	ldp x29,x30,[sp, #0x30]
00b09fd8	ldp x20,x19,[sp, #0x20]
00b09fdc	ldp x22,x21,[sp, #0x10]
00b09fe0	ldr x23,[sp], #0x40
00b09fe4	ret
