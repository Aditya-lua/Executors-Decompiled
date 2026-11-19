; tls_get_message_header @ 009e489c
009e489c	sub sp,sp,#0x40
009e48a0	stp x22,x21,[sp, #0x10]
009e48a4	stp x20,x19,[sp, #0x20]
009e48a8	stp x29,x30,[sp, #0x30]
009e48ac	ldr x8,[x0, #0x88]
009e48b0	mov x21,x1
009e48b4	mov x19,x0
009e48b8	mov w22,#0x4
009e48bc	ldr x20,[x8, #0x8]
009e48c0	add x29,sp,#0x30
009e48c4	b 0x009e48e8
009e48c8	ldr w1,[x19]
009e48cc	ldr x6,[x19, #0x4c8]
009e48d0	mov w2,#0x16
009e48d4	mov w4,#0x4
009e48d8	mov w0,wzr
009e48dc	mov x3,x20
009e48e0	mov x5,x19
009e48e4	blr x8
009e48e8	ldr x8,[x19, #0x98]
009e48ec	cmp x8,#0x3
009e48f0	b.hi 0x009e4948
009e48f4	ldr x9,[x19, #0x8]
009e48f8	add x3,x20,x8
009e48fc	sub x4,x22,x8
009e4900	mov w1,#0x16
009e4904	ldr x9,[x9, #0x68]
009e4908	add x2,sp,#0xc
009e490c	mov x6,sp
009e4910	mov x0,x19
009e4914	mov w5,wzr
009e4918	blr x9
009e491c	cmp w0,#0x0
009e4920	b.le 0x009e498c
009e4924	ldr w8,[sp, #0xc]
009e4928	cmp w8,#0x16
009e492c	b.ne 0x009e499c
009e4930	ldr x8,[sp]
009e4934	ldr x9,[x19, #0x98]
009e4938	add x8,x9,x8
009e493c	cmp x8,#0x4
009e4940	str x8,[x19, #0x98]
009e4944	b.cc 0x009e48f4
009e4948	ldr w8,[x19, #0x38]
009e494c	cbnz w8,0x009e4a00
009e4950	ldr w8,[x19, #0x5c]
009e4954	cmp w8,#0x1
009e4958	b.eq 0x009e4a00
009e495c	ldrb w8,[x20]
009e4960	cbnz w8,0x009e4a00
009e4964	ldrb w8,[x20, #0x1]
009e4968	cbnz w8,0x009e4a00
009e496c	ldrb w8,[x20, #0x2]
009e4970	cbnz w8,0x009e4a00
009e4974	ldrb w8,[x20, #0x3]
009e4978	cbnz w8,0x009e4a00
009e497c	ldr x8,[x19, #0x4c0]
009e4980	str xzr,[x19, #0x98]
009e4984	cbz x8,0x009e48e8
009e4988	b 0x009e48c8
009e498c	orr w8,wzr,#0x3
009e4990	mov w0,wzr
009e4994	str w8,[x19, #0x28]
009e4998	b 0x009e4ad8
009e499c	cmp w8,#0x14
009e49a0	b.ne 0x009e4a40
009e49a4	ldr x8,[x19, #0x98]
009e49a8	cbnz x8,0x009e4a68
009e49ac	ldr x8,[sp]
009e49b0	cmp x8,#0x1
009e49b4	b.ne 0x009e4a68
009e49b8	ldrb w8,[x20]
009e49bc	cmp w8,#0x1
009e49c0	b.ne 0x009e4a68
009e49c4	ldr w8,[x19, #0x5c]
009e49c8	cbnz w8,0x009e49d8
009e49cc	ldrb w8,[x19, #0xa9]
009e49d0	mov w0,wzr
009e49d4	tbnz w8,#0x3,0x009e4ad8
009e49d8	mov w8,#0x101
009e49dc	str w8,[x21]
009e49e0	ldr x9,[x19, #0x88]
009e49e4	str w8,[x19, #0x2d8]
009e49e8	str xzr,[x19, #0x98]
009e49ec	mov w0,#0x1
009e49f0	ldr x8,[x9, #0x8]
009e49f4	str x0,[x19, #0x2d0]
009e49f8	str x8,[x19, #0x90]
009e49fc	b 0x009e4ad8
009e4a00	ldrb w8,[x20]
009e4a04	str w8,[x21]
009e4a08	ldrb w8,[x20]
009e4a0c	add x21,x19,#0xc58
009e4a10	mov x0,x21
009e4a14	str w8,[x19, #0x2d8]
009e4a18	bl 0x00c36c00
009e4a1c	cbz w0,0x009e4aa0
009e4a20	mov x0,x21
009e4a24	bl 0x00c36bf0
009e4a28	ldr x8,[x19, #0x88]
009e4a2c	add x9,x0,#0x4
009e4a30	ldr x8,[x8, #0x8]
009e4a34	str x8,[x19, #0x90]
009e4a38	mov w8,#0x4
009e4a3c	b 0x009e4acc
009e4a40	bl 0x00c342a0
009e4a44	adrp x0,0x2bb000
009e4a48	adrp x2,0x2a9000
009e4a4c	add x0,x0,#0x912
009e4a50	add x2,x2,#0xf03
009e4a54	mov w1,#0x4b8
009e4a58	bl 0x00c342b0
009e4a5c	mov w1,#0xa
009e4a60	mov w2,#0x85
009e4a64	b 0x009e4a8c
009e4a68	bl 0x00c342a0
009e4a6c	adrp x0,0x2bb000
009e4a70	adrp x2,0x2a9000
009e4a74	add x0,x0,#0x912
009e4a78	add x2,x2,#0xf03
009e4a7c	mov w1,#0x4a3
009e4a80	bl 0x00c342b0
009e4a84	mov w1,#0xa
009e4a88	mov w2,#0x67
009e4a8c	mov x0,x19
009e4a90	mov x3,xzr
009e4a94	bl 0x00c34410
009e4a98	mov w0,wzr
009e4a9c	b 0x009e4ad8
009e4aa0	ldr x9,[x19, #0x88]
009e4aa4	ldrb w10,[x20, #0x1]
009e4aa8	ldrb w11,[x20, #0x2]
009e4aac	ldrb w12,[x20, #0x3]
009e4ab0	ldr x13,[x9, #0x8]
009e4ab4	lsl x9,x10,#0x10
009e4ab8	bfm x9,x11,#0x38,#0x7
009e4abc	mov x8,xzr
009e4ac0	orr x9,x9,x12
009e4ac4	add x10,x13,#0x4
009e4ac8	str x10,[x19, #0x90]
009e4acc	mov w0,#0x1
009e4ad0	str x9,[x19, #0x2d0]
009e4ad4	str x8,[x19, #0x98]
009e4ad8	ldp x29,x30,[sp, #0x30]
009e4adc	ldp x20,x19,[sp, #0x20]
009e4ae0	ldp x22,x21,[sp, #0x10]
009e4ae4	add sp,sp,#0x40
009e4ae8	ret
