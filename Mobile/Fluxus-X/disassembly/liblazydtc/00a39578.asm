; ossl_ec_GFp_simple_group_clear_finish @ 00a39578
00a39578	str x19,[sp, #-0x20]!
00a3957c	stp x29,x30,[sp, #0x10]
00a39580	mov x19,x0
00a39584	ldr x0,[x0, #0x40]
00a39588	add x29,sp,#0x10
00a3958c	bl 0x00c322e0
00a39590	ldr x0,[x19, #0x60]
00a39594	bl 0x00c322e0
00a39598	ldr x0,[x19, #0x68]
00a3959c	ldp x29,x30,[sp, #0x10]
00a395a0	ldr x19,[sp], #0x20
00a395a4	b 0x00c322e0
