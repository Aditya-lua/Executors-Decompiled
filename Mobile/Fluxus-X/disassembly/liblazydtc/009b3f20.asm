; SSL_get_finished @ 009b3f20
009b3f20	str x19,[sp, #-0x20]!
009b3f24	stp x29,x30,[sp, #0x10]
009b3f28	ldr x19,[x0, #0x240]
009b3f2c	mov x8,x1
009b3f30	add x1,x0,#0x1c0
009b3f34	mov x0,x8
009b3f38	cmp x19,x2
009b3f3c	csel x2,x19,x2,cc
009b3f40	add x29,sp,#0x10
009b3f44	bl 0x00c2ffd0
009b3f48	ldp x29,x30,[sp, #0x10]
009b3f4c	mov x0,x19
009b3f50	ldr x19,[sp], #0x20
009b3f54	ret
