; OSSL_STORE_LOADER_names_do_all @ 00aeb674
00aeb674	str x21,[sp, #-0x30]!
00aeb678	stp x20,x19,[sp, #0x10]
00aeb67c	stp x29,x30,[sp, #0x20]
00aeb680	add x29,sp,#0x20
00aeb684	cbz x0,0x00aeb6c4
00aeb688	mov x21,x0
00aeb68c	ldr x0,[x0, #0x60]
00aeb690	cbz x0,0x00aeb6c0
00aeb694	mov x19,x2
00aeb698	mov x20,x1
00aeb69c	bl 0x00c3b2f0
00aeb6a0	bl 0x00c3b650
00aeb6a4	ldr w1,[x21, #0x68]
00aeb6a8	mov x2,x20
00aeb6ac	mov x3,x19
00aeb6b0	ldp x29,x30,[sp, #0x20]
00aeb6b4	ldp x20,x19,[sp, #0x10]
00aeb6b8	ldr x21,[sp], #0x30
00aeb6bc	b 0x00c3b610
00aeb6c0	mov w0,#0x1
00aeb6c4	ldp x29,x30,[sp, #0x20]
00aeb6c8	ldp x20,x19,[sp, #0x10]
00aeb6cc	ldr x21,[sp], #0x30
00aeb6d0	ret
