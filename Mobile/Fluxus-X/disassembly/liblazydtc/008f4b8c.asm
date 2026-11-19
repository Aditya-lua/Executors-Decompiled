; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>::__emplace_multi<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,cpr::EncodedAuthentication>const&> @ 008f4b8c
008f4b8c	sub sp,sp,#0x70
008f4b90	str x25,[sp, #0x20]
008f4b94	stp x24,x23,[sp, #0x30]
008f4b98	stp x22,x21,[sp, #0x40]
008f4b9c	stp x20,x19,[sp, #0x50]
008f4ba0	stp x29,x30,[sp, #0x60]
008f4ba4	add x29,sp,#0x60
008f4ba8	mrs x22,tpidr_el0
008f4bac	ldr x8,[x22, #0x28]
008f4bb0	mov x19,x0
008f4bb4	str x8,[sp, #0x18]
008f4bb8	mov x8,sp
008f4bbc	bl 0x00c31650
008f4bc0	mov x8,x19
008f4bc4	ldr x20,[sp]
008f4bc8	ldr x23,[x8, #0x8]!
008f4bcc	cbz x23,0x008f4c58
008f4bd0	ldrb w8,[x20, #0x20]
008f4bd4	ldp x10,x11,[x20, #0x28]
008f4bd8	add x9,x20,#0x20
008f4bdc	lsr w12,w8,#0x1
008f4be0	tst w8,#0x1
008f4be4	csel x24,x12,x10,eq
008f4be8	csinc x21,x11,x9,ne
008f4bec	b 0x008f4bf4
008f4bf0	mov x23,x8
008f4bf4	mov x8,x23
008f4bf8	ldrb w9,[x8, #0x20]!
008f4bfc	ldr x10,[x8, #0x8]
008f4c00	lsr w11,w9,#0x1
008f4c04	tst w9,#0x1
008f4c08	csel x25,x11,x10,eq
008f4c0c	cmp x25,x24
008f4c10	csel x2,x25,x24,cc
008f4c14	cbz x2,0x008f4c40
008f4c18	ldr x10,[x23, #0x30]
008f4c1c	tst w9,#0x1
008f4c20	mov x0,x21
008f4c24	csinc x1,x10,x8,ne
008f4c28	bl 0x00c300b0
008f4c2c	cbz w0,0x008f4c40
008f4c30	tbnz w0,#0x1f,0x008f4c48
008f4c34	ldr x8,[x23, #0x8]
008f4c38	cbnz x8,0x008f4bf0
008f4c3c	b 0x008f4c60
008f4c40	cmp x24,x25
008f4c44	b.cs 0x008f4c34
008f4c48	ldr x8,[x23]
008f4c4c	cbnz x8,0x008f4bf0
008f4c50	mov x8,x23
008f4c54	b 0x008f4c64
008f4c58	mov x23,x8
008f4c5c	b 0x008f4c64
008f4c60	add x8,x23,#0x8
008f4c64	stp xzr,xzr,[x20]
008f4c68	str x23,[x20, #0x10]
008f4c6c	str x20,[x8]
008f4c70	ldr x9,[x19]
008f4c74	ldr x9,[x9]
008f4c78	cbz x9,0x008f4c84
008f4c7c	str x9,[x19]
008f4c80	ldr x20,[x8]
008f4c84	ldr x0,[x19, #0x8]
008f4c88	mov x1,x20
008f4c8c	bl 0x00c30c90
008f4c90	ldr x8,[x19, #0x10]
008f4c94	add x8,x8,#0x1
008f4c98	str x8,[x19, #0x10]
008f4c9c	ldr x0,[sp]
008f4ca0	ldr x8,[x22, #0x28]
008f4ca4	ldr x9,[sp, #0x18]
008f4ca8	cmp x8,x9
008f4cac	b.ne 0x008f4ccc
008f4cb0	ldp x29,x30,[sp, #0x60]
008f4cb4	ldp x20,x19,[sp, #0x50]
008f4cb8	ldp x22,x21,[sp, #0x40]
008f4cbc	ldp x24,x23,[sp, #0x30]
008f4cc0	ldr x25,[sp, #0x20]
008f4cc4	add sp,sp,#0x70
008f4cc8	ret
008f4ccc	bl 0x00c2fec0
