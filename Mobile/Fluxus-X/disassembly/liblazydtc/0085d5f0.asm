; FUN_0085d5f0 @ 0085d5f0
0085d5f0	ldr w8,[x0]
0085d5f4	sub w8,w8,#0x10e
0085d5f8	cmp w8,#0x8
0085d5fc	cset w9,cc
0085d600	csel w8,w8,wzr,cc
0085d604	orr x0,x8,x9, LSL #0x20
0085d608	ret
