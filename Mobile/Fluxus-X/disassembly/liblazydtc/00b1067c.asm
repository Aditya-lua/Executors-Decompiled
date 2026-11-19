; X509_STORE_CTX_set_default @ 00b1067c
00b1067c	stp x20,x19,[sp, #-0x20]!
00b10680	mov x20,x0
00b10684	mov x0,x1
00b10688	stp x29,x30,[sp, #0x10]
00b1068c	add x29,sp,#0x10
00b10690	mov x19,x1
00b10694	bl 0x00c40e50
00b10698	cbz x0,0x00b106b0
00b1069c	mov x1,x0
00b106a0	ldr x0,[x20, #0x20]
00b106a4	ldp x29,x30,[sp, #0x10]
00b106a8	ldp x20,x19,[sp], #0x20
00b106ac	b 0x00c35bd0
00b106b0	bl 0x00c342a0
00b106b4	adrp x0,0x2a0000
00b106b8	adrp x2,0x2cc000
00b106bc	add x0,x0,#0xe02
00b106c0	add x2,x2,#0x2b4
00b106c4	mov w1,#0xa46
00b106c8	bl 0x00c342b0
00b106cc	adrp x2,0x2ad000
00b106d0	add x2,x2,#0x7ba
00b106d4	mov w0,#0xb
00b106d8	mov w1,#0x79
00b106dc	mov x3,x19
00b106e0	bl 0x00c342c0
00b106e4	ldp x29,x30,[sp, #0x10]
00b106e8	mov w0,wzr
00b106ec	ldp x20,x19,[sp], #0x20
00b106f0	ret
