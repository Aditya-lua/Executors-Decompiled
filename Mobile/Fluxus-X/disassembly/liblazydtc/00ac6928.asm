; ossl_property_merge @ 00ac6928
00ac6928	str x23,[sp, #-0x40]!
00ac692c	stp x22,x21,[sp, #0x10]
00ac6930	stp x20,x19,[sp, #0x20]
00ac6934	stp x29,x30,[sp, #0x30]
00ac6938	ldr w21,[x0]
00ac693c	ldr w22,[x1]
00ac6940	orr w23,wzr,#0x18
00ac6944	mov x19,x1
00ac6948	mov w9,#0x20
00ac694c	adds w8,w22,w21
00ac6950	sub w8,w8,#0x1
00ac6954	smull x8,w8,w23
00ac6958	add x8,x8,#0x20
00ac695c	adrp x1,0x2d8000
00ac6960	mov x20,x0
00ac6964	csel x0,x9,x8,eq
00ac6968	add x1,x1,#0x6ba
00ac696c	mov w2,#0x225
00ac6970	add x29,sp,#0x30
00ac6974	bl 0x00c32320
00ac6978	cbz x0,0x00ac6a80
00ac697c	ldrb w13,[x0, #0x4]
00ac6980	mov w8,wzr
00ac6984	mov w10,wzr
00ac6988	mov w11,wzr
00ac698c	and w13,w13,#0xfe
00ac6990	orr x9,xzr,#-0x100000000
00ac6994	mov w12,#0x8
00ac6998	strb w13,[x0, #0x4]
00ac699c	orr x13,xzr,#0x100000000
00ac69a0	b 0x00ac69d8
00ac69a4	ldr x15,[x14, #0x10]
00ac69a8	add x16,x0,x12
00ac69ac	add x9,x9,x13
00ac69b0	sub w8,w8,#0x1
00ac69b4	str x15,[x16, #0x10]
00ac69b8	ldr q0,[x14]
00ac69bc	add x12,x12,#0x18
00ac69c0	str q0,[x16]
00ac69c4	ldrb w14,[x14, #0xc]
00ac69c8	ldrb w15,[x0, #0x4]
00ac69cc	and w14,w14,#0x1
00ac69d0	orr w14,w14,w15
00ac69d4	strb w14,[x0, #0x4]
00ac69d8	ldr w15,[x20]
00ac69dc	ldr w14,[x19]
00ac69e0	cmp w10,w15
00ac69e4	b.ge 0x00ac6a14
00ac69e8	cmp w11,w14
00ac69ec	b.ge 0x00ac6a2c
00ac69f0	smaddl x14,w10,w23,x20
00ac69f4	smaddl x15,w11,w23,x19
00ac69f8	ldr w16,[x14, #0x8]!
00ac69fc	ldr w17,[x15, #0x8]!
00ac6a00	cmp w16,w17
00ac6a04	b.le 0x00ac6a3c
00ac6a08	add w11,w11,#0x1
00ac6a0c	mov x14,x15
00ac6a10	b 0x00ac69a4
00ac6a14	cmp w11,w14
00ac6a18	b.ge 0x00ac6a48
00ac6a1c	smaddl x14,w11,w23,x19
00ac6a20	add w11,w11,#0x1
00ac6a24	add x14,x14,#0x8
00ac6a28	b 0x00ac69a4
00ac6a2c	smaddl x14,w10,w23,x20
00ac6a30	add w10,w10,#0x1
00ac6a34	add x14,x14,#0x8
00ac6a38	b 0x00ac69a4
00ac6a3c	cinc w11,w11,eq
00ac6a40	add w10,w10,#0x1
00ac6a44	b 0x00ac69a4
00ac6a48	add w10,w22,w21
00ac6a4c	neg w10,w10
00ac6a50	neg w11,w8
00ac6a54	cmp w10,w8
00ac6a58	str w11,[x0]
00ac6a5c	b.eq 0x00ac6a80
00ac6a60	asr x8,x9,#0x20
00ac6a64	orr w9,wzr,#0x18
00ac6a68	orr x10,xzr,#0x20
00ac6a6c	adrp x2,0x2d8000
00ac6a70	madd x1,x8,x9,x10
00ac6a74	add x2,x2,#0x6ba
00ac6a78	mov w3,#0x23b
00ac6a7c	bl 0x00c356f0
00ac6a80	ldp x29,x30,[sp, #0x30]
00ac6a84	ldp x20,x19,[sp, #0x20]
00ac6a88	ldp x22,x21,[sp, #0x10]
00ac6a8c	ldr x23,[sp], #0x40
00ac6a90	ret
