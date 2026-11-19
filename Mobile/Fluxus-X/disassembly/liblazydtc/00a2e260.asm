; BN_GF2m_mod_solve_quad @ 00a2e260
00a2e260	stp x26,x25,[sp, #-0x50]!
00a2e264	stp x24,x23,[sp, #0x10]
00a2e268	mov x23,x0
00a2e26c	mov x0,x2
00a2e270	stp x22,x21,[sp, #0x20]
00a2e274	stp x20,x19,[sp, #0x30]
00a2e278	stp x29,x30,[sp, #0x40]
00a2e27c	add x29,sp,#0x40
00a2e280	mov x20,x3
00a2e284	mov x25,x2
00a2e288	mov x22,x1
00a2e28c	bl 0x00c322f0
00a2e290	add w26,w0,#0x1
00a2e294	adrp x1,0x2d9000
00a2e298	mov w24,w0
00a2e29c	sbfiz x0,x26,#0x2,#0x20
00a2e2a0	add x1,x1,#0xb49
00a2e2a4	mov w2,#0x463
00a2e2a8	bl 0x00c32320
00a2e2ac	mov x19,x0
00a2e2b0	cbz x0,0x00a2e2f4
00a2e2b4	mov x0,x25
00a2e2b8	bl 0x00c369b0
00a2e2bc	mov w21,wzr
00a2e2c0	cbz w0,0x00a2e32c
00a2e2c4	bl 0x00c342a0
00a2e2c8	adrp x0,0x2d9000
00a2e2cc	adrp x2,0x2cb000
00a2e2d0	add x0,x0,#0xb49
00a2e2d4	add x2,x2,#0x84b
00a2e2d8	mov w1,#0x46a
00a2e2dc	bl 0x00c342b0
00a2e2e0	orr w0,wzr,#0x3
00a2e2e4	mov w1,#0x6a
00a2e2e8	mov x2,xzr
00a2e2ec	bl 0x00c342c0
00a2e2f0	b 0x00a2e3cc
00a2e2f4	bl 0x00c342a0
00a2e2f8	adrp x0,0x2d9000
00a2e2fc	adrp x2,0x2cb000
00a2e300	add x0,x0,#0xb49
00a2e304	add x2,x2,#0x84b
00a2e308	mov w1,#0x465
00a2e30c	bl 0x00c342b0
00a2e310	mov w1,#0x100
00a2e314	orr w0,wzr,#0x3
00a2e318	movk w1,#0xc, LSL #16
00a2e31c	mov x2,xzr
00a2e320	bl 0x00c342c0
00a2e324	mov w21,wzr
00a2e328	b 0x00a2e3cc
00a2e32c	ldrsw x8,[x25, #0x8]
00a2e330	cmp w8,#0x1
00a2e334	b.lt 0x00a2e3fc
00a2e338	ldr x9,[x25]
00a2e33c	mov w21,wzr
00a2e340	lsl w10,w8,#0x6
00a2e344	sub x11,x8,#0x1
00a2e348	ldr x12,[x9, x11, LSL #0x3]
00a2e34c	cbz x12,0x00a2e384
00a2e350	orr x13,xzr,#-0x8000000000000000
00a2e354	mov w14,#0xffffffff
00a2e358	tst x13,x12
00a2e35c	b.eq 0x00a2e374
00a2e360	cmp w21,w24
00a2e364	b.gt 0x00a2e370
00a2e368	add w15,w10,w14
00a2e36c	str w15,[x19, w21, SXTW #0x2]
00a2e370	add w21,w21,#0x1
00a2e374	sub w14,w14,#0x1
00a2e378	cmn w14,#0x41
00a2e37c	lsr x13,x13,#0x1
00a2e380	b.ne 0x00a2e358
00a2e384	cmp x8,#0x1
00a2e388	sub w10,w10,#0x40
00a2e38c	mov x8,x11
00a2e390	b.gt 0x00a2e344
00a2e394	cmp w21,w24
00a2e398	b.gt 0x00a2e3a8
00a2e39c	mov w8,#0xffffffff
00a2e3a0	str w8,[x19, w21, SXTW #0x2]
00a2e3a4	add w21,w21,#0x1
00a2e3a8	cbz w21,0x00a2e2c4
00a2e3ac	cmp w21,w26
00a2e3b0	b.gt 0x00a2e2c4
00a2e3b4	mov x0,x23
00a2e3b8	mov x1,x22
00a2e3bc	mov x2,x19
00a2e3c0	mov x3,x20
00a2e3c4	bl 0x00a2d814
00a2e3c8	mov w21,w0
00a2e3cc	adrp x1,0x2d9000
00a2e3d0	add x1,x1,#0xb49
00a2e3d4	mov w2,#0x470
00a2e3d8	mov x0,x19
00a2e3dc	bl 0x00c32310
00a2e3e0	mov w0,w21
00a2e3e4	ldp x29,x30,[sp, #0x40]
00a2e3e8	ldp x20,x19,[sp, #0x30]
00a2e3ec	ldp x22,x21,[sp, #0x20]
00a2e3f0	ldp x24,x23,[sp, #0x10]
00a2e3f4	ldp x26,x25,[sp], #0x50
00a2e3f8	ret
00a2e3fc	mov w21,wzr
00a2e400	cmp w21,w24
00a2e404	b.le 0x00a2e39c
00a2e408	b 0x00a2e3a8
