; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::__get_white_space @ 00be9d30
00be9d30	paciasp
00be9d34	stp x29,x30,[sp, #-0x40]!
00be9d38	str x23,[sp, #0x10]
00be9d3c	stp x22,x21,[sp, #0x20]
00be9d40	stp x20,x19,[sp, #0x30]
00be9d44	mov x29,sp
00be9d48	mov x22,x4
00be9d4c	mov x19,x3
00be9d50	mov x20,x2
00be9d54	mov x21,x1
00be9d58	ldr x0,[x21]
00be9d5c	cbnz x0,0x00be9d74
00be9d60	b 0x00be9dc0
00be9d64	add x8,x8,#0x1
00be9d68	str x8,[x0, #0x18]
00be9d6c	ldr x0,[x21]
00be9d70	cbz x0,0x00be9dc0
00be9d74	ldp x8,x9,[x0, #0x18]
00be9d78	cmp x8,x9
00be9d7c	b.eq 0x00be9d8c
00be9d80	mov w23,wzr
00be9d84	cbnz x20,0x00be9dc8
00be9d88	b 0x00be9db0
00be9d8c	ldr x8,[x0]
00be9d90	ldr x8,[x8, #0x48]
00be9d94	blr x8
00be9d98	cmn w0,#0x1
00be9d9c	b.eq 0x00be9db8
00be9da0	ldr x0,[x21]
00be9da4	cmp x0,#0x0
00be9da8	cset w23,eq
00be9dac	cbnz x20,0x00be9dc8
00be9db0	tbz w23,#0x0,0x00be9e08
00be9db4	b 0x00be9e6c
00be9db8	mov x0,xzr
00be9dbc	str xzr,[x21]
00be9dc0	mov w23,#0x1
00be9dc4	cbz x20,0x00be9db0
00be9dc8	ldp x8,x9,[x20, #0x18]
00be9dcc	cmp x8,x9
00be9dd0	b.eq 0x00be9ddc
00be9dd4	tbnz w23,#0x0,0x00be9e08
00be9dd8	b 0x00be9e6c
00be9ddc	ldr x8,[x20]
00be9de0	mov x0,x20
00be9de4	ldr x8,[x8, #0x48]
00be9de8	blr x8
00be9dec	mov w8,w0
00be9df0	ldr x0,[x21]
00be9df4	cmn w8,#0x1
00be9df8	cset w8,eq
00be9dfc	csel x20,xzr,x20,eq
00be9e00	cmp w23,w8
00be9e04	b.eq 0x00be9e6c
00be9e08	ldp x8,x9,[x0, #0x18]
00be9e0c	cmp x8,x9
00be9e10	b.eq 0x00be9e20
00be9e14	ldrb w8,[x8]
00be9e18	tbz w8,#0x7,0x00be9e34
00be9e1c	b 0x00be9e68
00be9e20	ldr x8,[x0]
00be9e24	ldr x8,[x8, #0x48]
00be9e28	blr x8
00be9e2c	and x8,x0,#0xff
00be9e30	tbnz w8,#0x7,0x00be9e68
00be9e34	ldr x9,[x22, #0x10]
00be9e38	ldr x0,[x21]
00be9e3c	ldr x8,[x9, x8, LSL #0x3]
00be9e40	tbz w8,#0x0,0x00be9e6c
00be9e44	ldp x8,x9,[x0, #0x18]
00be9e48	cmp x8,x9
00be9e4c	b.ne 0x00be9d64
00be9e50	ldr x8,[x0]
00be9e54	ldr x8,[x8, #0x50]
00be9e58	blr x8
00be9e5c	ldr x0,[x21]
00be9e60	cbnz x0,0x00be9d74
00be9e64	b 0x00be9dc0
00be9e68	ldr x0,[x21]
00be9e6c	cbz x0,0x00be9eb8
00be9e70	ldp x8,x9,[x0, #0x18]
00be9e74	cmp x8,x9
00be9e78	b.eq 0x00be9e88
00be9e7c	mov w21,wzr
00be9e80	cbnz x20,0x00be9ec0
00be9e84	b 0x00be9eac
00be9e88	ldr x8,[x0]
00be9e8c	ldr x8,[x8, #0x48]
00be9e90	blr x8
00be9e94	cmn w0,#0x1
00be9e98	b.eq 0x00be9eb4
00be9e9c	ldr x8,[x21]
00be9ea0	cmp x8,#0x0
00be9ea4	cset w21,eq
00be9ea8	cbnz x20,0x00be9ec0
00be9eac	tbnz w21,#0x0,0x00be9ed0
00be9eb0	b 0x00be9edc
00be9eb4	str xzr,[x21]
00be9eb8	mov w21,#0x1
00be9ebc	cbz x20,0x00be9eac
00be9ec0	ldp x8,x9,[x20, #0x18]
00be9ec4	cmp x8,x9
00be9ec8	b.eq 0x00be9ef4
00be9ecc	tbnz w21,#0x0,0x00be9edc
00be9ed0	ldr w8,[x19]
00be9ed4	orr w8,w8,#0x2
00be9ed8	str w8,[x19]
00be9edc	ldp x20,x19,[sp, #0x30]
00be9ee0	ldr x23,[sp, #0x10]
00be9ee4	ldp x22,x21,[sp, #0x20]
00be9ee8	ldp x29,x30,[sp], #0x40
00be9eec	autiasp
00be9ef0	ret
00be9ef4	ldr x8,[x20]
00be9ef8	mov x0,x20
00be9efc	ldr x8,[x8, #0x48]
00be9f00	blr x8
00be9f04	cmn w0,#0x1
00be9f08	cset w8,eq
00be9f0c	eor w8,w21,w8
00be9f10	tbz w8,#0x0,0x00be9ed0
00be9f14	b 0x00be9edc
