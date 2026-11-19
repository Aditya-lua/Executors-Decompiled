; mbedtls_rsa_write_key @ 00ba5f50
00ba5f50	sub sp,sp,#0x60
00ba5f54	stp x24,x23,[sp, #0x20]
00ba5f58	stp x22,x21,[sp, #0x30]
00ba5f5c	stp x20,x19,[sp, #0x40]
00ba5f60	stp x29,x30,[sp, #0x50]
00ba5f64	add x29,sp,#0x50
00ba5f68	mrs x23,tpidr_el0
00ba5f6c	ldr x8,[x23, #0x28]
00ba5f70	mov x21,x0
00ba5f74	add x0,sp,#0x8
00ba5f78	mov x19,x2
00ba5f7c	mov x20,x1
00ba5f80	str x8,[sp, #0x18]
00ba5f84	bl 0x00c41c00
00ba5f88	add x3,sp,#0x8
00ba5f8c	mov x0,x21
00ba5f90	mov x1,xzr
00ba5f94	mov x2,xzr
00ba5f98	bl 0x00c43450
00ba5f9c	mov w22,w0
00ba5fa0	cbz w0,0x00ba6008
00ba5fa4	mov x24,xzr
00ba5fa8	add x0,sp,#0x8
00ba5fac	bl 0x00c41bb0
00ba5fb0	tbnz w22,#0x1f,0x00ba61f0
00ba5fb4	mov x0,x19
00ba5fb8	mov x1,x20
00ba5fbc	mov w2,wzr
00ba5fc0	bl 0x00c41ab0
00ba5fc4	mov w22,w0
00ba5fc8	tbnz w0,#0x1f,0x00ba61f0
00ba5fcc	add x21,x24,w22, SXTW 
00ba5fd0	mov x0,x19
00ba5fd4	mov x1,x20
00ba5fd8	mov x2,x21
00ba5fdc	bl 0x00c41ac0
00ba5fe0	mov w22,w0
00ba5fe4	tbnz w0,#0x1f,0x00ba61f0
00ba5fe8	orr w2,wzr,#0x30
00ba5fec	mov x0,x19
00ba5ff0	mov x1,x20
00ba5ff4	bl 0x00c41ae0
00ba5ff8	tbnz w0,#0x1f,0x00ba61ec
00ba5ffc	add w8,w22,w21
00ba6000	add w22,w8,w0
00ba6004	b 0x00ba61f0
00ba6008	add x2,sp,#0x8
00ba600c	mov x0,x19
00ba6010	mov x1,x20
00ba6014	bl 0x00c41ad0
00ba6018	mov w22,w0
00ba601c	tbnz w0,#0x1f,0x00ba61e0
00ba6020	add x2,sp,#0x8
00ba6024	mov x0,x21
00ba6028	mov x1,xzr
00ba602c	mov x3,xzr
00ba6030	sxtw x24,w22
00ba6034	bl 0x00c43450
00ba6038	mov w22,w0
00ba603c	cbnz w0,0x00ba5fa8
00ba6040	add x2,sp,#0x8
00ba6044	mov x0,x19
00ba6048	mov x1,x20
00ba604c	bl 0x00c41ad0
00ba6050	mov w22,w0
00ba6054	tbnz w0,#0x1f,0x00ba61e0
00ba6058	add x1,sp,#0x8
00ba605c	mov x0,x21
00ba6060	mov x2,xzr
00ba6064	mov x3,xzr
00ba6068	add x24,x24,w22, SXTW 
00ba606c	bl 0x00c43450
00ba6070	mov w22,w0
00ba6074	cbnz w0,0x00ba5fa8
00ba6078	add x2,sp,#0x8
00ba607c	mov x0,x19
00ba6080	mov x1,x20
00ba6084	bl 0x00c41ad0
00ba6088	mov w22,w0
00ba608c	tbnz w0,#0x1f,0x00ba61e0
00ba6090	add x3,sp,#0x8
00ba6094	mov x0,x21
00ba6098	mov x1,xzr
00ba609c	mov x2,xzr
00ba60a0	mov x4,xzr
00ba60a4	mov x5,xzr
00ba60a8	add x24,x24,w22, SXTW 
00ba60ac	bl 0x00c432c0
00ba60b0	mov w22,w0
00ba60b4	cbnz w0,0x00ba5fa8
00ba60b8	add x2,sp,#0x8
00ba60bc	mov x0,x19
00ba60c0	mov x1,x20
00ba60c4	bl 0x00c41ad0
00ba60c8	mov w22,w0
00ba60cc	tbnz w0,#0x1f,0x00ba61e0
00ba60d0	add x2,sp,#0x8
00ba60d4	mov x0,x21
00ba60d8	mov x1,xzr
00ba60dc	mov x3,xzr
00ba60e0	mov x4,xzr
00ba60e4	mov x5,xzr
00ba60e8	add x24,x24,w22, SXTW 
00ba60ec	bl 0x00c432c0
00ba60f0	mov w22,w0
00ba60f4	cbnz w0,0x00ba5fa8
00ba60f8	add x2,sp,#0x8
00ba60fc	mov x0,x19
00ba6100	mov x1,x20
00ba6104	bl 0x00c41ad0
00ba6108	mov w22,w0
00ba610c	tbnz w0,#0x1f,0x00ba61e0
00ba6110	add x4,sp,#0x8
00ba6114	mov x0,x21
00ba6118	mov x1,xzr
00ba611c	mov x2,xzr
00ba6120	mov x3,xzr
00ba6124	mov x5,xzr
00ba6128	add x24,x24,w22, SXTW 
00ba612c	bl 0x00c432c0
00ba6130	mov w22,w0
00ba6134	cbnz w0,0x00ba5fa8
00ba6138	add x2,sp,#0x8
00ba613c	mov x0,x19
00ba6140	mov x1,x20
00ba6144	bl 0x00c41ad0
00ba6148	mov w22,w0
00ba614c	tbnz w0,#0x1f,0x00ba61e0
00ba6150	add x5,sp,#0x8
00ba6154	mov x0,x21
00ba6158	mov x1,xzr
00ba615c	mov x2,xzr
00ba6160	mov x3,xzr
00ba6164	mov x4,xzr
00ba6168	add x24,x24,w22, SXTW 
00ba616c	bl 0x00c432c0
00ba6170	mov w22,w0
00ba6174	cbnz w0,0x00ba5fa8
00ba6178	add x2,sp,#0x8
00ba617c	mov x0,x19
00ba6180	mov x1,x20
00ba6184	bl 0x00c41ad0
00ba6188	mov w22,w0
00ba618c	tbnz w0,#0x1f,0x00ba61e0
00ba6190	add x1,sp,#0x8
00ba6194	mov x0,x21
00ba6198	mov x2,xzr
00ba619c	mov x3,xzr
00ba61a0	mov x4,xzr
00ba61a4	mov x5,xzr
00ba61a8	add x24,x24,w22, SXTW 
00ba61ac	bl 0x00c432c0
00ba61b0	mov w22,w0
00ba61b4	cbnz w0,0x00ba5fa8
00ba61b8	add x2,sp,#0x8
00ba61bc	mov x0,x19
00ba61c0	mov x1,x20
00ba61c4	bl 0x00c41ad0
00ba61c8	mov w22,w0
00ba61cc	tbnz w0,#0x1f,0x00ba61e0
00ba61d0	add x0,sp,#0x8
00ba61d4	add x24,x24,w22, SXTW 
00ba61d8	bl 0x00c41bb0
00ba61dc	b 0x00ba5fb4
00ba61e0	add x0,sp,#0x8
00ba61e4	bl 0x00c41bb0
00ba61e8	b 0x00ba61f0
00ba61ec	mov w22,w0
00ba61f0	ldr x8,[x23, #0x28]
00ba61f4	ldr x9,[sp, #0x18]
00ba61f8	cmp x8,x9
00ba61fc	b.ne 0x00ba621c
00ba6200	mov w0,w22
00ba6204	ldp x29,x30,[sp, #0x50]
00ba6208	ldp x20,x19,[sp, #0x40]
00ba620c	ldp x22,x21,[sp, #0x30]
00ba6210	ldp x24,x23,[sp, #0x20]
00ba6214	add sp,sp,#0x60
00ba6218	ret
00ba621c	bl 0x00c2fec0
