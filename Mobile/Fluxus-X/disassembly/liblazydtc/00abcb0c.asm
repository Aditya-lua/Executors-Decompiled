; PKCS12_SAFEBAG_create0_p8inf @ 00abcb0c
00abcb0c	stp x20,x19,[sp, #-0x20]!
00abcb10	stp x29,x30,[sp, #0x10]
00abcb14	add x29,sp,#0x10
00abcb18	mov x20,x0
00abcb1c	bl 0x00c3f420
00abcb20	mov x19,x0
00abcb24	cbz x0,0x00abcb38
00abcb28	mov w0,#0x96
00abcb2c	bl 0x00c37740
00abcb30	stp x0,x20,[x19]
00abcb34	b 0x00abcb68
00abcb38	bl 0x00c342a0
00abcb3c	adrp x0,0x2a8000
00abcb40	adrp x2,0x2bc000
00abcb44	add x0,x0,#0x6fe
00abcb48	add x2,x2,#0x323
00abcb4c	mov w1,#0xb1
00abcb50	bl 0x00c342b0
00abcb54	mov w1,#0x100
00abcb58	mov w0,#0x23
00abcb5c	movk w1,#0xc, LSL #16
00abcb60	mov x2,xzr
00abcb64	bl 0x00c342c0
00abcb68	ldp x29,x30,[sp, #0x10]
00abcb6c	mov x0,x19
00abcb70	ldp x20,x19,[sp], #0x20
00abcb74	ret
