; ossl_rsa_validate_pairwise @ 00acff24
00acff24	stp x29,x30,[sp, #-0x10]!
00acff28	mov x1,xzr
00acff2c	mov x29,sp
00acff30	bl 0x00acff44
00acff34	cmp w0,#0x0
00acff38	cset w0,gt
00acff3c	ldp x29,x30,[sp], #0x10
00acff40	ret
