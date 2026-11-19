; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::basic_istream @ 00bd2d04
00bd2d04	paciasp
00bd2d08	stp x29,x30,[sp, #-0x20]!
00bd2d0c	stp x20,x19,[sp, #0x10]
00bd2d10	mov x29,sp
00bd2d14	adrp x8,0xcb5000
00bd2d18	mov x19,x0
00bd2d1c	mov x20,x0
00bd2d20	ldr x8,[x8, #0xb90]
00bd2d24	str xzr,[x0, #0x40]
00bd2d28	add x9,x8,#0x40
00bd2d2c	add x8,x8,#0x18
00bd2d30	str x9,[x20, #0x10]!
00bd2d34	stp x8,xzr,[x0]
00bd2d38	mov x0,x20
00bd2d3c	bl 0x00c30100
00bd2d40	mov w8,#0xffffffff
00bd2d44	str xzr,[x19, #0x98]
00bd2d48	str w8,[x19, #0xa0]
00bd2d4c	ldp x20,x19,[sp, #0x10]
00bd2d50	ldp x29,x30,[sp], #0x20
00bd2d54	autiasp
00bd2d58	ret
