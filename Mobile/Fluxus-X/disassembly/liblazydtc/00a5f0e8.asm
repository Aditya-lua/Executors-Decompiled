; EVP_CIPHER_CTX_get1_cipher @ 00a5f0e8
00a5f0e8	cbz x0,0x00a5f114
00a5f0ec	str x19,[sp, #-0x20]!
00a5f0f0	stp x29,x30,[sp, #0x10]
00a5f0f4	ldr x19,[x0]
00a5f0f8	add x29,sp,#0x10
00a5f0fc	mov x0,x19
00a5f100	bl 0x00c357e0
00a5f104	ldp x29,x30,[sp, #0x10]
00a5f108	cmp w0,#0x0
00a5f10c	csel x0,xzr,x19,eq
00a5f110	ldr x19,[sp], #0x20
00a5f114	ret
