; SSL_SESSION_get_master_key @ 009b7a2c
009b7a2c	str x19,[sp, #-0x20]!
009b7a30	stp x29,x30,[sp, #0x10]
009b7a34	ldr x19,[x0, #0x8]
009b7a38	add x29,sp,#0x10
009b7a3c	cbz x2,0x009b7a5c
009b7a40	cmp x19,x2
009b7a44	csel x19,x19,x2,cc
009b7a48	add x8,x0,#0x50
009b7a4c	mov x0,x1
009b7a50	mov x1,x8
009b7a54	mov x2,x19
009b7a58	bl 0x00c2ffd0
009b7a5c	ldp x29,x30,[sp, #0x10]
009b7a60	mov x0,x19
009b7a64	ldr x19,[sp], #0x20
009b7a68	ret
