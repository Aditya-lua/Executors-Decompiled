; mbedtls_ecjpake_self_test @ 00ba156c
00ba156c	stp x28,x27,[sp, #-0x60]!
00ba1570	stp x26,x25,[sp, #0x10]
00ba1574	stp x24,x23,[sp, #0x20]
00ba1578	stp x22,x21,[sp, #0x30]
00ba157c	stp x20,x19,[sp, #0x40]
00ba1580	stp x29,x30,[sp, #0x50]
00ba1584	add x29,sp,#0x50
00ba1588	sub sp,sp,#0x6d0
00ba158c	mrs x8,tpidr_el0
00ba1590	str x8,[sp, #0x20]
00ba1594	ldr x8,[x8, #0x28]
00ba1598	add x19,sp,#0x280
00ba159c	add x20,x19,#0x8
00ba15a0	mov w21,w0
00ba15a4	mov x0,x20
00ba15a8	stur x8,[x29, #-0x60]
00ba15ac	str wzr,[sp, #0x280]
00ba15b0	bl 0x00c426c0
00ba15b4	add x0,x19,#0xd0
00ba15b8	str wzr,[sp, #0x34c]
00ba15bc	str x0,[sp, #0x28]
00ba15c0	bl 0x00c42760
00ba15c4	add x22,x19,#0x100
00ba15c8	mov x0,x22
00ba15cc	bl 0x00c42760
00ba15d0	add x23,x19,#0x130
00ba15d4	mov x0,x23
00ba15d8	bl 0x00c42760
00ba15dc	add x24,x19,#0x160
00ba15e0	mov x0,x24
00ba15e4	bl 0x00c42760
00ba15e8	add x25,x19,#0x190
00ba15ec	mov x0,x25
00ba15f0	bl 0x00c42760
00ba15f4	add x26,x19,#0x1c0
00ba15f8	mov x0,x26
00ba15fc	bl 0x00c41c00
00ba1600	add x27,x19,#0x1d0
00ba1604	mov x0,x27
00ba1608	bl 0x00c41c00
00ba160c	add x28,x19,#0x1e0
00ba1610	mov x0,x28
00ba1614	bl 0x00c41c00
00ba1618	add x19,sp,#0x90
00ba161c	add x0,x19,#0x8
00ba1620	str wzr,[sp, #0x90]
00ba1624	str x0,[sp, #0x68]
00ba1628	bl 0x00c426c0
00ba162c	add x0,x19,#0xd0
00ba1630	str wzr,[sp, #0x15c]
00ba1634	str x0,[sp, #0x50]
00ba1638	bl 0x00c42760
00ba163c	add x0,x19,#0x100
00ba1640	str x0,[sp, #0x48]
00ba1644	bl 0x00c42760
00ba1648	add x0,x19,#0x130
00ba164c	str x0,[sp, #0x60]
00ba1650	bl 0x00c42760
00ba1654	add x0,x19,#0x160
00ba1658	str x0,[sp, #0x58]
00ba165c	bl 0x00c42760
00ba1660	add x0,x19,#0x190
00ba1664	str x0,[sp, #0x40]
00ba1668	bl 0x00c42760
00ba166c	add x0,x19,#0x1c0
00ba1670	str x0,[sp, #0x38]
00ba1674	bl 0x00c41c00
00ba1678	add x0,x19,#0x1d0
00ba167c	str x0,[sp, #0x30]
00ba1680	bl 0x00c41c00
00ba1684	add x0,x19,#0x1e0
00ba1688	str x0,[sp, #0x70]
00ba168c	bl 0x00c41c00
00ba1690	str w21,[sp, #0x7c]
00ba1694	cbz w21,0x00ba16a4
00ba1698	adrp x0,0x2ab000
00ba169c	add x0,x0,#0x149
00ba16a0	bl 0x00c41af0
00ba16a4	mov w0,#0x9
00ba16a8	str wzr,[sp, #0x348]
00ba16ac	mov w19,#0x9
00ba16b0	bl 0x00c30210
00ba16b4	cbz x0,0x00ba17cc
00ba16b8	orr w1,wzr,#0x3
00ba16bc	mov x0,x20
00ba16c0	str w19,[sp, #0x280]
00ba16c4	bl 0x00c42800
00ba16c8	cbnz w0,0x00ba16e4
00ba16cc	adrp x1,0x787000
00ba16d0	add x1,x1,#0xacd
00ba16d4	orr w2,wzr,#0xf
00ba16d8	mov x0,x28
00ba16dc	bl 0x00c41ca0
00ba16e0	cbz w0,0x00ba1738
00ba16e4	mov x0,x20
00ba16e8	str wzr,[sp, #0x280]
00ba16ec	bl 0x00c426b0
00ba16f0	ldr x21,[sp, #0x28]
00ba16f4	mov x0,x21
00ba16f8	bl 0x00c42750
00ba16fc	mov x0,x22
00ba1700	bl 0x00c42750
00ba1704	mov x0,x23
00ba1708	bl 0x00c42750
00ba170c	mov x0,x24
00ba1710	bl 0x00c42750
00ba1714	mov x0,x25
00ba1718	bl 0x00c42750
00ba171c	mov x0,x26
00ba1720	bl 0x00c41bb0
00ba1724	mov x0,x27
00ba1728	bl 0x00c41bb0
00ba172c	mov x0,x28
00ba1730	bl 0x00c41bb0
00ba1734	b 0x00ba17d0
00ba1738	mov w19,#0x1
00ba173c	mov w0,#0x9
00ba1740	str w19,[sp, #0x158]
00ba1744	mov w21,#0x9
00ba1748	bl 0x00c30210
00ba174c	cbz x0,0x00ba1fb8
00ba1750	ldr x19,[sp, #0x68]
00ba1754	orr w1,wzr,#0x3
00ba1758	str w21,[sp, #0x90]
00ba175c	mov x0,x19
00ba1760	bl 0x00c42800
00ba1764	cbnz w0,0x00ba1780
00ba1768	ldr x0,[sp, #0x70]
00ba176c	adrp x1,0x787000
00ba1770	add x1,x1,#0xacd
00ba1774	orr w2,wzr,#0xf
00ba1778	bl 0x00c41ca0
00ba177c	cbz w0,0x00ba18d8
00ba1780	mov x0,x19
00ba1784	str wzr,[sp, #0x90]
00ba1788	bl 0x00c426b0
00ba178c	ldr x0,[sp, #0x50]
00ba1790	bl 0x00c42750
00ba1794	ldr x0,[sp, #0x48]
00ba1798	bl 0x00c42750
00ba179c	ldr x0,[sp, #0x60]
00ba17a0	bl 0x00c42750
00ba17a4	ldr x0,[sp, #0x58]
00ba17a8	bl 0x00c42750
00ba17ac	ldr x0,[sp, #0x40]
00ba17b0	bl 0x00c42750
00ba17b4	ldr x0,[sp, #0x38]
00ba17b8	bl 0x00c41bb0
00ba17bc	ldr x0,[sp, #0x30]
00ba17c0	bl 0x00c41bb0
00ba17c4	ldr x0,[sp, #0x70]
00ba17c8	bl 0x00c41bb0
00ba17cc	ldr x21,[sp, #0x28]
00ba17d0	mov w19,#0x1
00ba17d4	mov x0,x20
00ba17d8	str wzr,[sp, #0x280]
00ba17dc	bl 0x00c426b0
00ba17e0	mov x0,x21
00ba17e4	bl 0x00c42750
00ba17e8	mov x0,x22
00ba17ec	bl 0x00c42750
00ba17f0	mov x0,x23
00ba17f4	bl 0x00c42750
00ba17f8	mov x0,x24
00ba17fc	bl 0x00c42750
00ba1800	mov x0,x25
00ba1804	bl 0x00c42750
00ba1808	mov x0,x26
00ba180c	bl 0x00c41bb0
00ba1810	mov x0,x27
00ba1814	bl 0x00c41bb0
00ba1818	mov x0,x28
00ba181c	bl 0x00c41bb0
00ba1820	ldr x0,[sp, #0x68]
00ba1824	str wzr,[sp, #0x90]
00ba1828	bl 0x00c426b0
00ba182c	ldr x0,[sp, #0x50]
00ba1830	bl 0x00c42750
00ba1834	ldr x0,[sp, #0x48]
00ba1838	bl 0x00c42750
00ba183c	ldr x0,[sp, #0x60]
00ba1840	bl 0x00c42750
00ba1844	ldr x0,[sp, #0x58]
00ba1848	bl 0x00c42750
00ba184c	ldr x0,[sp, #0x40]
00ba1850	bl 0x00c42750
00ba1854	ldr x0,[sp, #0x38]
00ba1858	bl 0x00c41bb0
00ba185c	ldr x0,[sp, #0x30]
00ba1860	bl 0x00c41bb0
00ba1864	ldr x0,[sp, #0x70]
00ba1868	bl 0x00c41bb0
00ba186c	cmp w19,#0x0
00ba1870	cset w20,ne
00ba1874	cbz w19,0x00ba1890
00ba1878	ldr w8,[sp, #0x7c]
00ba187c	cbz w8,0x00ba1890
00ba1880	adrp x0,0x77c000
00ba1884	add x0,x0,#0x854
00ba1888	bl 0x00c30760
00ba188c	mov w20,#0x1
00ba1890	ldr w8,[sp, #0x7c]
00ba1894	cbz w8,0x00ba18a0
00ba1898	mov w0,#0xa
00ba189c	bl 0x00c42240
00ba18a0	ldr x8,[sp, #0x20]
00ba18a4	ldr x8,[x8, #0x28]
00ba18a8	ldur x9,[x29, #-0x60]
00ba18ac	cmp x8,x9
00ba18b0	b.ne 0x00ba1fc0
00ba18b4	mov w0,w20
00ba18b8	add sp,sp,#0x6d0
00ba18bc	ldp x29,x30,[sp, #0x50]
00ba18c0	ldp x20,x19,[sp, #0x40]
00ba18c4	ldp x22,x21,[sp, #0x30]
00ba18c8	ldp x24,x23,[sp, #0x20]
00ba18cc	ldp x26,x25,[sp, #0x10]
00ba18d0	ldp x28,x27,[sp], #0x60
00ba18d4	ret
00ba18d8	ldr w8,[sp, #0x7c]
00ba18dc	cbz w8,0x00ba18f8
00ba18e0	adrp x0,0x77c000
00ba18e4	add x0,x0,#0x87c
00ba18e8	bl 0x00c30760
00ba18ec	adrp x0,0x2b0000
00ba18f0	add x0,x0,#0xf84
00ba18f4	bl 0x00c41af0
00ba18f8	nop
00ba18fc	adr x4,0xba1fc4
00ba1900	add x0,sp,#0x280
00ba1904	add x1,sp,#0x4c0
00ba1908	mov w2,#0x200
00ba190c	add x3,sp,#0x88
00ba1910	mov x5,xzr
00ba1914	bl 0x00c425e0
00ba1918	ldr x21,[sp, #0x28]
00ba191c	mov w19,#0x1
00ba1920	cbnz w0,0x00ba17d4
00ba1924	ldr w9,[sp, #0x158]
00ba1928	ldr x8,[sp, #0x88]
00ba192c	adrp x11,0xcab000
00ba1930	add x11,x11,#0x448
00ba1934	sub w9,w19,w9
00ba1938	ldr w0,[sp, #0x90]
00ba193c	ldr w2,[sp, #0x15c]
00ba1940	ldr x5,[x11, w9, UXTW #0x3]
00ba1944	ldp x4,x1,[sp, #0x60]
00ba1948	add x10,sp,#0x90
00ba194c	add x9,sp,#0x4c0
00ba1950	add x21,x10,#0x40
00ba1954	add x19,x9,x8
00ba1958	add x6,sp,#0x470
00ba195c	mov x3,x21
00ba1960	mov x7,x19
00ba1964	str x9,[sp, #0x470]
00ba1968	str w0,[sp, #0x10]
00ba196c	str w2,[sp, #0x18]
00ba1970	str x5,[sp, #0x8]
00ba1974	bl 0x00ba0b44
00ba1978	cbnz w0,0x00ba17cc
00ba197c	ldr w0,[sp, #0x10]
00ba1980	ldr x1,[sp, #0x68]
00ba1984	ldr w2,[sp, #0x18]
00ba1988	ldr x4,[sp, #0x58]
00ba198c	ldr x5,[sp, #0x8]
00ba1990	add x6,sp,#0x470
00ba1994	mov x3,x21
00ba1998	mov x7,x19
00ba199c	bl 0x00ba0b44
00ba19a0	cbnz w0,0x00ba19b0
00ba19a4	ldr x8,[sp, #0x470]
00ba19a8	cmp x8,x19
00ba19ac	b.ne 0x00ba17cc
00ba19b0	cbnz w0,0x00ba17cc
00ba19b4	nop
00ba19b8	adr x4,0xba1fc4
00ba19bc	add x0,sp,#0x90
00ba19c0	add x1,sp,#0x4c0
00ba19c4	mov w2,#0x200
00ba19c8	add x3,sp,#0x88
00ba19cc	mov x5,xzr
00ba19d0	str x21,[sp, #0x18]
00ba19d4	bl 0x00c425e0
00ba19d8	ldr x21,[sp, #0x28]
00ba19dc	mov w19,#0x1
00ba19e0	cbnz w0,0x00ba17d4
00ba19e4	ldr w9,[sp, #0x348]
00ba19e8	ldr x8,[sp, #0x88]
00ba19ec	adrp x11,0xcab000
00ba19f0	add x11,x11,#0x448
00ba19f4	sub w9,w19,w9
00ba19f8	ldr w0,[sp, #0x280]
00ba19fc	ldr w2,[sp, #0x34c]
00ba1a00	ldr x5,[x11, w9, UXTW #0x3]
00ba1a04	add x10,sp,#0x280
00ba1a08	add x9,sp,#0x4c0
00ba1a0c	add x21,x10,#0x40
00ba1a10	add x19,x9,x8
00ba1a14	add x6,sp,#0x470
00ba1a18	mov x1,x20
00ba1a1c	mov x3,x21
00ba1a20	mov x4,x23
00ba1a24	mov x7,x19
00ba1a28	str x9,[sp, #0x470]
00ba1a2c	str w0,[sp, #0x4]
00ba1a30	str w2,[sp, #0x10]
00ba1a34	str x5,[sp, #0x8]
00ba1a38	bl 0x00ba0b44
00ba1a3c	cbnz w0,0x00ba17cc
00ba1a40	ldr w0,[sp, #0x4]
00ba1a44	ldr w2,[sp, #0x10]
00ba1a48	ldr x5,[sp, #0x8]
00ba1a4c	add x6,sp,#0x470
00ba1a50	mov x1,x20
00ba1a54	mov x3,x21
00ba1a58	mov x4,x24
00ba1a5c	mov x7,x19
00ba1a60	bl 0x00ba0b44
00ba1a64	cbnz w0,0x00ba1a74
00ba1a68	ldr x8,[sp, #0x470]
00ba1a6c	cmp x8,x19
00ba1a70	b.ne 0x00ba17cc
00ba1a74	str x21,[sp, #0x10]
00ba1a78	cbnz w0,0x00ba17cc
00ba1a7c	nop
00ba1a80	adr x4,0xba1fc4
00ba1a84	add x0,sp,#0x90
00ba1a88	add x1,sp,#0x4c0
00ba1a8c	mov w2,#0x200
00ba1a90	add x3,sp,#0x88
00ba1a94	mov x5,xzr
00ba1a98	bl 0x00c425f0
00ba1a9c	cbnz w0,0x00ba17cc
00ba1aa0	ldr x2,[sp, #0x88]
00ba1aa4	add x0,sp,#0x280
00ba1aa8	add x1,sp,#0x4c0
00ba1aac	bl 0x00c425c0
00ba1ab0	cbnz w0,0x00ba17cc
00ba1ab4	nop
00ba1ab8	adr x4,0xba1fc4
00ba1abc	add x0,sp,#0x280
00ba1ac0	add x1,sp,#0x4a0
00ba1ac4	mov w2,#0x20
00ba1ac8	add x3,sp,#0x80
00ba1acc	mov x5,xzr
00ba1ad0	bl 0x00c42580
00ba1ad4	cbnz w0,0x00ba17cc
00ba1ad8	nop
00ba1adc	adr x4,0xba1fc4
00ba1ae0	add x0,sp,#0x280
00ba1ae4	add x1,sp,#0x4c0
00ba1ae8	mov w2,#0x200
00ba1aec	add x3,sp,#0x88
00ba1af0	mov x5,xzr
00ba1af4	bl 0x00c425f0
00ba1af8	cbnz w0,0x00ba17cc
00ba1afc	ldr x2,[sp, #0x88]
00ba1b00	add x0,sp,#0x90
00ba1b04	add x1,sp,#0x4c0
00ba1b08	bl 0x00c425c0
00ba1b0c	cbnz w0,0x00ba17cc
00ba1b10	nop
00ba1b14	adr x4,0xba1fc4
00ba1b18	add x0,sp,#0x90
00ba1b1c	add x1,sp,#0x4c0
00ba1b20	mov w2,#0x200
00ba1b24	add x3,sp,#0x88
00ba1b28	mov x5,xzr
00ba1b2c	bl 0x00c42580
00ba1b30	cbnz w0,0x00ba17cc
00ba1b34	ldp x8,x2,[sp, #0x80]
00ba1b38	cmp x2,x8
00ba1b3c	b.ne 0x00ba17cc
00ba1b40	add x0,sp,#0x4c0
00ba1b44	add x1,sp,#0x4a0
00ba1b48	bl 0x00c300b0
00ba1b4c	cbnz w0,0x00ba17cc
00ba1b50	ldr w8,[sp, #0x7c]
00ba1b54	cbz w8,0x00ba1b70
00ba1b58	adrp x0,0x77c000
00ba1b5c	add x0,x0,#0x87c
00ba1b60	bl 0x00c30760
00ba1b64	adrp x0,0x2c6000
00ba1b68	add x0,x0,#0x8db
00ba1b6c	bl 0x00c41af0
00ba1b70	adrp x1,0x787000
00ba1b74	add x1,x1,#0xadc
00ba1b78	mov w2,#0x20
00ba1b7c	mov x0,x26
00ba1b80	bl 0x00c41ca0
00ba1b84	ldr x21,[sp, #0x28]
00ba1b88	mov w19,w0
00ba1b8c	cbnz w0,0x00ba17d4
00ba1b90	adrp x1,0x787000
00ba1b94	add x1,x1,#0xafc
00ba1b98	mov w2,#0x20
00ba1b9c	mov x0,x27
00ba1ba0	bl 0x00c41ca0
00ba1ba4	mov w19,w0
00ba1ba8	cbnz w0,0x00ba17d4
00ba1bac	ldr x3,[sp, #0x10]
00ba1bb0	nop
00ba1bb4	adr x4,0xba226c
00ba1bb8	mov x0,x20
00ba1bbc	mov x1,x21
00ba1bc0	mov x2,x26
00ba1bc4	mov x5,xzr
00ba1bc8	bl 0x00c42700
00ba1bcc	mov w19,w0
00ba1bd0	cbnz w0,0x00ba17d4
00ba1bd4	ldr x3,[sp, #0x10]
00ba1bd8	nop
00ba1bdc	adr x4,0xba226c
00ba1be0	mov x0,x20
00ba1be4	mov x1,x22
00ba1be8	mov x2,x27
00ba1bec	mov x5,xzr
00ba1bf0	bl 0x00c42700
00ba1bf4	mov w19,w0
00ba1bf8	cbnz w0,0x00ba17d4
00ba1bfc	ldr x0,[sp, #0x38]
00ba1c00	adrp x1,0x787000
00ba1c04	add x1,x1,#0xb1c
00ba1c08	mov w2,#0x20
00ba1c0c	bl 0x00c41ca0
00ba1c10	mov w19,w0
00ba1c14	cbnz w0,0x00ba17d4
00ba1c18	ldr x0,[sp, #0x30]
00ba1c1c	adrp x1,0x787000
00ba1c20	add x1,x1,#0xb3c
00ba1c24	mov w2,#0x20
00ba1c28	bl 0x00c41ca0
00ba1c2c	mov w19,w0
00ba1c30	cbnz w0,0x00ba17d4
00ba1c34	ldr x0,[sp, #0x68]
00ba1c38	ldr x1,[sp, #0x50]
00ba1c3c	ldr x2,[sp, #0x38]
00ba1c40	ldr x3,[sp, #0x18]
00ba1c44	nop
00ba1c48	adr x4,0xba226c
00ba1c4c	mov x5,xzr
00ba1c50	bl 0x00c42700
00ba1c54	mov w19,w0
00ba1c58	cbnz w0,0x00ba17d4
00ba1c5c	ldr x0,[sp, #0x68]
00ba1c60	ldr x1,[sp, #0x48]
00ba1c64	ldr x2,[sp, #0x30]
00ba1c68	ldr x3,[sp, #0x18]
00ba1c6c	nop
00ba1c70	adr x4,0xba226c
00ba1c74	mov x5,xzr
00ba1c78	bl 0x00c42700
00ba1c7c	mov w19,w0
00ba1c80	cbnz w0,0x00ba17d4
00ba1c84	ldr w8,[sp, #0x158]
00ba1c88	mov w9,#0x1
00ba1c8c	ldr w0,[sp, #0x90]
00ba1c90	ldr w2,[sp, #0x15c]
00ba1c94	sub w8,w9,w8
00ba1c98	adrp x9,0xcab000
00ba1c9c	add x9,x9,#0x448
00ba1ca0	ldr x5,[x9, w8, UXTW #0x3]
00ba1ca4	adrp x8,0x787000
00ba1ca8	ldp x4,x1,[sp, #0x60]
00ba1cac	ldr x3,[sp, #0x18]
00ba1cb0	add x8,x8,#0xb5c
00ba1cb4	add x19,x8,#0x14a
00ba1cb8	add x6,sp,#0x470
00ba1cbc	mov x7,x19
00ba1cc0	str x8,[sp, #0x470]
00ba1cc4	stp w0,w2,[sp, #0x4]
00ba1cc8	mov x21,x5
00ba1ccc	bl 0x00ba0b44
00ba1cd0	cbnz w0,0x00ba17cc
00ba1cd4	ldp w0,w2,[sp, #0x4]
00ba1cd8	ldr x1,[sp, #0x68]
00ba1cdc	ldr x3,[sp, #0x18]
00ba1ce0	ldr x4,[sp, #0x58]
00ba1ce4	add x6,sp,#0x470
00ba1ce8	mov x5,x21
00ba1cec	mov x7,x19
00ba1cf0	bl 0x00ba0b44
00ba1cf4	cbnz w0,0x00ba1d10
00ba1cf8	ldr x8,[sp, #0x470]
00ba1cfc	adrp x9,0x787000
00ba1d00	add x9,x9,#0xb5c
00ba1d04	add x9,x9,#0x14a
00ba1d08	cmp x8,x9
00ba1d0c	b.ne 0x00ba17cc
00ba1d10	ldr x21,[sp, #0x28]
00ba1d14	mov w19,#0x1
00ba1d18	cbnz w0,0x00ba17d4
00ba1d1c	ldr w8,[sp, #0x348]
00ba1d20	adrp x9,0xcab000
00ba1d24	add x9,x9,#0x448
00ba1d28	ldr w0,[sp, #0x280]
00ba1d2c	sub w8,w19,w8
00ba1d30	ldr w2,[sp, #0x34c]
00ba1d34	ldr x5,[x9, w8, UXTW #0x3]
00ba1d38	adrp x8,0x787000
00ba1d3c	ldr x3,[sp, #0x10]
00ba1d40	add x8,x8,#0xca6
00ba1d44	add x19,x8,#0x14a
00ba1d48	add x6,sp,#0x470
00ba1d4c	mov x1,x20
00ba1d50	mov x4,x23
00ba1d54	mov x7,x19
00ba1d58	str x8,[sp, #0x470]
00ba1d5c	mov w21,w0
00ba1d60	str w2,[sp, #0x8]
00ba1d64	str x5,[sp, #0x18]
00ba1d68	bl 0x00ba0b44
00ba1d6c	cbnz w0,0x00ba17cc
00ba1d70	ldr w2,[sp, #0x8]
00ba1d74	ldp x3,x5,[sp, #0x10]
00ba1d78	add x6,sp,#0x470
00ba1d7c	mov w0,w21
00ba1d80	mov x1,x20
00ba1d84	mov x4,x24
00ba1d88	mov x7,x19
00ba1d8c	bl 0x00ba0b44
00ba1d90	cbnz w0,0x00ba1dac
00ba1d94	ldr x8,[sp, #0x470]
00ba1d98	adrp x9,0x787000
00ba1d9c	add x9,x9,#0xca6
00ba1da0	add x9,x9,#0x14a
00ba1da4	cmp x8,x9
00ba1da8	b.ne 0x00ba17cc
00ba1dac	cbnz w0,0x00ba17cc
00ba1db0	adrp x1,0x787000
00ba1db4	add x1,x1,#0xdf0
00ba1db8	add x0,sp,#0x280
00ba1dbc	mov w2,#0xa8
00ba1dc0	bl 0x00c425c0
00ba1dc4	cbnz w0,0x00ba17cc
00ba1dc8	adrp x1,0x787000
00ba1dcc	add x1,x1,#0xe98
00ba1dd0	add x0,sp,#0x90
00ba1dd4	mov w2,#0xa5
00ba1dd8	bl 0x00c425c0
00ba1ddc	cbnz w0,0x00ba17cc
00ba1de0	nop
00ba1de4	adr x4,0xba1fc4
00ba1de8	add x0,sp,#0x90
00ba1dec	add x1,sp,#0x4c0
00ba1df0	mov w2,#0x200
00ba1df4	add x3,sp,#0x88
00ba1df8	mov x5,xzr
00ba1dfc	bl 0x00c42580
00ba1e00	mov w19,#0x1
00ba1e04	cbnz w0,0x00ba1fb8
00ba1e08	ldr x8,[sp, #0x88]
00ba1e0c	ldr x21,[sp, #0x28]
00ba1e10	cmp x8,#0x20
00ba1e14	b.ne 0x00ba17d4
00ba1e18	adrp x1,0x787000
00ba1e1c	add x1,x1,#0xf3d
00ba1e20	add x0,sp,#0x4c0
00ba1e24	mov w2,#0x20
00ba1e28	bl 0x00c300b0
00ba1e2c	cbnz w0,0x00ba17cc
00ba1e30	add x0,sp,#0x470
00ba1e34	bl 0x00c42760
00ba1e38	nop
00ba1e3c	adr x2,0xba1fc4
00ba1e40	add x0,sp,#0x90
00ba1e44	add x1,sp,#0x470
00ba1e48	mov x3,xzr
00ba1e4c	bl 0x00ba1398
00ba1e50	mov w21,w0
00ba1e54	cbnz w0,0x00ba1e78
00ba1e58	ldr w2,[sp, #0x15c]
00ba1e5c	ldr x0,[sp, #0x68]
00ba1e60	add x1,sp,#0x470
00ba1e64	add x3,sp,#0x88
00ba1e68	add x4,sp,#0x4c0
00ba1e6c	mov w5,#0x200
00ba1e70	bl 0x00c42780
00ba1e74	mov w21,w0
00ba1e78	add x0,sp,#0x470
00ba1e7c	bl 0x00c42750
00ba1e80	mov w19,#0x1
00ba1e84	cbnz w21,0x00ba1fb8
00ba1e88	ldr x8,[sp, #0x88]
00ba1e8c	ldr x21,[sp, #0x28]
00ba1e90	cmp x8,#0x41
00ba1e94	b.ne 0x00ba17d4
00ba1e98	adrp x1,0x787000
00ba1e9c	add x1,x1,#0xf5d
00ba1ea0	add x0,sp,#0x4c0
00ba1ea4	mov w2,#0x41
00ba1ea8	bl 0x00c300b0
00ba1eac	cbnz w0,0x00ba17cc
00ba1eb0	add x0,sp,#0x4c0
00ba1eb4	mov w2,#0x41
00ba1eb8	mov w1,wzr
00ba1ebc	bl 0x00c301c0
00ba1ec0	nop
00ba1ec4	adr x4,0xba1fc4
00ba1ec8	add x0,sp,#0x280
00ba1ecc	add x1,sp,#0x4c0
00ba1ed0	mov w2,#0x200
00ba1ed4	add x3,sp,#0x88
00ba1ed8	mov x5,xzr
00ba1edc	bl 0x00c42580
00ba1ee0	mov w19,#0x1
00ba1ee4	cbnz w0,0x00ba1fb8
00ba1ee8	ldr x8,[sp, #0x88]
00ba1eec	ldr x21,[sp, #0x28]
00ba1ef0	cmp x8,#0x20
00ba1ef4	b.ne 0x00ba17d4
00ba1ef8	adrp x1,0x787000
00ba1efc	add x1,x1,#0xf3d
00ba1f00	add x0,sp,#0x4c0
00ba1f04	mov w2,#0x20
00ba1f08	bl 0x00c300b0
00ba1f0c	cbnz w0,0x00ba17cc
00ba1f10	add x0,sp,#0x470
00ba1f14	bl 0x00c42760
00ba1f18	nop
00ba1f1c	adr x2,0xba1fc4
00ba1f20	add x0,sp,#0x280
00ba1f24	add x1,sp,#0x470
00ba1f28	mov x3,xzr
00ba1f2c	bl 0x00ba1398
00ba1f30	mov w21,w0
00ba1f34	cbnz w0,0x00ba1f58
00ba1f38	ldr w2,[sp, #0x34c]
00ba1f3c	add x1,sp,#0x470
00ba1f40	add x3,sp,#0x88
00ba1f44	add x4,sp,#0x4c0
00ba1f48	mov w5,#0x200
00ba1f4c	mov x0,x20
00ba1f50	bl 0x00c42780
00ba1f54	mov w21,w0
00ba1f58	add x0,sp,#0x470
00ba1f5c	bl 0x00c42750
00ba1f60	mov w19,#0x1
00ba1f64	cbnz w21,0x00ba1fb8
00ba1f68	ldr x8,[sp, #0x88]
00ba1f6c	ldr x21,[sp, #0x28]
00ba1f70	cmp x8,#0x41
00ba1f74	b.ne 0x00ba17d4
00ba1f78	adrp x1,0x787000
00ba1f7c	add x1,x1,#0xf5d
00ba1f80	add x0,sp,#0x4c0
00ba1f84	mov w2,#0x41
00ba1f88	bl 0x00c300b0
00ba1f8c	cmp w0,#0x0
00ba1f90	cset w19,ne
00ba1f94	cbnz w0,0x00ba1fb8
00ba1f98	ldr w8,[sp, #0x7c]
00ba1f9c	ldr x21,[sp, #0x28]
00ba1fa0	cbz w8,0x00ba17d4
00ba1fa4	adrp x0,0x77c000
00ba1fa8	add x0,x0,#0x87c
00ba1fac	bl 0x00c30760
00ba1fb0	mov w19,wzr
00ba1fb4	b 0x00ba17d4
00ba1fb8	ldr x21,[sp, #0x28]
00ba1fbc	b 0x00ba17d4
00ba1fc0	bl 0x00c2fec0
