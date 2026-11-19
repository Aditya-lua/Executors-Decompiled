; SSL_get0_dane_authority @ 009b2dfc
009b2dfc	str x21,[sp, #-0x30]!
009b2e00	stp x20,x19,[sp, #0x10]
009b2e04	stp x29,x30,[sp, #0x20]
009b2e08	mov x19,x0
009b2e0c	ldr x0,[x0, #0x4e8]
009b2e10	add x29,sp,#0x20
009b2e14	mov x20,x2
009b2e18	mov x21,x1
009b2e1c	bl 0x00c325e0
009b2e20	cmp w0,#0x1
009b2e24	b.lt 0x009b2e30
009b2e28	ldr x8,[x19, #0x9b8]
009b2e2c	cbz x8,0x009b2e38
009b2e30	mov w0,#0xffffffff
009b2e34	b 0x009b2e6c
009b2e38	ldr x8,[x19, #0x4f8]
009b2e3c	cbz x8,0x009b2e68
009b2e40	cbz x21,0x009b2e4c
009b2e44	ldr x8,[x19, #0x500]
009b2e48	str x8,[x21]
009b2e4c	cbz x20,0x009b2e68
009b2e50	ldr x9,[x19, #0x500]
009b2e54	mov x8,xzr
009b2e58	cbnz x9,0x009b2e64
009b2e5c	ldr x8,[x19, #0x4f8]
009b2e60	ldr x8,[x8, #0x18]
009b2e64	str x8,[x20]
009b2e68	ldr w0,[x19, #0x50c]
009b2e6c	ldp x29,x30,[sp, #0x20]
009b2e70	ldp x20,x19,[sp, #0x10]
009b2e74	ldr x21,[sp], #0x30
009b2e78	ret
