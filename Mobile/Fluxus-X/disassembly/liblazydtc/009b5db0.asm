; SSL_get_servername @ 009b5db0
009b5db0	str x19,[sp, #-0x20]!
009b5db4	stp x29,x30,[sp, #0x10]
009b5db8	ldr x8,[x0, #0x30]
009b5dbc	mov x19,x0
009b5dc0	add x29,sp,#0x10
009b5dc4	cbz x8,0x009b5dcc
009b5dc8	ldr w8,[x19, #0x38]
009b5dcc	mov x0,xzr
009b5dd0	cbnz w1,0x009b5e7c
009b5dd4	cbz w8,0x009b5e10
009b5dd8	ldr w8,[x19, #0x4d0]
009b5ddc	cbz w8,0x009b5e78
009b5de0	ldr x8,[x19, #0x8]
009b5de4	ldr x9,[x8, #0xc0]
009b5de8	ldrb w9,[x9, #0x60]
009b5dec	tbnz w9,#0x3,0x009b5e04
009b5df0	ldr w8,[x8]
009b5df4	cmp w8,#0x304
009b5df8	b.lt 0x009b5e04
009b5dfc	cmp w8,#0x10, LSL #12
009b5e00	b.ne 0x009b5e78
009b5e04	ldr x8,[x19, #0x918]
009b5e08	ldr x0,[x8, #0x330]
009b5e0c	b 0x009b5e7c
009b5e10	mov x0,x19
009b5e14	bl 0x00c347f0
009b5e18	cbz w0,0x009b5e40
009b5e1c	ldr x8,[x19, #0xa58]
009b5e20	cbnz x8,0x009b5e78
009b5e24	ldr x8,[x19, #0x918]
009b5e28	cbz x8,0x009b5e78
009b5e2c	ldr w9,[x8]
009b5e30	cmp w9,#0x304
009b5e34	b.eq 0x009b5e78
009b5e38	ldr x0,[x8, #0x330]
009b5e3c	b 0x009b5e7c
009b5e40	ldr x8,[x19, #0x8]
009b5e44	ldr x9,[x8, #0xc0]
009b5e48	ldrb w9,[x9, #0x60]
009b5e4c	tbnz w9,#0x3,0x009b5e64
009b5e50	ldr w8,[x8]
009b5e54	cmp w8,#0x304
009b5e58	b.lt 0x009b5e64
009b5e5c	cmp w8,#0x10, LSL #12
009b5e60	b.ne 0x009b5e78
009b5e64	ldr w8,[x19, #0x4d0]
009b5e68	cbz w8,0x009b5e78
009b5e6c	ldr x8,[x19, #0x918]
009b5e70	ldr x0,[x8, #0x330]
009b5e74	cbnz x0,0x009b5e7c
009b5e78	ldr x0,[x19, #0xa58]
009b5e7c	ldp x29,x30,[sp, #0x10]
009b5e80	ldr x19,[sp], #0x20
009b5e84	ret
