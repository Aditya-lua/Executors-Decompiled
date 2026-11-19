; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::unget @ 00bd0bc0
00bd0bc0	paciasp
00bd0bc4	sub sp,sp,#0x30
00bd0bc8	stp x29,x30,[sp, #0x10]
00bd0bcc	stp x20,x19,[sp, #0x20]
00bd0bd0	add x29,sp,#0x10
00bd0bd4	ldr x8,[x0]
00bd0bd8	mov x19,x0
00bd0bdc	ldur x9,[x8, #-0x18]
00bd0be0	str xzr,[x0, #0x8]
00bd0be4	ldur x8,[x8, #-0x18]
00bd0be8	add x9,x0,x9
00bd0bec	ldr w9,[x9, #0x20]
00bd0bf0	add x0,x0,x8
00bd0bf4	and w20,w9,#0xfffffffd
00bd0bf8	mov w1,w20
00bd0bfc	bl 0x00c30130
00bd0c00	sub x0,x29,#0x4
00bd0c04	mov x1,x19
00bd0c08	mov w2,#0x1
00bd0c0c	bl 0x00c30140
00bd0c10	ldurb w8,[x29, #-0x4]
00bd0c14	cmp w8,#0x1
00bd0c18	b.ne 0x00bd0c48
00bd0c1c	ldr x8,[x19]
00bd0c20	ldur x8,[x8, #-0x18]
00bd0c24	add x8,x19,x8
00bd0c28	ldr x0,[x8, #0x28]
00bd0c2c	cbz x0,0x00bd0c68
00bd0c30	ldp x9,x8,[x0, #0x10]
00bd0c34	cmp x9,x8
00bd0c38	b.eq 0x00bd0c50
00bd0c3c	sub x8,x8,#0x1
00bd0c40	str x8,[x0, #0x18]
00bd0c44	b 0x00bd0c6c
00bd0c48	orr w20,w20,#0x4
00bd0c4c	b 0x00bd0c6c
00bd0c50	ldr x8,[x0]
00bd0c54	ldr x8,[x8, #0x58]
00bd0c58	mov w1,#0xffffffff
00bd0c5c	blr x8
00bd0c60	cmn w0,#0x1
00bd0c64	b.ne 0x00bd0c6c
00bd0c68	orr w20,w20,#0x1
00bd0c6c	ldr x8,[x19]
00bd0c70	ldur x8,[x8, #-0x18]
00bd0c74	add x0,x19,x8
00bd0c78	ldr w8,[x0, #0x20]
00bd0c7c	orr w1,w8,w20
00bd0c80	bl 0x00c30130
00bd0c84	mov x0,x19
00bd0c88	ldp x20,x19,[sp, #0x20]
00bd0c8c	ldp x29,x30,[sp, #0x10]
00bd0c90	add sp,sp,#0x30
00bd0c94	autiasp
00bd0c98	ret
