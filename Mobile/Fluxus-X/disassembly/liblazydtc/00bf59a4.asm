; std::__ndk1::locale::classic @ 00bf59a4
00bf59a4	paciasp
00bf59a8	stp x29,x30,[sp, #-0x20]!
00bf59ac	str x19,[sp, #0x10]
00bf59b0	mov x29,sp
00bf59b4	adrp x8,0xd27000
00bf59b8	add x8,x8,#0x240
00bf59bc	ldarb w8,[x8]
00bf59c0	tbz w8,#0x0,0x00bf59dc
00bf59c4	adrp x0,0xd27000
00bf59c8	add x0,x0,#0x238
00bf59cc	ldr x19,[sp, #0x10]
00bf59d0	ldp x29,x30,[sp], #0x20
00bf59d4	autiasp
00bf59d8	ret
00bf59dc	adrp x0,0xd27000
00bf59e0	add x0,x0,#0x240
00bf59e4	bl 0x00c2fe90
00bf59e8	cbz w0,0x00bf59c4
00bf59ec	adrp x19,0xd27000
00bf59f0	add x19,x19,#0x100
00bf59f4	mov w1,#0x1
00bf59f8	mov x0,x19
00bf59fc	bl 0x00bf34a8
00bf5a00	adrp x8,0xd27000
00bf5a04	adrp x0,0xd27000
00bf5a08	add x0,x0,#0x240
00bf5a0c	str x19,[x8, #0x238]
00bf5a10	bl 0x00c2fea0
00bf5a14	b 0x00bf59c4
