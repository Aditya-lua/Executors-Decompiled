; DES_ecb_encrypt @ 00a14e48
00a14e48	str x19,[sp, #-0x20]!
00a14e4c	stp x29,x30,[sp, #0x10]
00a14e50	ldr w8,[x0]
00a14e54	mov x19,x1
00a14e58	mov x1,x2
00a14e5c	mov w2,w3
00a14e60	str w8,[sp, #0x8]
00a14e64	ldr w8,[x0, #0x4]
00a14e68	add x0,sp,#0x8
00a14e6c	add x29,sp,#0x10
00a14e70	str w8,[sp, #0xc]
00a14e74	bl 0x00c39a00
00a14e78	ldr w8,[sp, #0x8]
00a14e7c	lsr w9,w8,#0x8
00a14e80	strb w8,[x19]
00a14e84	strb w9,[x19, #0x1]
00a14e88	lsr w9,w8,#0x10
00a14e8c	lsr w8,w8,#0x18
00a14e90	strb w9,[x19, #0x2]
00a14e94	strb w8,[x19, #0x3]
00a14e98	ldr w8,[sp, #0xc]
00a14e9c	lsr w9,w8,#0x8
00a14ea0	strb w8,[x19, #0x4]
00a14ea4	strb w9,[x19, #0x5]
00a14ea8	lsr w9,w8,#0x10
00a14eac	lsr w8,w8,#0x18
00a14eb0	strb w9,[x19, #0x6]
00a14eb4	strb w8,[x19, #0x7]
00a14eb8	ldp x29,x30,[sp, #0x10]
00a14ebc	ldr x19,[sp], #0x20
00a14ec0	ret
