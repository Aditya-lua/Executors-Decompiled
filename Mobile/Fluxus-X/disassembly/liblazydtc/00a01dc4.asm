; BN_clear @ 00a01dc4
00a01dc4	cbz x0,0x00a01dfc
00a01dc8	str x19,[sp, #-0x20]!
00a01dcc	stp x29,x30,[sp, #0x10]
00a01dd0	mov x19,x0
00a01dd4	ldr x0,[x0]
00a01dd8	add x29,sp,#0x10
00a01ddc	cbz x0,0x00a01dec
00a01de0	ldrsw x8,[x19, #0xc]
00a01de4	lsl x1,x8,#0x3
00a01de8	bl 0x00c34750
00a01dec	str wzr,[x19, #0x10]
00a01df0	str wzr,[x19, #0x8]
00a01df4	ldp x29,x30,[sp, #0x10]
00a01df8	ldr x19,[sp], #0x20
00a01dfc	ret
