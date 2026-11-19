; CRYPTO_ocb128_new @ 00aab47c
00aab47c	stp x24,x23,[sp, #-0x40]!
00aab480	mov x23,x1
00aab484	adrp x1,0x2a6000
00aab488	stp x22,x21,[sp, #0x10]
00aab48c	mov x22,x2
00aab490	mov x24,x0
00aab494	add x1,x1,#0x3f0
00aab498	mov w0,#0xb0
00aab49c	mov w2,#0x89
00aab4a0	stp x20,x19,[sp, #0x20]
00aab4a4	stp x29,x30,[sp, #0x30]
00aab4a8	add x29,sp,#0x30
00aab4ac	mov x20,x4
00aab4b0	mov x21,x3
00aab4b4	bl 0x00c32320
00aab4b8	mov x19,x0
00aab4bc	cbz x0,0x00aab4f8
00aab4c0	mov x0,x19
00aab4c4	mov x1,x24
00aab4c8	mov x2,x23
00aab4cc	mov x3,x22
00aab4d0	mov x4,x21
00aab4d4	mov x5,x20
00aab4d8	bl 0x00aab510
00aab4dc	cbnz w0,0x00aab4f8
00aab4e0	adrp x1,0x2a6000
00aab4e4	add x1,x1,#0x3f0
00aab4e8	mov w2,#0x8e
00aab4ec	mov x0,x19
00aab4f0	bl 0x00c32310
00aab4f4	mov x19,xzr
00aab4f8	mov x0,x19
00aab4fc	ldp x29,x30,[sp, #0x30]
00aab500	ldp x20,x19,[sp, #0x20]
00aab504	ldp x22,x21,[sp, #0x10]
00aab508	ldp x24,x23,[sp], #0x40
00aab50c	ret
