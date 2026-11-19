; EVP_PKEY_CTX_get_signature_md @ 00a76274
00a76274	sub sp,sp,#0x100
00a76278	stp x20,x19,[sp, #0xe0]
00a7627c	mov x19,x1
00a76280	mov x20,x0
00a76284	add x0,sp,#0x30
00a76288	mov w2,#0x50
00a7628c	mov w1,wzr
00a76290	str x21,[sp, #0xd0]
00a76294	stp x29,x30,[sp, #0xf0]
00a76298	add x29,sp,#0xf0
00a7629c	bl 0x00c301c0
00a762a0	cbz x20,0x00a76364
00a762a4	ldr w8,[x20]
00a762a8	sub w9,w8,#0x10
00a762ac	cmp w9,#0x30
00a762b0	b.hi 0x00a762cc
00a762b4	mov w10,#0x1
00a762b8	lsl x9,x10,x9
00a762bc	mov x10,#0x1000000010000
00a762c0	movk x10,#0x1
00a762c4	tst x9,x10
00a762c8	b.ne 0x00a762dc
00a762cc	cmp w8,#0x80
00a762d0	b.eq 0x00a762dc
00a762d4	cmp w8,#0x100
00a762d8	b.ne 0x00a76364
00a762dc	ldr x8,[x20, #0x30]
00a762e0	cbz x8,0x00a76398
00a762e4	adrp x0,0x29d000
00a762e8	add x0,x0,#0xe2e
00a762ec	add x8,sp,#0x8
00a762f0	add x1,sp,#0x30
00a762f4	mov w2,#0x50
00a762f8	sub x21,x29,#0x70
00a762fc	bl 0x00c36280
00a76300	ldr x8,[sp, #0x28]
00a76304	ldur q0,[sp, #0x18]
00a76308	ldur q1,[sp, #0x8]
00a7630c	stur x8,[x29, #-0x50]
00a76310	add x8,sp,#0x8
00a76314	str q0,[x21, #0x10]
00a76318	stur q1,[x29, #-0x70]
00a7631c	bl 0x00c34c40
00a76320	ldr x8,[sp, #0x28]
00a76324	ldur q0,[sp, #0x18]
00a76328	ldur q1,[sp, #0x8]
00a7632c	sub x1,x29,#0x70
00a76330	mov x0,x20
00a76334	stur x8,[x29, #-0x28]
00a76338	stur q0,[x21, #0x38]
00a7633c	stur q1,[x21, #0x28]
00a76340	bl 0x00a75d88
00a76344	cbz w0,0x00a763e8
00a76348	ldr x0,[x20, #0x8]
00a7634c	add x1,sp,#0x30
00a76350	bl 0x00c3d750
00a76354	cbz x0,0x00a763e8
00a76358	str x0,[x19]
00a7635c	mov w0,#0x1
00a76360	b 0x00a763e8
00a76364	bl 0x00c342a0
00a76368	adrp x0,0x2c3000
00a7636c	adrp x2,0x2b0000
00a76370	add x0,x0,#0xa9f
00a76374	add x2,x2,#0x94
00a76378	mov w1,#0x39b
00a7637c	bl 0x00c342b0
00a76380	orr w0,wzr,#0x6
00a76384	mov w1,#0x93
00a76388	mov x2,xzr
00a7638c	bl 0x00c342c0
00a76390	orr w0,wzr,#0xfffffffe
00a76394	b 0x00a763e8
00a76398	bl 0x00c35250
00a7639c	bl 0x00c342a0
00a763a0	adrp x0,0x2c3000
00a763a4	adrp x2,0x2b0000
00a763a8	add x0,x0,#0xa9f
00a763ac	add x2,x2,#0xb2
00a763b0	mov w1,#0x5f6
00a763b4	bl 0x00c342b0
00a763b8	orr w0,wzr,#0x6
00a763bc	mov w1,#0x93
00a763c0	mov x2,xzr
00a763c4	bl 0x00c342c0
00a763c8	bl 0x00c35240
00a763cc	mov w1,#0xffffffff
00a763d0	orr w2,wzr,#0x1f0
00a763d4	mov w3,#0xd
00a763d8	mov x0,x20
00a763dc	mov w4,wzr
00a763e0	mov x5,x19
00a763e4	bl 0x00a77554
00a763e8	ldp x29,x30,[sp, #0xf0]
00a763ec	ldp x20,x19,[sp, #0xe0]
00a763f0	ldr x21,[sp, #0xd0]
00a763f4	add sp,sp,#0x100
00a763f8	ret
