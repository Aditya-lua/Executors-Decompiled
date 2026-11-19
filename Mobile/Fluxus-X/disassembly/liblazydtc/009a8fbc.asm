; ssl3_get_cipher_by_id @ 009a8fbc
009a8fbc	sub sp,sp,#0x60
009a8fc0	adrp x1,0xcc4000
009a8fc4	str w0,[sp, #0x18]
009a8fc8	add x1,x1,#0xe30
009a8fcc	mov x0,sp
009a8fd0	mov w2,#0x5
009a8fd4	stp x29,x30,[sp, #0x50]
009a8fd8	add x29,sp,#0x50
009a8fdc	bl 0x00c34740
009a8fe0	cbnz x0,0x009a9010
009a8fe4	adrp x1,0xcc4000
009a8fe8	add x1,x1,#0xfc0
009a8fec	mov x0,sp
009a8ff0	mov w2,#0xa7
009a8ff4	bl 0x00c34740
009a8ff8	cbnz x0,0x009a9010
009a8ffc	adrp x1,0xcc8000
009a9000	add x1,x1,#0x3f0
009a9004	mov x0,sp
009a9008	mov w2,#0x2
009a900c	bl 0x00c34740
009a9010	ldp x29,x30,[sp, #0x50]
009a9014	add sp,sp,#0x60
009a9018	ret
