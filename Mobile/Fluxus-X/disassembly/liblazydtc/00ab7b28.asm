; EVP_get_pw_prompt @ 00ab7b28
00ab7b28	adrp x8,0xd22000
00ab7b2c	add x8,x8,#0x1a0
00ab7b30	ldrb w9,[x8]
00ab7b34	cmp w9,#0x0
00ab7b38	csel x0,xzr,x8,eq
00ab7b3c	ret
