; FUN_00bcb260 @ 00bcb260
00bcb260	bti c
00bcb264	nop
00bcb268	adr x8,0xcca5e0
00bcb26c	cmp w1,#0xfff
00bcb270	nop
00bcb274	adr x9,0xcca5e8
00bcb278	mov w0,w1
00bcb27c	csel x1,x9,x8,gt
00bcb280	ret
