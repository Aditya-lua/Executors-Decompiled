; EVP_ASYM_CIPHER_up_ref @ 00a563c4
00a563c4	add x8,x0,#0x20
00a563c8	ldxr w9,[x8]
00a563cc	add w9,w9,#0x1
00a563d0	stxr w10,w9,[x8]
00a563d4	cbnz w10,0x00a563c8
00a563d8	mov w0,#0x1
00a563dc	ret
