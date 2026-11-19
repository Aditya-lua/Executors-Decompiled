; PEM_write_bio_DSA_PUBKEY @ 00ab4e50
00ab4e50	sub sp,sp,#0x20
00ab4e54	stp x29,x30,[sp, #0x10]
00ab4e58	mov x2,x0
00ab4e5c	adrp x0,0xcb5000
00ab4e60	ldr x0,[x0, #0x710]
00ab4e64	mov x3,x1
00ab4e68	adrp x1,0x2da000
00ab4e6c	add x1,x1,#0x514
00ab4e70	mov x4,xzr
00ab4e74	mov x5,xzr
00ab4e78	mov w6,wzr
00ab4e7c	mov x7,xzr
00ab4e80	add x29,sp,#0x10
00ab4e84	str xzr,[sp]
00ab4e88	bl 0x00c36070
00ab4e8c	ldp x29,x30,[sp, #0x10]
00ab4e90	add sp,sp,#0x20
00ab4e94	ret
