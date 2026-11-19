; tls_construct_server_done @ 009e8234
009e8234	ldr w8,[x0, #0x348]
009e8238	cbnz w8,0x009e8254
009e823c	stp x29,x30,[sp, #-0x10]!
009e8240	mov w1,wzr
009e8244	mov x29,sp
009e8248	bl 0x00c345a0
009e824c	ldp x29,x30,[sp], #0x10
009e8250	cbz w0,0x009e8258
009e8254	mov w0,#0x1
009e8258	ret
