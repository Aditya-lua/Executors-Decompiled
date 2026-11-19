; ossl_statem_server_max_message_size @ 009e8d38
009e8d38	ldr w9,[x0, #0x5c]
009e8d3c	mov x8,x0
009e8d40	mov x0,xzr
009e8d44	sub w9,w9,#0x14
009e8d48	cmp w9,#0x18
009e8d4c	b.hi 0x009e8d68
009e8d50	adrp x10,0x74d000
009e8d54	add x10,x10,#0xc44
009e8d58	ldrsw x9,[x10, x9, LSL #0x2]
009e8d5c	add x9,x9,x10
009e8d60	br x9
009e8d64	mov w0,#0x1
009e8d68	ret
009e8d6c	mov w0,#0x144
009e8d70	movk w0,#0x2, LSL #16
009e8d74	ret
009e8d78	ldr x0,[x8, #0xa00]
009e8d7c	ret
009e8d80	mov w0,#0x800
009e8d84	ret
009e8d88	mov w0,#0x4000
009e8d8c	ret
009e8d90	mov w0,#0x202
009e8d94	ret
009e8d98	mov w0,#0x40
009e8d9c	ret
