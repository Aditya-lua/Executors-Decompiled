; ossl_rand_pool_reattach @ 00aca730
00aca730	str x19,[sp, #-0x20]!
00aca734	stp x29,x30,[sp, #0x10]
00aca738	ldr x8,[x0, #0x8]
00aca73c	mov x19,x0
00aca740	mov x0,x1
00aca744	str x1,[x19]
00aca748	mov x1,x8
00aca74c	add x29,sp,#0x10
00aca750	bl 0x00c34750
00aca754	str xzr,[x19, #0x8]
00aca758	ldp x29,x30,[sp, #0x10]
00aca75c	ldr x19,[sp], #0x20
00aca760	ret
