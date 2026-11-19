; PEM_write_bio_ECPKParameters @ 00ab50d8
00ab50d8	sub sp,sp,#0x20
00ab50dc	stp x29,x30,[sp, #0x10]
00ab50e0	mov x2,x0
00ab50e4	adrp x0,0xcb5000
00ab50e8	ldr x0,[x0, #0x578]
00ab50ec	mov x3,x1
00ab50f0	adrp x1,0x2d4000
00ab50f4	add x1,x1,#0x2c4
00ab50f8	mov x4,xzr
00ab50fc	mov x5,xzr
00ab5100	mov w6,wzr
00ab5104	mov x7,xzr
00ab5108	add x29,sp,#0x10
00ab510c	str xzr,[sp]
00ab5110	bl 0x00c36070
00ab5114	ldp x29,x30,[sp, #0x10]
00ab5118	add sp,sp,#0x20
00ab511c	ret
