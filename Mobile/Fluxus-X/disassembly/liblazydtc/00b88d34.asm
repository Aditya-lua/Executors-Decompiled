; psa_sign_message_builtin @ 00b88d34
00b88d34	sub sp,sp,#0xc0
00b88d38	str x27,[sp, #0x60]
00b88d3c	stp x26,x25,[sp, #0x70]
00b88d40	stp x24,x23,[sp, #0x80]
00b88d44	stp x22,x21,[sp, #0x90]
00b88d48	stp x20,x19,[sp, #0xa0]
00b88d4c	stp x29,x30,[sp, #0xb0]
00b88d50	add x29,sp,#0xb0
00b88d54	mrs x26,tpidr_el0
00b88d58	ldr x10,[x26, #0x28]
00b88d5c	mov w11,#0x8ff
00b88d60	and w27,w3,#0xffffff00
00b88d64	movk w11,#0x600, LSL #16
00b88d68	mov x19,x7
00b88d6c	mov x20,x6
00b88d70	mov x8,x5
00b88d74	mov x9,x4
00b88d78	mov w21,w3
00b88d7c	mov x22,x2
00b88d80	mov x23,x1
00b88d84	mov x24,x0
00b88d88	cmp w27,w11
00b88d8c	str x10,[sp, #0x58]
00b88d90	b.gt 0x00b88db8
00b88d94	mov w10,#0x200
00b88d98	movk w10,#0x600, LSL #16
00b88d9c	cmp w27,w10
00b88da0	b.eq 0x00b88df4
00b88da4	mov w10,#0x300
00b88da8	movk w10,#0x600, LSL #16
00b88dac	cmp w27,w10
00b88db0	b.eq 0x00b88df4
00b88db4	b 0x00b88de0
00b88db8	mov w10,#0x1300
00b88dbc	movk w10,#0x600, LSL #16
00b88dc0	cmp w27,w10
00b88dc4	b.eq 0x00b88df4
00b88dc8	mov w10,#0x900
00b88dcc	movk w10,#0x600, LSL #16
00b88dd0	cmp w27,w10
00b88dd4	b.ne 0x00b88de0
00b88dd8	add x25,sp,#0x18
00b88ddc	b 0x00b88e58
00b88de0	lsr w10,w21,#0x9
00b88de4	orr w10,w10,#0x1
00b88de8	orr w11,wzr,#0x30003
00b88dec	cmp w10,w11
00b88df0	b.ne 0x00b88f54
00b88df4	mov w10,#0x8ff
00b88df8	movk w10,#0x600, LSL #16
00b88dfc	cmp w27,w10
00b88e00	add x25,sp,#0x18
00b88e04	b.gt 0x00b88e20
00b88e08	mov w10,#0x200
00b88e0c	movk w10,#0x600, LSL #16
00b88e10	cmp w27,w10
00b88e14	b.eq 0x00b88e58
00b88e18	mov w10,#0x300
00b88e1c	b 0x00b88e34
00b88e20	mov w10,#0x900
00b88e24	movk w10,#0x600, LSL #16
00b88e28	cmp w27,w10
00b88e2c	b.eq 0x00b88e58
00b88e30	mov w10,#0x1300
00b88e34	movk w10,#0x600, LSL #16
00b88e38	cmp w27,w10
00b88e3c	b.eq 0x00b88e58
00b88e40	lsr w10,w21,#0x9
00b88e44	orr w10,w10,#0x1
00b88e48	orr w11,wzr,#0x30003
00b88e4c	cmp w10,w11
00b88e50	add x25,sp,#0x18
00b88e54	b.ne 0x00b88f88
00b88e58	mov w10,#0x2000000
00b88e5c	bfxil w10,w21,#0x0,#0x8
00b88e60	tst w21,#0xff
00b88e64	csel w0,wzr,w10,eq
00b88e68	mov w4,#0x40
00b88e6c	add x5,sp,#0x10
00b88e70	mov x1,x9
00b88e74	mov x2,x8
00b88e78	mov x3,x25
00b88e7c	bl 0x00c43000
00b88e80	cbnz w0,0x00b88f58
00b88e84	ldr w8,[x24, #0x4]
00b88e88	cmp w8,#0xff
00b88e8c	b.hi 0x00b88f4c
00b88e90	ldrh w9,[x24]
00b88e94	ldr x8,[x29, #0x10]
00b88e98	ldr x5,[sp, #0x10]
00b88e9c	mov w10,#0x7001
00b88ea0	cmp w9,w10
00b88ea4	b.ne 0x00b88f00
00b88ea8	mov w9,#0x200
00b88eac	movk w9,#0x600, LSL #16
00b88eb0	cmp w27,w9
00b88eb4	b.eq 0x00b88ed8
00b88eb8	mov w9,#0x1300
00b88ebc	movk w9,#0x600, LSL #16
00b88ec0	cmp w27,w9
00b88ec4	b.eq 0x00b88ed8
00b88ec8	mov w9,#0x300
00b88ecc	movk w9,#0x600, LSL #16
00b88ed0	cmp w27,w9
00b88ed4	b.ne 0x00b88f4c
00b88ed8	mov x0,x24
00b88edc	mov x1,x23
00b88ee0	mov x2,x22
00b88ee4	mov w3,w21
00b88ee8	mov x4,x25
00b88eec	mov x6,x20
00b88ef0	mov x7,x19
00b88ef4	str x8,[sp]
00b88ef8	bl 0x00c43160
00b88efc	b 0x00b88f58
00b88f00	mov w10,#0xcf00
00b88f04	and w9,w9,w10
00b88f08	mov w10,#0x4100
00b88f0c	cmp w9,w10
00b88f10	b.ne 0x00b88f54
00b88f14	lsr w9,w21,#0x9
00b88f18	orr w10,wzr,#0x30003
00b88f1c	cmp w9,w10
00b88f20	b.ne 0x00b88f4c
00b88f24	mov x0,x24
00b88f28	mov x1,x23
00b88f2c	mov x2,x22
00b88f30	mov w3,w21
00b88f34	mov x4,x25
00b88f38	mov x6,x20
00b88f3c	mov x7,x19
00b88f40	str x8,[sp]
00b88f44	bl 0x00c42f20
00b88f48	b 0x00b88f58
00b88f4c	mov w0,#0xffffff79
00b88f50	b 0x00b88f58
00b88f54	mov w0,#0xffffff7a
00b88f58	ldr x8,[x26, #0x28]
00b88f5c	ldr x9,[sp, #0x58]
00b88f60	cmp x8,x9
00b88f64	b.ne 0x00b88f90
00b88f68	ldp x29,x30,[sp, #0xb0]
00b88f6c	ldp x20,x19,[sp, #0xa0]
00b88f70	ldp x22,x21,[sp, #0x90]
00b88f74	ldp x24,x23,[sp, #0x80]
00b88f78	ldp x26,x25,[sp, #0x70]
00b88f7c	ldr x27,[sp, #0x60]
00b88f80	add sp,sp,#0xc0
00b88f84	ret
00b88f88	mov w0,wzr
00b88f8c	b 0x00b88e68
00b88f90	bl 0x00c2fec0
