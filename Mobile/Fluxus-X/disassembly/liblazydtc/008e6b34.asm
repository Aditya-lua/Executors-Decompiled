; std::__ndk1::__hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>::__rehash @ 008e6b34
008e6b34	sub sp,sp,#0x80
008e6b38	stp x28,x27,[sp, #0x20]
008e6b3c	stp x26,x25,[sp, #0x30]
008e6b40	stp x24,x23,[sp, #0x40]
008e6b44	stp x22,x21,[sp, #0x50]
008e6b48	stp x20,x19,[sp, #0x60]
008e6b4c	stp x29,x30,[sp, #0x70]
008e6b50	add x29,sp,#0x70
008e6b54	mov x20,x1
008e6b58	mov x19,x0
008e6b5c	cbz x1,0x008e6bd0
008e6b60	lsr x8,x20,#0x3d
008e6b64	cbnz x8,0x008e6d78
008e6b68	lsl x0,x20,#0x3
008e6b6c	bl 0x00c2fed0
008e6b70	ldr x8,[x19]
008e6b74	str x0,[x19]
008e6b78	cbz x8,0x008e6b84
008e6b7c	mov x0,x8
008e6b80	bl 0x00c301d0
008e6b84	mov x8,xzr
008e6b88	str x20,[x19, #0x8]
008e6b8c	ldr x9,[x19]
008e6b90	str xzr,[x9, x8, LSL #0x3]
008e6b94	add x8,x8,#0x1
008e6b98	cmp x20,x8
008e6b9c	b.ne 0x008e6b8c
008e6ba0	mov x8,x19
008e6ba4	ldr x24,[x8, #0x10]!
008e6ba8	cbz x24,0x008e6d58
008e6bac	ldr x15,[x24, #0x8]
008e6bb0	sub x25,x20,#0x1
008e6bb4	ands x14,x25,x20
008e6bb8	b.eq 0x008e6be8
008e6bbc	cmp x15,x20
008e6bc0	b.cc 0x008e6bec
008e6bc4	udiv x9,x15,x20
008e6bc8	msub x15,x9,x20,x15
008e6bcc	b 0x008e6bec
008e6bd0	ldr x0,[x19]
008e6bd4	str xzr,[x19]
008e6bd8	cbz x0,0x008e6be0
008e6bdc	bl 0x00c301d0
008e6be0	str xzr,[x19, #0x8]
008e6be4	b 0x008e6d58
008e6be8	and x15,x15,x25
008e6bec	ldr x9,[x19]
008e6bf0	str x8,[x9, x15, LSL #0x3]
008e6bf4	ldr x23,[x24]
008e6bf8	cbz x23,0x008e6d58
008e6bfc	stp x19,x20,[sp, #0x8]
008e6c00	str x14,[sp]
008e6c04	ldr x27,[x23, #0x8]
008e6c08	cbz x14,0x008e6c2c
008e6c0c	cmp x27,x20
008e6c10	b.cc 0x008e6c1c
008e6c14	udiv x8,x27,x20
008e6c18	msub x27,x8,x20,x27
008e6c1c	cmp x27,x15
008e6c20	b.ne 0x008e6c38
008e6c24	mov x24,x23
008e6c28	b 0x008e6d50
008e6c2c	and x27,x27,x25
008e6c30	cmp x27,x15
008e6c34	b.eq 0x008e6c24
008e6c38	ldr x8,[x19]
008e6c3c	ldr x9,[x8, x27, LSL #0x3]
008e6c40	cbz x9,0x008e6d44
008e6c44	ldr x8,[x23]
008e6c48	mov x22,x23
008e6c4c	cbz x8,0x008e6d18
008e6c50	ldrb w17,[x23, #0x10]
008e6c54	ldr x9,[x23, #0x18]
008e6c58	add x28,x23,#0x11
008e6c5c	mov x26,x23
008e6c60	lsr w10,w17,#0x1
008e6c64	tst w17,#0x1
008e6c68	csel x21,x10,x9,eq
008e6c6c	neg x18,x10
008e6c70	str x18,[sp, #0x18]
008e6c74	mov x22,x26
008e6c78	mov x26,x8
008e6c7c	ldrb w9,[x8, #0x10]!
008e6c80	ldr x10,[x8, #0x8]
008e6c84	lsr w11,w9,#0x1
008e6c88	tst w9,#0x1
008e6c8c	csel x10,x11,x10,eq
008e6c90	cmp x21,x10
008e6c94	b.ne 0x008e6d18
008e6c98	ldr x10,[x23, #0x20]
008e6c9c	ldr x11,[x26, #0x20]
008e6ca0	tst w17,#0x1
008e6ca4	csel x0,x28,x10,eq
008e6ca8	tst w9,#0x1
008e6cac	csinc x1,x11,x8,ne
008e6cb0	tbnz w17,#0x0,0x008e6ce4
008e6cb4	mov x8,x18
008e6cb8	mov x9,x28
008e6cbc	cbz x21,0x008e6d0c
008e6cc0	ldrb w10,[x9]
008e6cc4	ldrb w11,[x1]
008e6cc8	cmp w10,w11
008e6ccc	b.ne 0x008e6d18
008e6cd0	add x9,x9,#0x1
008e6cd4	adds x8,x8,#0x1
008e6cd8	add x1,x1,#0x1
008e6cdc	b.ne 0x008e6cc0
008e6ce0	b 0x008e6d0c
008e6ce4	cbz x21,0x008e6d0c
008e6ce8	mov x2,x21
008e6cec	mov x20,x15
008e6cf0	mov w19,w17
008e6cf4	bl 0x00c300b0
008e6cf8	mov w17,w19
008e6cfc	mov x15,x20
008e6d00	ldp x14,x19,[sp]
008e6d04	ldp x20,x18,[sp, #0x10]
008e6d08	cbnz w0,0x008e6d18
008e6d0c	ldr x8,[x26]
008e6d10	mov x22,x26
008e6d14	cbnz x8,0x008e6c74
008e6d18	ldr x8,[x22]
008e6d1c	lsl x9,x27,#0x3
008e6d20	str x8,[x24]
008e6d24	ldr x8,[x19]
008e6d28	ldr x8,[x8, x9#0x0]
008e6d2c	ldr x8,[x8]
008e6d30	str x8,[x22]
008e6d34	ldr x8,[x19]
008e6d38	ldr x8,[x8, x9#0x0]
008e6d3c	str x23,[x8]
008e6d40	b 0x008e6d50
008e6d44	str x24,[x8, x27, LSL #0x3]
008e6d48	mov x24,x23
008e6d4c	mov x15,x27
008e6d50	ldr x23,[x24]
008e6d54	cbnz x23,0x008e6c04
008e6d58	ldp x29,x30,[sp, #0x70]
008e6d5c	ldp x20,x19,[sp, #0x60]
008e6d60	ldp x22,x21,[sp, #0x50]
008e6d64	ldp x24,x23,[sp, #0x40]
008e6d68	ldp x26,x25,[sp, #0x30]
008e6d6c	ldp x28,x27,[sp, #0x20]
008e6d70	add sp,sp,#0x80
008e6d74	ret
008e6d78	mov w0,#0x10
008e6d7c	bl 0x00c30000
008e6d80	mov x19,x0
008e6d84	adrp x1,0x2ad000
008e6d88	add x1,x1,#0x51
008e6d8c	bl 0x00c30040
008e6d90	adrp x8,0xcb4000
008e6d94	ldr x8,[x8, #0x980]
008e6d98	adrp x1,0xcb4000
008e6d9c	adrp x2,0xcb4000
008e6da0	mov x0,x19
008e6da4	add x8,x8,#0x10
008e6da8	str x8,[x19]
008e6dac	ldr x1,[x1, #0x970]
008e6db0	ldr x2,[x2, #0x978]
008e6db4	bl 0x00c30020
