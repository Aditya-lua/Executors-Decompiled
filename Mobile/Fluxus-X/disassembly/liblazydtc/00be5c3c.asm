; std::__ndk1::num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_put @ 00be5c3c
00be5c3c	bti c
00be5c40	adrp x5,0x2b5000
00be5c44	add x5,x5,#0x52
00be5c48	b 0x00be5c4c
00be5c4c	paciasp
00be5c50	sub sp,sp,#0x130
00be5c54	stp x29,x30,[sp, #0xf0]
00be5c58	stp x28,x23,[sp, #0x100]
00be5c5c	stp x22,x21,[sp, #0x110]
00be5c60	stp x20,x19,[sp, #0x120]
00be5c64	add x29,sp,#0xf0
00be5c68	ldr w9,[x2, #0x8]
00be5c6c	mov w8,#0x25
00be5c70	mov x22,x4
00be5c74	mov w19,w3
00be5c78	mov x20,x2
00be5c7c	mov x21,x1
00be5c80	stur x8,[x29, #-0x8]
00be5c84	sub x8,x29,#0x8
00be5c88	tbnz w9,#0x9,0x00be5c9c
00be5c8c	orr x8,x8,#0x1
00be5c90	ldrb w10,[x5]
00be5c94	cbnz w10,0x00be5cb0
00be5c98	b 0x00be5cc0
00be5c9c	mov w10,#0x23
00be5ca0	orr x8,x8,#0x2
00be5ca4	sturb w10,[x29, #-0x7]
00be5ca8	ldrb w10,[x5]
00be5cac	cbz w10,0x00be5cc0
00be5cb0	add x11,x5,#0x1
00be5cb4	strb w10,[x8], #0x1
00be5cb8	ldrb w10,[x11], #0x1
00be5cbc	cbnz w10,0x00be5cb4
00be5cc0	mov w10,#0x4a
00be5cc4	and w10,w9,w10
00be5cc8	cmp w10,#0x40
00be5ccc	b.eq 0x00be5cec
00be5cd0	cmp w10,#0x8
00be5cd4	b.ne 0x00be5cf4
00be5cd8	tst w9,#0x4000
00be5cdc	mov w9,#0x58
00be5ce0	mov w10,#0x78
00be5ce4	csel w9,w10,w9,eq
00be5ce8	b 0x00be5cf8
00be5cec	mov w9,#0x6f
00be5cf0	b 0x00be5cf8
00be5cf4	mov w9,#0x75
00be5cf8	strb w9,[x8]
00be5cfc	adrp x8,0xd27000
00be5d00	add x8,x8,#0xf8
00be5d04	ldarb w8,[x8]
00be5d08	adrp x23,0xd27000
00be5d0c	tbz w8,#0x0,0x00be5e08
00be5d10	ldr x2,[x23, #0xf0]
00be5d14	sub x0,x29,#0x20
00be5d18	sub x3,x29,#0x8
00be5d1c	mov w1,#0x18
00be5d20	mov x4,x22
00be5d24	sub x22,x29,#0x20
00be5d28	bl 0x00c0cd14
00be5d2c	ldr w8,[x20, #0x8]
00be5d30	mov w9,#0xb0
00be5d34	add x22,x22,w0, SXTW 
00be5d38	and w8,w8,w9
00be5d3c	mov x23,x22
00be5d40	cmp w8,#0x20
00be5d44	b.eq 0x00be5da0
00be5d48	cmp w8,#0x10
00be5d4c	b.ne 0x00be5d9c
00be5d50	ldurb w8,[x29, #-0x20]
00be5d54	cmp w8,#0x2d
00be5d58	b.eq 0x00be5d64
00be5d5c	cmp w8,#0x2b
00be5d60	b.ne 0x00be5d70
00be5d64	sub x8,x29,#0x20
00be5d68	orr x23,x8,#0x1
00be5d6c	b 0x00be5da0
00be5d70	cmp w0,#0x2
00be5d74	b.lt 0x00be5d9c
00be5d78	cmp w8,#0x30
00be5d7c	b.ne 0x00be5d9c
00be5d80	ldurb w8,[x29, #-0x1f]
00be5d84	orr w8,w8,#0x20
00be5d88	cmp w8,#0x78
00be5d8c	b.ne 0x00be5d9c
00be5d90	sub x8,x29,#0x20
00be5d94	orr x23,x8,#0x2
00be5d98	b 0x00be5da0
00be5d9c	sub x23,x29,#0x20
00be5da0	mov x8,sp
00be5da4	mov x0,x20
00be5da8	bl 0x00c30070
00be5dac	sub x0,x29,#0x20
00be5db0	add x3,sp,#0x1c
00be5db4	add x4,sp,#0x10
00be5db8	add x5,sp,#0x8
00be5dbc	mov x6,sp
00be5dc0	mov x1,x23
00be5dc4	mov x2,x22
00be5dc8	bl 0x00c44170
00be5dcc	mov x0,sp
00be5dd0	bl 0x00c30090
00be5dd4	ldp x3,x2,[sp, #0x8]
00be5dd8	add x1,sp,#0x1c
00be5ddc	mov x0,x21
00be5de0	mov x4,x20
00be5de4	mov w5,w19
00be5de8	bl 0x00be6bec
00be5dec	ldp x20,x19,[sp, #0x120]
00be5df0	ldp x22,x21,[sp, #0x110]
00be5df4	ldp x28,x23,[sp, #0x100]
00be5df8	ldp x29,x30,[sp, #0xf0]
00be5dfc	add sp,sp,#0x130
00be5e00	autiasp
00be5e04	ret
00be5e08	adrp x0,0xd27000
00be5e0c	add x0,x0,#0xf8
00be5e10	bl 0x00c2fe90
00be5e14	cbz w0,0x00be5d10
00be5e18	adrp x1,0x2c6000
00be5e1c	add x1,x1,#0xbfc
00be5e20	mov w0,#0x1fbf
00be5e24	mov x2,xzr
00be5e28	bl 0x00c43890
00be5e2c	str x0,[x23, #0xf0]
00be5e30	adrp x0,0xd27000
00be5e34	add x0,x0,#0xf8
00be5e38	bl 0x00c2fea0
00be5e3c	b 0x00be5d10
