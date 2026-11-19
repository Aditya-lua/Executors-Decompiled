; EVP_KDF_up_ref @ 00a64714
00a64714	add x8,x0,#0x20
00a64718	ldxr w9,[x8]
00a6471c	add w9,w9,#0x1
00a64720	stxr w10,w9,[x8]
00a64724	cbnz w10,0x00a64718
00a64728	mov w0,#0x1
00a6472c	ret
