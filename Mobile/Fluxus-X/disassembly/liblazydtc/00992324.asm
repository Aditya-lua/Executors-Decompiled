; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::__construct_node<std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&>,std::__ndk1::tuple<>> @ 00992324
00992324	stp x24,x23,[sp, #-0x40]!
00992328	stp x22,x21,[sp, #0x10]
0099232c	stp x20,x19,[sp, #0x20]
00992330	stp x29,x30,[sp, #0x30]
00992334	add x29,sp,#0x30
00992338	add x22,x0,#0x8
0099233c	mov w0,#0x50
00992340	mov x21,x2
00992344	mov x19,x8
00992348	bl 0x00c2fed0
0099234c	stp x0,x22,[x19]
00992350	strb wzr,[x19, #0x10]
00992354	ldr x8,[x21]
00992358	mov x20,x0
0099235c	str xzr,[x0, #0x20]!
00992360	stp xzr,xzr,[x20, #0x28]
00992364	ldrb w9,[x8]
00992368	tbnz w9,#0x0,0x00992380
0099236c	ldr x9,[x8, #0x10]
00992370	str x9,[x0, #0x10]
00992374	ldr q0,[x8]
00992378	str q0,[x0]
0099237c	b 0x009923e0
00992380	ldr x21,[x8, #0x8]
00992384	cmn x21,#0x10
00992388	b.cs 0x00992404
0099238c	ldr x22,[x8, #0x10]
00992390	cmp x21,#0x17
00992394	b.cs 0x009923ac
00992398	lsl w8,w21,#0x1
0099239c	add x23,x20,#0x21
009923a0	strb w8,[x20, #0x20]
009923a4	cbnz x21,0x009923cc
009923a8	b 0x009923dc
009923ac	add x8,x21,#0x10
009923b0	and x24,x8,#-0x10
009923b4	mov x0,x24
009923b8	bl 0x00c2fed0
009923bc	orr x8,x24,#0x1
009923c0	mov x23,x0
009923c4	stp x21,x0,[x20, #0x28]
009923c8	str x8,[x20, #0x20]
009923cc	mov x0,x23
009923d0	mov x1,x22
009923d4	mov x2,x21
009923d8	bl 0x00c2ffd0
009923dc	strb wzr,[x23, x21]
009923e0	mov w8,#0x1
009923e4	stp xzr,xzr,[x20, #0x40]
009923e8	str xzr,[x20, #0x38]
009923ec	strb w8,[x19, #0x10]
009923f0	ldp x29,x30,[sp, #0x30]
009923f4	ldp x20,x19,[sp, #0x20]
009923f8	ldp x22,x21,[sp, #0x10]
009923fc	ldp x24,x23,[sp], #0x40
00992400	ret
00992404	bl 0x00c30ce0
