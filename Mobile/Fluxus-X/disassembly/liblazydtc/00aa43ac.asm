; ossl_provider_gettable_params @ 00aa43ac
00aa43ac	ldr x1,[x0, #0x78]
00aa43b0	cbz x1,0x00aa43bc
00aa43b4	ldr x0,[x0, #0xd0]
00aa43b8	br x1
00aa43bc	mov x0,xzr
00aa43c0	ret
