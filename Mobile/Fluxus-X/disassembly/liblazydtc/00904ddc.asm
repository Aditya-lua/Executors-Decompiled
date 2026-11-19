; FUN_00904ddc @ 00904ddc
00904ddc	stp x28,x23,[sp, #-0x40]!
00904de0	stp x22,x21,[sp, #0x10]
00904de4	stp x20,x19,[sp, #0x20]
00904de8	stp x29,x30,[sp, #0x30]
00904dec	add x29,sp,#0x30
00904df0	sub sp,sp,#0x900
00904df4	stp q6,q7,[sp, #0x60]
00904df8	stp q4,q5,[sp, #0x40]
00904dfc	stp q2,q3,[sp, #0x20]
00904e00	stp q0,q1,[sp]
00904e04	stp x6,x7,[sp, #0xa0]
00904e08	stp x4,x5,[sp, #0x90]
00904e0c	str x3,[sp, #0x88]
00904e10	mrs x22,tpidr_el0
00904e14	ldr x8,[x22, #0x28]
00904e18	mov x20,x2
00904e1c	mov x21,x1
00904e20	mov x19,x0
00904e24	stur x8,[x29, #-0x38]
00904e28	cbz x0,0x00904f54
00904e2c	ldrb w8,[x19, #0xa85]
00904e30	tbz w8,#0x4,0x00904f54
00904e34	ldr x8,[x19, #0x12a0]
00904e38	cbz x8,0x00904e50
00904e3c	cbz x21,0x00904f54
00904e40	ldr w9,[x8, #0x8]
00904e44	cmp w9,#0x0
00904e48	b.gt 0x00904e54
00904e4c	b 0x00904f54
00904e50	cbz x21,0x00904f54
00904e54	ldr x9,[x21]
00904e58	ldr w10,[x9, #0xc]
00904e5c	cmp w10,#0x1
00904e60	b.lt 0x00904f54
00904e64	cbz x8,0x00904e88
00904e68	ldr x3,[x8]
00904e6c	adrp x2,0x2a9000
00904e70	add x2,x2,#0x4a6
00904e74	add x0,sp,#0xf4
00904e78	mov w1,#0x800
00904e7c	bl 0x00c31b70
00904e80	ldr x9,[x21]
00904e84	b 0x00904e8c
00904e88	mov w0,wzr
00904e8c	ldr w4,[x21, #0x20]
00904e90	ldr x3,[x9]
00904e94	mov w9,#0x800
00904e98	sxtw x21,w0
00904e9c	add x8,sp,#0xf4
00904ea0	sub w9,w9,w0
00904ea4	add x8,x8,x21
00904ea8	sxtw x1,w9
00904eac	cbz w4,0x00904ec4
00904eb0	adrp x2,0x2cc000
00904eb4	add x2,x2,#0xc8d
00904eb8	mov x0,x8
00904ebc	bl 0x00c31b70
00904ec0	b 0x00904ed4
00904ec4	adrp x2,0x2a9000
00904ec8	add x2,x2,#0x4a6
00904ecc	mov x0,x8
00904ed0	bl 0x00c31b70
00904ed4	orr x8,xzr,#-0x7f00000080
00904ed8	mov x9,sp
00904edc	movk x8,#0xffd8
00904ee0	add x9,x9,#0x80
00904ee4	str x8,[sp, #0xe8]
00904ee8	str x9,[sp, #0xe0]
00904eec	ldr q0,[sp, #0xe0]
00904ef0	add x8,sp,#0x88
00904ef4	add x10,x29,#0x10
00904ef8	add x8,x8,#0x28
00904efc	stp x10,x8,[sp, #0xd0]
00904f00	str q0,[sp, #0xc0]
00904f04	ldr q0,[sp, #0xd0]
00904f08	add x21,x21,w0, SXTW 
00904f0c	mov w9,#0x800
00904f10	add x23,sp,#0xf4
00904f14	sub w8,w9,w21
00904f18	add x0,x23,x21
00904f1c	sxtw x1,w8
00904f20	add x3,sp,#0xb0
00904f24	mov x2,x20
00904f28	str q0,[sp, #0xb0]
00904f2c	bl 0x00c31b80
00904f30	sxtw x8,w0
00904f34	add x8,x8,w21, SXTW 
00904f38	mov w9,#0xa
00904f3c	add x3,x8,#0x1
00904f40	add x2,sp,#0xf4
00904f44	mov x0,x19
00904f48	mov w1,wzr
00904f4c	strh w9,[x23, x8#0x0]
00904f50	bl 0x00904a98
00904f54	ldr x8,[x22, #0x28]
00904f58	ldur x9,[x29, #-0x38]
00904f5c	cmp x8,x9
00904f60	b.ne 0x00904f7c
00904f64	add sp,sp,#0x900
00904f68	ldp x29,x30,[sp, #0x30]
00904f6c	ldp x20,x19,[sp, #0x20]
00904f70	ldp x22,x21,[sp, #0x10]
00904f74	ldp x28,x23,[sp], #0x40
00904f78	ret
00904f7c	bl 0x00c2fec0
