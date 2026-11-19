; d2i_PKCS7_bio @ 00b15ecc
00b15ecc	stp x22,x21,[sp, #-0x30]!
00b15ed0	stp x20,x19,[sp, #0x10]
00b15ed4	mov x19,x1
00b15ed8	mov x20,x0
00b15edc	stp x29,x30,[sp, #0x20]
00b15ee0	add x29,sp,#0x20
00b15ee4	cbz x1,0x00b15ef8
00b15ee8	ldr x8,[x19]
00b15eec	cbz x8,0x00b15ef8
00b15ef0	ldp x21,x22,[x8, #0x28]
00b15ef4	b 0x00b15f00
00b15ef8	mov x21,xzr
00b15efc	mov x22,xzr
00b15f00	bl 0x00c3f440
00b15f04	mov x1,x20
00b15f08	mov x2,x19
00b15f0c	mov x3,x21
00b15f10	mov x4,x22
00b15f14	bl 0x00c37430
00b15f18	mov x19,x0
00b15f1c	cbz x0,0x00b15f28
00b15f20	mov x0,x19
00b15f24	bl 0x00c3f720
00b15f28	mov x0,x19
00b15f2c	ldp x29,x30,[sp, #0x20]
00b15f30	ldp x20,x19,[sp, #0x10]
00b15f34	ldp x22,x21,[sp], #0x30
00b15f38	ret
