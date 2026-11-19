; mbedtls_rsa_rsassa_pkcs1_v15_sign @ 00ba82ec
00ba82ec	str x25,[sp, #-0x50]!
00ba82f0	stp x24,x23,[sp, #0x10]
00ba82f4	stp x22,x21,[sp, #0x20]
00ba82f8	stp x20,x19,[sp, #0x30]
00ba82fc	stp x29,x30,[sp, #0x40]
00ba8300	add x29,sp,#0x40
00ba8304	mov x19,x6
00ba8308	mov x24,x2
00ba830c	mov x25,x1
00ba8310	orr w8,w4,w3
00ba8314	mov x20,x0
00ba8318	cbz w8,0x00ba8320
00ba831c	cbz x5,0x00ba8328
00ba8320	ldr w8,[x20, #0xe0]
00ba8324	cbz w8,0x00ba8348
00ba8328	mov w23,#0xffffbf80
00ba832c	mov w0,w23
00ba8330	ldp x29,x30,[sp, #0x40]
00ba8334	ldp x20,x19,[sp, #0x30]
00ba8338	ldp x22,x21,[sp, #0x20]
00ba833c	ldp x24,x23,[sp, #0x10]
00ba8340	ldr x25,[sp], #0x50
00ba8344	ret
00ba8348	ldr x8,[x20, #0x8]
00ba834c	mov w0,w3
00ba8350	mov w1,w4
00ba8354	mov x2,x5
00ba8358	mov x3,x8
00ba835c	mov x4,x19
00ba8360	bl 0x00ba8448
00ba8364	mov w23,w0
00ba8368	cbnz w0,0x00ba832c
00ba836c	ldr x22,[x20, #0x8]
00ba8370	mov w0,#0x1
00ba8374	mov x1,x22
00ba8378	bl 0x00c30a30
00ba837c	mov x21,x0
00ba8380	cbz x0,0x00ba83ec
00ba8384	mov w0,#0x1
00ba8388	mov x1,x22
00ba838c	bl 0x00c30a30
00ba8390	mov x22,x0
00ba8394	cbz x0,0x00ba83f4
00ba8398	mov x0,x20
00ba839c	mov x1,x25
00ba83a0	mov x2,x24
00ba83a4	mov x3,x19
00ba83a8	mov x4,x21
00ba83ac	bl 0x00c43460
00ba83b0	mov w23,w0
00ba83b4	cbnz w0,0x00ba8418
00ba83b8	mov x0,x20
00ba83bc	mov x1,x21
00ba83c0	mov x2,x22
00ba83c4	bl 0x00c43470
00ba83c8	mov w23,w0
00ba83cc	cbnz w0,0x00ba8418
00ba83d0	ldr x2,[x20, #0x8]
00ba83d4	mov x0,x22
00ba83d8	mov x1,x19
00ba83dc	bl 0x00c42190
00ba83e0	cbz w0,0x00ba8404
00ba83e4	mov w23,#0xffffbd00
00ba83e8	b 0x00ba8418
00ba83ec	orr w23,wzr,#0xfffffff0
00ba83f0	b 0x00ba832c
00ba83f4	mov x0,x21
00ba83f8	bl 0x00c30960
00ba83fc	orr w23,wzr,#0xfffffff0
00ba8400	b 0x00ba832c
00ba8404	ldr x2,[x20, #0x8]
00ba8408	mov x0,x19
00ba840c	mov x1,x21
00ba8410	bl 0x00c2ffd0
00ba8414	mov w23,wzr
00ba8418	ldr x1,[x20, #0x8]
00ba841c	mov x0,x21
00ba8420	bl 0x00c42230
00ba8424	ldr x1,[x20, #0x8]
00ba8428	mov x0,x22
00ba842c	bl 0x00c42230
00ba8430	cbz w23,0x00ba832c
00ba8434	ldr x2,[x20, #0x8]
00ba8438	mov w1,#0x21
00ba843c	mov x0,x19
00ba8440	bl 0x00c301c0
00ba8444	b 0x00ba832c
