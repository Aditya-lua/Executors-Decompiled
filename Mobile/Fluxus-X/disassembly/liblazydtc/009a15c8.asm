; WebSocketHandshakeKeyGen::static_for<19,WebSocketHandshakeKeyGen::Sha1Loop<5>>::operator() @ 009a15c8
009a15c8	sub sp,sp,#0x40
009a15cc	str x21,[sp, #0x10]
009a15d0	stp x20,x19,[sp, #0x20]
009a15d4	stp x29,x30,[sp, #0x30]
009a15d8	add x29,sp,#0x30
009a15dc	mrs x21,tpidr_el0
009a15e0	ldr x8,[x21, #0x28]
009a15e4	mov x0,sp
009a15e8	mov x20,x2
009a15ec	mov x19,x1
009a15f0	str x8,[sp, #0x8]
009a15f4	bl 0x00c33aa0
009a15f8	ldr w9,[x20, #0x20]
009a15fc	ldr w10,[x20, #0xc]
009a1600	ldr w11,[x20, #0x34]
009a1604	ldr w12,[x20, #0x2c]
009a1608	mov w8,#0xc1d6
009a160c	eor w9,w10,w9
009a1610	eor w9,w9,w11
009a1614	eor w9,w9,w12
009a1618	ror w9,w9,#0x1f
009a161c	str w9,[x20, #0x2c]
009a1620	ldp w10,w11,[x19, #0x8]
009a1624	ldp w13,w14,[x19]
009a1628	ldr w12,[x19, #0x10]
009a162c	movk w8,#0xca62, LSL #16
009a1630	eor w10,w10,w11
009a1634	eor w10,w10,w14
009a1638	add w9,w9,w10
009a163c	ror w12,w12,#0x1b
009a1640	add w9,w9,w13
009a1644	add w9,w9,w12
009a1648	ror w11,w11,#0x2
009a164c	add w9,w9,w8
009a1650	str w11,[x19, #0xc]
009a1654	str w9,[x19]
009a1658	ldr w9,[x20, #0x24]
009a165c	ldr w10,[x20, #0x10]
009a1660	ldr w11,[x20, #0x38]
009a1664	ldr w12,[x20, #0x30]
009a1668	eor w9,w10,w9
009a166c	eor w9,w9,w11
009a1670	eor w9,w9,w12
009a1674	ror w9,w9,#0x1f
009a1678	str w9,[x20, #0x30]
009a167c	ldp w11,w10,[x19, #0xc]
009a1680	ldr w13,[x19, #0x8]
009a1684	ldp w12,w14,[x19]
009a1688	eor w11,w11,w10
009a168c	eor w11,w11,w13
009a1690	add w9,w9,w11
009a1694	ror w12,w12,#0x1b
009a1698	add w9,w9,w14
009a169c	add w9,w9,w12
009a16a0	ror w10,w10,#0x2
009a16a4	add w9,w9,w8
009a16a8	str w10,[x19, #0x10]
009a16ac	str w9,[x19, #0x4]
009a16b0	ldr w9,[x20, #0x28]
009a16b4	ldr w10,[x20, #0x14]
009a16b8	ldr w11,[x20, #0x3c]
009a16bc	ldr w12,[x20, #0x34]
009a16c0	eor w9,w10,w9
009a16c4	eor w9,w9,w11
009a16c8	eor w9,w9,w12
009a16cc	ror w9,w9,#0x1f
009a16d0	str w9,[x20, #0x34]
009a16d4	ldp w10,w13,[x19]
009a16d8	ldp w12,w11,[x19, #0xc]
009a16dc	ldr w14,[x19, #0x8]
009a16e0	eor w11,w11,w10
009a16e4	eor w11,w11,w12
009a16e8	add w9,w9,w11
009a16ec	ror w12,w13,#0x1b
009a16f0	add w9,w9,w14
009a16f4	add w9,w9,w12
009a16f8	ror w10,w10,#0x2
009a16fc	add w9,w9,w8
009a1700	str w10,[x19]
009a1704	str w9,[x19, #0x8]
009a1708	ldr w9,[x20, #0x2c]
009a170c	ldr w10,[x20, #0x18]
009a1710	ldr w11,[x20]
009a1714	ldr w12,[x20, #0x38]
009a1718	eor w9,w10,w9
009a171c	eor w9,w9,w11
009a1720	eor w9,w9,w12
009a1724	ror w9,w9,#0x1f
009a1728	str w9,[x20, #0x38]
009a172c	ldp w10,w11,[x19]
009a1730	ldr w13,[x19, #0x10]
009a1734	ldp w12,w14,[x19, #0x8]
009a1738	eor w10,w10,w11
009a173c	eor w10,w10,w13
009a1740	add w9,w9,w10
009a1744	ror w12,w12,#0x1b
009a1748	add w9,w9,w14
009a174c	add w9,w9,w12
009a1750	ror w11,w11,#0x2
009a1754	add w8,w9,w8
009a1758	str w11,[x19, #0x4]
009a175c	str w8,[x19, #0xc]
009a1760	ldr x8,[x21, #0x28]
009a1764	ldr x9,[sp, #0x8]
009a1768	cmp x8,x9
009a176c	b.ne 0x009a1784
009a1770	ldp x29,x30,[sp, #0x30]
009a1774	ldp x20,x19,[sp, #0x20]
009a1778	ldr x21,[sp, #0x10]
009a177c	add sp,sp,#0x40
009a1780	ret
009a1784	bl 0x00c2fec0
