; cpr::Session::HeadAsync @ 008f167c
008f167c	sub sp,sp,#0x70
008f1680	stp x26,x25,[sp, #0x20]
008f1684	stp x24,x23,[sp, #0x30]
008f1688	stp x22,x21,[sp, #0x40]
008f168c	stp x20,x19,[sp, #0x50]
008f1690	stp x29,x30,[sp, #0x60]
008f1694	add x29,sp,#0x60
008f1698	mrs x24,tpidr_el0
008f169c	mov x20,x8
008f16a0	ldr x8,[x24, #0x28]
008f16a4	str x8,[sp, #0x18]
008f16a8	mov x8,sp
008f16ac	bl 0x00c31300
008f16b0	bl 0x00c30d70
008f16b4	add x8,x0,#0x20
008f16b8	ldar w8,[x8]
008f16bc	mov x21,x0
008f16c0	cbnz w8,0x008f16d0
008f16c4	mov x0,x21
008f16c8	mov x1,xzr
008f16cc	bl 0x00c31330
008f16d0	add x8,x21,#0x30
008f16d4	ldar x8,[x8]
008f16d8	cbnz x8,0x008f16f8
008f16dc	add x8,x21,#0x28
008f16e0	ldar x8,[x8]
008f16e4	ldr x9,[x21, #0x10]
008f16e8	cmp x8,x9
008f16ec	b.cs 0x008f16f8
008f16f0	mov x0,x21
008f16f4	bl 0x00c31320
008f16f8	ldp x23,x22,[sp]
008f16fc	stp xzr,xzr,[sp]
008f1700	orr w0,wzr,#0x60
008f1704	bl 0x00c2fed0
008f1708	str xzr,[x0, #0x10]
008f170c	adrp x8,0xcb4000
008f1710	ldr x8,[x8, #0xd50]
008f1714	adrp x9,0xc4e000
008f1718	add x9,x9,#0xb98
008f171c	mov x25,x0
008f1720	mov x26,x0
008f1724	add x8,x8,#0x10
008f1728	add x9,x9,#0x10
008f172c	mov x19,x0
008f1730	str xzr,[x25, #0x8]!
008f1734	str x8,[x0]
008f1738	str x9,[x26, #0x20]!
008f173c	str x26,[x0, #0x40]
008f1740	stp x23,x22,[x0, #0x28]
008f1744	mov w0,#0x188
008f1748	bl 0x00c2fed0
008f174c	mov x23,x0
008f1750	add x0,x0,#0x8
008f1754	mov w2,#0x6c
008f1758	mov w1,wzr
008f175c	bl 0x00c301c0
008f1760	adrp x8,0xcb4000
008f1764	ldr x8,[x8, #0xd40]
008f1768	str x23,[x19, #0x50]
008f176c	add x8,x8,#0x10
008f1770	str x8,[x23]
008f1774	add x0,sp,#0x10
008f1778	mov x1,x23
008f177c	bl 0x00c316e0
008f1780	add x22,x21,#0xa8
008f1784	mov x0,x22
008f1788	bl 0x00c2ff10
008f178c	ldxr x8,[x25]
008f1790	add x8,x8,#0x1
008f1794	stxr w9,x8,[x25]
008f1798	cbnz w9,0x008f178c
008f179c	ldp x9,x10,[x21, #0x80]
008f17a0	ldp x12,x8,[x21, #0x98]
008f17a4	mov w11,#0x55
008f17a8	subs x13,x10,x9
008f17ac	asr x13,x13,#0x3
008f17b0	mul x11,x13,x11
008f17b4	sub x11,x11,#0x1
008f17b8	csel x13,xzr,x11,eq
008f17bc	add x11,x8,x12
008f17c0	cmp x13,x11
008f17c4	b.ne 0x008f17dc
008f17c8	add x0,x21,#0x78
008f17cc	bl 0x00c31620
008f17d0	ldp x11,x8,[x21, #0x98]
008f17d4	ldp x9,x10,[x21, #0x80]
008f17d8	add x11,x11,x8
008f17dc	cmp x10,x9
008f17e0	b.eq 0x008f180c
008f17e4	orr x10,xzr,#-0x3f3f3f3f3f3f3f40
008f17e8	movk x10,#0xc0c1
008f17ec	umulh x10,x11,x10
008f17f0	lsr x10,x10,#0x6
008f17f4	ldr x9,[x9, x10, LSL #0x3]
008f17f8	mov w12,#0x55
008f17fc	msub x10,x10,x12,x11
008f1800	orr w11,wzr,#0x30
008f1804	madd x9,x10,x11,x9
008f1808	b 0x008f1810
008f180c	mov x9,xzr
008f1810	adrp x10,0xc4e000
008f1814	add x10,x10,#0xbf8
008f1818	add x8,x8,#0x1
008f181c	add x10,x10,#0x10
008f1820	mov x0,x22
008f1824	stp x26,x19,[x9, #0x8]
008f1828	str x9,[x9, #0x20]
008f182c	str x10,[x9]
008f1830	str x8,[x21, #0xa0]
008f1834	bl 0x00c2ff20
008f1838	add x0,x21,#0xd0
008f183c	bl 0x00c315f0
008f1840	ldr x21,[sp, #0x10]
008f1844	ldaxr x8,[x25]
008f1848	sub x9,x8,#0x1
008f184c	stlxr w10,x9,[x25]
008f1850	cbnz w10,0x008f1844
008f1854	cbnz x8,0x008f1870
008f1858	ldr x8,[x19]
008f185c	mov x0,x19
008f1860	ldr x8,[x8, #0x10]
008f1864	blr x8
008f1868	mov x0,x19
008f186c	bl 0x00c2ff00
008f1870	ldr x19,[sp, #0x8]
008f1874	stp xzr,xzr,[x20, #0x8]
008f1878	str x21,[x20]
008f187c	cbz x19,0x008f18b0
008f1880	add x8,x19,#0x8
008f1884	ldaxr x9,[x8]
008f1888	sub x10,x9,#0x1
008f188c	stlxr w11,x10,[x8]
008f1890	cbnz w11,0x008f1884
008f1894	cbnz x9,0x008f18b0
008f1898	ldr x8,[x19]
008f189c	mov x0,x19
008f18a0	ldr x8,[x8, #0x10]
008f18a4	blr x8
008f18a8	mov x0,x19
008f18ac	bl 0x00c2ff00
008f18b0	ldr x8,[x24, #0x28]
008f18b4	ldr x9,[sp, #0x18]
008f18b8	cmp x8,x9
008f18bc	b.ne 0x008f18dc
008f18c0	ldp x29,x30,[sp, #0x60]
008f18c4	ldp x20,x19,[sp, #0x50]
008f18c8	ldp x22,x21,[sp, #0x40]
008f18cc	ldp x24,x23,[sp, #0x30]
008f18d0	ldp x26,x25,[sp, #0x20]
008f18d4	add sp,sp,#0x70
008f18d8	ret
008f18dc	bl 0x00c2fec0
