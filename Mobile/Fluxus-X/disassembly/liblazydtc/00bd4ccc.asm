; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::ignore @ 00bd4ccc
00bd4ccc	paciasp
00bd4cd0	stp x29,x30,[sp, #-0x40]!
00bd4cd4	str x23,[sp, #0x10]
00bd4cd8	stp x22,x21,[sp, #0x20]
00bd4cdc	stp x20,x19,[sp, #0x30]
00bd4ce0	mov x29,sp
00bd4ce4	mov x19,x0
00bd4ce8	mov w20,w2
00bd4cec	mov x21,x1
00bd4cf0	str xzr,[x0, #0x8]
00bd4cf4	add x0,x29,#0x1c
00bd4cf8	mov x1,x19
00bd4cfc	mov w2,#0x1
00bd4d00	bl 0x00c44060
00bd4d04	ldrb w8,[x29, #0x1c]
00bd4d08	cmp w8,#0x1
00bd4d0c	b.ne 0x00bd4e14
00bd4d10	mov x22,#0x7fffffffffffffff
00bd4d14	cmp x21,x22
00bd4d18	b.ne 0x00bd4d80
00bd4d1c	add x21,x19,#0x28
00bd4d20	b 0x00bd4d2c
00bd4d24	cmp w0,w20
00bd4d28	b.eq 0x00bd4df0
00bd4d2c	ldr x8,[x19]
00bd4d30	ldur x8,[x8, #-0x18]
00bd4d34	ldr x8,[x21, x8#0x0]
00bd4d38	ldp x9,x10,[x8, #0x18]
00bd4d3c	cmp x9,x10
00bd4d40	b.eq 0x00bd4d50
00bd4d44	ldr w0,[x9], #0x4
00bd4d48	str x9,[x8, #0x18]
00bd4d4c	b 0x00bd4d60
00bd4d50	ldr x9,[x8]
00bd4d54	ldr x9,[x9, #0x50]
00bd4d58	mov x0,x8
00bd4d5c	blr x9
00bd4d60	cmn w0,#0x1
00bd4d64	b.eq 0x00bd4df8
00bd4d68	ldr x8,[x19, #0x8]
00bd4d6c	cmp x8,x22
00bd4d70	b.eq 0x00bd4d24
00bd4d74	add x8,x8,#0x1
00bd4d78	str x8,[x19, #0x8]
00bd4d7c	b 0x00bd4d24
00bd4d80	ldr x8,[x19, #0x8]
00bd4d84	cmp x8,x21
00bd4d88	b.ge 0x00bd4df0
00bd4d8c	add x22,x19,#0x28
00bd4d90	mov x23,#0x7fffffffffffffff
00bd4d94	ldr x8,[x19]
00bd4d98	ldur x8,[x8, #-0x18]
00bd4d9c	ldr x8,[x22, x8#0x0]
00bd4da0	ldp x9,x10,[x8, #0x18]
00bd4da4	cmp x9,x10
00bd4da8	b.eq 0x00bd4db8
00bd4dac	ldr w0,[x9], #0x4
00bd4db0	str x9,[x8, #0x18]
00bd4db4	b 0x00bd4dc8
00bd4db8	ldr x9,[x8]
00bd4dbc	ldr x9,[x9, #0x50]
00bd4dc0	mov x0,x8
00bd4dc4	blr x9
00bd4dc8	cmn w0,#0x1
00bd4dcc	b.eq 0x00bd4df8
00bd4dd0	ldr x8,[x19, #0x8]
00bd4dd4	cmp x8,x23
00bd4dd8	b.eq 0x00bd4df0
00bd4ddc	add x8,x8,#0x1
00bd4de0	cmp w0,w20
00bd4de4	ccmp x8,x21,#0x0,ne
00bd4de8	str x8,[x19, #0x8]
00bd4dec	b.lt 0x00bd4d94
00bd4df0	mov w8,wzr
00bd4df4	b 0x00bd4dfc
00bd4df8	mov w8,#0x2
00bd4dfc	ldr x9,[x19]
00bd4e00	ldur x9,[x9, #-0x18]
00bd4e04	add x0,x19,x9
00bd4e08	ldr w9,[x0, #0x20]
00bd4e0c	orr w1,w9,w8
00bd4e10	bl 0x00c30130
00bd4e14	mov x0,x19
00bd4e18	ldp x20,x19,[sp, #0x30]
00bd4e1c	ldr x23,[sp, #0x10]
00bd4e20	ldp x22,x21,[sp, #0x20]
00bd4e24	ldp x29,x30,[sp], #0x40
00bd4e28	autiasp
00bd4e2c	ret
