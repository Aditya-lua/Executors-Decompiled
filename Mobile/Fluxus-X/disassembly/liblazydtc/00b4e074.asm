; ossl_dsa_check_priv_key @ 00b4e074
00b4e074	str x21,[sp, #-0x30]!
00b4e078	stp x20,x19,[sp, #0x10]
00b4e07c	mov x20,x1
00b4e080	mov x1,x2
00b4e084	stp x29,x30,[sp, #0x20]
00b4e088	add x29,sp,#0x20
00b4e08c	mov x19,x2
00b4e090	mov x21,x0
00b4e094	str wzr,[x2]
00b4e098	bl 0x00b4ded4
00b4e09c	cbz w0,0x00b4e0bc
00b4e0a0	ldr x0,[x21, #0x10]
00b4e0a4	mov x1,x20
00b4e0a8	mov x2,x19
00b4e0ac	ldp x29,x30,[sp, #0x20]
00b4e0b0	ldp x20,x19,[sp, #0x10]
00b4e0b4	ldr x21,[sp], #0x30
00b4e0b8	b 0x00c39e60
00b4e0bc	ldp x29,x30,[sp, #0x20]
00b4e0c0	ldp x20,x19,[sp, #0x10]
00b4e0c4	ldr x21,[sp], #0x30
00b4e0c8	ret
