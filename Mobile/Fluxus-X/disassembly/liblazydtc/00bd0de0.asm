; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::seekg @ 00bd0de0
00bd0de0	paciasp
00bd0de4	sub sp,sp,#0x40
00bd0de8	stp x29,x30,[sp, #0x10]
00bd0dec	stp x22,x21,[sp, #0x20]
00bd0df0	stp x20,x19,[sp, #0x30]
00bd0df4	add x29,sp,#0x10
00bd0df8	ldr x8,[x0]
00bd0dfc	mov x19,x0
00bd0e00	mov x22,x1
00bd0e04	mov x21,x2
00bd0e08	ldur x8,[x8, #-0x18]
00bd0e0c	add x0,x0,x8
00bd0e10	ldr w8,[x0, #0x20]
00bd0e14	and w20,w8,#0xfffffffd
00bd0e18	mov w1,w20
00bd0e1c	bl 0x00c30130
00bd0e20	sub x0,x29,#0x4
00bd0e24	mov x1,x19
00bd0e28	mov w2,#0x1
00bd0e2c	bl 0x00c30140
00bd0e30	ldurb w8,[x29, #-0x4]
00bd0e34	cmp w8,#0x1
00bd0e38	b.ne 0x00bd0e88
00bd0e3c	ldr x8,[x19]
00bd0e40	ldur x8,[x8, #-0x18]
00bd0e44	add x8,x19,x8
00bd0e48	ldr x0,[x8, #0x28]
00bd0e4c	ldr x8,[x0]
00bd0e50	ldr x8,[x8, #0x28]
00bd0e54	mov x1,x22
00bd0e58	mov x2,x21
00bd0e5c	mov w3,#0x8
00bd0e60	blr x8
00bd0e64	orr w8,w20,#0x4
00bd0e68	cmn x1,#0x1
00bd0e6c	csel w20,w8,w20,eq
00bd0e70	ldr x8,[x19]
00bd0e74	ldur x8,[x8, #-0x18]
00bd0e78	add x0,x19,x8
00bd0e7c	ldr w8,[x0, #0x20]
00bd0e80	orr w1,w8,w20
00bd0e84	bl 0x00c30130
00bd0e88	mov x0,x19
00bd0e8c	ldp x20,x19,[sp, #0x30]
00bd0e90	ldp x22,x21,[sp, #0x20]
00bd0e94	ldp x29,x30,[sp, #0x10]
00bd0e98	add sp,sp,#0x40
00bd0e9c	autiasp
00bd0ea0	ret
