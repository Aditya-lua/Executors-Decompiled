; PEM_write_PKCS8_PRIV_KEY_INFO @ 00ab9784
00ab9784	sub sp,sp,#0x20
00ab9788	stp x29,x30,[sp, #0x10]
00ab978c	mov x2,x0
00ab9790	adrp x0,0xcb5000
00ab9794	ldr x0,[x0, #0x380]
00ab9798	mov x3,x1
00ab979c	adrp x1,0x2a2000
00ab97a0	add x1,x1,#0xb4c
00ab97a4	mov x4,xzr
00ab97a8	mov x5,xzr
00ab97ac	mov w6,wzr
00ab97b0	mov x7,xzr
00ab97b4	add x29,sp,#0x10
00ab97b8	str xzr,[sp]
00ab97bc	bl 0x00c36060
00ab97c0	ldp x29,x30,[sp, #0x10]
00ab97c4	add sp,sp,#0x20
00ab97c8	ret
