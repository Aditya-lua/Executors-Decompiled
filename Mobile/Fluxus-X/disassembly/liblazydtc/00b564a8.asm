; FUN_00b564a8 @ 00b564a8
00b564a8	stp x20,x19,[sp, #-0x20]!
00b564ac	stp x29,x30,[sp, #0x10]
00b564b0	ldr x20,[x0, #0xf8]
00b564b4	mov x19,x0
00b564b8	mov w1,#0x20
00b564bc	add x29,sp,#0x10
00b564c0	add x0,x20,#0x34
00b564c4	bl 0x00c34750
00b564c8	add x0,x20,#0x54
00b564cc	mov w1,#0x10
00b564d0	bl 0x00c34750
00b564d4	add x0,x20,#0x64
00b564d8	mov w1,#0x10
00b564dc	bl 0x00c34750
00b564e0	add x0,x20,#0x80
00b564e4	orr w1,wzr,#0x30
00b564e8	bl 0x00c34750
00b564ec	str xzr,[x20, #0x78]
00b564f0	ldp x29,x30,[sp, #0x10]
00b564f4	mov x0,x19
00b564f8	ldp x20,x19,[sp], #0x20
00b564fc	b 0x00c417f0
