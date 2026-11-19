; FUN_00a92e58 @ 00a92e58
00a92e58	sub sp,sp,#0x80
00a92e5c	stp x24,x23,[sp, #0x40]
00a92e60	stp x22,x21,[sp, #0x50]
00a92e64	stp x20,x19,[sp, #0x60]
00a92e68	mov x20,x3
00a92e6c	mov x23,x2
00a92e70	mov x21,x1
00a92e74	lsr x8,x3,#0x1e
00a92e78	mov x19,x0
00a92e7c	stp x28,x27,[sp, #0x20]
00a92e80	stp x26,x25,[sp, #0x30]
00a92e84	stp x29,x30,[sp, #0x70]
00a92e88	add x29,sp,#0x70
00a92e8c	cbz x8,0x00a92f34
00a92e90	orr x28,xzr,#-0x40000000
00a92e94	add x8,x20,x28
00a92e98	str x8,[sp, #0x8]
00a92e9c	and x8,x8,#-0x40000000
00a92ea0	mov w22,#0x40000000
00a92ea4	add x27,x8,x22
00a92ea8	add x24,x19,#0x28
00a92eac	str x8,[sp]
00a92eb0	add x8,x23,x27
00a92eb4	mov x25,x21
00a92eb8	str x8,[sp, #0x10]
00a92ebc	mov x0,x19
00a92ec0	bl 0x00c3ceb0
00a92ec4	str w0,[sp, #0x1c]
00a92ec8	mov x0,x19
00a92ecc	bl 0x00c3cea0
00a92ed0	mov x26,x0
00a92ed4	mov x0,x19
00a92ed8	bl 0x00c3cec0
00a92edc	mov w6,w0
00a92ee0	mov w2,#0x40000000
00a92ee4	add x5,sp,#0x1c
00a92ee8	mov x0,x23
00a92eec	mov x1,x25
00a92ef0	mov x3,x26
00a92ef4	mov x4,x24
00a92ef8	bl 0x00c399c0
00a92efc	ldr w1,[sp, #0x1c]
00a92f00	mov x0,x19
00a92f04	bl 0x00c3ced0
00a92f08	add x20,x20,x28
00a92f0c	add x23,x23,x22
00a92f10	lsr x8,x20,#0x1e
00a92f14	add x25,x25,x22
00a92f18	cbnz x8,0x00a92ebc
00a92f1c	ldp x9,x8,[sp]
00a92f20	ldr x22,[sp, #0x10]
00a92f24	add x21,x21,x27
00a92f28	sub x20,x8,x9
00a92f2c	cbnz x20,0x00a92f3c
00a92f30	b 0x00a92f8c
00a92f34	mov x22,x23
00a92f38	cbz x20,0x00a92f8c
00a92f3c	mov x0,x19
00a92f40	bl 0x00c3ceb0
00a92f44	str w0,[sp, #0x18]
00a92f48	mov x0,x19
00a92f4c	bl 0x00c3cea0
00a92f50	mov x23,x0
00a92f54	mov x0,x19
00a92f58	add x24,x19,#0x28
00a92f5c	bl 0x00c3cec0
00a92f60	mov w6,w0
00a92f64	add x5,sp,#0x18
00a92f68	mov x0,x22
00a92f6c	mov x1,x21
00a92f70	mov x2,x20
00a92f74	mov x3,x23
00a92f78	mov x4,x24
00a92f7c	bl 0x00c399c0
00a92f80	ldr w1,[sp, #0x18]
00a92f84	mov x0,x19
00a92f88	bl 0x00c3ced0
00a92f8c	ldp x29,x30,[sp, #0x70]
00a92f90	ldp x20,x19,[sp, #0x60]
00a92f94	ldp x22,x21,[sp, #0x50]
00a92f98	ldp x24,x23,[sp, #0x40]
00a92f9c	ldp x26,x25,[sp, #0x30]
00a92fa0	ldp x28,x27,[sp, #0x20]
00a92fa4	mov w0,#0x1
00a92fa8	add sp,sp,#0x80
00a92fac	ret
