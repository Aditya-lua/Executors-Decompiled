; FUN_00c2b7b8 @ 00c2b7b8
00c2b7b8	bti c
00c2b7bc	adrp x8,0xd28000
00c2b7c0	ldrb w8,[x8, #0xa0]
00c2b7c4	cmp w8,#0x1
00c2b7c8	b.ne 0x00c2b7f0
00c2b7cc	paciasp
00c2b7d0	stp x30,x19,[sp, #-0x10]!
00c2b7d4	nop
00c2b7d8	adr x19,0xd280a0
00c2b7dc	ldr w0,[x19, #0x4]
00c2b7e0	bl 0x00c3ed00
00c2b7e4	strb wzr,[x19]
00c2b7e8	ldp x30,x19,[sp], #0x10
00c2b7ec	autiasp
00c2b7f0	ret
