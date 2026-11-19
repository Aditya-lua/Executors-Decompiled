; ssl3_renegotiate @ 009a9b90
009a9b90	ldr x8,[x0, #0x30]
009a9b94	cbz x8,0x009a9ba0
009a9b98	mov w8,#0x1
009a9b9c	str w8,[x0, #0x1ac]
009a9ba0	mov w0,#0x1
009a9ba4	ret
