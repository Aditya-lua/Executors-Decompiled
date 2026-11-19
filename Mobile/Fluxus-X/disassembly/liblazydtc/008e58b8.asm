; std::__ndk1::unordered_set<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>::unordered_set @ 008e58b8
008e58b8	sub sp,sp,#0xa0
008e58bc	stp x28,x27,[sp, #0x40]
008e58c0	stp x26,x25,[sp, #0x50]
008e58c4	stp x24,x23,[sp, #0x60]
008e58c8	stp x22,x21,[sp, #0x70]
008e58cc	stp x20,x19,[sp, #0x80]
008e58d0	stp x29,x30,[sp, #0x90]
008e58d4	add x29,sp,#0x90
008e58d8	mrs x8,tpidr_el0
008e58dc	str x8,[sp, #0x8]
008e58e0	ldr x8,[x8, #0x28]
008e58e4	mov x20,x1
008e58e8	mov x19,x0
008e58ec	movi v0.2D,#0x0
008e58f0	orr w9,wzr,#0x3f800000
008e58f4	str x8,[sp, #0x38]
008e58f8	stp q0,q0,[x0]
008e58fc	str w9,[x0, #0x20]
008e5900	cbz x2,0x008e5b94
008e5904	orr w8,wzr,#0x18
008e5908	madd x8,x2,x8,x20
008e590c	str x8,[sp, #0x18]
008e5910	add x8,x19,#0x10
008e5914	str x8,[sp, #0x10]
008e5918	ldrb w8,[x20]
008e591c	ldp x10,x9,[x20, #0x8]
008e5920	tst w8,#0x1
008e5924	lsr w11,w8,#0x1
008e5928	csinc x1,x9,x20,ne
008e592c	csel x2,x11,x10,eq
008e5930	add x0,sp,#0x20
008e5934	bl 0x00c30d50
008e5938	ldr x27,[x19, #0x8]
008e593c	mov x21,x0
008e5940	cbz x27,0x008e5a54
008e5944	sub x26,x27,#0x1
008e5948	ands x24,x26,x27
008e594c	b.eq 0x008e5968
008e5950	cmp x21,x27
008e5954	mov x28,x21
008e5958	b.cc 0x008e596c
008e595c	udiv x8,x21,x27
008e5960	msub x28,x8,x27,x21
008e5964	b 0x008e596c
008e5968	and x28,x26,x21
008e596c	ldr x8,[x19]
008e5970	ldr x8,[x8, x28, LSL #0x3]
008e5974	cbz x8,0x008e5a54
008e5978	ldr x25,[x8]
008e597c	cbz x25,0x008e5a54
008e5980	ldrb w8,[x20]
008e5984	ldp x10,x11,[x20, #0x8]
008e5988	add x9,x20,#0x1
008e598c	lsr w12,w8,#0x1
008e5990	tst w8,#0x1
008e5994	csel x22,x12,x10,eq
008e5998	csel x23,x9,x11,eq
008e599c	ldr x8,[x25, #0x8]
008e59a0	cmp x8,x21
008e59a4	b.eq 0x008e59d4
008e59a8	cbz x24,0x008e59c8
008e59ac	cmp x8,x27
008e59b0	b.cc 0x008e59cc
008e59b4	udiv x9,x8,x27
008e59b8	msub x8,x9,x27,x8
008e59bc	cmp x8,x28
008e59c0	b.eq 0x008e59d4
008e59c4	b 0x008e5a54
008e59c8	and x8,x8,x26
008e59cc	cmp x8,x28
008e59d0	b.ne 0x008e5a54
008e59d4	mov x8,x25
008e59d8	ldrb w10,[x8, #0x10]!
008e59dc	ldr x11,[x8, #0x8]
008e59e0	lsr w9,w10,#0x1
008e59e4	tst w10,#0x1
008e59e8	csel x11,x9,x11,eq
008e59ec	cmp x11,x22
008e59f0	b.ne 0x008e5a4c
008e59f4	ldr x11,[x25, #0x20]
008e59f8	tst w10,#0x1
008e59fc	csinc x0,x11,x8,ne
008e5a00	tbnz w10,#0x0,0x008e5a38
008e5a04	cbz x22,0x008e5b84
008e5a08	add x8,x8,#0x1
008e5a0c	neg x9,x9
008e5a10	mov x10,x23
008e5a14	ldrb w11,[x8]
008e5a18	ldrb w12,[x10]
008e5a1c	cmp w11,w12
008e5a20	b.ne 0x008e5a4c
008e5a24	add x8,x8,#0x1
008e5a28	adds x9,x9,#0x1
008e5a2c	add x10,x10,#0x1
008e5a30	b.ne 0x008e5a14
008e5a34	b 0x008e5b84
008e5a38	cbz x22,0x008e5b84
008e5a3c	mov x1,x23
008e5a40	mov x2,x22
008e5a44	bl 0x00c300b0
008e5a48	cbz w0,0x008e5b84
008e5a4c	ldr x25,[x25]
008e5a50	cbnz x25,0x008e599c
008e5a54	add x8,sp,#0x20
008e5a58	mov x0,x19
008e5a5c	mov x1,x21
008e5a60	mov x2,x20
008e5a64	bl 0x00c30cf0
008e5a68	ldr x8,[x19, #0x18]
008e5a6c	ldr s0,[x19, #0x20]
008e5a70	add x8,x8,#0x1
008e5a74	ucvtf s1,x8
008e5a78	cbz x27,0x008e5a8c
008e5a7c	ucvtf s2,x27
008e5a80	fmul s2,s0,s2
008e5a84	fcmp s2,s1
008e5a88	b.pl 0x008e5af8
008e5a8c	cmp x27,#0x3
008e5a90	lsl x8,x27,#0x1
008e5a94	b.cc 0x008e5aa8
008e5a98	sub x9,x27,#0x1
008e5a9c	tst x9,x27
008e5aa0	cset w9,ne
008e5aa4	b 0x008e5aac
008e5aa8	mov w9,#0x1
008e5aac	fdiv s0,s1,s0
008e5ab0	orr x8,x9,x8
008e5ab4	fcvtpu x9,s0
008e5ab8	cmp x8,x9
008e5abc	csel x1,x9,x8,cc
008e5ac0	mov x0,x19
008e5ac4	bl 0x00c30d00
008e5ac8	ldr x27,[x19, #0x8]
008e5acc	sub x8,x27,#0x1
008e5ad0	tst x8,x27
008e5ad4	b.eq 0x008e5ae8
008e5ad8	cmp x21,x27
008e5adc	b.cs 0x008e5af0
008e5ae0	mov x28,x21
008e5ae4	b 0x008e5af8
008e5ae8	and x28,x8,x21
008e5aec	b 0x008e5af8
008e5af0	udiv x8,x21,x27
008e5af4	msub x28,x8,x27,x21
008e5af8	ldr x8,[x19]
008e5afc	ldr x8,[x8, x28, LSL #0x3]
008e5b00	cbz x8,0x008e5b1c
008e5b04	ldr x9,[x8]
008e5b08	ldr x10,[sp, #0x20]
008e5b0c	str x9,[x10]
008e5b10	ldr x9,[sp, #0x20]
008e5b14	str x9,[x8]
008e5b18	b 0x008e5b78
008e5b1c	ldr x8,[x19, #0x10]
008e5b20	ldr x9,[sp, #0x20]
008e5b24	str x8,[x9]
008e5b28	ldr x8,[sp, #0x20]
008e5b2c	ldr x9,[x19]
008e5b30	str x8,[x19, #0x10]
008e5b34	ldr x8,[sp, #0x10]
008e5b38	str x8,[x9, x28, LSL #0x3]
008e5b3c	ldr x8,[sp, #0x20]
008e5b40	ldr x9,[x8]
008e5b44	cbz x9,0x008e5b78
008e5b48	ldr x9,[x9, #0x8]
008e5b4c	sub x10,x27,#0x1
008e5b50	tst x10,x27
008e5b54	b.eq 0x008e5b6c
008e5b58	cmp x9,x27
008e5b5c	b.cc 0x008e5b70
008e5b60	udiv x10,x9,x27
008e5b64	msub x9,x10,x27,x9
008e5b68	b 0x008e5b70
008e5b6c	and x9,x9,x10
008e5b70	ldr x10,[x19]
008e5b74	str x8,[x10, x9, LSL #0x3]
008e5b78	ldr x8,[x19, #0x18]
008e5b7c	add x8,x8,#0x1
008e5b80	str x8,[x19, #0x18]
008e5b84	ldr x8,[sp, #0x18]
008e5b88	add x20,x20,#0x18
008e5b8c	cmp x20,x8
008e5b90	b.ne 0x008e5918
008e5b94	ldr x8,[sp, #0x8]
008e5b98	ldr x8,[x8, #0x28]
008e5b9c	ldr x9,[sp, #0x38]
008e5ba0	cmp x8,x9
008e5ba4	b.ne 0x008e5bc8
008e5ba8	ldp x29,x30,[sp, #0x90]
008e5bac	ldp x20,x19,[sp, #0x80]
008e5bb0	ldp x22,x21,[sp, #0x70]
008e5bb4	ldp x24,x23,[sp, #0x60]
008e5bb8	ldp x26,x25,[sp, #0x50]
008e5bbc	ldp x28,x27,[sp, #0x40]
008e5bc0	add sp,sp,#0xa0
008e5bc4	ret
008e5bc8	bl 0x00c2fec0
