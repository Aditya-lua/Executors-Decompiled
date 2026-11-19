; std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::basic_ostream @ 00bd0f4c
00bd0f4c	paciasp
00bd0f50	stp x29,x30,[sp, #-0x20]!
00bd0f54	stp x20,x19,[sp, #0x10]
00bd0f58	mov x29,sp
00bd0f5c	adrp x8,0xcb5000
00bd0f60	mov x19,x0
00bd0f64	mov x20,x0
00bd0f68	ldr x8,[x8, #0xb70]
00bd0f6c	str xzr,[x0, #0x38]
00bd0f70	add x9,x8,#0x40
00bd0f74	add x8,x8,#0x18
00bd0f78	str x9,[x20, #0x8]!
00bd0f7c	str x8,[x0]
00bd0f80	mov x0,x20
00bd0f84	bl 0x00c30100
00bd0f88	mov w8,#0xffffffff
00bd0f8c	str xzr,[x19, #0x90]
00bd0f90	str w8,[x19, #0x98]
00bd0f94	ldp x20,x19,[sp, #0x10]
00bd0f98	ldp x29,x30,[sp], #0x20
00bd0f9c	autiasp
00bd0fa0	ret
