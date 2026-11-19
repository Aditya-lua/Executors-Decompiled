; ossl_provider_get_params @ 00aa43c4
00aa43c4	ldr x2,[x0, #0x80]
00aa43c8	cbz x2,0x00aa43d4
00aa43cc	ldr x0,[x0, #0xd0]
00aa43d0	br x2
00aa43d4	mov w0,wzr
00aa43d8	ret
