; std::__ndk1::num_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_put @ 00be5e6c
00be5e6c	bti c
00be5e70	adrp x5,0x2b5000
00be5e74	add x5,x5,#0x54
00be5e78	b 0x00be5e7c
00be5e7c	paciasp
00be5e80	sub sp,sp,#0x130
00be5e84	stp x29,x30,[sp, #0xf0]
00be5e88	stp x28,x23,[sp, #0x100]
00be5e8c	stp x22,x21,[sp, #0x110]
00be5e90	stp x20,x19,[sp, #0x120]
00be5e94	add x29,sp,#0xf0
00be5e98	ldr w9,[x2, #0x8]
00be5e9c	mov w8,#0x25
00be5ea0	mov x22,x4
00be5ea4	mov w19,w3
00be5ea8	mov x20,x2
00be5eac	mov x21,x1
00be5eb0	stur x8,[x29, #-0x8]
00be5eb4	sub x8,x29,#0x8
00be5eb8	tbnz w9,#0x9,0x00be5ecc
00be5ebc	orr x8,x8,#0x1
00be5ec0	ldrb w10,[x5]
00be5ec4	cbnz w10,0x00be5ee0
00be5ec8	b 0x00be5ef0
00be5ecc	mov w10,#0x23
00be5ed0	orr x8,x8,#0x2
00be5ed4	sturb w10,[x29, #-0x7]
00be5ed8	ldrb w10,[x5]
00be5edc	cbz w10,0x00be5ef0
00be5ee0	add x11,x5,#0x1
00be5ee4	strb w10,[x8], #0x1
00be5ee8	ldrb w10,[x11], #0x1
00be5eec	cbnz w10,0x00be5ee4
00be5ef0	mov w10,#0x4a
00be5ef4	and w10,w9,w10
00be5ef8	cmp w10,#0x40
00be5efc	b.eq 0x00be5f1c
00be5f00	cmp w10,#0x8
00be5f04	b.ne 0x00be5f24
00be5f08	tst w9,#0x4000
00be5f0c	mov w9,#0x58
00be5f10	mov w10,#0x78
00be5f14	csel w9,w10,w9,eq
00be5f18	b 0x00be5f28
00be5f1c	mov w9,#0x6f
00be5f20	b 0x00be5f28
00be5f24	mov w9,#0x75
00be5f28	strb w9,[x8]
00be5f2c	adrp x8,0xd27000
00be5f30	add x8,x8,#0xf8
00be5f34	ldarb w8,[x8]
00be5f38	adrp x23,0xd27000
00be5f3c	tbz w8,#0x0,0x00be6038
00be5f40	ldr x2,[x23, #0xf0]
00be5f44	sub x0,x29,#0x20
00be5f48	sub x3,x29,#0x8
00be5f4c	mov w1,#0x18
00be5f50	mov x4,x22
00be5f54	sub x22,x29,#0x20
00be5f58	bl 0x00c0cd14
00be5f5c	ldr w8,[x20, #0x8]
00be5f60	mov w9,#0xb0
00be5f64	add x22,x22,w0, SXTW 
00be5f68	and w8,w8,w9
00be5f6c	mov x23,x22
00be5f70	cmp w8,#0x20
00be5f74	b.eq 0x00be5fd0
00be5f78	cmp w8,#0x10
00be5f7c	b.ne 0x00be5fcc
00be5f80	ldurb w8,[x29, #-0x20]
00be5f84	cmp w8,#0x2d
00be5f88	b.eq 0x00be5f94
00be5f8c	cmp w8,#0x2b
00be5f90	b.ne 0x00be5fa0
00be5f94	sub x8,x29,#0x20
00be5f98	orr x23,x8,#0x1
00be5f9c	b 0x00be5fd0
00be5fa0	cmp w0,#0x2
00be5fa4	b.lt 0x00be5fcc
00be5fa8	cmp w8,#0x30
00be5fac	b.ne 0x00be5fcc
00be5fb0	ldurb w8,[x29, #-0x1f]
00be5fb4	orr w8,w8,#0x20
00be5fb8	cmp w8,#0x78
00be5fbc	b.ne 0x00be5fcc
00be5fc0	sub x8,x29,#0x20
00be5fc4	orr x23,x8,#0x2
00be5fc8	b 0x00be5fd0
00be5fcc	sub x23,x29,#0x20
00be5fd0	mov x8,sp
00be5fd4	mov x0,x20
00be5fd8	bl 0x00c30070
00be5fdc	sub x0,x29,#0x20
00be5fe0	add x3,sp,#0x1c
00be5fe4	add x4,sp,#0x10
00be5fe8	add x5,sp,#0x8
00be5fec	mov x6,sp
00be5ff0	mov x1,x23
00be5ff4	mov x2,x22
00be5ff8	bl 0x00c44170
00be5ffc	mov x0,sp
00be6000	bl 0x00c30090
00be6004	ldp x3,x2,[sp, #0x8]
00be6008	add x1,sp,#0x1c
00be600c	mov x0,x21
00be6010	mov x4,x20
00be6014	mov w5,w19
00be6018	bl 0x00be6bec
00be601c	ldp x20,x19,[sp, #0x120]
00be6020	ldp x22,x21,[sp, #0x110]
00be6024	ldp x28,x23,[sp, #0x100]
00be6028	ldp x29,x30,[sp, #0xf0]
00be602c	add sp,sp,#0x130
00be6030	autiasp
00be6034	ret
00be6038	adrp x0,0xd27000
00be603c	add x0,x0,#0xf8
00be6040	bl 0x00c2fe90
00be6044	cbz w0,0x00be5f40
00be6048	adrp x1,0x2c6000
00be604c	add x1,x1,#0xbfc
00be6050	mov w0,#0x1fbf
00be6054	mov x2,xzr
00be6058	bl 0x00c43890
00be605c	str x0,[x23, #0xf0]
00be6060	adrp x0,0xd27000
00be6064	add x0,x0,#0xf8
00be6068	bl 0x00c2fea0
00be606c	b 0x00be5f40
