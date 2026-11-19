; EVP_PKEY_set1_RSA @ 00a6bac0
00a6bac0	stp x20,x19,[sp, #-0x20]!
00a6bac4	mov x19,x1
00a6bac8	orr w1,wzr,#0x6
00a6bacc	mov x2,x19
00a6bad0	stp x29,x30,[sp, #0x10]
00a6bad4	add x29,sp,#0x10
00a6bad8	bl 0x00c39b70
00a6badc	mov w20,w0
00a6bae0	cbz w0,0x00a6baec
00a6bae4	mov x0,x19
00a6bae8	bl 0x00c3d900
00a6baec	ldp x29,x30,[sp, #0x10]
00a6baf0	mov w0,w20
00a6baf4	ldp x20,x19,[sp], #0x20
00a6baf8	ret
