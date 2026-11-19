; MD5_Init @ 00aa6cbc
00aa6cbc	str x19,[sp, #-0x20]!
00aa6cc0	mov x19,x0
00aa6cc4	add x0,x0,#0x10
00aa6cc8	mov w2,#0x4c
00aa6ccc	mov w1,wzr
00aa6cd0	stp x29,x30,[sp, #0x10]
00aa6cd4	add x29,sp,#0x10
00aa6cd8	bl 0x00c301c0
00aa6cdc	adrp x8,0x29c000
00aa6ce0	ldr q0,[x8, #0x2e0]
00aa6ce4	mov w0,#0x1
00aa6ce8	str q0,[x19]
00aa6cec	ldp x29,x30,[sp, #0x10]
00aa6cf0	ldr x19,[sp], #0x20
00aa6cf4	ret
