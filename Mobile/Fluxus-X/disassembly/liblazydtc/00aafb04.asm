; OCSP_request_add1_cert @ 00aafb04
00aafb04	stp x20,x19,[sp, #-0x20]!
00aafb08	stp x29,x30,[sp, #0x10]
00aafb0c	mov x20,x0
00aafb10	ldr x0,[x0, #0x20]
00aafb14	mov x19,x1
00aafb18	add x29,sp,#0x10
00aafb1c	cbnz x0,0x00aafb2c
00aafb20	bl 0x00c3eee0
00aafb24	str x0,[x20, #0x20]
00aafb28	cbz x0,0x00aafb4c
00aafb2c	cbz x19,0x00aafb48
00aafb30	ldp x29,x30,[sp, #0x10]
00aafb34	add x0,x0,#0x18
00aafb38	mov w2,#0x1
00aafb3c	mov x1,x19
00aafb40	ldp x20,x19,[sp], #0x20
00aafb44	b 0x00c3ef60
00aafb48	mov w0,#0x1
00aafb4c	ldp x29,x30,[sp, #0x10]
00aafb50	ldp x20,x19,[sp], #0x20
00aafb54	ret
