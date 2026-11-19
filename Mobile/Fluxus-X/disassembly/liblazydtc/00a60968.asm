; OSSL_ENCODER_up_ref @ 00a60968
00a60968	add x8,x0,#0x28
00a6096c	ldxr w9,[x8]
00a60970	add w9,w9,#0x1
00a60974	stxr w10,w9,[x8]
00a60978	cbnz w10,0x00a6096c
00a6097c	mov w0,#0x1
00a60980	ret
