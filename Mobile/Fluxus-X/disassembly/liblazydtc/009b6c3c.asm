; SSL_set_ssl_method @ 009b6c3c
009b6c3c	stp x22,x21,[sp, #-0x30]!
009b6c40	stp x20,x19,[sp, #0x10]
009b6c44	stp x29,x30,[sp, #0x20]
009b6c48	ldr x21,[x0, #0x8]
009b6c4c	add x29,sp,#0x20
009b6c50	cmp x21,x1
009b6c54	b.eq 0x009b6c80
009b6c58	ldr w8,[x21]
009b6c5c	ldr w9,[x1]
009b6c60	ldr x22,[x0, #0x30]
009b6c64	mov x19,x0
009b6c68	mov x20,x1
009b6c6c	cmp w8,w9
009b6c70	b.ne 0x009b6c88
009b6c74	str x20,[x19, #0x8]
009b6c78	mov w0,#0x1
009b6c7c	b 0x009b6ca4
009b6c80	mov w0,#0x1
009b6c84	b 0x009b6ccc
009b6c88	ldr x8,[x21, #0x20]
009b6c8c	mov x0,x19
009b6c90	blr x8
009b6c94	str x20,[x19, #0x8]
009b6c98	ldr x8,[x20, #0x10]
009b6c9c	mov x0,x19
009b6ca0	blr x8
009b6ca4	ldr x8,[x21, #0x30]
009b6ca8	cmp x22,x8
009b6cac	b.eq 0x009b6cc4
009b6cb0	ldr x8,[x21, #0x28]
009b6cb4	cmp x22,x8
009b6cb8	b.ne 0x009b6ccc
009b6cbc	ldr x8,[x20, #0x28]
009b6cc0	b 0x009b6cc8
009b6cc4	ldr x8,[x20, #0x30]
009b6cc8	str x8,[x19, #0x30]
009b6ccc	ldp x29,x30,[sp, #0x20]
009b6cd0	ldp x20,x19,[sp, #0x10]
009b6cd4	ldp x22,x21,[sp], #0x30
009b6cd8	ret
