; FUN_00a955a4 @ 00a955a4
00a955a4	stp x20,x19,[sp, #-0x20]!
00a955a8	stp x29,x30,[sp, #0x10]
00a955ac	add x29,sp,#0x10
00a955b0	mov x19,x1
00a955b4	mov x20,x0
00a955b8	bl 0x00c3cea0
00a955bc	mov x1,x0
00a955c0	mov x0,x19
00a955c4	bl 0x00c32090
00a955c8	mov x0,x20
00a955cc	bl 0x00c3cea0
00a955d0	ldr x8,[x19, #0x8]
00a955d4	str x8,[x0, #0x80]
00a955d8	mov x0,x20
00a955dc	bl 0x00c3cea0
00a955e0	ldr x9,[x19, #0x10]
00a955e4	mov x8,x0
00a955e8	mov w0,#0x1
00a955ec	str x9,[x8, #0x88]
00a955f0	ldp x29,x30,[sp, #0x10]
00a955f4	ldp x20,x19,[sp], #0x20
00a955f8	ret
