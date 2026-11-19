; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::operator>> @ 00981e78
00981e78	sub sp,sp,#0x60
00981e7c	str x21,[sp, #0x30]
00981e80	stp x20,x19,[sp, #0x40]
00981e84	stp x29,x30,[sp, #0x50]
00981e88	add x29,sp,#0x50
00981e8c	mrs x21,tpidr_el0
00981e90	ldr x8,[x21, #0x28]
00981e94	mov x20,x1
00981e98	mov x19,x0
00981e9c	str x8,[sp, #0x28]
00981ea0	add x0,sp,#0x20
00981ea4	mov x1,x19
00981ea8	mov w2,wzr
00981eac	bl 0x00c32f70
00981eb0	ldrb w8,[sp, #0x20]
00981eb4	cbz w8,0x00981f70
00981eb8	str wzr,[sp, #0x1c]
00981ebc	ldr x8,[x19]
00981ec0	ldur x8,[x8, #-0x18]
00981ec4	add x0,x19,x8
00981ec8	add x8,sp,#0x8
00981ecc	bl 0x00c30070
00981ed0	adrp x1,0xcb4000
00981ed4	ldr x1,[x1, #0xf38]
00981ed8	add x0,sp,#0x8
00981edc	bl 0x00c30080
00981ee0	ldr x8,[x19]
00981ee4	ldr x9,[x0]
00981ee8	ldur x8,[x8, #-0x18]
00981eec	add x3,x19,x8
00981ef0	ldr x1,[x3, #0x28]
00981ef4	ldr x8,[x9, #0x20]
00981ef8	add x4,sp,#0x1c
00981efc	add x5,sp,#0x10
00981f00	mov x2,xzr
00981f04	blr x8
00981f08	add x0,sp,#0x8
00981f0c	bl 0x00c30090
00981f10	ldr x8,[sp, #0x10]
00981f14	orr x9,xzr,#-0x80000001
00981f18	cmp x8,x9
00981f1c	b.gt 0x00981f2c
00981f20	ldr w8,[sp, #0x1c]
00981f24	mov w9,#0x80000000
00981f28	b 0x00981f40
00981f2c	mov w9,#0x80000000
00981f30	cmp x8,x9
00981f34	b.lt 0x00981f50
00981f38	ldr w8,[sp, #0x1c]
00981f3c	orr w9,wzr,#0x7fffffff
00981f40	orr w8,w8,#0x4
00981f44	str w8,[sp, #0x1c]
00981f48	str w9,[x20]
00981f4c	b 0x00981f58
00981f50	str w8,[x20]
00981f54	ldr w8,[sp, #0x1c]
00981f58	ldr x9,[x19]
00981f5c	ldur x9,[x9, #-0x18]
00981f60	add x0,x19,x9
00981f64	ldr w9,[x0, #0x20]
00981f68	orr w1,w9,w8
00981f6c	bl 0x00c30130
00981f70	ldr x8,[x21, #0x28]
00981f74	ldr x9,[sp, #0x28]
00981f78	cmp x8,x9
00981f7c	b.ne 0x00981f98
00981f80	mov x0,x19
00981f84	ldp x29,x30,[sp, #0x50]
00981f88	ldp x20,x19,[sp, #0x40]
00981f8c	ldr x21,[sp, #0x30]
00981f90	add sp,sp,#0x60
00981f94	ret
00981f98	bl 0x00c2fec0
