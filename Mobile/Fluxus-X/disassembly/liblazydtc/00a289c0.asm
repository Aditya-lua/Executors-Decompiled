; BN_nist_mod_192 @ 00a289c0
00a289c0	sub sp,sp,#0x70
00a289c4	stp x22,x21,[sp, #0x40]
00a289c8	stp x20,x19,[sp, #0x50]
00a289cc	stp x29,x30,[sp, #0x60]
00a289d0	str x23,[sp, #0x30]
00a289d4	ldr w22,[x1, #0x8]
00a289d8	ldr x23,[x1]
00a289dc	mov x19,x0
00a289e0	mov x0,x1
00a289e4	add x29,sp,#0x60
00a289e8	mov x21,x3
00a289ec	mov x20,x1
00a289f0	bl 0x00c37f40
00a289f4	cbnz w0,0x00a28a0c
00a289f8	adrp x1,0xc5b000
00a289fc	add x1,x1,#0xef0
00a28a00	mov x0,x20
00a28a04	bl 0x00c369c0
00a28a08	tbnz w0,#0x1f,0x00a28a3c
00a28a0c	adrp x2,0xc5b000
00a28a10	add x2,x2,#0xe78
00a28a14	mov x0,x19
00a28a18	mov x1,x20
00a28a1c	mov x3,x21
00a28a20	bl 0x00c38f30
00a28a24	ldp x29,x30,[sp, #0x60]
00a28a28	ldp x20,x19,[sp, #0x50]
00a28a2c	ldp x22,x21,[sp, #0x40]
00a28a30	ldr x23,[sp, #0x30]
00a28a34	add sp,sp,#0x70
00a28a38	ret
00a28a3c	adrp x0,0xc5b000
00a28a40	add x0,x0,#0xe78
00a28a44	mov x1,x20
00a28a48	bl 0x00c369c0
00a28a4c	cbz w0,0x00a28a78
00a28a50	cmp w0,#0x1
00a28a54	b.lt 0x00a28a84
00a28a58	cmp x19,x20
00a28a5c	b.eq 0x00a28c04
00a28a60	mov x0,x19
00a28a64	mov x1,x20
00a28a68	bl 0x00c36990
00a28a6c	cmp x0,#0x0
00a28a70	cset w0,ne
00a28a74	b 0x00a28a24
00a28a78	mov x0,x19
00a28a7c	bl 0x00c38e00
00a28a80	b 0x00a28c04
00a28a84	cmp x19,x20
00a28a88	b.eq 0x00a28abc
00a28a8c	orr w1,wzr,#0x3
00a28a90	mov x0,x19
00a28a94	bl 0x00c38e80
00a28a98	cbz x0,0x00a28a24
00a28a9c	ldr x20,[x19]
00a28aa0	ldr x8,[x23]
00a28aa4	str x8,[x20]
00a28aa8	ldr x8,[x23, #0x8]
00a28aac	str x8,[x20, #0x8]
00a28ab0	ldr x8,[x23, #0x10]
00a28ab4	str x8,[x20, #0x10]
00a28ab8	b 0x00a28ac0
00a28abc	mov x20,x23
00a28ac0	cmp w22,#0x4
00a28ac4	mov w21,wzr
00a28ac8	b.lt 0x00a28ae8
00a28acc	sub w21,w22,#0x3
00a28ad0	add x1,x23,#0x18
00a28ad4	lsl x2,x21,#0x3
00a28ad8	add x0,sp,#0x18
00a28adc	bl 0x00c2ffd0
00a28ae0	cmp w21,#0x2
00a28ae4	b.hi 0x00a28b08
00a28ae8	add x8,sp,#0x18
00a28aec	mov w9,#0x2
00a28af0	add x0,x8,w21, UXTW  #0x3
00a28af4	sub w8,w9,w21
00a28af8	lsl x8,x8,#0x3
00a28afc	add x2,x8,#0x8
00a28b00	mov w1,wzr
00a28b04	bl 0x00c301c0
00a28b08	ldr x8,[sp, #0x18]
00a28b0c	mov x2,sp
00a28b10	orr w3,wzr,#0x3
00a28b14	mov x0,x20
00a28b18	mov x1,x20
00a28b1c	stp x8,x8,[sp]
00a28b20	str xzr,[sp, #0x10]
00a28b24	mov x23,sp
00a28b28	orr w22,wzr,#0x3
00a28b2c	bl 0x00c388b0
00a28b30	ldr x8,[sp, #0x20]
00a28b34	mov x21,x0
00a28b38	mov x2,sp
00a28b3c	orr w3,wzr,#0x3
00a28b40	mov x0,x20
00a28b44	mov x1,x20
00a28b48	stp xzr,x8,[sp]
00a28b4c	str x8,[sp, #0x10]
00a28b50	bl 0x00c388b0
00a28b54	ldr x8,[sp, #0x28]
00a28b58	add w21,w0,w21
00a28b5c	mov x2,sp
00a28b60	orr w3,wzr,#0x3
00a28b64	mov x0,x20
00a28b68	mov x1,x20
00a28b6c	stp x8,x8,[sp]
00a28b70	str x8,[sp, #0x10]
00a28b74	bl 0x00c388b0
00a28b78	add w8,w21,w0
00a28b7c	cmp w8,#0x1
00a28b80	b.lt 0x00a28bb4
00a28b84	adrp x9,0x758000
00a28b88	add x9,x9,#0x828
00a28b8c	orr w10,wzr,#0x18
00a28b90	smaddl x8,w8,w10,x9
00a28b94	sub x2,x8,#0x18
00a28b98	orr w3,wzr,#0x3
00a28b9c	mov x0,x20
00a28ba0	mov x1,x20
00a28ba4	bl 0x00c38940
00a28ba8	cmp w0,#0x0
00a28bac	cset w21,ne
00a28bb0	b 0x00a28bb8
00a28bb4	mov w21,#0x1
00a28bb8	adrp x2,0x758000
00a28bbc	add x2,x2,#0x828
00a28bc0	mov x0,sp
00a28bc4	orr w3,wzr,#0x3
00a28bc8	mov x1,x20
00a28bcc	bl 0x00c38940
00a28bd0	cmp x0,#0x0
00a28bd4	cset w8,ne
00a28bd8	tst w21,w8
00a28bdc	csel x8,x20,x23,ne
00a28be0	ldr x9,[x8]
00a28be4	mov x0,x19
00a28be8	str x9,[x20]
00a28bec	ldr x9,[x8, #0x8]
00a28bf0	str x9,[x20, #0x8]
00a28bf4	ldr x8,[x8, #0x10]
00a28bf8	str x8,[x20, #0x10]
00a28bfc	str w22,[x19, #0x8]
00a28c00	bl 0x00c38e40
00a28c04	mov w0,#0x1
00a28c08	b 0x00a28a24
