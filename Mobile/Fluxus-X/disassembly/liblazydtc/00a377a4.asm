; ossl_ec_GFp_mont_group_init @ 00a377a4
00a377a4	str x19,[sp, #-0x20]!
00a377a8	stp x29,x30,[sp, #0x10]
00a377ac	add x29,sp,#0x10
00a377b0	mov x19,x0
00a377b4	bl 0x00c3b200
00a377b8	stp xzr,xzr,[x19, #0x78]
00a377bc	ldp x29,x30,[sp, #0x10]
00a377c0	ldr x19,[sp], #0x20
00a377c4	ret
