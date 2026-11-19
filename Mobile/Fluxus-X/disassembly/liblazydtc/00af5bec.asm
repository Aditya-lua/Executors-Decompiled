; X509V3_add1_i2d @ 00af5bec
00af5bec	stp x26,x25,[sp, #-0x50]!
00af5bf0	and x8,x4,#0xf
00af5bf4	stp x24,x23,[sp, #0x10]
00af5bf8	stp x22,x21,[sp, #0x20]
00af5bfc	stp x20,x19,[sp, #0x30]
00af5c00	mov w23,w3
00af5c04	mov x22,x2
00af5c08	mov w24,w1
00af5c0c	cmp x8,#0x1
00af5c10	mov x19,x0
00af5c14	stp x29,x30,[sp, #0x40]
00af5c18	add x29,sp,#0x40
00af5c1c	b.ne 0x00af5c78
00af5c20	mov w21,wzr
00af5c24	mov w20,#0xffffffff
00af5c28	mov w0,w24
00af5c2c	mov w1,w23
00af5c30	mov x2,x22
00af5c34	bl 0x00c3ef90
00af5c38	cbz x0,0x00af5ccc
00af5c3c	ldr x23,[x19]
00af5c40	mov x22,x0
00af5c44	cbz w21,0x00af5cf4
00af5c48	mov x0,x23
00af5c4c	mov w1,w20
00af5c50	bl 0x00c32610
00af5c54	bl 0x00c35b00
00af5c58	ldr x0,[x19]
00af5c5c	mov w1,w20
00af5c60	mov x2,x22
00af5c64	bl 0x00c38080
00af5c68	cmp x0,#0x0
00af5c6c	mov w8,#0xffffffff
00af5c70	cneg w21,w8,ne
00af5c74	b 0x00af5da8
00af5c78	ldr x0,[x19]
00af5c7c	mov w2,#0xffffffff
00af5c80	mov w1,w24
00af5c84	mov x25,x4
00af5c88	bl 0x00c3eff0
00af5c8c	mov w20,w0
00af5c90	tbnz w0,#0x1f,0x00af5d20
00af5c94	ands w8,w25,#0xf
00af5c98	b.eq 0x00af5d6c
00af5c9c	cmp w8,#0x4
00af5ca0	mov w21,#0x1
00af5ca4	b.eq 0x00af5da8
00af5ca8	cmp w8,#0x5
00af5cac	b.ne 0x00af5c28
00af5cb0	ldr x0,[x19]
00af5cb4	mov w1,w20
00af5cb8	bl 0x00c35320
00af5cbc	cbz x0,0x00af5d64
00af5cc0	bl 0x00c35b00
00af5cc4	mov w21,#0x1
00af5cc8	b 0x00af5da8
00af5ccc	bl 0x00c342a0
00af5cd0	adrp x0,0x2b8000
00af5cd4	adrp x2,0x2c8000
00af5cd8	add x0,x0,#0x6ec
00af5cdc	add x2,x2,#0x382
00af5ce0	mov w1,#0x10e
00af5ce4	bl 0x00c342b0
00af5ce8	mov w0,#0x22
00af5cec	mov w1,#0x90
00af5cf0	b 0x00af5d9c
00af5cf4	cbnz x23,0x00af5d04
00af5cf8	bl 0x00c34780
00af5cfc	mov x23,x0
00af5d00	cbz x0,0x00af5d48
00af5d04	mov x0,x23
00af5d08	mov x1,x22
00af5d0c	bl 0x00c347a0
00af5d10	cbz w0,0x00af5d48
00af5d14	str x23,[x19]
00af5d18	mov w21,#0x1
00af5d1c	b 0x00af5da8
00af5d20	and w8,w25,#0xf
00af5d24	cmp w8,#0x3
00af5d28	mov w26,#0x66
00af5d2c	b.eq 0x00af5d3c
00af5d30	cmp w8,#0x5
00af5d34	mov w21,wzr
00af5d38	b.ne 0x00af5c28
00af5d3c	mov w21,wzr
00af5d40	tbz w25,#0x4,0x00af5d78
00af5d44	b 0x00af5da8
00af5d48	ldr x8,[x19]
00af5d4c	cmp x23,x8
00af5d50	b.eq 0x00af5d5c
00af5d54	mov x0,x23
00af5d58	bl 0x00c34770
00af5d5c	mov x0,x22
00af5d60	bl 0x00c35b00
00af5d64	mov w21,#0xffffffff
00af5d68	b 0x00af5da8
00af5d6c	mov w26,#0x91
00af5d70	mov w21,wzr
00af5d74	tbnz w25,#0x4,0x00af5da8
00af5d78	bl 0x00c342a0
00af5d7c	adrp x0,0x2b8000
00af5d80	adrp x2,0x2c8000
00af5d84	add x0,x0,#0x6ec
00af5d88	add x2,x2,#0x382
00af5d8c	mov w1,#0x12e
00af5d90	bl 0x00c342b0
00af5d94	mov w0,#0x22
00af5d98	mov w1,w26
00af5d9c	mov x2,xzr
00af5da0	bl 0x00c342c0
00af5da4	mov w21,wzr
00af5da8	mov w0,w21
00af5dac	ldp x29,x30,[sp, #0x40]
00af5db0	ldp x20,x19,[sp, #0x30]
00af5db4	ldp x22,x21,[sp, #0x20]
00af5db8	ldp x24,x23,[sp, #0x10]
00af5dbc	ldp x26,x25,[sp], #0x50
00af5dc0	ret
