; FUN_0085218c @ 0085218c
0085218c	adrp x8,0xd1e000
00852190	mov x9,#-0x1
00852194	stp xzr,xzr,[x0, #0x18]
00852198	ldr w8,[x8, #0xb80]
0085219c	stur x9,[x0, #0x4]
008521a0	stur x9,[x0, #0xc]
008521a4	str w8,[x0]
008521a8	ret
