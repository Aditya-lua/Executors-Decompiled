; EVP_KDF_get_params @ 00a642d0
00a642d0	ldr x2,[x0, #0x70]
00a642d4	cbz x2,0x00a642e0
00a642d8	mov x0,x1
00a642dc	br x2
00a642e0	mov w0,#0x1
00a642e4	ret
