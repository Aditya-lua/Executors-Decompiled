; FUN_00bb58e0 @ 00bb58e0
00bb58e0	cbz x3,0x00bb5968
00bb58e4	bic x9,x1,x1, ASR #0x3f
00bb58e8	ldrh w10,[x4, #0x2]
00bb58ec	subs x15,x3,#0x8
00bb58f0	add x8,x4,#0x4
00bb58f4	add x11,x0,x9
00bb58f8	b.cc 0x00bb5970
00bb58fc	add x12,x2,x3
00bb5900	ldurb w13,[x12, #-0x1]
00bb5904	cbz w13,0x00bb5afc
00bb5908	cmn x3,#0x78
00bb590c	b.hi 0x00bb5b90
00bb5910	clz w13,w13
00bb5914	ldr x12,[x2, x15#0x0]
00bb5918	mov w14,#0x8
00bb591c	eor w13,w13,#0x1f
00bb5920	cmp x1,#0x3
00bb5924	sub w13,w14,w13
00bb5928	b.gt 0x00bb5a04
00bb592c	cmp x3,#0x10
00bb5930	add x16,x2,x15
00bb5934	b.ge 0x00bb5b30
00bb5938	cbz x15,0x00bb5b10
00bb593c	lsr w12,w13,#0x3
00bb5940	sub x14,x16,x12
00bb5944	cmp x14,x2
00bb5948	mov x14,x0
00bb594c	csel w12,w15,w12,cc
00bb5950	sub x16,x16,x12
00bb5954	sub w13,w13,w12, LSL #0x3
00bb5958	ldr x12,[x16]
00bb595c	cmp x14,x11
00bb5960	b.cc 0x00bb5b4c
00bb5964	b 0x00bb5b1c
00bb5968	mov x0,#-0x48
00bb596c	ret
00bb5970	ldrb w12,[x2]
00bb5974	cmp x3,#0x4
00bb5978	b.gt 0x00bb5998
00bb597c	cmp x3,#0x2
00bb5980	b.eq 0x00bb59d8
00bb5984	cmp x3,#0x3
00bb5988	b.eq 0x00bb59d0
00bb598c	cmp x3,#0x4
00bb5990	b.eq 0x00bb59c8
00bb5994	b 0x00bb59e0
00bb5998	cmp x3,#0x5
00bb599c	b.eq 0x00bb59c0
00bb59a0	cmp x3,#0x6
00bb59a4	b.eq 0x00bb59b8
00bb59a8	cmp x3,#0x7
00bb59ac	b.ne 0x00bb59e0
00bb59b0	ldrb w13,[x2, #0x6]
00bb59b4	orr x12,x12,x13, LSL #0x30
00bb59b8	ldrb w13,[x2, #0x5]
00bb59bc	add x12,x12,x13, LSL #0x28
00bb59c0	ldrb w13,[x2, #0x4]
00bb59c4	add x12,x12,x13, LSL #0x20
00bb59c8	ldrb w13,[x2, #0x3]
00bb59cc	add x12,x12,x13, LSL #0x18
00bb59d0	ldrb w13,[x2, #0x2]
00bb59d4	add x12,x12,x13, LSL #0x10
00bb59d8	ldrb w13,[x2, #0x1]
00bb59dc	add x12,x12,x13, LSL #0x8
00bb59e0	add x13,x2,x3
00bb59e4	ldurb w13,[x13, #-0x1]
00bb59e8	cbz w13,0x00bb5b04
00bb59ec	clz w13,w13
00bb59f0	cmp x1,#0x4
00bb59f4	sub w13,w13,w3, LSL #0x3
00bb59f8	add w13,w13,#0x29
00bb59fc	b.lt 0x00bb5b0c
00bb5a00	mov x15,xzr
00bb5a04	neg w14,w10
00bb5a08	sub x3,x11,#0x3
00bb5a0c	adrp x17,0x789000
00bb5a10	add x17,x17,#0x2b0
00bb5a14	and w4,w14,#0x3f
00bb5a18	mov x14,x0
00bb5a1c	cmp x15,#0x8
00bb5a20	b.ge 0x00bb5a48
00bb5a24	add x16,x2,x15
00bb5a28	cbz x15,0x00bb5b44
00bb5a2c	lsr w12,w13,#0x3
00bb5a30	sub x16,x16,x12
00bb5a34	cmp x16,x2
00bb5a38	csel w12,w12,w15,cs
00bb5a3c	cset w16,cs
00bb5a40	sub w13,w13,w12, LSL #0x3
00bb5a44	b 0x00bb5a54
00bb5a48	lsr w12,w13,#0x3
00bb5a4c	and w13,w13,#0x7
00bb5a50	mov w16,#0x1
00bb5a54	sub x15,x15,w12, UXTW 
00bb5a58	cmp x14,x3
00bb5a5c	ldr x12,[x2, x15#0x0]
00bb5a60	b.cs 0x00bb5b20
00bb5a64	cbz w16,0x00bb5b20
00bb5a68	lsl x16,x12,x13
00bb5a6c	lsr x16,x16,x4
00bb5a70	add x16,x8,x16, LSL #0x1
00bb5a74	ldrb w5,[x16]
00bb5a78	ldrb w16,[x16, #0x1]
00bb5a7c	add w13,w13,w5
00bb5a80	strb w16,[x14]
00bb5a84	lsl x5,x12,x13
00bb5a88	lsr x5,x5,x4
00bb5a8c	add x5,x8,x5, LSL #0x1
00bb5a90	ldrb w16,[x5]
00bb5a94	ldrb w5,[x5, #0x1]
00bb5a98	add w13,w13,w16
00bb5a9c	strb w5,[x14, #0x1]
00bb5aa0	lsl x16,x12,x13
00bb5aa4	lsr x16,x16,x4
00bb5aa8	add x16,x8,x16, LSL #0x1
00bb5aac	ldrb w5,[x16]
00bb5ab0	ldrb w16,[x16, #0x1]
00bb5ab4	add w13,w13,w5
00bb5ab8	strb w16,[x14, #0x2]
00bb5abc	lsl x5,x12,x13
00bb5ac0	lsr x5,x5,x4
00bb5ac4	add x5,x8,x5, LSL #0x1
00bb5ac8	ldrb w16,[x5]
00bb5acc	ldrb w6,[x5, #0x1]
00bb5ad0	add x5,x14,#0x4
00bb5ad4	add w13,w13,w16
00bb5ad8	strb w6,[x14, #0x3]
00bb5adc	mov x14,x5
00bb5ae0	cmp w13,#0x40
00bb5ae4	b.ls 0x00bb5a1c
00bb5ae8	mov x16,x17
00bb5aec	mov x14,x5
00bb5af0	cmp x14,x11
00bb5af4	b.cc 0x00bb5b4c
00bb5af8	b 0x00bb5b1c
00bb5afc	mov x0,#-0x1
00bb5b00	ret
00bb5b04	mov x0,#-0x14
00bb5b08	ret
00bb5b0c	mov x16,x2
00bb5b10	mov x14,x0
00bb5b14	cmp x14,x11
00bb5b18	b.cc 0x00bb5b4c
00bb5b1c	b 0x00bb5b80
00bb5b20	add x16,x2,x15
00bb5b24	cmp x14,x11
00bb5b28	b.cc 0x00bb5b4c
00bb5b2c	b 0x00bb5b1c
00bb5b30	lsr w12,w13,#0x3
00bb5b34	and w13,w13,#0x7
00bb5b38	mov x14,x0
00bb5b3c	sub x16,x16,x12
00bb5b40	ldr x12,[x16]
00bb5b44	cmp x14,x11
00bb5b48	b.cs 0x00bb5b1c
00bb5b4c	neg w10,w10
00bb5b50	add x11,x9,x0
00bb5b54	and w9,w10,#0x3f
00bb5b58	sub x10,x11,x14
00bb5b5c	lsl x11,x12,x13
00bb5b60	subs x10,x10,#0x1
00bb5b64	lsr x11,x11,x9
00bb5b68	add x11,x8,x11, LSL #0x1
00bb5b6c	ldrb w15,[x11]
00bb5b70	ldrb w11,[x11, #0x1]
00bb5b74	add w13,w13,w15, UXTB 
00bb5b78	strb w11,[x14], #0x1
00bb5b7c	b.ne 0x00bb5b5c
00bb5b80	cmp w13,#0x40
00bb5b84	mov x8,#-0x14
00bb5b88	ccmp x16,x2,#0x0,eq
00bb5b8c	csel x3,x1,x8,eq
00bb5b90	mov x0,x3
00bb5b94	ret
