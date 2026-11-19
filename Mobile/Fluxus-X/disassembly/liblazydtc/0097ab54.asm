; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::__assign_multi<std::__ndk1::__tree_const_iterator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__tree_node<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,void*>*,long>> @ 0097ab54
0097ab54	stp x28,x27,[sp, #-0x60]!
0097ab58	stp x26,x25,[sp, #0x10]
0097ab5c	stp x24,x23,[sp, #0x20]
0097ab60	stp x22,x21,[sp, #0x30]
0097ab64	stp x20,x19,[sp, #0x40]
0097ab68	stp x29,x30,[sp, #0x50]
0097ab6c	add x29,sp,#0x50
0097ab70	ldr x8,[x0, #0x10]
0097ab74	mov x20,x2
0097ab78	mov x19,x0
0097ab7c	mov x21,x1
0097ab80	cbz x8,0x0097ad50
0097ab84	mov x25,x19
0097ab88	ldr x8,[x19]
0097ab8c	ldr x9,[x25, #0x8]!
0097ab90	str x25,[x19]
0097ab94	str xzr,[x9, #0x10]
0097ab98	str xzr,[x19, #0x10]
0097ab9c	str xzr,[x25]
0097aba0	ldr x9,[x8, #0x8]
0097aba4	cmp x9,#0x0
0097aba8	csel x26,x8,x9,eq
0097abac	cbz x26,0x0097ad50
0097abb0	add x22,x19,#0x10
0097abb4	b 0x0097abc0
0097abb8	mov x21,x9
0097abbc	cbz x26,0x0097ad50
0097abc0	cmp x21,x20
0097abc4	mov x23,x26
0097abc8	b.eq 0x0097adc8
0097abcc	cmp x23,x21
0097abd0	b.eq 0x0097ac1c
0097abd4	ldrb w9,[x21, #0x20]
0097abd8	ldp x10,x11,[x21, #0x28]
0097abdc	add x8,x21,#0x20
0097abe0	add x0,x23,#0x20
0097abe4	tst w9,#0x1
0097abe8	lsr w12,w9,#0x1
0097abec	csinc x1,x11,x8,ne
0097abf0	csel x2,x12,x10,eq
0097abf4	bl 0x00c31090
0097abf8	ldrb w8,[x21, #0x38]
0097abfc	ldp x9,x10,[x21, #0x40]
0097ac00	add x11,x21,#0x39
0097ac04	add x0,x23,#0x38
0097ac08	tst w8,#0x1
0097ac0c	lsr w12,w8,#0x1
0097ac10	csel x1,x11,x10,eq
0097ac14	csel x2,x12,x9,eq
0097ac18	bl 0x00c31090
0097ac1c	mov x27,x23
0097ac20	ldr x26,[x27, #0x10]!
0097ac24	cbz x26,0x0097ac74
0097ac28	ldr x8,[x26]
0097ac2c	cmp x8,x23
0097ac30	b.eq 0x0097ac54
0097ac34	str xzr,[x26, #0x8]
0097ac38	cbz x8,0x0097ac74
0097ac3c	mov x26,x8
0097ac40	ldr x8,[x8]
0097ac44	cbnz x8,0x0097ac3c
0097ac48	ldr x8,[x26, #0x8]
0097ac4c	cbnz x8,0x0097ac3c
0097ac50	b 0x0097ac74
0097ac54	ldr x8,[x26, #0x8]
0097ac58	str xzr,[x26]
0097ac5c	cbz x8,0x0097ac74
0097ac60	mov x26,x8
0097ac64	ldr x8,[x8]
0097ac68	cbnz x8,0x0097ac60
0097ac6c	ldr x8,[x26, #0x8]
0097ac70	cbnz x8,0x0097ac60
0097ac74	ldr x28,[x25]
0097ac78	cbz x28,0x0097acb8
0097ac7c	add x24,x23,#0x20
0097ac80	b 0x0097ac88
0097ac84	mov x28,x8
0097ac88	add x2,x28,#0x20
0097ac8c	mov x0,x22
0097ac90	mov x1,x24
0097ac94	bl 0x00c331d0
0097ac98	tbz w0,#0x0,0x0097aca8
0097ac9c	ldr x8,[x28]
0097aca0	cbnz x8,0x0097ac84
0097aca4	b 0x0097acc4
0097aca8	ldr x8,[x28, #0x8]
0097acac	cbnz x8,0x0097ac84
0097acb0	add x8,x28,#0x8
0097acb4	b 0x0097acc8
0097acb8	mov x28,x25
0097acbc	mov x8,x25
0097acc0	b 0x0097acc8
0097acc4	mov x8,x28
0097acc8	stp xzr,xzr,[x23]
0097accc	str x28,[x23, #0x10]
0097acd0	str x23,[x8]
0097acd4	ldr x9,[x19]
0097acd8	ldr x9,[x9]
0097acdc	cbz x9,0x0097ace8
0097ace0	str x9,[x19]
0097ace4	ldr x23,[x8]
0097ace8	ldr x0,[x19, #0x8]
0097acec	mov x1,x23
0097acf0	bl 0x00c30c90
0097acf4	ldr x8,[x19, #0x10]
0097acf8	add x8,x8,#0x1
0097acfc	str x8,[x19, #0x10]
0097ad00	ldr x8,[x21, #0x8]
0097ad04	cbz x8,0x0097ad18
0097ad08	mov x21,x8
0097ad0c	ldr x8,[x8]
0097ad10	cbnz x8,0x0097ad08
0097ad14	b 0x0097ad44
0097ad18	mov x8,x21
0097ad1c	ldr x9,[x8, #0x10]!
0097ad20	ldr x10,[x9]
0097ad24	cmp x10,x21
0097ad28	b.eq 0x0097abb8
0097ad2c	ldr x9,[x8]
0097ad30	mov x8,x9
0097ad34	ldr x21,[x8, #0x10]!
0097ad38	ldr x10,[x21]
0097ad3c	cmp x10,x9
0097ad40	b.ne 0x0097ad2c
0097ad44	cbnz x26,0x0097abc0
0097ad48	b 0x0097ad50
0097ad4c	mov x21,x9
0097ad50	cmp x21,x20
0097ad54	b.eq 0x0097adac
0097ad58	add x1,x21,#0x20
0097ad5c	mov x0,x19
0097ad60	bl 0x00c33140
0097ad64	ldr x8,[x21, #0x8]
0097ad68	cbz x8,0x0097ad7c
0097ad6c	mov x21,x8
0097ad70	ldr x8,[x8]
0097ad74	cbnz x8,0x0097ad6c
0097ad78	b 0x0097ad50
0097ad7c	mov x8,x21
0097ad80	ldr x9,[x8, #0x10]!
0097ad84	ldr x10,[x9]
0097ad88	cmp x10,x21
0097ad8c	b.eq 0x0097ad4c
0097ad90	ldr x9,[x8]
0097ad94	mov x8,x9
0097ad98	ldr x21,[x8, #0x10]!
0097ad9c	ldr x10,[x21]
0097ada0	cmp x10,x9
0097ada4	b.ne 0x0097ad90
0097ada8	b 0x0097ad50
0097adac	ldp x29,x30,[sp, #0x50]
0097adb0	ldp x20,x19,[sp, #0x40]
0097adb4	ldp x22,x21,[sp, #0x30]
0097adb8	ldp x24,x23,[sp, #0x20]
0097adbc	ldp x26,x25,[sp, #0x10]
0097adc0	ldp x28,x27,[sp], #0x60
0097adc4	ret
0097adc8	ldr x8,[x23, #0x10]
0097adcc	cbz x8,0x0097addc
0097add0	mov x23,x8
0097add4	ldr x8,[x8, #0x10]
0097add8	cbnz x8,0x0097add0
0097addc	mov x0,x19
0097ade0	mov x1,x23
0097ade4	ldp x29,x30,[sp, #0x50]
0097ade8	ldp x20,x19,[sp, #0x40]
0097adec	ldp x22,x21,[sp, #0x30]
0097adf0	ldp x24,x23,[sp, #0x20]
0097adf4	ldp x26,x25,[sp, #0x10]
0097adf8	ldp x28,x27,[sp], #0x60
0097adfc	b 0x00c32fc0
