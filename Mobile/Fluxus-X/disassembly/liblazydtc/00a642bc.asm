; EVP_KDF_derive @ 00a642bc
00a642bc	cbz x0,0x00a642cc
00a642c0	ldp x8,x0,[x0]
00a642c4	ldr x4,[x8, #0x50]
00a642c8	br x4
00a642cc	ret
