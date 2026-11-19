; ix::Socket::send @ 00984a30
00984a30	ldr x9,[x0]
00984a34	ldrb w8,[x1]
00984a38	ldp x10,x11,[x1, #0x8]
00984a3c	ldr x3,[x9, #0x28]
00984a40	lsr w12,w8,#0x1
00984a44	tst w8,#0x1
00984a48	csinc x1,x11,x1,ne
00984a4c	csel x2,x12,x10,eq
00984a50	br x3
