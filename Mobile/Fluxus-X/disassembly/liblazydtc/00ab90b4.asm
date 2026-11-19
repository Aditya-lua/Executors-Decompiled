; i2d_PKCS8PrivateKey_bio @ 00ab90b4
00ab90b4	sub sp,sp,#0x20
00ab90b8	mov w8,w4
00ab90bc	mov x7,x5
00ab90c0	mov x5,x3
00ab90c4	mov x4,x2
00ab90c8	mov w2,#0x1
00ab90cc	mov w3,#0xffffffff
00ab90d0	str x6,[sp]
00ab90d4	mov w6,w8
00ab90d8	stp x29,x30,[sp, #0x10]
00ab90dc	add x29,sp,#0x10
00ab90e0	bl 0x00ab8d5c
00ab90e4	ldp x29,x30,[sp, #0x10]
00ab90e8	add sp,sp,#0x20
00ab90ec	ret
