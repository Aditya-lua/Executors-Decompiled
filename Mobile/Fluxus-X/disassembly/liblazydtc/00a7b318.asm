; EVP_SIGNATURE_up_ref @ 00a7b318
00a7b318	add x8,x0,#0x20
00a7b31c	ldxr w9,[x8]
00a7b320	add w9,w9,#0x1
00a7b324	stxr w10,w9,[x8]
00a7b328	cbnz w10,0x00a7b31c
00a7b32c	mov w0,#0x1
00a7b330	ret
