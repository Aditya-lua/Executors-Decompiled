; OSSL_STORE_LOADER_up_ref @ 00aeb040
00aeb040	ldr x8,[x0, #0x60]
00aeb044	cbz x8,0x00aeb05c
00aeb048	add x8,x0,#0x80
00aeb04c	ldxr w9,[x8]
00aeb050	add w9,w9,#0x1
00aeb054	stxr w10,w9,[x8]
00aeb058	cbnz w10,0x00aeb04c
00aeb05c	mov w0,#0x1
00aeb060	ret
