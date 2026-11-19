; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::basic_istream @ 00bcec18
00bcec18	paciasp
00bcec1c	stp x29,x30,[sp, #-0x20]!
00bcec20	stp x20,x19,[sp, #0x10]
00bcec24	mov x29,sp
00bcec28	adrp x8,0xcb5000
00bcec2c	mov x19,x0
00bcec30	mov x20,x0
00bcec34	ldr x8,[x8, #0xb68]
00bcec38	str xzr,[x0, #0x40]
00bcec3c	add x9,x8,#0x40
00bcec40	add x8,x8,#0x18
00bcec44	str x9,[x20, #0x10]!
00bcec48	stp x8,xzr,[x0]
00bcec4c	mov x0,x20
00bcec50	bl 0x00c30100
00bcec54	mov w8,#0xffffffff
00bcec58	str xzr,[x19, #0x98]
00bcec5c	str w8,[x19, #0xa0]
00bcec60	ldp x20,x19,[sp, #0x10]
00bcec64	ldp x29,x30,[sp], #0x20
00bcec68	autiasp
00bcec6c	ret
