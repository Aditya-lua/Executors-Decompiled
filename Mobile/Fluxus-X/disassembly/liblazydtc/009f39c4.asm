; ossl_c2i_uint64_int @ 009f39c4
009f39c4	str x23,[sp, #-0x40]!
009f39c8	stp x22,x21,[sp, #0x10]
009f39cc	stp x20,x19,[sp, #0x20]
009f39d0	stp x29,x30,[sp, #0x30]
009f39d4	mov x23,x2
009f39d8	ldr x2,[x2]
009f39dc	mov x22,x1
009f39e0	mov x19,x0
009f39e4	mov x0,xzr
009f39e8	mov x1,xzr
009f39ec	add x29,sp,#0x30
009f39f0	mov x21,x3
009f39f4	bl 0x009f2ec4
009f39f8	cbz x0,0x009f3a74
009f39fc	mov x20,x0
009f3a00	cmp x0,#0x9
009f3a04	b.cc 0x009f3a3c
009f3a08	bl 0x00c342a0
009f3a0c	adrp x0,0x2b9000
009f3a10	adrp x2,0x2ad000
009f3a14	add x0,x0,#0xb0a
009f3a18	add x2,x2,#0x9b4
009f3a1c	mov w1,#0x274
009f3a20	bl 0x00c342b0
009f3a24	mov w0,#0xd
009f3a28	mov w1,#0xdf
009f3a2c	mov x2,xzr
009f3a30	bl 0x00c342c0
009f3a34	mov w0,wzr
009f3a38	b 0x009f3a74
009f3a3c	ldr x2,[x23]
009f3a40	add x0,sp,#0x8
009f3a44	mov x1,x22
009f3a48	mov x3,x21
009f3a4c	add x23,sp,#0x8
009f3a50	bl 0x009f2ec4
009f3a54	mov x8,xzr
009f3a58	mov x9,x8
009f3a5c	ldrb w8,[x23], #0x1
009f3a60	subs x20,x20,#0x1
009f3a64	bfm x8,x9,#0x38,#0x37
009f3a68	b.ne 0x009f3a58
009f3a6c	mov w0,#0x1
009f3a70	str x8,[x19]
009f3a74	ldp x29,x30,[sp, #0x30]
009f3a78	ldp x20,x19,[sp, #0x20]
009f3a7c	ldp x22,x21,[sp, #0x10]
009f3a80	ldr x23,[sp], #0x40
009f3a84	ret
