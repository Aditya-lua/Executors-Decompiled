; EVP_PKEY_encrypt @ 00a55f5c
00a55f5c	str x23,[sp, #-0x40]!
00a55f60	stp x22,x21,[sp, #0x10]
00a55f64	stp x20,x19,[sp, #0x20]
00a55f68	stp x29,x30,[sp, #0x30]
00a55f6c	add x29,sp,#0x30
00a55f70	cbz x0,0x00a55fb0
00a55f74	ldr w8,[x0]
00a55f78	mov x23,x0
00a55f7c	cmp w8,#0x200
00a55f80	b.ne 0x00a55fe4
00a55f84	ldr x0,[x23, #0x30]
00a55f88	mov x19,x4
00a55f8c	mov x20,x3
00a55f90	mov x21,x2
00a55f94	mov x22,x1
00a55f98	cbz x0,0x00a56028
00a55f9c	ldr x8,[x23, #0x28]
00a55fa0	ldr x6,[x8, #0x40]
00a55fa4	cbz x22,0x00a56068
00a55fa8	ldr x3,[x21]
00a55fac	b 0x00a5606c
00a55fb0	bl 0x00c342a0
00a55fb4	adrp x0,0x2cb000
00a55fb8	adrp x2,0x2cf000
00a55fbc	add x0,x0,#0x8db
00a55fc0	add x2,x2,#0xb3e
00a55fc4	mov w1,#0xea
00a55fc8	bl 0x00c342b0
00a55fcc	orr w0,wzr,#0x6
00a55fd0	mov w1,#0x96
00a55fd4	mov x2,xzr
00a55fd8	bl 0x00c342c0
00a55fdc	orr w0,wzr,#0xfffffffe
00a55fe0	b 0x00a56014
00a55fe4	bl 0x00c342a0
00a55fe8	adrp x0,0x2cb000
00a55fec	adrp x2,0x2cf000
00a55ff0	add x0,x0,#0x8db
00a55ff4	add x2,x2,#0xb3e
00a55ff8	mov w1,#0xef
00a55ffc	bl 0x00c342b0
00a56000	orr w0,wzr,#0x6
00a56004	mov w1,#0x97
00a56008	mov x2,xzr
00a5600c	bl 0x00c342c0
00a56010	mov w0,#0xffffffff
00a56014	ldp x29,x30,[sp, #0x30]
00a56018	ldp x20,x19,[sp, #0x20]
00a5601c	ldp x22,x21,[sp, #0x10]
00a56020	ldr x23,[sp], #0x40
00a56024	ret
00a56028	ldr x8,[x23, #0x78]
00a5602c	cbz x8,0x00a56090
00a56030	ldr x5,[x8, #0x98]
00a56034	cbz x5,0x00a56090
00a56038	ldrb w8,[x8, #0x4]
00a5603c	tbnz w8,#0x1,0x00a560ac
00a56040	mov x1,x22
00a56044	mov x2,x21
00a56048	mov x3,x20
00a5604c	mov x4,x19
00a56050	ldp x29,x30,[sp, #0x30]
00a56054	ldp x20,x19,[sp, #0x20]
00a56058	ldp x22,x21,[sp, #0x10]
00a5605c	mov x0,x23
00a56060	ldr x23,[sp], #0x40
00a56064	br x5
00a56068	mov x3,xzr
00a5606c	mov x1,x22
00a56070	mov x2,x21
00a56074	mov x4,x20
00a56078	mov x5,x19
00a5607c	ldp x29,x30,[sp, #0x30]
00a56080	ldp x20,x19,[sp, #0x20]
00a56084	ldp x22,x21,[sp, #0x10]
00a56088	ldr x23,[sp], #0x40
00a5608c	br x6
00a56090	bl 0x00c342a0
00a56094	adrp x0,0x2cb000
00a56098	adrp x2,0x2cf000
00a5609c	add x0,x0,#0x8db
00a560a0	add x2,x2,#0xb3e
00a560a4	orr w1,wzr,#0xfc
00a560a8	b 0x00a55fc8
00a560ac	ldr x0,[x23, #0x88]
00a560b0	bl 0x00c36440
00a560b4	cbz w0,0x00a560f4
00a560b8	sxtw x8,w0
00a560bc	cbz x22,0x00a56128
00a560c0	ldr x9,[x21]
00a560c4	cmp x9,x8
00a560c8	b.cs 0x00a56134
00a560cc	bl 0x00c342a0
00a560d0	adrp x0,0x2cb000
00a560d4	adrp x2,0x2cf000
00a560d8	add x0,x0,#0x8db
00a560dc	add x2,x2,#0xb3e
00a560e0	orr w1,wzr,#0xff
00a560e4	bl 0x00c342b0
00a560e8	orr w0,wzr,#0x6
00a560ec	mov w1,#0x9b
00a560f0	b 0x00a56118
00a560f4	bl 0x00c342a0
00a560f8	adrp x0,0x2cb000
00a560fc	adrp x2,0x2cf000
00a56100	add x0,x0,#0x8db
00a56104	add x2,x2,#0xb3e
00a56108	orr w1,wzr,#0xff
00a5610c	bl 0x00c342b0
00a56110	orr w0,wzr,#0x6
00a56114	mov w1,#0xa3
00a56118	mov x2,xzr
00a5611c	bl 0x00c342c0
00a56120	mov w0,wzr
00a56124	b 0x00a56014
00a56128	str x8,[x21]
00a5612c	mov w0,#0x1
00a56130	b 0x00a56014
00a56134	ldr x8,[x23, #0x78]
00a56138	ldr x5,[x8, #0x98]
00a5613c	b 0x00a56040
