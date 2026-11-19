; std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<< @ 00bd1ecc
00bd1ecc	paciasp
00bd1ed0	sub sp,sp,#0x40
00bd1ed4	stp x29,x30,[sp, #0x10]
00bd1ed8	stp x22,x21,[sp, #0x20]
00bd1edc	stp x20,x19,[sp, #0x30]
00bd1ee0	add x29,sp,#0x10
00bd1ee4	mov x20,x1
00bd1ee8	mov x19,x0
00bd1eec	mov x0,sp
00bd1ef0	mov x1,x19
00bd1ef4	bl 0x00c43fa0
00bd1ef8	ldrb w8,[sp]
00bd1efc	cmp w8,#0x1
00bd1f00	b.ne 0x00bd2000
00bd1f04	ldr x8,[x19]
00bd1f08	ldur x8,[x8, #-0x18]
00bd1f0c	add x0,x19,x8
00bd1f10	cbz x20,0x00bd1fd4
00bd1f14	ldr x21,[x0, #0x28]
00bd1f18	mov x22,xzr
00bd1f1c	b 0x00bd1f2c
00bd1f20	add x8,x8,#0x1
00bd1f24	str x8,[x20, #0x18]
00bd1f28	sub x22,x22,#0x1
00bd1f2c	ldp x8,x9,[x20, #0x18]
00bd1f30	cmp x8,x9
00bd1f34	b.ne 0x00bd1f50
00bd1f38	ldr x8,[x20]
00bd1f3c	ldr x8,[x8, #0x48]
00bd1f40	mov x0,x20
00bd1f44	blr x8
00bd1f48	cmn w0,#0x1
00bd1f4c	b.eq 0x00bd1fe4
00bd1f50	ldp x8,x9,[x20, #0x18]
00bd1f54	cmp x8,x9
00bd1f58	b.eq 0x00bd1f68
00bd1f5c	ldrb w1,[x8]
00bd1f60	cbnz x21,0x00bd1f80
00bd1f64	b 0x00bd1fe8
00bd1f68	ldr x8,[x20]
00bd1f6c	ldr x8,[x8, #0x48]
00bd1f70	mov x0,x20
00bd1f74	blr x8
00bd1f78	and w1,w0,#0xff
00bd1f7c	cbz x21,0x00bd1fe8
00bd1f80	ldp x8,x9,[x21, #0x30]
00bd1f84	cmp x8,x9
00bd1f88	b.eq 0x00bd1f9c
00bd1f8c	add x9,x8,#0x1
00bd1f90	str x9,[x21, #0x30]
00bd1f94	strb w1,[x8]
00bd1f98	b 0x00bd1fb4
00bd1f9c	ldr x8,[x21]
00bd1fa0	ldr x8,[x8, #0x68]
00bd1fa4	mov x0,x21
00bd1fa8	blr x8
00bd1fac	cmn w0,#0x1
00bd1fb0	b.eq 0x00bd1fe4
00bd1fb4	ldp x8,x9,[x20, #0x18]
00bd1fb8	cmp x8,x9
00bd1fbc	b.ne 0x00bd1f20
00bd1fc0	ldr x8,[x20]
00bd1fc4	ldr x8,[x8, #0x50]
00bd1fc8	mov x0,x20
00bd1fcc	blr x8
00bd1fd0	b 0x00bd1f28
00bd1fd4	ldr w8,[x0, #0x20]
00bd1fd8	orr w1,w8,#0x1
00bd1fdc	bl 0x00c30130
00bd1fe0	b 0x00bd2000
00bd1fe4	cbnz x22,0x00bd2000
00bd1fe8	ldr x8,[x19]
00bd1fec	ldur x8,[x8, #-0x18]
00bd1ff0	add x0,x19,x8
00bd1ff4	ldr w8,[x0, #0x20]
00bd1ff8	orr w1,w8,#0x4
00bd1ffc	bl 0x00c30130
00bd2000	mov x0,sp
00bd2004	bl 0x00c43fb0
00bd2008	mov x0,x19
00bd200c	ldp x20,x19,[sp, #0x30]
00bd2010	ldp x22,x21,[sp, #0x20]
00bd2014	ldp x29,x30,[sp, #0x10]
00bd2018	add sp,sp,#0x40
00bd201c	autiasp
00bd2020	ret
