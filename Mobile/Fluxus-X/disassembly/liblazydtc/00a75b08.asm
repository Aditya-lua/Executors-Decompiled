; EVP_PKEY_meth_remove @ 00a75b08
00a75b08	stp x29,x30,[sp, #-0x10]!
00a75b0c	adrp x8,0xd21000
00a75b10	ldr x8,[x8, #0xb48]
00a75b14	mov x1,x0
00a75b18	mov x29,sp
00a75b1c	mov x0,x8
00a75b20	bl 0x00c39610
00a75b24	cmp x0,#0x0
00a75b28	cset w0,ne
00a75b2c	ldp x29,x30,[sp], #0x10
00a75b30	ret
