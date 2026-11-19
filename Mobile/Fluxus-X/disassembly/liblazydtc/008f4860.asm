; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>::__assign_multi<std::__ndk1::__tree_const_iterator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__tree_node<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,void*>*,long>> @ 008f4860
008f4860	stp x28,x27,[sp, #-0x60]!
008f4864	stp x26,x25,[sp, #0x10]
008f4868	stp x24,x23,[sp, #0x20]
008f486c	stp x22,x21,[sp, #0x30]
008f4870	stp x20,x19,[sp, #0x40]
008f4874	stp x29,x30,[sp, #0x50]
008f4878	add x29,sp,#0x50
008f487c	ldr x8,[x0, #0x10]
008f4880	mov x20,x2
008f4884	mov x19,x0
008f4888	mov x21,x1
008f488c	cbz x8,0x008f4aa0
008f4890	mov x24,x19
008f4894	ldr x8,[x19]
008f4898	ldr x9,[x24, #0x8]!
008f489c	str x24,[x19]
008f48a0	str xzr,[x9, #0x10]
008f48a4	str xzr,[x19, #0x10]
008f48a8	str xzr,[x24]
008f48ac	ldr x9,[x8, #0x8]
008f48b0	cmp x9,#0x0
008f48b4	csel x25,x8,x9,eq
008f48b8	cbnz x25,0x008f48c8
008f48bc	b 0x008f4aa0
008f48c0	mov x21,x9
008f48c4	cbz x25,0x008f4aa0
008f48c8	cmp x21,x20
008f48cc	mov x22,x25
008f48d0	b.eq 0x008f4b18
008f48d4	cmp x22,x21
008f48d8	b.eq 0x008f4924
008f48dc	ldrb w9,[x21, #0x20]
008f48e0	ldp x10,x11,[x21, #0x28]
008f48e4	add x8,x21,#0x20
008f48e8	add x0,x22,#0x20
008f48ec	tst w9,#0x1
008f48f0	lsr w12,w9,#0x1
008f48f4	csinc x1,x11,x8,ne
008f48f8	csel x2,x12,x10,eq
008f48fc	bl 0x00c31090
008f4900	ldrb w8,[x21, #0x40]
008f4904	ldp x9,x10,[x21, #0x48]
008f4908	add x11,x21,#0x41
008f490c	add x0,x22,#0x40
008f4910	tst w8,#0x1
008f4914	lsr w12,w8,#0x1
008f4918	csel x1,x11,x10,eq
008f491c	csel x2,x12,x9,eq
008f4920	bl 0x00c31090
008f4924	ldr x25,[x22, #0x10]
008f4928	cbz x25,0x008f4978
008f492c	ldr x8,[x25]
008f4930	cmp x8,x22
008f4934	b.eq 0x008f4958
008f4938	str xzr,[x25, #0x8]
008f493c	cbz x8,0x008f4978
008f4940	mov x25,x8
008f4944	ldr x8,[x8]
008f4948	cbnz x8,0x008f4940
008f494c	ldr x8,[x25, #0x8]
008f4950	cbnz x8,0x008f4940
008f4954	b 0x008f4978
008f4958	ldr x8,[x25, #0x8]
008f495c	str xzr,[x25]
008f4960	cbz x8,0x008f4978
008f4964	mov x25,x8
008f4968	ldr x8,[x8]
008f496c	cbnz x8,0x008f4964
008f4970	ldr x8,[x25, #0x8]
008f4974	cbnz x8,0x008f4964
008f4978	ldr x26,[x24]
008f497c	cbz x26,0x008f4a08
008f4980	ldrb w8,[x22, #0x20]
008f4984	ldp x10,x11,[x22, #0x28]
008f4988	add x9,x22,#0x20
008f498c	lsr w12,w8,#0x1
008f4990	tst w8,#0x1
008f4994	csel x27,x12,x10,eq
008f4998	csinc x23,x11,x9,ne
008f499c	b 0x008f49a4
008f49a0	mov x26,x8
008f49a4	mov x8,x26
008f49a8	ldrb w9,[x8, #0x20]!
008f49ac	ldr x10,[x8, #0x8]
008f49b0	lsr w11,w9,#0x1
008f49b4	tst w9,#0x1
008f49b8	csel x28,x11,x10,eq
008f49bc	cmp x28,x27
008f49c0	csel x2,x28,x27,cc
008f49c4	cbz x2,0x008f49f0
008f49c8	ldr x10,[x26, #0x30]
008f49cc	tst w9,#0x1
008f49d0	mov x0,x23
008f49d4	csinc x1,x10,x8,ne
008f49d8	bl 0x00c300b0
008f49dc	cbz w0,0x008f49f0
008f49e0	tbnz w0,#0x1f,0x008f49f8
008f49e4	ldr x8,[x26, #0x8]
008f49e8	cbnz x8,0x008f49a0
008f49ec	b 0x008f4a14
008f49f0	cmp x27,x28
008f49f4	b.cs 0x008f49e4
008f49f8	ldr x8,[x26]
008f49fc	cbnz x8,0x008f49a0
008f4a00	mov x8,x26
008f4a04	b 0x008f4a18
008f4a08	mov x26,x24
008f4a0c	mov x8,x24
008f4a10	b 0x008f4a18
008f4a14	add x8,x26,#0x8
008f4a18	stp xzr,xzr,[x22]
008f4a1c	str x26,[x22, #0x10]
008f4a20	str x22,[x8]
008f4a24	ldr x9,[x19]
008f4a28	ldr x9,[x9]
008f4a2c	cbz x9,0x008f4a38
008f4a30	str x9,[x19]
008f4a34	ldr x22,[x8]
008f4a38	ldr x0,[x19, #0x8]
008f4a3c	mov x1,x22
008f4a40	bl 0x00c30c90
008f4a44	ldr x8,[x19, #0x10]
008f4a48	add x8,x8,#0x1
008f4a4c	str x8,[x19, #0x10]
008f4a50	ldr x8,[x21, #0x8]
008f4a54	cbz x8,0x008f4a68
008f4a58	mov x21,x8
008f4a5c	ldr x8,[x8]
008f4a60	cbnz x8,0x008f4a58
008f4a64	b 0x008f4a94
008f4a68	mov x8,x21
008f4a6c	ldr x9,[x8, #0x10]!
008f4a70	ldr x10,[x9]
008f4a74	cmp x10,x21
008f4a78	b.eq 0x008f48c0
008f4a7c	ldr x9,[x8]
008f4a80	mov x8,x9
008f4a84	ldr x21,[x8, #0x10]!
008f4a88	ldr x10,[x21]
008f4a8c	cmp x10,x9
008f4a90	b.ne 0x008f4a7c
008f4a94	cbnz x25,0x008f48c8
008f4a98	b 0x008f4aa0
008f4a9c	mov x21,x9
008f4aa0	cmp x21,x20
008f4aa4	b.eq 0x008f4afc
008f4aa8	add x1,x21,#0x20
008f4aac	mov x0,x19
008f4ab0	bl 0x00c31640
008f4ab4	ldr x8,[x21, #0x8]
008f4ab8	cbz x8,0x008f4acc
008f4abc	mov x21,x8
008f4ac0	ldr x8,[x8]
008f4ac4	cbnz x8,0x008f4abc
008f4ac8	b 0x008f4aa0
008f4acc	mov x8,x21
008f4ad0	ldr x9,[x8, #0x10]!
008f4ad4	ldr x10,[x9]
008f4ad8	cmp x10,x21
008f4adc	b.eq 0x008f4a9c
008f4ae0	ldr x9,[x8]
008f4ae4	mov x8,x9
008f4ae8	ldr x21,[x8, #0x10]!
008f4aec	ldr x10,[x21]
008f4af0	cmp x10,x9
008f4af4	b.ne 0x008f4ae0
008f4af8	b 0x008f4aa0
008f4afc	ldp x29,x30,[sp, #0x50]
008f4b00	ldp x20,x19,[sp, #0x40]
008f4b04	ldp x22,x21,[sp, #0x30]
008f4b08	ldp x24,x23,[sp, #0x20]
008f4b0c	ldp x26,x25,[sp, #0x10]
008f4b10	ldp x28,x27,[sp], #0x60
008f4b14	ret
008f4b18	ldr x8,[x22, #0x10]
008f4b1c	cbz x8,0x008f4b2c
008f4b20	mov x22,x8
008f4b24	ldr x8,[x8, #0x10]
008f4b28	cbnz x8,0x008f4b20
008f4b2c	mov x0,x19
008f4b30	mov x1,x22
008f4b34	ldp x29,x30,[sp, #0x50]
008f4b38	ldp x20,x19,[sp, #0x40]
008f4b3c	ldp x22,x21,[sp, #0x30]
008f4b40	ldp x24,x23,[sp, #0x20]
008f4b44	ldp x26,x25,[sp, #0x10]
008f4b48	ldp x28,x27,[sp], #0x60
008f4b4c	b 0x00826780
