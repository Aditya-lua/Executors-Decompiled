; ossl_store_register_loader_int @ 00aebd7c
00aebd7c	stp x22,x21,[sp, #-0x30]!
00aebd80	stp x20,x19,[sp, #0x10]
00aebd84	stp x29,x30,[sp, #0x20]
00aebd88	ldr x20,[x0]
00aebd8c	mov x19,x0
00aebd90	orr w1,wzr,#0x3
00aebd94	add x29,sp,#0x20
00aebd98	ldrb w0,[x20]
00aebd9c	bl 0x00c377c0
00aebda0	ldrb w8,[x20]
00aebda4	cbz w0,0x00aebdf8
00aebda8	cbz w8,0x00aebe34
00aebdac	mov x22,#0x100000001
00aebdb0	mov w21,#0x1
00aebdb4	movk x22,#0x6800, LSL #32
00aebdb8	and w0,w8,#0xff
00aebdbc	orr w1,wzr,#0x3
00aebdc0	bl 0x00c377c0
00aebdc4	cbnz w0,0x00aebdec
00aebdc8	ldrb w0,[x20]
00aebdcc	bl 0x00c37770
00aebdd0	cbnz w0,0x00aebdec
00aebdd4	ldrb w8,[x20]
00aebdd8	cmp x8,#0x3f
00aebddc	b.hi 0x00aebdf8
00aebde0	lsl x9,x21,x8
00aebde4	and x9,x9,x22
00aebde8	cbz x9,0x00aebdf8
00aebdec	ldrb w8,[x20, #0x1]!
00aebdf0	cbnz w8,0x00aebdb8
00aebdf4	b 0x00aebe34
00aebdf8	cbz w8,0x00aebe34
00aebdfc	bl 0x00c342a0
00aebe00	adrp x0,0x2bc000
00aebe04	adrp x2,0x2ae000
00aebe08	add x0,x0,#0x4ea
00aebe0c	add x2,x2,#0x6b4
00aebe10	mov w1,#0xb5
00aebe14	bl 0x00c342b0
00aebe18	ldr x3,[x19]
00aebe1c	adrp x2,0x2d4000
00aebe20	add x2,x2,#0x441
00aebe24	mov w0,#0x2c
00aebe28	mov w1,#0x6a
00aebe2c	bl 0x00c342c0
00aebe30	b 0x00aebef8
00aebe34	ldr x8,[x19, #0x10]
00aebe38	cbz x8,0x00aebecc
00aebe3c	ldr x8,[x19, #0x38]
00aebe40	cbz x8,0x00aebecc
00aebe44	ldr x8,[x19, #0x40]
00aebe48	cbz x8,0x00aebecc
00aebe4c	ldr x8,[x19, #0x48]
00aebe50	cbz x8,0x00aebecc
00aebe54	ldr x8,[x19, #0x50]
00aebe58	cbz x8,0x00aebecc
00aebe5c	adrp x0,0xd22000
00aebe60	adrp x1,0xaeb000
00aebe64	add x0,x0,#0x308
00aebe68	add x1,x1,#0xf60
00aebe6c	bl 0x00c34d60
00aebe70	cbz w0,0x00aebf10
00aebe74	adrp x8,0xd22000
00aebe78	ldr w8,[x8, #0x30c]
00aebe7c	cbz w8,0x00aebf10
00aebe80	adrp x20,0xd22000
00aebe84	ldr x0,[x20, #0x310]
00aebe88	bl 0x00c356a0
00aebe8c	cbz w0,0x00aebef8
00aebe90	adrp x21,0xd22000
00aebe94	ldr x0,[x21, #0x318]
00aebe98	cbnz x0,0x00aebeb8
00aebe9c	adrp x0,0xaec000
00aebea0	adrp x1,0xaec000
00aebea4	add x0,x0,#0x2ec
00aebea8	add x1,x1,#0x2f4
00aebeac	bl 0x00c34dd0
00aebeb0	str x0,[x21, #0x318]
00aebeb4	cbz x0,0x00aebf50
00aebeb8	mov x1,x19
00aebebc	bl 0x00c34dc0
00aebec0	cbz x0,0x00aebf3c
00aebec4	mov w19,#0x1
00aebec8	b 0x00aebf54
00aebecc	bl 0x00c342a0
00aebed0	adrp x0,0x2bc000
00aebed4	adrp x2,0x2ae000
00aebed8	add x0,x0,#0x4ea
00aebedc	add x2,x2,#0x6b4
00aebee0	mov w1,#0xbd
00aebee4	bl 0x00c342b0
00aebee8	mov w0,#0x2c
00aebeec	mov w1,#0x74
00aebef0	mov x2,xzr
00aebef4	bl 0x00c342c0
00aebef8	mov w19,wzr
00aebefc	mov w0,w19
00aebf00	ldp x29,x30,[sp, #0x20]
00aebf04	ldp x20,x19,[sp, #0x10]
00aebf08	ldp x22,x21,[sp], #0x30
00aebf0c	ret
00aebf10	bl 0x00c342a0
00aebf14	adrp x0,0x2bc000
00aebf18	adrp x2,0x2ae000
00aebf1c	add x0,x0,#0x4ea
00aebf20	add x2,x2,#0x6b4
00aebf24	mov w1,#0xc2
00aebf28	bl 0x00c342b0
00aebf2c	mov w1,#0x100
00aebf30	mov w0,#0x2c
00aebf34	movk w1,#0xc, LSL #16
00aebf38	b 0x00aebef0
00aebf3c	ldr x0,[x21, #0x318]
00aebf40	bl 0x00c395f0
00aebf44	mov w19,wzr
00aebf48	cbnz w0,0x00aebf54
00aebf4c	b 0x00aebec4
00aebf50	mov w19,wzr
00aebf54	ldr x0,[x20, #0x310]
00aebf58	bl 0x00c35690
00aebf5c	b 0x00aebefc
