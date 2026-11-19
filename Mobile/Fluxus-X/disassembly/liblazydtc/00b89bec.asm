; psa_asymmetric_encrypt @ 00b89bec
00b89bec	sub sp,sp,#0xa0
00b89bf0	stp x28,x27,[sp, #0x40]
00b89bf4	stp x26,x25,[sp, #0x50]
00b89bf8	stp x24,x23,[sp, #0x60]
00b89bfc	stp x22,x21,[sp, #0x70]
00b89c00	stp x20,x19,[sp, #0x80]
00b89c04	stp x29,x30,[sp, #0x90]
00b89c08	add x29,sp,#0x90
00b89c0c	mrs x27,tpidr_el0
00b89c10	ldr x21,[x29, #0x10]
00b89c14	ldr x8,[x27, #0x28]
00b89c18	mov w10,#0x300
00b89c1c	and w9,w1,#0xffffff00
00b89c20	movk w10,#0x700, LSL #16
00b89c24	mov x26,x7
00b89c28	mov x19,x6
00b89c2c	mov x23,x5
00b89c30	mov x24,x4
00b89c34	mov x25,x3
00b89c38	mov x22,x2
00b89c3c	mov w28,w1
00b89c40	cmp w9,w10
00b89c44	str x8,[sp, #0x38]
00b89c48	str xzr,[x21]
00b89c4c	b.eq 0x00b89c5c
00b89c50	cbz x23,0x00b89c5c
00b89c54	mov w0,#0xffffff79
00b89c58	b 0x00b89e00
00b89c5c	add x1,sp,#0x30
00b89c60	mov w2,#0x100
00b89c64	mov w3,w28
00b89c68	bl 0x00b86e5c
00b89c6c	cbnz w0,0x00b89e00
00b89c70	ldr x20,[sp, #0x30]
00b89c74	ldrh w8,[x20]
00b89c78	and w8,w8,#0x7000
00b89c7c	cmp w8,#0x7, LSL #12
00b89c80	b.eq 0x00b89c8c
00b89c84	cmp w8,#0x4, LSL #12
00b89c88	b.ne 0x00b89cfc
00b89c8c	cbz x25,0x00b89d18
00b89c90	mov w1,#0x1
00b89c94	mov x0,x25
00b89c98	bl 0x00c30a30
00b89c9c	cbz x0,0x00b89d78
00b89ca0	mov x1,x22
00b89ca4	mov x2,x25
00b89ca8	str x0,[sp, #0x28]
00b89cac	bl 0x00c2ffd0
00b89cb0	cbz x23,0x00b89d20
00b89cb4	mov w1,#0x1
00b89cb8	mov x0,x23
00b89cbc	bl 0x00c30a30
00b89cc0	mov x22,x0
00b89cc4	cbz x0,0x00b89d9c
00b89cc8	mov x0,x22
00b89ccc	mov x1,x24
00b89cd0	mov x2,x23
00b89cd4	bl 0x00c2ffd0
00b89cd8	cbz x26,0x00b89d28
00b89cdc	mov w1,#0x1
00b89ce0	mov x0,x26
00b89ce4	bl 0x00c30a30
00b89ce8	mov x24,x0
00b89cec	str x26,[sp, #0x20]
00b89cf0	cbnz x0,0x00b89d34
00b89cf4	mov x25,xzr
00b89cf8	b 0x00b89da4
00b89cfc	mov x21,xzr
00b89d00	mov x22,xzr
00b89d04	mov x25,xzr
00b89d08	mov x24,xzr
00b89d0c	mov x19,xzr
00b89d10	mov w23,#0xffffff79
00b89d14	b 0x00b89db0
00b89d18	str xzr,[sp, #0x28]
00b89d1c	cbnz x23,0x00b89cb4
00b89d20	mov x22,xzr
00b89d24	cbnz x26,0x00b89cdc
00b89d28	mov x24,xzr
00b89d2c	mov x19,xzr
00b89d30	str xzr,[sp, #0x20]
00b89d34	ldr w8,[x20, #0x4]
00b89d38	cmp w8,#0xff
00b89d3c	b.hi 0x00b89d8c
00b89d40	ldp x1,x2,[x20, #0x28]
00b89d44	stp x26,x21,[sp, #0x8]
00b89d48	ldr x21,[sp, #0x28]
00b89d4c	mov x0,x20
00b89d50	mov w3,w28
00b89d54	mov x5,x25
00b89d58	mov x4,x21
00b89d5c	mov x6,x22
00b89d60	mov x7,x23
00b89d64	str x24,[sp]
00b89d68	bl 0x00c43110
00b89d6c	ldr x20,[sp, #0x30]
00b89d70	mov w23,w0
00b89d74	b 0x00b89d94
00b89d78	mov x21,xzr
00b89d7c	mov x22,xzr
00b89d80	mov x25,xzr
00b89d84	mov x24,xzr
00b89d88	b 0x00b89da8
00b89d8c	ldr x21,[sp, #0x28]
00b89d90	mov w23,#0xffffff79
00b89d94	ldr x25,[sp, #0x20]
00b89d98	b 0x00b89db0
00b89d9c	mov x25,xzr
00b89da0	mov x24,xzr
00b89da4	ldr x21,[sp, #0x28]
00b89da8	mov x19,xzr
00b89dac	mov w23,#0xffffff73
00b89db0	mov x0,x20
00b89db4	bl 0x00c431e0
00b89db8	mov w20,w0
00b89dbc	mov x0,x21
00b89dc0	bl 0x00c30960
00b89dc4	mov x0,x22
00b89dc8	bl 0x00c30960
00b89dcc	cbz x24,0x00b89df0
00b89dd0	cbz x19,0x00b89dfc
00b89dd4	cbz x25,0x00b89de8
00b89dd8	mov x0,x19
00b89ddc	mov x1,x24
00b89de0	mov x2,x25
00b89de4	bl 0x00c2ffd0
00b89de8	mov x0,x24
00b89dec	bl 0x00c30960
00b89df0	cmp w23,#0x0
00b89df4	csel w0,w20,w23,eq
00b89df8	b 0x00b89e00
00b89dfc	mov w0,#0xffffff69
00b89e00	ldr x8,[x27, #0x28]
00b89e04	ldr x9,[sp, #0x38]
00b89e08	cmp x8,x9
00b89e0c	b.ne 0x00b89e30
00b89e10	ldp x29,x30,[sp, #0x90]
00b89e14	ldp x20,x19,[sp, #0x80]
00b89e18	ldp x22,x21,[sp, #0x70]
00b89e1c	ldp x24,x23,[sp, #0x60]
00b89e20	ldp x26,x25,[sp, #0x50]
00b89e24	ldp x28,x27,[sp, #0x40]
00b89e28	add sp,sp,#0xa0
00b89e2c	ret
00b89e30	bl 0x00c2fec0
