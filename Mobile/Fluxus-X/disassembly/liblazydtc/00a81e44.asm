; ossl_algorithm_do_all @ 00a81e44
00a81e44	sub sp,sp,#0x70
00a81e48	stp x29,x30,[sp, #0x60]
00a81e4c	add x29,sp,#0x60
00a81e50	ldr x8,[x29, #0x10]
00a81e54	stp x20,x19,[sp, #0x50]
00a81e58	mov x20,x0
00a81e5c	str x21,[sp, #0x40]
00a81e60	stp x0,xzr,[sp]
00a81e64	str w1,[sp, #0x8]
00a81e68	stp x3,x4,[sp, #0x10]
00a81e6c	stp x5,x6,[sp, #0x20]
00a81e70	stp x7,x8,[sp, #0x30]
00a81e74	cbz x2,0x00a81eb8
00a81e78	mov x0,x2
00a81e7c	mov x19,x2
00a81e80	bl 0x00c3b2f0
00a81e84	mov x21,x0
00a81e88	mov x0,x20
00a81e8c	bl 0x00c383c0
00a81e90	mov x20,x0
00a81e94	mov x0,x21
00a81e98	bl 0x00c383c0
00a81e9c	cmp x20,x0
00a81ea0	b.ne 0x00a81ecc
00a81ea4	mov x1,sp
00a81ea8	mov x0,x19
00a81eac	str x21,[sp]
00a81eb0	bl 0x00a81ee0
00a81eb4	b 0x00a81ecc
00a81eb8	adrp x1,0xa81000
00a81ebc	add x1,x1,#0xee0
00a81ec0	mov x2,sp
00a81ec4	mov x0,x20
00a81ec8	bl 0x00c3df90
00a81ecc	ldp x29,x30,[sp, #0x60]
00a81ed0	ldp x20,x19,[sp, #0x50]
00a81ed4	ldr x21,[sp, #0x40]
00a81ed8	add sp,sp,#0x70
00a81edc	ret
