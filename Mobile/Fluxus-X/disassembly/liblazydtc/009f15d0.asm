; FUN_009f15d0 @ 009f15d0
009f15d0	sub sp,sp,#0x170
009f15d4	stp x26,x25,[sp, #0x120]
009f15d8	stp x20,x19,[sp, #0x150]
009f15dc	mov w19,w6
009f15e0	mov w20,w4
009f15e4	mov x26,x0
009f15e8	cmp w4,#0x81
009f15ec	stp x28,x27,[sp, #0x110]
009f15f0	stp x24,x23,[sp, #0x130]
009f15f4	stp x22,x21,[sp, #0x140]
009f15f8	stp x29,x30,[sp, #0x160]
009f15fc	add x29,sp,#0x160
009f1600	str xzr,[sp, #0x60]
009f1604	b.lt 0x009f1620
009f1608	adrp x1,0x2d1000
009f160c	add x1,x1,#0x713
009f1610	mov x0,x26
009f1614	bl 0x00c32260
009f1618	mov w28,wzr
009f161c	b 0x009f209c
009f1620	ldr x21,[x1]
009f1624	mov x27,x2
009f1628	mov x24,x1
009f162c	cmp x2,#0x0
009f1630	str x21,[sp, #0x80]
009f1634	b.le 0x009f2040
009f1638	sxtw x8,w20
009f163c	cmp w5,#0x0
009f1640	str x3,[sp, #0x48]
009f1644	csel x8,xzr,x8,eq
009f1648	add x0,sp,#0x80
009f164c	add x1,sp,#0x70
009f1650	add x2,sp,#0x6c
009f1654	add x3,sp,#0x68
009f1658	mov x4,x27
009f165c	mov w22,w5
009f1660	str x8,[sp, #0x18]
009f1664	bl 0x00c376a0
009f1668	tbnz w0,#0x7,0x009f2054
009f166c	add x8,x21,x27
009f1670	str x8,[sp, #0x10]
009f1674	ldr x8,[sp, #0x48]
009f1678	mov w25,w0
009f167c	stp x19,x20,[sp, #0x28]
009f1680	sxtw x8,w8
009f1684	stp x24,x8,[sp, #0x50]
009f1688	add w8,w20,#0x1
009f168c	str w8,[sp, #0x24]
009f1690	sxtw x8,w19
009f1694	str x8,[sp, #0x8]
009f1698	ldr w8,[sp, #0x80]
009f169c	ldr x9,[x24]
009f16a0	ldp w24,w28,[sp, #0x68]
009f16a4	adrp x10,0x2a9000
009f16a8	sub w8,w8,w21
009f16ac	sxtw x19,w8
009f16b0	ldr x8,[sp, #0x58]
009f16b4	adrp x11,0x2a2000
009f16b8	tst w25,#0x20
009f16bc	add x10,x10,#0xf70
009f16c0	add x11,x11,#0x14d
009f16c4	sub x9,x21,x9
009f16c8	csel x7,x11,x10,eq
009f16cc	cmp w25,#0x21
009f16d0	add x3,x9,x8
009f16d4	b.ne 0x009f1790
009f16d8	adrp x2,0x2cb000
009f16dc	add x0,sp,#0x88
009f16e0	mov w1,#0x80
009f16e4	add x2,x2,#0x6d8
009f16e8	mov w4,w20
009f16ec	mov x5,x19
009f16f0	mov x6,x7
009f16f4	bl 0x00c34d30
009f16f8	cmp w0,#0x1
009f16fc	b.lt 0x009f17b8
009f1700	cbz x26,0x009f17c4
009f1704	mov w1,#0x4f
009f1708	add x3,sp,#0x88
009f170c	mov x0,x26
009f1710	mov x2,xzr
009f1714	bl 0x00c321a0
009f1718	cmp x0,#0x0
009f171c	b.le 0x009f1824
009f1720	str x19,[sp, #0x40]
009f1724	str wzr,[sp, #0x3c]
009f1728	mov x23,xzr
009f172c	mov x20,x26
009f1730	mov w1,#0x51
009f1734	mov x0,x20
009f1738	mov x2,xzr
009f173c	mov x3,xzr
009f1740	bl 0x00c321a0
009f1744	mov x19,x0
009f1748	mov w1,#0x4f
009f174c	add x3,sp,#0x88
009f1750	mov x0,x20
009f1754	mov x2,xzr
009f1758	bl 0x00c321a0
009f175c	cmp x0,#0x1
009f1760	b.lt 0x009f1780
009f1764	ldr x2,[sp, #0x18]
009f1768	mov w1,#0x50
009f176c	mov x0,x20
009f1770	mov x3,xzr
009f1774	bl 0x00c321a0
009f1778	cmp x0,#0x1
009f177c	b.ge 0x009f17d8
009f1780	mov w24,wzr
009f1784	ldr w28,[sp, #0x3c]
009f1788	tbz x19,#0x3f,0x009f18b8
009f178c	b 0x009f18cc
009f1790	ldr x6,[sp, #0x70]
009f1794	adrp x2,0x2db000
009f1798	add x0,sp,#0x88
009f179c	mov w1,#0x80
009f17a0	add x2,x2,#0xd39
009f17a4	mov w4,w20
009f17a8	mov x5,x19
009f17ac	bl 0x00c34d30
009f17b0	cmp w0,#0x1
009f17b4	b.ge 0x009f1700
009f17b8	mov w24,wzr
009f17bc	mov x23,xzr
009f17c0	b 0x009f18dc
009f17c4	str x19,[sp, #0x40]
009f17c8	mov x20,xzr
009f17cc	str wzr,[sp, #0x3c]
009f17d0	mov x23,xzr
009f17d4	mov x19,#-0x1
009f17d8	mvn w8,w24
009f17dc	tst w8,#0xc0
009f17e0	b.ne 0x009f17fc
009f17e4	adrp x2,0x2af000
009f17e8	add x24,sp,#0x88
009f17ec	add x0,sp,#0x88
009f17f0	mov w1,#0x80
009f17f4	add x2,x2,#0xc59
009f17f8	b 0x009f188c
009f17fc	tbnz w24,#0x7,0x009f1860
009f1800	tbnz w24,#0x6,0x009f1878
009f1804	cmp w28,#0x1f
009f1808	b.lt 0x009f1ab8
009f180c	adrp x2,0x2cf000
009f1810	add x24,sp,#0x88
009f1814	add x0,sp,#0x88
009f1818	mov w1,#0x80
009f181c	add x2,x2,#0x8e5
009f1820	b 0x009f188c
009f1824	bl 0x00c37c50
009f1828	bl 0x00c32240
009f182c	mov x23,x0
009f1830	cbz x0,0x009f1858
009f1834	mov x0,x23
009f1838	mov x1,x26
009f183c	bl 0x00c35640
009f1840	cbz x0,0x009f1858
009f1844	mov x20,x0
009f1848	mov w8,#0x1
009f184c	str x19,[sp, #0x40]
009f1850	str w8,[sp, #0x3c]
009f1854	b 0x009f1730
009f1858	mov w24,wzr
009f185c	b 0x009f18dc
009f1860	adrp x2,0x2af000
009f1864	add x24,sp,#0x88
009f1868	add x0,sp,#0x88
009f186c	mov w1,#0x80
009f1870	add x2,x2,#0xc66
009f1874	b 0x009f188c
009f1878	adrp x2,0x2a9000
009f187c	add x24,sp,#0x88
009f1880	add x0,sp,#0x88
009f1884	mov w1,#0x80
009f1888	add x2,x2,#0xf77
009f188c	mov w3,w28
009f1890	bl 0x00c34d30
009f1894	adrp x1,0x2d5000
009f1898	mov x0,x20
009f189c	add x1,x1,#0xa95
009f18a0	mov x2,x24
009f18a4	bl 0x00c32250
009f18a8	cmp w0,#0x0
009f18ac	cset w24,gt
009f18b0	ldr w28,[sp, #0x3c]
009f18b4	tbnz x19,#0x3f,0x009f18cc
009f18b8	mov w1,#0x50
009f18bc	mov x0,x20
009f18c0	mov x2,x19
009f18c4	mov x3,xzr
009f18c8	bl 0x00c321a0
009f18cc	cbz w28,0x009f18d8
009f18d0	mov x0,x20
009f18d4	bl 0x00c35630
009f18d8	ldr x19,[sp, #0x40]
009f18dc	mov x0,x23
009f18e0	bl 0x00c31a40
009f18e4	cbz w24,0x009f20c0
009f18e8	sub x28,x27,x19
009f18ec	tbnz w25,#0x5,0x009f192c
009f18f0	ldr w8,[sp, #0x68]
009f18f4	ldr x24,[sp, #0x50]
009f18f8	cbz w8,0x009f1a2c
009f18fc	ldr x8,[sp, #0x70]
009f1900	ldr x9,[sp, #0x80]
009f1904	adrp x1,0x2c4000
009f1908	mov w2,#0x1
009f190c	mov x0,x26
009f1910	add x8,x9,x8
009f1914	add x1,x1,#0xdae
009f1918	str x8,[sp, #0x80]
009f191c	bl 0x00c34240
009f1920	cmp w0,#0x1
009f1924	b.ge 0x009f1f4c
009f1928	b 0x009f2064
009f192c	ldr x20,[sp, #0x80]
009f1930	ldr x23,[sp, #0x70]
009f1934	adrp x1,0x2c4000
009f1938	mov w2,#0x1
009f193c	mov x0,x26
009f1940	add x1,x1,#0xdae
009f1944	bl 0x00c34240
009f1948	ldr x24,[sp, #0x50]
009f194c	cmp w0,#0x1
009f1950	b.lt 0x009f2064
009f1954	ldr x19,[sp, #0x70]
009f1958	ldr w27,[sp, #0x24]
009f195c	cmp x19,x28
009f1960	b.gt 0x009f20c8
009f1964	cmp w25,#0x21
009f1968	b.ne 0x009f19cc
009f196c	cbnz x19,0x009f19cc
009f1970	ldr x8,[sp, #0x80]
009f1974	ldr x19,[sp, #0x28]
009f1978	ldr x21,[sp, #0x48]
009f197c	ldr x23,[sp, #0x10]
009f1980	mov x25,x28
009f1984	ldr w9,[x24]
009f1988	sub x2,x23,x8
009f198c	add x1,sp,#0x80
009f1990	mov x0,x26
009f1994	sub w8,w8,w9
009f1998	add w3,w8,w21
009f199c	mov w4,w27
009f19a0	mov w5,w22
009f19a4	mov w6,w19
009f19a8	bl 0x009f15d0
009f19ac	mov w28,w0
009f19b0	cbz w0,0x009f2068
009f19b4	cmp w28,#0x2
009f19b8	b.eq 0x009f1aa4
009f19bc	ldr x8,[sp, #0x80]
009f19c0	cmp x8,x23
009f19c4	b.cc 0x009f1984
009f19c8	b 0x009f1aa8
009f19cc	ldr x21,[sp, #0x80]
009f19d0	add x20,x20,x23
009f19d4	ldr x23,[sp, #0x28]
009f19d8	ldr x25,[sp, #0x48]
009f19dc	cmp x21,x20
009f19e0	b.cs 0x009f1f4c
009f19e4	ldr w8,[x24]
009f19e8	add x1,sp,#0x80
009f19ec	mov x0,x26
009f19f0	mov x2,x19
009f19f4	sub w8,w21,w8
009f19f8	add w3,w8,w25
009f19fc	mov w4,w27
009f1a00	mov w5,w22
009f1a04	mov w6,w23
009f1a08	bl 0x009f15d0
009f1a0c	cbz w0,0x009f2064
009f1a10	ldr x8,[sp, #0x80]
009f1a14	add x9,x19,x21
009f1a18	cmp x20,x8
009f1a1c	sub x19,x9,x8
009f1a20	mov x21,x8
009f1a24	b.hi 0x009f19e4
009f1a28	b 0x009f1f4c
009f1a2c	ldr w8,[sp, #0x6c]
009f1a30	mov x20,x19
009f1a34	ldr x19,[sp, #0x28]
009f1a38	adrp x25,0x2c7000
009f1a3c	sub w8,w8,#0x1
009f1a40	cmp w8,#0x1d
009f1a44	add x25,x25,#0x74b
009f1a48	b.hi 0x009f1c0c
009f1a4c	adrp x9,0x74d000
009f1a50	add x9,x9,#0xfb0
009f1a54	ldrsw x8,[x9, x8, LSL #0x2]
009f1a58	add x8,x8,x9
009f1a5c	br x8
009f1a60	adrp x1,0x2bc000
009f1a64	mov w2,#0x1
009f1a68	mov x0,x26
009f1a6c	add x1,x1,#0xda4
009f1a70	bl 0x00c34240
009f1a74	cmp w0,#0x1
009f1a78	b.lt 0x009f2064
009f1a7c	ldr x2,[sp, #0x70]
009f1a80	cmp x2,#0x1
009f1a84	b.lt 0x009f1f14
009f1a88	ldr x1,[sp, #0x80]
009f1a8c	mov x0,x26
009f1a90	bl 0x00c34240
009f1a94	ldr w8,[sp, #0x70]
009f1a98	cmp w0,w8
009f1a9c	b.eq 0x009f1f14
009f1aa0	b 0x009f2064
009f1aa4	ldr x8,[sp, #0x80]
009f1aa8	sub x8,x8,x20
009f1aac	str x8,[sp, #0x70]
009f1ab0	mov x28,x25
009f1ab4	b 0x009f1f4c
009f1ab8	orr w8,w28,#0x8
009f1abc	and w9,w28,#0xfffffeff
009f1ac0	cmp w8,#0x10a
009f1ac4	csel w8,w9,w28,eq
009f1ac8	adrp x24,0x2bd000
009f1acc	cmp w8,#0x1e
009f1ad0	add x24,x24,#0x7d6
009f1ad4	b.hi 0x009f1894
009f1ad8	adrp x9,0xc58000
009f1adc	add x9,x9,#0x948
009f1ae0	ldr x24,[x9, w8, SXTW #0x3]
009f1ae4	b 0x009f1894
009f1ae8	ldr x8,[sp, #0x70]
009f1aec	mov w19,wzr
009f1af0	cmp x8,#0x1
009f1af4	b.eq 0x009f1b20
009f1af8	adrp x1,0x2a3000
009f1afc	mov x0,x26
009f1b00	add x1,x1,#0xe04
009f1b04	bl 0x00c32260
009f1b08	cmp w0,#0x1
009f1b0c	b.lt 0x009f2064
009f1b10	ldr x8,[sp, #0x70]
009f1b14	cmp x8,#0x1
009f1b18	b.lt 0x009f1ea8
009f1b1c	mov w19,#0x1
009f1b20	ldr x8,[sp, #0x80]
009f1b24	adrp x1,0x2b1000
009f1b28	mov x0,x26
009f1b2c	add x1,x1,#0x4f0
009f1b30	ldrb w2,[x8]
009f1b34	bl 0x00c32250
009f1b38	cbnz w19,0x009f1ea8
009f1b3c	b 0x009f1f14
009f1b40	ldr x8,[sp, #0x70]
009f1b44	add x1,sp,#0x78
009f1b48	mov x0,xzr
009f1b4c	str x21,[sp, #0x78]
009f1b50	add x2,x8,x20
009f1b54	bl 0x00c37c70
009f1b58	mov x27,x0
009f1b5c	cbz x0,0x009f1e38
009f1b60	adrp x1,0x2bc000
009f1b64	mov w2,#0x1
009f1b68	mov x0,x26
009f1b6c	add x1,x1,#0xda4
009f1b70	bl 0x00c34240
009f1b74	cmp w0,#0x1
009f1b78	b.lt 0x009f20f4
009f1b7c	ldr w8,[x27, #0x4]
009f1b80	cmp w8,#0x102
009f1b84	b.ne 0x009f1ba4
009f1b88	adrp x1,0x2cc000
009f1b8c	mov w2,#0x1
009f1b90	mov x0,x26
009f1b94	add x1,x1,#0xc8b
009f1b98	bl 0x00c34240
009f1b9c	cmp w0,#0x1
009f1ba0	b.lt 0x009f20f4
009f1ba4	ldr w8,[x27]
009f1ba8	cmp w8,#0x1
009f1bac	b.lt 0x009f1be0
009f1bb0	mov x19,xzr
009f1bb4	ldr x8,[x27, #0x8]
009f1bb8	mov x0,x26
009f1bbc	mov x1,x25
009f1bc0	ldrb w2,[x8, x19]
009f1bc4	bl 0x00c32250
009f1bc8	cmp w0,#0x1
009f1bcc	b.lt 0x009f20f4
009f1bd0	ldrsw x8,[x27]
009f1bd4	add x19,x19,#0x1
009f1bd8	cmp x19,x8
009f1bdc	b.lt 0x009f1bb4
009f1be0	mov w19,wzr
009f1be4	cbnz w8,0x009f1e54
009f1be8	adrp x1,0x2bb000
009f1bec	mov w2,#0x2
009f1bf0	mov x0,x26
009f1bf4	add x1,x1,#0x974
009f1bf8	bl 0x00c34240
009f1bfc	cmp w0,#0x1
009f1c00	b.lt 0x009f20f4
009f1c04	mov w19,wzr
009f1c08	b 0x009f1e54
009f1c0c	cbz w19,0x009f1f14
009f1c10	ldr x8,[sp, #0x70]
009f1c14	cmp x8,#0x1
009f1c18	b.lt 0x009f1f14
009f1c1c	adrp x1,0x2c4000
009f1c20	mov w2,#0x1
009f1c24	mov x0,x26
009f1c28	add x1,x1,#0xdae
009f1c2c	bl 0x00c34240
009f1c30	cmp w0,#0x1
009f1c34	b.lt 0x009f2064
009f1c38	ldr x8,[sp, #0x70]
009f1c3c	ldr x9,[sp, #0x8]
009f1c40	ldr x1,[sp, #0x80]
009f1c44	mov w10,#0xffffffff
009f1c48	orr w3,wzr,#0x6
009f1c4c	cmp x8,x9
009f1c50	ccmp w19,w10,#0x4,ge
009f1c54	csel w2,w8,w9,eq
009f1c58	mov x0,x26
009f1c5c	bl 0x00c37c40
009f1c60	cmp w0,#0x1
009f1c64	b.ge 0x009f1f30
009f1c68	b 0x009f2064
009f1c6c	ldr x8,[sp, #0x70]
009f1c70	add x1,sp,#0x78
009f1c74	mov x0,xzr
009f1c78	str x21,[sp, #0x78]
009f1c7c	add x2,x8,x20
009f1c80	bl 0x00c37c80
009f1c84	mov x25,x0
009f1c88	cbz x0,0x009f1d18
009f1c8c	ldrsw x8,[x25]
009f1c90	cmp w8,#0x1
009f1c94	b.lt 0x009f1d18
009f1c98	ldr x10,[x25, #0x8]
009f1c9c	mov x9,xzr
009f1ca0	mov w12,#0x1
009f1ca4	mov w13,#0x2600
009f1ca8	str x10,[sp, #0x78]
009f1cac	ldrb w11,[x10, x9]
009f1cb0	cmp w11,#0x1f
009f1cb4	b.ls 0x009f1cc4
009f1cb8	cmp w11,#0x7e
009f1cbc	b.ls 0x009f1cd8
009f1cc0	b 0x009f1f88
009f1cc4	cmp w11,#0xd
009f1cc8	b.hi 0x009f1f88
009f1ccc	lsl w11,w12,w11
009f1cd0	tst w11,w13
009f1cd4	b.eq 0x009f1f88
009f1cd8	add x9,x9,#0x1
009f1cdc	cmp x9,x8
009f1ce0	b.lt 0x009f1cac
009f1ce4	adrp x1,0x2bc000
009f1ce8	mov w2,#0x1
009f1cec	mov x0,x26
009f1cf0	add x1,x1,#0xda4
009f1cf4	bl 0x00c34240
009f1cf8	cmp w0,#0x1
009f1cfc	b.lt 0x009f2110
009f1d00	ldr x1,[sp, #0x78]
009f1d04	ldr w2,[x25]
009f1d08	mov x0,x26
009f1d0c	bl 0x00c34240
009f1d10	cmp w0,#0x1
009f1d14	b.lt 0x009f2110
009f1d18	mov x0,x25
009f1d1c	bl 0x00c35530
009f1d20	b 0x009f1f14
009f1d24	ldr x8,[sp, #0x70]
009f1d28	add x0,sp,#0x60
009f1d2c	add x1,sp,#0x78
009f1d30	str x21,[sp, #0x78]
009f1d34	add x2,x8,x20
009f1d38	bl 0x00c37690
009f1d3c	cbz x0,0x009f1e64
009f1d40	adrp x1,0x2bc000
009f1d44	mov w2,#0x1
009f1d48	mov x0,x26
009f1d4c	add x1,x1,#0xda4
009f1d50	bl 0x00c34240
009f1d54	cmp w0,#0x1
009f1d58	b.lt 0x009f2064
009f1d5c	ldr x1,[sp, #0x60]
009f1d60	mov x0,x26
009f1d64	bl 0x00c32da0
009f1d68	b 0x009f1f14
009f1d6c	ldr x8,[sp, #0x70]
009f1d70	add x1,sp,#0x78
009f1d74	mov x0,xzr
009f1d78	str x21,[sp, #0x78]
009f1d7c	add x2,x8,x20
009f1d80	bl 0x00c37c60
009f1d84	mov x23,x0
009f1d88	cbz x0,0x009f1e80
009f1d8c	adrp x1,0x2bc000
009f1d90	mov w2,#0x1
009f1d94	mov x0,x26
009f1d98	add x1,x1,#0xda4
009f1d9c	bl 0x00c34240
009f1da0	cmp w0,#0x1
009f1da4	b.lt 0x009f2100
009f1da8	ldr w8,[x23, #0x4]
009f1dac	cmp w8,#0x10a
009f1db0	b.ne 0x009f1dd0
009f1db4	adrp x1,0x2cc000
009f1db8	mov w2,#0x1
009f1dbc	mov x0,x26
009f1dc0	add x1,x1,#0xc8b
009f1dc4	bl 0x00c34240
009f1dc8	cmp w0,#0x1
009f1dcc	b.lt 0x009f2100
009f1dd0	ldr w8,[x23]
009f1dd4	cmp w8,#0x1
009f1dd8	b.lt 0x009f1e0c
009f1ddc	mov x19,xzr
009f1de0	ldr x8,[x23, #0x8]
009f1de4	mov x0,x26
009f1de8	mov x1,x25
009f1dec	ldrb w2,[x8, x19]
009f1df0	bl 0x00c32250
009f1df4	cmp w0,#0x1
009f1df8	b.lt 0x009f2100
009f1dfc	ldrsw x8,[x23]
009f1e00	add x19,x19,#0x1
009f1e04	cmp x19,x8
009f1e08	b.lt 0x009f1de0
009f1e0c	mov w19,wzr
009f1e10	cbnz w8,0x009f1e9c
009f1e14	adrp x1,0x2bb000
009f1e18	mov w2,#0x2
009f1e1c	mov x0,x26
009f1e20	add x1,x1,#0x974
009f1e24	bl 0x00c34240
009f1e28	cmp w0,#0x1
009f1e2c	b.lt 0x009f2100
009f1e30	mov w19,wzr
009f1e34	b 0x009f1e9c
009f1e38	adrp x1,0x2ab000
009f1e3c	mov x0,x26
009f1e40	add x1,x1,#0xde3
009f1e44	bl 0x00c32260
009f1e48	cmp w0,#0x1
009f1e4c	b.lt 0x009f2064
009f1e50	mov w19,#0x1
009f1e54	mov x0,x27
009f1e58	bl 0x00c37c30
009f1e5c	cbnz w19,0x009f1ea8
009f1e60	b 0x009f1f14
009f1e64	adrp x1,0x2ad000
009f1e68	mov x0,x26
009f1e6c	add x1,x1,#0x996
009f1e70	bl 0x00c32260
009f1e74	cmp w0,#0x1
009f1e78	b.ge 0x009f1ea8
009f1e7c	b 0x009f2064
009f1e80	adrp x1,0x2d3000
009f1e84	mov x0,x26
009f1e88	add x1,x1,#0x8a6
009f1e8c	bl 0x00c32260
009f1e90	cmp w0,#0x1
009f1e94	b.lt 0x009f2064
009f1e98	mov w19,#0x1
009f1e9c	mov x0,x23
009f1ea0	bl 0x00c37c20
009f1ea4	cbz w19,0x009f1f14
009f1ea8	adrp x1,0x2bd000
009f1eac	mov x0,x26
009f1eb0	add x1,x1,#0x7e0
009f1eb4	bl 0x00c32260
009f1eb8	cmp w0,#0x1
009f1ebc	b.lt 0x009f2064
009f1ec0	ldr x8,[sp, #0x70]
009f1ec4	cmp x8,#0x1
009f1ec8	b.lt 0x009f1efc
009f1ecc	mov x19,xzr
009f1ed0	add x20,x21,x20
009f1ed4	ldrb w2,[x20, x19]
009f1ed8	mov x0,x26
009f1edc	mov x1,x25
009f1ee0	bl 0x00c32250
009f1ee4	cmp w0,#0x1
009f1ee8	b.lt 0x009f2064
009f1eec	ldr x8,[sp, #0x70]
009f1ef0	add x19,x19,#0x1
009f1ef4	cmp x8,x19
009f1ef8	b.gt 0x009f1ed4
009f1efc	adrp x1,0x2c2000
009f1f00	mov x0,x26
009f1f04	add x1,x1,#0xdc5
009f1f08	bl 0x00c32260
009f1f0c	cmp w0,#0x1
009f1f10	b.lt 0x009f2064
009f1f14	adrp x1,0x2c4000
009f1f18	mov w2,#0x1
009f1f1c	mov x0,x26
009f1f20	add x1,x1,#0xdae
009f1f24	bl 0x00c34240
009f1f28	cmp w0,#0x1
009f1f2c	b.lt 0x009f2064
009f1f30	ldr x8,[sp, #0x70]
009f1f34	ldr x9,[sp, #0x80]
009f1f38	ldp w11,w10,[sp, #0x68]
009f1f3c	add x8,x9,x8
009f1f40	orr w9,w11,w10
009f1f44	str x8,[sp, #0x80]
009f1f48	cbz w9,0x009f20e0
009f1f4c	ldr x8,[sp, #0x70]
009f1f50	sub x27,x28,x8
009f1f54	cmp x27,#0x1
009f1f58	b.lt 0x009f2040
009f1f5c	ldr x21,[sp, #0x80]
009f1f60	add x0,sp,#0x80
009f1f64	add x1,sp,#0x70
009f1f68	add x2,sp,#0x6c
009f1f6c	add x3,sp,#0x68
009f1f70	mov x4,x27
009f1f74	bl 0x00c376a0
009f1f78	ldr x20,[sp, #0x30]
009f1f7c	mov w25,w0
009f1f80	tbz w0,#0x7,0x009f1698
009f1f84	b 0x009f2054
009f1f88	cbz w19,0x009f1fe0
009f1f8c	adrp x1,0x2c4000
009f1f90	mov w2,#0x1
009f1f94	mov x0,x26
009f1f98	add x1,x1,#0xdae
009f1f9c	bl 0x00c34240
009f1fa0	cmp w0,#0x1
009f1fa4	b.lt 0x009f2110
009f1fa8	ldr w8,[x25]
009f1fac	ldr x1,[sp, #0x78]
009f1fb0	mov w9,#0xffffffff
009f1fb4	orr w3,wzr,#0x6
009f1fb8	cmp w8,w19
009f1fbc	ccmp w19,w9,#0x4,ge
009f1fc0	csel w2,w8,w19,eq
009f1fc4	mov x0,x26
009f1fc8	bl 0x00c37c40
009f1fcc	cmp w0,#0x1
009f1fd0	b.lt 0x009f2110
009f1fd4	mov x0,x25
009f1fd8	bl 0x00c35530
009f1fdc	b 0x009f1f30
009f1fe0	adrp x1,0x2b7000
009f1fe4	mov w2,#0xb
009f1fe8	mov x0,x26
009f1fec	add x1,x1,#0x8c3
009f1ff0	bl 0x00c34240
009f1ff4	cmp w0,#0x1
009f1ff8	b.lt 0x009f2110
009f1ffc	ldr w8,[x25]
009f2000	cmp w8,#0x1
009f2004	b.lt 0x009f1d18
009f2008	mov x19,xzr
009f200c	ldr x8,[sp, #0x78]
009f2010	adrp x1,0x2c7000
009f2014	mov x0,x26
009f2018	add x1,x1,#0x74b
009f201c	ldrb w2,[x8, x19]
009f2020	bl 0x00c32250
009f2024	cmp w0,#0x1
009f2028	b.lt 0x009f2110
009f202c	ldrsw x8,[x25]
009f2030	add x19,x19,#0x1
009f2034	cmp x19,x8
009f2038	b.lt 0x009f200c
009f203c	b 0x009f1d18
009f2040	mov x25,xzr
009f2044	mov x27,xzr
009f2048	mov x23,xzr
009f204c	mov w28,#0x1
009f2050	b 0x009f2074
009f2054	adrp x1,0x2d7000
009f2058	add x1,x1,#0xba3
009f205c	mov x0,x26
009f2060	bl 0x00c32260
009f2064	mov w28,wzr
009f2068	mov x25,xzr
009f206c	mov x27,xzr
009f2070	mov x23,xzr
009f2074	ldr x0,[sp, #0x60]
009f2078	bl 0x00c37660
009f207c	mov x0,x25
009f2080	bl 0x00c35530
009f2084	mov x0,x27
009f2088	bl 0x00c37c30
009f208c	mov x0,x23
009f2090	bl 0x00c37c20
009f2094	ldr x8,[sp, #0x80]
009f2098	str x8,[x24]
009f209c	mov w0,w28
009f20a0	ldp x29,x30,[sp, #0x160]
009f20a4	ldp x20,x19,[sp, #0x150]
009f20a8	ldp x22,x21,[sp, #0x140]
009f20ac	ldp x24,x23,[sp, #0x130]
009f20b0	ldp x26,x25,[sp, #0x120]
009f20b4	ldp x28,x27,[sp, #0x110]
009f20b8	add sp,sp,#0x170
009f20bc	ret
009f20c0	ldr x24,[sp, #0x50]
009f20c4	b 0x009f2064
009f20c8	adrp x1,0x2d9000
009f20cc	add x1,x1,#0x9b6
009f20d0	mov x0,x26
009f20d4	mov x2,x28
009f20d8	bl 0x00c32250
009f20dc	b 0x009f2064
009f20e0	mov x25,xzr
009f20e4	mov x27,xzr
009f20e8	mov x23,xzr
009f20ec	mov w28,#0x2
009f20f0	b 0x009f2074
009f20f4	mov w28,wzr
009f20f8	mov x25,xzr
009f20fc	b 0x009f2070
009f2100	mov w28,wzr
009f2104	mov x25,xzr
009f2108	mov x27,xzr
009f210c	b 0x009f2074
009f2110	mov w28,wzr
009f2114	b 0x009f206c
