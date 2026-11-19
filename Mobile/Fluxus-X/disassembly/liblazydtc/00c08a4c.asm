; FUN_00c08a4c @ 00c08a4c
00c08a4c	paciasp
00c08a50	stp x29,x30,[sp, #-0x40]!
00c08a54	str x23,[sp, #0x10]
00c08a58	stp x22,x21,[sp, #0x20]
00c08a5c	stp x20,x19,[sp, #0x30]
00c08a60	mov x29,sp
00c08a64	tbz w2,#0x0,0x00c08a88
00c08a68	ldrb w8,[x1]
00c08a6c	ldr x9,[x1, #0x8]
00c08a70	lsr x10,x8,#0x1
00c08a74	tst w8,#0x1
00c08a78	csel x8,x10,x9,eq
00c08a7c	cmp x8,#0x4
00c08a80	cset w19,eq
00c08a84	b 0x00c08a8c
00c08a88	mov w19,wzr
00c08a8c	and w8,w3,#0xff
00c08a90	cmp w8,#0x1
00c08a94	b.eq 0x00c08b38
00c08a98	cbnz w8,0x00c08d28
00c08a9c	cbz w19,0x00c08ae8
00c08aa0	ldrb w8,[x1]
00c08aa4	ldp x10,x9,[x1, #0x8]
00c08aa8	mov x20,x1
00c08aac	mov x21,x0
00c08ab0	mov w22,w4
00c08ab4	lsr x11,x8,#0x1
00c08ab8	tst w8,#0x1
00c08abc	mov w23,w5
00c08ac0	csinc x8,x9,x1,ne
00c08ac4	csel x9,x11,x10,eq
00c08ac8	add x1,x8,#0x3
00c08acc	mov x0,x8
00c08ad0	add x2,x8,x9
00c08ad4	bl 0x00c0bc14
00c08ad8	mov w5,w23
00c08adc	mov w4,w22
00c08ae0	mov x0,x21
00c08ae4	mov x1,x20
00c08ae8	and w8,w5,#0xff
00c08aec	cmp w8,#0x1
00c08af0	b.le 0x00c08b90
00c08af4	cmp w8,#0x2
00c08af8	b.eq 0x00c08c08
00c08afc	cmp w8,#0x3
00c08b00	b.eq 0x00c08c3c
00c08b04	cmp w8,#0x4
00c08b08	b.ne 0x00c08d28
00c08b0c	mov w9,#0x4
00c08b10	and w8,w4,#0xff
00c08b14	strb w9,[x0]
00c08b18	mov w9,#0x3
00c08b1c	cmp w8,#0x2
00c08b20	strb w9,[x0, #0x3]
00c08b24	b.eq 0x00c08d4c
00c08b28	cmp w8,#0x1
00c08b2c	b.ne 0x00c08c2c
00c08b30	mov w8,#0x200
00c08b34	b 0x00c08ddc
00c08b38	and w8,w5,#0xff
00c08b3c	cmp w8,#0x1
00c08b40	b.le 0x00c08bd0
00c08b44	cmp w8,#0x2
00c08b48	b.eq 0x00c08c70
00c08b4c	cmp w8,#0x3
00c08b50	b.eq 0x00c08ca4
00c08b54	cmp w8,#0x4
00c08b58	b.ne 0x00c08d28
00c08b5c	mov w9,#0x2
00c08b60	and w8,w4,#0xff
00c08b64	strb w9,[x0]
00c08b68	mov w9,#0x4
00c08b6c	cmp w8,#0x2
00c08b70	strb w9,[x0, #0x3]
00c08b74	b.eq 0x00c08e1c
00c08b78	cmp w8,#0x1
00c08b7c	b.eq 0x00c08d98
00c08b80	cbnz w8,0x00c08d28
00c08b84	mov w8,#0x3
00c08b88	sturh w8,[x0, #0x1]
00c08b8c	b 0x00c08d34
00c08b90	cbz w8,0x00c08cd8
00c08b94	cmp w8,#0x1
00c08b98	b.ne 0x00c08d28
00c08b9c	mov w9,#0x3
00c08ba0	and w8,w4,#0xff
00c08ba4	strb w9,[x0]
00c08ba8	mov w9,#0x2
00c08bac	cmp w8,#0x2
00c08bb0	strb w9,[x0, #0x3]
00c08bb4	b.eq 0x00c08e48
00c08bb8	cmp w8,#0x1
00c08bbc	b.eq 0x00c08dd8
00c08bc0	cbnz w8,0x00c08d28
00c08bc4	mov w8,#0x4
00c08bc8	sturh w8,[x0, #0x1]
00c08bcc	b 0x00c08d34
00c08bd0	cbz w8,0x00c08d04
00c08bd4	cmp w8,#0x1
00c08bd8	b.ne 0x00c08d28
00c08bdc	mov w9,#0x3
00c08be0	and w8,w4,#0xff
00c08be4	strb w9,[x0]
00c08be8	mov w9,#0x4
00c08bec	cmp w8,#0x2
00c08bf0	strb w9,[x0, #0x3]
00c08bf4	b.eq 0x00c08d54
00c08bf8	cmp w8,#0x1
00c08bfc	b.ne 0x00c08cc8
00c08c00	mov w8,#0x2
00c08c04	b 0x00c08e20
00c08c08	mov w9,#0x4
00c08c0c	and w8,w4,#0xff
00c08c10	strb w9,[x0]
00c08c14	mov w9,#0x3
00c08c18	cmp w8,#0x2
00c08c1c	strb w9,[x0, #0x3]
00c08c20	b.eq 0x00c08d4c
00c08c24	cmp w8,#0x1
00c08c28	b.eq 0x00c08d5c
00c08c2c	cbnz w8,0x00c08d28
00c08c30	mov w8,#0x200
00c08c34	sturh w8,[x0, #0x1]
00c08c38	b 0x00c08d34
00c08c3c	mov w9,#0x4
00c08c40	and w8,w4,#0xff
00c08c44	strb w9,[x0]
00c08c48	mov w9,#0x2
00c08c4c	cmp w8,#0x2
00c08c50	strb w9,[x0, #0x3]
00c08c54	b.eq 0x00c08d90
00c08c58	cmp w8,#0x1
00c08c5c	b.eq 0x00c08d80
00c08c60	cbnz w8,0x00c08d28
00c08c64	mov w8,#0x300
00c08c68	sturh w8,[x0, #0x1]
00c08c6c	b 0x00c08d34
00c08c70	mov w9,#0x2
00c08c74	and w8,w4,#0xff
00c08c78	strb w9,[x0]
00c08c7c	mov w9,#0x3
00c08c80	cmp w8,#0x2
00c08c84	strb w9,[x0, #0x3]
00c08c88	b.eq 0x00c08da0
00c08c8c	cmp w8,#0x1
00c08c90	b.eq 0x00c08d88
00c08c94	cbnz w8,0x00c08d28
00c08c98	mov w8,#0x400
00c08c9c	sturh w8,[x0, #0x1]
00c08ca0	b 0x00c08d34
00c08ca4	mov w9,#0x3
00c08ca8	and w8,w4,#0xff
00c08cac	strb w9,[x0]
00c08cb0	mov w9,#0x4
00c08cb4	cmp w8,#0x2
00c08cb8	strb w9,[x0, #0x3]
00c08cbc	b.eq 0x00c08d54
00c08cc0	cmp w8,#0x1
00c08cc4	b.eq 0x00c08c00
00c08cc8	cbnz w8,0x00c08d28
00c08ccc	mov w8,#0x2
00c08cd0	sturh w8,[x0, #0x1]
00c08cd4	b 0x00c08d34
00c08cd8	adrp x8,0x29b000
00c08cdc	ldr d0,[x8, #0xb98]
00c08ce0	ands w8,w4,#0xff
00c08ce4	str s0,[x0]
00c08ce8	b.eq 0x00c08d34
00c08cec	cmp w8,#0x2
00c08cf0	b.eq 0x00c08d34
00c08cf4	cmp w8,#0x1
00c08cf8	b.ne 0x00c08d28
00c08cfc	tbnz w19,#0x0,0x00c08d34
00c08d00	b 0x00c08de4
00c08d04	adrp x8,0x29a000
00c08d08	ldr d0,[x8, #0x798]
00c08d0c	ands w8,w4,#0xff
00c08d10	str s0,[x0]
00c08d14	b.eq 0x00c08d34
00c08d18	cmp w8,#0x2
00c08d1c	b.eq 0x00c08d34
00c08d20	cmp w8,#0x1
00c08d24	b.eq 0x00c08cfc
00c08d28	adrp x8,0x29a000
00c08d2c	ldr d0,[x8, #0xb80]
00c08d30	str s0,[x0]
00c08d34	ldp x20,x19,[sp, #0x30]
00c08d38	ldr x23,[sp, #0x10]
00c08d3c	ldp x22,x21,[sp, #0x20]
00c08d40	ldp x29,x30,[sp], #0x40
00c08d44	autiasp
00c08d48	ret
00c08d4c	mov w8,#0x102
00c08d50	b 0x00c08e4c
00c08d54	mov w8,#0x201
00c08d58	b 0x00c08da4
00c08d5c	tbnz w19,#0x0,0x00c08c30
00c08d60	mov x19,x0
00c08d64	mov x0,x1
00c08d68	mov x1,xzr
00c08d6c	mov w2,#0x1
00c08d70	mov w3,#0x20
00c08d74	bl 0x00c43d20
00c08d78	mov x0,x19
00c08d7c	b 0x00c08c30
00c08d80	mov w8,#0x301
00c08d84	b 0x00c08e4c
00c08d88	mov w8,#0x400
00c08d8c	b 0x00c08e20
00c08d90	mov w8,#0x3
00c08d94	b 0x00c08ddc
00c08d98	mov w8,#0x103
00c08d9c	b 0x00c08da4
00c08da0	mov w8,#0x104
00c08da4	sturh w8,[x0, #0x1]
00c08da8	cbz w19,0x00c08d34
00c08dac	ldrb w9,[x1]
00c08db0	ldr x8,[x1, #0x8]
00c08db4	lsr x10,x9,#0x1
00c08db8	tst w9,#0x1
00c08dbc	csel x8,x10,x8,eq
00c08dc0	sub x8,x8,#0x1
00c08dc4	tbnz w9,#0x0,0x00c08e0c
00c08dc8	lsl w9,w8,#0x1
00c08dcc	strb w9,[x1], #0x1
00c08dd0	mov x9,x1
00c08dd4	b 0x00c08e14
00c08dd8	mov w8,#0x4
00c08ddc	sturh w8,[x0, #0x1]
00c08de0	tbnz w19,#0x0,0x00c08d34
00c08de4	mov x0,x1
00c08de8	mov x1,xzr
00c08dec	mov w2,#0x1
00c08df0	mov w3,#0x20
00c08df4	ldp x20,x19,[sp, #0x30]
00c08df8	ldr x23,[sp, #0x10]
00c08dfc	ldp x22,x21,[sp, #0x20]
00c08e00	ldp x29,x30,[sp], #0x40
00c08e04	autiasp
00c08e08	b 0x00c43d20
00c08e0c	ldr x9,[x1, #0x10]
00c08e10	str x8,[x1, #0x8]
00c08e14	strb wzr,[x9, x8]
00c08e18	b 0x00c08d34
00c08e1c	mov w8,#0x300
00c08e20	sturh w8,[x0, #0x1]
00c08e24	tbnz w19,#0x0,0x00c08d34
00c08e28	mov x0,x1
00c08e2c	mov w1,#0x20
00c08e30	ldp x20,x19,[sp, #0x30]
00c08e34	ldr x23,[sp, #0x10]
00c08e38	ldp x22,x21,[sp, #0x20]
00c08e3c	ldp x29,x30,[sp], #0x40
00c08e40	autiasp
00c08e44	b 0x00c30150
00c08e48	mov w8,#0x401
00c08e4c	sturh w8,[x0, #0x1]
00c08e50	cbz w19,0x00c08d34
00c08e54	ldrb w8,[x1]
00c08e58	ldr x9,[x1, #0x10]
00c08e5c	mov x0,x1
00c08e60	tst w8,#0x1
00c08e64	csinc x8,x9,x1,ne
00c08e68	mov x1,x8
00c08e6c	ldp x20,x19,[sp, #0x30]
00c08e70	ldr x23,[sp, #0x10]
00c08e74	ldp x22,x21,[sp, #0x20]
00c08e78	ldp x29,x30,[sp], #0x40
00c08e7c	autiasp
00c08e80	b 0x00c0bbbc
