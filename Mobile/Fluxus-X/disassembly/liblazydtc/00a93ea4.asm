; FUN_00a93ea4 @ 00a93ea4
00a93ea4	stp x20,x19,[sp, #-0x20]!
00a93ea8	stp x29,x30,[sp, #0x10]
00a93eac	add x29,sp,#0x10
00a93eb0	mov x19,x1
00a93eb4	bl 0x00c3cea0
00a93eb8	mov x20,x0
00a93ebc	str xzr,[x0, #0x180]
00a93ec0	mov x0,x19
00a93ec4	mov x1,x20
00a93ec8	bl 0x00c32090
00a93ecc	add x0,x19,#0x8
00a93ed0	add x1,x20,#0x80
00a93ed4	bl 0x00c32090
00a93ed8	add x0,x20,#0x100
00a93edc	mov w2,#0x80
00a93ee0	mov x1,x20
00a93ee4	bl 0x00c2ffd0
00a93ee8	ldp x29,x30,[sp, #0x10]
00a93eec	mov w0,#0x1
00a93ef0	ldp x20,x19,[sp], #0x20
00a93ef4	ret
