; X509_REQ_set0_distinguishing_id @ 00b1e7b0
00b1e7b0	stp x20,x19,[sp, #-0x20]!
00b1e7b4	stp x29,x30,[sp, #0x10]
00b1e7b8	mov x19,x0
00b1e7bc	ldr x0,[x0, #0x60]
00b1e7c0	add x29,sp,#0x10
00b1e7c4	mov x20,x1
00b1e7c8	bl 0x00c35530
00b1e7cc	str x20,[x19, #0x60]
00b1e7d0	ldp x29,x30,[sp, #0x10]
00b1e7d4	ldp x20,x19,[sp], #0x20
00b1e7d8	ret
