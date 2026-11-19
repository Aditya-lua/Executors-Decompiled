; FUN_00a944bc @ 00a944bc
00a944bc	stp x20,x19,[sp, #-0x20]!
00a944c0	stp x29,x30,[sp, #0x10]
00a944c4	add x29,sp,#0x10
00a944c8	mov x19,x1
00a944cc	bl 0x00c3cea0
00a944d0	mov x20,x0
00a944d4	str xzr,[x0, #0x180]
00a944d8	mov x0,x19
00a944dc	mov x1,x20
00a944e0	bl 0x00c32090
00a944e4	add x0,x19,#0x8
00a944e8	add x1,x20,#0x80
00a944ec	bl 0x00c32090
00a944f0	add x0,x19,#0x10
00a944f4	add x1,x20,#0x100
00a944f8	bl 0x00c32090
00a944fc	ldp x29,x30,[sp, #0x10]
00a94500	mov w0,#0x1
00a94504	ldp x20,x19,[sp], #0x20
00a94508	ret
