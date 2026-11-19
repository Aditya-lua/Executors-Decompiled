; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::sync @ 00bd0cec
00bd0cec	paciasp
00bd0cf0	sub sp,sp,#0x30
00bd0cf4	stp x29,x30,[sp, #0x10]
00bd0cf8	stp x20,x19,[sp, #0x20]
00bd0cfc	add x29,sp,#0x10
00bd0d00	mov x19,x0
00bd0d04	sub x0,x29,#0x4
00bd0d08	mov w2,#0x1
00bd0d0c	mov x1,x19
00bd0d10	bl 0x00c30140
00bd0d14	ldr x8,[x19]
00bd0d18	ldur x8,[x8, #-0x18]
00bd0d1c	add x8,x19,x8
00bd0d20	ldr x0,[x8, #0x28]
00bd0d24	cbz x0,0x00bd0d6c
00bd0d28	ldurb w8,[x29, #-0x4]
00bd0d2c	cmp w8,#0x1
00bd0d30	b.ne 0x00bd0d74
00bd0d34	ldr x8,[x0]
00bd0d38	ldr x8,[x8, #0x30]
00bd0d3c	blr x8
00bd0d40	cmn w0,#0x1
00bd0d44	cset w8,eq
00bd0d48	csetm w20,eq
00bd0d4c	ldr x9,[x19]
00bd0d50	ldur x9,[x9, #-0x18]
00bd0d54	add x0,x19,x9
00bd0d58	ldr w9,[x0, #0x20]
00bd0d5c	orr w1,w9,w8
00bd0d60	bl 0x00c30130
00bd0d64	mov w0,w20
00bd0d68	b 0x00bd0d78
00bd0d6c	mov w0,#0xffffffff
00bd0d70	b 0x00bd0d78
00bd0d74	mov w0,wzr
00bd0d78	ldp x20,x19,[sp, #0x20]
00bd0d7c	ldp x29,x30,[sp, #0x10]
00bd0d80	add sp,sp,#0x30
00bd0d84	autiasp
00bd0d88	ret
