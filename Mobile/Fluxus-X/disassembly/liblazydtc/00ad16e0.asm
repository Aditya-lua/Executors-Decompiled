; ossl_ifc_ffc_compute_security_bits @ 00ad16e0
00ad16e0	mov w8,#0x17ff
00ad16e4	cmp w0,w8
00ad16e8	b.le 0x00ad1718
00ad16ec	cmp w0,#0x2, LSL #12
00ad16f0	b.ge 0x00ad173c
00ad16f4	orr w8,wzr,#0x1800
00ad16f8	cmp w0,w8
00ad16fc	b.eq 0x00ad1764
00ad1700	orr w8,wzr,#0x1e00
00ad1704	cmp w0,w8
00ad1708	b.ne 0x00ad1788
00ad170c	orr w8,wzr,#0xc0
00ad1710	mov w0,w8
00ad1714	ret
00ad1718	cmp w0,#0x800
00ad171c	b.eq 0x00ad1758
00ad1720	cmp w0,#0xc00
00ad1724	b.eq 0x00ad1770
00ad1728	cmp w0,#0x1, LSL #12
00ad172c	b.ne 0x00ad1788
00ad1730	mov w8,#0x98
00ad1734	mov w0,w8
00ad1738	ret
00ad173c	b.eq 0x00ad177c
00ad1740	orr w8,wzr,#0x3c00
00ad1744	cmp w0,w8
00ad1748	b.ne 0x00ad1788
00ad174c	mov w8,#0x100
00ad1750	mov w0,w8
00ad1754	ret
00ad1758	orr w8,wzr,#0x70
00ad175c	mov w0,w8
00ad1760	ret
00ad1764	mov w8,#0xb0
00ad1768	mov w0,w8
00ad176c	ret
00ad1770	mov w8,#0x80
00ad1774	mov w0,w8
00ad1778	ret
00ad177c	mov w8,#0xc8
00ad1780	mov w0,w8
00ad1784	ret
00ad1788	mov w8,#0x7e78
00ad178c	movk w8,#0xa, LSL #16
00ad1790	cmp w0,w8
00ad1794	b.le 0x00ad17a4
00ad1798	mov w8,#0x4b0
00ad179c	mov w0,w8
00ad17a0	ret
00ad17a4	cmp w0,#0x8
00ad17a8	mov w8,wzr
00ad17ac	b.lt 0x00ad1aa4
00ad17b0	mov w8,#0xc5c8
00ad17b4	mov w9,#0x3c01
00ad17b8	movk w8,#0x2, LSL #16
00ad17bc	mov w10,#0x4b0
00ad17c0	mov w12,#0x100
00ad17c4	mov w13,#0x1e01
00ad17c8	cmp w0,w9
00ad17cc	orr w14,wzr,#0xc0
00ad17d0	smull x11,w0,w8
00ad17d4	csel w9,w12,w10,lt
00ad17d8	cmp w0,w13
00ad17dc	csel w9,w14,w9,lt
00ad17e0	cmp x11,#0x80, LSL #12
00ad17e4	b.cc 0x00ad1808
00ad17e8	mov w13,wzr
00ad17ec	mov x10,x11
00ad17f0	lsr x12,x10,#0x1
00ad17f4	lsr x14,x10,#0x14
00ad17f8	add w13,w13,#0x40, LSL #12
00ad17fc	mov x10,x12
00ad1800	cbnz x14,0x00ad17f0
00ad1804	b 0x00ad1810
00ad1808	mov w13,wzr
00ad180c	mov x12,x11
00ad1810	mul x14,x12,x12
00ad1814	lsr x15,x14,#0x25
00ad1818	mov w12,#0x12
00ad181c	cmp x15,#0x0
00ad1820	cinc x15,x12,ne
00ad1824	lsr x14,x14,x15
00ad1828	cset w15,ne
00ad182c	mul x14,x14,x14
00ad1830	add w13,w13,w15, LSL #0x11
00ad1834	lsr x15,x14,#0x25
00ad1838	cmp x15,#0x0
00ad183c	cinc x15,x12,ne
00ad1840	lsr x14,x14,x15
00ad1844	cset w15,ne
00ad1848	mul x14,x14,x14
00ad184c	add w13,w13,w15, LSL #0x10
00ad1850	lsr x15,x14,#0x25
00ad1854	cmp x15,#0x0
00ad1858	cinc x15,x12,ne
00ad185c	lsr x14,x14,x15
00ad1860	cset w15,ne
00ad1864	mul x14,x14,x14
00ad1868	add w13,w13,w15, LSL #0xf
00ad186c	lsr x15,x14,#0x25
00ad1870	cmp x15,#0x0
00ad1874	cinc x15,x12,ne
00ad1878	lsr x14,x14,x15
00ad187c	cset w15,ne
00ad1880	mul x14,x14,x14
00ad1884	add w13,w13,w15, LSL #0xe
00ad1888	lsr x15,x14,#0x25
00ad188c	cmp x15,#0x0
00ad1890	cinc x15,x12,ne
00ad1894	lsr x14,x14,x15
00ad1898	cset w15,ne
00ad189c	mul x14,x14,x14
00ad18a0	add w13,w13,w15, LSL #0xd
00ad18a4	lsr x15,x14,#0x25
00ad18a8	cmp x15,#0x0
00ad18ac	cinc x15,x12,ne
00ad18b0	lsr x14,x14,x15
00ad18b4	cset w15,ne
00ad18b8	mul x14,x14,x14
00ad18bc	add w13,w13,w15, LSL #0xc
00ad18c0	lsr x15,x14,#0x25
00ad18c4	cmp x15,#0x0
00ad18c8	cinc x15,x12,ne
00ad18cc	lsr x14,x14,x15
00ad18d0	cset w15,ne
00ad18d4	mul x14,x14,x14
00ad18d8	add w13,w13,w15, LSL #0xb
00ad18dc	lsr x15,x14,#0x25
00ad18e0	cmp x15,#0x0
00ad18e4	cinc x15,x12,ne
00ad18e8	lsr x14,x14,x15
00ad18ec	cset w15,ne
00ad18f0	mul x14,x14,x14
00ad18f4	add w13,w13,w15, LSL #0xa
00ad18f8	lsr x15,x14,#0x25
00ad18fc	cmp x15,#0x0
00ad1900	cinc x15,x12,ne
00ad1904	lsr x14,x14,x15
00ad1908	cset w15,ne
00ad190c	mul x14,x14,x14
00ad1910	add w13,w13,w15, LSL #0x9
00ad1914	lsr x15,x14,#0x25
00ad1918	cmp x15,#0x0
00ad191c	cinc x15,x12,ne
00ad1920	lsr x14,x14,x15
00ad1924	cset w15,ne
00ad1928	mul x14,x14,x14
00ad192c	add w13,w13,w15, LSL #0x8
00ad1930	lsr x15,x14,#0x25
00ad1934	cmp x15,#0x0
00ad1938	cinc x15,x12,ne
00ad193c	lsr x14,x14,x15
00ad1940	cset w15,ne
00ad1944	mul x14,x14,x14
00ad1948	add w13,w13,w15, LSL #0x7
00ad194c	lsr x15,x14,#0x25
00ad1950	cmp x15,#0x0
00ad1954	cinc x15,x12,ne
00ad1958	lsr x14,x14,x15
00ad195c	cset w15,ne
00ad1960	mul x14,x14,x14
00ad1964	add w13,w13,w15, LSL #0x6
00ad1968	lsr x15,x14,#0x25
00ad196c	cmp x15,#0x0
00ad1970	cinc x15,x12,ne
00ad1974	lsr x14,x14,x15
00ad1978	cset w15,ne
00ad197c	mul x14,x14,x14
00ad1980	add w13,w13,w15, LSL #0x5
00ad1984	lsr x15,x14,#0x25
00ad1988	cmp x15,#0x0
00ad198c	cinc x15,x12,ne
00ad1990	lsr x14,x14,x15
00ad1994	cset w15,ne
00ad1998	mul x14,x14,x14
00ad199c	add w13,w13,w15, LSL #0x4
00ad19a0	lsr x15,x14,#0x25
00ad19a4	cmp x15,#0x0
00ad19a8	cinc x15,x12,ne
00ad19ac	lsr x14,x14,x15
00ad19b0	cset w15,ne
00ad19b4	mul x14,x14,x14
00ad19b8	add w13,w13,w15, LSL #0x3
00ad19bc	lsr x15,x14,#0x25
00ad19c0	cmp x15,#0x0
00ad19c4	cinc x15,x12,ne
00ad19c8	lsr x14,x14,x15
00ad19cc	cset w15,ne
00ad19d0	mul x14,x14,x14
00ad19d4	add w13,w13,w15, LSL #0x2
00ad19d8	lsr x15,x14,#0x25
00ad19dc	cmp x15,#0x0
00ad19e0	cinc x12,x12,ne
00ad19e4	lsr x12,x14,x12
00ad19e8	cset w14,ne
00ad19ec	mul x12,x12,x12
00ad19f0	add w13,w13,w14, LSL #0x1
00ad19f4	mov x14,#0xc279
00ad19f8	lsr x12,x12,#0x25
00ad19fc	movk x14,#0xae0f, LSL #16
00ad1a00	cmp x12,#0x0
00ad1a04	movk x14,#0x1908, LSL #32
00ad1a08	cinc w12,w13,ne
00ad1a0c	movk x14,#0x58b9, LSL #48
00ad1a10	lsl x12,x12,#0x12
00ad1a14	umulh x12,x12,x14
00ad1a18	lsr x12,x12,#0x11
00ad1a1c	mul x11,x12,x11
00ad1a20	lsr x11,x11,#0x12
00ad1a24	mul x11,x11,x12
00ad1a28	mov x10,xzr
00ad1a2c	lsr x11,x11,#0x12
00ad1a30	mov w12,#0x42
00ad1a34	mov w14,#0x1
00ad1a38	bfm x14,x10,#0x3f,#0x3e
00ad1a3c	lsl x13,x10,#0x1
00ad1a40	mul x10,x10,x14
00ad1a44	sub x12,x12,#0x3
00ad1a48	mov w15,#0x1
00ad1a4c	add x10,x10,x10, LSL #0x1
00ad1a50	lsr x16,x11,x12
00ad1a54	bfm x15,x10,#0x3f,#0x3e
00ad1a58	lsl x17,x15,x12
00ad1a5c	cmp x16,x15
00ad1a60	csel x10,x13,x14,cc
00ad1a64	csel x13,xzr,x17,cc
00ad1a68	cmp x12,#0x2
00ad1a6c	sub x11,x11,x13
00ad1a70	b.hi 0x00ad1a34
00ad1a74	mov w11,#0x6000
00ad1a78	movk w11,#0x7b12, LSL #16
00ad1a7c	mov x12,#-0xc28f
00ad1a80	movk x12,#0xffed, LSL #16
00ad1a84	mul x10,x10,x11
00ad1a88	add x10,x12,x10, LSR #0x12
00ad1a8c	udiv x8,x10,x8
00ad1a90	add w8,w8,#0x4
00ad1a94	and w10,w8,#0xfffffff8
00ad1a98	and w8,w8,#0xfff8
00ad1a9c	cmp w8,w9, UXTH 
00ad1aa0	csel w8,w9,w10,hi
00ad1aa4	mov w0,w8
00ad1aa8	ret
