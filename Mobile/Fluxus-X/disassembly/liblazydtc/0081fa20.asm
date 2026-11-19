; FUN_0081fa20 @ 0081fa20
0081fa20	ldrb w8,[x0, #0x14]
0081fa24	cmp w8,#0x1
0081fa28	b.ne 0x0081fa60
0081fa2c	ldr s0,[x0, #0x10]
0081fa30	adrp x8,0x29a000
0081fa34	strb wzr,[x0, #0x14]
0081fa38	ldr d1,[x8, #0xdc8]
0081fa3c	adrp x8,0x29c000
0081fa40	uxtl v0.8H,v0.8B
0081fa44	ldr q2,[x8, #0xee0]
0081fa48	eor v0.8B,v0.8B,v1.8B
0081fa4c	ldr q1,[x0]
0081fa50	eor v1.16B,v1.16B,v2.16B
0081fa54	uzp1 v0.8B,v0.8B,v0.8B
0081fa58	str q1,[x0]
0081fa5c	str s0,[x0, #0x10]
0081fa60	ret
