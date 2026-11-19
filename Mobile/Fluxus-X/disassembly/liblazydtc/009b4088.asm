; SSL_get1_peer_certificate @ 009b4088
009b4088	str x19,[sp, #-0x20]!
009b408c	stp x29,x30,[sp, #0x10]
009b4090	add x29,sp,#0x10
009b4094	cbz x0,0x009b40b4
009b4098	ldr x8,[x0, #0x918]
009b409c	cbz x8,0x009b40b4
009b40a0	ldr x19,[x8, #0x2b8]
009b40a4	cbz x19,0x009b40b8
009b40a8	mov x0,x19
009b40ac	bl 0x00c350b0
009b40b0	b 0x009b40b8
009b40b4	mov x19,xzr
009b40b8	ldp x29,x30,[sp, #0x10]
009b40bc	mov x0,x19
009b40c0	ldr x19,[sp], #0x20
009b40c4	ret
