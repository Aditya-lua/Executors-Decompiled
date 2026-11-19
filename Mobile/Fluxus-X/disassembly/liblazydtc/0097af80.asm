; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::__emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>> @ 0097af80
0097af80	str x25,[sp, #-0x50]!
0097af84	stp x24,x23,[sp, #0x10]
0097af88	stp x22,x21,[sp, #0x20]
0097af8c	stp x20,x19,[sp, #0x30]
0097af90	stp x29,x30,[sp, #0x40]
0097af94	add x29,sp,#0x40
0097af98	mov x24,x0
0097af9c	ldr x25,[x24, #0x8]!
0097afa0	mov x20,x3
0097afa4	mov x19,x0
0097afa8	mov x21,x1
0097afac	cbz x25,0x0097b010
0097afb0	add x24,x19,#0x8
0097afb4	add x22,x19,#0x10
0097afb8	b 0x0097afc4
0097afbc	mov x24,x25
0097afc0	mov x25,x8
0097afc4	add x23,x25,#0x20
0097afc8	mov x0,x22
0097afcc	mov x1,x21
0097afd0	mov x2,x23
0097afd4	bl 0x00c331d0
0097afd8	tbz w0,#0x0,0x0097afe8
0097afdc	ldr x8,[x25]
0097afe0	cbnz x8,0x0097afbc
0097afe4	b 0x0097b024
0097afe8	mov x0,x22
0097afec	mov x1,x23
0097aff0	mov x2,x21
0097aff4	bl 0x00c331d0
0097aff8	tbz w0,#0x0,0x0097b014
0097affc	mov x24,x25
0097b000	ldr x8,[x24, #0x8]!
0097b004	cbz x8,0x0097b014
0097b008	mov x25,x8
0097b00c	b 0x0097afc4
0097b010	mov x25,x24
0097b014	ldr x21,[x24]
0097b018	cbz x21,0x0097b030
0097b01c	mov x1,xzr
0097b020	b 0x0097b0a0
0097b024	mov x24,x25
0097b028	ldr x21,[x24]
0097b02c	cbnz x21,0x0097b01c
0097b030	mov w0,#0x50
0097b034	bl 0x00c2fed0
0097b038	ldr x8,[x20]
0097b03c	mov x21,x0
0097b040	ldr x9,[x8, #0x10]
0097b044	str x9,[x0, #0x30]
0097b048	ldr q0,[x8]
0097b04c	str q0,[x0, #0x20]
0097b050	stp xzr,xzr,[x8, #0x8]
0097b054	str xzr,[x8]
0097b058	stp xzr,xzr,[x0, #0x40]
0097b05c	str xzr,[x0, #0x38]
0097b060	stp xzr,xzr,[x0]
0097b064	str x25,[x0, #0x10]
0097b068	str x0,[x24]
0097b06c	ldr x8,[x19]
0097b070	ldr x8,[x8]
0097b074	cbz x8,0x0097b084
0097b078	str x8,[x19]
0097b07c	ldr x1,[x24]
0097b080	b 0x0097b088
0097b084	mov x1,x21
0097b088	ldr x0,[x19, #0x8]
0097b08c	bl 0x00c30c90
0097b090	ldr x8,[x19, #0x10]
0097b094	mov w1,#0x1
0097b098	add x8,x8,#0x1
0097b09c	str x8,[x19, #0x10]
0097b0a0	mov x0,x21
0097b0a4	ldp x29,x30,[sp, #0x40]
0097b0a8	ldp x20,x19,[sp, #0x30]
0097b0ac	ldp x22,x21,[sp, #0x20]
0097b0b0	ldp x24,x23,[sp, #0x10]
0097b0b4	ldr x25,[sp], #0x50
0097b0b8	ret
