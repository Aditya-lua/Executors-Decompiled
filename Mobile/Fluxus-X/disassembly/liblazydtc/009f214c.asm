; ASN1_tag2str @ 009f214c
009f214c	orr w8,w0,#0x8
009f2150	and w9,w0,#0xfffffeff
009f2154	cmp w8,#0x10a
009f2158	csel w8,w9,w0,eq
009f215c	cmp w8,#0x1e
009f2160	b.ls 0x009f2170
009f2164	adrp x0,0x2bd000
009f2168	add x0,x0,#0x7d6
009f216c	ret
009f2170	adrp x9,0xc58000
009f2174	add x9,x9,#0x948
009f2178	ldr x0,[x9, w8, SXTW #0x3]
009f217c	ret
