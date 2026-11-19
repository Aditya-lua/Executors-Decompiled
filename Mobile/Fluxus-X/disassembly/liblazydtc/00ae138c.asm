; SHA384_Init @ 00ae138c
00ae138c	adrp x9,0x29d000
00ae1390	ldr q0,[x9, #0x250]
00ae1394	adrp x9,0x29d000
00ae1398	ldr q1,[x9, #0x130]
00ae139c	adrp x9,0x29c000
00ae13a0	ldr q2,[x9, #0x7f0]
00ae13a4	adrp x9,0x29c000
00ae13a8	stp q0,q1,[x0]
00ae13ac	ldr q0,[x9, #0x390]
00ae13b0	orr x9,xzr,#0x3000000000
00ae13b4	mov x8,x0
00ae13b8	str x9,[x0, #0xd0]
00ae13bc	mov w0,#0x1
00ae13c0	stp q2,q0,[x8, #0x20]
00ae13c4	stp xzr,xzr,[x8, #0x40]
00ae13c8	ret
