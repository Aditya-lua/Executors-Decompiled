; EVP_PKEY_CTX_set_rsa_keygen_pubexp @ 00ad2e5c
00ad2e5c	str x21,[sp, #-0x30]!
00ad2e60	stp x20,x19,[sp, #0x10]
00ad2e64	mov x19,x1
00ad2e68	mov x20,x0
00ad2e6c	stp x29,x30,[sp, #0x20]
00ad2e70	add x29,sp,#0x20
00ad2e74	cbz x0,0x00ad2e94
00ad2e78	ldr x8,[x20, #0x78]
00ad2e7c	cbz x8,0x00ad2e94
00ad2e80	ldr w8,[x8]
00ad2e84	cmp w8,#0x390
00ad2e88	b.eq 0x00ad2e94
00ad2e8c	cmp w8,#0x6
00ad2e90	b.ne 0x00ad2ed4
00ad2e94	mov w1,#0xffffffff
00ad2e98	mov w2,#0x4
00ad2e9c	mov w3,#0x1004
00ad2ea0	mov x0,x20
00ad2ea4	mov w4,wzr
00ad2ea8	mov x5,x19
00ad2eac	bl 0x00c370f0
00ad2eb0	mov w21,w0
00ad2eb4	cmp w0,#0x1
00ad2eb8	b.lt 0x00ad2ed8
00ad2ebc	ldr x8,[x20, #0x20]
00ad2ec0	cbz x8,0x00ad2ed8
00ad2ec4	ldr x0,[x20, #0xa8]
00ad2ec8	bl 0x00c36290
00ad2ecc	str x19,[x20, #0xa8]
00ad2ed0	b 0x00ad2ed8
00ad2ed4	mov w21,#0xffffffff
00ad2ed8	ldp x29,x30,[sp, #0x20]
00ad2edc	ldp x20,x19,[sp, #0x10]
00ad2ee0	mov w0,w21
00ad2ee4	ldr x21,[sp], #0x30
00ad2ee8	ret
