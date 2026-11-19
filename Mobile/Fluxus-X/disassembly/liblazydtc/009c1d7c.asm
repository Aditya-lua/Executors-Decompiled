; tls1_set_peer_legacy_sigalg @ 009c1d7c
009c1d7c	str x19,[sp, #-0x20]!
009c1d80	mov x8,x1
009c1d84	mov x19,x0
009c1d88	add x1,sp,#0x8
009c1d8c	mov x0,x8
009c1d90	stp x29,x30,[sp, #0x10]
009c1d94	add x29,sp,#0x10
009c1d98	bl 0x00c35150
009c1d9c	cbz x0,0x009c1db8
009c1da0	ldr w1,[sp, #0x8]
009c1da4	mov x0,x19
009c1da8	bl 0x009c1dc4
009c1dac	cbz x0,0x009c1db8
009c1db0	str x0,[x19, #0x3b0]
009c1db4	mov w0,#0x1
009c1db8	ldp x29,x30,[sp, #0x10]
009c1dbc	ldr x19,[sp], #0x20
009c1dc0	ret
