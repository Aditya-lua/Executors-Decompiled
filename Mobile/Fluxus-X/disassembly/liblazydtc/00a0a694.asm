; BN_mul @ 00a0a694
00a0a694	stp x20,x19,[sp, #-0x20]!
00a0a698	stp x29,x30,[sp, #0x10]
00a0a69c	add x29,sp,#0x10
00a0a6a0	mov x19,x0
00a0a6a4	bl 0x00a0a6c4
00a0a6a8	mov w20,w0
00a0a6ac	mov x0,x19
00a0a6b0	bl 0x00c38e40
00a0a6b4	ldp x29,x30,[sp, #0x10]
00a0a6b8	mov w0,w20
00a0a6bc	ldp x20,x19,[sp], #0x20
00a0a6c0	ret
