; custom_ext_add @ 009d5f10
009d5f10	sub sp,sp,#0x90
009d5f14	stp x28,x27,[sp, #0x30]
009d5f18	stp x26,x25,[sp, #0x40]
009d5f1c	stp x24,x23,[sp, #0x50]
009d5f20	stp x22,x21,[sp, #0x60]
009d5f24	stp x20,x19,[sp, #0x70]
009d5f28	stp x29,x30,[sp, #0x80]
009d5f2c	stp x3,x4,[sp, #0x8]
009d5f30	ldr x26,[x0, #0x898]
009d5f34	add x29,sp,#0x80
009d5f38	ldr x8,[x26, #0x1e0]
009d5f3c	cbz x8,0x009d6084
009d5f40	mov w21,w5
009d5f44	mov x24,x2
009d5f48	mov x19,x0
009d5f4c	mov w20,w1
009d5f50	mov x25,xzr
009d5f54	mov x27,xzr
009d5f58	and w28,w1,#0x1f00
009d5f5c	stp xzr,xzr,[sp, #0x18]
009d5f60	ldr x22,[x26, #0x1d8]
009d5f64	mov x0,x19
009d5f68	mov w2,w20
009d5f6c	mov w3,w21
009d5f70	add x8,x22,x25
009d5f74	ldr w1,[x8, #0x8]
009d5f78	bl 0x00c36e40
009d5f7c	cbz w0,0x009d6070
009d5f80	cbz w28,0x009d5f90
009d5f84	add x8,x22,x25
009d5f88	ldrb w8,[x8, #0xc]
009d5f8c	tbz w8,#0x0,0x009d6070
009d5f90	add x8,x22,x25
009d5f94	ldr x8,[x8, #0x10]
009d5f98	tbnz w20,#0x7,0x009d5fa4
009d5f9c	cbnz x8,0x009d5fa8
009d5fa0	b 0x009d6070
009d5fa4	cbz x8,0x009d5fe8
009d5fa8	add x9,x22,x25
009d5fac	ldrh w1,[x9]
009d5fb0	ldr x9,[x9, #0x20]
009d5fb4	ldp x5,x6,[sp, #0x8]
009d5fb8	add x3,sp,#0x20
009d5fbc	add x4,sp,#0x18
009d5fc0	add x7,sp,#0x2c
009d5fc4	mov x0,x19
009d5fc8	mov w2,w20
009d5fcc	str x9,[sp]
009d5fd0	blr x8
009d5fd4	tbnz w0,#0x1f,0x009d60dc
009d5fd8	cbz w0,0x009d6070
009d5fdc	orr w8,wzr,#0x38
009d5fe0	madd x23,x27,x8,x22
009d5fe4	b 0x009d5fec
009d5fe8	add x23,x22,x25
009d5fec	ldrh w1,[x23]
009d5ff0	mov w2,#0x2
009d5ff4	mov x0,x24
009d5ff8	bl 0x00c343a0
009d5ffc	cbz w0,0x009d608c
009d6000	mov w1,#0x2
009d6004	mov x0,x24
009d6008	bl 0x00c343b0
009d600c	cbz w0,0x009d608c
009d6010	ldr x2,[sp, #0x18]
009d6014	cbz x2,0x009d6028
009d6018	ldr x1,[sp, #0x20]
009d601c	mov x0,x24
009d6020	bl 0x00c34390
009d6024	cbz w0,0x009d608c
009d6028	mov x0,x24
009d602c	bl 0x00c34350
009d6030	cbz w0,0x009d608c
009d6034	tbz w20,#0x7,0x009d604c
009d6038	add x8,x22,x25
009d603c	ldr w9,[x8, #0xc]
009d6040	tbnz w9,#0x1,0x009d6130
009d6044	orr w9,w9,#0x2
009d6048	str w9,[x8, #0xc]
009d604c	add x9,x22,x25
009d6050	ldr x8,[x9, #0x18]
009d6054	cbz x8,0x009d6070
009d6058	ldrh w1,[x23]
009d605c	ldr x3,[sp, #0x20]
009d6060	ldr x4,[x9, #0x20]
009d6064	mov x0,x19
009d6068	mov w2,w20
009d606c	blr x8
009d6070	ldr x8,[x26, #0x1e0]
009d6074	add x27,x27,#0x1
009d6078	add x25,x25,#0x38
009d607c	cmp x27,x8
009d6080	b.cc 0x009d5f5c
009d6084	mov w0,#0x1
009d6088	b 0x009d6110
009d608c	add x9,x22,x25
009d6090	ldr x8,[x9, #0x18]
009d6094	cbz x8,0x009d60b0
009d6098	ldrh w1,[x23]
009d609c	ldr x3,[sp, #0x20]
009d60a0	ldr x4,[x9, #0x20]
009d60a4	mov x0,x19
009d60a8	mov w2,w20
009d60ac	blr x8
009d60b0	bl 0x00c342a0
009d60b4	adrp x0,0x2b9000
009d60b8	adrp x2,0x2a9000
009d60bc	add x0,x0,#0xa64
009d60c0	add x2,x2,#0xef4
009d60c4	mov w1,#0xe1
009d60c8	bl 0x00c342b0
009d60cc	mov w2,#0x103
009d60d0	mov w1,#0x50
009d60d4	movk w2,#0xc, LSL #16
009d60d8	b 0x009d6100
009d60dc	bl 0x00c342a0
009d60e0	adrp x0,0x2b9000
009d60e4	adrp x2,0x2a9000
009d60e8	add x0,x0,#0xa64
009d60ec	add x2,x2,#0xef4
009d60f0	mov w1,#0xd4
009d60f4	bl 0x00c342b0
009d60f8	ldr w1,[sp, #0x2c]
009d60fc	mov w2,#0xea
009d6100	mov x0,x19
009d6104	mov x3,xzr
009d6108	bl 0x00c34410
009d610c	mov w0,wzr
009d6110	ldp x29,x30,[sp, #0x80]
009d6114	ldp x20,x19,[sp, #0x70]
009d6118	ldp x22,x21,[sp, #0x60]
009d611c	ldp x24,x23,[sp, #0x50]
009d6120	ldp x26,x25,[sp, #0x40]
009d6124	ldp x28,x27,[sp, #0x30]
009d6128	add sp,sp,#0x90
009d612c	ret
009d6130	ldr x8,[x8, #0x18]
009d6134	cbz x8,0x009d6154
009d6138	add x9,x22,x25
009d613c	ldrh w1,[x23]
009d6140	ldr x3,[sp, #0x20]
009d6144	ldr x4,[x9, #0x20]
009d6148	mov x0,x19
009d614c	mov w2,w20
009d6150	blr x8
009d6154	bl 0x00c342a0
009d6158	adrp x0,0x2b9000
009d615c	adrp x2,0x2a9000
009d6160	add x0,x0,#0xa64
009d6164	add x2,x2,#0xef4
009d6168	mov w1,#0xec
009d616c	b 0x009d60c8
