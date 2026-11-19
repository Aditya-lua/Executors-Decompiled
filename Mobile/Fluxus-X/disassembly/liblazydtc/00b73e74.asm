; mbedtls_ctr_drbg_seed @ 00b73e74
00b73e74	sub sp,sp,#0x70
00b73e78	str x23,[sp, #0x30]
00b73e7c	stp x22,x21,[sp, #0x40]
00b73e80	stp x20,x19,[sp, #0x50]
00b73e84	stp x29,x30,[sp, #0x60]
00b73e88	add x29,sp,#0x60
00b73e8c	mrs x23,tpidr_el0
00b73e90	ldr x8,[x23, #0x28]
00b73e94	movi v0.2D,#0x0
00b73e98	mov x19,x4
00b73e9c	mov x20,x3
00b73ea0	str x8,[sp, #0x28]
00b73ea4	stur q0,[sp, #0x18]
00b73ea8	stur q0,[sp, #0x8]
00b73eac	ldr x8,[x0, #0x18]
00b73eb0	mov x21,x0
00b73eb4	stp x1,x2,[x0, #0x148]
00b73eb8	cbz x8,0x00b73f14
00b73ebc	ldrsw x22,[x21, #0x10]
00b73ec0	tbnz w22,#0x1f,0x00b73f24
00b73ec4	add x0,x21,#0x28
00b73ec8	add x1,sp,#0x8
00b73ecc	mov w2,#0x100
00b73ed0	bl 0x00c41940
00b73ed4	cbnz w0,0x00b73eec
00b73ed8	mov x0,x21
00b73edc	mov x1,x20
00b73ee0	mov x2,x19
00b73ee4	mov x3,x22
00b73ee8	bl 0x00b73d28
00b73eec	ldr x8,[x23, #0x28]
00b73ef0	ldr x9,[sp, #0x28]
00b73ef4	cmp x8,x9
00b73ef8	b.ne 0x00b73f38
00b73efc	ldp x29,x30,[sp, #0x60]
00b73f00	ldp x20,x19,[sp, #0x50]
00b73f04	ldp x22,x21,[sp, #0x40]
00b73f08	ldr x23,[sp, #0x30]
00b73f0c	add sp,sp,#0x70
00b73f10	ret
00b73f14	orr w8,wzr,#0x30
00b73f18	str x8,[x21, #0x18]
00b73f1c	ldrsw x22,[x21, #0x10]
00b73f20	tbz w22,#0x1f,0x00b73ec4
00b73f24	add x9,x8,#0x1
00b73f28	lsr x9,x9,#0x1
00b73f2c	cmp x8,#0x2f
00b73f30	csel x22,xzr,x9,hi
00b73f34	b 0x00b73ec4
00b73f38	bl 0x00c2fec0
