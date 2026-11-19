; mbedtls_psa_cipher_update @ 00b98d1c
00b98d1c	sub sp,sp,#0x70
00b98d20	str x27,[sp, #0x10]
00b98d24	stp x26,x25,[sp, #0x20]
00b98d28	stp x24,x23,[sp, #0x30]
00b98d2c	stp x22,x21,[sp, #0x40]
00b98d30	stp x20,x19,[sp, #0x50]
00b98d34	stp x29,x30,[sp, #0x60]
00b98d38	add x29,sp,#0x60
00b98d3c	mrs x27,tpidr_el0
00b98d40	ldr x8,[x27, #0x28]
00b98d44	mov w10,#0x4800000
00b98d48	mov x20,x5
00b98d4c	mov x24,x4
00b98d50	str x8,[sp, #0x8]
00b98d54	ldr w8,[x0]
00b98d58	mov x23,x3
00b98d5c	mov x19,x2
00b98d60	mov x22,x1
00b98d64	and w9,w8,#0x7f800000
00b98d68	mov x21,x0
00b98d6c	cmp w9,w10
00b98d70	mov x9,x2
00b98d74	b.eq 0x00b98d8c
00b98d78	ldr x9,[x21, #0x38]
00b98d7c	ldrb w10,[x21, #0x5]
00b98d80	add x9,x9,x19
00b98d84	udiv x9,x9,x10
00b98d88	mul x9,x9,x10
00b98d8c	cmp x9,x24
00b98d90	b.ls 0x00b98d9c
00b98d94	mov w0,#0xffffff76
00b98d98	b 0x00b98f10
00b98d9c	mov w9,#0x4400
00b98da0	movk w9,#0x440, LSL #16
00b98da4	cmp w8,w9
00b98da8	b.ne 0x00b98dc4
00b98dac	mov x24,x21
00b98db0	ldr x8,[x24, #0x8]!
00b98db4	cbz x8,0x00b98df8
00b98db8	ldr w8,[x8, #0x8]
00b98dbc	and x25,x8,#0x1f
00b98dc0	b 0x00b98dfc
00b98dc4	cbz x19,0x00b98f08
00b98dc8	add x0,x21,#0x8
00b98dcc	mov x1,x22
00b98dd0	mov x2,x19
00b98dd4	mov x3,x23
00b98dd8	mov x4,x20
00b98ddc	bl 0x00c42180
00b98de0	bl 0x00c42bf0
00b98de4	ldr x8,[x20]
00b98de8	cmp x8,x24
00b98dec	b.ls 0x00b98f10
00b98df0	mov w0,#0xffffff69
00b98df4	b 0x00b98f10
00b98df8	mov x25,xzr
00b98dfc	str xzr,[sp]
00b98e00	str xzr,[x20]
00b98e04	cbz x19,0x00b98f00
00b98e08	ldr x8,[x21, #0x38]
00b98e0c	cbz x8,0x00b98e84
00b98e10	sub x9,x25,x8
00b98e14	cmp x9,x19
00b98e18	add x8,x21,x8
00b98e1c	csel x26,x19,x9,hi
00b98e20	add x0,x8,#0x28
00b98e24	mov x1,x22
00b98e28	mov x2,x26
00b98e2c	bl 0x00c2ffd0
00b98e30	ldr x8,[x21, #0x38]
00b98e34	sub x19,x19,x26
00b98e38	add x22,x22,x26
00b98e3c	add x8,x8,x26
00b98e40	cmp x8,x25
00b98e44	str x8,[x21, #0x38]
00b98e48	b.ne 0x00b98e84
00b98e4c	add x1,x21,#0x28
00b98e50	mov x4,sp
00b98e54	mov x0,x24
00b98e58	mov x2,x25
00b98e5c	mov x3,x23
00b98e60	bl 0x00c42180
00b98e64	bl 0x00c42bf0
00b98e68	cbnz w0,0x00b98f10
00b98e6c	ldr x8,[sp]
00b98e70	ldr x9,[x20]
00b98e74	add x23,x23,x8
00b98e78	add x8,x9,x8
00b98e7c	str x8,[x20]
00b98e80	str xzr,[x21, #0x38]
00b98e84	cmp x19,x25
00b98e88	b.cc 0x00b98ed0
00b98e8c	mov x4,sp
00b98e90	mov x0,x24
00b98e94	mov x1,x22
00b98e98	mov x2,x25
00b98e9c	mov x3,x23
00b98ea0	bl 0x00c42180
00b98ea4	bl 0x00c42bf0
00b98ea8	cbnz w0,0x00b98f10
00b98eac	ldr x8,[sp]
00b98eb0	ldr x9,[x20]
00b98eb4	sub x19,x19,x25
00b98eb8	add x22,x22,x25
00b98ebc	add x23,x23,x8
00b98ec0	add x8,x9,x8
00b98ec4	cmp x19,x25
00b98ec8	str x8,[x20]
00b98ecc	b.cs 0x00b98e8c
00b98ed0	cbz x19,0x00b98f00
00b98ed4	ldr x8,[x21, #0x38]
00b98ed8	mov x1,x22
00b98edc	mov x2,x19
00b98ee0	add x8,x21,x8
00b98ee4	add x0,x8,#0x28
00b98ee8	bl 0x00c2ffd0
00b98eec	ldr x8,[x21, #0x38]
00b98ef0	mov w0,wzr
00b98ef4	add x8,x8,x19
00b98ef8	str x8,[x21, #0x38]
00b98efc	b 0x00b98f10
00b98f00	mov w0,wzr
00b98f04	b 0x00b98f10
00b98f08	mov w0,wzr
00b98f0c	str xzr,[x20]
00b98f10	ldr x8,[x27, #0x28]
00b98f14	ldr x9,[sp, #0x8]
00b98f18	cmp x8,x9
00b98f1c	b.ne 0x00b98f40
00b98f20	ldp x29,x30,[sp, #0x60]
00b98f24	ldp x20,x19,[sp, #0x50]
00b98f28	ldp x22,x21,[sp, #0x40]
00b98f2c	ldp x24,x23,[sp, #0x30]
00b98f30	ldp x26,x25,[sp, #0x20]
00b98f34	ldr x27,[sp, #0x10]
00b98f38	add sp,sp,#0x70
00b98f3c	ret
00b98f40	bl 0x00c2fec0
