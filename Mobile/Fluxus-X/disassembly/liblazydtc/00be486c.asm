; std::__ndk1::num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_put @ 00be486c
00be486c	bti c
00be4870	adrp x4,0x2ab000
00be4874	add x4,x4,#0x32c
00be4878	b 0x00be487c
00be487c	paciasp
00be4880	sub sp,sp,#0xf0
00be4884	str d8,[sp, #0x90]
00be4888	stp x29,x30,[sp, #0x98]
00be488c	str x27,[sp, #0xa8]
00be4890	stp x26,x25,[sp, #0xb0]
00be4894	stp x24,x23,[sp, #0xc0]
00be4898	stp x22,x21,[sp, #0xd0]
00be489c	stp x20,x19,[sp, #0xe0]
00be48a0	add x29,sp,#0x98
00be48a4	fmov d8,d0
00be48a8	ldr w9,[x2, #0x8]
00be48ac	mov w8,#0x25
00be48b0	mov w19,w3
00be48b4	mov x20,x2
00be48b8	mov x21,x1
00be48bc	stur x8,[x29, #-0x10]
00be48c0	sub x8,x29,#0x10
00be48c4	tbnz w9,#0xb,0x00be48d4
00be48c8	orr x8,x8,#0x1
00be48cc	tbnz w9,#0xa,0x00be48e4
00be48d0	b 0x00be48ec
00be48d4	mov w10,#0x2b
00be48d8	orr x8,x8,#0x2
00be48dc	sturb w10,[x29, #-0xf]
00be48e0	tbz w9,#0xa,0x00be48ec
00be48e4	mov w10,#0x23
00be48e8	strb w10,[x8], #0x1
00be48ec	mov w10,#0x104
00be48f0	and w22,w9,w10
00be48f4	cmp w22,#0x104
00be48f8	b.eq 0x00be4904
00be48fc	mov w10,#0x2a2e
00be4900	strh w10,[x8], #0x2
00be4904	ldrb w10,[x4]
00be4908	cbz w10,0x00be491c
00be490c	add x11,x4,#0x1
00be4910	strb w10,[x8], #0x1
00be4914	ldrb w10,[x11], #0x1
00be4918	cbnz w10,0x00be4910
00be491c	cmp w22,#0x100
00be4920	b.eq 0x00be493c
00be4924	cmp w22,#0x4
00be4928	b.ne 0x00be494c
00be492c	tst w9,#0x4000
00be4930	mov w9,#0x46
00be4934	mov w10,#0x66
00be4938	b 0x00be49b4
00be493c	tst w9,#0x4000
00be4940	mov w9,#0x45
00be4944	mov w10,#0x65
00be4948	b 0x00be49b4
00be494c	cmp w22,#0x104
00be4950	b.ne 0x00be49a8
00be4954	tst w9,#0x4000
00be4958	mov w9,#0x41
00be495c	mov w10,#0x61
00be4960	csel w9,w10,w9,eq
00be4964	sub x10,x29,#0x2e
00be4968	adrp x22,0xd27000
00be496c	strb w9,[x8]
00be4970	adrp x8,0xd27000
00be4974	add x8,x8,#0xf8
00be4978	stur x10,[x29, #-0x38]
00be497c	ldarb w8,[x8]
00be4980	tbz w8,#0x0,0x00be4c4c
00be4984	fmov d0,d8
00be4988	ldr x2,[x22, #0xf0]
00be498c	sub x0,x29,#0x2e
00be4990	sub x3,x29,#0x10
00be4994	mov w1,#0x1e
00be4998	bl 0x00c0cd14
00be499c	cmp w0,#0x1d
00be49a0	b.gt 0x00be4a04
00be49a4	b 0x00be4a30
00be49a8	tst w9,#0x4000
00be49ac	mov w9,#0x47
00be49b0	mov w10,#0x67
00be49b4	csel w9,w10,w9,eq
00be49b8	adrp x23,0xd27000
00be49bc	add x23,x23,#0xf8
00be49c0	strb w9,[x8]
00be49c4	sub x8,x29,#0x2e
00be49c8	stur x8,[x29, #-0x38]
00be49cc	ldarb w8,[x23]
00be49d0	tbz w8,#0x0,0x00be4b98
00be49d4	fmov d0,d8
00be49d8	adrp x24,0xd27000
00be49dc	ldr w4,[x20, #0x10]
00be49e0	ldr x2,[x24, #0xf0]
00be49e4	sub x0,x29,#0x2e
00be49e8	sub x3,x29,#0x10
00be49ec	mov w1,#0x1e
00be49f0	bl 0x00c0cd14
00be49f4	cmp w0,#0x1d
00be49f8	b.le 0x00be4a30
00be49fc	cmp w22,#0x104
00be4a00	b.ne 0x00be4a38
00be4a04	adrp x8,0xd27000
00be4a08	add x8,x8,#0xf8
00be4a0c	ldarb w8,[x8]
00be4a10	tbz w8,#0x0,0x00be4bd8
00be4a14	adrp x8,0xd27000
00be4a18	ldr x1,[x8, #0xf0]
00be4a1c	fmov d0,d8
00be4a20	sub x0,x29,#0x38
00be4a24	sub x2,x29,#0x10
00be4a28	bl 0x00c0cdd4
00be4a2c	b 0x00be4a58
00be4a30	mov x22,xzr
00be4a34	b 0x00be4a64
00be4a38	ldarb w8,[x23]
00be4a3c	tbz w8,#0x0,0x00be4c14
00be4a40	ldr x1,[x24, #0xf0]
00be4a44	ldr w3,[x20, #0x10]
00be4a48	fmov d0,d8
00be4a4c	sub x0,x29,#0x38
00be4a50	sub x2,x29,#0x10
00be4a54	bl 0x00c0cdd4
00be4a58	cmn w0,#0x1
00be4a5c	b.eq 0x00be4bd4
00be4a60	ldur x22,[x29, #-0x38]
00be4a64	ldr w9,[x20, #0x8]
00be4a68	ldur x23,[x29, #-0x38]
00be4a6c	sxtw x8,w0
00be4a70	mov w10,#0xb0
00be4a74	and w9,w9,w10
00be4a78	add x25,x23,x8
00be4a7c	cmp w9,#0x20
00be4a80	mov x26,x25
00be4a84	b.eq 0x00be4ad8
00be4a88	cmp w9,#0x10
00be4a8c	b.ne 0x00be4ad4
00be4a90	ldrb w9,[x23]
00be4a94	cmp w9,#0x2d
00be4a98	b.eq 0x00be4aa4
00be4a9c	cmp w9,#0x2b
00be4aa0	b.ne 0x00be4aac
00be4aa4	add x26,x23,#0x1
00be4aa8	b 0x00be4ad8
00be4aac	cmp w8,#0x2
00be4ab0	b.lt 0x00be4ad4
00be4ab4	cmp w9,#0x30
00be4ab8	b.ne 0x00be4ad4
00be4abc	ldrb w9,[x23, #0x1]
00be4ac0	orr w9,w9,#0x20
00be4ac4	cmp w9,#0x78
00be4ac8	b.ne 0x00be4ad4
00be4acc	add x26,x23,#0x2
00be4ad0	b 0x00be4ad8
00be4ad4	mov x26,x23
00be4ad8	sub x9,x29,#0x2e
00be4adc	cmp x23,x9
00be4ae0	b.eq 0x00be4afc
00be4ae4	lsl x0,x8,#0x1
00be4ae8	bl 0x00c308d0
00be4aec	mov x24,x0
00be4af0	mov x27,x0
00be4af4	cbnz x0,0x00be4b04
00be4af8	bl 0x00c43cc0
00be4afc	mov x24,xzr
00be4b00	add x27,sp,#0x27
00be4b04	add x8,sp,#0x8
00be4b08	mov x0,x20
00be4b0c	bl 0x00c30070
00be4b10	add x4,sp,#0x18
00be4b14	add x5,sp,#0x10
00be4b18	add x6,sp,#0x8
00be4b1c	mov x0,x23
00be4b20	mov x1,x26
00be4b24	mov x2,x25
00be4b28	mov x3,x27
00be4b2c	bl 0x00c44160
00be4b30	add x0,sp,#0x8
00be4b34	bl 0x00c30090
00be4b38	ldp x3,x2,[sp, #0x10]
00be4b3c	mov x0,x21
00be4b40	mov x1,x27
00be4b44	mov x4,x20
00be4b48	mov w5,w19
00be4b4c	bl 0x00be5420
00be4b50	mov x19,x0
00be4b54	cbz x24,0x00be4b60
00be4b58	mov x0,x24
00be4b5c	bl 0x00c30960
00be4b60	cbz x22,0x00be4b6c
00be4b64	mov x0,x22
00be4b68	bl 0x00c30960
00be4b6c	mov x0,x19
00be4b70	ldp x20,x19,[sp, #0xe0]
00be4b74	ldr x27,[sp, #0xa8]
00be4b78	ldp x22,x21,[sp, #0xd0]
00be4b7c	ldr d8,[sp, #0x90]
00be4b80	ldp x24,x23,[sp, #0xc0]
00be4b84	ldp x26,x25,[sp, #0xb0]
00be4b88	ldp x29,x30,[sp, #0x98]
00be4b8c	add sp,sp,#0xf0
00be4b90	autiasp
00be4b94	ret
00be4b98	adrp x0,0xd27000
00be4b9c	add x0,x0,#0xf8
00be4ba0	bl 0x00c2fe90
00be4ba4	cbz w0,0x00be49d4
00be4ba8	adrp x1,0x2c6000
00be4bac	add x1,x1,#0xbfc
00be4bb0	mov w0,#0x1fbf
00be4bb4	mov x2,xzr
00be4bb8	bl 0x00c43890
00be4bbc	adrp x8,0xd27000
00be4bc0	str x0,[x8, #0xf0]
00be4bc4	adrp x0,0xd27000
00be4bc8	add x0,x0,#0xf8
00be4bcc	bl 0x00c2fea0
00be4bd0	b 0x00be49d4
00be4bd4	bl 0x00c43cc0
00be4bd8	adrp x0,0xd27000
00be4bdc	add x0,x0,#0xf8
00be4be0	bl 0x00c2fe90
00be4be4	cbz w0,0x00be4a14
00be4be8	adrp x1,0x2c6000
00be4bec	add x1,x1,#0xbfc
00be4bf0	mov w0,#0x1fbf
00be4bf4	mov x2,xzr
00be4bf8	bl 0x00c43890
00be4bfc	adrp x8,0xd27000
00be4c00	str x0,[x8, #0xf0]
00be4c04	adrp x0,0xd27000
00be4c08	add x0,x0,#0xf8
00be4c0c	bl 0x00c2fea0
00be4c10	b 0x00be4a14
00be4c14	adrp x0,0xd27000
00be4c18	add x0,x0,#0xf8
00be4c1c	bl 0x00c2fe90
00be4c20	cbz w0,0x00be4a40
00be4c24	adrp x1,0x2c6000
00be4c28	add x1,x1,#0xbfc
00be4c2c	mov w0,#0x1fbf
00be4c30	mov x2,xzr
00be4c34	bl 0x00c43890
00be4c38	str x0,[x24, #0xf0]
00be4c3c	adrp x0,0xd27000
00be4c40	add x0,x0,#0xf8
00be4c44	bl 0x00c2fea0
00be4c48	b 0x00be4a40
00be4c4c	adrp x0,0xd27000
00be4c50	add x0,x0,#0xf8
00be4c54	bl 0x00c2fe90
00be4c58	cbz w0,0x00be4984
00be4c5c	adrp x1,0x2c6000
00be4c60	add x1,x1,#0xbfc
00be4c64	mov w0,#0x1fbf
00be4c68	mov x2,xzr
00be4c6c	bl 0x00c43890
00be4c70	str x0,[x22, #0xf0]
00be4c74	adrp x0,0xd27000
00be4c78	add x0,x0,#0xf8
00be4c7c	bl 0x00c2fea0
00be4c80	b 0x00be4984
