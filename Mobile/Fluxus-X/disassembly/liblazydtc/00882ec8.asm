; FUN_00882ec8 @ 00882ec8
00882ec8	stp x29,x30,[sp, #-0x40]!
00882ecc	stp x24,x23,[sp, #0x10]
00882ed0	stp x22,x21,[sp, #0x20]
00882ed4	stp x20,x19,[sp, #0x30]
00882ed8	mov x29,sp
00882edc	ldr x20,[x0, #0x10]
00882ee0	mov x19,x0
00882ee4	cbz x20,0x00882fac
00882ee8	ldr x8,[x19, #0x18]
00882eec	ldr x22,[x8]
00882ef0	cbz x22,0x00882efc
00882ef4	mov x21,xzr
00882ef8	b 0x00882f1c
00882efc	mov x21,xzr
00882f00	add x9,x8,#0x8
00882f04	sub x10,x20,#0x1
00882f08	cmp x10,x21
00882f0c	b.eq 0x00882fac
00882f10	ldr x22,[x9, x21, LSL #0x3]
00882f14	add x21,x21,#0x1
00882f18	cbz x22,0x00882f08
00882f1c	rbit x9,x22
00882f20	add x23,x8,#0x8
00882f24	clz x9,x9
00882f28	orr x24,x9,x21, LSL #0x6
00882f2c	ldr x8,[x19]
00882f30	add x8,x8,x24, LSL #0x5
00882f34	ldrb w9,[x8, #0x8]
00882f38	tbz w9,#0x0,0x00882f4c
00882f3c	ldr x0,[x8, #0x18]
00882f40	ldr x8,[x8, #0x8]
00882f44	and x1,x8,#-0x2
00882f48	bl 0x00c2fe80
00882f4c	sub x8,x22,#0x1
00882f50	ands x22,x8,x22
00882f54	b.ne 0x00882f80
00882f58	add x8,x21,#0x1
00882f5c	cmp x20,x8
00882f60	csinc x8,x20,x21,hi
00882f64	add x9,x21,#0x1
00882f68	cmp x9,x20
00882f6c	b.cs 0x00882f9c
00882f70	ldr x22,[x23, x21, LSL #0x3]
00882f74	mov x21,x9
00882f78	cbz x22,0x00882f64
00882f7c	mov x21,x9
00882f80	rbit x8,x22
00882f84	clz x8,x8
00882f88	orr x24,x8,x21, LSL #0x6
00882f8c	cbnz x22,0x00882f2c
00882f90	cmp x21,x20
00882f94	b.ne 0x00882f2c
00882f98	b 0x00882fac
00882f9c	mov x22,xzr
00882fa0	mov x21,x8
00882fa4	cbz x22,0x00882f90
00882fa8	b 0x00882f2c
00882fac	ldr x0,[x19]
00882fb0	bl 0x00c301d0
00882fb4	ldr x0,[x19, #0x18]
00882fb8	str xzr,[x19]
00882fbc	bl 0x00c301d0
00882fc0	mov x0,xzr
00882fc4	stp xzr,xzr,[x19, #0x8]
00882fc8	str xzr,[x19, #0x18]
00882fcc	bl 0x00c301d0
00882fd0	mov w8,#0x40
00882fd4	str xzr,[x19, #0x20]
00882fd8	strb w8,[x19, #0x30]
00882fdc	ldp x20,x19,[sp, #0x30]
00882fe0	ldp x22,x21,[sp, #0x20]
00882fe4	ldp x24,x23,[sp, #0x10]
00882fe8	ldp x29,x30,[sp], #0x40
00882fec	ret
