; bn_mul_normal @ 00a09e78
00a09e78	sub sp,sp,#0x70
00a09e7c	cmp w2,w4
00a09e80	stp x22,x21,[sp, #0x40]
00a09e84	csel w22,w2,w4,lt
00a09e88	stp x26,x25,[sp, #0x20]
00a09e8c	stp x20,x19,[sp, #0x50]
00a09e90	csel w19,w4,w2,lt
00a09e94	csel x25,x1,x3,lt
00a09e98	csel x20,x3,x1,lt
00a09e9c	cmp w22,#0x0
00a09ea0	mov x21,x0
00a09ea4	stp x28,x27,[sp, #0x10]
00a09ea8	stp x24,x23,[sp, #0x30]
00a09eac	stp x29,x30,[sp, #0x60]
00a09eb0	add x29,sp,#0x60
00a09eb4	b.le 0x00a09fb0
00a09eb8	ldr x3,[x25]
00a09ebc	mov x0,x21
00a09ec0	mov x1,x20
00a09ec4	mov w2,w19
00a09ec8	add x23,x21,w19, SXTW  #0x3
00a09ecc	bl 0x00c38900
00a09ed0	cmp w22,#0x1
00a09ed4	str x23,[sp, #0x8]
00a09ed8	str x0,[x23]
00a09edc	b.eq 0x00a09f90
00a09ee0	mov x24,xzr
00a09ee4	add x25,x25,#0x10
00a09ee8	add x8,x25,x24
00a09eec	ldur x3,[x8, #-0x8]
00a09ef0	add x23,x21,x24
00a09ef4	add x0,x23,#0x8
00a09ef8	mov x1,x20
00a09efc	mov w2,w19
00a09f00	bl 0x00c388d0
00a09f04	ldr x8,[sp, #0x8]
00a09f08	cmp w22,#0x2
00a09f0c	add x26,x8,x24
00a09f10	str x0,[x26, #0x8]
00a09f14	b.eq 0x00a09f90
00a09f18	ldr x3,[x25, x24#0x0]
00a09f1c	add x0,x23,#0x10
00a09f20	mov x1,x20
00a09f24	mov w2,w19
00a09f28	bl 0x00c388d0
00a09f2c	cmp w22,#0x4
00a09f30	str x0,[x26, #0x10]
00a09f34	b.lt 0x00a09f90
00a09f38	add x27,x25,x24
00a09f3c	ldr x3,[x27, #0x8]
00a09f40	add x28,x21,x24
00a09f44	add x0,x28,#0x18
00a09f48	mov x1,x20
00a09f4c	mov w2,w19
00a09f50	bl 0x00c388d0
00a09f54	ldr x8,[sp, #0x8]
00a09f58	subs w26,w22,#0x4
00a09f5c	add x23,x8,x24
00a09f60	str x0,[x23, #0x18]
00a09f64	b.eq 0x00a09f90
00a09f68	ldr x3,[x27, #0x10]
00a09f6c	add x0,x28,#0x20
00a09f70	mov x1,x20
00a09f74	mov w2,w19
00a09f78	bl 0x00c388d0
00a09f7c	cmp w22,#0x5
00a09f80	add x24,x24,#0x20
00a09f84	mov w22,w26
00a09f88	str x0,[x23, #0x20]
00a09f8c	b.gt 0x00a09ee8
00a09f90	ldp x29,x30,[sp, #0x60]
00a09f94	ldp x20,x19,[sp, #0x50]
00a09f98	ldp x22,x21,[sp, #0x40]
00a09f9c	ldp x24,x23,[sp, #0x30]
00a09fa0	ldp x26,x25,[sp, #0x20]
00a09fa4	ldp x28,x27,[sp, #0x10]
00a09fa8	add sp,sp,#0x70
00a09fac	ret
00a09fb0	mov x0,x21
00a09fb4	mov x1,x20
00a09fb8	mov w2,w19
00a09fbc	ldp x29,x30,[sp, #0x60]
00a09fc0	ldp x20,x19,[sp, #0x50]
00a09fc4	ldp x22,x21,[sp, #0x40]
00a09fc8	ldp x24,x23,[sp, #0x30]
00a09fcc	ldp x26,x25,[sp, #0x20]
00a09fd0	ldp x28,x27,[sp, #0x10]
00a09fd4	mov x3,xzr
00a09fd8	add sp,sp,#0x70
00a09fdc	b 0x00c38900
