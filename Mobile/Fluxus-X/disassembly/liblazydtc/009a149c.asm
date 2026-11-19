; WebSocketHandshakeKeyGen::static_for<3,WebSocketHandshakeKeyGen::Sha1Loop<4>>::operator() @ 009a149c
009a149c	ldr w8,[x2, #0x14]
009a14a0	ldr w9,[x2]
009a14a4	ldr w10,[x2, #0x28]
009a14a8	ldr w11,[x2, #0x20]
009a14ac	eor w8,w9,w8
009a14b0	eor w8,w8,w10
009a14b4	eor w8,w8,w11
009a14b8	ror w8,w8,#0x1f
009a14bc	str w8,[x2, #0x20]
009a14c0	ldp w9,w10,[x1, #0x8]
009a14c4	ldp w12,w11,[x1]
009a14c8	ldr w13,[x1, #0x10]
009a14cc	orr w14,w9,w10
009a14d0	and w11,w14,w11
009a14d4	and w9,w9,w10
009a14d8	orr w9,w11,w9
009a14dc	add w8,w8,w9
009a14e0	mov w14,#0xbcdc
009a14e4	ror w13,w13,#0x1b
009a14e8	add w8,w8,w12
009a14ec	movk w14,#0x8f1b, LSL #16
009a14f0	add w8,w8,w13
009a14f4	ror w10,w10,#0x2
009a14f8	add w8,w8,w14
009a14fc	str w10,[x1, #0xc]
009a1500	str w8,[x1]
009a1504	ldr w8,[x2, #0x18]
009a1508	ldr w9,[x2, #0x4]
009a150c	ldr w10,[x2, #0x2c]
009a1510	ldr w11,[x2, #0x24]
009a1514	eor w8,w9,w8
009a1518	eor w8,w8,w10
009a151c	eor w8,w8,w11
009a1520	ror w8,w8,#0x1f
009a1524	str w8,[x2, #0x24]
009a1528	ldp w10,w9,[x1, #0xc]
009a152c	ldr w11,[x1, #0x8]
009a1530	orr w12,w10,w9
009a1534	and w11,w12,w11
009a1538	ldp w13,w12,[x1]
009a153c	and w10,w10,w9
009a1540	ror w9,w9,#0x2
009a1544	str w9,[x1, #0x10]
009a1548	orr w9,w11,w10
009a154c	add w8,w8,w9
009a1550	ror w13,w13,#0x1b
009a1554	add w8,w8,w12
009a1558	add w8,w8,w13
009a155c	add w8,w8,w14
009a1560	str w8,[x1, #0x4]
009a1564	ldr w8,[x2, #0x1c]
009a1568	ldr w9,[x2, #0x8]
009a156c	ldr w10,[x2, #0x30]
009a1570	ldr w11,[x2, #0x28]
009a1574	eor w8,w9,w8
009a1578	eor w8,w8,w10
009a157c	eor w8,w8,w11
009a1580	ror w8,w8,#0x1f
009a1584	str w8,[x2, #0x28]
009a1588	ldp w9,w13,[x1]
009a158c	ldp w11,w10,[x1, #0xc]
009a1590	ldr w12,[x1, #0x8]
009a1594	ror w13,w13,#0x1b
009a1598	orr w15,w10,w9
009a159c	and w11,w15,w11
009a15a0	and w10,w10,w9
009a15a4	orr w10,w11,w10
009a15a8	add w8,w8,w10
009a15ac	add w8,w8,w12
009a15b0	add w8,w8,w13
009a15b4	ror w9,w9,#0x2
009a15b8	add w8,w8,w14
009a15bc	str w8,[x1, #0x8]
009a15c0	str w9,[x1]
009a15c4	ret
