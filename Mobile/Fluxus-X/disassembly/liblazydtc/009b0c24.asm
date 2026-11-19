; SSL_COMP_add_compression_method @ 009b0c24
009b0c24	str x21,[sp, #-0x30]!
009b0c28	stp x20,x19,[sp, #0x10]
009b0c2c	stp x29,x30,[sp, #0x20]
009b0c30	add x29,sp,#0x20
009b0c34	cbz x1,0x009b0d88
009b0c38	mov w21,w0
009b0c3c	mov x0,x1
009b0c40	mov x20,x1
009b0c44	bl 0x00c35210
009b0c48	cbz w0,0x009b0d88
009b0c4c	sub w8,w21,#0xc1
009b0c50	cmp w8,#0x3f
009b0c54	b.cc 0x009b0c80
009b0c58	bl 0x00c342a0
009b0c5c	adrp x0,0x2af000
009b0c60	adrp x2,0x2db000
009b0c64	add x0,x0,#0x931
009b0c68	add x2,x2,#0x9a4
009b0c6c	orr w1,wzr,#0x7f8
009b0c70	bl 0x00c342b0
009b0c74	mov w0,#0x14
009b0c78	mov w1,#0x133
009b0c7c	b 0x009b0d80
009b0c80	adrp x1,0x2af000
009b0c84	add x1,x1,#0x931
009b0c88	orr w0,wzr,#0x18
009b0c8c	orr w2,wzr,#0x7fc
009b0c90	bl 0x00c32320
009b0c94	cbz x0,0x009b0d0c
009b0c98	mov x19,x0
009b0c9c	str w21,[x0]
009b0ca0	str x20,[x0, #0x10]
009b0ca4	adrp x0,0xd21000
009b0ca8	adrp x1,0x9b1000
009b0cac	add x0,x0,#0x8c0
009b0cb0	add x1,x1,#0x418
009b0cb4	bl 0x00c34d60
009b0cb8	adrp x20,0xd21000
009b0cbc	ldr x0,[x20, #0x8b8]
009b0cc0	cbz x0,0x009b0d44
009b0cc4	mov x1,x19
009b0cc8	bl 0x00c34760
009b0ccc	tbnz w0,#0x1f,0x009b0d28
009b0cd0	adrp x20,0x2af000
009b0cd4	add x20,x20,#0x931
009b0cd8	mov w2,#0x806
009b0cdc	mov x0,x19
009b0ce0	mov x1,x20
009b0ce4	bl 0x00c32310
009b0ce8	bl 0x00c342a0
009b0cec	adrp x2,0x2db000
009b0cf0	add x2,x2,#0x9a4
009b0cf4	mov w1,#0x807
009b0cf8	mov x0,x20
009b0cfc	bl 0x00c342b0
009b0d00	mov w0,#0x14
009b0d04	mov w1,#0x135
009b0d08	b 0x009b0d80
009b0d0c	bl 0x00c342a0
009b0d10	adrp x0,0x2af000
009b0d14	adrp x2,0x2db000
009b0d18	add x0,x0,#0x931
009b0d1c	add x2,x2,#0x9a4
009b0d20	orr w1,wzr,#0x7fe
009b0d24	b 0x009b0d70
009b0d28	ldr x0,[x20, #0x8b8]
009b0d2c	cbz x0,0x009b0d44
009b0d30	mov x1,x19
009b0d34	bl 0x00c347a0
009b0d38	mov w8,w0
009b0d3c	mov w0,wzr
009b0d40	cbnz w8,0x009b0d8c
009b0d44	adrp x20,0x2af000
009b0d48	add x20,x20,#0x931
009b0d4c	mov w2,#0x80b
009b0d50	mov x0,x19
009b0d54	mov x1,x20
009b0d58	bl 0x00c32310
009b0d5c	bl 0x00c342a0
009b0d60	adrp x2,0x2db000
009b0d64	add x2,x2,#0x9a4
009b0d68	mov w1,#0x80c
009b0d6c	mov x0,x20
009b0d70	bl 0x00c342b0
009b0d74	mov w1,#0x100
009b0d78	mov w0,#0x14
009b0d7c	movk w1,#0xc, LSL #16
009b0d80	mov x2,xzr
009b0d84	bl 0x00c342c0
009b0d88	mov w0,#0x1
009b0d8c	ldp x29,x30,[sp, #0x20]
009b0d90	ldp x20,x19,[sp, #0x10]
009b0d94	ldr x21,[sp], #0x30
009b0d98	ret
