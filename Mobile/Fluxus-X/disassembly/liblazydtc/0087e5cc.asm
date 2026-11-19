; FUN_0087e5cc @ 0087e5cc
0087e5cc	adrp x8,0x363000
0087e5d0	add x8,x8,#0x620
0087e5d4	adrp x9,0x363000
0087e5d8	add x9,x9,#0xa88
0087e5dc	ldr x8,[x8, w0, SXTW #0x3]
0087e5e0	adrp x10,0x363000
0087e5e4	add x10,x10,#0xef0
0087e5e8	ldr x9,[x9, w0, SXTW #0x3]
0087e5ec	ldr x1,[x10, w0, SXTW #0x3]
0087e5f0	orr x0,x9,x8
0087e5f4	ret
