; EVP_PKEY_cmp_parameters @ 00a6c8c0
00a6c8c0	ldr x8,[x0, #0x60]
00a6c8c4	cbnz x8,0x00a6c8d0
00a6c8c8	ldr x8,[x1, #0x60]
00a6c8cc	cbz x8,0x00a6c8d8
00a6c8d0	mov w2,#0x4
00a6c8d4	b 0x00a6c90c
00a6c8d8	ldr w8,[x0]
00a6c8dc	ldr w9,[x1]
00a6c8e0	cmp w8,w9
00a6c8e4	b.ne 0x00a6c8fc
00a6c8e8	ldr x8,[x0, #0x8]
00a6c8ec	cbz x8,0x00a6c904
00a6c8f0	ldr x2,[x8, #0x90]
00a6c8f4	cbz x2,0x00a6c904
00a6c8f8	br x2
00a6c8fc	mov w0,#0xffffffff
00a6c900	ret
00a6c904	orr w0,wzr,#0xfffffffe
00a6c908	ret
