; EVP_PKEY_type @ 00a6d7ac
00a6d7ac	str x19,[sp, #-0x20]!
00a6d7b0	mov w1,w0
00a6d7b4	add x0,sp,#0x8
00a6d7b8	stp x29,x30,[sp, #0x10]
00a6d7bc	add x29,sp,#0x10
00a6d7c0	bl 0x00c37b20
00a6d7c4	cbz x0,0x00a6d7d0
00a6d7c8	ldr w19,[x0]
00a6d7cc	b 0x00a6d7d4
00a6d7d0	mov w19,wzr
00a6d7d4	ldr x0,[sp, #0x8]
00a6d7d8	bl 0x00c32360
00a6d7dc	ldp x29,x30,[sp, #0x10]
00a6d7e0	mov w0,w19
00a6d7e4	ldr x19,[sp], #0x20
00a6d7e8	ret
