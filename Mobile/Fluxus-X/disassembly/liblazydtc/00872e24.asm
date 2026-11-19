; FUN_00872e24 @ 00872e24
00872e24	sub sp,sp,#0x90
00872e28	stp x29,x30,[sp, #0x50]
00872e2c	stp x24,x23,[sp, #0x60]
00872e30	stp x22,x21,[sp, #0x70]
00872e34	stp x20,x19,[sp, #0x80]
00872e38	add x29,sp,#0x50
00872e3c	mrs x24,tpidr_el0
00872e40	ldr x8,[x24, #0x28]
00872e44	stur x8,[x29, #-0x8]
00872e48	str x0,[sp, #0x18]
00872e4c	strb wzr,[sp, #0x20]
00872e50	cbz x3,0x00872f08
00872e54	orr x8,xzr,#-0x5555555555555556
00872e58	mov x23,x3
00872e5c	movk x8,#0xaaab
00872e60	movk x8,#0xaaa, LSL #48
00872e64	cmp x3,x8
00872e68	b.cs 0x00872f30
00872e6c	add x8,x23,x23, LSL #0x1
00872e70	mov x19,x0
00872e74	mov x20,x2
00872e78	mov x21,x1
00872e7c	lsl x0,x8,#0x3
00872e80	bl 0x00c2fed0
00872e84	mov w8,#0x18
00872e88	mov x9,x19
00872e8c	mov x22,x0
00872e90	madd x8,x23,x8,x0
00872e94	cmp x21,x20
00872e98	stp x0,x0,[x19]
00872e9c	stp x0,x0,[sp, #0x8]
00872ea0	strb wzr,[sp, #0x40]
00872ea4	str x8,[x9, #0x10]!
00872ea8	add x8,sp,#0x8
00872eac	stp x9,x8,[sp, #0x28]
00872eb0	add x9,sp,#0x10
00872eb4	str x9,[sp, #0x38]
00872eb8	b.eq 0x00872f00
00872ebc	mov x0,x22
00872ec0	b 0x00872ee8
00872ec4	ldr x8,[x21, #0x10]
00872ec8	ldr q0,[x21]
00872ecc	str x8,[x0, #0x10]
00872ed0	str q0,[x0]
00872ed4	add x21,x21,#0x18
00872ed8	add x0,x0,#0x18
00872edc	cmp x21,x20
00872ee0	str x0,[sp, #0x10]
00872ee4	b.eq 0x00872f04
00872ee8	ldrb w8,[x21]
00872eec	tbz w8,#0x0,0x00872ec4
00872ef0	ldp x2,x1,[x21, #0x8]
00872ef4	bl 0x007ff40c
00872ef8	ldr x0,[sp, #0x10]
00872efc	b 0x00872ed4
00872f00	mov x0,x22
00872f04	str x0,[x19, #0x8]
00872f08	ldr x8,[x24, #0x28]
00872f0c	ldur x9,[x29, #-0x8]
00872f10	cmp x8,x9
00872f14	b.ne 0x00872f7c
00872f18	ldp x20,x19,[sp, #0x80]
00872f1c	ldp x22,x21,[sp, #0x70]
00872f20	ldp x24,x23,[sp, #0x60]
00872f24	ldp x29,x30,[sp, #0x50]
00872f28	add sp,sp,#0x90
00872f2c	ret
00872f30	ldr x8,[x24, #0x28]
00872f34	ldur x9,[x29, #-0x8]
00872f38	cmp x8,x9
00872f3c	b.ne 0x00872f7c
00872f40	bl 0x00849168
00872f44	mov x20,x0
00872f48	b 0x00872f5c
00872f5c	add x0,sp,#0x18
00872f60	bl 0x00872f80
00872f64	ldr x8,[x24, #0x28]
00872f68	ldur x9,[x29, #-0x8]
00872f6c	cmp x8,x9
00872f70	b.ne 0x00872f7c
00872f74	mov x0,x20
00872f78	bl 0x00c2c090
00872f7c	bl 0x00c2fec0
