; OCSP_cert_status_str @ 00ab1814
00ab1814	cmp x0,#0x2
00ab1818	b.hi 0x00ab1830
00ab181c	adrp x8,0xc7a000
00ab1820	add x8,x8,#0xc40
00ab1824	ldr x8,[x8, x0, LSL #0x3]
00ab1828	ldr x0,[x8, #0x8]
00ab182c	ret
00ab1830	adrp x0,0x2a2000
00ab1834	add x0,x0,#0xb33
00ab1838	ret
