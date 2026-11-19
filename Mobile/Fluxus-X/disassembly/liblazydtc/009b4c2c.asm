; ssl_write_internal @ 009b4c2c
009b4c2c	sub sp,sp,#0x60
009b4c30	stp x22,x21,[sp, #0x30]
009b4c34	stp x20,x19,[sp, #0x40]
009b4c38	stp x29,x30,[sp, #0x50]
009b4c3c	ldr x8,[x0, #0x30]
009b4c40	add x29,sp,#0x50
009b4c44	cbz x8,0x009b4cb8
009b4c48	ldrb w8,[x0, #0x44]
009b4c4c	mov x20,x0
009b4c50	tbnz w8,#0x0,0x009b4ce0
009b4c54	ldr w8,[x20, #0x84]
009b4c58	mov x19,x3
009b4c5c	mov x21,x2
009b4c60	mov x22,x1
009b4c64	cmp w8,#0xa
009b4c68	b.hi 0x009b4d2c
009b4c6c	mov w9,#0x1
009b4c70	lsl w8,w9,w8
009b4c74	mov w9,#0x502
009b4c78	tst w8,w9
009b4c7c	b.eq 0x009b4d2c
009b4c80	bl 0x00c342a0
009b4c84	adrp x0,0x2c5000
009b4c88	adrp x2,0x2a1000
009b4c8c	add x0,x0,#0x652
009b4c90	add x2,x2,#0xf15
009b4c94	mov w1,#0x80c
009b4c98	bl 0x00c342b0
009b4c9c	mov w1,#0x101
009b4ca0	mov w0,#0x14
009b4ca4	movk w1,#0xc, LSL #16
009b4ca8	mov x2,xzr
009b4cac	bl 0x00c342c0
009b4cb0	mov w0,wzr
009b4cb4	b 0x009b4d18
009b4cb8	bl 0x00c342a0
009b4cbc	adrp x0,0x2c5000
009b4cc0	adrp x2,0x2a1000
009b4cc4	add x0,x0,#0x652
009b4cc8	add x2,x2,#0xf15
009b4ccc	orr w1,wzr,#0x7ff
009b4cd0	bl 0x00c342b0
009b4cd4	mov w0,#0x14
009b4cd8	mov w1,#0x114
009b4cdc	b 0x009b4d0c
009b4ce0	mov w8,#0x1
009b4ce4	str w8,[x20, #0x28]
009b4ce8	bl 0x00c342a0
009b4cec	adrp x0,0x2c5000
009b4cf0	adrp x2,0x2a1000
009b4cf4	add x0,x0,#0x652
009b4cf8	add x2,x2,#0xf15
009b4cfc	mov w1,#0x805
009b4d00	bl 0x00c342b0
009b4d04	mov w0,#0x14
009b4d08	mov w1,#0xcf
009b4d0c	mov x2,xzr
009b4d10	bl 0x00c342c0
009b4d14	mov w0,#0xffffffff
009b4d18	ldp x29,x30,[sp, #0x50]
009b4d1c	ldp x20,x19,[sp, #0x40]
009b4d20	ldp x22,x21,[sp, #0x30]
009b4d24	add sp,sp,#0x60
009b4d28	ret
009b4d2c	mov w1,#0x1
009b4d30	mov x0,x20
009b4d34	bl 0x00c35cc0
009b4d38	ldrb w8,[x20, #0x9f1]
009b4d3c	tbz w8,#0x0,0x009b4d48
009b4d40	bl 0x00c355a0
009b4d44	cbz x0,0x009b4d74
009b4d48	ldr x8,[x20, #0x8]
009b4d4c	mov x0,x20
009b4d50	mov x1,x22
009b4d54	mov x2,x21
009b4d58	ldr x4,[x8, #0x48]
009b4d5c	mov x3,x19
009b4d60	ldp x29,x30,[sp, #0x50]
009b4d64	ldp x20,x19,[sp, #0x40]
009b4d68	ldp x22,x21,[sp, #0x30]
009b4d6c	add sp,sp,#0x60
009b4d70	br x4
009b4d74	mov w8,#0x1
009b4d78	stp x20,x22,[sp, #0x8]
009b4d7c	str x21,[sp, #0x18]
009b4d80	str w8,[sp, #0x20]
009b4d84	ldr x8,[x20, #0x8]
009b4d88	adrp x2,0x9b4000
009b4d8c	add x2,x2,#0x86c
009b4d90	add x1,sp,#0x8
009b4d94	ldr x8,[x8, #0x48]
009b4d98	mov x0,x20
009b4d9c	str x8,[sp, #0x28]
009b4da0	bl 0x009b4724
009b4da4	ldr x8,[x20, #0x1d38]
009b4da8	str x8,[x19]
009b4dac	b 0x009b4d18
