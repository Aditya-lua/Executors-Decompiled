; ix::SocketTLSOptions::hasCertAndKey @ 009a5a7c
009a5a7c	ldrb w8,[x0]
009a5a80	tbnz w8,#0x0,0x009a5a9c
009a5a84	lsr w8,w8,#0x1
009a5a88	cbz x8,0x009a5aa4
009a5a8c	ldrb w8,[x0, #0x18]
009a5a90	tbnz w8,#0x0,0x009a5aac
009a5a94	lsr w8,w8,#0x1
009a5a98	b 0x009a5ab0
009a5a9c	ldr x8,[x0, #0x8]
009a5aa0	cbnz x8,0x009a5a8c
009a5aa4	mov w0,wzr
009a5aa8	ret
009a5aac	ldr x8,[x0, #0x20]
009a5ab0	cmp x8,#0x0
009a5ab4	cset w0,ne
009a5ab8	ret
