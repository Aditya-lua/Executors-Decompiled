; std::__ndk1::basic_iostream<char,std::__ndk1::char_traits<char>>::basic_iostream @ 00bd2320
00bd2320	paciasp
00bd2324	stp x29,x30,[sp, #-0x20]!
00bd2328	stp x20,x19,[sp, #0x10]
00bd232c	mov x29,sp
00bd2330	adrp x8,0xcb5000
00bd2334	mov x19,x0
00bd2338	mov x20,x0
00bd233c	ldr x8,[x8, #0xb78]
00bd2340	str xzr,[x0, #0x48]
00bd2344	add x9,x8,#0x40
00bd2348	add x8,x8,#0x18
00bd234c	str x9,[x20, #0x18]!
00bd2350	stp x8,xzr,[x0]
00bd2354	mov x0,x20
00bd2358	bl 0x00c30100
00bd235c	adrp x8,0xcb5000
00bd2360	mov w9,#0xffffffff
00bd2364	ldr x8,[x8, #0xb80]
00bd2368	str w9,[x19, #0xa8]
00bd236c	str xzr,[x19, #0xa0]
00bd2370	add x9,x8,#0x18
00bd2374	add x10,x8,#0x68
00bd2378	add x8,x8,#0x40
00bd237c	str x9,[x19]
00bd2380	stp x8,x10,[x19, #0x10]
00bd2384	ldp x20,x19,[sp, #0x10]
00bd2388	ldp x29,x30,[sp], #0x20
00bd238c	autiasp
00bd2390	ret
