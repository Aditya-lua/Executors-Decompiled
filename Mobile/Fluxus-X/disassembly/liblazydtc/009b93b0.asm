; ssl_get_max_send_fragment @ 009b93b0
009b93b0	ldr x8,[x0, #0x918]
009b93b4	cbz x8,0x009b93d4
009b93b8	ldrb w8,[x8, #0x368]
009b93bc	sub w8,w8,#0x1
009b93c0	cmp w8,#0x3
009b93c4	b.hi 0x009b93d4
009b93c8	mov w9,#0x200
009b93cc	lsl w0,w9,w8
009b93d0	ret
009b93d4	ldr w0,[x0, #0xa18]
009b93d8	ret
