; FUN_00bd3f20 @ 00bd3f20
00bd3f20	paciasp
00bd3f24	sub sp,sp,#0x30
00bd3f28	stp x29,x30,[sp, #0x10]
00bd3f2c	stp x20,x19,[sp, #0x20]
00bd3f30	add x29,sp,#0x10
00bd3f34	mov x19,x0
00bd3f38	mov x20,x1
00bd3f3c	add x0,sp,#0x8
00bd3f40	mov x1,x19
00bd3f44	mov w2,wzr
00bd3f48	stur wzr,[x29, #-0x4]
00bd3f4c	bl 0x00c44060
00bd3f50	ldrb w8,[sp, #0x8]
00bd3f54	cmp w8,#0x1
00bd3f58	b.ne 0x00bd3fcc
00bd3f5c	ldr x8,[x19]
00bd3f60	ldur x9,[x8, #-0x18]
00bd3f64	mov x8,sp
00bd3f68	add x0,x19,x9
00bd3f6c	bl 0x00c30070
00bd3f70	adrp x1,0xcb5000
00bd3f74	mov x0,sp
00bd3f78	ldr x1,[x1, #0xba0]
00bd3f7c	bl 0x00c30080
00bd3f80	ldr x8,[x19]
00bd3f84	ldr x9,[x0]
00bd3f88	ldur x8,[x8, #-0x18]
00bd3f8c	add x3,x19,x8
00bd3f90	ldr x8,[x9, #0x50]
00bd3f94	ldr x1,[x3, #0x28]
00bd3f98	sub x4,x29,#0x4
00bd3f9c	mov x2,xzr
00bd3fa0	mov x5,x20
00bd3fa4	blr x8
00bd3fa8	mov x0,sp
00bd3fac	bl 0x00c30090
00bd3fb0	ldr x8,[x19]
00bd3fb4	ldur x8,[x8, #-0x18]
00bd3fb8	add x0,x19,x8
00bd3fbc	ldur w8,[x29, #-0x4]
00bd3fc0	ldr w9,[x0, #0x20]
00bd3fc4	orr w1,w9,w8
00bd3fc8	bl 0x00c30130
00bd3fcc	mov x0,x19
00bd3fd0	ldp x20,x19,[sp, #0x20]
00bd3fd4	ldp x29,x30,[sp, #0x10]
00bd3fd8	add sp,sp,#0x30
00bd3fdc	autiasp
00bd3fe0	ret
