; ossl_prov_digest_reset @ 00b20574
00b20574	str x19,[sp, #-0x20]!
00b20578	stp x29,x30,[sp, #0x10]
00b2057c	mov x19,x0
00b20580	ldr x0,[x0, #0x8]
00b20584	add x29,sp,#0x10
00b20588	bl 0x00c35800
00b2058c	ldr x0,[x19, #0x10]
00b20590	stp xzr,xzr,[x19]
00b20594	bl 0x00c32360
00b20598	str xzr,[x19, #0x10]
00b2059c	ldp x29,x30,[sp, #0x10]
00b205a0	ldr x19,[sp], #0x20
00b205a4	ret
