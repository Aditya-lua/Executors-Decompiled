; FUN_00bc172c @ 00bc172c
00bc172c	cbz x2,0x00bc176c
00bc1730	add x8,x1,#0x8
00bc1734	cmp x2,#0x8
00bc1738	stp x1,x8,[x0, #0x18]
00bc173c	b.cc 0x00bc1780
00bc1740	add x8,x1,x2
00bc1744	ldr x9,[x8, #-0x8]!
00bc1748	str x8,[x0, #0x10]
00bc174c	str x9,[x0]
00bc1750	ldrb w8,[x8, #0x7]
00bc1754	cbz w8,0x00bc1834
00bc1758	clz w8,w8
00bc175c	mov w9,#0x8
00bc1760	eor w8,w8,#0x1f
00bc1764	sub w8,w9,w8
00bc1768	b 0x00bc1828
00bc176c	movi v0.2D,#0x0
00bc1770	str xzr,[x0, #0x20]
00bc1774	stp q0,q0,[x0]
00bc1778	mov x0,#-0x48
00bc177c	ret
00bc1780	str x1,[x0, #0x10]
00bc1784	cmp x2,#0x4
00bc1788	ldrb w8,[x1]
00bc178c	str x8,[x0]
00bc1790	b.gt 0x00bc17b0
00bc1794	cmp x2,#0x2
00bc1798	b.eq 0x00bc1804
00bc179c	cmp x2,#0x3
00bc17a0	b.eq 0x00bc17f8
00bc17a4	cmp x2,#0x4
00bc17a8	b.eq 0x00bc17ec
00bc17ac	b 0x00bc1810
00bc17b0	cmp x2,#0x5
00bc17b4	b.eq 0x00bc17e0
00bc17b8	cmp x2,#0x6
00bc17bc	b.eq 0x00bc17d4
00bc17c0	cmp x2,#0x7
00bc17c4	b.ne 0x00bc1810
00bc17c8	ldrb w9,[x1, #0x6]
00bc17cc	orr x8,x8,x9, LSL #0x30
00bc17d0	str x8,[x0]
00bc17d4	ldrb w9,[x1, #0x5]
00bc17d8	add x8,x8,x9, LSL #0x28
00bc17dc	str x8,[x0]
00bc17e0	ldrb w9,[x1, #0x4]
00bc17e4	add x8,x8,x9, LSL #0x20
00bc17e8	str x8,[x0]
00bc17ec	ldrb w9,[x1, #0x3]
00bc17f0	add x8,x8,x9, LSL #0x18
00bc17f4	str x8,[x0]
00bc17f8	ldrb w9,[x1, #0x2]
00bc17fc	add x8,x8,x9, LSL #0x10
00bc1800	str x8,[x0]
00bc1804	ldrb w9,[x1, #0x1]
00bc1808	add x8,x8,x9, LSL #0x8
00bc180c	str x8,[x0]
00bc1810	add x8,x1,x2
00bc1814	ldurb w8,[x8, #-0x1]
00bc1818	cbz w8,0x00bc1840
00bc181c	clz w8,w8
00bc1820	sub w8,w8,w2, LSL #0x3
00bc1824	add w8,w8,#0x29
00bc1828	str w8,[x0, #0x8]
00bc182c	mov x0,x2
00bc1830	ret
00bc1834	str wzr,[x0, #0x8]
00bc1838	mov x0,#-0x1
00bc183c	ret
00bc1840	str wzr,[x0, #0x8]
00bc1844	mov x0,#-0x14
00bc1848	ret
