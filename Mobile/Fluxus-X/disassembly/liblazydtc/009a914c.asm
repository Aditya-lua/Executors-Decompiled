; ssl3_get_cipher_by_char @ 009a914c
009a914c	sub sp,sp,#0x60
009a9150	stp x29,x30,[sp, #0x50]
009a9154	ldrb w8,[x0]
009a9158	ldrb w9,[x0, #0x1]
009a915c	adrp x1,0xcc4000
009a9160	add x1,x1,#0xe30
009a9164	mov x0,sp
009a9168	bfm w9,w8,#0x18,#0x7
009a916c	orr w8,w9,#0x3000000
009a9170	mov w2,#0x5
009a9174	add x29,sp,#0x50
009a9178	str w8,[sp, #0x18]
009a917c	bl 0x00c34740
009a9180	cbnz x0,0x009a91b0
009a9184	adrp x1,0xcc4000
009a9188	add x1,x1,#0xfc0
009a918c	mov x0,sp
009a9190	mov w2,#0xa7
009a9194	bl 0x00c34740
009a9198	cbnz x0,0x009a91b0
009a919c	adrp x1,0xcc8000
009a91a0	add x1,x1,#0x3f0
009a91a4	mov x0,sp
009a91a8	mov w2,#0x2
009a91ac	bl 0x00c34740
009a91b0	ldp x29,x30,[sp, #0x50]
009a91b4	add sp,sp,#0x60
009a91b8	ret
