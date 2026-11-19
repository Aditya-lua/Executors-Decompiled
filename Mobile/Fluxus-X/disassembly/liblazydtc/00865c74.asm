; FUN_00865c74 @ 00865c74
00865c74	sub sp,sp,#0xd0
00865c78	stp x29,x30,[sp, #0x70]
00865c7c	stp x28,x27,[sp, #0x80]
00865c80	stp x26,x25,[sp, #0x90]
00865c84	stp x24,x23,[sp, #0xa0]
00865c88	stp x22,x21,[sp, #0xb0]
00865c8c	stp x20,x19,[sp, #0xc0]
00865c90	add x29,sp,#0x70
00865c94	mrs x24,tpidr_el0
00865c98	mov x25,x8
00865c9c	mov x22,x3
00865ca0	ldr x8,[x24, #0x28]
00865ca4	mov x19,x0
00865ca8	stur x8,[x29, #-0x8]
00865cac	tbz w2,#0x0,0x00865d40
00865cb0	ldr q0,[x1]
00865cb4	ldr x8,[x19, #0x128]
00865cb8	add x0,x19,#0x180
00865cbc	add x1,sp,#0x38
00865cc0	stp xzr,xzr,[sp, #0x50]
00865cc4	stur q0,[sp, #0x40]
00865cc8	str x8,[sp, #0x38]
00865ccc	strb wzr,[sp, #0x60]
00865cd0	bl 0x0086e18c
00865cd4	ldp x8,x20,[x19, #0x158]
00865cd8	mov x21,x0
00865cdc	ldr x0,[x19, #0xe8]
00865ce0	mov w1,#0x40
00865ce4	sub x8,x20,x8
00865ce8	asr x8,x8,#0x3
00865cec	sub x23,x8,#0x1
00865cf0	bl 0x0084e938
00865cf4	ldr x8,[sp, #0x38]
00865cf8	ldr x9,[sp, #0x50]
00865cfc	mov x1,x21
00865d00	ldr x10,[x21]
00865d04	ldur w11,[x20, #-0x4]
00865d08	ldrb w12,[sp, #0x60]
00865d0c	str x8,[x0]
00865d10	ldur q0,[sp, #0x40]
00865d14	stp x10,x23,[x0, #0x18]
00865d18	str x11,[x0, #0x28]
00865d1c	strb w12,[x0, #0x30]
00865d20	stur q0,[x0, #0x8]
00865d24	strb wzr,[x0, #0x31]
00865d28	str x9,[x0, #0x38]
00865d2c	str x0,[x21]
00865d30	add x0,x19,#0x1b8
00865d34	bl 0x0086e2d0
00865d38	ldr x9,[x21]
00865d3c	b 0x00865d44
00865d40	mov x9,xzr
00865d44	ldr x11,[x19, #0x320]
00865d48	ldr x10,[x19, #0x318]
00865d4c	ldr x8,[x22, #0x10]
00865d50	sub x12,x11,x10
00865d54	cbz x8,0x00865e88
00865d58	mov x26,xzr
00865d5c	mov x23,xzr
00865d60	mov x28,xzr
00865d64	add x21,x19,#0x318
00865d68	stp x11,x10,[sp, #0x8]
00865d6c	stp x9,x25,[sp, #0x18]
00865d70	stp x12,x24,[sp, #0x28]
00865d74	ldp x8,x9,[x22]
00865d78	mov w10,#0x30
00865d7c	ldr x8,[x8]
00865d80	nop
00865d84	madd x25,x9,x10,x8
00865d88	add x0,x19,#0x180
00865d8c	add x1,x25,x26
00865d90	bl 0x0086e18c
00865d94	ldp x20,x27,[x19, #0x158]
00865d98	mov x24,x0
00865d9c	ldr x0,[x19, #0xe8]
00865da0	mov w1,#0x40
00865da4	bl 0x0084e938
00865da8	add x8,x25,x26
00865dac	sub x9,x27,x20
00865db0	ldr x11,[x24]
00865db4	ldr x10,[x8]
00865db8	ldur w12,[x27, #-0x4]
00865dbc	asr x9,x9,#0x3
00865dc0	ldr x13,[x8, #0x18]
00865dc4	ldrb w14,[x8, #0x28]
00865dc8	str x10,[x0]
00865dcc	sub x9,x9,#0x1
00865dd0	ldur q0,[x8, #0x8]
00865dd4	stp x11,x9,[x0, #0x18]
00865dd8	str x12,[x0, #0x28]
00865ddc	strb w14,[x0, #0x30]
00865de0	strb wzr,[x0, #0x31]
00865de4	stur q0,[x0, #0x8]
00865de8	str x13,[x0, #0x38]
00865dec	str x0,[x24]
00865df0	add x0,x19,#0x1b8
00865df4	mov x1,x24
00865df8	bl 0x0086e2d0
00865dfc	ldr x8,[x24]
00865e00	str x8,[sp, #0x38]
00865e04	add x1,sp,#0x38
00865e08	mov x0,x21
00865e0c	bl 0x0086e2d0
00865e10	ldr x8,[x22, #0x10]
00865e14	add x28,x28,#0x1
00865e18	add x23,x23,#0x8
00865e1c	add x26,x26,#0x30
00865e20	cmp x28,x8
00865e24	b.cc 0x00865d74
00865e28	ldr x20,[x19, #0x318]
00865e2c	ldr x0,[x19, #0xe8]
00865e30	mov x1,x23
00865e34	bl 0x0084e938
00865e38	ldp x12,x24,[sp, #0x28]
00865e3c	cmp x28,#0x8
00865e40	ldr x25,[sp, #0x20]
00865e44	b.cc 0x00865e60
00865e48	ldp x9,x8,[sp, #0x8]
00865e4c	add x8,x8,x0
00865e50	add x9,x20,x9
00865e54	sub x8,x8,x9
00865e58	cmp x8,#0x20
00865e5c	b.cs 0x00865efc
00865e60	mov x8,xzr
00865e64	add x9,x20,x12
00865e68	ldr x10,[x9, x8, LSL #0x3]
00865e6c	str x10,[x0, x8, LSL #0x3]
00865e70	add x8,x8,#0x1
00865e74	cmp x28,x8
00865e78	b.ne 0x00865e68
00865e7c	ldr x10,[x21]
00865e80	ldr x9,[sp, #0x18]
00865e84	b 0x00865e90
00865e88	mov x28,xzr
00865e8c	mov x0,xzr
00865e90	ldr x8,[x19, #0x320]
00865e94	add x21,x12,x10
00865e98	stp x9,x0,[x25]
00865e9c	str x28,[x25, #0x10]
00865ea0	cmp x21,x8
00865ea4	b.eq 0x00865ecc
00865ea8	sub x9,x8,x21
00865eac	add x1,x21,x9
00865eb0	subs x20,x8,x1
00865eb4	b.eq 0x00865ec4
00865eb8	mov x0,x21
00865ebc	mov x2,x20
00865ec0	bl 0x00c2ff60
00865ec4	add x8,x21,x20
00865ec8	str x8,[x19, #0x320]
00865ecc	ldr x8,[x24, #0x28]
00865ed0	ldur x9,[x29, #-0x8]
00865ed4	cmp x8,x9
00865ed8	b.ne 0x00865f94
00865edc	ldp x20,x19,[sp, #0xc0]
00865ee0	ldp x22,x21,[sp, #0xb0]
00865ee4	ldp x24,x23,[sp, #0xa0]
00865ee8	ldp x26,x25,[sp, #0x90]
00865eec	ldp x28,x27,[sp, #0x80]
00865ef0	ldp x29,x30,[sp, #0x70]
00865ef4	add sp,sp,#0xd0
00865ef8	ret
00865efc	and x8,x28,#-0x4
00865f00	add x10,x12,x20
00865f04	add x9,x0,#0x10
00865f08	add x10,x10,#0x10
00865f0c	mov x11,x8
00865f10	ldp q0,q1,[x10, #-0x10]
00865f14	subs x11,x11,#0x4
00865f18	add x10,x10,#0x20
00865f1c	stp q0,q1,[x9, #-0x10]
00865f20	add x9,x9,#0x20
00865f24	b.ne 0x00865f10
00865f28	cmp x28,x8
00865f2c	b.eq 0x00865e7c
00865f30	b 0x00865e64
00865f94	bl 0x00c2fec0
