; _INIT_137 @ 0087cb30
0087cb30	adrp x9,0xd1e000
0087cb34	adrp x8,0xd1e000
0087cb38	add x8,x8,#0xee8
0087cb3c	ldr x10,[x9, #0xec0]
0087cb40	adrp x11,0x2b6000
0087cb44	add x11,x11,#0xcf6
0087cb48	strh wzr,[x8]
0087cb4c	str wzr,[x8, #0x18]
0087cb50	stp x11,x10,[x8, #0x8]
0087cb54	str x8,[x9, #0xec0]
0087cb58	ret
