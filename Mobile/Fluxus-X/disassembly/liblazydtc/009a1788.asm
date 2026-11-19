; WebSocketHandshakeKeyGen::static_for<15,WebSocketHandshakeKeyGen::Sha1Loop<5>>::operator() @ 009a1788
009a1788	sub sp,sp,#0x40
009a178c	str x21,[sp, #0x10]
009a1790	stp x20,x19,[sp, #0x20]
009a1794	stp x29,x30,[sp, #0x30]
009a1798	add x29,sp,#0x30
009a179c	mrs x21,tpidr_el0
009a17a0	ldr x8,[x21, #0x28]
009a17a4	mov x0,sp
009a17a8	mov x20,x2
009a17ac	mov x19,x1
009a17b0	str x8,[sp, #0x8]
009a17b4	bl 0x00c33a60
009a17b8	ldr w8,[x20, #0x10]
009a17bc	ldr w9,[x20, #0x3c]
009a17c0	ldr w10,[x20, #0x24]
009a17c4	ldr w11,[x20, #0x1c]
009a17c8	eor w8,w9,w8
009a17cc	eor w8,w8,w10
009a17d0	eor w8,w8,w11
009a17d4	ror w9,w8,#0x1f
009a17d8	str w9,[x20, #0x1c]
009a17dc	ldp w12,w10,[x19, #0xc]
009a17e0	ldp w14,w11,[x19, #0x4]
009a17e4	ldr w13,[x19]
009a17e8	mov w8,#0xc1d6
009a17ec	eor w12,w12,w10
009a17f0	eor w11,w12,w11
009a17f4	add w9,w9,w11
009a17f8	ror w13,w13,#0x1b
009a17fc	add w9,w9,w14
009a1800	movk w8,#0xca62, LSL #16
009a1804	add w9,w9,w13
009a1808	ror w10,w10,#0x2
009a180c	add w9,w9,w8
009a1810	str w10,[x19, #0x10]
009a1814	str w9,[x19, #0x4]
009a1818	ldr w9,[x20, #0x14]
009a181c	ldr w10,[x20]
009a1820	ldr w11,[x20, #0x28]
009a1824	ldr w12,[x20, #0x20]
009a1828	eor w9,w10,w9
009a182c	eor w9,w9,w11
009a1830	eor w9,w9,w12
009a1834	ror w9,w9,#0x1f
009a1838	str w9,[x20, #0x20]
009a183c	ldp w10,w13,[x19]
009a1840	ldp w12,w11,[x19, #0xc]
009a1844	ldr w14,[x19, #0x8]
009a1848	eor w11,w11,w10
009a184c	eor w11,w11,w12
009a1850	add w9,w9,w11
009a1854	ror w12,w13,#0x1b
009a1858	add w9,w9,w14
009a185c	add w9,w9,w12
009a1860	ror w10,w10,#0x2
009a1864	add w9,w9,w8
009a1868	str w10,[x19]
009a186c	str w9,[x19, #0x8]
009a1870	ldr w9,[x20, #0x18]
009a1874	ldr w10,[x20, #0x4]
009a1878	ldr w11,[x20, #0x2c]
009a187c	ldr w12,[x20, #0x24]
009a1880	eor w9,w10,w9
009a1884	eor w9,w9,w11
009a1888	eor w9,w9,w12
009a188c	ror w9,w9,#0x1f
009a1890	str w9,[x20, #0x24]
009a1894	ldp w10,w11,[x19]
009a1898	ldr w12,[x19, #0x10]
009a189c	eor w10,w10,w11
009a18a0	eor w10,w10,w12
009a18a4	ldp w13,w12,[x19, #0x8]
009a18a8	add w9,w9,w10
009a18ac	ror w11,w11,#0x2
009a18b0	str w11,[x19, #0x4]
009a18b4	ror w13,w13,#0x1b
009a18b8	add w9,w9,w12
009a18bc	add w9,w9,w13
009a18c0	add w9,w9,w8
009a18c4	str w9,[x19, #0xc]
009a18c8	ldr w9,[x20, #0x1c]
009a18cc	ldr w10,[x20, #0x8]
009a18d0	ldr w11,[x20, #0x30]
009a18d4	ldr w12,[x20, #0x28]
009a18d8	eor w9,w10,w9
009a18dc	eor w9,w9,w11
009a18e0	eor w9,w9,w12
009a18e4	ror w9,w9,#0x1f
009a18e8	str w9,[x20, #0x28]
009a18ec	ldp w10,w11,[x19, #0x4]
009a18f0	ldr w13,[x19]
009a18f4	ldp w12,w14,[x19, #0xc]
009a18f8	eor w10,w10,w11
009a18fc	eor w10,w10,w13
009a1900	add w9,w9,w10
009a1904	ror w12,w12,#0x1b
009a1908	add w9,w9,w14
009a190c	add w9,w9,w12
009a1910	ror w11,w11,#0x2
009a1914	add w8,w9,w8
009a1918	str w11,[x19, #0x8]
009a191c	str w8,[x19, #0x10]
009a1920	ldr x8,[x21, #0x28]
009a1924	ldr x9,[sp, #0x8]
009a1928	cmp x8,x9
009a192c	b.ne 0x009a1944
009a1930	ldp x29,x30,[sp, #0x30]
009a1934	ldp x20,x19,[sp, #0x20]
009a1938	ldr x21,[sp, #0x10]
009a193c	add sp,sp,#0x40
009a1940	ret
009a1944	bl 0x00c2fec0
