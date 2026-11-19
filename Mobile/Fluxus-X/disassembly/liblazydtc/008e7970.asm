; std::__ndk1::vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>::__push_back_slow_path<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&> @ 008e7970
008e7970	stp x28,x27,[sp, #-0x60]!
008e7974	stp x26,x25,[sp, #0x10]
008e7978	stp x24,x23,[sp, #0x20]
008e797c	stp x22,x21,[sp, #0x30]
008e7980	stp x20,x19,[sp, #0x40]
008e7984	stp x29,x30,[sp, #0x50]
008e7988	add x29,sp,#0x50
008e798c	ldp x20,x24,[x0]
008e7990	orr x9,xzr,#-0x5555555555555556
008e7994	movk x9,#0xaaab
008e7998	orr x26,xzr,#-0x5555555555555556
008e799c	sub x8,x24,x20
008e79a0	asr x8,x8,#0x3
008e79a4	mul x28,x8,x9
008e79a8	movk x26,#0xaaa, LSL #48
008e79ac	add x8,x28,#0x1
008e79b0	mov x19,x0
008e79b4	cmp x8,x26
008e79b8	mov x22,x1
008e79bc	b.hi 0x008e7b60
008e79c0	ldr x10,[x19, #0x10]
008e79c4	sub x10,x10,x20
008e79c8	asr x10,x10,#0x3
008e79cc	mul x9,x10,x9
008e79d0	orr x10,xzr,#0x5555555555555555
008e79d4	movk x10,#0x5554
008e79d8	movk x10,#0x555, LSL #48
008e79dc	cmp x9,x10
008e79e0	b.hi 0x008e79f4
008e79e4	lsl x9,x9,#0x1
008e79e8	cmp x9,x8
008e79ec	csel x26,x8,x9,cc
008e79f0	cbz x26,0x008e7b54
008e79f4	add x8,x26,x26, LSL #0x1
008e79f8	lsl x0,x8,#0x3
008e79fc	bl 0x00c2fed0
008e7a00	mov x23,x0
008e7a04	mov x27,x0
008e7a08	orr w25,wzr,#0x18
008e7a0c	madd x21,x28,x25,x27
008e7a10	stp xzr,xzr,[x21, #0x8]
008e7a14	str xzr,[x21]
008e7a18	ldrb w8,[x22]
008e7a1c	tbnz w8,#0x0,0x008e7a34
008e7a20	ldr x8,[x22, #0x10]
008e7a24	str x8,[x21, #0x10]
008e7a28	ldr q0,[x22]
008e7a2c	str q0,[x21]
008e7a30	b 0x008e7aa8
008e7a34	ldr x20,[x22, #0x8]
008e7a38	cmn x20,#0x10
008e7a3c	b.cs 0x008e7b68
008e7a40	ldr x22,[x22, #0x10]
008e7a44	cmp x20,#0x17
008e7a48	b.cs 0x008e7a60
008e7a4c	lsl w8,w20,#0x1
008e7a50	mov x24,x21
008e7a54	strb w8,[x24], #0x1
008e7a58	cbnz x20,0x008e7a8c
008e7a5c	b 0x008e7a9c
008e7a60	add x8,x20,#0x10
008e7a64	and x25,x8,#-0x10
008e7a68	mov x0,x25
008e7a6c	bl 0x00c2fed0
008e7a70	orr w8,wzr,#0x18
008e7a74	orr x9,x25,#0x1
008e7a78	madd x8,x28,x8,x27
008e7a7c	mov x24,x0
008e7a80	stp x20,x0,[x8, #0x8]
008e7a84	str x9,[x21]
008e7a88	orr w25,wzr,#0x18
008e7a8c	mov x0,x24
008e7a90	mov x1,x22
008e7a94	mov x2,x20
008e7a98	bl 0x00c2ffd0
008e7a9c	strb wzr,[x24, x20]
008e7aa0	ldp x20,x24,[x19]
008e7aa4	nop
008e7aa8	madd x8,x26,x25,x27
008e7aac	cmp x24,x20
008e7ab0	add x9,x21,#0x18
008e7ab4	b.eq 0x008e7ae4
008e7ab8	ldur x10,[x24, #-0x8]
008e7abc	stur x10,[x21, #-0x8]
008e7ac0	ldur q0,[x24, #-0x18]
008e7ac4	stur q0,[x21, #-0x18]
008e7ac8	stp xzr,xzr,[x24, #-0x18]
008e7acc	stur xzr,[x24, #-0x8]
008e7ad0	sub x24,x24,#0x18
008e7ad4	cmp x20,x24
008e7ad8	sub x21,x21,#0x18
008e7adc	b.ne 0x008e7ab8
008e7ae0	ldp x20,x24,[x19]
008e7ae4	cmp x24,x20
008e7ae8	stp x21,x9,[x19]
008e7aec	str x8,[x19, #0x10]
008e7af0	b.eq 0x008e7b14
008e7af4	mov x19,x24
008e7af8	ldrb w8,[x19, #-0x18]!
008e7afc	tbz w8,#0x0,0x008e7b08
008e7b00	ldur x0,[x24, #-0x8]
008e7b04	bl 0x00c301d0
008e7b08	cmp x20,x19
008e7b0c	mov x24,x19
008e7b10	b.ne 0x008e7af8
008e7b14	cbz x20,0x008e7b38
008e7b18	mov x0,x20
008e7b1c	ldp x29,x30,[sp, #0x50]
008e7b20	ldp x20,x19,[sp, #0x40]
008e7b24	ldp x22,x21,[sp, #0x30]
008e7b28	ldp x24,x23,[sp, #0x20]
008e7b2c	ldp x26,x25,[sp, #0x10]
008e7b30	ldp x28,x27,[sp], #0x60
008e7b34	b 0x00c301d0
008e7b38	ldp x29,x30,[sp, #0x50]
008e7b3c	ldp x20,x19,[sp, #0x40]
008e7b40	ldp x22,x21,[sp, #0x30]
008e7b44	ldp x24,x23,[sp, #0x20]
008e7b48	ldp x26,x25,[sp, #0x10]
008e7b4c	ldp x28,x27,[sp], #0x60
008e7b50	ret
008e7b54	mov x23,xzr
008e7b58	mov x27,xzr
008e7b5c	b 0x008e7a08
008e7b60	mov x0,x19
008e7b64	bl 0x00c30bd0
008e7b68	mov x0,x21
008e7b6c	bl 0x00c30ce0
