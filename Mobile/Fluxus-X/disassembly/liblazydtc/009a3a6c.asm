; ix::SocketOpenSSL::openSSLLockingCallback @ 009a3a6c
009a3a6c	adrp x8,0xcb5000
009a3a70	ldr x8,[x8, #0x108]
009a3a74	ldr x8,[x8]
009a3a78	ldr x8,[x8, w1, SXTW #0x3]
009a3a7c	tbnz w0,#0x0,0x009a3a88
009a3a80	mov x0,x8
009a3a84	b 0x00c2ff20
009a3a88	mov x0,x8
009a3a8c	b 0x00c2ff10
