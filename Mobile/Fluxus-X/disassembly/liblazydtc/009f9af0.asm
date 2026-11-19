; ASYNC_WAIT_CTX_get_changed_fds @ 009f9af0
009f9af0	ldr x8,[x0, #0x8]
009f9af4	orr x9,x1,x3
009f9af8	str x8,[x2]
009f9afc	ldr x8,[x0, #0x10]
009f9b00	str x8,[x4]
009f9b04	cbz x9,0x009f9b50
009f9b08	ldr x8,[x0]
009f9b0c	cbz x8,0x009f9b50
009f9b10	ldr w9,[x8, #0x24]
009f9b14	cbz w9,0x009f9b2c
009f9b18	ldr w9,[x8, #0x20]
009f9b1c	cbz x3,0x009f9b30
009f9b20	cbnz w9,0x009f9b30
009f9b24	ldr w9,[x8, #0x8]
009f9b28	str w9,[x3], #0x4
009f9b2c	ldr w9,[x8, #0x20]
009f9b30	cbz w9,0x009f9b48
009f9b34	cbz x1,0x009f9b48
009f9b38	ldr w9,[x8, #0x24]
009f9b3c	cbnz w9,0x009f9b48
009f9b40	ldr w9,[x8, #0x8]
009f9b44	str w9,[x1], #0x4
009f9b48	ldr x8,[x8, #0x28]
009f9b4c	cbnz x8,0x009f9b10
009f9b50	mov w0,#0x1
009f9b54	ret
