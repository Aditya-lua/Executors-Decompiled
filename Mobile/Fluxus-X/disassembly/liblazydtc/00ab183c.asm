; OCSP_crl_reason_str @ 00ab183c
00ab183c	cmp x0,#0x8
00ab1840	b.hi 0x00ab1860
00ab1844	and x8,x0,#0xffff
00ab1848	mov w9,#0x17f
00ab184c	lsr w8,w9,w8
00ab1850	tbnz w8,#0x0,0x00ab186c
00ab1854	adrp x0,0x2a2000
00ab1858	add x0,x0,#0xb33
00ab185c	ret
00ab1860	adrp x0,0x2a2000
00ab1864	add x0,x0,#0xb33
00ab1868	ret
00ab186c	adrp x8,0xc7a000
00ab1870	add x8,x8,#0xc60
00ab1874	ldr x8,[x8, x0, LSL #0x3]
00ab1878	ldr x0,[x8, #0x8]
00ab187c	ret
