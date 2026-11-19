; BN_MONT_CTX_init @ 00a03580
00a03580	str x19,[sp, #-0x20]!
00a03584	stp x29,x30,[sp, #0x10]
00a03588	mov x19,x0
00a0358c	str wzr,[x0], #0x8
00a03590	add x29,sp,#0x10
00a03594	bl 0x00c38e70
00a03598	add x0,x19,#0x20
00a0359c	bl 0x00c38e70
00a035a0	add x0,x19,#0x38
00a035a4	bl 0x00c38e70
00a035a8	stp xzr,xzr,[x19, #0x50]
00a035ac	str wzr,[x19, #0x60]
00a035b0	ldp x29,x30,[sp, #0x10]
00a035b4	ldr x19,[sp], #0x20
00a035b8	ret
