; X509_STORE_load_store @ 00b09ec0
00b09ec0	stp x20,x19,[sp, #-0x20]!
00b09ec4	stp x29,x30,[sp, #0x10]
00b09ec8	add x29,sp,#0x10
00b09ecc	cbz x1,0x00b09f14
00b09ed0	mov x19,x1
00b09ed4	mov x20,x0
00b09ed8	bl 0x00c35b40
00b09edc	mov x1,x0
00b09ee0	mov x0,x20
00b09ee4	bl 0x00c32c00
00b09ee8	cbz x0,0x00b09f18
00b09eec	orr w1,wzr,#0x3
00b09ef0	mov x2,x19
00b09ef4	mov x3,xzr
00b09ef8	mov x4,xzr
00b09efc	mov x5,xzr
00b09f00	mov x6,xzr
00b09f04	bl 0x00c35b20
00b09f08	cmp w0,#0x0
00b09f0c	cset w0,ne
00b09f10	b 0x00b09f18
00b09f14	mov w0,wzr
00b09f18	ldp x29,x30,[sp, #0x10]
00b09f1c	ldp x20,x19,[sp], #0x20
00b09f20	ret
