; ossl_x509_crl_set0_libctx @ 00b1b244
00b1b244	stp x20,x19,[sp, #-0x20]!
00b1b248	stp x29,x30,[sp, #0x10]
00b1b24c	add x29,sp,#0x10
00b1b250	cbz x0,0x00b1b298
00b1b254	mov x19,x0
00b1b258	ldr x0,[x0, #0xf0]
00b1b25c	str x1,[x19, #0xe8]
00b1b260	adrp x1,0x2d6000
00b1b264	mov x20,x2
00b1b268	add x1,x1,#0x879
00b1b26c	mov w2,#0x20d
00b1b270	bl 0x00c32310
00b1b274	str xzr,[x19, #0xf0]
00b1b278	cbz x20,0x00b1b298
00b1b27c	adrp x1,0x2d6000
00b1b280	add x1,x1,#0x879
00b1b284	mov w2,#0x210
00b1b288	mov x0,x20
00b1b28c	bl 0x00c34600
00b1b290	str x0,[x19, #0xf0]
00b1b294	cbz x0,0x00b1b29c
00b1b298	mov w0,#0x1
00b1b29c	ldp x29,x30,[sp, #0x10]
00b1b2a0	ldp x20,x19,[sp], #0x20
00b1b2a4	ret
