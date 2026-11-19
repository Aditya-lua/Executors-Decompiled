; mbedtls_psa_aead_encrypt @ 00b97bcc
00b97bcc	str x28,[sp, #-0x60]!
00b97bd0	stp x26,x25,[sp, #0x10]
00b97bd4	stp x24,x23,[sp, #0x20]
00b97bd8	stp x22,x21,[sp, #0x30]
00b97bdc	stp x20,x19,[sp, #0x40]
00b97be0	stp x29,x30,[sp, #0x50]
00b97be4	add x29,sp,#0x50
00b97be8	sub sp,sp,#0x1d0
00b97bec	mrs x26,tpidr_el0
00b97bf0	ldr x8,[x26, #0x28]
00b97bf4	mov x23,x1
00b97bf8	mov x25,x0
00b97bfc	add x0,sp,#0x18
00b97c00	mov w2,#0x1b0
00b97c04	mov w1,wzr
00b97c08	mov x20,x7
00b97c0c	mov x21,x6
00b97c10	mov x24,x5
00b97c14	mov x22,x4
00b97c18	mov w19,w3
00b97c1c	stur x8,[x29, #-0x58]
00b97c20	bl 0x00c301c0
00b97c24	add x0,sp,#0x18
00b97c28	mov x1,x25
00b97c2c	mov x2,x23
00b97c30	mov w3,w19
00b97c34	bl 0x00b97e00
00b97c38	mov w23,w0
00b97c3c	cbnz w0,0x00b97d5c
00b97c40	ldr x19,[x29, #0x18]
00b97c44	ldrb w10,[sp, #0x1f]
00b97c48	ldr x8,[x29, #0x28]
00b97c4c	add x9,x10,x19
00b97c50	cmp x9,x8
00b97c54	b.ls 0x00b97c60
00b97c58	mov w23,#0xffffff76
00b97c5c	b 0x00b97d5c
00b97c60	ldr w11,[sp, #0x18]
00b97c64	ldr x7,[x29, #0x20]
00b97c68	ldr x8,[x29, #0x10]
00b97c6c	mov w9,#0x500
00b97c70	movk w9,#0x510, LSL #16
00b97c74	cmp w11,w9
00b97c78	add x9,x7,x19
00b97c7c	b.eq 0x00b97ccc
00b97c80	mov w12,#0x200
00b97c84	movk w12,#0x550, LSL #16
00b97c88	cmp w11,w12
00b97c8c	b.eq 0x00b97d00
00b97c90	mov w12,#0x100
00b97c94	movk w12,#0x550, LSL #16
00b97c98	cmp w11,w12
00b97c9c	b.ne 0x00b97d50
00b97ca0	add x11,sp,#0x18
00b97ca4	add x0,x11,#0x8
00b97ca8	mov x1,x19
00b97cac	mov x2,x22
00b97cb0	mov x3,x24
00b97cb4	mov x4,x21
00b97cb8	mov x5,x20
00b97cbc	mov x6,x8
00b97cc0	stp x9,x10,[sp]
00b97cc4	bl 0x00c41fe0
00b97cc8	b 0x00b97d30
00b97ccc	cmp w10,#0x10
00b97cd0	b.ne 0x00b97d58
00b97cd4	add x10,sp,#0x18
00b97cd8	add x0,x10,#0x8
00b97cdc	mov x1,x19
00b97ce0	mov x2,x22
00b97ce4	mov x3,x21
00b97ce8	mov x4,x20
00b97cec	mov x5,x8
00b97cf0	mov x6,x7
00b97cf4	mov x7,x9
00b97cf8	bl 0x00c420d0
00b97cfc	b 0x00b97d30
00b97d00	add x11,sp,#0x18
00b97d04	add x0,x11,#0x8
00b97d08	mov w1,#0x1
00b97d0c	str x7,[sp]
00b97d10	mov x2,x19
00b97d14	mov x3,x22
00b97d18	mov x4,x24
00b97d1c	mov x5,x21
00b97d20	mov x6,x20
00b97d24	mov x7,x8
00b97d28	stp x10,x9,[sp, #0x8]
00b97d2c	bl 0x00c421b0
00b97d30	bl 0x00c42bf0
00b97d34	mov w23,w0
00b97d38	cbnz w0,0x00b97d5c
00b97d3c	ldrb w8,[sp, #0x1f]
00b97d40	ldr x9,[x29, #0x30]
00b97d44	add x8,x8,x19
00b97d48	str x8,[x9]
00b97d4c	b 0x00b97d5c
00b97d50	mov w23,#0xffffff7a
00b97d54	b 0x00b97dc8
00b97d58	mov w23,#0xffffff7a
00b97d5c	ldr w8,[sp, #0x18]
00b97d60	mov w9,#0x500
00b97d64	movk w9,#0x510, LSL #16
00b97d68	cmp w8,w9
00b97d6c	b.eq 0x00b97db0
00b97d70	mov w9,#0x200
00b97d74	movk w9,#0x550, LSL #16
00b97d78	cmp w8,w9
00b97d7c	b.eq 0x00b97da0
00b97d80	mov w9,#0x100
00b97d84	movk w9,#0x550, LSL #16
00b97d88	cmp w8,w9
00b97d8c	b.ne 0x00b97dbc
00b97d90	add x8,sp,#0x18
00b97d94	add x0,x8,#0x8
00b97d98	bl 0x00c42000
00b97d9c	b 0x00b97dbc
00b97da0	add x8,sp,#0x18
00b97da4	add x0,x8,#0x8
00b97da8	bl 0x00c42380
00b97dac	b 0x00b97dbc
00b97db0	add x8,sp,#0x18
00b97db4	add x0,x8,#0x8
00b97db8	bl 0x00c420f0
00b97dbc	ldrb w8,[sp, #0x1e]
00b97dc0	and w8,w8,#0xfe
00b97dc4	strb w8,[sp, #0x1e]
00b97dc8	ldr x8,[x26, #0x28]
00b97dcc	ldur x9,[x29, #-0x58]
00b97dd0	cmp x8,x9
00b97dd4	b.ne 0x00b97dfc
00b97dd8	mov w0,w23
00b97ddc	add sp,sp,#0x1d0
00b97de0	ldp x29,x30,[sp, #0x50]
00b97de4	ldp x20,x19,[sp, #0x40]
00b97de8	ldp x22,x21,[sp, #0x30]
00b97dec	ldp x24,x23,[sp, #0x20]
00b97df0	ldp x26,x25,[sp, #0x10]
00b97df4	ldr x28,[sp], #0x60
00b97df8	ret
00b97dfc	bl 0x00c2fec0
