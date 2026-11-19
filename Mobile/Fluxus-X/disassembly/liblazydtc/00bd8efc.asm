; FUN_00bd8efc @ 00bd8efc
00bd8efc	paciasp
00bd8f00	stp x29,x30,[sp, #-0x40]!
00bd8f04	str x23,[sp, #0x10]
00bd8f08	stp x22,x21,[sp, #0x20]
00bd8f0c	stp x20,x19,[sp, #0x30]
00bd8f10	mov x29,sp
00bd8f14	adrp x8,0xcb5000
00bd8f18	mov x20,x0
00bd8f1c	mov x19,x0
00bd8f20	ldr x8,[x8, #0xb88]
00bd8f24	mov x21,x1
00bd8f28	add x22,x8,#0x10
00bd8f2c	str x22,[x20, #0xa8]!
00bd8f30	add x0,x20,#0x8
00bd8f34	add x23,x20,#0x68
00bd8f38	str xzr,[x20, #0x68]
00bd8f3c	bl 0x00c30480
00bd8f40	movi v0.2D,#0x0
00bd8f44	adrp x8,0xcad000
00bd8f48	add x8,x8,#0x400
00bd8f4c	str x8,[x20]
00bd8f50	mov w8,#0xffffffff
00bd8f54	add x0,x29,#0x18
00bd8f58	add x1,x20,#0x8
00bd8f5c	str x21,[x20, #0x40]
00bd8f60	str x23,[x20, #0x50]
00bd8f64	stp q0,q0,[x20, #0x20]
00bd8f68	str q0,[x20, #0x10]
00bd8f6c	str w8,[x20, #0x5c]
00bd8f70	strb wzr,[x20, #0x60]
00bd8f74	bl 0x00c30660
00bd8f78	ldr x8,[x20]
00bd8f7c	ldr x8,[x8, #0x10]
00bd8f80	add x1,x29,#0x18
00bd8f84	mov x0,x20
00bd8f88	blr x8
00bd8f8c	add x0,x29,#0x18
00bd8f90	bl 0x00c30090
00bd8f94	adrp x8,0xcb5000
00bd8f98	mov x21,x19
00bd8f9c	ldr x8,[x8, #0xb90]
00bd8fa0	str xzr,[x19, #0x40]
00bd8fa4	add x9,x8,#0x40
00bd8fa8	add x8,x8,#0x18
00bd8fac	str x9,[x21, #0x10]!
00bd8fb0	stp x8,xzr,[x19]
00bd8fb4	mov x0,x21
00bd8fb8	mov x1,x20
00bd8fbc	bl 0x00c30100
00bd8fc0	mov w8,#0xffffffff
00bd8fc4	str xzr,[x19, #0x98]
00bd8fc8	str w8,[x19, #0xa0]
00bd8fcc	ldp x20,x19,[sp, #0x30]
00bd8fd0	ldr x23,[sp, #0x10]
00bd8fd4	ldp x22,x21,[sp, #0x20]
00bd8fd8	ldp x29,x30,[sp], #0x40
00bd8fdc	autiasp
00bd8fe0	ret
