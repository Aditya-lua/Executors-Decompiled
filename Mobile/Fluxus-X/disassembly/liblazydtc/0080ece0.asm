; FUN_0080ece0 @ 0080ece0
0080ece0	ldrb w8,[x0, #0x11]
0080ece4	cmp w8,#0x1
0080ece8	b.ne 0x0080ed14
0080ecec	adrp x8,0x29c000
0080ecf0	ldr q0,[x0]
0080ecf4	mov w9,#0x7d
0080ecf8	ldr q1,[x8, #0x340]
0080ecfc	ldrb w8,[x0, #0x10]
0080ed00	strb wzr,[x0, #0x11]
0080ed04	eor v0.16B,v0.16B,v1.16B
0080ed08	eor w8,w8,w9
0080ed0c	strb w8,[x0, #0x10]
0080ed10	str q0,[x0]
0080ed14	ret
