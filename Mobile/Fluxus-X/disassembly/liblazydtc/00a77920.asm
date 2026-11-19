; evp_pkey_ctx_use_cached_data @ 00a77920
00a77920	ldrb w8,[x0, #0x50]
00a77924	tbnz w8,#0x0,0x00a77930
00a77928	mov w0,#0x1
00a7792c	ret
00a77930	ldp x1,x5,[x0, #0x38]
00a77934	cbz x1,0x00a77940
00a77938	mov x2,x5
00a7793c	b 0x00a777c0
00a77940	ldr w4,[x0, #0x48]
00a77944	ldr w2,[x0]
00a77948	mov w1,#0xffffffff
00a7794c	orr w3,wzr,#0xf
00a77950	b 0x00a77554
