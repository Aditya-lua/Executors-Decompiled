; RSA_pkey_ctx_ctrl @ 00ad20c4
00ad20c4	mov x5,x4
00ad20c8	mov w4,w3
00ad20cc	mov w3,w2
00ad20d0	mov w2,w1
00ad20d4	cbz x0,0x00ad20f4
00ad20d8	ldr x8,[x0, #0x78]
00ad20dc	cbz x8,0x00ad20f4
00ad20e0	ldr w8,[x8]
00ad20e4	cmp w8,#0x390
00ad20e8	b.eq 0x00ad20f4
00ad20ec	cmp w8,#0x6
00ad20f0	b.ne 0x00ad20fc
00ad20f4	mov w1,#0xffffffff
00ad20f8	b 0x00c370f0
00ad20fc	mov w0,#0xffffffff
00ad2100	ret
