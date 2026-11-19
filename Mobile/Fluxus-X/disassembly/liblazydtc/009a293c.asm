; ix::WebSocketPerMessageDeflateCompressor::compressData<std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>> @ 009a293c
009a293c	str x25,[sp, #-0x50]!
009a2940	stp x24,x23,[sp, #0x10]
009a2944	stp x22,x21,[sp, #0x20]
009a2948	stp x20,x19,[sp, #0x30]
009a294c	stp x29,x30,[sp, #0x40]
009a2950	add x29,sp,#0x40
009a2954	ldrb w8,[x2]
009a2958	mov x19,x2
009a295c	mov x20,x0
009a2960	tbnz w8,#0x0,0x009a296c
009a2964	strh wzr,[x19]
009a2968	b 0x009a2978
009a296c	ldr x8,[x19, #0x10]
009a2970	strb wzr,[x8]
009a2974	str xzr,[x19, #0x8]
009a2978	ldp x8,x9,[x1]
009a297c	cmp x8,x9
009a2980	b.eq 0x009a2abc
009a2984	mov w10,#0x4008
009a2988	mov w12,#0x4028
009a298c	sub w9,w9,w8
009a2990	mov w11,#0x4010
009a2994	add x21,x20,#0x4
009a2998	add x23,x19,#0x1
009a299c	add x22,x20,x10
009a29a0	add x24,x20,x12
009a29a4	mov w25,#0x4000
009a29a8	str w9,[x20, x11#0x0]
009a29ac	str x8,[x20, #0x4008]
009a29b0	str w25,[x24]
009a29b4	ldr w1,[x20]
009a29b8	mov x0,x22
009a29bc	str x21,[x20, #0x4020]
009a29c0	bl 0x00c33270
009a29c4	ldr w8,[x24]
009a29c8	ldrb w9,[x19]
009a29cc	ldp x10,x11,[x19, #0x8]
009a29d0	mov x0,x19
009a29d4	sub x8,x25,x8
009a29d8	lsr w12,w9,#0x1
009a29dc	tst w9,#0x1
009a29e0	csel x9,x23,x11,eq
009a29e4	csel x10,x12,x10,eq
009a29e8	add x8,x20,x8
009a29ec	add x1,x9,x10
009a29f0	add x3,x8,#0x4
009a29f4	mov x2,x21
009a29f8	bl 0x00c33d40
009a29fc	ldr w8,[x24]
009a2a00	cbz w8,0x009a29b0
009a2a04	adrp x11,0xd21000
009a2a08	add x11,x11,#0x850
009a2a0c	ldrb w13,[x11]
009a2a10	ldrb w8,[x19]
009a2a14	ldr x10,[x11, #0x8]
009a2a18	ldr x9,[x19, #0x8]
009a2a1c	lsr w14,w13,#0x1
009a2a20	tst w13,#0x1
009a2a24	lsr w12,w8,#0x1
009a2a28	csel x14,x14,x10,eq
009a2a2c	tst w8,#0x1
009a2a30	csel x10,x12,x9,eq
009a2a34	cmp x14,x10
009a2a38	b.hi 0x009a2ad4
009a2a3c	ldr x9,[x19, #0x10]
009a2a40	ldr x15,[x11, #0x10]
009a2a44	tst w8,#0x1
009a2a48	csel x12,x23,x9,eq
009a2a4c	tst w13,#0x1
009a2a50	add x14,x12,x10
009a2a54	csinc x13,x15,x11,ne
009a2a58	ldurb w11,[x14, #-0x1]
009a2a5c	ldrb w15,[x13, #0x3]
009a2a60	cmp w11,w15
009a2a64	b.ne 0x009a2ad4
009a2a68	ldurb w11,[x14, #-0x2]
009a2a6c	ldrb w14,[x13, #0x2]
009a2a70	cmp w11,w14
009a2a74	b.ne 0x009a2ad4
009a2a78	add x11,x12,x10
009a2a7c	ldurb w11,[x11, #-0x3]
009a2a80	ldrb w14,[x13, #0x1]
009a2a84	cmp w11,w14
009a2a88	b.ne 0x009a2ad4
009a2a8c	sub x11,x10,#0x4
009a2a90	ldrb w12,[x12, x11]
009a2a94	ldrb w13,[x13]
009a2a98	cmp w12,w13
009a2a9c	b.ne 0x009a2ad4
009a2aa0	cmp x10,#0x3
009a2aa4	b.hi 0x009a2af0
009a2aa8	orr x1,xzr,#-0x4
009a2aac	mov x0,x19
009a2ab0	mov w2,wzr
009a2ab4	bl 0x00c30250
009a2ab8	b 0x009a2ad4
009a2abc	mov w1,#0x2
009a2ac0	mov x0,x19
009a2ac4	bl 0x00c30150
009a2ac8	mov x0,x19
009a2acc	mov w1,wzr
009a2ad0	bl 0x00c30150
009a2ad4	ldp x29,x30,[sp, #0x40]
009a2ad8	ldp x20,x19,[sp, #0x30]
009a2adc	ldp x22,x21,[sp, #0x20]
009a2ae0	ldp x24,x23,[sp, #0x10]
009a2ae4	mov w0,#0x1
009a2ae8	ldr x25,[sp], #0x50
009a2aec	ret
009a2af0	tbnz w8,#0x0,0x009a2b08
009a2af4	add x8,x19,x11
009a2af8	lsl w9,w11,#0x1
009a2afc	strb wzr,[x8, #0x1]
009a2b00	strb w9,[x19]
009a2b04	b 0x009a2ad4
009a2b08	strb wzr,[x9, x11]
009a2b0c	str x11,[x19, #0x8]
009a2b10	b 0x009a2ad4
