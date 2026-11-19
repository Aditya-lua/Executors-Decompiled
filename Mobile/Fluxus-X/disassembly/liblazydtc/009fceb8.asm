; BIO_ctrl_pending @ 009fceb8
009fceb8	stp x29,x30,[sp, #-0x10]!
009fcebc	mov w1,#0xa
009fcec0	mov x2,xzr
009fcec4	mov x3,xzr
009fcec8	mov x29,sp
009fcecc	bl 0x009fcb54
009fced0	bic x0,x0,x0, ASR #0x3f
009fced4	ldp x29,x30,[sp], #0x10
009fced8	ret
