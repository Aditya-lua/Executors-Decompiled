; SSL_get_shared_sigalgs @ 009c4258
009c4258	mov w8,wzr
009c425c	tbnz w1,#0x1f,0x009c42c4
009c4260	ldr x9,[x0, #0x1da8]
009c4264	cbz x9,0x009c42c4
009c4268	ldr x8,[x0, #0x1db0]
009c426c	lsr x10,x8,#0x1f
009c4270	cbnz x10,0x009c42cc
009c4274	cmp w8,w1
009c4278	mov w8,wzr
009c427c	b.le 0x009c42c4
009c4280	ldr x8,[x9, w1, SXTW #0x3]
009c4284	cbz x3,0x009c4290
009c4288	ldr w9,[x8, #0xc]
009c428c	str w9,[x3]
009c4290	cbz x2,0x009c429c
009c4294	ldr w9,[x8, #0x14]
009c4298	str w9,[x2]
009c429c	cbz x4,0x009c42a8
009c42a0	ldr w9,[x8, #0x1c]
009c42a4	str w9,[x4]
009c42a8	cbz x5,0x009c42b4
009c42ac	ldrb w9,[x8, #0x8]
009c42b0	strb w9,[x5]
009c42b4	cbz x6,0x009c42c0
009c42b8	ldrb w8,[x8, #0x9]
009c42bc	strb w8,[x6]
009c42c0	ldr w8,[x0, #0x1db0]
009c42c4	mov w0,w8
009c42c8	ret
009c42cc	mov w0,wzr
009c42d0	ret
