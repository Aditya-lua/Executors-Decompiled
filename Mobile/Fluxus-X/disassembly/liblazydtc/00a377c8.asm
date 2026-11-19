; ossl_ec_GFp_mont_group_finish @ 00a377c8
00a377c8	str x19,[sp, #-0x20]!
00a377cc	stp x29,x30,[sp, #0x10]
00a377d0	mov x19,x0
00a377d4	ldr x0,[x0, #0x78]
00a377d8	add x29,sp,#0x10
00a377dc	bl 0x00c38f70
00a377e0	ldr x0,[x19, #0x80]
00a377e4	str xzr,[x19, #0x78]
00a377e8	bl 0x00c36290
00a377ec	str xzr,[x19, #0x80]
00a377f0	ldp x29,x30,[sp, #0x10]
00a377f4	mov x0,x19
00a377f8	ldr x19,[sp], #0x20
00a377fc	b 0x00c3b1f0
