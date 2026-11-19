; DSA_SIG_free @ 00a21dd0
00a21dd0	cbz x0,0x00a21e10
00a21dd4	str x19,[sp, #-0x20]!
00a21dd8	stp x29,x30,[sp, #0x10]
00a21ddc	mov x19,x0
00a21de0	ldr x0,[x0]
00a21de4	add x29,sp,#0x10
00a21de8	bl 0x00c322e0
00a21dec	ldr x0,[x19, #0x8]
00a21df0	bl 0x00c322e0
00a21df4	ldp x29,x30,[sp, #0x10]
00a21df8	adrp x1,0x2a3000
00a21dfc	add x1,x1,#0xecc
00a21e00	orr w2,wzr,#0x30
00a21e04	mov x0,x19
00a21e08	ldr x19,[sp], #0x20
00a21e0c	b 0x00c32310
00a21e10	ret
