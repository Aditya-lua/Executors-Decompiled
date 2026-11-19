; FUN_00a6e250 @ 00a6e250
00a6e250	stp x26,x25,[sp, #-0x50]!
00a6e254	stp x24,x23,[sp, #0x10]
00a6e258	stp x22,x21,[sp, #0x20]
00a6e25c	stp x20,x19,[sp, #0x30]
00a6e260	mov x22,x5
00a6e264	mov x21,x4
00a6e268	mov w24,w3
00a6e26c	mov x19,x1
00a6e270	cmp w2,#0x1
00a6e274	mov x20,x0
00a6e278	stp x29,x30,[sp, #0x40]
00a6e27c	add x29,sp,#0x40
00a6e280	b.lt 0x00a6e2c4
00a6e284	sxtw x25,w2
00a6e288	mov w1,#0x51
00a6e28c	mov x0,x19
00a6e290	mov x2,xzr
00a6e294	mov x3,xzr
00a6e298	bl 0x00c321a0
00a6e29c	mov x23,x0
00a6e2a0	mov w1,#0x50
00a6e2a4	mov x0,x19
00a6e2a8	mov x2,x25
00a6e2ac	mov x3,xzr
00a6e2b0	bl 0x00c321a0
00a6e2b4	cmp x0,#0x0
00a6e2b8	b.le 0x00a6e2d0
00a6e2bc	mov w26,wzr
00a6e2c0	b 0x00a6e2ec
00a6e2c4	mov w26,wzr
00a6e2c8	mov x23,xzr
00a6e2cc	b 0x00a6e30c
00a6e2d0	bl 0x00c37c50
00a6e2d4	bl 0x00c32240
00a6e2d8	cbz x0,0x00a6e3ec
00a6e2dc	mov x1,x19
00a6e2e0	bl 0x00c35640
00a6e2e4	mov x19,x0
00a6e2e8	mov w26,#0x1
00a6e2ec	mov w1,#0x50
00a6e2f0	mov x0,x19
00a6e2f4	mov x2,x25
00a6e2f8	mov x3,xzr
00a6e2fc	bic x23,x23,x23, ASR #0x3f
00a6e300	bl 0x00c321a0
00a6e304	cmp x0,#0x0
00a6e308	b.le 0x00a6e3c4
00a6e30c	adrp x2,0x2dc000
00a6e310	add x2,x2,#0xaa
00a6e314	mov x0,x20
00a6e318	mov w1,w24
00a6e31c	mov x3,xzr
00a6e320	mov x4,xzr
00a6e324	bl 0x00c3b960
00a6e328	mov x25,x0
00a6e32c	bl 0x00c3b7d0
00a6e330	cbz w0,0x00a6e374
00a6e334	mov x0,x25
00a6e338	mov x1,x19
00a6e33c	bl 0x00c3b860
00a6e340	mov w24,w0
00a6e344	mov x0,x25
00a6e348	bl 0x00c3b890
00a6e34c	cmn w24,#0x2
00a6e350	b.ne 0x00a6e3f8
00a6e354	cbz x21,0x00a6e380
00a6e358	mov x0,x19
00a6e35c	mov x1,x20
00a6e360	mov w2,wzr
00a6e364	mov x3,x22
00a6e368	blr x21
00a6e36c	mov w24,w0
00a6e370	b 0x00a6e3f8
00a6e374	mov x0,x25
00a6e378	bl 0x00c3b890
00a6e37c	cbnz x21,0x00a6e358
00a6e380	mov w2,#0x80
00a6e384	mov x0,x19
00a6e388	mov w1,wzr
00a6e38c	bl 0x00c38640
00a6e390	cbz w0,0x00a6e3f4
00a6e394	ldr w0,[x20]
00a6e398	bl 0x00c34d80
00a6e39c	adrp x1,0x2b5000
00a6e3a0	adrp x2,0x2d5000
00a6e3a4	mov x3,x0
00a6e3a8	add x1,x1,#0xcf2
00a6e3ac	add x2,x2,#0xd1c
00a6e3b0	mov x0,x19
00a6e3b4	bl 0x00c32250
00a6e3b8	cmp w0,#0x0
00a6e3bc	cset w24,gt
00a6e3c0	b 0x00a6e3f8
00a6e3c4	mov w1,#0x50
00a6e3c8	mov x0,x19
00a6e3cc	mov x2,x23
00a6e3d0	mov x3,xzr
00a6e3d4	bl 0x00c321a0
00a6e3d8	cbz w26,0x00a6e3ec
00a6e3dc	mov x0,x19
00a6e3e0	bl 0x00c35630
00a6e3e4	mov x0,x19
00a6e3e8	bl 0x00c31a40
00a6e3ec	mov w24,wzr
00a6e3f0	b 0x00a6e420
00a6e3f4	mov w24,wzr
00a6e3f8	mov w1,#0x50
00a6e3fc	mov x0,x19
00a6e400	mov x2,x23
00a6e404	mov x3,xzr
00a6e408	bl 0x00c321a0
00a6e40c	cbz w26,0x00a6e420
00a6e410	mov x0,x19
00a6e414	bl 0x00c35630
00a6e418	mov x0,x19
00a6e41c	bl 0x00c31a40
00a6e420	mov w0,w24
00a6e424	ldp x29,x30,[sp, #0x40]
00a6e428	ldp x20,x19,[sp, #0x30]
00a6e42c	ldp x22,x21,[sp, #0x20]
00a6e430	ldp x24,x23,[sp, #0x10]
00a6e434	ldp x26,x25,[sp], #0x50
00a6e438	ret
