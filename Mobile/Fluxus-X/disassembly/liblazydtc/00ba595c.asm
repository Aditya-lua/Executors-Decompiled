; mbedtls_rsa_complete @ 00ba595c
00ba595c	sub sp,sp,#0xb0
00ba5960	stp x28,x27,[sp, #0x50]
00ba5964	stp x26,x25,[sp, #0x60]
00ba5968	stp x24,x23,[sp, #0x70]
00ba596c	stp x22,x21,[sp, #0x80]
00ba5970	stp x20,x19,[sp, #0x90]
00ba5974	stp x29,x30,[sp, #0xa0]
00ba5978	add x29,sp,#0xa0
00ba597c	mov x19,x0
00ba5980	add x0,x0,#0x10
00ba5984	mov x1,xzr
00ba5988	str x0,[sp, #0x38]
00ba598c	bl 0x00c41b40
00ba5990	mov w23,w0
00ba5994	cmp w0,#0x0
00ba5998	add x0,x19,#0x40
00ba599c	mov x1,xzr
00ba59a0	cset w28,eq
00ba59a4	str x0,[sp, #0x48]
00ba59a8	bl 0x00c41b40
00ba59ac	mov w22,w0
00ba59b0	cmp w0,#0x0
00ba59b4	add x0,x19,#0x50
00ba59b8	mov x1,xzr
00ba59bc	cset w21,ne
00ba59c0	str x0,[sp, #0x40]
00ba59c4	bl 0x00c41b40
00ba59c8	mov w20,w0
00ba59cc	cmp w0,#0x0
00ba59d0	add x0,x19,#0x30
00ba59d4	mov x1,xzr
00ba59d8	cset w25,ne
00ba59dc	str x0,[sp, #0x30]
00ba59e0	bl 0x00c41b40
00ba59e4	cmp w0,#0x0
00ba59e8	add x0,x19,#0x20
00ba59ec	mov x1,xzr
00ba59f0	cset w26,eq
00ba59f4	cset w24,ne
00ba59f8	str x0,[sp, #0x28]
00ba59fc	bl 0x00c41b40
00ba5a00	cmp w0,#0x0
00ba5a04	add x0,x19,#0x60
00ba5a08	mov x1,xzr
00ba5a0c	cset w27,ne
00ba5a10	str x0,[sp, #0x18]
00ba5a14	bl 0x00c41b40
00ba5a18	str w0,[sp, #0x24]
00ba5a1c	add x0,x19,#0x70
00ba5a20	mov x1,xzr
00ba5a24	str x0,[sp, #0x10]
00ba5a28	bl 0x00c41b40
00ba5a2c	str w0,[sp, #0x20]
00ba5a30	add x0,x19,#0x80
00ba5a34	mov x1,xzr
00ba5a38	str x0,[sp, #0x8]
00ba5a3c	bl 0x00c41b40
00ba5a40	and w8,w21,w25
00ba5a44	orr w9,w20,w22
00ba5a48	and w10,w8,w24
00ba5a4c	cmp w9,#0x0
00ba5a50	and w8,w8,w26
00ba5a54	and w9,w10,w27
00ba5a58	cset w10,ne
00ba5a5c	and w25,w27,w8
00ba5a60	orr w8,w28,w10
00ba5a64	eor w10,w8,#0x1
00ba5a68	and w10,w24,w10
00ba5a6c	orr w8,w24,w8
00ba5a70	and w21,w27,w10
00ba5a74	eor w8,w8,#0x1
00ba5a78	orr w9,w9,w21
00ba5a7c	mov w11,w0
00ba5a80	and w8,w27,w8
00ba5a84	orr w28,w25,w9
00ba5a88	tbnz w8,#0x0,0x00ba5a98
00ba5a8c	cbnz w28,0x00ba5a98
00ba5a90	mov w0,#0xffffbf80
00ba5a94	b 0x00ba5b6c
00ba5a98	ldp x26,x24,[sp, #0x40]
00ba5a9c	ldr x27,[sp, #0x38]
00ba5aa0	cbnz w23,0x00ba5ad4
00ba5aa4	cbz w22,0x00ba5ad4
00ba5aa8	cbz w20,0x00ba5ad4
00ba5aac	mov x0,x27
00ba5ab0	mov x1,x24
00ba5ab4	mov x2,x26
00ba5ab8	mov w20,w11
00ba5abc	bl 0x00c41c80
00ba5ac0	cbnz w0,0x00ba5b64
00ba5ac4	mov x0,x27
00ba5ac8	bl 0x00c41d30
00ba5acc	mov w11,w20
00ba5ad0	str x0,[x19, #0x8]
00ba5ad4	cbz w21,0x00ba5afc
00ba5ad8	ldp x1,x2,[sp, #0x28]
00ba5adc	mov x0,x27
00ba5ae0	mov x3,x24
00ba5ae4	mov x4,x26
00ba5ae8	mov w20,w11
00ba5aec	bl 0x00c43430
00ba5af0	mov w11,w20
00ba5af4	cbnz w0,0x00ba5b64
00ba5af8	b 0x00ba5b1c
00ba5afc	cbz w25,0x00ba5b1c
00ba5b00	ldp x2,x3,[sp, #0x28]
00ba5b04	mov x0,x24
00ba5b08	mov x1,x26
00ba5b0c	mov w20,w11
00ba5b10	bl 0x00c43440
00ba5b14	mov w11,w20
00ba5b18	cbnz w0,0x00ba5b64
00ba5b1c	ldp w9,w10,[sp, #0x20]
00ba5b20	cmp w11,#0x0
00ba5b24	cset w8,ne
00ba5b28	cmp w9,#0x0
00ba5b2c	cset w9,ne
00ba5b30	cmp w10,#0x0
00ba5b34	cset w10,ne
00ba5b38	and w9,w10,w9
00ba5b3c	and w8,w9,w8
00ba5b40	tbnz w8,#0x0,0x00ba5b8c
00ba5b44	cbz w28,0x00ba5b8c
00ba5b48	ldr x2,[sp, #0x30]
00ba5b4c	ldp x4,x3,[sp, #0x10]
00ba5b50	ldr x5,[sp, #0x8]
00ba5b54	mov x0,x24
00ba5b58	mov x1,x26
00ba5b5c	bl 0x00c43420
00ba5b60	cbz w0,0x00ba5b8c
00ba5b64	mov w8,#0xffffbf80
00ba5b68	add w0,w0,w8
00ba5b6c	ldp x29,x30,[sp, #0xa0]
00ba5b70	ldp x20,x19,[sp, #0x90]
00ba5b74	ldp x22,x21,[sp, #0x80]
00ba5b78	ldp x24,x23,[sp, #0x70]
00ba5b7c	ldp x26,x25,[sp, #0x60]
00ba5b80	ldp x28,x27,[sp, #0x50]
00ba5b84	add sp,sp,#0xb0
00ba5b88	ret
00ba5b8c	mov x0,x19
00ba5b90	mov w1,w28
00ba5b94	ldp x29,x30,[sp, #0xa0]
00ba5b98	ldp x20,x19,[sp, #0x90]
00ba5b9c	ldp x22,x21,[sp, #0x80]
00ba5ba0	ldp x24,x23,[sp, #0x70]
00ba5ba4	ldp x26,x25,[sp, #0x60]
00ba5ba8	ldp x28,x27,[sp, #0x50]
00ba5bac	add sp,sp,#0xb0
00ba5bb0	b 0x00ba6554
