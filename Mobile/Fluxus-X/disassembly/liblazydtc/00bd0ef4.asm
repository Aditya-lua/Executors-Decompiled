; std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::basic_ostream @ 00bd0ef4
00bd0ef4	paciasp
00bd0ef8	stp x29,x30,[sp, #-0x20]!
00bd0efc	str x19,[sp, #0x10]
00bd0f00	mov x29,sp
00bd0f04	ldr x8,[x1]
00bd0f08	str x8,[x0]
00bd0f0c	ldur x8,[x8, #-0x18]
00bd0f10	ldr x9,[x1, #0x8]
00bd0f14	mov x1,x2
00bd0f18	str x9,[x0, x8#0x0]
00bd0f1c	ldr x8,[x0]
00bd0f20	ldur x8,[x8, #-0x18]
00bd0f24	add x19,x0,x8
00bd0f28	mov x0,x19
00bd0f2c	bl 0x00c30100
00bd0f30	mov w8,#0xffffffff
00bd0f34	str xzr,[x19, #0x88]
00bd0f38	str w8,[x19, #0x90]
00bd0f3c	ldr x19,[sp, #0x10]
00bd0f40	ldp x29,x30,[sp], #0x20
00bd0f44	autiasp
00bd0f48	ret
