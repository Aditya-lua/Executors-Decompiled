; ossl_ec_GF2m_simple_point_finish @ 00a2a058
00a2a058	str x19,[sp, #-0x20]!
00a2a05c	stp x29,x30,[sp, #0x10]
00a2a060	mov x19,x0
00a2a064	ldr x0,[x0, #0x10]
00a2a068	add x29,sp,#0x10
00a2a06c	bl 0x00c36290
00a2a070	ldr x0,[x19, #0x18]
00a2a074	bl 0x00c36290
00a2a078	ldr x0,[x19, #0x20]
00a2a07c	ldp x29,x30,[sp, #0x10]
00a2a080	ldr x19,[sp], #0x20
00a2a084	b 0x00c36290
