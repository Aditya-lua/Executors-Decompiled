; psa_verify_hash_complete @ 00b8a708
00b8a708	ldr w8,[x0]
00b8a70c	ldrb w9,[x0, #0x8]
00b8a710	cbz w8,0x00b8a72c
00b8a714	tbnz w9,#0x0,0x00b8a740
00b8a718	cmp w8,#0x1
00b8a71c	mov w8,#0xffffff79
00b8a720	cinc w8,w8,eq
00b8a724	str wzr,[x0, #0xc]
00b8a728	b 0x00b8a744
00b8a72c	orr w8,w9,#0x1
00b8a730	strb w8,[x0, #0x8]
00b8a734	mov w8,#0xffffff77
00b8a738	mov w0,w8
00b8a73c	ret
00b8a740	mov w8,#0xffffff77
00b8a744	orr w9,w9,#0x1
00b8a748	strb w9,[x0, #0x8]
00b8a74c	str wzr,[x0]
00b8a750	mov w0,w8
00b8a754	ret
