; ossl_DER_w_algorithmIdentifier_SM2_with_MD @ 00b61514
00b61514	stp x20,x19,[sp, #-0x20]!
00b61518	mov x20,x0
00b6151c	cmp w3,#0x477
00b61520	mov w0,wzr
00b61524	stp x29,x30,[sp, #0x10]
00b61528	add x29,sp,#0x10
00b6152c	b.ne 0x00b61570
00b61530	mov x0,x20
00b61534	mov w19,w1
00b61538	bl 0x00c3e050
00b6153c	cbz w0,0x00b61570
00b61540	adrp x2,0xcb5000
00b61544	ldr x2,[x2, #0x8e0]
00b61548	mov w1,#0xffffffff
00b6154c	mov w3,#0xa
00b61550	mov x0,x20
00b61554	bl 0x00c3e0a0
00b61558	cbz w0,0x00b61570
00b6155c	mov x0,x20
00b61560	mov w1,w19
00b61564	bl 0x00c3e060
00b61568	cmp w0,#0x0
00b6156c	cset w0,ne
00b61570	ldp x29,x30,[sp, #0x10]
00b61574	ldp x20,x19,[sp], #0x20
00b61578	ret
