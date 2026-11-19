; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::swap @ 00bd2e0c
00bd2e0c	paciasp
00bd2e10	stp x29,x30,[sp, #-0x20]!
00bd2e14	stp x20,x19,[sp, #0x10]
00bd2e18	mov x29,sp
00bd2e1c	ldp x11,x8,[x1]
00bd2e20	ldp x10,x9,[x0]
00bd2e24	str x8,[x0, #0x8]
00bd2e28	str x9,[x1, #0x8]
00bd2e2c	ldur x8,[x10, #-0x18]
00bd2e30	ldur x9,[x11, #-0x18]
00bd2e34	add x19,x0,x8
00bd2e38	add x20,x1,x9
00bd2e3c	mov x0,x19
00bd2e40	mov x1,x20
00bd2e44	bl 0x00c43f40
00bd2e48	ldr x8,[x20, #0x88]
00bd2e4c	ldr x9,[x19, #0x88]
00bd2e50	ldr w10,[x20, #0x90]
00bd2e54	str x8,[x19, #0x88]
00bd2e58	ldr w8,[x19, #0x90]
00bd2e5c	str x9,[x20, #0x88]
00bd2e60	str w10,[x19, #0x90]
00bd2e64	str w8,[x20, #0x90]
00bd2e68	ldp x20,x19,[sp, #0x10]
00bd2e6c	ldp x29,x30,[sp], #0x20
00bd2e70	autiasp
00bd2e74	ret
