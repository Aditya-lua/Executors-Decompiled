; SSL_SESSION_new @ 009bd324
009bd324	stp x20,x19,[sp, #-0x20]!
009bd328	mov w0,#0x200000
009bd32c	mov x1,xzr
009bd330	stp x29,x30,[sp, #0x10]
009bd334	add x29,sp,#0x10
009bd338	bl 0x00c325d0
009bd33c	cbz w0,0x009bd45c
009bd340	adrp x1,0x2db000
009bd344	add x1,x1,#0xb17
009bd348	mov w0,#0x3a0
009bd34c	mov w2,#0x81
009bd350	bl 0x00c34250
009bd354	mov x19,x0
009bd358	cbz x0,0x009bd3e4
009bd35c	mov w8,#0x1
009bd360	add x9,x19,#0x2d0
009bd364	mov w10,#0x130
009bd368	mov x0,xzr
009bd36c	str x8,[x19, #0x2c8]
009bd370	stlr w8,[x9]
009bd374	str x10,[x19, #0x2d8]
009bd378	bl 0x00c30970
009bd37c	ldr x8,[x19, #0x2d8]
009bd380	str x0,[x19, #0x2e0]
009bd384	tbz x8,#0x3f,0x009bd390
009bd388	mov x8,xzr
009bd38c	str xzr,[x19, #0x2d8]
009bd390	add x9,x0,x8
009bd394	lsr x8,x8,#0x3f
009bd398	cmp x0,#0x0
009bd39c	csel w8,w8,wzr,gt
009bd3a0	str x9,[x19, #0x2e8]
009bd3a4	str w8,[x19, #0x2f0]
009bd3a8	bl 0x00c34d50
009bd3ac	str x0,[x19, #0x398]
009bd3b0	cbz x0,0x009bd418
009bd3b4	add x2,x19,#0x310
009bd3b8	mov w0,#0x2
009bd3bc	mov x1,x19
009bd3c0	bl 0x00c356e0
009bd3c4	cbnz w0,0x009bd460
009bd3c8	ldr x0,[x19, #0x398]
009bd3cc	bl 0x00c34d40
009bd3d0	adrp x1,0x2db000
009bd3d4	add x1,x1,#0xb17
009bd3d8	mov w2,#0x95
009bd3dc	mov x0,x19
009bd3e0	b 0x009bd458
009bd3e4	bl 0x00c342a0
009bd3e8	adrp x0,0x2db000
009bd3ec	adrp x2,0x2a9000
009bd3f0	add x0,x0,#0xb17
009bd3f4	add x2,x2,#0xe23
009bd3f8	mov w1,#0x83
009bd3fc	bl 0x00c342b0
009bd400	mov w1,#0x100
009bd404	mov w0,#0x14
009bd408	movk w1,#0xc, LSL #16
009bd40c	mov x2,xzr
009bd410	bl 0x00c342c0
009bd414	b 0x009bd460
009bd418	bl 0x00c342a0
009bd41c	adrp x20,0x2db000
009bd420	add x20,x20,#0xb17
009bd424	adrp x2,0x2a9000
009bd428	add x2,x2,#0xe23
009bd42c	mov w1,#0x8e
009bd430	mov x0,x20
009bd434	bl 0x00c342b0
009bd438	mov w1,#0x100
009bd43c	mov w0,#0x14
009bd440	movk w1,#0xc, LSL #16
009bd444	mov x2,xzr
009bd448	bl 0x00c342c0
009bd44c	mov w2,#0x8f
009bd450	mov x0,x19
009bd454	mov x1,x20
009bd458	bl 0x00c32310
009bd45c	mov x19,xzr
009bd460	ldp x29,x30,[sp, #0x10]
009bd464	mov x0,x19
009bd468	ldp x20,x19,[sp], #0x20
009bd46c	ret
