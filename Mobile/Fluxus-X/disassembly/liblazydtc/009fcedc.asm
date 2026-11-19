; BIO_ctrl_wpending @ 009fcedc
009fcedc	stp x29,x30,[sp, #-0x10]!
009fcee0	mov w1,#0xd
009fcee4	mov x2,xzr
009fcee8	mov x3,xzr
009fceec	mov x29,sp
009fcef0	bl 0x009fcb54
009fcef4	bic x0,x0,x0, ASR #0x3f
009fcef8	ldp x29,x30,[sp], #0x10
009fcefc	ret
