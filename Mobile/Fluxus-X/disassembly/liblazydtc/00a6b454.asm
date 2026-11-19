; PKCS5_PBKDF2_HMAC_SHA1 @ 00a6b454
00a6b454	sub sp,sp,#0x60
00a6b458	stp x26,x25,[sp, #0x10]
00a6b45c	mov w25,w1
00a6b460	adrp x1,0x2d1000
00a6b464	stp x24,x23,[sp, #0x20]
00a6b468	mov x24,x2
00a6b46c	mov x26,x0
00a6b470	add x1,x1,#0x42e
00a6b474	mov x0,xzr
00a6b478	mov x2,xzr
00a6b47c	stp x22,x21,[sp, #0x30]
00a6b480	stp x20,x19,[sp, #0x40]
00a6b484	stp x29,x30,[sp, #0x50]
00a6b488	add x29,sp,#0x50
00a6b48c	mov x19,x6
00a6b490	mov w21,w5
00a6b494	mov w22,w4
00a6b498	mov w23,w3
00a6b49c	bl 0x00c357f0
00a6b4a0	mov x20,x0
00a6b4a4	cbz x0,0x00a6b4d8
00a6b4a8	mov x0,x26
00a6b4ac	mov w1,w25
00a6b4b0	mov x2,x24
00a6b4b4	mov w3,w23
00a6b4b8	mov w4,w22
00a6b4bc	mov x5,x20
00a6b4c0	mov w6,w21
00a6b4c4	mov x7,x19
00a6b4c8	stp xzr,xzr,[sp]
00a6b4cc	bl 0x00a6b228
00a6b4d0	mov w19,w0
00a6b4d4	b 0x00a6b4dc
00a6b4d8	mov w19,wzr
00a6b4dc	mov x0,x20
00a6b4e0	bl 0x00c35800
00a6b4e4	mov w0,w19
00a6b4e8	ldp x29,x30,[sp, #0x50]
00a6b4ec	ldp x20,x19,[sp, #0x40]
00a6b4f0	ldp x22,x21,[sp, #0x30]
00a6b4f4	ldp x24,x23,[sp, #0x20]
00a6b4f8	ldp x26,x25,[sp, #0x10]
00a6b4fc	add sp,sp,#0x60
00a6b500	ret
