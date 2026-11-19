; BIO_wait @ 009fd298
009fd298	str x19,[sp, #-0x20]!
009fd29c	stp x29,x30,[sp, #0x10]
009fd2a0	add x29,sp,#0x10
009fd2a4	bl 0x009fd2f8
009fd2a8	mov w19,w0
009fd2ac	cmp w0,#0x0
009fd2b0	b.gt 0x009fd2e8
009fd2b4	bl 0x00c342a0
009fd2b8	adrp x0,0x2b2000
009fd2bc	adrp x2,0x2bb000
009fd2c0	add x0,x0,#0x42
009fd2c4	add x2,x2,#0x9ea
009fd2c8	mov w1,#0x38f
009fd2cc	bl 0x00c342b0
009fd2d0	cmp w19,#0x0
009fd2d4	mov w8,#0x68
009fd2d8	cinc w1,w8,eq
009fd2dc	mov w0,#0x20
009fd2e0	mov x2,xzr
009fd2e4	bl 0x00c342c0
009fd2e8	ldp x29,x30,[sp, #0x10]
009fd2ec	mov w0,w19
009fd2f0	ldr x19,[sp], #0x20
009fd2f4	ret
