; FUN_00af1d18 @ 00af1d18
00af1d18	stp x28,x27,[sp, #-0x60]!
00af1d1c	stp x26,x25,[sp, #0x10]
00af1d20	stp x24,x23,[sp, #0x20]
00af1d24	stp x22,x21,[sp, #0x30]
00af1d28	stp x20,x19,[sp, #0x40]
00af1d2c	stp x29,x30,[sp, #0x50]
00af1d30	add x29,sp,#0x50
00af1d34	cbz x1,0x00af1ea0
00af1d38	ldrb w8,[x1]
00af1d3c	mov x23,x1
00af1d40	cbz w8,0x00af1ea0
00af1d44	adrp x21,0x2ae000
00af1d48	adrp x22,0xaf1000
00af1d4c	mov w19,w2
00af1d50	mov x20,x0
00af1d54	add x21,x21,#0x704
00af1d58	add x22,x22,#0xfbc
00af1d5c	mov x27,x23
00af1d60	ands w8,w8,#0xff
00af1d64	b.eq 0x00af1d8c
00af1d68	cmp w8,#0x3a
00af1d6c	b.eq 0x00af1d8c
00af1d70	add x28,x27,#0x1
00af1d74	ldrb w8,[x27]
00af1d78	cbz w8,0x00af1e98
00af1d7c	ldrb w8,[x28]
00af1d80	mov x27,x28
00af1d84	ands w8,w8,#0xff
00af1d88	b.ne 0x00af1d68
00af1d8c	subs x24,x27,x23
00af1d90	add x28,x27,#0x1
00af1d94	b.eq 0x00af1e0c
00af1d98	ldr x0,[x20, #0x8]
00af1d9c	bl 0x00c325e0
00af1da0	cmp w0,#0x1
00af1da4	b.lt 0x00af1df8
00af1da8	mov w25,wzr
00af1dac	ldr x0,[x20, #0x8]
00af1db0	mov w1,w25
00af1db4	bl 0x00c32610
00af1db8	ldr x26,[x0]
00af1dbc	mov x0,x26
00af1dc0	bl 0x00c2ff50
00af1dc4	cmp x0,x24
00af1dc8	b.ne 0x00af1de0
00af1dcc	mov x0,x26
00af1dd0	mov x1,x23
00af1dd4	mov x2,x24
00af1dd8	bl 0x00c31bb0
00af1ddc	cbz w0,0x00af1dfc
00af1de0	ldr x0,[x20, #0x8]
00af1de4	add w25,w25,#0x1
00af1de8	bl 0x00c325e0
00af1dec	cmp w25,w0
00af1df0	b.lt 0x00af1dac
00af1df4	b 0x00af1dfc
00af1df8	mov w25,wzr
00af1dfc	ldr x0,[x20, #0x8]
00af1e00	bl 0x00c325e0
00af1e04	cmp w25,w0
00af1e08	b.ge 0x00af1e1c
00af1e0c	mov x23,x28
00af1e10	ldrb w8,[x27]
00af1e14	cbnz w8,0x00af1d7c
00af1e18	b 0x00af1e98
00af1e1c	ldr x8,[x20, #0x8]
00af1e20	cbnz x8,0x00af1e30
00af1e24	bl 0x00c34780
00af1e28	str x0,[x20, #0x8]
00af1e2c	cbz x0,0x00af1f90
00af1e30	orr w0,wzr,#0x18
00af1e34	mov w2,#0xcc
00af1e38	mov x1,x21
00af1e3c	bl 0x00c32320
00af1e40	cbz x0,0x00af1f24
00af1e44	mov x25,x0
00af1e48	str w19,[x0, #0x8]
00af1e4c	mov x0,x22
00af1e50	bl 0x00c35340
00af1e54	str x0,[x25, #0x10]
00af1e58	mov w3,#0xd3
00af1e5c	mov x0,x23
00af1e60	mov x1,x24
00af1e64	mov x2,x21
00af1e68	bl 0x00c36180
00af1e6c	str x0,[x25]
00af1e70	cbz x0,0x00af1eec
00af1e74	ldr x8,[x25, #0x10]
00af1e78	cbz x8,0x00af1eec
00af1e7c	ldr x0,[x20, #0x8]
00af1e80	mov x1,x25
00af1e84	bl 0x00c347a0
00af1e88	mov x23,x28
00af1e8c	cbz w0,0x00af1f40
00af1e90	ldrb w8,[x27]
00af1e94	cbnz w8,0x00af1d7c
00af1e98	mov w0,#0x1
00af1e9c	b 0x00af1ed0
00af1ea0	bl 0x00c342a0
00af1ea4	adrp x0,0x2ae000
00af1ea8	adrp x2,0x2d8000
00af1eac	add x0,x0,#0x704
00af1eb0	add x2,x2,#0x7dd
00af1eb4	mov w1,#0xaf
00af1eb8	bl 0x00c342b0
00af1ebc	mov w0,#0xb
00af1ec0	mov w1,#0x71
00af1ec4	mov x2,xzr
00af1ec8	bl 0x00c342c0
00af1ecc	mov w0,wzr
00af1ed0	ldp x29,x30,[sp, #0x50]
00af1ed4	ldp x20,x19,[sp, #0x40]
00af1ed8	ldp x22,x21,[sp, #0x30]
00af1edc	ldp x24,x23,[sp, #0x20]
00af1ee0	ldp x26,x25,[sp, #0x10]
00af1ee4	ldp x28,x27,[sp], #0x60
00af1ee8	ret
00af1eec	adrp x19,0x2ae000
00af1ef0	add x19,x19,#0x704
00af1ef4	mov w2,#0x99
00af1ef8	mov x1,x19
00af1efc	bl 0x00c32310
00af1f00	ldr x0,[x25, #0x10]
00af1f04	adrp x1,0xaf1000
00af1f08	add x1,x1,#0xd08
00af1f0c	bl 0x00c32600
00af1f10	mov w2,#0x9b
00af1f14	mov x0,x25
00af1f18	mov x1,x19
00af1f1c	bl 0x00c32310
00af1f20	b 0x00af1ecc
00af1f24	bl 0x00c342a0
00af1f28	adrp x0,0x2ae000
00af1f2c	adrp x2,0x2d8000
00af1f30	add x0,x0,#0x704
00af1f34	add x2,x2,#0x7dd
00af1f38	mov w1,#0xce
00af1f3c	b 0x00af1fa8
00af1f40	ldr x0,[x25]
00af1f44	adrp x19,0x2ae000
00af1f48	add x19,x19,#0x704
00af1f4c	mov w2,#0x99
00af1f50	mov x1,x19
00af1f54	bl 0x00c32310
00af1f58	ldr x0,[x25, #0x10]
00af1f5c	adrp x1,0xaf1000
00af1f60	add x1,x1,#0xd08
00af1f64	bl 0x00c32600
00af1f68	mov w2,#0x9b
00af1f6c	mov x0,x25
00af1f70	mov x1,x19
00af1f74	bl 0x00c32310
00af1f78	bl 0x00c342a0
00af1f7c	adrp x2,0x2d8000
00af1f80	add x2,x2,#0x7dd
00af1f84	mov w1,#0xda
00af1f88	mov x0,x19
00af1f8c	b 0x00af1fa8
00af1f90	bl 0x00c342a0
00af1f94	adrp x0,0x2ae000
00af1f98	adrp x2,0x2d8000
00af1f9c	add x0,x0,#0x704
00af1fa0	add x2,x2,#0x7dd
00af1fa4	mov w1,#0xc8
00af1fa8	bl 0x00c342b0
00af1fac	mov w1,#0x100
00af1fb0	mov w0,#0xb
00af1fb4	movk w1,#0xc, LSL #16
00af1fb8	b 0x00af1ec4
