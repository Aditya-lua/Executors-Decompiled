; PEM_write_bio_RSA_PUBKEY @ 00ab4c74
00ab4c74	sub sp,sp,#0x20
00ab4c78	stp x29,x30,[sp, #0x10]
00ab4c7c	mov x2,x0
00ab4c80	adrp x0,0xcb5000
00ab4c84	ldr x0,[x0, #0x738]
00ab4c88	mov x3,x1
00ab4c8c	adrp x1,0x2da000
00ab4c90	add x1,x1,#0x514
00ab4c94	mov x4,xzr
00ab4c98	mov x5,xzr
00ab4c9c	mov w6,wzr
00ab4ca0	mov x7,xzr
00ab4ca4	add x29,sp,#0x10
00ab4ca8	str xzr,[sp]
00ab4cac	bl 0x00c36070
00ab4cb0	ldp x29,x30,[sp, #0x10]
00ab4cb4	add sp,sp,#0x20
00ab4cb8	ret
