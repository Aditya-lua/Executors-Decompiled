; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::operator>> @ 00976ef8
00976ef8	sub sp,sp,#0x50
00976efc	str x21,[sp, #0x20]
00976f00	stp x20,x19,[sp, #0x30]
00976f04	stp x29,x30,[sp, #0x40]
00976f08	add x29,sp,#0x40
00976f0c	mrs x21,tpidr_el0
00976f10	ldr x8,[x21, #0x28]
00976f14	mov x20,x1
00976f18	mov x19,x0
00976f1c	str x8,[sp, #0x18]
00976f20	add x0,sp,#0x10
00976f24	mov x1,x19
00976f28	mov w2,wzr
00976f2c	bl 0x00c32f70
00976f30	ldrb w8,[sp, #0x10]
00976f34	cbz w8,0x00976fac
00976f38	str wzr,[sp, #0xc]
00976f3c	ldr x8,[x19]
00976f40	ldur x8,[x8, #-0x18]
00976f44	add x0,x19,x8
00976f48	mov x8,sp
00976f4c	bl 0x00c30070
00976f50	adrp x1,0xcb4000
00976f54	ldr x1,[x1, #0xf38]
00976f58	mov x0,sp
00976f5c	bl 0x00c30080
00976f60	ldr x8,[x19]
00976f64	ldr x9,[x0]
00976f68	ldur x8,[x8, #-0x18]
00976f6c	add x3,x19,x8
00976f70	ldr x1,[x3, #0x28]
00976f74	ldr x8,[x9, #0x20]
00976f78	add x4,sp,#0xc
00976f7c	mov x2,xzr
00976f80	mov x5,x20
00976f84	blr x8
00976f88	mov x0,sp
00976f8c	bl 0x00c30090
00976f90	ldr x8,[x19]
00976f94	ldur x8,[x8, #-0x18]
00976f98	add x0,x19,x8
00976f9c	ldr w8,[sp, #0xc]
00976fa0	ldr w9,[x0, #0x20]
00976fa4	orr w1,w9,w8
00976fa8	bl 0x00c30130
00976fac	ldr x8,[x21, #0x28]
00976fb0	ldr x9,[sp, #0x18]
00976fb4	cmp x8,x9
00976fb8	b.ne 0x00976fd4
00976fbc	mov x0,x19
00976fc0	ldp x29,x30,[sp, #0x40]
00976fc4	ldp x20,x19,[sp, #0x30]
00976fc8	ldr x21,[sp, #0x20]
00976fcc	add sp,sp,#0x50
00976fd0	ret
00976fd4	bl 0x00c2fec0
