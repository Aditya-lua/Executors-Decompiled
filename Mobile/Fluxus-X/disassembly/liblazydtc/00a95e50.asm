; FUN_00a95e50 @ 00a95e50
00a95e50	sub sp,sp,#0x80
00a95e54	stp x24,x23,[sp, #0x40]
00a95e58	stp x22,x21,[sp, #0x50]
00a95e5c	stp x20,x19,[sp, #0x60]
00a95e60	mov x20,x3
00a95e64	mov x23,x2
00a95e68	mov x21,x1
00a95e6c	lsr x8,x3,#0x1e
00a95e70	mov x19,x0
00a95e74	stp x28,x27,[sp, #0x20]
00a95e78	stp x26,x25,[sp, #0x30]
00a95e7c	stp x29,x30,[sp, #0x70]
00a95e80	add x29,sp,#0x70
00a95e84	cbz x8,0x00a95f0c
00a95e88	orr x27,xzr,#-0x40000000
00a95e8c	add x8,x20,x27
00a95e90	and x28,x8,#-0x40000000
00a95e94	mov w26,#0x40000000
00a95e98	add x22,x28,x26
00a95e9c	add x24,x19,#0x28
00a95ea0	str x8,[sp, #0x8]
00a95ea4	add x8,x23,x22
00a95ea8	mov x25,x21
00a95eac	str x8,[sp, #0x10]
00a95eb0	mov x0,x19
00a95eb4	bl 0x00c3ceb0
00a95eb8	str w0,[sp, #0x1c]
00a95ebc	mov x0,x19
00a95ec0	bl 0x00c3cea0
00a95ec4	mov x3,x0
00a95ec8	mov w2,#0x40000000
00a95ecc	add x5,sp,#0x1c
00a95ed0	mov x0,x23
00a95ed4	mov x1,x25
00a95ed8	mov x4,x24
00a95edc	bl 0x00c3dde0
00a95ee0	ldr w1,[sp, #0x1c]
00a95ee4	mov x0,x19
00a95ee8	bl 0x00c3ced0
00a95eec	add x20,x20,x27
00a95ef0	add x23,x23,x26
00a95ef4	lsr x8,x20,#0x1e
00a95ef8	add x25,x25,x26
00a95efc	cbnz x8,0x00a95eb0
00a95f00	ldp x8,x23,[sp, #0x8]
00a95f04	add x21,x21,x22
00a95f08	sub x20,x8,x28
00a95f0c	cbz x20,0x00a95f4c
00a95f10	mov x0,x19
00a95f14	bl 0x00c3ceb0
00a95f18	str w0,[sp, #0x18]
00a95f1c	mov x0,x19
00a95f20	bl 0x00c3cea0
00a95f24	mov x3,x0
00a95f28	add x4,x19,#0x28
00a95f2c	add x5,sp,#0x18
00a95f30	mov x0,x23
00a95f34	mov x1,x21
00a95f38	mov x2,x20
00a95f3c	bl 0x00c3dde0
00a95f40	ldr w1,[sp, #0x18]
00a95f44	mov x0,x19
00a95f48	bl 0x00c3ced0
00a95f4c	ldp x29,x30,[sp, #0x70]
00a95f50	ldp x20,x19,[sp, #0x60]
00a95f54	ldp x22,x21,[sp, #0x50]
00a95f58	ldp x24,x23,[sp, #0x40]
00a95f5c	ldp x26,x25,[sp, #0x30]
00a95f60	ldp x28,x27,[sp, #0x20]
00a95f64	mov w0,#0x1
00a95f68	add sp,sp,#0x80
00a95f6c	ret
