; SSL_renegotiate @ 009b52d4
009b52d4	str x19,[sp, #-0x20]!
009b52d8	stp x29,x30,[sp, #0x10]
009b52dc	add x29,sp,#0x10
009b52e0	mov x19,x0
009b52e4	bl 0x009b531c
009b52e8	cbz w0,0x009b5310
009b52ec	ldr x8,[x19, #0x8]
009b52f0	mov w9,#0x1
009b52f4	str w9,[x19, #0xba0]
009b52f8	str w9,[x19, #0x3c]
009b52fc	ldr x1,[x8, #0x58]
009b5300	ldp x29,x30,[sp, #0x10]
009b5304	mov x0,x19
009b5308	ldr x19,[sp], #0x20
009b530c	br x1
009b5310	ldp x29,x30,[sp, #0x10]
009b5314	ldr x19,[sp], #0x20
009b5318	ret
