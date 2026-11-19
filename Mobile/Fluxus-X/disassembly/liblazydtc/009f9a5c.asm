; ASYNC_WAIT_CTX_get_fd @ 009f9a5c
009f9a5c	ldr x8,[x0]
009f9a60	cbz x8,0x009f9a88
009f9a64	ldr w9,[x8, #0x24]
009f9a68	cbnz w9,0x009f9a78
009f9a6c	ldr x9,[x8]
009f9a70	cmp x9,x1
009f9a74	b.eq 0x009f9a90
009f9a78	ldr x8,[x8, #0x28]
009f9a7c	cbnz x8,0x009f9a64
009f9a80	mov w0,wzr
009f9a84	ret
009f9a88	mov w0,wzr
009f9a8c	ret
009f9a90	ldr w9,[x8, #0x8]
009f9a94	mov w0,#0x1
009f9a98	str w9,[x2]
009f9a9c	ldr x8,[x8, #0x10]
009f9aa0	str x8,[x3]
009f9aa4	ret
