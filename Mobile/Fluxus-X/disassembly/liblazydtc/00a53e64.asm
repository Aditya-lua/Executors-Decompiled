; err_cleanup @ 00a53e64
00a53e64	stp x20,x19,[sp, #-0x20]!
00a53e68	adrp x8,0xd21000
00a53e6c	ldrb w8,[x8, #0xa18]
00a53e70	stp x29,x30,[sp, #0x10]
00a53e74	add x29,sp,#0x10
00a53e78	cmp w8,#0x1
00a53e7c	b.ne 0x00a53e8c
00a53e80	adrp x0,0xd21000
00a53e84	add x0,x0,#0xa1c
00a53e88	bl 0x00c38350
00a53e8c	adrp x19,0xd21000
00a53e90	ldr x0,[x19, #0xa20]
00a53e94	bl 0x00c34d40
00a53e98	adrp x20,0xd21000
00a53e9c	ldr x0,[x20, #0xa28]
00a53ea0	str xzr,[x19, #0xa20]
00a53ea4	bl 0x00c34db0
00a53ea8	ldp x29,x30,[sp, #0x10]
00a53eac	str xzr,[x20, #0xa28]
00a53eb0	ldp x20,x19,[sp], #0x20
00a53eb4	ret
