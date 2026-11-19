; _INIT_139 @ 0087fabc
0087fabc	adrp x9,0xd1e000
0087fac0	adrp x8,0xd1e000
0087fac4	add x8,x8,#0xf28
0087fac8	ldr x10,[x9, #0xec0]
0087facc	adrp x11,0x2d4000
0087fad0	add x11,x11,#0xdfb
0087fad4	strh wzr,[x8]
0087fad8	stp x11,x10,[x8, #0x8]
0087fadc	adrp x10,0xd1e000
0087fae0	add x10,x10,#0xf48
0087fae4	adrp x11,0x2d7000
0087fae8	add x11,x11,#0xfd
0087faec	str wzr,[x8, #0x18]
0087faf0	strh wzr,[x10]
0087faf4	stp x11,x8,[x10, #0x8]
0087faf8	str wzr,[x10, #0x18]
0087fafc	str x10,[x9, #0xec0]
0087fb00	ret
