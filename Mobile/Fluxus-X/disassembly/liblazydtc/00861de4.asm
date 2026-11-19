; FUN_00861de4 @ 00861de4
00861de4	sub sp,sp,#0x80
00861de8	stp x29,x30,[sp, #0x40]
00861dec	str x23,[sp, #0x50]
00861df0	stp x22,x21,[sp, #0x60]
00861df4	stp x20,x19,[sp, #0x70]
00861df8	add x29,sp,#0x40
00861dfc	mrs x22,tpidr_el0
00861e00	mov x19,x0
00861e04	ldr x8,[x22, #0x28]
00861e08	stur x8,[x29, #-0x8]
00861e0c	ldr w8,[x0, #0x90]
00861e10	cmp w8,#0x119
00861e14	b.ne 0x00861eb4
00861e18	ldur q0,[x19, #0x94]
00861e1c	ldr x20,[x19, #0xa8]
00861e20	mov x0,x19
00861e24	add x23,sp,#0x18
00861e28	stur q0,[sp, #0x20]
00861e2c	bl 0x00858f2c
00861e30	ldr x8,[x19, #0x1a8]
00861e34	mov w9,#0x1
00861e38	str x20,[sp, #0x18]
00861e3c	strb w9,[sp, #0x30]
00861e40	cbz x8,0x00861f44
00861e44	lsr x8,x20,#0x4
00861e48	mov x9,#0x7c15
00861e4c	movk x9,#0x7f4a, LSL #16
00861e50	eor x8,x8,x20, LSR #0x9
00861e54	movk x9,#0x79b9, LSL #32
00861e58	movk x9,#0x9e37, LSL #48
00861e5c	mul x8,x8,x9
00861e60	ldrb w9,[x19, #0x1b0]
00861e64	lsr x8,x8,x9
00861e68	ldr x9,[x19, #0x198]
00861e6c	lsr x10,x8,#0x6
00861e70	ldr x10,[x9, x10, LSL #0x3]
00861e74	lsr x10,x10,x8
00861e78	tbz w10,#0x0,0x00861f44
00861e7c	ldr x11,[x19, #0x1a0]
00861e80	ldr x10,[x19, #0x180]
00861e84	sub x11,x11,#0x1
00861e88	lsl x12,x8,#0x4
00861e8c	ldr x12,[x10, x12#0x0]
00861e90	cmp x12,x20
00861e94	b.eq 0x00861f00
00861e98	add x8,x8,#0x1
00861e9c	and x8,x8,x11
00861ea0	lsr x12,x8,#0x6
00861ea4	ldr x12,[x9, x12, LSL #0x3]
00861ea8	lsr x12,x12,x8
00861eac	tbnz w12,#0x0,0x00861e88
00861eb0	b 0x00861f44
00861eb4	mov x0,x19
00861eb8	bl 0x0086e040
00861ebc	ldp x9,x8,[x19, #0x1d0]
00861ec0	mov w1,#0x38
00861ec4	ldr x0,[x19, #0xe8]
00861ec8	mov w10,#0xffffffff
00861ecc	stp xzr,xzr,[sp, #0x18]
00861ed0	sub x8,x8,x9
00861ed4	mov w9,#0xaaab
00861ed8	lsr x8,x8,#0x4
00861edc	movk w9,#0xaaaa, LSL #16
00861ee0	madd w21,w8,w9,w10
00861ee4	bl 0x0084e938
00861ee8	add x1,x19,#0x94
00861eec	add x2,sp,#0x18
00861ef0	mov w3,w21
00861ef4	mov x20,x0
00861ef8	bl 0x0084f5e0
00861efc	b 0x00861f60
00861f00	add x8,x10,x8, LSL #0x4
00861f04	ldr x21,[x8, #0x8]
00861f08	cbz x21,0x00861f44
00861f0c	ldr x8,[x21, #0x20]
00861f10	ldr x9,[x19, #0x170]
00861f14	cmp x8,x9
00861f18	b.cs 0x00861f8c
00861f1c	stp xzr,xzr,[sp, #0x8]
00861f20	adrp x3,0x2a9000
00861f24	add x3,x3,#0x32b
00861f28	ldr x4,[x21]
00861f2c	add x1,x19,#0x94
00861f30	add x2,sp,#0x8
00861f34	mov x0,x19
00861f38	bl 0x008659e8
00861f3c	mov x20,x0
00861f40	b 0x00861f60
00861f44	ldr x0,[x19, #0xe8]
00861f48	mov w1,#0x28
00861f4c	bl 0x0084e938
00861f50	add x1,x23,#0x8
00861f54	add x2,sp,#0x18
00861f58	mov x20,x0
00861f5c	bl 0x0084ed38
00861f60	ldr x8,[x22, #0x28]
00861f64	ldur x9,[x29, #-0x8]
00861f68	cmp x8,x9
00861f6c	b.ne 0x00861fc8
00861f70	mov x0,x20
00861f74	ldp x20,x19,[sp, #0x70]
00861f78	ldr x23,[sp, #0x50]
00861f7c	ldp x22,x21,[sp, #0x60]
00861f80	ldp x29,x30,[sp, #0x40]
00861f84	add sp,sp,#0x80
00861f88	ret
00861f8c	ldp x10,x9,[x19, #0x158]
00861f90	mov w1,#0x30
00861f94	ldr x0,[x19, #0xe8]
00861f98	sub x9,x9,x10
00861f9c	asr x9,x9,#0x3
00861fa0	sub x9,x9,#0x1
00861fa4	cmp x8,x9
00861fa8	cset w19,ne
00861fac	bl 0x0084e938
00861fb0	add x1,x23,#0x8
00861fb4	mov x2,x21
00861fb8	mov w3,w19
00861fbc	mov x20,x0
00861fc0	bl 0x0084ece8
00861fc4	b 0x00861f60
00861fc8	bl 0x00c2fec0
