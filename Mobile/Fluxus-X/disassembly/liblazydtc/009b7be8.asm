; SSL_use_psk_identity_hint @ 009b7be8
009b7be8	stp x20,x19,[sp, #-0x20]!
009b7bec	stp x29,x30,[sp, #0x10]
009b7bf0	add x29,sp,#0x10
009b7bf4	cbz x0,0x009b7c94
009b7bf8	mov x20,x1
009b7bfc	mov x19,x0
009b7c00	cbz x1,0x009b7c48
009b7c04	mov x0,x20
009b7c08	bl 0x00c2ff50
009b7c0c	cmp x0,#0x101
009b7c10	b.cc 0x009b7c48
009b7c14	bl 0x00c342a0
009b7c18	adrp x0,0x2c5000
009b7c1c	adrp x2,0x2bd000
009b7c20	add x0,x0,#0x652
009b7c24	add x2,x2,#0x5b0
009b7c28	mov w1,#0x11ff
009b7c2c	bl 0x00c342b0
009b7c30	mov w0,#0x14
009b7c34	mov w1,#0x92
009b7c38	mov x2,xzr
009b7c3c	bl 0x00c342c0
009b7c40	mov w0,wzr
009b7c44	b 0x009b7c94
009b7c48	ldr x8,[x19, #0x898]
009b7c4c	adrp x1,0x2c5000
009b7c50	add x1,x1,#0x652
009b7c54	mov w2,#0x1202
009b7c58	ldr x0,[x8, #0x200]
009b7c5c	bl 0x00c32310
009b7c60	cbz x20,0x009b7c88
009b7c64	adrp x1,0x2c5000
009b7c68	add x1,x1,#0x652
009b7c6c	mov w2,#0x1204
009b7c70	mov x0,x20
009b7c74	bl 0x00c34600
009b7c78	ldr x8,[x19, #0x898]
009b7c7c	str x0,[x8, #0x200]
009b7c80	cbnz x0,0x009b7c90
009b7c84	b 0x009b7c94
009b7c88	ldr x8,[x19, #0x898]
009b7c8c	str xzr,[x8, #0x200]
009b7c90	mov w0,#0x1
009b7c94	ldp x29,x30,[sp, #0x10]
009b7c98	ldp x20,x19,[sp], #0x20
009b7c9c	ret
