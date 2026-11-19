; ossl_sm3_init @ 00ae52b4
00ae52b4	str x19,[sp, #-0x20]!
00ae52b8	mov x19,x0
00ae52bc	add x0,x0,#0x20
00ae52c0	mov w2,#0x4c
00ae52c4	mov w1,wzr
00ae52c8	stp x29,x30,[sp, #0x10]
00ae52cc	add x29,sp,#0x10
00ae52d0	bl 0x00c301c0
00ae52d4	adrp x8,0x29c000
00ae52d8	adrp x9,0x29c000
00ae52dc	ldr q0,[x8, #0x150]
00ae52e0	ldr q1,[x9, #0x440]
00ae52e4	mov w0,#0x1
00ae52e8	stp q0,q1,[x19]
00ae52ec	ldp x29,x30,[sp, #0x10]
00ae52f0	ldr x19,[sp], #0x20
00ae52f4	ret
