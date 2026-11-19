; SSL_get_peer_finished @ 009b3f58
009b3f58	str x19,[sp, #-0x20]!
009b3f5c	stp x29,x30,[sp, #0x10]
009b3f60	ldr x19,[x0, #0x2c8]
009b3f64	mov x8,x1
009b3f68	add x1,x0,#0x248
009b3f6c	mov x0,x8
009b3f70	cmp x19,x2
009b3f74	csel x2,x19,x2,cc
009b3f78	add x29,sp,#0x10
009b3f7c	bl 0x00c2ffd0
009b3f80	ldp x29,x30,[sp, #0x10]
009b3f84	mov x0,x19
009b3f88	ldr x19,[sp], #0x20
009b3f8c	ret
