; EVP_PKEY_CTX_set1_rsa_keygen_pubexp @ 00ad2eec
00ad2eec	str x21,[sp, #-0x30]!
00ad2ef0	stp x20,x19,[sp, #0x10]
00ad2ef4	stp x29,x30,[sp, #0x20]
00ad2ef8	ldr x8,[x0, #0x20]
00ad2efc	mov x19,x0
00ad2f00	mov x20,x1
00ad2f04	add x29,sp,#0x20
00ad2f08	cbnz x8,0x00ad2f1c
00ad2f0c	mov x0,x20
00ad2f10	bl 0x00c369a0
00ad2f14	mov x20,x0
00ad2f18	cbz x0,0x00ad2f58
00ad2f1c	orr w1,wzr,#0x6
00ad2f20	mov w2,#0x4
00ad2f24	mov w3,#0x1004
00ad2f28	mov x0,x19
00ad2f2c	mov w4,wzr
00ad2f30	mov x5,x20
00ad2f34	bl 0x00c370f0
00ad2f38	mov w21,w0
00ad2f3c	cmp w0,#0x0
00ad2f40	b.gt 0x00ad2f5c
00ad2f44	ldr x8,[x19, #0x20]
00ad2f48	cbnz x8,0x00ad2f5c
00ad2f4c	mov x0,x20
00ad2f50	bl 0x00c36290
00ad2f54	b 0x00ad2f5c
00ad2f58	mov w21,wzr
00ad2f5c	ldp x29,x30,[sp, #0x20]
00ad2f60	ldp x20,x19,[sp, #0x10]
00ad2f64	mov w0,w21
00ad2f68	ldr x21,[sp], #0x30
00ad2f6c	ret
