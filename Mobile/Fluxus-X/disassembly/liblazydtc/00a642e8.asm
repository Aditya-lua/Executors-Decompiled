; EVP_KDF_CTX_get_params @ 00a642e8
00a642e8	ldr x8,[x0]
00a642ec	ldr x2,[x8, #0x78]
00a642f0	cbz x2,0x00a642fc
00a642f4	ldr x0,[x0, #0x8]
00a642f8	br x2
00a642fc	mov w0,#0x1
00a64300	ret
