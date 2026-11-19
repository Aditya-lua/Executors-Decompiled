; SSL_write @ 009b4e4c
009b4e4c	sub sp,sp,#0x20
009b4e50	stp x29,x30,[sp, #0x10]
009b4e54	add x29,sp,#0x10
009b4e58	tbnz w2,#0x1f,0x009b4e78
009b4e5c	sxtw x2,w2
009b4e60	add x3,sp,#0x8
009b4e64	bl 0x009b4c2c
009b4e68	ldr w8,[sp, #0x8]
009b4e6c	cmp w0,#0x0
009b4e70	csel w0,w8,w0,gt
009b4e74	b 0x009b4ea8
009b4e78	bl 0x00c342a0
009b4e7c	adrp x0,0x2c5000
009b4e80	adrp x2,0x2bb000
009b4e84	add x0,x0,#0x652
009b4e88	add x2,x2,#0x81a
009b4e8c	mov w1,#0x86a
009b4e90	bl 0x00c342b0
009b4e94	mov w0,#0x14
009b4e98	mov w1,#0x10f
009b4e9c	mov x2,xzr
009b4ea0	bl 0x00c342c0
009b4ea4	mov w0,#0xffffffff
009b4ea8	ldp x29,x30,[sp, #0x10]
009b4eac	add sp,sp,#0x20
009b4eb0	ret
