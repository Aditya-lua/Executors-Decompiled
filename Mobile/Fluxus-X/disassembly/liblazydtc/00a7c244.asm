; EVP_PKEY_verify @ 00a7c244
00a7c244	stp x29,x30,[sp, #-0x10]!
00a7c248	mov x29,sp
00a7c24c	cbz x0,0x00a7c27c
00a7c250	ldr w8,[x0]
00a7c254	cmp w8,#0x20
00a7c258	b.ne 0x00a7c2a8
00a7c25c	ldr x8,[x0, #0x30]
00a7c260	cbz x8,0x00a7c2e0
00a7c264	ldr x9,[x0, #0x28]
00a7c268	ldr x5,[x9, #0x50]
00a7c26c	cbz x5,0x00a7c2f8
00a7c270	mov x0,x8
00a7c274	ldp x29,x30,[sp], #0x10
00a7c278	br x5
00a7c27c	bl 0x00c342a0
00a7c280	adrp x0,0x2d1000
00a7c284	adrp x2,0x2c5000
00a7c288	add x0,x0,#0xaf6
00a7c28c	add x2,x2,#0xb76
00a7c290	mov w1,#0x2ae
00a7c294	bl 0x00c342b0
00a7c298	mov w1,#0x102
00a7c29c	orr w0,wzr,#0x6
00a7c2a0	movk w1,#0xc, LSL #16
00a7c2a4	b 0x00a7c2cc
00a7c2a8	bl 0x00c342a0
00a7c2ac	adrp x0,0x2d1000
00a7c2b0	adrp x2,0x2c5000
00a7c2b4	add x0,x0,#0xaf6
00a7c2b8	add x2,x2,#0xb76
00a7c2bc	mov w1,#0x2b3
00a7c2c0	bl 0x00c342b0
00a7c2c4	orr w0,wzr,#0x6
00a7c2c8	mov w1,#0x97
00a7c2cc	mov x2,xzr
00a7c2d0	bl 0x00c342c0
00a7c2d4	mov w0,#0xffffffff
00a7c2d8	ldp x29,x30,[sp], #0x10
00a7c2dc	ret
00a7c2e0	ldr x8,[x0, #0x78]
00a7c2e4	cbz x8,0x00a7c314
00a7c2e8	ldr x5,[x8, #0x58]
00a7c2ec	cbz x5,0x00a7c314
00a7c2f0	ldp x29,x30,[sp], #0x10
00a7c2f4	br x5
00a7c2f8	bl 0x00c342a0
00a7c2fc	adrp x0,0x2d1000
00a7c300	adrp x2,0x2c5000
00a7c304	add x0,x0,#0xaf6
00a7c308	add x2,x2,#0xb76
00a7c30c	mov w1,#0x2bb
00a7c310	b 0x00a7c32c
00a7c314	bl 0x00c342a0
00a7c318	adrp x0,0x2d1000
00a7c31c	adrp x2,0x2c5000
00a7c320	add x0,x0,#0xaf6
00a7c324	add x2,x2,#0xb76
00a7c328	mov w1,#0x2c5
00a7c32c	bl 0x00c342b0
00a7c330	orr w0,wzr,#0x6
00a7c334	mov w1,#0x96
00a7c338	mov x2,xzr
00a7c33c	bl 0x00c342c0
00a7c340	orr w0,wzr,#0xfffffffe
00a7c344	ldp x29,x30,[sp], #0x10
00a7c348	ret
