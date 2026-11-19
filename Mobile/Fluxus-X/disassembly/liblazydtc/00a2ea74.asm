; ossl_ec_key_gen @ 00a2ea74
00a2ea74	str x19,[sp, #-0x20]!
00a2ea78	stp x29,x30,[sp, #0x10]
00a2ea7c	ldr x8,[x0, #0x18]
00a2ea80	add x29,sp,#0x10
00a2ea84	mov x19,x0
00a2ea88	ldr x8,[x8]
00a2ea8c	ldr x8,[x8, #0x148]
00a2ea90	blr x8
00a2ea94	cmp w0,#0x1
00a2ea98	b.ne 0x00a2eaa8
00a2ea9c	ldr x8,[x19, #0x68]
00a2eaa0	add x8,x8,#0x1
00a2eaa4	str x8,[x19, #0x68]
00a2eaa8	ldp x29,x30,[sp, #0x10]
00a2eaac	ldr x19,[sp], #0x20
00a2eab0	ret
