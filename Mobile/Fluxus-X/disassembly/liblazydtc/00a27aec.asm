; ossl_ec_key_from_pkcs8 @ 00a27aec
00a27aec	sub sp,sp,#0x40
00a27af0	stp x20,x19,[sp, #0x20]
00a27af4	mov x19,x2
00a27af8	mov x20,x1
00a27afc	mov x4,x0
00a27b00	add x1,sp,#0x18
00a27b04	add x2,sp,#0x14
00a27b08	mov x3,sp
00a27b0c	mov x0,xzr
00a27b10	stp x29,x30,[sp, #0x30]
00a27b14	add x29,sp,#0x30
00a27b18	str xzr,[sp, #0x18]
00a27b1c	str xzr,[sp, #0x8]
00a27b20	bl 0x00c37eb0
00a27b24	cbz w0,0x00a27b90
00a27b28	ldr x0,[sp]
00a27b2c	mov x1,x20
00a27b30	mov x2,x19
00a27b34	bl 0x00a27988
00a27b38	str x0,[sp, #0x8]
00a27b3c	cbz x0,0x00a27b8c
00a27b40	ldrsw x2,[sp, #0x14]
00a27b44	add x0,sp,#0x8
00a27b48	add x1,sp,#0x18
00a27b4c	bl 0x00c3a910
00a27b50	cbz x0,0x00a27b5c
00a27b54	ldr x0,[sp, #0x8]
00a27b58	b 0x00a27b94
00a27b5c	bl 0x00c342a0
00a27b60	adrp x0,0x2b2000
00a27b64	adrp x2,0x2c7000
00a27b68	add x0,x0,#0x127
00a27b6c	add x2,x2,#0x7f0
00a27b70	mov w1,#0x341
00a27b74	bl 0x00c342b0
00a27b78	mov w0,#0x10
00a27b7c	mov w1,#0x8e
00a27b80	mov x2,xzr
00a27b84	bl 0x00c342c0
00a27b88	ldr x0,[sp, #0x8]
00a27b8c	bl 0x00c3a7c0
00a27b90	mov x0,xzr
00a27b94	ldp x29,x30,[sp, #0x30]
00a27b98	ldp x20,x19,[sp, #0x20]
00a27b9c	add sp,sp,#0x40
00a27ba0	ret
