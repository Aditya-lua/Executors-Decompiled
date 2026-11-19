; CRYPTO_cfb128_encrypt @ 00aa8860
00aa8860	sub sp,sp,#0x80
00aa8864	stp x28,x27,[sp, #0x20]
00aa8868	stp x26,x25,[sp, #0x30]
00aa886c	stp x24,x23,[sp, #0x40]
00aa8870	stp x22,x21,[sp, #0x50]
00aa8874	stp x20,x19,[sp, #0x60]
00aa8878	stp x29,x30,[sp, #0x70]
00aa887c	ldr w25,[x5]
00aa8880	mov x21,x5
00aa8884	add x29,sp,#0x70
00aa8888	tbnz w25,#0x1f,0x00aa8980
00aa888c	cmp w25,#0x0
00aa8890	cset w8,ne
00aa8894	cmp x2,#0x0
00aa8898	cset w9,ne
00aa889c	mov x22,x7
00aa88a0	mov x20,x4
00aa88a4	mov x23,x3
00aa88a8	mov x24,x1
00aa88ac	mov x28,x0
00aa88b0	and w8,w8,w9
00aa88b4	cbz w6,0x00aa8988
00aa88b8	cbz w8,0x00aa89c4
00aa88bc	mov w9,w25
00aa88c0	ldrb w8,[x28], #0x1
00aa88c4	ldrb w10,[x20, x9]
00aa88c8	add w11,w25,#0x1
00aa88cc	ands w25,w11,#0xf
00aa88d0	sub x26,x2,#0x1
00aa88d4	eor w8,w10,w8
00aa88d8	strb w8,[x20, x9]
00aa88dc	strb w8,[x24], #0x1
00aa88e0	b.eq 0x00aa88f0
00aa88e4	cmp x2,#0x1
00aa88e8	mov x2,x26
00aa88ec	b.ne 0x00aa88bc
00aa88f0	subs x19,x26,#0x10
00aa88f4	b.cc 0x00aa89d0
00aa88f8	and x8,x19,#-0x10
00aa88fc	str x8,[sp, #0x8]
00aa8900	add x8,x8,#0x10
00aa8904	stp x8,x21,[sp, #0x10]
00aa8908	add x27,x24,x8
00aa890c	mov x21,x28
00aa8910	mov x0,x20
00aa8914	mov x1,x20
00aa8918	mov x2,x23
00aa891c	blr x22
00aa8920	cmp w25,#0xf
00aa8924	b.hi 0x00aa894c
00aa8928	mov w8,w25
00aa892c	ldr x9,[x21, x8#0x0]
00aa8930	ldr x10,[x20, x8#0x0]
00aa8934	eor x9,x10,x9
00aa8938	str x9,[x20, x8#0x0]
00aa893c	str x9,[x24, x8#0x0]
00aa8940	add x8,x8,#0x8
00aa8944	cmp x8,#0x10
00aa8948	b.cc 0x00aa892c
00aa894c	sub x26,x26,#0x10
00aa8950	mov w25,wzr
00aa8954	add x24,x24,#0x10
00aa8958	cmp x26,#0xf
00aa895c	add x21,x21,#0x10
00aa8960	b.hi 0x00aa8910
00aa8964	ldr x8,[sp, #0x8]
00aa8968	mov w25,wzr
00aa896c	sub x26,x19,x8
00aa8970	ldp x8,x21,[sp, #0x10]
00aa8974	add x28,x28,x8
00aa8978	cbnz x26,0x00aa89d8
00aa897c	b 0x00aa8cb0
00aa8980	mov w25,#0xffffffff
00aa8984	b 0x00aa8cb0
00aa8988	cbz w8,0x00aa8af0
00aa898c	mov w8,w25
00aa8990	ldrb w9,[x20, x8]
00aa8994	ldrb w10,[x28], #0x1
00aa8998	add w11,w25,#0x1
00aa899c	ands w25,w11,#0xf
00aa89a0	sub x26,x2,#0x1
00aa89a4	eor w9,w10,w9
00aa89a8	strb w9,[x24], #0x1
00aa89ac	strb w10,[x20, x8]
00aa89b0	b.eq 0x00aa8af4
00aa89b4	cmp x2,#0x1
00aa89b8	mov x2,x26
00aa89bc	b.ne 0x00aa898c
00aa89c0	b 0x00aa8af4
00aa89c4	mov x26,x2
00aa89c8	subs x19,x26,#0x10
00aa89cc	b.cs 0x00aa88f8
00aa89d0	mov x27,x24
00aa89d4	cbz x26,0x00aa8cb0
00aa89d8	mov x0,x20
00aa89dc	mov x1,x20
00aa89e0	mov x2,x23
00aa89e4	blr x22
00aa89e8	cmp x26,#0x20
00aa89ec	b.cc 0x00aa8ac0
00aa89f0	sub x8,x26,#0x1
00aa89f4	cmn w25,w8
00aa89f8	b.cs 0x00aa8ac0
00aa89fc	lsr x8,x8,#0x20
00aa8a00	cbnz x8,0x00aa8ac0
00aa8a04	mov w8,w25
00aa8a08	add x10,x26,x8
00aa8a0c	add x9,x20,x8
00aa8a10	add x14,x27,x10
00aa8a14	add x11,x27,x8
00aa8a18	add x13,x20,x10
00aa8a1c	cmp x9,x14
00aa8a20	add x12,x28,x8
00aa8a24	add x15,x28,x10
00aa8a28	cset w8,cc
00aa8a2c	cmp x11,x13
00aa8a30	cset w10,cc
00aa8a34	cmp x9,x15
00aa8a38	and w16,w8,w10
00aa8a3c	cset w8,cc
00aa8a40	cmp x12,x13
00aa8a44	cset w10,cc
00aa8a48	cmp x11,x15
00aa8a4c	cset w9,cc
00aa8a50	cmp x12,x14
00aa8a54	cset w11,cc
00aa8a58	tbnz w16,#0x0,0x00aa8ac0
00aa8a5c	and w8,w8,w10
00aa8a60	tbnz w8,#0x0,0x00aa8ac0
00aa8a64	and w8,w9,w11
00aa8a68	tbnz w8,#0x0,0x00aa8ac0
00aa8a6c	and x10,x26,#-0x20
00aa8a70	sub x8,x26,x10
00aa8a74	add w9,w25,w10
00aa8a78	mov x11,x10
00aa8a7c	mov w12,w25
00aa8a80	mov w13,w12
00aa8a84	add x14,x28,x13
00aa8a88	ldp q0,q1,[x14]
00aa8a8c	add x14,x20,x13
00aa8a90	ldp q2,q3,[x14]
00aa8a94	subs x11,x11,#0x20
00aa8a98	add x13,x27,x13
00aa8a9c	add w12,w12,#0x20
00aa8aa0	eor v0.16B,v2.16B,v0.16B
00aa8aa4	eor v1.16B,v3.16B,v1.16B
00aa8aa8	stp q0,q1,[x14]
00aa8aac	stp q0,q1,[x13]
00aa8ab0	b.ne 0x00aa8a80
00aa8ab4	cmp x26,x10
00aa8ab8	b.ne 0x00aa8ac8
00aa8abc	b 0x00aa8cac
00aa8ac0	mov x8,x26
00aa8ac4	mov w9,w25
00aa8ac8	mov w10,w9
00aa8acc	ldrb w11,[x28, x10]
00aa8ad0	ldrb w12,[x20, x10]
00aa8ad4	subs x8,x8,#0x1
00aa8ad8	add w9,w9,#0x1
00aa8adc	eor w11,w12,w11
00aa8ae0	strb w11,[x20, x10]
00aa8ae4	strb w11,[x27, x10]
00aa8ae8	b.ne 0x00aa8ac8
00aa8aec	b 0x00aa8cac
00aa8af0	mov x26,x2
00aa8af4	str x21,[sp, #0x18]
00aa8af8	subs x21,x26,#0x10
00aa8afc	b.cc 0x00aa8b8c
00aa8b00	and x8,x21,#-0x10
00aa8b04	str x8,[sp, #0x8]
00aa8b08	add x8,x8,#0x10
00aa8b0c	add x27,x24,x8
00aa8b10	mov x19,x28
00aa8b14	str x8,[sp, #0x10]
00aa8b18	mov x0,x20
00aa8b1c	mov x1,x20
00aa8b20	mov x2,x23
00aa8b24	blr x22
00aa8b28	cmp w25,#0xf
00aa8b2c	b.hi 0x00aa8b54
00aa8b30	mov w8,w25
00aa8b34	ldr x9,[x19, x8#0x0]
00aa8b38	ldr x10,[x20, x8#0x0]
00aa8b3c	eor x10,x10,x9
00aa8b40	str x10,[x24, x8#0x0]
00aa8b44	str x9,[x20, x8#0x0]
00aa8b48	add x8,x8,#0x8
00aa8b4c	cmp x8,#0x10
00aa8b50	b.cc 0x00aa8b34
00aa8b54	sub x26,x26,#0x10
00aa8b58	mov w25,wzr
00aa8b5c	add x24,x24,#0x10
00aa8b60	cmp x26,#0xf
00aa8b64	add x19,x19,#0x10
00aa8b68	b.hi 0x00aa8b18
00aa8b6c	ldr x8,[sp, #0x8]
00aa8b70	mov w25,wzr
00aa8b74	sub x26,x21,x8
00aa8b78	ldr x8,[sp, #0x10]
00aa8b7c	add x28,x28,x8
00aa8b80	ldr x21,[sp, #0x18]
00aa8b84	cbnz x26,0x00aa8b98
00aa8b88	b 0x00aa8cb0
00aa8b8c	mov x27,x24
00aa8b90	ldr x21,[sp, #0x18]
00aa8b94	cbz x26,0x00aa8cb0
00aa8b98	mov x0,x20
00aa8b9c	mov x1,x20
00aa8ba0	mov x2,x23
00aa8ba4	blr x22
00aa8ba8	cmp x26,#0x20
00aa8bac	b.cc 0x00aa8c80
00aa8bb0	sub x8,x26,#0x1
00aa8bb4	cmn w25,w8
00aa8bb8	b.cs 0x00aa8c80
00aa8bbc	lsr x8,x8,#0x20
00aa8bc0	cbnz x8,0x00aa8c80
00aa8bc4	mov w8,w25
00aa8bc8	add x10,x26,x8
00aa8bcc	add x9,x27,x8
00aa8bd0	add x14,x20,x10
00aa8bd4	add x11,x20,x8
00aa8bd8	add x13,x27,x10
00aa8bdc	cmp x9,x14
00aa8be0	add x12,x28,x8
00aa8be4	add x15,x28,x10
00aa8be8	cset w8,cc
00aa8bec	cmp x11,x13
00aa8bf0	cset w10,cc
00aa8bf4	cmp x9,x15
00aa8bf8	and w16,w8,w10
00aa8bfc	cset w8,cc
00aa8c00	cmp x12,x13
00aa8c04	cset w10,cc
00aa8c08	cmp x11,x15
00aa8c0c	cset w9,cc
00aa8c10	cmp x12,x14
00aa8c14	cset w11,cc
00aa8c18	tbnz w16,#0x0,0x00aa8c80
00aa8c1c	and w8,w8,w10
00aa8c20	tbnz w8,#0x0,0x00aa8c80
00aa8c24	and w8,w9,w11
00aa8c28	tbnz w8,#0x0,0x00aa8c80
00aa8c2c	and x10,x26,#-0x20
00aa8c30	sub x8,x26,x10
00aa8c34	add w9,w25,w10
00aa8c38	mov x11,x10
00aa8c3c	mov w12,w25
00aa8c40	mov w13,w12
00aa8c44	add x14,x20,x13
00aa8c48	add x15,x28,x13
00aa8c4c	ldp q0,q1,[x14]
00aa8c50	ldp q2,q3,[x15]
00aa8c54	subs x11,x11,#0x20
00aa8c58	add x13,x27,x13
00aa8c5c	add w12,w12,#0x20
00aa8c60	eor v0.16B,v2.16B,v0.16B
00aa8c64	eor v1.16B,v3.16B,v1.16B
00aa8c68	stp q0,q1,[x13]
00aa8c6c	stp q2,q3,[x14]
00aa8c70	b.ne 0x00aa8c40
00aa8c74	cmp x26,x10
00aa8c78	b.ne 0x00aa8c88
00aa8c7c	b 0x00aa8cac
00aa8c80	mov x8,x26
00aa8c84	mov w9,w25
00aa8c88	mov w10,w9
00aa8c8c	ldrb w11,[x20, x10]
00aa8c90	ldrb w12,[x28, x10]
00aa8c94	subs x8,x8,#0x1
00aa8c98	add w9,w9,#0x1
00aa8c9c	eor w11,w12,w11
00aa8ca0	strb w11,[x27, x10]
00aa8ca4	strb w12,[x20, x10]
00aa8ca8	b.ne 0x00aa8c88
00aa8cac	add w25,w25,w26
00aa8cb0	str w25,[x21]
00aa8cb4	ldp x29,x30,[sp, #0x70]
00aa8cb8	ldp x20,x19,[sp, #0x60]
00aa8cbc	ldp x22,x21,[sp, #0x50]
00aa8cc0	ldp x24,x23,[sp, #0x40]
00aa8cc4	ldp x26,x25,[sp, #0x30]
00aa8cc8	ldp x28,x27,[sp, #0x20]
00aa8ccc	add sp,sp,#0x80
00aa8cd0	ret
