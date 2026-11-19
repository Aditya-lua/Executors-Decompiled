; EVP_PKEY_print_public_fp @ 00a6e494
00a6e494	stp x22,x21,[sp, #-0x30]!
00a6e498	mov x21,x1
00a6e49c	mov w1,wzr
00a6e4a0	stp x20,x19,[sp, #0x10]
00a6e4a4	stp x29,x30,[sp, #0x20]
00a6e4a8	add x29,sp,#0x20
00a6e4ac	mov x19,x3
00a6e4b0	mov w20,w2
00a6e4b4	bl 0x00c37810
00a6e4b8	cbz x0,0x00a6e4fc
00a6e4bc	ldr x8,[x21, #0x8]
00a6e4c0	mov x22,x0
00a6e4c4	cbz x8,0x00a6e4d0
00a6e4c8	ldr x4,[x8, #0x38]
00a6e4cc	b 0x00a6e4d4
00a6e4d0	mov x4,xzr
00a6e4d4	mov w3,#0x86
00a6e4d8	mov x0,x21
00a6e4dc	mov x1,x22
00a6e4e0	mov w2,w20
00a6e4e4	mov x5,x19
00a6e4e8	bl 0x00a6e250
00a6e4ec	mov w19,w0
00a6e4f0	mov x0,x22
00a6e4f4	bl 0x00c31a40
00a6e4f8	mov w0,w19
00a6e4fc	ldp x29,x30,[sp, #0x20]
00a6e500	ldp x20,x19,[sp, #0x10]
00a6e504	ldp x22,x21,[sp], #0x30
00a6e508	ret
