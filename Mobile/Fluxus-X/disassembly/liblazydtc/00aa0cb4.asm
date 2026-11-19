; ossl_pw_set_passphrase @ 00aa0cb4
00aa0cb4	str x21,[sp, #-0x30]!
00aa0cb8	stp x20,x19,[sp, #0x10]
00aa0cbc	stp x29,x30,[sp, #0x20]
00aa0cc0	add x29,sp,#0x20
00aa0cc4	cbz x0,0x00aa0d50
00aa0cc8	mov x21,x1
00aa0ccc	cbz x1,0x00aa0d50
00aa0cd0	ldr w8,[x0]
00aa0cd4	mov x19,x2
00aa0cd8	mov x20,x0
00aa0cdc	cmp w8,#0x1
00aa0ce0	b.ne 0x00aa0cf8
00aa0ce4	ldp x0,x1,[x20, #0x8]
00aa0ce8	adrp x2,0x2b0000
00aa0cec	add x2,x2,#0x38e
00aa0cf0	mov w3,#0x15
00aa0cf4	bl 0x00c345e0
00aa0cf8	ldp x0,x1,[x20, #0x20]
00aa0cfc	adrp x2,0x2b0000
00aa0d00	add x2,x2,#0x38e
00aa0d04	mov w3,#0x1d
00aa0d08	bl 0x00c345e0
00aa0d0c	movi v0.2D,#0x0
00aa0d10	mov w8,#0x1
00aa0d14	stp q0,q0,[x20, #0x10]
00aa0d18	str q0,[x20]
00aa0d1c	str w8,[x20]
00aa0d20	cbz x19,0x00aa0d80
00aa0d24	adrp x2,0x2b0000
00aa0d28	add x2,x2,#0x38e
00aa0d2c	mov w3,#0x2c
00aa0d30	mov x0,x21
00aa0d34	mov x1,x19
00aa0d38	bl 0x00c345f0
00aa0d3c	str x0,[x20, #0x8]
00aa0d40	cbz x0,0x00aa0d9c
00aa0d44	mov w0,#0x1
00aa0d48	str x19,[x20, #0x10]
00aa0d4c	b 0x00aa0dd0
00aa0d50	bl 0x00c342a0
00aa0d54	adrp x0,0x2b0000
00aa0d58	adrp x2,0x2aa000
00aa0d5c	add x0,x0,#0x38e
00aa0d60	add x2,x2,#0x49e
00aa0d64	mov w1,#0x26
00aa0d68	bl 0x00c342b0
00aa0d6c	mov w8,#0x100
00aa0d70	movk w8,#0xc, LSL #16
00aa0d74	add w1,w8,#0x2
00aa0d78	orr w0,wzr,#0xf
00aa0d7c	b 0x00aa0dc4
00aa0d80	adrp x1,0x2b0000
00aa0d84	add x1,x1,#0x38e
00aa0d88	mov w0,#0x1
00aa0d8c	mov w2,#0x2d
00aa0d90	bl 0x00c32320
00aa0d94	str x0,[x20, #0x8]
00aa0d98	cbnz x0,0x00aa0d44
00aa0d9c	bl 0x00c342a0
00aa0da0	adrp x0,0x2b0000
00aa0da4	adrp x2,0x2aa000
00aa0da8	add x0,x0,#0x38e
00aa0dac	add x2,x2,#0x49e
00aa0db0	mov w1,#0x2f
00aa0db4	bl 0x00c342b0
00aa0db8	mov w1,#0x100
00aa0dbc	orr w0,wzr,#0xf
00aa0dc0	movk w1,#0xc, LSL #16
00aa0dc4	mov x2,xzr
00aa0dc8	bl 0x00c342c0
00aa0dcc	mov w0,wzr
00aa0dd0	ldp x29,x30,[sp, #0x20]
00aa0dd4	ldp x20,x19,[sp, #0x10]
00aa0dd8	ldr x21,[sp], #0x30
00aa0ddc	ret
