; psa_sign_hash_abort @ 00b8a4d4
00b8a4d4	ldr w8,[x0]
00b8a4d8	cbz w8,0x00b8a4ec
00b8a4dc	cmp w8,#0x1
00b8a4e0	mov w8,#0xffffff79
00b8a4e4	cinc w8,w8,eq
00b8a4e8	str wzr,[x0]
00b8a4ec	ldrb w9,[x0, #0x8]
00b8a4f0	str wzr,[x0, #0xc]
00b8a4f4	and w9,w9,#0xfe
00b8a4f8	strb w9,[x0, #0x8]
00b8a4fc	mov w0,w8
00b8a500	ret
