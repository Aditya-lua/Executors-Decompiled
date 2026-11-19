; ossl_decode_der_dsa_sig @ 00a809c0
00a809c0	sub sp,sp,#0x40
00a809c4	cmp x3,#0x1
00a809c8	str x21,[sp, #0x10]
00a809cc	stp x20,x19,[sp, #0x20]
00a809d0	stp x29,x30,[sp, #0x30]
00a809d4	add x29,sp,#0x30
00a809d8	b.lt 0x00a80a98
00a809dc	cmp x3,#0x1
00a809e0	b.eq 0x00a80a98
00a809e4	ldr x8,[x2]
00a809e8	mov x19,x2
00a809ec	mov x20,x1
00a809f0	mov x1,x0
00a809f4	ldrb w9,[x8]
00a809f8	mov x0,xzr
00a809fc	cmp w9,#0x30
00a80a00	b.ne 0x00a80a9c
00a80a04	ldrsb w11,[x8, #0x1]
00a80a08	sub x10,x3,#0x2
00a80a0c	and x9,x11,#0xff
00a80a10	tbnz w11,#0x1f,0x00a80a64
00a80a14	cmp x10,x9
00a80a18	mov x0,xzr
00a80a1c	b.cc 0x00a80a9c
00a80a20	add x8,x8,#0x2
00a80a24	stp x8,x9,[sp]
00a80a28	add x21,x8,x9
00a80a2c	mov x0,sp
00a80a30	bl 0x00a80894
00a80a34	cbz w0,0x00a80a98
00a80a38	mov x0,sp
00a80a3c	mov x1,x20
00a80a40	bl 0x00a80894
00a80a44	cbz w0,0x00a80a98
00a80a48	ldr x8,[sp, #0x8]
00a80a4c	mov x0,xzr
00a80a50	cbnz x8,0x00a80a9c
00a80a54	ldr x8,[x19]
00a80a58	str x21,[x19]
00a80a5c	sub x0,x21,x8
00a80a60	b 0x00a80a9c
00a80a64	cmp w9,#0x82
00a80a68	b.eq 0x00a80ab0
00a80a6c	cmp w9,#0x81
00a80a70	mov x0,xzr
00a80a74	b.ne 0x00a80a9c
00a80a78	cbz x10,0x00a80a98
00a80a7c	ldrb w9,[x8, #0x2]
00a80a80	sub x10,x3,#0x3
00a80a84	mov x0,xzr
00a80a88	cmp x10,x9
00a80a8c	b.cc 0x00a80a9c
00a80a90	add x8,x8,#0x3
00a80a94	b 0x00a80adc
00a80a98	mov x0,xzr
00a80a9c	ldp x29,x30,[sp, #0x30]
00a80aa0	ldp x20,x19,[sp, #0x20]
00a80aa4	ldr x21,[sp, #0x10]
00a80aa8	add sp,sp,#0x40
00a80aac	ret
00a80ab0	cmp x10,#0x2
00a80ab4	mov x0,xzr
00a80ab8	b.cc 0x00a80a9c
00a80abc	ldrb w10,[x8, #0x2]
00a80ac0	ldrb w9,[x8, #0x3]
00a80ac4	mov x0,xzr
00a80ac8	bfm x9,x10,#0x38,#0x7
00a80acc	sub x10,x3,#0x4
00a80ad0	cmp x10,x9
00a80ad4	b.cc 0x00a80a9c
00a80ad8	add x8,x8,#0x4
00a80adc	add x21,x8,x9
00a80ae0	stp x8,x9,[sp]
00a80ae4	b 0x00a80a2c
