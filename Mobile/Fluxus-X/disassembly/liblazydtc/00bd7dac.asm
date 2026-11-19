; std::__ndk1::basic_istringstream<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::operator= @ 00bd7dac
00bd7dac	paciasp
00bd7db0	stp x29,x30,[sp, #-0x30]!
00bd7db4	stp x22,x21,[sp, #0x10]
00bd7db8	stp x20,x19,[sp, #0x20]
00bd7dbc	mov x29,sp
00bd7dc0	ldp x11,x8,[x1]
00bd7dc4	mov x19,x1
00bd7dc8	ldp x10,x9,[x0]
00bd7dcc	mov x20,x0
00bd7dd0	str x8,[x0, #0x8]
00bd7dd4	str x9,[x1, #0x8]
00bd7dd8	ldur x8,[x10, #-0x18]
00bd7ddc	ldur x9,[x11, #-0x18]
00bd7de0	add x21,x0,x8
00bd7de4	add x22,x1,x9
00bd7de8	mov x0,x21
00bd7dec	mov x1,x22
00bd7df0	bl 0x00c43f40
00bd7df4	ldr x8,[x22, #0x88]
00bd7df8	ldr x9,[x21, #0x88]
00bd7dfc	add x0,x20,#0x10
00bd7e00	ldr w10,[x22, #0x90]
00bd7e04	add x1,x19,#0x10
00bd7e08	str x8,[x21, #0x88]
00bd7e0c	ldr w8,[x21, #0x90]
00bd7e10	str x9,[x22, #0x88]
00bd7e14	str w10,[x21, #0x90]
00bd7e18	str w8,[x22, #0x90]
00bd7e1c	bl 0x00c440b0
00bd7e20	mov x0,x20
00bd7e24	ldp x20,x19,[sp, #0x20]
00bd7e28	ldp x22,x21,[sp, #0x10]
00bd7e2c	ldp x29,x30,[sp], #0x30
00bd7e30	autiasp
00bd7e34	ret
