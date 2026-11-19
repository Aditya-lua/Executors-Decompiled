; EVP_PKEY_CTX_get_rsa_oaep_md @ 00ad288c
00ad288c	stp x20,x19,[sp, #-0x20]!
00ad2890	mov x19,x1
00ad2894	adrp x1,0x2db000
00ad2898	add x1,x1,#0x996
00ad289c	stp x29,x30,[sp, #0x10]
00ad28a0	add x29,sp,#0x10
00ad28a4	mov x20,x0
00ad28a8	bl 0x00c3dc40
00ad28ac	cbz w0,0x00ad28d4
00ad28b0	ldp x29,x30,[sp, #0x10]
00ad28b4	orr w1,wzr,#0x6
00ad28b8	orr w2,wzr,#0x600
00ad28bc	mov w3,#0x100b
00ad28c0	mov x0,x20
00ad28c4	mov w4,wzr
00ad28c8	mov x5,x19
00ad28cc	ldp x20,x19,[sp], #0x20
00ad28d0	b 0x00c370f0
00ad28d4	ldp x29,x30,[sp, #0x10]
00ad28d8	mov w0,#0xffffffff
00ad28dc	ldp x20,x19,[sp], #0x20
00ad28e0	ret
