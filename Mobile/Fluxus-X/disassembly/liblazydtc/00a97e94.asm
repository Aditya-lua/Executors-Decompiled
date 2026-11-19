; FUN_00a97e94 @ 00a97e94
00a97e94	sub sp,sp,#0x80
00a97e98	stp x24,x23,[sp, #0x40]
00a97e9c	stp x22,x21,[sp, #0x50]
00a97ea0	stp x20,x19,[sp, #0x60]
00a97ea4	mov x19,x3
00a97ea8	mov x23,x2
00a97eac	mov x20,x1
00a97eb0	lsr x8,x3,#0x1e
00a97eb4	mov x21,x0
00a97eb8	stp x28,x27,[sp, #0x20]
00a97ebc	stp x26,x25,[sp, #0x30]
00a97ec0	stp x29,x30,[sp, #0x70]
00a97ec4	add x29,sp,#0x70
00a97ec8	cbz x8,0x00a97f54
00a97ecc	orr x28,xzr,#-0x40000000
00a97ed0	add x8,x19,x28
00a97ed4	str x8,[sp, #0x10]
00a97ed8	and x8,x8,#-0x40000000
00a97edc	mov w22,#0x40000000
00a97ee0	add x27,x8,x22
00a97ee4	add x24,x21,#0x28
00a97ee8	str x8,[sp, #0x8]
00a97eec	add x8,x23,x27
00a97ef0	mov x25,x20
00a97ef4	str x8,[sp, #0x18]
00a97ef8	mov x0,x21
00a97efc	bl 0x00c3cea0
00a97f00	mov x26,x0
00a97f04	mov x0,x21
00a97f08	bl 0x00c3cec0
00a97f0c	mov w5,w0
00a97f10	mov w2,#0x40000000
00a97f14	mov x0,x23
00a97f18	mov x1,x25
00a97f1c	mov x3,x26
00a97f20	mov x4,x24
00a97f24	bl 0x00c3e520
00a97f28	add x19,x19,x28
00a97f2c	add x23,x23,x22
00a97f30	lsr x8,x19,#0x1e
00a97f34	add x25,x25,x22
00a97f38	cbnz x8,0x00a97ef8
00a97f3c	ldp x9,x8,[sp, #0x8]
00a97f40	ldr x22,[sp, #0x18]
00a97f44	add x20,x20,x27
00a97f48	sub x19,x8,x9
00a97f4c	cbnz x19,0x00a97f5c
00a97f50	b 0x00a97f90
00a97f54	mov x22,x23
00a97f58	cbz x19,0x00a97f90
00a97f5c	mov x0,x21
00a97f60	bl 0x00c3cea0
00a97f64	mov x23,x0
00a97f68	mov x0,x21
00a97f6c	add x24,x21,#0x28
00a97f70	bl 0x00c3cec0
00a97f74	mov w5,w0
00a97f78	mov x0,x22
00a97f7c	mov x1,x20
00a97f80	mov x2,x19
00a97f84	mov x3,x23
00a97f88	mov x4,x24
00a97f8c	bl 0x00c3e520
00a97f90	ldp x29,x30,[sp, #0x70]
00a97f94	ldp x20,x19,[sp, #0x60]
00a97f98	ldp x22,x21,[sp, #0x50]
00a97f9c	ldp x24,x23,[sp, #0x40]
00a97fa0	ldp x26,x25,[sp, #0x30]
00a97fa4	ldp x28,x27,[sp, #0x20]
00a97fa8	mov w0,#0x1
00a97fac	add sp,sp,#0x80
00a97fb0	ret
