; mbedtls_ctr_drbg_random_with_add @ 00b73f3c
00b73f3c	sub sp,sp,#0xa0
00b73f40	stp x26,x25,[sp, #0x50]
00b73f44	stp x24,x23,[sp, #0x60]
00b73f48	stp x22,x21,[sp, #0x70]
00b73f4c	stp x20,x19,[sp, #0x80]
00b73f50	stp x29,x30,[sp, #0x90]
00b73f54	add x29,sp,#0x90
00b73f58	mrs x25,tpidr_el0
00b73f5c	ldr x8,[x25, #0x28]
00b73f60	mov x20,x2
00b73f64	mov x21,x1
00b73f68	mov x19,x0
00b73f6c	cmp x2,#0x400
00b73f70	str x8,[sp, #0x48]
00b73f74	b.ls 0x00b73f80
00b73f78	mov w23,#0xffffffca
00b73f7c	b 0x00b740ac
00b73f80	cmp x4,#0x100
00b73f84	b.ls 0x00b73f90
00b73f88	mov w23,#0xffffffc8
00b73f8c	b 0x00b740ac
00b73f90	movi v0.2D,#0x0
00b73f94	stur q0,[sp, #0x28]
00b73f98	stur q0,[sp, #0x18]
00b73f9c	stur q0,[sp, #0x8]
00b73fa0	ldr w8,[x19, #0x10]
00b73fa4	ldr w9,[x19, #0x20]
00b73fa8	cmp w8,w9
00b73fac	b.gt 0x00b73fb8
00b73fb0	ldr w8,[x19, #0x14]
00b73fb4	cbz w8,0x00b74070
00b73fb8	mov x0,x19
00b73fbc	mov x1,x3
00b73fc0	mov x2,x4
00b73fc4	mov x3,xzr
00b73fc8	bl 0x00b73d28
00b73fcc	mov w23,w0
00b73fd0	cbnz w0,0x00b740ac
00b73fd4	cbz x20,0x00b7404c
00b73fd8	add x8,sp,#0x8
00b73fdc	add x22,x19,#0x28
00b73fe0	add x24,x8,#0x30
00b73fe4	mov w26,#0x10
00b73fe8	orr w8,wzr,#0xc
00b73fec	ldr w9,[x19, x8#0x0]
00b73ff0	rev w9,w9
00b73ff4	add w9,w9,#0x1
00b73ff8	rev w10,w9
00b73ffc	str w10,[x19, x8#0x0]
00b74000	cbz x8,0x00b7400c
00b74004	sub x8,x8,#0x4
00b74008	cbz w9,0x00b73fec
00b7400c	mov w1,#0x1
00b74010	mov x0,x22
00b74014	mov x2,x19
00b74018	mov x3,x24
00b7401c	bl 0x00c418e0
00b74020	mov w23,w0
00b74024	cbnz w0,0x00b740a0
00b74028	cmp x20,#0x10
00b7402c	csel x23,x20,x26,cc
00b74030	mov x0,x21
00b74034	mov x1,x24
00b74038	mov x2,x23
00b7403c	bl 0x00c2ffd0
00b74040	subs x20,x20,x23
00b74044	add x21,x21,x23
00b74048	b.ne 0x00b73fe8
00b7404c	add x1,sp,#0x8
00b74050	mov x0,x19
00b74054	bl 0x00b73b88
00b74058	mov w23,w0
00b7405c	cbnz w0,0x00b740a0
00b74060	ldr w8,[x19, #0x10]
00b74064	add w8,w8,#0x1
00b74068	str w8,[x19, #0x10]
00b7406c	b 0x00b740a0
00b74070	cbz x4,0x00b73fd4
00b74074	add x0,sp,#0x8
00b74078	mov x1,x3
00b7407c	mov x2,x4
00b74080	bl 0x00b7389c
00b74084	mov w23,w0
00b74088	cbnz w0,0x00b740a0
00b7408c	add x1,sp,#0x8
00b74090	mov x0,x19
00b74094	bl 0x00b73b88
00b74098	mov w23,w0
00b7409c	cbz w0,0x00b73fd4
00b740a0	add x0,sp,#0x8
00b740a4	mov w1,#0x40
00b740a8	bl 0x00c42220
00b740ac	ldr x8,[x25, #0x28]
00b740b0	ldr x9,[sp, #0x48]
00b740b4	cmp x8,x9
00b740b8	b.ne 0x00b740dc
00b740bc	mov w0,w23
00b740c0	ldp x29,x30,[sp, #0x90]
00b740c4	ldp x20,x19,[sp, #0x80]
00b740c8	ldp x22,x21,[sp, #0x70]
00b740cc	ldp x24,x23,[sp, #0x60]
00b740d0	ldp x26,x25,[sp, #0x50]
00b740d4	add sp,sp,#0xa0
00b740d8	ret
00b740dc	bl 0x00c2fec0
