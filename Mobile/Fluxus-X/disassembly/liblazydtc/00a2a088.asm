; ossl_ec_GF2m_simple_point_clear_finish @ 00a2a088
00a2a088	str x19,[sp, #-0x20]!
00a2a08c	stp x29,x30,[sp, #0x10]
00a2a090	mov x19,x0
00a2a094	ldr x0,[x0, #0x10]
00a2a098	add x29,sp,#0x10
00a2a09c	bl 0x00c322e0
00a2a0a0	ldr x0,[x19, #0x18]
00a2a0a4	bl 0x00c322e0
00a2a0a8	ldr x0,[x19, #0x20]
00a2a0ac	bl 0x00c322e0
00a2a0b0	str wzr,[x19, #0x28]
00a2a0b4	ldp x29,x30,[sp, #0x10]
00a2a0b8	ldr x19,[sp], #0x20
00a2a0bc	ret
