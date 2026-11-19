; SSL_renegotiate_abbreviated @ 009b53bc
009b53bc	str x19,[sp, #-0x20]!
009b53c0	stp x29,x30,[sp, #0x10]
009b53c4	add x29,sp,#0x10
009b53c8	mov x19,x0
009b53cc	bl 0x009b531c
009b53d0	cbz w0,0x009b53f8
009b53d4	ldr x8,[x19, #0x8]
009b53d8	mov w9,#0x1
009b53dc	str w9,[x19, #0xba0]
009b53e0	str wzr,[x19, #0x3c]
009b53e4	ldr x1,[x8, #0x58]
009b53e8	ldp x29,x30,[sp, #0x10]
009b53ec	mov x0,x19
009b53f0	ldr x19,[sp], #0x20
009b53f4	br x1
009b53f8	ldp x29,x30,[sp, #0x10]
009b53fc	ldr x19,[sp], #0x20
009b5400	ret
