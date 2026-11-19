; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,cpr::CaseInsensitiveCompare,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::__assign_multi<std::__ndk1::__tree_const_iterator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__tree_node<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,void*>*,long>> @ 008f9928
008f9928	str x27,[sp, #-0x60]!
008f992c	stp x26,x25,[sp, #0x10]
008f9930	stp x24,x23,[sp, #0x20]
008f9934	stp x22,x21,[sp, #0x30]
008f9938	stp x20,x19,[sp, #0x40]
008f993c	stp x29,x30,[sp, #0x50]
008f9940	add x29,sp,#0x50
008f9944	ldr x8,[x0, #0x10]
008f9948	mov x20,x2
008f994c	mov x19,x0
008f9950	mov x21,x1
008f9954	cbz x8,0x008f9b20
008f9958	mov x25,x19
008f995c	ldr x8,[x19]
008f9960	ldr x9,[x25, #0x8]!
008f9964	str x25,[x19]
008f9968	str xzr,[x9, #0x10]
008f996c	str xzr,[x19, #0x10]
008f9970	str xzr,[x25]
008f9974	ldr x9,[x8, #0x8]
008f9978	cmp x9,#0x0
008f997c	csel x26,x8,x9,eq
008f9980	cbz x26,0x008f9b20
008f9984	add x22,x19,#0x10
008f9988	b 0x008f9994
008f998c	mov x21,x9
008f9990	cbz x26,0x008f9b20
008f9994	cmp x21,x20
008f9998	mov x23,x26
008f999c	b.eq 0x008f9b98
008f99a0	cmp x23,x21
008f99a4	b.eq 0x008f99f0
008f99a8	ldrb w9,[x21, #0x20]
008f99ac	ldp x10,x11,[x21, #0x28]
008f99b0	add x8,x21,#0x20
008f99b4	add x0,x23,#0x20
008f99b8	tst w9,#0x1
008f99bc	lsr w12,w9,#0x1
008f99c0	csinc x1,x11,x8,ne
008f99c4	csel x2,x12,x10,eq
008f99c8	bl 0x00c31090
008f99cc	ldrb w8,[x21, #0x38]
008f99d0	ldp x9,x10,[x21, #0x40]
008f99d4	add x11,x21,#0x39
008f99d8	add x0,x23,#0x38
008f99dc	tst w8,#0x1
008f99e0	lsr w12,w8,#0x1
008f99e4	csel x1,x11,x10,eq
008f99e8	csel x2,x12,x9,eq
008f99ec	bl 0x00c31090
008f99f0	ldr x26,[x23, #0x10]
008f99f4	cbz x26,0x008f9a44
008f99f8	ldr x8,[x26]
008f99fc	cmp x8,x23
008f9a00	b.eq 0x008f9a24
008f9a04	str xzr,[x26, #0x8]
008f9a08	cbz x8,0x008f9a44
008f9a0c	mov x26,x8
008f9a10	ldr x8,[x8]
008f9a14	cbnz x8,0x008f9a0c
008f9a18	ldr x8,[x26, #0x8]
008f9a1c	cbnz x8,0x008f9a0c
008f9a20	b 0x008f9a44
008f9a24	ldr x8,[x26, #0x8]
008f9a28	str xzr,[x26]
008f9a2c	cbz x8,0x008f9a44
008f9a30	mov x26,x8
008f9a34	ldr x8,[x8]
008f9a38	cbnz x8,0x008f9a30
008f9a3c	ldr x8,[x26, #0x8]
008f9a40	cbnz x8,0x008f9a30
008f9a44	ldr x27,[x25]
008f9a48	cbz x27,0x008f9a88
008f9a4c	add x24,x23,#0x20
008f9a50	b 0x008f9a58
008f9a54	mov x27,x8
008f9a58	add x2,x27,#0x20
008f9a5c	mov x0,x22
008f9a60	mov x1,x24
008f9a64	bl 0x00c30490
008f9a68	tbz w0,#0x0,0x008f9a78
008f9a6c	ldr x8,[x27]
008f9a70	cbnz x8,0x008f9a54
008f9a74	b 0x008f9a94
008f9a78	ldr x8,[x27, #0x8]
008f9a7c	cbnz x8,0x008f9a54
008f9a80	add x8,x27,#0x8
008f9a84	b 0x008f9a98
008f9a88	mov x27,x25
008f9a8c	mov x8,x25
008f9a90	b 0x008f9a98
008f9a94	mov x8,x27
008f9a98	stp xzr,xzr,[x23]
008f9a9c	str x27,[x23, #0x10]
008f9aa0	str x23,[x8]
008f9aa4	ldr x9,[x19]
008f9aa8	ldr x9,[x9]
008f9aac	cbz x9,0x008f9ab8
008f9ab0	str x9,[x19]
008f9ab4	ldr x23,[x8]
008f9ab8	ldr x0,[x19, #0x8]
008f9abc	mov x1,x23
008f9ac0	bl 0x00c30c90
008f9ac4	ldr x8,[x19, #0x10]
008f9ac8	add x8,x8,#0x1
008f9acc	str x8,[x19, #0x10]
008f9ad0	ldr x8,[x21, #0x8]
008f9ad4	cbz x8,0x008f9ae8
008f9ad8	mov x21,x8
008f9adc	ldr x8,[x8]
008f9ae0	cbnz x8,0x008f9ad8
008f9ae4	b 0x008f9b14
008f9ae8	mov x8,x21
008f9aec	ldr x9,[x8, #0x10]!
008f9af0	ldr x10,[x9]
008f9af4	cmp x10,x21
008f9af8	b.eq 0x008f998c
008f9afc	ldr x9,[x8]
008f9b00	mov x8,x9
008f9b04	ldr x21,[x8, #0x10]!
008f9b08	ldr x10,[x21]
008f9b0c	cmp x10,x9
008f9b10	b.ne 0x008f9afc
008f9b14	cbnz x26,0x008f9994
008f9b18	b 0x008f9b20
008f9b1c	mov x21,x9
008f9b20	cmp x21,x20
008f9b24	b.eq 0x008f9b7c
008f9b28	add x1,x21,#0x20
008f9b2c	mov x0,x19
008f9b30	bl 0x00c31670
008f9b34	ldr x8,[x21, #0x8]
008f9b38	cbz x8,0x008f9b4c
008f9b3c	mov x21,x8
008f9b40	ldr x8,[x8]
008f9b44	cbnz x8,0x008f9b3c
008f9b48	b 0x008f9b20
008f9b4c	mov x8,x21
008f9b50	ldr x9,[x8, #0x10]!
008f9b54	ldr x10,[x9]
008f9b58	cmp x10,x21
008f9b5c	b.eq 0x008f9b1c
008f9b60	ldr x9,[x8]
008f9b64	mov x8,x9
008f9b68	ldr x21,[x8, #0x10]!
008f9b6c	ldr x10,[x21]
008f9b70	cmp x10,x9
008f9b74	b.ne 0x008f9b60
008f9b78	b 0x008f9b20
008f9b7c	ldp x29,x30,[sp, #0x50]
008f9b80	ldp x20,x19,[sp, #0x40]
008f9b84	ldp x22,x21,[sp, #0x30]
008f9b88	ldp x24,x23,[sp, #0x20]
008f9b8c	ldp x26,x25,[sp, #0x10]
008f9b90	ldr x27,[sp], #0x60
008f9b94	ret
008f9b98	ldr x8,[x23, #0x10]
008f9b9c	cbz x8,0x008f9bac
008f9ba0	mov x23,x8
008f9ba4	ldr x8,[x8, #0x10]
008f9ba8	cbnz x8,0x008f9ba0
008f9bac	mov x0,x19
008f9bb0	mov x1,x23
008f9bb4	ldp x29,x30,[sp, #0x50]
008f9bb8	ldp x20,x19,[sp, #0x40]
008f9bbc	ldp x22,x21,[sp, #0x30]
008f9bc0	ldp x24,x23,[sp, #0x20]
008f9bc4	ldp x26,x25,[sp, #0x10]
008f9bc8	ldr x27,[sp], #0x60
008f9bcc	b 0x00827168
