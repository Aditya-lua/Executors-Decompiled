; ix::ConnectionState::setRemoteIp @ 009811f4
009811f4	add x0,x0,#0x60
009811f8	cmp x0,x1
009811fc	b.eq 0x00981228
00981200	stp x29,x30,[sp, #-0x10]!
00981204	mov x29,sp
00981208	ldrb w8,[x1]
0098120c	ldp x10,x9,[x1, #0x8]
00981210	lsr w11,w8,#0x1
00981214	tst w8,#0x1
00981218	csinc x1,x9,x1,ne
0098121c	csel x2,x11,x10,eq
00981220	bl 0x00c31090
00981224	ldp x29,x30,[sp], #0x10
00981228	ret
