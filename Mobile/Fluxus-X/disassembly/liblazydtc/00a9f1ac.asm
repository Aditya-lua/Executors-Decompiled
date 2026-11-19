; OSSL_PARAM_get_double @ 00a9f1ac
00a9f1ac	mov w8,wzr
00a9f1b0	cbz x0,0x00a9f290
00a9f1b4	cbz x1,0x00a9f290
00a9f1b8	ldr w8,[x0, #0x8]
00a9f1bc	cmp w8,#0x1
00a9f1c0	b.eq 0x00a9f1f8
00a9f1c4	cmp w8,#0x2
00a9f1c8	b.eq 0x00a9f224
00a9f1cc	cmp w8,#0x3
00a9f1d0	mov w8,wzr
00a9f1d4	b.ne 0x00a9f290
00a9f1d8	ldr x8,[x0, #0x18]
00a9f1dc	cmp x8,#0x8
00a9f1e0	mov w8,wzr
00a9f1e4	b.ne 0x00a9f290
00a9f1e8	ldr x8,[x0, #0x10]
00a9f1ec	ldr x8,[x8]
00a9f1f0	str x8,[x1]
00a9f1f4	b 0x00a9f28c
00a9f1f8	ldr x8,[x0, #0x18]
00a9f1fc	cmp x8,#0x8
00a9f200	b.eq 0x00a9f268
00a9f204	cmp x8,#0x4
00a9f208	mov w8,wzr
00a9f20c	b.ne 0x00a9f290
00a9f210	ldr x8,[x0, #0x10]
00a9f214	ldr s0,[x8]
00a9f218	sxtl v0.2D,v0.2S
00a9f21c	scvtf d0,d0
00a9f220	b 0x00a9f288
00a9f224	ldr x8,[x0, #0x18]
00a9f228	cmp x8,#0x8
00a9f22c	b.eq 0x00a9f24c
00a9f230	cmp x8,#0x4
00a9f234	mov w8,wzr
00a9f238	b.ne 0x00a9f290
00a9f23c	ldr x8,[x0, #0x10]
00a9f240	ldr s0,[x8]
00a9f244	ucvtf d0,d0
00a9f248	b 0x00a9f288
00a9f24c	ldr x8,[x0, #0x10]
00a9f250	ldr x9,[x8]
00a9f254	mov w8,wzr
00a9f258	lsr x10,x9,#0x35
00a9f25c	cbnz x10,0x00a9f290
00a9f260	ucvtf d0,x9
00a9f264	b 0x00a9f288
00a9f268	ldr x8,[x0, #0x10]
00a9f26c	ldr x9,[x8]
00a9f270	cmp x9,#0x0
00a9f274	cneg x8,x9,mi
00a9f278	lsr x10,x8,#0x35
00a9f27c	mov w8,wzr
00a9f280	cbnz x10,0x00a9f290
00a9f284	scvtf d0,x9
00a9f288	str d0,[x1]
00a9f28c	mov w8,#0x1
00a9f290	mov w0,w8
00a9f294	ret
