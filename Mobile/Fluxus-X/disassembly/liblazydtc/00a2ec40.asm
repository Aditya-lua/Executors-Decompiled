; ossl_ec_key_simple_generate_public_key @ 00a2ec40
00a2ec40	str x21,[sp, #-0x30]!
00a2ec44	stp x20,x19,[sp, #0x10]
00a2ec48	stp x29,x30,[sp, #0x20]
00a2ec4c	mov x19,x0
00a2ec50	ldr x0,[x0, #0x58]
00a2ec54	add x29,sp,#0x20
00a2ec58	bl 0x00c38a60
00a2ec5c	cbz x0,0x00a2eca0
00a2ec60	mov x20,x0
00a2ec64	ldp x0,x1,[x19, #0x18]
00a2ec68	ldr x2,[x19, #0x28]
00a2ec6c	mov x3,xzr
00a2ec70	mov x4,xzr
00a2ec74	mov x5,x20
00a2ec78	bl 0x00c3ae30
00a2ec7c	mov w21,w0
00a2ec80	mov x0,x20
00a2ec84	bl 0x00c38a30
00a2ec88	cmp w21,#0x1
00a2ec8c	b.ne 0x00a2eca4
00a2ec90	ldr x8,[x19, #0x68]
00a2ec94	add x8,x8,#0x1
00a2ec98	str x8,[x19, #0x68]
00a2ec9c	b 0x00a2eca4
00a2eca0	mov w21,wzr
00a2eca4	ldp x29,x30,[sp, #0x20]
00a2eca8	ldp x20,x19,[sp, #0x10]
00a2ecac	mov w0,w21
00a2ecb0	ldr x21,[sp], #0x30
00a2ecb4	ret
