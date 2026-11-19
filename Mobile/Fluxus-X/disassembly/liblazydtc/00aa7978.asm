; CRYPTO_ccm128_aad @ 00aa7978
00aa7978	stp x24,x23,[sp, #-0x40]!
00aa797c	stp x22,x21,[sp, #0x10]
00aa7980	stp x20,x19,[sp, #0x20]
00aa7984	stp x29,x30,[sp, #0x30]
00aa7988	add x29,sp,#0x30
00aa798c	cbz x2,0x00aa7b14
00aa7990	ldrb w8,[x0]
00aa7994	mov x21,x2
00aa7998	ldp x23,x2,[x0, #0x28]
00aa799c	add x22,x0,#0x10
00aa79a0	mov x19,x1
00aa79a4	orr w8,w8,#0x40
00aa79a8	mov x1,x22
00aa79ac	mov x20,x0
00aa79b0	strb w8,[x0]
00aa79b4	blr x23
00aa79b8	ldr x8,[x20, #0x20]
00aa79bc	lsr x9,x21,#0x8
00aa79c0	cmp x9,#0xfe
00aa79c4	add x8,x8,#0x1
00aa79c8	str x8,[x20, #0x20]
00aa79cc	b.hi 0x00aa79e8
00aa79d0	ldrb w9,[x22]
00aa79d4	mov w8,#0x2
00aa79d8	eor w9,w9,w21, LSR #0x8
00aa79dc	strb w9,[x22]
00aa79e0	mov w9,#0x1
00aa79e4	b 0x00aa7aa8
00aa79e8	ldrb w8,[x22]
00aa79ec	ldrb w9,[x22, #0x1]
00aa79f0	mvn w10,w8
00aa79f4	lsr x8,x21,#0x20
00aa79f8	strb w10,[x22]
00aa79fc	cbz x8,0x00aa7a74
00aa7a00	ldrb w11,[x20, #0x12]
00aa7a04	mvn w9,w9
00aa7a08	ldrb w13,[x20, #0x13]
00aa7a0c	lsr x10,x21,#0x38
00aa7a10	strb w9,[x20, #0x11]
00aa7a14	ldrb w9,[x20, #0x14]
00aa7a18	eor w10,w11,w10
00aa7a1c	ldrb w11,[x20, #0x15]
00aa7a20	lsr x12,x21,#0x30
00aa7a24	eor w12,w13,w12
00aa7a28	lsr x13,x21,#0x28
00aa7a2c	eor w9,w9,w13
00aa7a30	eor w8,w11,w8
00aa7a34	strb w10,[x20, #0x12]
00aa7a38	ldrb w10,[x20, #0x16]
00aa7a3c	strb w9,[x20, #0x14]
00aa7a40	ldrb w9,[x20, #0x17]
00aa7a44	ldrb w11,[x20, #0x18]
00aa7a48	strb w8,[x20, #0x15]
00aa7a4c	eor w8,w10,w21, LSR #0x18
00aa7a50	eor w9,w9,w21, LSR #0x10
00aa7a54	eor w10,w11,w21, LSR #0x8
00aa7a58	strb w12,[x20, #0x13]
00aa7a5c	strb w8,[x20, #0x16]
00aa7a60	mov w8,#0xa
00aa7a64	strb w9,[x20, #0x17]
00aa7a68	strb w10,[x20, #0x18]
00aa7a6c	mov w9,#0x9
00aa7a70	b 0x00aa7aa8
00aa7a74	ldrb w10,[x22, #0x2]
00aa7a78	ldrb w11,[x22, #0x3]
00aa7a7c	ldrb w12,[x22, #0x4]
00aa7a80	eor w9,w9,#0xfe
00aa7a84	strb w9,[x22, #0x1]
00aa7a88	eor w9,w10,w21, LSR #0x18
00aa7a8c	orr w8,wzr,#0x6
00aa7a90	eor w10,w11,w21, LSR #0x10
00aa7a94	eor w11,w12,w21, LSR #0x8
00aa7a98	strb w9,[x22, #0x2]
00aa7a9c	mov w9,#0x5
00aa7aa0	strb w10,[x22, #0x3]
00aa7aa4	strb w11,[x22, #0x4]
00aa7aa8	ldrb w10,[x22, x9]
00aa7aac	eor w10,w10,w21
00aa7ab0	strb w10,[x22, x9]
00aa7ab4	cbz x21,0x00aa7aec
00aa7ab8	and x8,x8,#0xffffffff
00aa7abc	add x10,x20,x8
00aa7ac0	ldrb w9,[x19], #0x1
00aa7ac4	ldrb w11,[x10, #0x10]
00aa7ac8	subs x21,x21,#0x1
00aa7acc	cset w24,ne
00aa7ad0	eor w9,w11,w9
00aa7ad4	strb w9,[x10, #0x10]
00aa7ad8	b.eq 0x00aa7af0
00aa7adc	add x8,x8,#0x1
00aa7ae0	cmp w8,#0x10
00aa7ae4	b.cc 0x00aa7abc
00aa7ae8	b 0x00aa7af0
00aa7aec	mov w24,wzr
00aa7af0	ldr x2,[x20, #0x30]
00aa7af4	mov x0,x22
00aa7af8	mov x1,x22
00aa7afc	blr x23
00aa7b00	ldr x9,[x20, #0x20]
00aa7b04	mov x8,xzr
00aa7b08	add x9,x9,#0x1
00aa7b0c	str x9,[x20, #0x20]
00aa7b10	tbnz w24,#0x0,0x00aa7ab4
00aa7b14	ldp x29,x30,[sp, #0x30]
00aa7b18	ldp x20,x19,[sp, #0x20]
00aa7b1c	ldp x22,x21,[sp, #0x10]
00aa7b20	ldp x24,x23,[sp], #0x40
00aa7b24	ret
