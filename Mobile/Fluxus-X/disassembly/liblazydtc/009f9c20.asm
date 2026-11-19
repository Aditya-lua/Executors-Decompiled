; ASYNC_WAIT_CTX_get_callback @ 009f9c20
009f9c20	ldr x8,[x0, #0x18]
009f9c24	cbz x8,0x009f9c3c
009f9c28	str x8,[x1]
009f9c2c	ldr x8,[x0, #0x20]
009f9c30	mov w0,#0x1
009f9c34	str x8,[x2]
009f9c38	ret
009f9c3c	mov w0,wzr
009f9c40	ret
