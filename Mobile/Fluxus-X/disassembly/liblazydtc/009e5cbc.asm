; parse_ca_names @ 009e5cbc
009e5cbc	sub sp,sp,#0x50
009e5cc0	stp x20,x19,[sp, #0x30]
009e5cc4	mov x20,x0
009e5cc8	adrp x0,0x9e5000
009e5ccc	add x0,x0,#0xee0
009e5cd0	stp x24,x23,[sp, #0x10]
009e5cd4	stp x22,x21,[sp, #0x20]
009e5cd8	stp x29,x30,[sp, #0x40]
009e5cdc	add x29,sp,#0x40
009e5ce0	mov x21,x1
009e5ce4	bl 0x00c35340
009e5ce8	mov x19,x0
009e5cec	cbz x0,0x009e5d3c
009e5cf0	ldr x8,[x21, #0x8]
009e5cf4	subs x9,x8,#0x2
009e5cf8	b.cc 0x009e5d14
009e5cfc	ldr x8,[x21]
009e5d00	ldrb w10,[x8]
009e5d04	ldrb w23,[x8, #0x1]
009e5d08	bfm x23,x10,#0x38,#0x7
009e5d0c	subs x9,x9,x23
009e5d10	b.cs 0x009e5da8
009e5d14	bl 0x00c342a0
009e5d18	adrp x0,0x2bb000
009e5d1c	adrp x2,0x2c9000
009e5d20	add x0,x0,#0x912
009e5d24	add x2,x2,#0x57e
009e5d28	mov w1,#0x8d0
009e5d2c	bl 0x00c342b0
009e5d30	mov w1,#0x32
009e5d34	mov w2,#0x9f
009e5d38	b 0x009e5d64
009e5d3c	bl 0x00c342a0
009e5d40	adrp x0,0x2bb000
009e5d44	adrp x2,0x2c9000
009e5d48	add x0,x0,#0x912
009e5d4c	add x2,x2,#0x57e
009e5d50	mov w1,#0x8cb
009e5d54	bl 0x00c342b0
009e5d58	mov w2,#0x100
009e5d5c	mov w1,#0x50
009e5d60	movk w2,#0xc, LSL #16
009e5d64	mov x0,x20
009e5d68	mov x3,xzr
009e5d6c	bl 0x00c34410
009e5d70	mov x21,xzr
009e5d74	adrp x1,0xcb5000
009e5d78	ldr x1,[x1, #0x140]
009e5d7c	mov x0,x19
009e5d80	bl 0x00c32600
009e5d84	mov x0,x21
009e5d88	bl 0x00c34810
009e5d8c	mov w0,wzr
009e5d90	ldp x29,x30,[sp, #0x40]
009e5d94	ldp x20,x19,[sp, #0x30]
009e5d98	ldp x22,x21,[sp, #0x20]
009e5d9c	ldp x24,x23,[sp, #0x10]
009e5da0	add sp,sp,#0x50
009e5da4	ret
009e5da8	add x24,x8,#0x2
009e5dac	add x8,x24,x23
009e5db0	stp x8,x9,[x21]
009e5db4	cbz x23,0x009e5e1c
009e5db8	cmp x23,#0x1
009e5dbc	b.eq 0x009e5e38
009e5dc0	ldrb w8,[x24]
009e5dc4	ldrb w22,[x24, #0x1]
009e5dc8	bfm x22,x8,#0x38,#0x7
009e5dcc	sub x8,x23,#0x2
009e5dd0	subs x23,x8,x22
009e5dd4	b.cc 0x009e5e38
009e5dd8	add x24,x24,#0x2
009e5ddc	add x1,sp,#0x8
009e5de0	mov x0,xzr
009e5de4	mov x2,x22
009e5de8	str x24,[sp, #0x8]
009e5dec	bl 0x00c37290
009e5df0	mov x21,x0
009e5df4	cbz x0,0x009e5e54
009e5df8	ldr x8,[sp, #0x8]
009e5dfc	add x24,x24,x22
009e5e00	cmp x8,x24
009e5e04	b.ne 0x009e5e80
009e5e08	mov x0,x19
009e5e0c	mov x1,x21
009e5e10	bl 0x00c347a0
009e5e14	cbz w0,0x009e5ea8
009e5e18	cbnz x23,0x009e5db8
009e5e1c	adrp x1,0xcb5000
009e5e20	ldr x0,[x20, #0x308]
009e5e24	ldr x1,[x1, #0x140]
009e5e28	bl 0x00c32600
009e5e2c	mov w0,#0x1
009e5e30	str x19,[x20, #0x308]
009e5e34	b 0x009e5d90
009e5e38	bl 0x00c342a0
009e5e3c	adrp x0,0x2bb000
009e5e40	adrp x2,0x2c9000
009e5e44	add x0,x0,#0x912
009e5e48	add x2,x2,#0x57e
009e5e4c	mov w1,#0x8da
009e5e50	b 0x009e5d2c
009e5e54	bl 0x00c342a0
009e5e58	adrp x0,0x2bb000
009e5e5c	adrp x2,0x2c9000
009e5e60	add x0,x0,#0x912
009e5e64	add x2,x2,#0x57e
009e5e68	mov w1,#0x8e0
009e5e6c	bl 0x00c342b0
009e5e70	mov w2,#0xd
009e5e74	mov w1,#0x32
009e5e78	movk w2,#0x8, LSL #16
009e5e7c	b 0x009e5ed0
009e5e80	bl 0x00c342a0
009e5e84	adrp x0,0x2bb000
009e5e88	adrp x2,0x2c9000
009e5e8c	add x0,x0,#0x912
009e5e90	add x2,x2,#0x57e
009e5e94	mov w1,#0x8e4
009e5e98	bl 0x00c342b0
009e5e9c	mov w1,#0x32
009e5ea0	mov w2,#0x83
009e5ea4	b 0x009e5ed0
009e5ea8	bl 0x00c342a0
009e5eac	adrp x0,0x2bb000
009e5eb0	adrp x2,0x2c9000
009e5eb4	add x0,x0,#0x912
009e5eb8	add x2,x2,#0x57e
009e5ebc	mov w1,#0x8e9
009e5ec0	bl 0x00c342b0
009e5ec4	mov w2,#0x100
009e5ec8	mov w1,#0x50
009e5ecc	movk w2,#0xc, LSL #16
009e5ed0	mov x0,x20
009e5ed4	mov x3,xzr
009e5ed8	bl 0x00c34410
009e5edc	b 0x009e5d74
