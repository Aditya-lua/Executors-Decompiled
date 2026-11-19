; bn_mul_words @ 00a04a08
00a04a08	cmp w2,#0x1
00a04a0c	b.lt 0x00a04b58
00a04a10	and x9,x3,#0xffffffff
00a04a14	subs w12,w2,#0x4
00a04a18	lsr x10,x3,#0x20
00a04a1c	mov x8,xzr
00a04a20	b.cc 0x00a04b60
00a04a24	and w11,w12,#0xfffffffc
00a04a28	add x13,x11,#0x4
00a04a2c	add x11,x0,x13, LSL #0x3
00a04a30	mov x14,x1
00a04a34	ldr x15,[x14]
00a04a38	sub w2,w2,#0x4
00a04a3c	and x16,x15,#0xffffffff
00a04a40	lsr x15,x15,#0x20
00a04a44	mul x17,x16,x10
00a04a48	mul x18,x15,x9
00a04a4c	mul x15,x15,x10
00a04a50	adds x17,x17,x18
00a04a54	mul x16,x16,x9
00a04a58	cset w18,cs
00a04a5c	add x15,x15,x17, LSR #0x20
00a04a60	adds x16,x16,x17, LSL #0x20
00a04a64	add x15,x15,x18, LSL #0x20
00a04a68	cinc x15,x15,cs
00a04a6c	adds x8,x16,x8
00a04a70	str x8,[x0]
00a04a74	ldr x8,[x14, #0x8]
00a04a78	cinc x15,x15,cs
00a04a7c	and x16,x8,#0xffffffff
00a04a80	lsr x8,x8,#0x20
00a04a84	mul x17,x16,x10
00a04a88	mul x18,x8,x9
00a04a8c	mul x8,x8,x10
00a04a90	adds x17,x17,x18
00a04a94	mul x16,x16,x9
00a04a98	cset w18,cs
00a04a9c	add x8,x8,x17, LSR #0x20
00a04aa0	adds x16,x16,x17, LSL #0x20
00a04aa4	add x8,x8,x18, LSL #0x20
00a04aa8	cinc x8,x8,cs
00a04aac	adds x15,x15,x16
00a04ab0	str x15,[x0, #0x8]
00a04ab4	ldr x15,[x14, #0x10]
00a04ab8	cinc x8,x8,cs
00a04abc	and x16,x15,#0xffffffff
00a04ac0	lsr x15,x15,#0x20
00a04ac4	mul x17,x16,x10
00a04ac8	mul x18,x15,x9
00a04acc	mul x15,x15,x10
00a04ad0	adds x17,x17,x18
00a04ad4	mul x16,x16,x9
00a04ad8	cset w18,cs
00a04adc	add x15,x15,x17, LSR #0x20
00a04ae0	adds x16,x16,x17, LSL #0x20
00a04ae4	add x15,x15,x18, LSL #0x20
00a04ae8	cinc x15,x15,cs
00a04aec	adds x8,x8,x16
00a04af0	str x8,[x0, #0x10]
00a04af4	ldr x8,[x14, #0x18]
00a04af8	cinc x15,x15,cs
00a04afc	add x14,x14,#0x20
00a04b00	and x16,x8,#0xffffffff
00a04b04	lsr x8,x8,#0x20
00a04b08	mul x17,x16,x10
00a04b0c	mul x18,x8,x9
00a04b10	mul x8,x8,x10
00a04b14	adds x17,x17,x18
00a04b18	mul x16,x16,x9
00a04b1c	cset w18,cs
00a04b20	add x8,x8,x17, LSR #0x20
00a04b24	adds x16,x16,x17, LSL #0x20
00a04b28	add x8,x8,x18, LSL #0x20
00a04b2c	cinc x8,x8,cs
00a04b30	adds x15,x15,x16
00a04b34	cinc x8,x8,cs
00a04b38	str x15,[x0, #0x18]
00a04b3c	cmp w2,#0x3
00a04b40	add x0,x0,#0x20
00a04b44	b.hi 0x00a04a34
00a04b48	ands w2,w12,#0x3
00a04b4c	b.eq 0x00a04bac
00a04b50	add x1,x1,x13, LSL #0x3
00a04b54	b 0x00a04b64
00a04b58	mov x0,xzr
00a04b5c	ret
00a04b60	mov x11,x0
00a04b64	ldr x12,[x1], #0x8
00a04b68	and x13,x12,#0xffffffff
00a04b6c	lsr x12,x12,#0x20
00a04b70	mul x14,x13,x10
00a04b74	mul x15,x12,x9
00a04b78	mul x12,x12,x10
00a04b7c	adds x14,x14,x15
00a04b80	mul x13,x13,x9
00a04b84	cset w15,cs
00a04b88	add x12,x12,x14, LSR #0x20
00a04b8c	adds x13,x13,x14, LSL #0x20
00a04b90	add x12,x12,x15, LSL #0x20
00a04b94	cinc x12,x12,cs
00a04b98	adds x13,x13,x8
00a04b9c	cinc x8,x12,cs
00a04ba0	subs w2,w2,#0x1
00a04ba4	str x13,[x11], #0x8
00a04ba8	b.ne 0x00a04b64
00a04bac	mov x0,x8
00a04bb0	ret
