; PEM_write_X509_AUX @ 00aba0c8
00aba0c8	sub sp,sp,#0x20
00aba0cc	stp x29,x30,[sp, #0x10]
00aba0d0	mov x2,x0
00aba0d4	adrp x0,0xcb5000
00aba0d8	ldr x0,[x0, #0x758]
00aba0dc	mov x3,x1
00aba0e0	adrp x1,0x2c6000
00aba0e4	add x1,x1,#0xbc
00aba0e8	mov x4,xzr
00aba0ec	mov x5,xzr
00aba0f0	mov w6,wzr
00aba0f4	mov x7,xzr
00aba0f8	add x29,sp,#0x10
00aba0fc	str xzr,[sp]
00aba100	bl 0x00c36060
00aba104	ldp x29,x30,[sp, #0x10]
00aba108	add sp,sp,#0x20
00aba10c	ret
