; EVP_PKEY_CTX_get_params @ 00a75d88
00a75d88	stp x20,x19,[sp, #-0x20]!
00a75d8c	stp x29,x30,[sp, #0x10]
00a75d90	add x29,sp,#0x10
00a75d94	mov x19,x1
00a75d98	mov x20,x0
00a75d9c	bl 0x00a74e5c
00a75da0	cmp w0,#0x2
00a75da4	b.cs 0x00a75dbc
00a75da8	ldp x29,x30,[sp, #0x10]
00a75dac	mov x0,x20
00a75db0	mov x1,x19
00a75db4	ldp x20,x19,[sp], #0x20
00a75db8	b 0x00c3c0a0
00a75dbc	b.ne 0x00a75e9c
00a75dc0	ldr w8,[x20]
00a75dc4	cmp w8,#0x1ff
00a75dc8	b.gt 0x00a75e14
00a75dcc	sub w9,w8,#0x10
00a75dd0	cmp w9,#0x30
00a75dd4	b.hi 0x00a75df0
00a75dd8	mov w10,#0x1
00a75ddc	lsl x9,x10,x9
00a75de0	mov x10,#0x1000000010000
00a75de4	movk x10,#0x1
00a75de8	tst x9,x10
00a75dec	b.ne 0x00a75e00
00a75df0	cmp w8,#0x80
00a75df4	b.eq 0x00a75e00
00a75df8	cmp w8,#0x100
00a75dfc	b.ne 0x00a75e9c
00a75e00	ldr x8,[x20, #0x28]
00a75e04	cbz x8,0x00a75e9c
00a75e08	ldr x2,[x8, #0xb8]
00a75e0c	cbnz x2,0x00a75e88
00a75e10	b 0x00a75e9c
00a75e14	cmp w8,#0x7ff
00a75e18	b.le 0x00a75e48
00a75e1c	cmp w8,#0x2, LSL #12
00a75e20	b.eq 0x00a75e78
00a75e24	cmp w8,#0x1, LSL #12
00a75e28	b.eq 0x00a75e78
00a75e2c	cmp w8,#0x800
00a75e30	b.ne 0x00a75e9c
00a75e34	ldr x8,[x20, #0x28]
00a75e38	cbz x8,0x00a75e9c
00a75e3c	ldr x2,[x8, #0x70]
00a75e40	cbnz x2,0x00a75e88
00a75e44	b 0x00a75e9c
00a75e48	cmp w8,#0x200
00a75e4c	b.eq 0x00a75e58
00a75e50	cmp w8,#0x400
00a75e54	b.ne 0x00a75e9c
00a75e58	ldr x9,[x20, #0x28]
00a75e5c	cbz x9,0x00a75e68
00a75e60	ldr x2,[x9, #0x68]
00a75e64	cbnz x2,0x00a75e88
00a75e68	cmp w8,#0x2, LSL #12
00a75e6c	b.eq 0x00a75e78
00a75e70	cmp w8,#0x1, LSL #12
00a75e74	b.ne 0x00a75e9c
00a75e78	ldr x8,[x20, #0x28]
00a75e7c	cbz x8,0x00a75e9c
00a75e80	ldr x2,[x8, #0x68]
00a75e84	cbz x2,0x00a75e9c
00a75e88	ldr x0,[x20, #0x30]
00a75e8c	ldp x29,x30,[sp, #0x10]
00a75e90	mov x1,x19
00a75e94	ldp x20,x19,[sp], #0x20
00a75e98	br x2
00a75e9c	ldp x29,x30,[sp, #0x10]
00a75ea0	mov w0,wzr
00a75ea4	ldp x20,x19,[sp], #0x20
00a75ea8	ret
