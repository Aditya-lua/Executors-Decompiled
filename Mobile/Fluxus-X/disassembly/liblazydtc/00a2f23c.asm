; ossl_ec_key_simple_check_key @ 00a2f23c
00a2f23c	stp x20,x19,[sp, #-0x20]!
00a2f240	mov x20,x0
00a2f244	stp x29,x30,[sp, #0x10]
00a2f248	add x29,sp,#0x10
00a2f24c	cbz x0,0x00a2f29c
00a2f250	ldr x0,[x20, #0x58]
00a2f254	bl 0x00c38a60
00a2f258	cbz x0,0x00a2f2d0
00a2f25c	mov x19,x0
00a2f260	mov x0,x20
00a2f264	mov x1,x19
00a2f268	bl 0x00a2ef34
00a2f26c	cbz w0,0x00a2f2d8
00a2f270	ldr x8,[x20, #0x28]
00a2f274	cbz x8,0x00a2f294
00a2f278	mov x0,x20
00a2f27c	bl 0x00a2f054
00a2f280	cbz w0,0x00a2f2d8
00a2f284	mov x0,x20
00a2f288	mov x1,x19
00a2f28c	bl 0x00a2f110
00a2f290	cbz w0,0x00a2f2d8
00a2f294	mov w20,#0x1
00a2f298	b 0x00a2f2dc
00a2f29c	bl 0x00c342a0
00a2f2a0	adrp x0,0x2b4000
00a2f2a4	adrp x2,0x2a5000
00a2f2a8	add x0,x0,#0x15e
00a2f2ac	add x2,x2,#0xe0f
00a2f2b0	mov w1,#0x242
00a2f2b4	bl 0x00c342b0
00a2f2b8	mov w1,#0x102
00a2f2bc	mov w0,#0x10
00a2f2c0	movk w1,#0xc, LSL #16
00a2f2c4	mov x2,xzr
00a2f2c8	bl 0x00c342c0
00a2f2cc	b 0x00a2f2e4
00a2f2d0	mov w20,wzr
00a2f2d4	b 0x00a2f2e4
00a2f2d8	mov w20,wzr
00a2f2dc	mov x0,x19
00a2f2e0	bl 0x00c38a30
00a2f2e4	ldp x29,x30,[sp, #0x10]
00a2f2e8	mov w0,w20
00a2f2ec	ldp x20,x19,[sp], #0x20
00a2f2f0	ret
