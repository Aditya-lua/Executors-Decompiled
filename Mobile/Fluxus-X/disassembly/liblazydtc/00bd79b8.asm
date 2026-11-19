; std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::swap @ 00bd79b8
00bd79b8	paciasp
00bd79bc	sub sp,sp,#0x70
00bd79c0	stp x29,x30,[sp, #0x40]
00bd79c4	str x21,[sp, #0x50]
00bd79c8	stp x20,x19,[sp, #0x60]
00bd79cc	add x29,sp,#0x40
00bd79d0	mov x8,x1
00bd79d4	mov x20,x1
00bd79d8	mov x19,x0
00bd79dc	ldrb w10,[x8, #0x40]!
00bd79e0	ldr x11,[x8, #0x10]
00bd79e4	ldur x9,[x8, #-0x30]
00bd79e8	tst w10,#0x1
00bd79ec	csinc x15,x11,x8,ne
00bd79f0	cbz x9,0x00bd7a20
00bd79f4	ldp x10,x12,[x20, #0x18]
00bd79f8	sub x11,x9,x15
00bd79fc	sub x9,x10,x15
00bd7a00	sub x10,x12,x15
00bd7a04	ldr x12,[x20, #0x28]
00bd7a08	cbz x12,0x00bd7a34
00bd7a0c	ldp x13,x14,[x20, #0x30]
00bd7a10	sub x12,x12,x15
00bd7a14	sub x13,x13,x15
00bd7a18	sub x14,x14,x15
00bd7a1c	b 0x00bd7a40
00bd7a20	mov x9,#-0x1
00bd7a24	mov x10,#-0x1
00bd7a28	mov x11,#-0x1
00bd7a2c	ldr x12,[x20, #0x28]
00bd7a30	cbnz x12,0x00bd7a0c
00bd7a34	mov x12,#-0x1
00bd7a38	mov x13,#-0x1
00bd7a3c	mov x14,#-0x1
00bd7a40	ldr x16,[x20, #0x58]
00bd7a44	mov x4,x19
00bd7a48	ldrb w17,[x4, #0x40]!
00bd7a4c	ldr x1,[x4, #0x10]
00bd7a50	sub x0,x16,x15
00bd7a54	cmp x16,#0x0
00bd7a58	ldur x15,[x4, #-0x30]
00bd7a5c	csinv x16,x0,xzr,ne
00bd7a60	tst w17,#0x1
00bd7a64	csinc x5,x1,x4,ne
00bd7a68	cbz x15,0x00bd7a80
00bd7a6c	ldp x17,x0,[x19, #0x18]
00bd7a70	sub x15,x15,x5
00bd7a74	sub x17,x17,x5
00bd7a78	sub x0,x0,x5
00bd7a7c	b 0x00bd7a8c
00bd7a80	mov x15,#-0x1
00bd7a84	mov x17,#-0x1
00bd7a88	mov x0,#-0x1
00bd7a8c	ldr x1,[x19, #0x28]
00bd7a90	add x6,x4,#0x1
00bd7a94	cbz x1,0x00bd7aac
00bd7a98	ldp x2,x3,[x19, #0x30]
00bd7a9c	sub x1,x1,x5
00bd7aa0	sub x2,x2,x5
00bd7aa4	sub x3,x3,x5
00bd7aa8	b 0x00bd7ab8
00bd7aac	mov x1,#-0x1
00bd7ab0	mov x2,#-0x1
00bd7ab4	mov x3,#-0x1
00bd7ab8	ldr w7,[x20, #0x60]
00bd7abc	ldr w21,[x19, #0x60]
00bd7ac0	str w7,[x19, #0x60]
00bd7ac4	str w21,[x20, #0x60]
00bd7ac8	ldr q0,[x8]
00bd7acc	ldr x7,[x8, #0x10]
00bd7ad0	ldr q1,[x4]
00bd7ad4	ldr x21,[x4, #0x10]
00bd7ad8	str q0,[x4]
00bd7adc	str x7,[x4, #0x10]
00bd7ae0	ldr x4,[x19, #0x58]
00bd7ae4	str q1,[x8]
00bd7ae8	str x21,[x8, #0x10]
00bd7aec	sub x5,x4,x5
00bd7af0	cmp x4,#0x0
00bd7af4	ldrb w7,[x19, #0x40]
00bd7af8	ldr x21,[x19, #0x50]
00bd7afc	csinv x4,x5,xzr,ne
00bd7b00	add x8,x8,#0x1
00bd7b04	tst w7,#0x1
00bd7b08	csel x5,x6,x21,eq
00bd7b0c	cmn x11,#0x1
00bd7b10	add x11,x5,x11
00bd7b14	add x9,x5,x9
00bd7b18	add x10,x5,x10
00bd7b1c	csel x11,xzr,x11,eq
00bd7b20	csel x9,xzr,x9,eq
00bd7b24	csel x10,xzr,x10,eq
00bd7b28	cmn x12,#0x1
00bd7b2c	stp x11,x9,[x19, #0x10]
00bd7b30	str x10,[x19, #0x20]
00bd7b34	b.eq 0x00bd7b4c
00bd7b38	add x9,x5,x12
00bd7b3c	add x10,x5,x14
00bd7b40	add x11,x9,x13
00bd7b44	str x11,[x19, #0x30]
00bd7b48	b 0x00bd7b58
00bd7b4c	mov x9,xzr
00bd7b50	mov x10,xzr
00bd7b54	str xzr,[x19, #0x30]
00bd7b58	str x9,[x19, #0x28]
00bd7b5c	add x9,x5,x16
00bd7b60	cmn x16,#0x1
00bd7b64	csel x9,xzr,x9,eq
00bd7b68	str x10,[x19, #0x38]
00bd7b6c	str x9,[x19, #0x58]
00bd7b70	ldrb w9,[x20, #0x40]
00bd7b74	ldr x10,[x20, #0x50]
00bd7b78	tst w9,#0x1
00bd7b7c	csel x8,x8,x10,eq
00bd7b80	cmn x15,#0x1
00bd7b84	add x9,x8,x15
00bd7b88	add x10,x8,x17
00bd7b8c	add x11,x8,x0
00bd7b90	csel x9,xzr,x9,eq
00bd7b94	csel x10,xzr,x10,eq
00bd7b98	stp x9,x10,[x20, #0x10]
00bd7b9c	csel x9,xzr,x11,eq
00bd7ba0	cmn x1,#0x1
00bd7ba4	str x9,[x20, #0x20]
00bd7ba8	b.eq 0x00bd7bc0
00bd7bac	add x9,x8,x1
00bd7bb0	add x10,x8,x3
00bd7bb4	add x11,x9,x2
00bd7bb8	str x11,[x20, #0x30]
00bd7bbc	b 0x00bd7bcc
00bd7bc0	mov x9,xzr
00bd7bc4	mov x10,xzr
00bd7bc8	str xzr,[x20, #0x30]
00bd7bcc	add x8,x8,x4
00bd7bd0	cmn x4,#0x1
00bd7bd4	add x0,x29,#0x18
00bd7bd8	csel x8,xzr,x8,eq
00bd7bdc	add x1,x20,#0x8
00bd7be0	str x9,[x20, #0x28]
00bd7be4	str x10,[x20, #0x38]
00bd7be8	str x8,[x20, #0x58]
00bd7bec	bl 0x00c30660
00bd7bf0	add x0,sp,#0x10
00bd7bf4	add x1,x19,#0x8
00bd7bf8	bl 0x00c30660
00bd7bfc	ldr x8,[x20]
00bd7c00	ldr x8,[x8, #0x10]
00bd7c04	add x1,sp,#0x10
00bd7c08	mov x0,x20
00bd7c0c	blr x8
00bd7c10	add x0,sp,#0x18
00bd7c14	add x1,x20,#0x8
00bd7c18	bl 0x00c30660
00bd7c1c	add x0,x20,#0x8
00bd7c20	add x1,sp,#0x10
00bd7c24	bl 0x00c43f00
00bd7c28	add x0,sp,#0x18
00bd7c2c	bl 0x00c30090
00bd7c30	add x0,sp,#0x10
00bd7c34	bl 0x00c30090
00bd7c38	ldr x8,[x19]
00bd7c3c	ldr x8,[x8, #0x10]
00bd7c40	add x1,x29,#0x18
00bd7c44	mov x0,x19
00bd7c48	blr x8
00bd7c4c	add x0,sp,#0x8
00bd7c50	add x1,x19,#0x8
00bd7c54	bl 0x00c30660
00bd7c58	add x0,x19,#0x8
00bd7c5c	add x1,x29,#0x18
00bd7c60	bl 0x00c43f00
00bd7c64	add x0,sp,#0x8
00bd7c68	bl 0x00c30090
00bd7c6c	add x0,x29,#0x18
00bd7c70	bl 0x00c30090
00bd7c74	ldp x20,x19,[sp, #0x60]
00bd7c78	ldr x21,[sp, #0x50]
00bd7c7c	ldp x29,x30,[sp, #0x40]
00bd7c80	add sp,sp,#0x70
00bd7c84	autiasp
00bd7c88	ret
