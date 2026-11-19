; OSSL_ENCODER_get_params @ 00a610a4
00a610a4	cbz x0,0x00a610b8
00a610a8	ldr x2,[x0, #0x48]
00a610ac	cbz x2,0x00a610b8
00a610b0	mov x0,x1
00a610b4	br x2
00a610b8	mov w0,wzr
00a610bc	ret
