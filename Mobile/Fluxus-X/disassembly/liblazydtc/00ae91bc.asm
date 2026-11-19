; OPENSSL_sk_zero @ 00ae91bc
00ae91bc	str x19,[sp, #-0x20]!
00ae91c0	stp x29,x30,[sp, #0x10]
00ae91c4	add x29,sp,#0x10
00ae91c8	cbz x0,0x00ae91ec
00ae91cc	ldrsw x8,[x0]
00ae91d0	mov x19,x0
00ae91d4	cbz w8,0x00ae91ec
00ae91d8	ldr x0,[x19, #0x8]
00ae91dc	lsl x2,x8,#0x3
00ae91e0	mov w1,wzr
00ae91e4	bl 0x00c301c0
00ae91e8	str wzr,[x19]
00ae91ec	ldp x29,x30,[sp, #0x10]
00ae91f0	ldr x19,[sp], #0x20
00ae91f4	ret
