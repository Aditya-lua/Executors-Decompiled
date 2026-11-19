; ix::Socket::readLine @ 00984c78
00984c78	sub sp,sp,#0x80
00984c7c	stp x26,x25,[sp, #0x30]
00984c80	stp x24,x23,[sp, #0x40]
00984c84	stp x22,x21,[sp, #0x50]
00984c88	stp x20,x19,[sp, #0x60]
00984c8c	stp x29,x30,[sp, #0x70]
00984c90	add x29,sp,#0x70
00984c94	mrs x24,tpidr_el0
00984c98	mov x19,x8
00984c9c	ldr x8,[x24, #0x28]
00984ca0	mov x20,x1
00984ca4	mov x21,x0
00984ca8	str x8,[sp, #0x28]
00984cac	stp xzr,xzr,[sp, #0x8]
00984cb0	str xzr,[sp, #0x18]
00984cb4	add x0,sp,#0x8
00984cb8	mov w1,#0x40
00984cbc	add x23,sp,#0x8
00984cc0	bl 0x00c308b0
00984cc4	mov x25,xzr
00984cc8	add x22,x21,#0x38
00984ccc	orr x26,x23,#0x1
00984cd0	cmp x25,#0x1
00984cd4	b.hi 0x00984ce8
00984cd8	b 0x00984d14
00984cdc	add x25,x25,#0x1
00984ce0	cmp x25,#0x1
00984ce4	b.ls 0x00984d14
00984ce8	ldrb w8,[sp, #0x8]
00984cec	ldr x23,[sp, #0x18]
00984cf0	tst w8,#0x1
00984cf4	csel x9,x26,x23,eq
00984cf8	add x9,x9,x25
00984cfc	ldurb w10,[x9, #-0x2]
00984d00	cmp w10,#0xd
00984d04	b.eq 0x00984e7c
00984d08	ldurb w9,[x9, #-0x1]
00984d0c	cmp w9,#0xa
00984d10	b.eq 0x00984e7c
00984d14	ldr x0,[x20, #0x20]
00984d18	cbz x0,0x00984d2c
00984d1c	ldr x8,[x0]
00984d20	ldr x8,[x8, #0x30]
00984d24	blr x8
00984d28	tbnz w0,#0x0,0x00984db0
00984d2c	ldr x8,[x21]
00984d30	ldr x8,[x8, #0x30]
00984d34	add x1,sp,#0x24
00984d38	mov w2,#0x1
00984d3c	mov x0,x21
00984d40	blr x8
00984d44	cmp x0,#0x1
00984d48	b.eq 0x00984da0
00984d4c	tbz x0,#0x3f,0x00984db0
00984d50	bl 0x00c30710
00984d54	ldr w8,[x0]
00984d58	cmp w8,#0x73
00984d5c	b.eq 0x00984d68
00984d60	cmp w8,#0xb
00984d64	b.ne 0x00984db0
00984d68	add x8,x21,#0x8
00984d6c	ldar w9,[x8]
00984d70	cmn w9,#0x1
00984d74	b.eq 0x00984db0
00984d78	ldar w2,[x8]
00984d7c	mov w0,#0x1
00984d80	mov w1,#0x1
00984d84	mov x3,x22
00984d88	bl 0x00c33550
00984d8c	cmp w0,#0x3
00984d90	cset w8,ne
00984d94	and w23,w23,w8
00984d98	b.ne 0x00984d14
00984d9c	tbz w23,#0x0,0x00984db0
00984da0	ldrb w1,[sp, #0x24]
00984da4	add x0,sp,#0x8
00984da8	bl 0x00c30150
00984dac	b 0x00984cdc
00984db0	ldrb w8,[sp, #0x8]
00984db4	mov x20,x19
00984db8	strb wzr,[x19]
00984dbc	str xzr,[x20, #0x8]!
00984dc0	stp xzr,xzr,[x19, #0x10]
00984dc4	tbnz w8,#0x0,0x00984e14
00984dc8	ldr x8,[sp, #0x18]
00984dcc	ldur q0,[sp, #0x8]
00984dd0	str x8,[x20, #0x10]
00984dd4	str q0,[x20]
00984dd8	ldrb w8,[sp, #0x8]
00984ddc	tbz w8,#0x0,0x00984de8
00984de0	ldr x0,[sp, #0x18]
00984de4	bl 0x00c301d0
00984de8	ldr x8,[x24, #0x28]
00984dec	ldr x9,[sp, #0x28]
00984df0	cmp x8,x9
00984df4	b.ne 0x00984ee4
00984df8	ldp x29,x30,[sp, #0x70]
00984dfc	ldp x20,x19,[sp, #0x60]
00984e00	ldp x22,x21,[sp, #0x50]
00984e04	ldp x24,x23,[sp, #0x40]
00984e08	ldp x26,x25,[sp, #0x30]
00984e0c	add sp,sp,#0x80
00984e10	ret
00984e14	ldr x21,[sp, #0x10]
00984e18	cmn x21,#0x10
00984e1c	b.cs 0x00984ee8
00984e20	ldr x22,[sp, #0x18]
00984e24	cmp x21,#0x17
00984e28	b.cs 0x00984e3c
00984e2c	lsl w8,w21,#0x1
00984e30	strb w8,[x20], #0x1
00984e34	cbnz x21,0x00984e5c
00984e38	b 0x00984e6c
00984e3c	add x8,x21,#0x10
00984e40	and x23,x8,#-0x10
00984e44	mov x0,x23
00984e48	bl 0x00c2fed0
00984e4c	orr x8,x23,#0x1
00984e50	mov x20,x0
00984e54	stp x21,x0,[x19, #0x10]
00984e58	str x8,[x19, #0x8]
00984e5c	mov x0,x20
00984e60	mov x1,x22
00984e64	mov x2,x21
00984e68	bl 0x00c2ffd0
00984e6c	strb wzr,[x20, x21]
00984e70	ldrb w8,[sp, #0x8]
00984e74	tbnz w8,#0x0,0x00984de0
00984e78	b 0x00984de8
00984e7c	mov w9,#0x1
00984e80	mov x20,x19
00984e84	strb w9,[x19]
00984e88	str xzr,[x20, #0x8]!
00984e8c	stp xzr,xzr,[x19, #0x10]
00984e90	tbz w8,#0x0,0x00984dc8
00984e94	ldr x21,[sp, #0x10]
00984e98	cmn x21,#0x10
00984e9c	b.cs 0x00984ef0
00984ea0	cmp x21,#0x17
00984ea4	b.cs 0x00984eb8
00984ea8	lsl w8,w21,#0x1
00984eac	strb w8,[x20], #0x1
00984eb0	cbnz x21,0x00984ed8
00984eb4	b 0x00984e6c
00984eb8	add x8,x21,#0x10
00984ebc	and x22,x8,#-0x10
00984ec0	mov x0,x22
00984ec4	bl 0x00c2fed0
00984ec8	orr x8,x22,#0x1
00984ecc	mov x20,x0
00984ed0	stp x21,x0,[x19, #0x10]
00984ed4	str x8,[x19, #0x8]
00984ed8	mov x0,x20
00984edc	mov x1,x23
00984ee0	b 0x00984e64
00984ee4	bl 0x00c2fec0
00984ee8	mov x0,x20
00984eec	bl 0x00c30ce0
00984ef0	mov x0,x20
00984ef4	bl 0x00c30ce0
