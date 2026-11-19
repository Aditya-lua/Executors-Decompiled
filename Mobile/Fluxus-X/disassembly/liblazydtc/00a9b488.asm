; CRYPTO_strdup @ 00a9b488
00a9b488	str x21,[sp, #-0x30]!
00a9b48c	stp x20,x19,[sp, #0x10]
00a9b490	stp x29,x30,[sp, #0x20]
00a9b494	add x29,sp,#0x20
00a9b498	cbz x0,0x00a9b4d4
00a9b49c	mov w20,w2
00a9b4a0	mov x21,x1
00a9b4a4	mov x19,x0
00a9b4a8	bl 0x00c2ff50
00a9b4ac	add x0,x0,#0x1
00a9b4b0	mov x1,x21
00a9b4b4	mov w2,w20
00a9b4b8	bl 0x00c32320
00a9b4bc	mov x20,x0
00a9b4c0	cbz x0,0x00a9b4d8
00a9b4c4	mov x0,x20
00a9b4c8	mov x1,x19
00a9b4cc	bl 0x00c31b90
00a9b4d0	b 0x00a9b4d8
00a9b4d4	mov x20,xzr
00a9b4d8	mov x0,x20
00a9b4dc	ldp x29,x30,[sp, #0x20]
00a9b4e0	ldp x20,x19,[sp, #0x10]
00a9b4e4	ldr x21,[sp], #0x30
00a9b4e8	ret
