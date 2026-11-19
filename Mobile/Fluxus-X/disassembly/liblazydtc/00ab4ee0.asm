; PEM_read_DSAPrivateKey @ 00ab4ee0
00ab4ee0	str x21,[sp, #-0x30]!
00ab4ee4	stp x20,x19,[sp, #0x10]
00ab4ee8	mov x19,x1
00ab4eec	mov x1,xzr
00ab4ef0	stp x29,x30,[sp, #0x20]
00ab4ef4	add x29,sp,#0x20
00ab4ef8	bl 0x00c3f210
00ab4efc	cbz x0,0x00ab4f2c
00ab4f00	mov x21,x0
00ab4f04	bl 0x00c3d940
00ab4f08	mov x20,x0
00ab4f0c	mov x0,x21
00ab4f10	bl 0x00c32450
00ab4f14	cbz x20,0x00ab4f30
00ab4f18	cbz x19,0x00ab4f30
00ab4f1c	ldr x0,[x19]
00ab4f20	bl 0x00c3a0a0
00ab4f24	str x20,[x19]
00ab4f28	b 0x00ab4f30
00ab4f2c	mov x20,xzr
00ab4f30	mov x0,x20
00ab4f34	ldp x29,x30,[sp, #0x20]
00ab4f38	ldp x20,x19,[sp, #0x10]
00ab4f3c	ldr x21,[sp], #0x30
00ab4f40	ret
