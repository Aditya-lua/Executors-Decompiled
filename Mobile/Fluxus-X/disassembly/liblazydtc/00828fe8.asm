; FUN_00828fe8 @ 00828fe8
00828fe8	ldrb w8,[x0, #0x11]
00828fec	cmp w8,#0x1
00828ff0	b.ne 0x0082901c
00828ff4	adrp x8,0x29c000
00828ff8	ldr q0,[x0]
00828ffc	mov w9,#0xed
00829000	ldr q1,[x8, #0x4a0]
00829004	ldrb w8,[x0, #0x10]
00829008	strb wzr,[x0, #0x11]
0082900c	eor v0.16B,v0.16B,v1.16B
00829010	eor w8,w8,w9
00829014	strb w8,[x0, #0x10]
00829018	str q0,[x0]
0082901c	ret
