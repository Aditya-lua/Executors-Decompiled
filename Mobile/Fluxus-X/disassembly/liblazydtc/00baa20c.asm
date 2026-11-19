; mbedtls_oid_get_pkcs12_pbe_alg @ 00baa20c
00baa20c	stp x22,x21,[sp, #-0x30]!
00baa210	stp x20,x19,[sp, #0x10]
00baa214	stp x29,x30,[sp, #0x20]
00baa218	add x29,sp,#0x20
00baa21c	mov x19,x2
00baa220	mov x20,x1
00baa224	cbz x0,0x00baa270
00baa228	ldr x8,[x0, #0x8]
00baa22c	cmp x8,#0xa
00baa230	b.ne 0x00baa270
00baa234	ldr x21,[x0, #0x10]
00baa238	adrp x0,0x2ac000
00baa23c	add x0,x0,#0xd0b
00baa240	mov w2,#0xa
00baa244	mov x1,x21
00baa248	bl 0x00c300b0
00baa24c	adrp x22,0xcac000
00baa250	add x22,x22,#0x3c0
00baa254	cbz w0,0x00baa288
00baa258	adrp x0,0x2ce000
00baa25c	add x0,x0,#0xabd
00baa260	mov w2,#0xa
00baa264	mov x1,x21
00baa268	bl 0x00c300b0
00baa26c	cbz w0,0x00baa284
00baa270	mov w0,#0xffffffd2
00baa274	ldp x29,x30,[sp, #0x20]
00baa278	ldp x20,x19,[sp, #0x10]
00baa27c	ldp x22,x21,[sp], #0x30
00baa280	ret
00baa284	add x22,x22,#0x28
00baa288	ldr w8,[x22, #0x20]
00baa28c	mov w0,wzr
00baa290	str w8,[x20]
00baa294	ldr w8,[x22, #0x24]
00baa298	str w8,[x19]
00baa29c	b 0x00baa274
