; EVP_PKEY_is_a @ 00a6e094
00a6e094	cbz x0,0x00a6e0d0
00a6e098	ldr x8,[x0, #0x60]
00a6e09c	cbz x8,0x00a6e0a8
00a6e0a0	mov x0,x8
00a6e0a4	b 0x00c3b6d0
00a6e0a8	str x19,[sp, #-0x20]!
00a6e0ac	stp x29,x30,[sp, #0x10]
00a6e0b0	ldr w19,[x0]
00a6e0b4	mov x0,x1
00a6e0b8	add x29,sp,#0x10
00a6e0bc	bl 0x00a6dddc
00a6e0c0	ldp x29,x30,[sp, #0x10]
00a6e0c4	cmp w19,w0
00a6e0c8	cset w0,eq
00a6e0cc	ldr x19,[sp], #0x20
00a6e0d0	ret
