; ossl_statem_set_in_handshake @ 009da3c8
009da3c8	ldr w8,[x0, #0x6c]
009da3cc	cmp w1,#0x0
009da3d0	mov w9,#0xffffffff
009da3d4	cneg w9,w9,ne
009da3d8	add w8,w8,w9
009da3dc	str w8,[x0, #0x6c]
009da3e0	ret
