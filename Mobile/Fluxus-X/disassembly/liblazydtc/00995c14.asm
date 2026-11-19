; ix::WebSocketTransport::setCloseReason @ 00995c14
00995c14	str x21,[sp, #-0x30]!
00995c18	stp x20,x19,[sp, #0x10]
00995c1c	stp x29,x30,[sp, #0x20]
00995c20	add x29,sp,#0x20
00995c24	add x19,x0,#0x138
00995c28	mov x21,x0
00995c2c	mov x0,x19
00995c30	mov x20,x1
00995c34	bl 0x00c2ff10
00995c38	add x0,x21,#0x120
00995c3c	cmp x0,x20
00995c40	b.eq 0x00995c60
00995c44	ldrb w8,[x20]
00995c48	ldp x10,x9,[x20, #0x8]
00995c4c	tst w8,#0x1
00995c50	lsr w11,w8,#0x1
00995c54	csinc x1,x9,x20,ne
00995c58	csel x2,x11,x10,eq
00995c5c	bl 0x00c31090
00995c60	mov x0,x19
00995c64	ldp x29,x30,[sp, #0x20]
00995c68	ldp x20,x19,[sp, #0x10]
00995c6c	ldr x21,[sp], #0x30
00995c70	b 0x00c2ff20
