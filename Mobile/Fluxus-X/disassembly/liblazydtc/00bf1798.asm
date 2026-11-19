; std::__ndk1::__money_put<char>::__gather_info @ 00bf1798
00bf1798	paciasp
00bf179c	sub sp,sp,#0x80
00bf17a0	stp x29,x30,[sp, #0x20]
00bf17a4	str x27,[sp, #0x30]
00bf17a8	stp x26,x25,[sp, #0x40]
00bf17ac	stp x24,x23,[sp, #0x50]
00bf17b0	stp x22,x21,[sp, #0x60]
00bf17b4	stp x20,x19,[sp, #0x70]
00bf17b8	add x29,sp,#0x20
00bf17bc	ldr x26,[x29, #0x60]
00bf17c0	ldr x21,[x2]
00bf17c4	mov x19,x7
00bf17c8	mov x20,x6
00bf17cc	mov x22,x5
00bf17d0	mov x23,x4
00bf17d4	mov x24,x3
00bf17d8	mov w25,w1
00bf17dc	tbz w0,#0x0,0x00bf1814
00bf17e0	adrp x27,0xcb5000
00bf17e4	ldr x27,[x27, #0xc20]
00bf17e8	stur x27,[x29, #-0x8]
00bf17ec	ldar x8,[x27]
00bf17f0	cmn x8,#0x1
00bf17f4	b.eq 0x00bf1854
00bf17f8	sub x8,x29,#0x8
00bf17fc	mov x9,sp
00bf1800	adrp x0,0xcb5000
00bf1804	str x8,[sp]
00bf1808	str x9,[x29, #0x18]
00bf180c	ldr x0,[x0, #0xc20]
00bf1810	b 0x00bf1844
00bf1814	adrp x27,0xcb5000
00bf1818	ldr x27,[x27, #0xc28]
00bf181c	stur x27,[x29, #-0x8]
00bf1820	ldar x8,[x27]
00bf1824	cmn x8,#0x1
00bf1828	b.eq 0x00bf1854
00bf182c	sub x8,x29,#0x8
00bf1830	mov x9,sp
00bf1834	adrp x0,0xcb5000
00bf1838	str x8,[sp]
00bf183c	str x9,[x29, #0x18]
00bf1840	ldr x0,[x0, #0xc28]
00bf1844	nop
00bf1848	adr x2,0xc0bab0
00bf184c	add x1,x29,#0x18
00bf1850	bl 0x00c305d0
00bf1854	ldp x8,x10,[x21, #0x10]
00bf1858	ldrsw x9,[x27, #0x8]
00bf185c	sub x9,x9,#0x1
00bf1860	sub x10,x10,x8
00bf1864	cmp x9,x10, ASR #0x3
00bf1868	b.cs 0x00bf19c0
00bf186c	ldr x21,[x8, x9, LSL #0x3]
00bf1870	cbz x21,0x00bf19c0
00bf1874	ldr x8,[x21]
00bf1878	tbz w25,#0x0,0x00bf1898
00bf187c	ldr x8,[x8, #0x58]
00bf1880	mov x0,x21
00bf1884	blr x8
00bf1888	str w0,[x24]
00bf188c	ldr x8,[x21]
00bf1890	ldr x9,[x8, #0x40]
00bf1894	b 0x00bf18b0
00bf1898	ldr x8,[x8, #0x50]
00bf189c	mov x0,x21
00bf18a0	blr x8
00bf18a4	str w0,[x24]
00bf18a8	ldr x8,[x21]
00bf18ac	ldr x9,[x8, #0x38]
00bf18b0	mov x8,sp
00bf18b4	mov x0,x21
00bf18b8	blr x9
00bf18bc	ldrb w8,[x26]
00bf18c0	tbz w8,#0x0,0x00bf18d4
00bf18c4	ldr x8,[x26]
00bf18c8	ldr x0,[x26, #0x10]
00bf18cc	and x1,x8,#-0x2
00bf18d0	bl 0x00c2fe80
00bf18d4	ldr q0,[sp]
00bf18d8	ldr x8,[sp, #0x10]
00bf18dc	mov x0,x21
00bf18e0	str q0,[x26]
00bf18e4	str x8,[x26, #0x10]
00bf18e8	ldr x8,[x21]
00bf18ec	ldr x8,[x8, #0x18]
00bf18f0	blr x8
00bf18f4	strb w0,[x23]
00bf18f8	mov x0,x21
00bf18fc	ldr x8,[x21]
00bf1900	ldr x8,[x8, #0x20]
00bf1904	blr x8
00bf1908	strb w0,[x22]
00bf190c	mov x0,x21
00bf1910	ldr x8,[x21]
00bf1914	ldr x9,[x8, #0x28]
00bf1918	mov x8,sp
00bf191c	blr x9
00bf1920	ldrb w8,[x20]
00bf1924	tbz w8,#0x0,0x00bf1938
00bf1928	ldr x8,[x20]
00bf192c	ldr x0,[x20, #0x10]
00bf1930	and x1,x8,#-0x2
00bf1934	bl 0x00c2fe80
00bf1938	ldr q0,[sp]
00bf193c	ldr x8,[sp, #0x10]
00bf1940	mov x0,x21
00bf1944	str q0,[x20]
00bf1948	str x8,[x20, #0x10]
00bf194c	ldr x8,[x21]
00bf1950	ldr x9,[x8, #0x30]
00bf1954	mov x8,sp
00bf1958	blr x9
00bf195c	ldrb w8,[x19]
00bf1960	tbz w8,#0x0,0x00bf1974
00bf1964	ldr x8,[x19]
00bf1968	ldr x0,[x19, #0x10]
00bf196c	and x1,x8,#-0x2
00bf1970	bl 0x00c2fe80
00bf1974	ldr q0,[sp]
00bf1978	ldr x8,[sp, #0x10]
00bf197c	mov x0,x21
00bf1980	str q0,[x19]
00bf1984	str x8,[x19, #0x10]
00bf1988	ldr x19,[x29, #0x68]
00bf198c	ldr x8,[x21]
00bf1990	ldr x8,[x8, #0x48]
00bf1994	blr x8
00bf1998	str w0,[x19]
00bf199c	ldp x20,x19,[sp, #0x70]
00bf19a0	ldr x27,[sp, #0x30]
00bf19a4	ldp x22,x21,[sp, #0x60]
00bf19a8	ldp x24,x23,[sp, #0x50]
00bf19ac	ldp x26,x25,[sp, #0x40]
00bf19b0	ldp x29,x30,[sp, #0x20]
00bf19b4	add sp,sp,#0x80
00bf19b8	autiasp
00bf19bc	ret
00bf19c0	bl 0x00bd8968
