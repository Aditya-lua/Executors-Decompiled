; mbedtls_des3_set3key_enc @ 00b74f38
00b74f38	sub sp,sp,#0x1d0
00b74f3c	str x28,[sp, #0x190]
00b74f40	stp x22,x21,[sp, #0x1a0]
00b74f44	stp x20,x19,[sp, #0x1b0]
00b74f48	stp x29,x30,[sp, #0x1c0]
00b74f4c	add x29,sp,#0x1c0
00b74f50	mrs x21,tpidr_el0
00b74f54	ldr x8,[x21, #0x28]
00b74f58	mov x20,x1
00b74f5c	mov x19,x0
00b74f60	stur x8,[x29, #-0x38]
00b74f64	bl 0x00c424b0
00b74f68	add x22,sp,#0x8
00b74f6c	add x0,x22,#0x80
00b74f70	add x1,x20,#0x8
00b74f74	bl 0x00c424b0
00b74f78	add x0,x19,#0x100
00b74f7c	add x1,x20,#0x10
00b74f80	bl 0x00c424b0
00b74f84	mov x8,xzr
00b74f88	mov x9,xzr
00b74f8c	mov w10,#0x178
00b74f90	add x11,x19,x10
00b74f94	ldr x12,[x11]
00b74f98	add x13,x22,x8
00b74f9c	add x14,x22,x10
00b74fa0	add x9,x9,#0x2
00b74fa4	str x12,[x13]
00b74fa8	ldur x12,[x14, #-0x80]
00b74fac	add x14,x19,x8
00b74fb0	sub x10,x10,#0x8
00b74fb4	cmp x9,#0x20
00b74fb8	str x12,[x14, #0x80]
00b74fbc	ldur x11,[x11, #-0x100]
00b74fc0	add x8,x8,#0x8
00b74fc4	str x11,[x13, #0x100]
00b74fc8	b.cc 0x00b74f90
00b74fcc	add x0,sp,#0x8
00b74fd0	orr w1,wzr,#0x180
00b74fd4	bl 0x00c42220
00b74fd8	ldr x8,[x21, #0x28]
00b74fdc	ldur x9,[x29, #-0x38]
00b74fe0	cmp x8,x9
00b74fe4	b.ne 0x00b75004
00b74fe8	ldp x29,x30,[sp, #0x1c0]
00b74fec	ldp x20,x19,[sp, #0x1b0]
00b74ff0	ldp x22,x21,[sp, #0x1a0]
00b74ff4	ldr x28,[sp, #0x190]
00b74ff8	mov w0,wzr
00b74ffc	add sp,sp,#0x1d0
00b75000	ret
00b75004	bl 0x00c2fec0
