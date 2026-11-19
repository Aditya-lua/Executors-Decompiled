; SSL_set_record_padding_callback @ 009b7d94
009b7d94	stp x20,x19,[sp, #-0x20]!
009b7d98	stp x29,x30,[sp, #0x10]
009b7d9c	mov x19,x0
009b7da0	ldr x0,[x0, #0x20]
009b7da4	mov x20,x1
009b7da8	add x29,sp,#0x10
009b7dac	cbz x0,0x009b7db4
009b7db0	bl 0x00c35620
009b7db4	str x20,[x19, #0x1d50]
009b7db8	ldp x29,x30,[sp, #0x10]
009b7dbc	mov w0,#0x1
009b7dc0	ldp x20,x19,[sp], #0x20
009b7dc4	ret
