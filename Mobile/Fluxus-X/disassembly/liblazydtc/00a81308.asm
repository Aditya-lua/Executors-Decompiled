; OSSL_LIB_CTX_get0_global_default @ 00a81308
00a81308	stp x29,x30,[sp, #-0x10]!
00a8130c	adrp x0,0xd21000
00a81310	adrp x1,0xa81000
00a81314	add x0,x0,#0xd5c
00a81318	add x1,x1,#0x348
00a8131c	mov x29,sp
00a81320	bl 0x00c34d60
00a81324	adrp x8,0xd21000
00a81328	ldr w8,[x8, #0xd60]
00a8132c	cmp w8,#0x0
00a81330	adrp x8,0xd21000
00a81334	ccmp w0,#0x0,#0x4,ne
00a81338	add x8,x8,#0xb90
00a8133c	csel x0,x8,xzr,ne
00a81340	ldp x29,x30,[sp], #0x10
00a81344	ret
