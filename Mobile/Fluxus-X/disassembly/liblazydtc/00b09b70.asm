; X509_CRL_check_suiteb @ 00b09b70
00b09b70	str x19,[sp, #-0x20]!
00b09b74	tst x2,#0x30000
00b09b78	stp x29,x30,[sp, #0x10]
00b09b7c	add x29,sp,#0x10
00b09b80	str x2,[sp, #0x8]
00b09b84	b.eq 0x00b09ba8
00b09b88	ldr x0,[x0, #0x8]
00b09b8c	mov x19,x1
00b09b90	bl 0x00c37750
00b09b94	mov w1,w0
00b09b98	add x2,sp,#0x8
00b09b9c	mov x0,x19
00b09ba0	bl 0x00b09a98
00b09ba4	b 0x00b09bac
00b09ba8	mov w0,wzr
00b09bac	ldp x29,x30,[sp, #0x10]
00b09bb0	ldr x19,[sp], #0x20
00b09bb4	ret
