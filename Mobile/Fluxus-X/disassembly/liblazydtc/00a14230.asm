; SCT_signature_is_complete @ 00a14230
00a14230	ldr w9,[x0]
00a14234	mov w8,wzr
00a14238	cbnz w9,0x00a14274
00a1423c	ldrb w8,[x0, #0x40]
00a14240	cmp w8,#0x4
00a14244	mov w8,wzr
00a14248	b.ne 0x00a14274
00a1424c	ldrb w8,[x0, #0x41]
00a14250	orr w8,w8,#0x2
00a14254	cmp w8,#0x3
00a14258	mov w8,wzr
00a1425c	b.ne 0x00a14274
00a14260	ldr x8,[x0, #0x48]
00a14264	cbz x8,0x00a14274
00a14268	ldr x8,[x0, #0x50]
00a1426c	cmp x8,#0x0
00a14270	cset w8,ne
00a14274	mov w0,w8
00a14278	ret
