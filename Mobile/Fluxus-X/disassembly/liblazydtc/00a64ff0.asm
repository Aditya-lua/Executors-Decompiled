; EVP_KEM_up_ref @ 00a64ff0
00a64ff0	add x8,x0,#0x20
00a64ff4	ldxr w9,[x8]
00a64ff8	add w9,w9,#0x1
00a64ffc	stxr w10,w9,[x8]
00a65000	cbnz w10,0x00a64ff4
00a65004	mov w0,#0x1
00a65008	ret
