; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::find_first_not_of @ 00bc3cb0
00bc3cb0	paciasp
00bc3cb4	stp x29,x30,[sp, #-0x40]!
00bc3cb8	str x23,[sp, #0x10]
00bc3cbc	stp x22,x21,[sp, #0x20]
00bc3cc0	stp x20,x19,[sp, #0x30]
00bc3cc4	mov x29,sp
00bc3cc8	ldrb w8,[x0]
00bc3ccc	ldp x9,x11,[x0, #0x8]
00bc3cd0	lsr x10,x8,#0x1
00bc3cd4	tst w8,#0x1
00bc3cd8	csinc x21,x11,x0,ne
00bc3cdc	csel x8,x10,x9,eq
00bc3ce0	subs x23,x8,x2
00bc3ce4	b.ls 0x00bc3d18
00bc3ce8	mov x19,x3
00bc3cec	add x22,x21,x2
00bc3cf0	cbz x3,0x00bc3d20
00bc3cf4	mov x20,x1
00bc3cf8	ldrb w1,[x22]
00bc3cfc	mov x0,x20
00bc3d00	mov x2,x19
00bc3d04	bl 0x00c300a0
00bc3d08	cbz x0,0x00bc3d20
00bc3d0c	subs x23,x23,#0x1
00bc3d10	add x22,x22,#0x1
00bc3d14	b.ne 0x00bc3cf8
00bc3d18	mov x0,#-0x1
00bc3d1c	b 0x00bc3d24
00bc3d20	sub x0,x22,x21
00bc3d24	ldp x20,x19,[sp, #0x30]
00bc3d28	ldr x23,[sp, #0x10]
00bc3d2c	ldp x22,x21,[sp, #0x20]
00bc3d30	ldp x29,x30,[sp], #0x40
00bc3d34	autiasp
00bc3d38	ret
