; ix::SocketOpenSSL::openSSLClientHandshake @ 009a3f58
009a3f58	sub sp,sp,#0x60
009a3f5c	str x23,[sp, #0x20]
009a3f60	stp x22,x21,[sp, #0x30]
009a3f64	stp x20,x19,[sp, #0x40]
009a3f68	stp x29,x30,[sp, #0x50]
009a3f6c	add x29,sp,#0x50
009a3f70	mrs x23,tpidr_el0
009a3f74	ldr x8,[x23, #0x28]
009a3f78	mov x21,x3
009a3f7c	mov x19,x2
009a3f80	mov x20,x0
009a3f84	str x8,[sp, #0x18]
009a3f88	ldr x8,[x20, #0x40]
009a3f8c	cbz x8,0x009a4000
009a3f90	ldr x8,[x20, #0x48]
009a3f94	cbz x8,0x009a4000
009a3f98	ldr x0,[x21, #0x20]
009a3f9c	cbz x0,0x009a40b8
009a3fa0	ldr x8,[x0]
009a3fa4	ldr x8,[x8, #0x30]
009a3fa8	blr x8
009a3fac	tbnz w0,#0x0,0x009a4008
009a3fb0	bl 0x00c323e0
009a3fb4	ldr x0,[x20, #0x40]
009a3fb8	bl 0x00c32890
009a3fbc	mov w22,w0
009a3fc0	cmp w0,#0x1
009a3fc4	b.eq 0x009a4024
009a3fc8	ldr x0,[x20, #0x40]
009a3fcc	mov w1,w22
009a3fd0	bl 0x00c32910
009a3fd4	orr w8,w0,#0x1
009a3fd8	cmp w8,#0x3
009a3fdc	b.eq 0x009a3f88
009a3fe0	mov x8,sp
009a3fe4	mov x0,x20
009a3fe8	mov w1,w22
009a3fec	bl 0x00c33fa0
009a3ff0	ldrb w8,[x19]
009a3ff4	tbnz w8,#0x0,0x009a4034
009a3ff8	strh wzr,[x19]
009a3ffc	b 0x009a4054
009a4000	mov w0,wzr
009a4004	b 0x009a4068
009a4008	adrp x1,0x2af000
009a400c	add x1,x1,#0x7ef
009a4010	mov w2,#0x16
009a4014	mov x0,x19
009a4018	bl 0x00c31090
009a401c	mov w0,wzr
009a4020	b 0x009a4068
009a4024	ldrb w8,[x20, #0xb9]
009a4028	cbz w8,0x009a4090
009a402c	mov w0,#0x1
009a4030	b 0x009a4068
009a4034	ldr x8,[x19, #0x10]
009a4038	strb wzr,[x8]
009a403c	ldrb w8,[x19]
009a4040	str xzr,[x19, #0x8]
009a4044	tbz w8,#0x0,0x009a4054
009a4048	ldr x0,[x19, #0x10]
009a404c	bl 0x00c301d0
009a4050	str xzr,[x19]
009a4054	ldr x8,[sp, #0x10]
009a4058	mov w0,wzr
009a405c	str x8,[x19, #0x10]
009a4060	ldr q0,[sp]
009a4064	str q0,[x19]
009a4068	ldr x8,[x23, #0x28]
009a406c	ldr x9,[sp, #0x18]
009a4070	cmp x8,x9
009a4074	b.ne 0x009a40e4
009a4078	ldp x29,x30,[sp, #0x50]
009a407c	ldp x20,x19,[sp, #0x40]
009a4080	ldp x22,x21,[sp, #0x30]
009a4084	ldr x23,[sp, #0x20]
009a4088	add sp,sp,#0x60
009a408c	ret
009a4090	ldr x0,[x20, #0x40]
009a4094	bl 0x00c328e0
009a4098	cbz x0,0x009a40a8
009a409c	bl 0x00c31a90
009a40a0	mov w0,#0x1
009a40a4	b 0x009a4068
009a40a8	adrp x1,0x29d000
009a40ac	add x1,x1,#0xa95
009a40b0	orr w2,wzr,#0x38
009a40b4	b 0x009a4014
009a40b8	mov w0,#0x8
009a40bc	bl 0x00c30000
009a40c0	adrp x8,0xcb4000
009a40c4	ldr x8,[x8, #0xb50]
009a40c8	adrp x1,0xcb4000
009a40cc	adrp x2,0xcb4000
009a40d0	add x8,x8,#0x10
009a40d4	str x8,[x0]
009a40d8	ldr x1,[x1, #0xb58]
009a40dc	ldr x2,[x2, #0xb38]
009a40e0	bl 0x00c30020
009a40e4	bl 0x00c2fec0
