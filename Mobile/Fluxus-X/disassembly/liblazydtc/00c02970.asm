; FUN_00c02970 @ 00c02970
00c02970	paciasp
00c02974	stp x29,x30,[sp, #-0x10]!
00c02978	mov x29,sp
00c0297c	adrp x8,0xd27000
00c02980	add x8,x8,#0x550
00c02984	ldarb w8,[x8]
00c02988	tbz w8,#0x0,0x00c02d70
00c0298c	adrp x8,0xd27000
00c02990	ldrb w8,[x8, #0x400]
00c02994	tbnz w8,#0x0,0x00c029ac
00c02998	adrp x8,0xd27000
00c0299c	add x8,x8,#0x400
00c029a0	mov w9,#0xc
00c029a4	strb w9,[x8], #0x1
00c029a8	b 0x00c029c0
00c029ac	adrp x9,0xd27000
00c029b0	add x9,x9,#0x408
00c029b4	mov w10,#0x6
00c029b8	ldr x8,[x9, #0x8]
00c029bc	str x10,[x9]
00c029c0	mov w10,#0x7553
00c029c4	mov w9,#0x7961
00c029c8	strb wzr,[x8, #0x6]
00c029cc	movk w10,#0x646e, LSL #16
00c029d0	strh w9,[x8, #0x4]
00c029d4	adrp x9,0xd27000
00c029d8	str w10,[x8]
00c029dc	ldrb w8,[x9, #0x418]
00c029e0	tbnz w8,#0x0,0x00c029f8
00c029e4	adrp x8,0xd27000
00c029e8	add x8,x8,#0x418
00c029ec	mov w9,#0xc
00c029f0	strb w9,[x8], #0x1
00c029f4	b 0x00c02a0c
00c029f8	adrp x9,0xd27000
00c029fc	add x9,x9,#0x420
00c02a00	mov w10,#0x6
00c02a04	ldr x8,[x9, #0x8]
00c02a08	str x10,[x9]
00c02a0c	mov w10,#0x6f4d
00c02a10	mov w9,#0x7961
00c02a14	strb wzr,[x8, #0x6]
00c02a18	movk w10,#0x646e, LSL #16
00c02a1c	strh w9,[x8, #0x4]
00c02a20	adrp x9,0xd27000
00c02a24	str w10,[x8]
00c02a28	ldrb w8,[x9, #0x430]
00c02a2c	tbnz w8,#0x0,0x00c02a44
00c02a30	adrp x8,0xd27000
00c02a34	add x8,x8,#0x430
00c02a38	mov w9,#0xe
00c02a3c	strb w9,[x8], #0x1
00c02a40	b 0x00c02a58
00c02a44	adrp x9,0xd27000
00c02a48	add x9,x9,#0x438
00c02a4c	mov w10,#0x7
00c02a50	ldr x8,[x9, #0x8]
00c02a54	str x10,[x9]
00c02a58	mov w9,#0x6473
00c02a5c	mov w10,#0x7554
00c02a60	strb wzr,[x8, #0x7]
00c02a64	movk w9,#0x7961, LSL #16
00c02a68	movk w10,#0x7365, LSL #16
00c02a6c	stur w9,[x8, #0x3]
00c02a70	adrp x9,0xd27000
00c02a74	str w10,[x8]
00c02a78	ldrb w8,[x9, #0x448]
00c02a7c	tbnz w8,#0x0,0x00c02a94
00c02a80	adrp x8,0xd27000
00c02a84	add x8,x8,#0x448
00c02a88	mov w9,#0x12
00c02a8c	strb w9,[x8], #0x1
00c02a90	b 0x00c02aa8
00c02a94	adrp x9,0xd27000
00c02a98	add x9,x9,#0x450
00c02a9c	mov w10,#0x9
00c02aa0	ldr x8,[x9, #0x8]
00c02aa4	str x10,[x9]
00c02aa8	adrp x10,0x2ca000
00c02aac	add x10,x10,#0xe91
00c02ab0	mov w9,#0x79
00c02ab4	ldr x10,[x10]
00c02ab8	strh w9,[x8, #0x8]
00c02abc	str x10,[x8]
00c02ac0	adrp x8,0xd27000
00c02ac4	ldrb w8,[x8, #0x460]
00c02ac8	tbnz w8,#0x0,0x00c02ae0
00c02acc	adrp x8,0xd27000
00c02ad0	add x8,x8,#0x460
00c02ad4	mov w9,#0x10
00c02ad8	strb w9,[x8], #0x1
00c02adc	b 0x00c02af4
00c02ae0	adrp x9,0xd27000
00c02ae4	add x9,x9,#0x468
00c02ae8	mov w10,#0x8
00c02aec	ldr x8,[x9, #0x8]
00c02af0	str x10,[x9]
00c02af4	mov x9,#0x6854
00c02af8	strb wzr,[x8, #0x8]
00c02afc	movk x9,#0x7275, LSL #16
00c02b00	movk x9,#0x6473, LSL #32
00c02b04	movk x9,#0x7961, LSL #48
00c02b08	str x9,[x8]
00c02b0c	adrp x8,0xd27000
00c02b10	ldrb w8,[x8, #0x478]
00c02b14	tbnz w8,#0x0,0x00c02b2c
00c02b18	adrp x8,0xd27000
00c02b1c	add x8,x8,#0x478
00c02b20	mov w9,#0xc
00c02b24	strb w9,[x8], #0x1
00c02b28	b 0x00c02b40
00c02b2c	adrp x9,0xd27000
00c02b30	add x9,x9,#0x480
00c02b34	mov w10,#0x6
00c02b38	ldr x8,[x9, #0x8]
00c02b3c	str x10,[x9]
00c02b40	mov w10,#0x7246
00c02b44	mov w9,#0x7961
00c02b48	strb wzr,[x8, #0x6]
00c02b4c	movk w10,#0x6469, LSL #16
00c02b50	strh w9,[x8, #0x4]
00c02b54	adrp x9,0xd27000
00c02b58	str w10,[x8]
00c02b5c	ldrb w8,[x9, #0x490]
00c02b60	tbnz w8,#0x0,0x00c02b78
00c02b64	adrp x8,0xd27000
00c02b68	add x8,x8,#0x490
00c02b6c	mov w9,#0x10
00c02b70	strb w9,[x8], #0x1
00c02b74	b 0x00c02b8c
00c02b78	adrp x9,0xd27000
00c02b7c	add x9,x9,#0x498
00c02b80	mov w10,#0x8
00c02b84	ldr x8,[x9, #0x8]
00c02b88	str x10,[x9]
00c02b8c	mov x9,#0x6153
00c02b90	strb wzr,[x8, #0x8]
00c02b94	movk x9,#0x7574, LSL #16
00c02b98	movk x9,#0x6472, LSL #32
00c02b9c	movk x9,#0x7961, LSL #48
00c02ba0	str x9,[x8]
00c02ba4	adrp x8,0xd27000
00c02ba8	ldrb w8,[x8, #0x4a8]
00c02bac	tbnz w8,#0x0,0x00c02bc4
00c02bb0	adrp x8,0xd27000
00c02bb4	add x8,x8,#0x4a8
00c02bb8	mov w9,#0x6
00c02bbc	strb w9,[x8], #0x1
00c02bc0	b 0x00c02bd8
00c02bc4	adrp x9,0xd27000
00c02bc8	add x9,x9,#0x4b0
00c02bcc	mov w10,#0x3
00c02bd0	ldr x8,[x9, #0x8]
00c02bd4	str x10,[x9]
00c02bd8	mov w9,#0x7553
00c02bdc	movk w9,#0x6e, LSL #16
00c02be0	str w9,[x8]
00c02be4	adrp x8,0xd27000
00c02be8	ldrb w8,[x8, #0x4c0]
00c02bec	tbnz w8,#0x0,0x00c02c04
00c02bf0	adrp x8,0xd27000
00c02bf4	add x8,x8,#0x4c0
00c02bf8	mov w9,#0x6
00c02bfc	strb w9,[x8], #0x1
00c02c00	b 0x00c02c18
00c02c04	adrp x9,0xd27000
00c02c08	add x9,x9,#0x4c8
00c02c0c	mov w10,#0x3
00c02c10	ldr x8,[x9, #0x8]
00c02c14	str x10,[x9]
00c02c18	mov w9,#0x6f4d
00c02c1c	movk w9,#0x6e, LSL #16
00c02c20	str w9,[x8]
00c02c24	adrp x8,0xd27000
00c02c28	ldrb w8,[x8, #0x4d8]
00c02c2c	tbnz w8,#0x0,0x00c02c44
00c02c30	adrp x8,0xd27000
00c02c34	add x8,x8,#0x4d8
00c02c38	mov w9,#0x6
00c02c3c	strb w9,[x8], #0x1
00c02c40	b 0x00c02c58
00c02c44	adrp x9,0xd27000
00c02c48	add x9,x9,#0x4e0
00c02c4c	mov w10,#0x3
00c02c50	ldr x8,[x9, #0x8]
00c02c54	str x10,[x9]
00c02c58	mov w9,#0x7554
00c02c5c	movk w9,#0x65, LSL #16
00c02c60	str w9,[x8]
00c02c64	adrp x8,0xd27000
00c02c68	ldrb w8,[x8, #0x4f0]
00c02c6c	tbnz w8,#0x0,0x00c02c84
00c02c70	adrp x8,0xd27000
00c02c74	add x8,x8,#0x4f0
00c02c78	mov w9,#0x6
00c02c7c	strb w9,[x8], #0x1
00c02c80	b 0x00c02c98
00c02c84	adrp x9,0xd27000
00c02c88	add x9,x9,#0x4f8
00c02c8c	mov w10,#0x3
00c02c90	ldr x8,[x9, #0x8]
00c02c94	str x10,[x9]
00c02c98	mov w9,#0x6557
00c02c9c	movk w9,#0x64, LSL #16
00c02ca0	str w9,[x8]
00c02ca4	adrp x8,0xd27000
00c02ca8	ldrb w8,[x8, #0x508]
00c02cac	tbnz w8,#0x0,0x00c02cc4
00c02cb0	adrp x8,0xd27000
00c02cb4	add x8,x8,#0x508
00c02cb8	mov w9,#0x6
00c02cbc	strb w9,[x8], #0x1
00c02cc0	b 0x00c02cd8
00c02cc4	adrp x9,0xd27000
00c02cc8	add x9,x9,#0x510
00c02ccc	mov w10,#0x3
00c02cd0	ldr x8,[x9, #0x8]
00c02cd4	str x10,[x9]
00c02cd8	mov w9,#0x6854
00c02cdc	movk w9,#0x75, LSL #16
00c02ce0	str w9,[x8]
00c02ce4	adrp x8,0xd27000
00c02ce8	ldrb w8,[x8, #0x520]
00c02cec	tbnz w8,#0x0,0x00c02d04
00c02cf0	adrp x8,0xd27000
00c02cf4	add x8,x8,#0x520
00c02cf8	mov w9,#0x6
00c02cfc	strb w9,[x8], #0x1
00c02d00	b 0x00c02d18
00c02d04	adrp x9,0xd27000
00c02d08	add x9,x9,#0x528
00c02d0c	mov w10,#0x3
00c02d10	ldr x8,[x9, #0x8]
00c02d14	str x10,[x9]
00c02d18	mov w9,#0x7246
00c02d1c	movk w9,#0x69, LSL #16
00c02d20	str w9,[x8]
00c02d24	adrp x8,0xd27000
00c02d28	ldrb w8,[x8, #0x538]
00c02d2c	tbnz w8,#0x0,0x00c02d44
00c02d30	adrp x8,0xd27000
00c02d34	add x8,x8,#0x538
00c02d38	mov w9,#0x6
00c02d3c	strb w9,[x8], #0x1
00c02d40	b 0x00c02d58
00c02d44	adrp x9,0xd27000
00c02d48	add x9,x9,#0x540
00c02d4c	mov w10,#0x3
00c02d50	ldr x8,[x9, #0x8]
00c02d54	str x10,[x9]
00c02d58	mov w9,#0x6153
00c02d5c	movk w9,#0x74, LSL #16
00c02d60	str w9,[x8]
00c02d64	ldp x29,x30,[sp], #0x10
00c02d68	autiasp
00c02d6c	ret
00c02d70	adrp x0,0xd27000
00c02d74	add x0,x0,#0x550
00c02d78	bl 0x00c2fe90
00c02d7c	cbz w0,0x00c0298c
00c02d80	nop
00c02d84	adr x0,0xc0b878
00c02d88	nop
00c02d8c	adr x2,0xc48880
00c02d90	mov x1,xzr
00c02d94	bl 0x00c2fe70
00c02d98	adrp x0,0xd27000
00c02d9c	add x0,x0,#0x550
00c02da0	bl 0x00c2fea0
00c02da4	b 0x00c0298c
