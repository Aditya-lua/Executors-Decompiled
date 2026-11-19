; ossl_ec_GF2m_simple_group_finish @ 00a29c44
00a29c44	str x19,[sp, #-0x20]!
00a29c48	stp x29,x30,[sp, #0x10]
00a29c4c	mov x19,x0
00a29c50	ldr x0,[x0, #0x40]
00a29c54	add x29,sp,#0x10
00a29c58	bl 0x00c36290
00a29c5c	ldr x0,[x19, #0x60]
00a29c60	bl 0x00c36290
00a29c64	ldr x0,[x19, #0x68]
00a29c68	ldp x29,x30,[sp, #0x10]
00a29c6c	ldr x19,[sp], #0x20
00a29c70	b 0x00c36290
