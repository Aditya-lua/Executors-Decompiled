; CRYPTO_malloc @ 00a999ac
00a999ac	adrp x8,0xcc9000
00a999b0	ldr x3,[x8, #0x138]
00a999b4	adrp x8,0xcb4000
00a999b8	ldr x8,[x8, #0xe68]
00a999bc	cmp x3,x8
00a999c0	b.eq 0x00a999c8
00a999c4	br x3
00a999c8	cbz x0,0x00a999e4
00a999cc	adrp x8,0xd22000
00a999d0	ldrb w9,[x8, #0xe8]
00a999d4	tbnz w9,#0x0,0x00a999e0
00a999d8	mov w9,#0x1
00a999dc	strb w9,[x8, #0xe8]
00a999e0	b 0x00c308d0
00a999e4	ret
