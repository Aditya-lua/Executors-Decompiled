; DH_size @ 00a1f1ac
00a1f1ac	ldr x0,[x0, #0x8]
00a1f1b0	cbz x0,0x00a1f1dc
00a1f1b4	stp x29,x30,[sp, #-0x10]!
00a1f1b8	mov x29,sp
00a1f1bc	bl 0x00c322f0
00a1f1c0	add w8,w0,#0x7
00a1f1c4	add w9,w0,#0xe
00a1f1c8	cmp w8,#0x0
00a1f1cc	csel w8,w9,w8,lt
00a1f1d0	asr w0,w8,#0x3
00a1f1d4	ldp x29,x30,[sp], #0x10
00a1f1d8	ret
00a1f1dc	mov w0,#0xffffffff
00a1f1e0	ret
