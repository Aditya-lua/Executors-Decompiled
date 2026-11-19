; mbedtls_rsa_gen_key @ 00ba6888
00ba6888	sub sp,sp,#0xc0
00ba688c	stp x28,x27,[sp, #0x60]
00ba6890	stp x26,x25,[sp, #0x70]
00ba6894	stp x24,x23,[sp, #0x80]
00ba6898	stp x22,x21,[sp, #0x90]
00ba689c	stp x20,x19,[sp, #0xa0]
00ba68a0	stp x29,x30,[sp, #0xb0]
00ba68a4	add x29,sp,#0xb0
00ba68a8	mrs x20,tpidr_el0
00ba68ac	ldr x8,[x20, #0x28]
00ba68b0	mov x19,x0
00ba68b4	add x0,sp,#0x48
00ba68b8	mov w21,w4
00ba68bc	mov w23,w3
00ba68c0	mov x24,x2
00ba68c4	mov x25,x1
00ba68c8	str x8,[sp, #0x58]
00ba68cc	bl 0x00c41c00
00ba68d0	add x0,sp,#0x38
00ba68d4	bl 0x00c41c00
00ba68d8	add x0,sp,#0x28
00ba68dc	bl 0x00c41c00
00ba68e0	cmp w23,#0x400
00ba68e4	cset w22,hi
00ba68e8	mov w28,#0xffffbf80
00ba68ec	b.cc 0x00ba6940
00ba68f0	tbnz w23,#0x0,0x00ba6940
00ba68f4	cmp w21,#0x3
00ba68f8	b.lt 0x00ba6940
00ba68fc	add x0,x19,#0x20
00ba6900	sxtw x1,w21
00ba6904	str x0,[sp, #0x20]
00ba6908	bl 0x00c41c40
00ba690c	mov w28,w0
00ba6910	cbnz w0,0x00ba6940
00ba6914	lsl w26,w22,#0x1
00ba6918	add x21,x19,#0x40
00ba691c	lsr w27,w23,#0x1
00ba6920	mov x0,x21
00ba6924	mov x1,x27
00ba6928	mov w2,w26
00ba692c	mov x3,x25
00ba6930	mov x4,x24
00ba6934	bl 0x00c41bd0
00ba6938	mov w28,w0
00ba693c	cbz w0,0x00ba69b0
00ba6940	add x0,sp,#0x48
00ba6944	bl 0x00c41bb0
00ba6948	add x0,sp,#0x38
00ba694c	bl 0x00c41bb0
00ba6950	add x0,sp,#0x28
00ba6954	bl 0x00c41bb0
00ba6958	cbz w28,0x00ba697c
00ba695c	mov x0,x19
00ba6960	bl 0x00c432d0
00ba6964	neg w8,w28
00ba6968	mov w9,#0xffffbe80
00ba696c	add w9,w28,w9
00ba6970	cmp w8,#0x80
00ba6974	csel w0,w9,w28,cc
00ba6978	b 0x00ba6980
00ba697c	mov w0,wzr
00ba6980	ldr x8,[x20, #0x28]
00ba6984	ldr x9,[sp, #0x58]
00ba6988	cmp x8,x9
00ba698c	b.ne 0x00ba6c38
00ba6990	ldp x29,x30,[sp, #0xb0]
00ba6994	ldp x20,x19,[sp, #0xa0]
00ba6998	ldp x22,x21,[sp, #0x90]
00ba699c	ldp x24,x23,[sp, #0x80]
00ba69a0	ldp x26,x25,[sp, #0x70]
00ba69a4	ldp x28,x27,[sp, #0x60]
00ba69a8	add sp,sp,#0xc0
00ba69ac	ret
00ba69b0	add x8,x19,#0x30
00ba69b4	sub w9,w27,#0x63
00ba69b8	str x8,[sp, #0x18]
00ba69bc	add w8,w23,#0x1
00ba69c0	add x22,x19,#0x50
00ba69c4	mov x23,x9
00ba69c8	lsr w8,w8,#0x1
00ba69cc	str x8,[sp, #0x10]
00ba69d0	mov x0,x22
00ba69d4	mov x1,x27
00ba69d8	mov w2,w26
00ba69dc	mov x3,x25
00ba69e0	mov x4,x24
00ba69e4	bl 0x00c41bd0
00ba69e8	mov w28,w0
00ba69ec	cbnz w0,0x00ba6940
00ba69f0	add x0,sp,#0x48
00ba69f4	mov x1,x21
00ba69f8	mov x2,x22
00ba69fc	bl 0x00c41d60
00ba6a00	mov w28,w0
00ba6a04	cbnz w0,0x00ba6940
00ba6a08	add x0,sp,#0x48
00ba6a0c	bl 0x00c41b30
00ba6a10	cmp x0,x23
00ba6a14	b.ls 0x00ba6b0c
00ba6a18	ldrsh w8,[sp, #0x50]
00ba6a1c	tbz w8,#0x1f,0x00ba6a2c
00ba6a20	mov x0,x21
00ba6a24	mov x1,x22
00ba6a28	bl 0x00c41d70
00ba6a2c	mov w2,#0x1
00ba6a30	mov x0,x21
00ba6a34	mov x1,x21
00ba6a38	bl 0x00c41d50
00ba6a3c	mov w28,w0
00ba6a40	cbnz w0,0x00ba6940
00ba6a44	mov w2,#0x1
00ba6a48	mov x0,x22
00ba6a4c	mov x1,x22
00ba6a50	bl 0x00c41d50
00ba6a54	mov w28,w0
00ba6a58	cbnz w0,0x00ba6940
00ba6a5c	add x0,sp,#0x48
00ba6a60	mov x1,x21
00ba6a64	mov x2,x22
00ba6a68	bl 0x00c41c80
00ba6a6c	mov w28,w0
00ba6a70	cbnz w0,0x00ba6940
00ba6a74	ldr x1,[sp, #0x20]
00ba6a78	add x0,sp,#0x38
00ba6a7c	add x2,sp,#0x48
00ba6a80	bl 0x00c41bc0
00ba6a84	mov w28,w0
00ba6a88	cbnz w0,0x00ba6940
00ba6a8c	add x0,sp,#0x38
00ba6a90	mov w1,#0x1
00ba6a94	bl 0x00c41b40
00ba6a98	cbnz w0,0x00ba6b0c
00ba6a9c	add x0,sp,#0x38
00ba6aa0	mov x1,x21
00ba6aa4	mov x2,x22
00ba6aa8	bl 0x00c41bc0
00ba6aac	mov w28,w0
00ba6ab0	cbnz w0,0x00ba6940
00ba6ab4	add x0,sp,#0x28
00ba6ab8	add x2,sp,#0x48
00ba6abc	add x3,sp,#0x38
00ba6ac0	mov x1,xzr
00ba6ac4	bl 0x00c41b70
00ba6ac8	mov w28,w0
00ba6acc	cbnz w0,0x00ba6940
00ba6ad0	str x19,[sp, #0x8]
00ba6ad4	mov x19,x23
00ba6ad8	ldp x23,x1,[sp, #0x18]
00ba6adc	add x2,sp,#0x28
00ba6ae0	mov x0,x23
00ba6ae4	bl 0x00c41c10
00ba6ae8	mov w28,w0
00ba6aec	cbnz w0,0x00ba6b30
00ba6af0	mov x0,x23
00ba6af4	bl 0x00c41b30
00ba6af8	ldr x8,[sp, #0x10]
00ba6afc	mov x23,x19
00ba6b00	ldr x19,[sp, #0x8]
00ba6b04	cmp x0,x8
00ba6b08	b.hi 0x00ba6b38
00ba6b0c	mov x0,x21
00ba6b10	mov x1,x27
00ba6b14	mov w2,w26
00ba6b18	mov x3,x25
00ba6b1c	mov x4,x24
00ba6b20	bl 0x00c41bd0
00ba6b24	mov w28,w0
00ba6b28	cbz w0,0x00ba69d0
00ba6b2c	b 0x00ba6940
00ba6b30	ldr x19,[sp, #0x8]
00ba6b34	b 0x00ba6940
00ba6b38	mov w2,#0x1
00ba6b3c	mov x0,x21
00ba6b40	mov x1,x21
00ba6b44	bl 0x00c41b10
00ba6b48	mov w28,w0
00ba6b4c	cbnz w0,0x00ba6940
00ba6b50	mov w2,#0x1
00ba6b54	mov x0,x22
00ba6b58	mov x1,x22
00ba6b5c	bl 0x00c41b10
00ba6b60	mov w28,w0
00ba6b64	cbnz w0,0x00ba6940
00ba6b68	add x26,x19,#0x10
00ba6b6c	mov x0,x26
00ba6b70	mov x1,x21
00ba6b74	mov x2,x22
00ba6b78	bl 0x00c41c80
00ba6b7c	mov w28,w0
00ba6b80	cbnz w0,0x00ba6940
00ba6b84	mov x0,x26
00ba6b88	bl 0x00c41d30
00ba6b8c	ldr x2,[sp, #0x18]
00ba6b90	add x23,x19,#0x60
00ba6b94	add x24,x19,#0x70
00ba6b98	add x25,x19,#0x80
00ba6b9c	str x0,[x19, #0x8]
00ba6ba0	mov x0,x21
00ba6ba4	mov x1,x22
00ba6ba8	mov x3,x23
00ba6bac	mov x4,x24
00ba6bb0	mov x5,x25
00ba6bb4	bl 0x00c43420
00ba6bb8	mov w28,w0
00ba6bbc	cbnz w0,0x00ba6940
00ba6bc0	mov x0,x19
00ba6bc4	bl 0x00c43400
00ba6bc8	cbnz w0,0x00ba6bdc
00ba6bcc	ldr x0,[sp, #0x8]
00ba6bd0	mov w1,#0x1
00ba6bd4	bl 0x00ba6554
00ba6bd8	cbz w0,0x00ba6be8
00ba6bdc	ldr x19,[sp, #0x8]
00ba6be0	mov w28,#0xffffbe00
00ba6be4	b 0x00ba6940
00ba6be8	ldp x3,x4,[sp, #0x18]
00ba6bec	mov x0,x26
00ba6bf0	mov x1,x21
00ba6bf4	mov x2,x22
00ba6bf8	mov x5,xzr
00ba6bfc	mov x6,xzr
00ba6c00	bl 0x00c434c0
00ba6c04	ldr x19,[sp, #0x8]
00ba6c08	mov w28,#0xffffbe00
00ba6c0c	cbnz w0,0x00ba6940
00ba6c10	ldr x2,[sp, #0x18]
00ba6c14	mov x0,x21
00ba6c18	mov x1,x22
00ba6c1c	mov x3,x23
00ba6c20	mov x4,x24
00ba6c24	mov x5,x25
00ba6c28	bl 0x00c434b0
00ba6c2c	cmp w0,#0x0
00ba6c30	csel w28,wzr,w28,eq
00ba6c34	b 0x00ba6940
00ba6c38	bl 0x00c2fec0
