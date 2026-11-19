; OSSL_PARAM_get_BN @ 00a9f084
00a9f084	str x19,[sp, #-0x20]!
00a9f088	mov x8,x0
00a9f08c	mov w0,wzr
00a9f090	stp x29,x30,[sp, #0x10]
00a9f094	add x29,sp,#0x10
00a9f098	cbz x8,0x00a9f0d0
00a9f09c	mov x19,x1
00a9f0a0	cbz x1,0x00a9f0d0
00a9f0a4	ldr w9,[x8, #0x8]
00a9f0a8	mov w0,wzr
00a9f0ac	cmp w9,#0x2
00a9f0b0	b.ne 0x00a9f0d0
00a9f0b4	ldr x0,[x8, #0x10]
00a9f0b8	ldr w1,[x8, #0x18]
00a9f0bc	ldr x2,[x19]
00a9f0c0	bl 0x00c38d70
00a9f0c4	cbz x0,0x00a9f0d0
00a9f0c8	str x0,[x19]
00a9f0cc	mov w0,#0x1
00a9f0d0	ldp x29,x30,[sp, #0x10]
00a9f0d4	ldr x19,[sp], #0x20
00a9f0d8	ret
