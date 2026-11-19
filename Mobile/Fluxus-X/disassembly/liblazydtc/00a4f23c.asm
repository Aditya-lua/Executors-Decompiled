; OSSL_DECODER_CTX_free @ 00a4f23c
00a4f23c	cbz x0,0x00a4f294
00a4f240	str x19,[sp, #-0x20]!
00a4f244	stp x29,x30,[sp, #0x10]
00a4f248	ldr x8,[x0, #0x28]
00a4f24c	mov x19,x0
00a4f250	add x29,sp,#0x10
00a4f254	cbz x8,0x00a4f260
00a4f258	ldr x0,[x19, #0x30]
00a4f25c	blr x8
00a4f260	adrp x1,0xcb5000
00a4f264	ldr x0,[x19, #0x18]
00a4f268	ldr x1,[x1, #0x598]
00a4f26c	bl 0x00c32600
00a4f270	add x0,x19,#0x38
00a4f274	bl 0x00c3b6b0
00a4f278	ldp x29,x30,[sp, #0x10]
00a4f27c	adrp x1,0x2db000
00a4f280	add x1,x1,#0xf32
00a4f284	mov w2,#0x2bb
00a4f288	mov x0,x19
00a4f28c	ldr x19,[sp], #0x20
00a4f290	b 0x00c32310
00a4f294	ret
