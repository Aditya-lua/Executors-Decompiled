; ossl_ec_GF2m_simple_group_clear_finish @ 00a29c74
00a29c74	str x19,[sp, #-0x20]!
00a29c78	stp x29,x30,[sp, #0x10]
00a29c7c	mov x19,x0
00a29c80	ldr x0,[x0, #0x40]
00a29c84	add x29,sp,#0x10
00a29c88	bl 0x00c322e0
00a29c8c	ldr x0,[x19, #0x60]
00a29c90	bl 0x00c322e0
00a29c94	ldr x0,[x19, #0x68]
00a29c98	bl 0x00c322e0
00a29c9c	orr x8,xzr,#-0x100000000
00a29ca0	stp xzr,xzr,[x19, #0x48]
00a29ca4	str x8,[x19, #0x58]
00a29ca8	ldp x29,x30,[sp, #0x10]
00a29cac	ldr x19,[sp], #0x20
00a29cb0	ret
