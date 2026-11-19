; EVP_KEYMGMT_up_ref @ 00a667a0
00a667a0	add x8,x0,#0x20
00a667a4	ldxr w9,[x8]
00a667a8	add w9,w9,#0x1
00a667ac	stxr w10,w9,[x8]
00a667b0	cbnz w10,0x00a667a4
00a667b4	mov w0,#0x1
00a667b8	ret
