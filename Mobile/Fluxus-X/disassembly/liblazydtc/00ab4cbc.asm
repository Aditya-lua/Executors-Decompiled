; PEM_write_RSA_PUBKEY @ 00ab4cbc
00ab4cbc	sub sp,sp,#0x20
00ab4cc0	stp x29,x30,[sp, #0x10]
00ab4cc4	mov x2,x0
00ab4cc8	adrp x0,0xcb5000
00ab4ccc	ldr x0,[x0, #0x738]
00ab4cd0	mov x3,x1
00ab4cd4	adrp x1,0x2da000
00ab4cd8	add x1,x1,#0x514
00ab4cdc	mov x4,xzr
00ab4ce0	mov x5,xzr
00ab4ce4	mov w6,wzr
00ab4ce8	mov x7,xzr
00ab4cec	add x29,sp,#0x10
00ab4cf0	str xzr,[sp]
00ab4cf4	bl 0x00c36060
00ab4cf8	ldp x29,x30,[sp, #0x10]
00ab4cfc	add sp,sp,#0x20
00ab4d00	ret
