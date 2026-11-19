; SSL_get0_next_proto_negotiated @ 009b5f84
009b5f84	ldr x8,[x0, #0xb18]
009b5f88	str x8,[x1]
009b5f8c	cbz x8,0x009b5f94
009b5f90	ldr w8,[x0, #0xb20]
009b5f94	str w8,[x2]
009b5f98	ret
