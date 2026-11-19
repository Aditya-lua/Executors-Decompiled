; PEM_write_PKCS7 @ 00ab48bc
00ab48bc	sub sp,sp,#0x20
00ab48c0	stp x29,x30,[sp, #0x10]
00ab48c4	mov x2,x0
00ab48c8	adrp x0,0xcb5000
00ab48cc	ldr x0,[x0, #0x720]
00ab48d0	mov x3,x1
00ab48d4	adrp x1,0x2ba000
00ab48d8	add x1,x1,#0x5f6
00ab48dc	mov x4,xzr
00ab48e0	mov x5,xzr
00ab48e4	mov w6,wzr
00ab48e8	mov x7,xzr
00ab48ec	add x29,sp,#0x10
00ab48f0	str xzr,[sp]
00ab48f4	bl 0x00c36060
00ab48f8	ldp x29,x30,[sp, #0x10]
00ab48fc	add sp,sp,#0x20
00ab4900	ret
