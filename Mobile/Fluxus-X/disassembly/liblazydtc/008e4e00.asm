; log_internal_impl @ 008e4e00
008e4e00	stp x29,x30,[sp, #-0x20]!
008e4e04	stp x20,x19,[sp, #0x10]
008e4e08	sub sp,sp,#0x4f0
008e4e0c	adrp x8,0xcc4000
008e4e10	ldr w8,[x8, #0x660]
008e4e14	stp x2,x3,[sp, #0x80]
008e4e18	stp x4,x5,[sp, #0x90]
008e4e1c	stp x6,x7,[sp, #0xa0]
008e4e20	cmp w8,w0
008e4e24	stp q1,q2,[sp, #0x10]
008e4e28	str q3,[sp, #0x30]
008e4e2c	str q0,[sp]
008e4e30	stp q4,q5,[sp, #0x40]
008e4e34	stp q6,q7,[sp, #0x60]
008e4e38	b.hi 0x008e4f40
008e4e3c	adrp x12,0xd1f000
008e4e40	ldrb w12,[x12, #0xee4]
008e4e44	mov x8,#-0x30
008e4e48	mov x10,sp
008e4e4c	add x11,sp,#0x80
008e4e50	mov x19,x1
008e4e54	movk x8,#0xff80, LSL #32
008e4e58	add x9,sp,#0x510
008e4e5c	add x10,x10,#0x80
008e4e60	add x11,x11,#0x30
008e4e64	cmp w12,#0x1
008e4e68	str x8,[sp, #0x4c8]
008e4e6c	str x10,[sp, #0x4c0]
008e4e70	str x9,[sp, #0x4b0]
008e4e74	str x11,[sp, #0x4b8]
008e4e78	b.ne 0x008e4f04
008e4e7c	bl 0x008e4f54
008e4e80	cbz w0,0x008e4eec
008e4e84	add x0,sp,#0xb0
008e4e88	mov w2,#0x400
008e4e8c	mov w1,wzr
008e4e90	bl 0x00c301c0
008e4e94	ldr q0,[sp, #0x4b0]
008e4e98	ldr q1,[sp, #0x4c0]
008e4e9c	add x0,sp,#0xb0
008e4ea0	add x3,sp,#0x4d0
008e4ea4	mov w1,#0x3ff
008e4ea8	mov x2,x19
008e4eac	str q0,[sp, #0x4d0]
008e4eb0	str q1,[sp, #0x4e0]
008e4eb4	bl 0x00c30740
008e4eb8	bl 0x008e4fac
008e4ebc	adrp x20,0xd1f000
008e4ec0	bl 0x008e4f98
008e4ec4	cmn x0,#0x1
008e4ec8	b.ne 0x008e4ee0
008e4ecc	str xzr,[x20, #0xef0]
008e4ed0	bl 0x008e4f54
008e4ed4	cbz w0,0x008e4ee0
008e4ed8	bl 0x008e4fac
008e4edc	bl 0x008e4f98
008e4ee0	ldr x0,[x20, #0xef0]
008e4ee4	bl 0x00c30c50
008e4ee8	b 0x008e4f04
008e4eec	ldr q0,[sp, #0x4b0]
008e4ef0	ldr q1,[sp, #0x4c0]
008e4ef4	add x1,sp,#0xb0
008e4ef8	mov x0,x19
008e4efc	stp q0,q1,[sp, #0xb0]
008e4f00	bl 0x00c30c70
008e4f04	adrp x8,0xd1f000
008e4f08	add x8,x8,#0xee0
008e4f0c	ldrb w9,[x8]
008e4f10	tbnz w9,#0x0,0x008e4f40
008e4f14	ldrb w8,[x8, #0x4]
008e4f18	tbnz w8,#0x0,0x008e4f40
008e4f1c	ldr q0,[sp, #0x4b0]
008e4f20	ldr q1,[sp, #0x4c0]
008e4f24	adrp x1,0x2a5000
008e4f28	add x1,x1,#0x283
008e4f2c	add x3,sp,#0xb0
008e4f30	mov w0,#0x4
008e4f34	mov x2,x19
008e4f38	stp q0,q1,[sp, #0xb0]
008e4f3c	bl 0x00c30b50
008e4f40	mov w0,wzr
008e4f44	add sp,sp,#0x4f0
008e4f48	ldp x20,x19,[sp, #0x10]
008e4f4c	ldp x29,x30,[sp], #0x20
008e4f50	ret
