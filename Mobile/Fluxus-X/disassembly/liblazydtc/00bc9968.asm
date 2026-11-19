; std::__ndk1::to_wstring @ 00bc9968
00bc9968	paciasp
00bc996c	sub sp,sp,#0x50
00bc9970	stp x29,x30,[sp, #0x20]
00bc9974	stp x22,x21,[sp, #0x30]
00bc9978	stp x20,x19,[sp, #0x40]
00bc997c	add x29,sp,#0x20
00bc9980	mov x21,x0
00bc9984	add x0,sp,#0xc
00bc9988	mov x19,x8
00bc998c	add x20,x0,#0x14
00bc9990	tbz x21,#0x3f,0x00bc99a4
00bc9994	mov w8,#0x2d
00bc9998	orr x0,x0,#0x1
00bc999c	neg x21,x21
00bc99a0	strb w8,[sp, #0xc]
00bc99a4	sub x8,x20,x0
00bc99a8	cmp x8,#0x13
00bc99ac	b.gt 0x00bc99f0
00bc99b0	orr x9,x21,#0x1
00bc99b4	mov w10,#0x40
00bc99b8	clz x9,x9
00bc99bc	sub w9,w10,w9
00bc99c0	mov w10,#0x4d1
00bc99c4	mul w9,w9,w10
00bc99c8	adrp x10,0x78a000
00bc99cc	add x10,x10,#0x248
00bc99d0	lsr w9,w9,#0xc
00bc99d4	ldr x10,[x10, w9, UXTW #0x3]
00bc99d8	cmp x21,x10
00bc99dc	cset w10,cc
00bc99e0	sub w9,w9,w10
00bc99e4	add w9,w9,#0x1
00bc99e8	cmp x8,x9
00bc99ec	b.lt 0x00bc9aec
00bc99f0	lsr x8,x21,#0x20
00bc99f4	cbnz x8,0x00bc9a08
00bc99f8	mov w1,w21
00bc99fc	bl 0x00bcac54
00bc9a00	mov x20,x0
00bc9a04	b 0x00bc9aec
00bc9a08	mov x22,#0xe3ff
00bc9a0c	movk x22,#0x540b, LSL #16
00bc9a10	movk x22,#0x2, LSL #32
00bc9a14	cmp x21,x22
00bc9a18	b.ls 0x00bc9a44
00bc9a1c	mov x8,#0xd5bf
00bc9a20	movk x8,#0xbded, LSL #16
00bc9a24	movk x8,#0xfece, LSL #32
00bc9a28	movk x8,#0xdbe6, LSL #48
00bc9a2c	umulh x8,x21,x8
00bc9a30	lsr x20,x8,#0x21
00bc9a34	mov w1,w20
00bc9a38	bl 0x00bcac54
00bc9a3c	madd x8,x20,x22,x20
00bc9a40	sub x21,x21,x8
00bc9a44	mov x8,#0xcefd
00bc9a48	mov w9,#0xe100
00bc9a4c	mov w10,#0xde83
00bc9a50	movk x8,#0x8461, LSL #16
00bc9a54	movk w9,#0x5f5, LSL #16
00bc9a58	movk w10,#0x431b, LSL #16
00bc9a5c	movk x8,#0x7711, LSL #32
00bc9a60	mov w11,#0x4240
00bc9a64	mov w12,#0x2710
00bc9a68	movk x8,#0xabcc, LSL #48
00bc9a6c	movk w11,#0xf, LSL #16
00bc9a70	add x20,x0,#0xa
00bc9a74	umulh x8,x21,x8
00bc9a78	lsr x8,x8,#0x1a
00bc9a7c	msub w9,w8,w9,w21
00bc9a80	umull x10,w9,w10
00bc9a84	lsr x10,x10,#0x32
00bc9a88	msub w9,w10,w11,w9
00bc9a8c	mov w11,#0x1759
00bc9a90	movk w11,#0xd1b7, LSL #16
00bc9a94	umull x11,w9,w11
00bc9a98	lsr x11,x11,#0x2d
00bc9a9c	msub w9,w11,w12,w9
00bc9aa0	adrp x12,0x78a000
00bc9aa4	add x12,x12,#0x180
00bc9aa8	ldrh w8,[x12, x8, LSL #0x1]
00bc9aac	ubfx w13,w9,#0x2,#0xe
00bc9ab0	strh w8,[x0]
00bc9ab4	mov w8,#0x147b
00bc9ab8	ldrh w10,[x12, x10, LSL #0x1]
00bc9abc	mul w8,w13,w8
00bc9ac0	strh w10,[x0, #0x2]
00bc9ac4	ldrh w10,[x12, x11, LSL #0x1]
00bc9ac8	mov w11,#0x64
00bc9acc	lsr w8,w8,#0x11
00bc9ad0	strh w10,[x0, #0x4]
00bc9ad4	msub w9,w8,w11,w9
00bc9ad8	ldrh w8,[x12, w8, UXTW #0x1]
00bc9adc	strh w8,[x0, #0x6]
00bc9ae0	and x8,x9,#0xffff
00bc9ae4	ldrh w8,[x12, x8, LSL #0x1]
00bc9ae8	strh w8,[x0, #0x8]
00bc9aec	add x8,sp,#0xc
00bc9af0	sub x21,x20,x8
00bc9af4	orr x8,xzr,#0x3ffffffffffffff8
00bc9af8	cmp x21,x8
00bc9afc	b.cs 0x00bc9c14
00bc9b00	cmp x21,#0x4
00bc9b04	b.hi 0x00bc9b14
00bc9b08	lsl w8,w21,#0x1
00bc9b0c	strb w8,[x19], #0x4
00bc9b10	b 0x00bc9b3c
00bc9b14	orr x8,x21,#0x1
00bc9b18	mov w9,#0x8
00bc9b1c	cmp x8,#0x5
00bc9b20	csinc x22,x9,x8,eq
00bc9b24	lsl x0,x22,#0x2
00bc9b28	bl 0x00c2fed0
00bc9b2c	orr x8,x22,#0x1
00bc9b30	stp x21,x0,[x19, #0x8]
00bc9b34	str x8,[x19]
00bc9b38	mov x19,x0
00bc9b3c	add x8,sp,#0xc
00bc9b40	cmp x8,x20
00bc9b44	b.eq 0x00bc9b60
00bc9b48	cmp x21,#0x20
00bc9b4c	add x11,sp,#0xc
00bc9b50	b.cs 0x00bc9b68
00bc9b54	mov x8,x19
00bc9b58	add x9,sp,#0xc
00bc9b5c	b 0x00bc9be8
00bc9b60	mov x8,x19
00bc9b64	b 0x00bc9bf8
00bc9b68	adrp x12,0x29c000
00bc9b6c	and x10,x21,#0x3fffffffffffffe0
00bc9b70	adrp x13,0x29d000
00bc9b74	ldr q0,[x12, #0x890]
00bc9b78	adrp x12,0x29c000
00bc9b7c	adrp x14,0x29c000
00bc9b80	add x8,x19,x10, LSL #0x2
00bc9b84	ldr q1,[x13, #0xa0]
00bc9b88	ldr q2,[x12, #0xcc0]
00bc9b8c	ldr q3,[x14, #0x20]
00bc9b90	add x9,x11,x10
00bc9b94	add x11,x11,#0x10
00bc9b98	add x12,x19,#0x40
00bc9b9c	mov x13,x10
00bc9ba0	ldp q4,q5,[x11, #-0x10]
00bc9ba4	subs x13,x13,#0x20
00bc9ba8	add x11,x11,#0x20
00bc9bac	tbl v6.16B,{v4.16B},v3.16B
00bc9bb0	tbl v7.16B,{v4.16B},v2.16B
00bc9bb4	tbl v16.16B,{v4.16B},v1.16B
00bc9bb8	tbl v4.16B,{v4.16B},v0.16B
00bc9bbc	tbl v17.16B,{v5.16B},v3.16B
00bc9bc0	stp q7,q6,[x12, #-0x20]
00bc9bc4	tbl v6.16B,{v5.16B},v2.16B
00bc9bc8	tbl v7.16B,{v5.16B},v1.16B
00bc9bcc	tbl v5.16B,{v5.16B},v0.16B
00bc9bd0	stp q4,q16,[x12, #-0x40]
00bc9bd4	stp q6,q17,[x12, #0x20]
00bc9bd8	stp q5,q7,[x12], #0x80
00bc9bdc	b.ne 0x00bc9ba0
00bc9be0	cmp x21,x10
00bc9be4	b.eq 0x00bc9bf8
00bc9be8	ldrb w10,[x9], #0x1
00bc9bec	cmp x9,x20
00bc9bf0	str w10,[x8], #0x4
00bc9bf4	b.ne 0x00bc9be8
00bc9bf8	str wzr,[x8]
00bc9bfc	ldp x20,x19,[sp, #0x40]
00bc9c00	ldp x22,x21,[sp, #0x30]
00bc9c04	ldp x29,x30,[sp, #0x20]
00bc9c08	add sp,sp,#0x50
00bc9c0c	autiasp
00bc9c10	ret
00bc9c14	bl 0x00bc5610
