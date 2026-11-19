; bn_mul_recursive @ 00a09a04
00a09a04	sub sp,sp,#0xa0
00a09a08	cmp w3,#0x0
00a09a0c	stp x28,x27,[sp, #0x40]
00a09a10	stp x26,x25,[sp, #0x50]
00a09a14	stp x24,x23,[sp, #0x60]
00a09a18	stp x22,x21,[sp, #0x70]
00a09a1c	stp x20,x19,[sp, #0x80]
00a09a20	mov w26,w5
00a09a24	mov w27,w4
00a09a28	mov w20,w3
00a09a2c	mov x22,x2
00a09a30	mov x23,x1
00a09a34	mov x19,x0
00a09a38	cinc w8,w3,lt
00a09a3c	cmp w3,#0x8
00a09a40	orr w21,w5,w4
00a09a44	stp x29,x30,[sp, #0x90]
00a09a48	add x29,sp,#0x90
00a09a4c	str x6,[sp, #0x38]
00a09a50	b.ne 0x00a09a84
00a09a54	cbnz w21,0x00a09a84
00a09a58	mov x0,x19
00a09a5c	mov x1,x23
00a09a60	mov x2,x22
00a09a64	ldp x29,x30,[sp, #0x90]
00a09a68	ldp x20,x19,[sp, #0x80]
00a09a6c	ldp x22,x21,[sp, #0x70]
00a09a70	ldp x24,x23,[sp, #0x60]
00a09a74	ldp x26,x25,[sp, #0x50]
00a09a78	ldp x28,x27,[sp, #0x40]
00a09a7c	add sp,sp,#0xa0
00a09a80	b 0x00c388f0
00a09a84	cmp w20,#0xf
00a09a88	b.gt 0x00a09ae0
00a09a8c	add w2,w27,w20
00a09a90	add w4,w26,w20
00a09a94	mov x0,x19
00a09a98	mov x1,x23
00a09a9c	mov x3,x22
00a09aa0	bl 0x00a09e78
00a09aa4	adds w8,w26,w27
00a09aa8	b.pl 0x00a09e58
00a09aac	add w9,w8,w20, LSL #0x1
00a09ab0	add x0,x19,w9, SXTW  #0x3
00a09ab4	ldp x29,x30,[sp, #0x90]
00a09ab8	ldp x20,x19,[sp, #0x80]
00a09abc	ldp x22,x21,[sp, #0x70]
00a09ac0	ldp x24,x23,[sp, #0x60]
00a09ac4	ldp x26,x25,[sp, #0x50]
00a09ac8	ldp x28,x27,[sp, #0x40]
00a09acc	neg w8,w8
00a09ad0	sbfiz x2,x8,#0x3,#0x20
00a09ad4	mov w1,wzr
00a09ad8	add sp,sp,#0xa0
00a09adc	b 0x00c301c0
00a09ae0	asr w9,w8,#0x1
00a09ae4	sbfiz x25,x9,#0x3,#0x20
00a09ae8	neg w24,w27
00a09aec	add w2,w9,w27
00a09af0	sxtw x8,w9
00a09af4	add x1,x23,x25
00a09af8	mov x0,x23
00a09afc	mov w3,w24
00a09b00	str x19,[sp, #0x10]
00a09b04	add w19,w9,w26
00a09b08	stp x9,x8,[sp, #0x18]
00a09b0c	str x1,[sp, #0x30]
00a09b10	str w2,[sp, #0x8]
00a09b14	bl 0x00c38e20
00a09b18	mov w28,w0
00a09b1c	add x0,x22,x25
00a09b20	mov x1,x22
00a09b24	mov w2,w19
00a09b28	mov w3,w26
00a09b2c	str x0,[sp, #0x28]
00a09b30	str w19,[sp, #0xc]
00a09b34	bl 0x00c38e20
00a09b38	add w8,w28,w28, LSL #0x1
00a09b3c	add w8,w8,w0
00a09b40	add w8,w8,#0x4
00a09b44	cmp w8,#0x8
00a09b48	b.hi 0x00a09b70
00a09b4c	adrp x9,0x751000
00a09b50	add x9,x9,#0xef0
00a09b54	ldrsw x8,[x9, x8, LSL #0x2]
00a09b58	add x8,x8,x9
00a09b5c	br x8
00a09b60	ldr x25,[sp, #0x20]
00a09b64	str wzr,[sp, #0xc]
00a09b68	mov w8,#0x1
00a09b6c	b 0x00a09c58
00a09b70	ldr x25,[sp, #0x20]
00a09b74	str wzr,[sp, #0xc]
00a09b78	mov w8,wzr
00a09b7c	b 0x00a09c58
00a09b80	ldp x1,x24,[sp, #0x30]
00a09b84	ldr w3,[sp, #0x8]
00a09b88	mov x2,x23
00a09b8c	mov w4,w27
00a09b90	mov x0,x24
00a09b94	bl 0x00a097e8
00a09b98	ldp x25,x2,[sp, #0x20]
00a09b9c	ldr w3,[sp, #0xc]
00a09ba0	neg w4,w26
00a09ba4	mov x1,x22
00a09ba8	add x0,x24,x25, LSL #0x3
00a09bac	b 0x00a09c4c
00a09bb0	ldp x1,x24,[sp, #0x30]
00a09bb4	ldr w3,[sp, #0x8]
00a09bb8	mov x2,x23
00a09bbc	mov w4,w27
00a09bc0	mov x0,x24
00a09bc4	bl 0x00a097e8
00a09bc8	ldp x25,x1,[sp, #0x20]
00a09bcc	ldr w3,[sp, #0xc]
00a09bd0	mov x2,x22
00a09bd4	mov w4,w26
00a09bd8	add x0,x24,x25, LSL #0x3
00a09bdc	b 0x00a09c0c
00a09be0	ldp x2,x28,[sp, #0x30]
00a09be4	ldr w3,[sp, #0x8]
00a09be8	mov x1,x23
00a09bec	mov w4,w24
00a09bf0	mov x0,x28
00a09bf4	bl 0x00a097e8
00a09bf8	ldp x25,x2,[sp, #0x20]
00a09bfc	ldr w3,[sp, #0xc]
00a09c00	neg w4,w26
00a09c04	mov x1,x22
00a09c08	add x0,x28,x25, LSL #0x3
00a09c0c	bl 0x00a097e8
00a09c10	mov w9,#0x1
00a09c14	mov w8,wzr
00a09c18	str w9,[sp, #0xc]
00a09c1c	b 0x00a09c58
00a09c20	ldp x2,x28,[sp, #0x30]
00a09c24	ldr w3,[sp, #0x8]
00a09c28	mov x1,x23
00a09c2c	mov w4,w24
00a09c30	mov x0,x28
00a09c34	bl 0x00a097e8
00a09c38	ldp x25,x1,[sp, #0x20]
00a09c3c	ldr w3,[sp, #0xc]
00a09c40	mov x2,x22
00a09c44	mov w4,w26
00a09c48	add x0,x28,x25, LSL #0x3
00a09c4c	bl 0x00a097e8
00a09c50	mov w8,wzr
00a09c54	str wzr,[sp, #0xc]
00a09c58	ldp x19,x28,[sp, #0x10]
00a09c5c	and w9,w20,#0xfffffffe
00a09c60	cmp w9,#0x8
00a09c64	b.ne 0x00a09c8c
00a09c68	cbnz w21,0x00a09c8c
00a09c6c	ldr x26,[sp, #0x38]
00a09c70	sxtw x21,w20
00a09c74	add x24,x26,w20, SXTW  #0x3
00a09c78	cbz w8,0x00a09ce4
00a09c7c	movi v0.2D,#0x0
00a09c80	stp q0,q0,[x24, #0x20]
00a09c84	stp q0,q0,[x24]
00a09c88	b 0x00a09cf4
00a09c8c	cmp w9,#0x10
00a09c90	b.ne 0x00a09cbc
00a09c94	cbnz w21,0x00a09cbc
00a09c98	ldr x26,[sp, #0x38]
00a09c9c	sxtw x21,w20
00a09ca0	add x24,x26,w20, SXTW  #0x3
00a09ca4	cbz w8,0x00a09d1c
00a09ca8	mov w2,#0x80
00a09cac	mov x0,x24
00a09cb0	mov w1,wzr
00a09cb4	bl 0x00c301c0
00a09cb8	b 0x00a09d2c
00a09cbc	ldr x1,[sp, #0x38]
00a09cc0	sxtw x21,w20
00a09cc4	add x25,x1,w20, SXTW  #0x4
00a09cc8	add x24,x1,w20, SXTW  #0x3
00a09ccc	cbz w8,0x00a09d54
00a09cd0	lsl x2,x21,#0x3
00a09cd4	mov x0,x24
00a09cd8	mov w1,wzr
00a09cdc	bl 0x00c301c0
00a09ce0	b 0x00a09d74
00a09ce4	add x2,x26,x25, LSL #0x3
00a09ce8	mov x0,x24
00a09cec	mov x1,x26
00a09cf0	bl 0x00c388e0
00a09cf4	ldr w27,[sp, #0xc]
00a09cf8	mov x0,x19
00a09cfc	mov x1,x23
00a09d00	mov x2,x22
00a09d04	bl 0x00c388e0
00a09d08	ldp x2,x1,[sp, #0x28]
00a09d0c	add x22,x19,x21, LSL #0x3
00a09d10	mov x0,x22
00a09d14	bl 0x00c388e0
00a09d18	b 0x00a09dc0
00a09d1c	add x2,x26,x25, LSL #0x3
00a09d20	mov x0,x24
00a09d24	mov x1,x26
00a09d28	bl 0x00c388f0
00a09d2c	ldr w27,[sp, #0xc]
00a09d30	mov x0,x19
00a09d34	mov x1,x23
00a09d38	mov x2,x22
00a09d3c	bl 0x00c388f0
00a09d40	ldp x2,x1,[sp, #0x28]
00a09d44	add x22,x19,x21, LSL #0x3
00a09d48	mov x0,x22
00a09d4c	bl 0x00c388f0
00a09d50	b 0x00a09dc0
00a09d54	ldr x8,[sp, #0x20]
00a09d58	mov x0,x24
00a09d5c	mov w3,w28
00a09d60	mov w4,wzr
00a09d64	add x2,x1,x8, LSL #0x3
00a09d68	mov w5,wzr
00a09d6c	mov x6,x25
00a09d70	bl 0x00a09a04
00a09d74	mov x0,x19
00a09d78	mov x1,x23
00a09d7c	mov x2,x22
00a09d80	mov w3,w28
00a09d84	mov w4,wzr
00a09d88	mov w5,wzr
00a09d8c	mov x6,x25
00a09d90	bl 0x00a09a04
00a09d94	ldp x2,x1,[sp, #0x28]
00a09d98	add x22,x19,x21, LSL #0x3
00a09d9c	mov x0,x22
00a09da0	mov w3,w28
00a09da4	mov w4,w27
00a09da8	mov w5,w26
00a09dac	mov x6,x25
00a09db0	bl 0x00a09a04
00a09db4	ldr x25,[sp, #0x20]
00a09db8	ldr x26,[sp, #0x38]
00a09dbc	ldr w27,[sp, #0xc]
00a09dc0	mov x0,x26
00a09dc4	mov x1,x19
00a09dc8	mov x2,x22
00a09dcc	mov w3,w20
00a09dd0	bl 0x00c388b0
00a09dd4	mov x22,x0
00a09dd8	mov x0,x24
00a09ddc	cbz w27,0x00a09df8
00a09de0	mov x1,x26
00a09de4	mov x2,x24
00a09de8	mov w3,w20
00a09dec	bl 0x00c38940
00a09df0	sub w21,w22,w0
00a09df4	b 0x00a09e0c
00a09df8	mov x1,x24
00a09dfc	mov x2,x26
00a09e00	mov w3,w20
00a09e04	bl 0x00c388b0
00a09e08	add w21,w0,w22
00a09e0c	add x0,x19,x25, LSL #0x3
00a09e10	mov x1,x0
00a09e14	mov x2,x24
00a09e18	mov w3,w20
00a09e1c	bl 0x00c388b0
00a09e20	adds w9,w21,w0
00a09e24	b.eq 0x00a09e58
00a09e28	add x8,x25,w20, SXTW 
00a09e2c	lsl x10,x8,#0x3
00a09e30	ldr x11,[x19, x10#0x0]
00a09e34	adds x9,x11,w9, SXTW 
00a09e38	str x9,[x19, x10#0x0]
00a09e3c	b.cc 0x00a09e58
00a09e40	add x8,x19,x8, LSL #0x3
00a09e44	add x8,x8,#0x8
00a09e48	ldr x9,[x8]
00a09e4c	adds x9,x9,#0x1
00a09e50	str x9,[x8], #0x8
00a09e54	b.eq 0x00a09e48
00a09e58	ldp x29,x30,[sp, #0x90]
00a09e5c	ldp x20,x19,[sp, #0x80]
00a09e60	ldp x22,x21,[sp, #0x70]
00a09e64	ldp x24,x23,[sp, #0x60]
00a09e68	ldp x26,x25,[sp, #0x50]
00a09e6c	ldp x28,x27,[sp, #0x40]
00a09e70	add sp,sp,#0xa0
00a09e74	ret
