; ssl_get_split_send_fragment @ 009b93dc
009b93dc	ldr x8,[x0, #0x918]
009b93e0	cbz x8,0x009b9408
009b93e4	ldrb w8,[x8, #0x368]
009b93e8	sub w8,w8,#0x1
009b93ec	cmp w8,#0x3
009b93f0	b.hi 0x009b9408
009b93f4	ldr x9,[x0, #0xa10]
009b93f8	mov w10,#0x200
009b93fc	lsl w8,w10,w8
009b9400	cmp x9,x8
009b9404	b.hi 0x009b941c
009b9408	ldr x9,[x0, #0xa10]
009b940c	ldr x8,[x0, #0xa18]
009b9410	cmp x9,x8
009b9414	b.hi 0x009b941c
009b9418	mov w8,w9
009b941c	mov w0,w8
009b9420	ret
