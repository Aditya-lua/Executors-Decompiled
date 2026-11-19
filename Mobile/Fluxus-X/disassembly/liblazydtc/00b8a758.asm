; psa_verify_hash_abort @ 00b8a758
00b8a758	ldr w8,[x0]
00b8a75c	cbz w8,0x00b8a770
00b8a760	cmp w8,#0x1
00b8a764	mov w8,#0xffffff79
00b8a768	cinc w8,w8,eq
00b8a76c	str wzr,[x0]
00b8a770	ldrb w9,[x0, #0x8]
00b8a774	str wzr,[x0, #0xc]
00b8a778	and w9,w9,#0xfe
00b8a77c	strb w9,[x0, #0x8]
00b8a780	mov w0,w8
00b8a784	ret
