; ossl_drbg_set_ctx_params @ 00b59bd8
00b59bd8	stp x20,x19,[sp, #-0x20]!
00b59bdc	stp x29,x30,[sp, #0x10]
00b59be0	add x29,sp,#0x10
00b59be4	cbz x1,0x00b59c30
00b59be8	mov x20,x1
00b59bec	adrp x1,0x2ce000
00b59bf0	mov x19,x0
00b59bf4	add x1,x1,#0x281
00b59bf8	mov x0,x20
00b59bfc	bl 0x00c36530
00b59c00	cbz x0,0x00b59c10
00b59c04	add x1,x19,#0xc4
00b59c08	bl 0x00c36520
00b59c0c	cbz w0,0x00b59c34
00b59c10	adrp x1,0x2c6000
00b59c14	add x1,x1,#0x228
00b59c18	mov x0,x20
00b59c1c	bl 0x00c36530
00b59c20	cbz x0,0x00b59c30
00b59c24	add x1,x19,#0xd0
00b59c28	bl 0x00c3e930
00b59c2c	cbz w0,0x00b59c34
00b59c30	mov w0,#0x1
00b59c34	ldp x29,x30,[sp, #0x10]
00b59c38	ldp x20,x19,[sp], #0x20
00b59c3c	ret
