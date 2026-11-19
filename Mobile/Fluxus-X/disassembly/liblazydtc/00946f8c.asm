; FUN_00946f8c @ 00946f8c
00946f8c	sub w8,w0,#0x5
00946f90	cmp w8,#0x3
00946f94	b.hi 0x00946fa8
00946f98	adrp x9,0x29c000
00946f9c	add x9,x9,#0x270
00946fa0	ldr w0,[x9, w8, SXTW #0x2]
00946fa4	ret
00946fa8	orr w0,wzr,#0x3
00946fac	ret
