; ossl_digest_rsa_sign_get_md_nid @ 00b60a34
00b60a34	str x19,[sp, #-0x20]!
00b60a38	mov w2,#0x1
00b60a3c	stp x29,x30,[sp, #0x10]
00b60a40	add x29,sp,#0x10
00b60a44	mov x19,x1
00b60a48	bl 0x00c411b0
00b60a4c	cbz w0,0x00b60a5c
00b60a50	ldp x29,x30,[sp, #0x10]
00b60a54	ldr x19,[sp], #0x20
00b60a58	ret
00b60a5c	ldp x29,x30,[sp, #0x10]
00b60a60	adrp x1,0xca5000
00b60a64	add x1,x1,#0xd68
00b60a68	orr w2,wzr,#0x6
00b60a6c	mov x0,x19
00b60a70	ldr x19,[sp], #0x20
00b60a74	b 0x00c41070
