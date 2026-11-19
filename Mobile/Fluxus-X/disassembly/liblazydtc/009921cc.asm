; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::__emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&>,std::__ndk1::tuple<>> @ 009921cc
009921cc	sub sp,sp,#0x80
009921d0	stp x28,x27,[sp, #0x20]
009921d4	stp x26,x25,[sp, #0x30]
009921d8	stp x24,x23,[sp, #0x40]
009921dc	stp x22,x21,[sp, #0x50]
009921e0	stp x20,x19,[sp, #0x60]
009921e4	stp x29,x30,[sp, #0x70]
009921e8	add x29,sp,#0x70
009921ec	mrs x26,tpidr_el0
009921f0	ldr x8,[x26, #0x28]
009921f4	mov x27,x0
009921f8	mov x20,x4
009921fc	mov x21,x3
00992200	str x8,[sp, #0x18]
00992204	ldr x28,[x27, #0x8]!
00992208	mov x22,x2
0099220c	mov x19,x0
00992210	mov x23,x1
00992214	cbz x28,0x00992278
00992218	add x27,x19,#0x8
0099221c	add x24,x19,#0x10
00992220	b 0x0099222c
00992224	mov x27,x28
00992228	mov x28,x8
0099222c	add x25,x28,#0x20
00992230	mov x0,x24
00992234	mov x1,x23
00992238	mov x2,x25
0099223c	bl 0x00c331d0
00992240	tbz w0,#0x0,0x00992250
00992244	ldr x8,[x28]
00992248	cbnz x8,0x00992224
0099224c	b 0x0099228c
00992250	mov x0,x24
00992254	mov x1,x25
00992258	mov x2,x23
0099225c	bl 0x00c331d0
00992260	tbz w0,#0x0,0x0099227c
00992264	mov x27,x28
00992268	ldr x8,[x27, #0x8]!
0099226c	cbz x8,0x0099227c
00992270	mov x28,x8
00992274	b 0x0099222c
00992278	mov x28,x27
0099227c	ldr x0,[x27]
00992280	cbz x0,0x00992298
00992284	mov x1,xzr
00992288	b 0x009922f0
0099228c	mov x27,x28
00992290	ldr x0,[x27]
00992294	cbnz x0,0x00992284
00992298	mov x8,sp
0099229c	mov x0,x19
009922a0	mov x1,x22
009922a4	mov x2,x21
009922a8	mov x3,x20
009922ac	bl 0x00c33bf0
009922b0	ldr x1,[sp]
009922b4	stp xzr,xzr,[x1]
009922b8	str x28,[x1, #0x10]
009922bc	str x1,[x27]
009922c0	ldr x8,[x19]
009922c4	ldr x8,[x8]
009922c8	cbz x8,0x009922d4
009922cc	str x8,[x19]
009922d0	ldr x1,[x27]
009922d4	ldr x0,[x19, #0x8]
009922d8	bl 0x00c30c90
009922dc	ldr x8,[x19, #0x10]
009922e0	mov w1,#0x1
009922e4	add x8,x8,#0x1
009922e8	str x8,[x19, #0x10]
009922ec	ldr x0,[sp]
009922f0	ldr x8,[x26, #0x28]
009922f4	ldr x9,[sp, #0x18]
009922f8	cmp x8,x9
009922fc	b.ne 0x00992320
00992300	ldp x29,x30,[sp, #0x70]
00992304	ldp x20,x19,[sp, #0x60]
00992308	ldp x22,x21,[sp, #0x50]
0099230c	ldp x24,x23,[sp, #0x40]
00992310	ldp x26,x25,[sp, #0x30]
00992314	ldp x28,x27,[sp, #0x20]
00992318	add sp,sp,#0x80
0099231c	ret
00992320	bl 0x00c2fec0
