; ZSTD_loadDEntropy @ 00bb1734
00bb1734	sub sp,sp,#0xe0
00bb1738	stp x29,x30,[sp, #0x90]
00bb173c	str x25,[sp, #0xa0]
00bb1740	stp x24,x23,[sp, #0xb0]
00bb1744	stp x22,x21,[sp, #0xc0]
00bb1748	stp x20,x19,[sp, #0xd0]
00bb174c	add x29,sp,#0x90
00bb1750	mrs x23,tpidr_el0
00bb1754	ldr x8,[x23, #0x28]
00bb1758	cmp x2,#0x9
00bb175c	stur x8,[x29, #-0x8]
00bb1760	b.cc 0x00bb190c
00bb1764	mov x20,x0
00bb1768	add x22,x1,#0x8
00bb176c	mov w8,#0x2818
00bb1770	mov x21,x2
00bb1774	mov x19,x1
00bb1778	sub x2,x2,#0x8
00bb177c	add x0,x0,x8
00bb1780	mov x1,x22
00bb1784	mov x3,x20
00bb1788	mov w4,#0x2818
00bb178c	mov w5,wzr
00bb1790	bl 0x00c43520
00bb1794	cmn x0,#0x78
00bb1798	b.hi 0x00bb190c
00bb179c	add x24,x19,x21
00bb17a0	add x21,x22,x0
00bb17a4	mov w8,#0x1f
00bb17a8	sub x4,x24,x21
00bb17ac	add x0,sp,#0x1e
00bb17b0	add x1,sp,#0x18
00bb17b4	add x2,sp,#0x14
00bb17b8	mov x3,x21
00bb17bc	str w8,[sp, #0x18]
00bb17c0	bl 0x00c436e0
00bb17c4	cmn x0,#0x78
00bb17c8	b.hi 0x00bb190c
00bb17cc	ldr w2,[sp, #0x18]
00bb17d0	cmp w2,#0x1f
00bb17d4	b.hi 0x00bb190c
00bb17d8	ldr w5,[sp, #0x14]
00bb17dc	cmp w5,#0x9
00bb17e0	b.cs 0x00bb190c
00bb17e4	mov w8,#0x1008
00bb17e8	mov w22,#0x6828
00bb17ec	adrp x3,0x788000
00bb17f0	add x3,x3,#0xf34
00bb17f4	adrp x4,0x788000
00bb17f8	add x4,x4,#0xfb4
00bb17fc	mov x25,x0
00bb1800	add x0,x20,x8
00bb1804	add x1,sp,#0x1e
00bb1808	add x6,x20,x22
00bb180c	mov w7,#0x274
00bb1810	str wzr,[sp]
00bb1814	bl 0x00c436f0
00bb1818	add x21,x21,x25
00bb181c	mov w8,#0x34
00bb1820	add x0,sp,#0x1e
00bb1824	sub x4,x24,x21
00bb1828	add x1,sp,#0x18
00bb182c	add x2,sp,#0x14
00bb1830	mov x3,x21
00bb1834	str w8,[sp, #0x18]
00bb1838	bl 0x00c436e0
00bb183c	cmn x0,#0x78
00bb1840	b.hi 0x00bb190c
00bb1844	ldr w2,[sp, #0x18]
00bb1848	cmp w2,#0x34
00bb184c	b.hi 0x00bb190c
00bb1850	ldr w5,[sp, #0x14]
00bb1854	cmp w5,#0xa
00bb1858	b.cs 0x00bb190c
00bb185c	mov w8,#0x1810
00bb1860	adrp x3,0x788000
00bb1864	add x3,x3,#0xfd4
00bb1868	adrp x4,0x789000
00bb186c	add x4,x4,#0xa8
00bb1870	mov x25,x0
00bb1874	add x0,x20,x8
00bb1878	add x1,sp,#0x1e
00bb187c	add x6,x20,x22
00bb1880	mov w7,#0x274
00bb1884	str wzr,[sp]
00bb1888	bl 0x00c436f0
00bb188c	add x21,x21,x25
00bb1890	mov w8,#0x23
00bb1894	add x0,sp,#0x1e
00bb1898	sub x4,x24,x21
00bb189c	add x1,sp,#0x18
00bb18a0	add x2,sp,#0x14
00bb18a4	mov x3,x21
00bb18a8	str w8,[sp, #0x18]
00bb18ac	bl 0x00c436e0
00bb18b0	cmn x0,#0x78
00bb18b4	b.hi 0x00bb190c
00bb18b8	ldr w2,[sp, #0x18]
00bb18bc	cmp w2,#0x23
00bb18c0	b.hi 0x00bb190c
00bb18c4	ldr w5,[sp, #0x14]
00bb18c8	cmp w5,#0xa
00bb18cc	b.cs 0x00bb190c
00bb18d0	adrp x3,0x789000
00bb18d4	add x3,x3,#0xe0
00bb18d8	adrp x4,0x789000
00bb18dc	add x4,x4,#0x170
00bb18e0	add x1,sp,#0x1e
00bb18e4	add x6,x20,x22
00bb18e8	mov x22,x0
00bb18ec	mov x0,x20
00bb18f0	mov w7,#0x274
00bb18f4	str wzr,[sp]
00bb18f8	bl 0x00c436f0
00bb18fc	add x8,x21,x22
00bb1900	add x9,x8,#0xc
00bb1904	cmp x9,x24
00bb1908	b.ls 0x00bb193c
00bb190c	mov x0,#-0x1e
00bb1910	ldr x8,[x23, #0x28]
00bb1914	ldur x9,[x29, #-0x8]
00bb1918	cmp x8,x9
00bb191c	b.ne 0x00bb1990
00bb1920	ldp x20,x19,[sp, #0xd0]
00bb1924	ldr x25,[sp, #0xa0]
00bb1928	ldp x22,x21,[sp, #0xc0]
00bb192c	ldp x24,x23,[sp, #0xb0]
00bb1930	ldp x29,x30,[sp, #0x90]
00bb1934	add sp,sp,#0xe0
00bb1938	ret
00bb193c	ldr w11,[x8]
00bb1940	mov x0,#-0x1e
00bb1944	cbz w11,0x00bb1910
00bb1948	sub x10,x24,x9
00bb194c	cmp x10,x11
00bb1950	b.cc 0x00bb1910
00bb1954	add x9,x20,#0x6, LSL #12
00bb1958	str w11,[x9, #0x81c]
00bb195c	ldr w11,[x8, #0x4]
00bb1960	cbz w11,0x00bb1910
00bb1964	cmp x10,x11
00bb1968	b.cc 0x00bb1910
00bb196c	str w11,[x9, #0x820]
00bb1970	ldr w11,[x8, #0x8]
00bb1974	cbz w11,0x00bb1910
00bb1978	cmp x10,x11
00bb197c	b.cc 0x00bb1910
00bb1980	sub x8,x8,x19
00bb1984	str w11,[x9, #0x824]
00bb1988	add x0,x8,#0xc
00bb198c	b 0x00bb1910
00bb1990	bl 0x00c2fec0
