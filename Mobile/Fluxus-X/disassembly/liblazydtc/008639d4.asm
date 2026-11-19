; FUN_008639d4 @ 008639d4
008639d4	sub sp,sp,#0xd0
008639d8	stp x29,x30,[sp, #0x70]
008639dc	stp x28,x27,[sp, #0x80]
008639e0	stp x26,x25,[sp, #0x90]
008639e4	stp x24,x23,[sp, #0xa0]
008639e8	stp x22,x21,[sp, #0xb0]
008639ec	stp x20,x19,[sp, #0xc0]
008639f0	add x29,sp,#0x70
008639f4	str x3,[sp, #0x8]
008639f8	mrs x25,tpidr_el0
008639fc	mov w21,w2
00863a00	ldr x8,[x25, #0x28]
00863a04	mov x22,x1
00863a08	mov x19,x0
00863a0c	stur x8,[x29, #-0x8]
00863a10	ldp q0,q1,[x0, #0x90]
00863a14	stp q0,q1,[sp, #0x20]
00863a18	bl 0x00858f2c
00863a1c	ldr w8,[x19, #0x90]
00863a20	ldp x24,x23,[x19, #0x1d0]
00863a24	cmp w8,#0x119
00863a28	b.ne 0x00863a50
00863a2c	ldur q0,[x19, #0x94]
00863a30	ldr x20,[x19, #0xa8]
00863a34	mov x0,x19
00863a38	stur q0,[x29, #-0x20]
00863a3c	bl 0x00858f2c
00863a40	mov w8,#0x1
00863a44	stur x20,[x29, #-0x28]
00863a48	sturb w8,[x29, #-0x10]
00863a4c	b 0x00863a78
00863a50	adrp x1,0x2c8000
00863a54	add x1,x1,#0xb39
00863a58	mov x0,x19
00863a5c	bl 0x0086e040
00863a60	ldur q0,[x19, #0x94]
00863a64	ldr x8,[x19, #0x138]
00863a68	mov w9,#0x1
00863a6c	sturb w9,[x29, #-0x10]
00863a70	stur q0,[x29, #-0x20]
00863a74	stur x8,[x29, #-0x28]
00863a78	ldr x8,[x19, #0x1e8]
00863a7c	adrp x26,0xd1e000
00863a80	ldr w9,[x8, #0x4a0]
00863a84	add w9,w9,#0x1
00863a88	str w9,[x8, #0x4a0]
00863a8c	ldp x9,x8,[x19, #0x158]
00863a90	ldr x28,[x19, #0x170]
00863a94	sub x8,x8,x9
00863a98	ldrb w9,[x26, #0xc80]
00863a9c	asr x8,x8,#0x3
00863aa0	cmp w9,#0x1
00863aa4	str x8,[x19, #0x170]
00863aa8	b.ne 0x00863ab8
00863aac	ldrb w20,[x19, #0x178]
00863ab0	strb wzr,[x19, #0x178]
00863ab4	b 0x00863abc
00863ab8	mov w20,wzr
00863abc	add x2,sp,#0x20
00863ac0	sub x3,x29,#0x28
00863ac4	add x5,sp,#0x10
00863ac8	mov x0,x19
00863acc	mov w1,wzr
00863ad0	mov x4,xzr
00863ad4	mov w6,wzr
00863ad8	mov x7,xzr
00863adc	stp xzr,xzr,[sp, #0x10]
00863ae0	sub x24,x23,x24
00863ae4	sub x27,x29,#0x28
00863ae8	bl 0x00863248
00863aec	ldrb w8,[x26, #0xc80]
00863af0	mov x23,x0
00863af4	str x28,[x19, #0x170]
00863af8	cmp w8,#0x1
00863afc	b.ne 0x00863b08
00863b00	and w8,w20,#0x1
00863b04	strb w8,[x19, #0x178]
00863b08	ldr x8,[x19, #0x1e8]
00863b0c	mov w1,#0x48
00863b10	ldr w9,[x8, #0x4a0]
00863b14	sub w9,w9,#0x1
00863b18	str w9,[x8, #0x4a0]
00863b1c	ldp x9,x8,[x19, #0x1d0]
00863b20	ldr x10,[x22]
00863b24	ldr x0,[x19, #0xe8]
00863b28	sub x8,x8,x9
00863b2c	ldur x9,[x23, #0x14]
00863b30	cmp x8,x24
00863b34	stp x10,x9,[sp, #0x10]
00863b38	cset w24,hi
00863b3c	bl 0x0084e938
00863b40	add x1,sp,#0x10
00863b44	sub x2,x29,#0x28
00863b48	add x3,x27,#0x8
00863b4c	and w5,w21,#0x1
00863b50	mov x4,x23
00863b54	mov w6,w24
00863b58	mov x22,x0
00863b5c	bl 0x0085054c
00863b60	ldrb w8,[x19, #0x68]
00863b64	cmp w8,#0x1
00863b68	b.ne 0x00863b9c
00863b6c	ldr x0,[x19, #0xe8]
00863b70	mov w1,#0x14
00863b74	bl 0x0084e938
00863b78	ldur x2,[sp, #0x24]
00863b7c	ldr x1,[sp, #0x8]
00863b80	mov x21,x0
00863b84	bl 0x00852090
00863b88	add x0,x19,#0x4b0
00863b8c	add x1,sp,#0x10
00863b90	str x22,[sp, #0x10]
00863b94	bl 0x00860fa0
00863b98	str x21,[x0]
00863b9c	ldr x8,[x25, #0x28]
00863ba0	ldur x9,[x29, #-0x8]
00863ba4	cmp x8,x9
00863ba8	b.ne 0x00863bd0
00863bac	mov x0,x22
00863bb0	ldp x20,x19,[sp, #0xc0]
00863bb4	ldp x22,x21,[sp, #0xb0]
00863bb8	ldp x24,x23,[sp, #0xa0]
00863bbc	ldp x26,x25,[sp, #0x90]
00863bc0	ldp x28,x27,[sp, #0x80]
00863bc4	ldp x29,x30,[sp, #0x70]
00863bc8	add sp,sp,#0xd0
00863bcc	ret
00863bd0	bl 0x00c2fec0
