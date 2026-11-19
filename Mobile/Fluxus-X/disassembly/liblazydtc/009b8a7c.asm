; SSL_client_hello_get0_ext @ 009b8a7c
009b8a7c	ldr x8,[x0, #0xb58]
009b8a80	cbz x8,0x009b8abc
009b8a84	ldr x9,[x8, #0x280]
009b8a88	cbz x9,0x009b8abc
009b8a8c	ldr x8,[x8, #0x288]
009b8a90	mov x10,xzr
009b8a94	add x8,x8,#0x10
009b8a98	ldr w11,[x8]
009b8a9c	cbz w11,0x009b8aac
009b8aa0	ldr w11,[x8, #0x8]
009b8aa4	cmp w11,w1
009b8aa8	b.eq 0x009b8ac4
009b8aac	add x10,x10,#0x1
009b8ab0	cmp x10,x9
009b8ab4	add x8,x8,#0x28
009b8ab8	b.cc 0x009b8a98
009b8abc	mov w0,wzr
009b8ac0	ret
009b8ac4	cbz x2,0x009b8ad0
009b8ac8	ldur x9,[x8, #-0x10]
009b8acc	str x9,[x2]
009b8ad0	cbz x3,0x009b8ae4
009b8ad4	ldur x8,[x8, #-0x8]
009b8ad8	mov w0,#0x1
009b8adc	str x8,[x3]
009b8ae0	ret
009b8ae4	mov w0,#0x1
009b8ae8	ret
