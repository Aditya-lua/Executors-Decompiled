; mbedtls_platform_entropy_poll @ 00b76eb8
00b76eb8	stp x22,x21,[sp, #-0x30]!
00b76ebc	stp x20,x19,[sp, #0x10]
00b76ec0	stp x29,x30,[sp, #0x20]
00b76ec4	add x29,sp,#0x20
00b76ec8	mov x21,x1
00b76ecc	adrp x0,0x2cd000
00b76ed0	adrp x1,0x2bb000
00b76ed4	add x0,x0,#0x391
00b76ed8	add x1,x1,#0x65
00b76edc	mov x19,x3
00b76ee0	mov x20,x2
00b76ee4	str xzr,[x3]
00b76ee8	bl 0x00c30c10
00b76eec	mov x22,x0
00b76ef0	cbz x0,0x00b76f34
00b76ef4	mov x0,x22
00b76ef8	mov x1,xzr
00b76efc	bl 0x00c42490
00b76f00	mov w1,#0x1
00b76f04	mov x0,x21
00b76f08	mov x2,x20
00b76f0c	mov x3,x22
00b76f10	bl 0x00c31e60
00b76f14	mov x21,x0
00b76f18	mov x0,x22
00b76f1c	bl 0x00c30be0
00b76f20	cmp x21,x20
00b76f24	b.ne 0x00b76f34
00b76f28	mov w0,wzr
00b76f2c	str x20,[x19]
00b76f30	b 0x00b76f38
00b76f34	mov w0,#0xffffffc4
00b76f38	ldp x29,x30,[sp, #0x20]
00b76f3c	ldp x20,x19,[sp, #0x10]
00b76f40	ldp x22,x21,[sp], #0x30
00b76f44	ret
