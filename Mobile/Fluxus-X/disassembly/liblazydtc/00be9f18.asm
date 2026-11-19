; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::__get_am_pm @ 00be9f18
00be9f18	paciasp
00be9f1c	stp x29,x30,[sp, #-0x40]!
00be9f20	stp x24,x23,[sp, #0x10]
00be9f24	stp x22,x21,[sp, #0x20]
00be9f28	stp x20,x19,[sp, #0x30]
00be9f2c	mov x29,sp
00be9f30	ldr x8,[x0, #0x10]!
00be9f34	mov x21,x5
00be9f38	mov x20,x4
00be9f3c	mov x22,x3
00be9f40	mov x23,x2
00be9f44	ldr x8,[x8, #0x10]
00be9f48	mov x19,x1
00be9f4c	blr x8
00be9f50	ldrb w8,[x0]
00be9f54	ldrb w9,[x0, #0x18]
00be9f58	ldr x10,[x0, #0x8]
00be9f5c	lsr x11,x8,#0x1
00be9f60	tst w8,#0x1
00be9f64	ldr x8,[x0, #0x20]
00be9f68	lsr x12,x9,#0x1
00be9f6c	csel x10,x11,x10,eq
00be9f70	tst w9,#0x1
00be9f74	csel x8,x12,x8,eq
00be9f78	cmn x10,x8
00be9f7c	b.ne 0x00be9f90
00be9f80	ldr w8,[x20]
00be9f84	orr w8,w8,#0x4
00be9f88	str w8,[x20]
00be9f8c	b 0x00be9fe8
00be9f90	mov x24,x0
00be9f94	add x3,x0,#0x30
00be9f98	mov x0,x23
00be9f9c	mov x1,x22
00be9fa0	mov x2,x24
00be9fa4	mov x4,x21
00be9fa8	mov x5,x20
00be9fac	mov w6,wzr
00be9fb0	bl 0x00bda608
00be9fb4	ldr w8,[x19]
00be9fb8	subs x9,x0,x24
00be9fbc	b.ne 0x00be9fd0
00be9fc0	cmp w8,#0xc
00be9fc4	b.ne 0x00be9fd0
00be9fc8	str wzr,[x19]
00be9fcc	b 0x00be9fe8
00be9fd0	cmp x9,#0x18
00be9fd4	b.ne 0x00be9fe8
00be9fd8	cmp w8,#0xb
00be9fdc	b.gt 0x00be9fe8
00be9fe0	add w8,w8,#0xc
00be9fe4	str w8,[x19]
00be9fe8	ldp x20,x19,[sp, #0x30]
00be9fec	ldp x22,x21,[sp, #0x20]
00be9ff0	ldp x24,x23,[sp, #0x10]
00be9ff4	ldp x29,x30,[sp], #0x40
00be9ff8	autiasp
00be9ffc	ret
