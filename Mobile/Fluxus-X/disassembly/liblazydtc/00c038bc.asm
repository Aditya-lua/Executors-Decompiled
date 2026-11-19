; FUN_00c038bc @ 00c038bc
00c038bc	paciasp
00c038c0	stp x29,x30,[sp, #-0x20]!
00c038c4	stp x20,x19,[sp, #0x10]
00c038c8	mov x29,sp
00c038cc	adrp x8,0xd27000
00c038d0	add x8,x8,#0xb38
00c038d4	ldarb w8,[x8]
00c038d8	tbz w8,#0x0,0x00c03dac
00c038dc	adrp x19,0xd27000
00c038e0	add x19,x19,#0x8f8
00c038e4	adrp x1,0x789000
00c038e8	add x1,x1,#0xea4
00c038ec	mov x0,x19
00c038f0	mov w2,#0x7
00c038f4	bl 0x00bc5e50
00c038f8	adrp x1,0x78a000
00c038fc	add x1,x1,#0x54
00c03900	add x0,x19,#0x18
00c03904	mov w2,#0x8
00c03908	bl 0x00bc5e50
00c0390c	adrp x1,0x78a000
00c03910	add x1,x1,#0x12c
00c03914	add x0,x19,#0x30
00c03918	mov w2,#0x5
00c0391c	bl 0x00bc5e50
00c03920	adrp x1,0x789000
00c03924	add x1,x1,#0xf20
00c03928	add x0,x19,#0x48
00c0392c	mov w2,#0x5
00c03930	bl 0x00bc5e50
00c03934	ldrb w8,[x19, #0x60]
00c03938	tbnz w8,#0x0,0x00c03950
00c0393c	adrp x8,0xd27000
00c03940	add x8,x8,#0x958
00c03944	mov w9,#0x6
00c03948	strb w9,[x8], #0x4
00c0394c	b 0x00c03964
00c03950	adrp x9,0xd27000
00c03954	add x9,x9,#0x960
00c03958	mov w10,#0x3
00c0395c	ldr x8,[x9, #0x8]
00c03960	str x10,[x9]
00c03964	mov x9,#0x4d
00c03968	mov w10,#0x79
00c0396c	movk x9,#0x61, LSL #32
00c03970	stp x9,x10,[x8]
00c03974	adrp x8,0xd27000
00c03978	ldrb w8,[x8, #0x970]
00c0397c	tbnz w8,#0x0,0x00c03994
00c03980	adrp x8,0xd27000
00c03984	add x8,x8,#0x970
00c03988	mov w9,#0x8
00c0398c	strb w9,[x8], #0x4
00c03990	b 0x00c039a8
00c03994	adrp x9,0xd27000
00c03998	add x9,x9,#0x978
00c0399c	mov w10,#0x4
00c039a0	ldr x8,[x9, #0x8]
00c039a4	str x10,[x9]
00c039a8	adrp x9,0x78a000
00c039ac	add x9,x9,#0x144
00c039b0	str wzr,[x8, #0x10]
00c039b4	ldr q0,[x9]
00c039b8	str q0,[x8]
00c039bc	adrp x8,0xd27000
00c039c0	ldrb w8,[x8, #0x988]
00c039c4	tbnz w8,#0x0,0x00c039dc
00c039c8	adrp x8,0xd27000
00c039cc	add x8,x8,#0x988
00c039d0	mov w9,#0x8
00c039d4	strb w9,[x8], #0x4
00c039d8	b 0x00c039f0
00c039dc	adrp x9,0xd27000
00c039e0	add x9,x9,#0x990
00c039e4	mov w10,#0x4
00c039e8	ldr x8,[x9, #0x8]
00c039ec	str x10,[x9]
00c039f0	adrp x9,0x789000
00c039f4	add x9,x9,#0xe90
00c039f8	adrp x19,0xd27000
00c039fc	add x19,x19,#0x9a0
00c03a00	ldr q0,[x9]
00c03a04	adrp x1,0x789000
00c03a08	add x1,x1,#0xe38
00c03a0c	mov x0,x19
00c03a10	mov w2,#0x6
00c03a14	str q0,[x8]
00c03a18	mov w20,#0x6
00c03a1c	str wzr,[x8, #0x10]
00c03a20	bl 0x00bc5e50
00c03a24	adrp x1,0x789000
00c03a28	add x1,x1,#0xed4
00c03a2c	add x0,x19,#0x18
00c03a30	mov w2,#0x9
00c03a34	bl 0x00bc5e50
00c03a38	adrp x1,0x78a000
00c03a3c	add x1,x1,#0x78
00c03a40	add x0,x19,#0x30
00c03a44	mov w2,#0x7
00c03a48	bl 0x00bc5e50
00c03a4c	adrp x1,0x789000
00c03a50	add x1,x1,#0xf78
00c03a54	add x0,x19,#0x48
00c03a58	mov w2,#0x8
00c03a5c	bl 0x00bc5e50
00c03a60	adrp x1,0x789000
00c03a64	add x1,x1,#0xefc
00c03a68	add x0,x19,#0x60
00c03a6c	mov w2,#0x8
00c03a70	bl 0x00bc5e50
00c03a74	ldrb w8,[x19, #0x78]
00c03a78	tbnz w8,#0x0,0x00c03a8c
00c03a7c	adrp x8,0xd27000
00c03a80	add x8,x8,#0xa18
00c03a84	strb w20,[x8], #0x4
00c03a88	b 0x00c03aa0
00c03a8c	adrp x9,0xd27000
00c03a90	add x9,x9,#0xa20
00c03a94	mov w10,#0x3
00c03a98	ldr x8,[x9, #0x8]
00c03a9c	str x10,[x9]
00c03aa0	mov x9,#0x4a
00c03aa4	mov w10,#0x6e
00c03aa8	movk x9,#0x61, LSL #32
00c03aac	stp x9,x10,[x8]
00c03ab0	adrp x8,0xd27000
00c03ab4	ldrb w8,[x8, #0xa30]
00c03ab8	tbnz w8,#0x0,0x00c03ad0
00c03abc	adrp x8,0xd27000
00c03ac0	add x8,x8,#0xa30
00c03ac4	mov w9,#0x6
00c03ac8	strb w9,[x8], #0x4
00c03acc	b 0x00c03ae4
00c03ad0	adrp x9,0xd27000
00c03ad4	add x9,x9,#0xa38
00c03ad8	mov w10,#0x3
00c03adc	ldr x8,[x9, #0x8]
00c03ae0	str x10,[x9]
00c03ae4	mov x9,#0x46
00c03ae8	mov w10,#0x62
00c03aec	movk x9,#0x65, LSL #32
00c03af0	stp x9,x10,[x8]
00c03af4	adrp x8,0xd27000
00c03af8	ldrb w8,[x8, #0xa48]
00c03afc	tbnz w8,#0x0,0x00c03b14
00c03b00	adrp x8,0xd27000
00c03b04	add x8,x8,#0xa48
00c03b08	mov w9,#0x6
00c03b0c	strb w9,[x8], #0x4
00c03b10	b 0x00c03b28
00c03b14	adrp x9,0xd27000
00c03b18	add x9,x9,#0xa50
00c03b1c	mov w10,#0x3
00c03b20	ldr x8,[x9, #0x8]
00c03b24	str x10,[x9]
00c03b28	mov x9,#0x4d
00c03b2c	mov w10,#0x72
00c03b30	movk x9,#0x61, LSL #32
00c03b34	stp x9,x10,[x8]
00c03b38	adrp x8,0xd27000
00c03b3c	ldrb w8,[x8, #0xa60]
00c03b40	tbnz w8,#0x0,0x00c03b58
00c03b44	adrp x8,0xd27000
00c03b48	add x8,x8,#0xa60
00c03b4c	mov w9,#0x6
00c03b50	strb w9,[x8], #0x4
00c03b54	b 0x00c03b6c
00c03b58	adrp x9,0xd27000
00c03b5c	add x9,x9,#0xa68
00c03b60	mov w10,#0x3
00c03b64	ldr x8,[x9, #0x8]
00c03b68	str x10,[x9]
00c03b6c	mov x9,#0x41
00c03b70	mov w10,#0x72
00c03b74	movk x9,#0x70, LSL #32
00c03b78	stp x9,x10,[x8]
00c03b7c	adrp x8,0xd27000
00c03b80	ldrb w8,[x8, #0xa78]
00c03b84	tbnz w8,#0x0,0x00c03b9c
00c03b88	adrp x8,0xd27000
00c03b8c	add x8,x8,#0xa78
00c03b90	mov w9,#0x6
00c03b94	strb w9,[x8], #0x4
00c03b98	b 0x00c03bb0
00c03b9c	adrp x9,0xd27000
00c03ba0	add x9,x9,#0xa80
00c03ba4	mov w10,#0x3
00c03ba8	ldr x8,[x9, #0x8]
00c03bac	str x10,[x9]
00c03bb0	mov x9,#0x4d
00c03bb4	mov w10,#0x79
00c03bb8	movk x9,#0x61, LSL #32
00c03bbc	stp x9,x10,[x8]
00c03bc0	adrp x8,0xd27000
00c03bc4	ldrb w8,[x8, #0xa90]
00c03bc8	tbnz w8,#0x0,0x00c03be0
00c03bcc	adrp x8,0xd27000
00c03bd0	add x8,x8,#0xa90
00c03bd4	mov w9,#0x6
00c03bd8	strb w9,[x8], #0x4
00c03bdc	b 0x00c03bf4
00c03be0	adrp x9,0xd27000
00c03be4	add x9,x9,#0xa98
00c03be8	mov w10,#0x3
00c03bec	ldr x8,[x9, #0x8]
00c03bf0	str x10,[x9]
00c03bf4	mov x9,#0x4a
00c03bf8	mov w10,#0x6e
00c03bfc	movk x9,#0x75, LSL #32
00c03c00	stp x9,x10,[x8]
00c03c04	adrp x8,0xd27000
00c03c08	ldrb w8,[x8, #0xaa8]
00c03c0c	tbnz w8,#0x0,0x00c03c24
00c03c10	adrp x8,0xd27000
00c03c14	add x8,x8,#0xaa8
00c03c18	mov w9,#0x6
00c03c1c	strb w9,[x8], #0x4
00c03c20	b 0x00c03c38
00c03c24	adrp x9,0xd27000
00c03c28	add x9,x9,#0xab0
00c03c2c	mov w10,#0x3
00c03c30	ldr x8,[x9, #0x8]
00c03c34	str x10,[x9]
00c03c38	mov x9,#0x4a
00c03c3c	mov w10,#0x6c
00c03c40	movk x9,#0x75, LSL #32
00c03c44	stp x9,x10,[x8]
00c03c48	adrp x8,0xd27000
00c03c4c	ldrb w8,[x8, #0xac0]
00c03c50	tbnz w8,#0x0,0x00c03c68
00c03c54	adrp x8,0xd27000
00c03c58	add x8,x8,#0xac0
00c03c5c	mov w9,#0x6
00c03c60	strb w9,[x8], #0x4
00c03c64	b 0x00c03c7c
00c03c68	adrp x9,0xd27000
00c03c6c	add x9,x9,#0xac8
00c03c70	mov w10,#0x3
00c03c74	ldr x8,[x9, #0x8]
00c03c78	str x10,[x9]
00c03c7c	mov x9,#0x41
00c03c80	mov w10,#0x67
00c03c84	movk x9,#0x75, LSL #32
00c03c88	stp x9,x10,[x8]
00c03c8c	adrp x8,0xd27000
00c03c90	ldrb w8,[x8, #0xad8]
00c03c94	tbnz w8,#0x0,0x00c03cac
00c03c98	adrp x8,0xd27000
00c03c9c	add x8,x8,#0xad8
00c03ca0	mov w9,#0x6
00c03ca4	strb w9,[x8], #0x4
00c03ca8	b 0x00c03cc0
00c03cac	adrp x9,0xd27000
00c03cb0	add x9,x9,#0xae0
00c03cb4	mov w10,#0x3
00c03cb8	ldr x8,[x9, #0x8]
00c03cbc	str x10,[x9]
00c03cc0	mov x9,#0x53
00c03cc4	mov w10,#0x70
00c03cc8	movk x9,#0x65, LSL #32
00c03ccc	stp x9,x10,[x8]
00c03cd0	adrp x8,0xd27000
00c03cd4	ldrb w8,[x8, #0xaf0]
00c03cd8	tbnz w8,#0x0,0x00c03cf0
00c03cdc	adrp x8,0xd27000
00c03ce0	add x8,x8,#0xaf0
00c03ce4	mov w9,#0x6
00c03ce8	strb w9,[x8], #0x4
00c03cec	b 0x00c03d04
00c03cf0	adrp x9,0xd27000
00c03cf4	add x9,x9,#0xaf8
00c03cf8	mov w10,#0x3
00c03cfc	ldr x8,[x9, #0x8]
00c03d00	str x10,[x9]
00c03d04	mov x9,#0x4f
00c03d08	mov w10,#0x74
00c03d0c	movk x9,#0x63, LSL #32
00c03d10	stp x9,x10,[x8]
00c03d14	adrp x8,0xd27000
00c03d18	ldrb w8,[x8, #0xb08]
00c03d1c	tbnz w8,#0x0,0x00c03d34
00c03d20	adrp x8,0xd27000
00c03d24	add x8,x8,#0xb08
00c03d28	mov w9,#0x6
00c03d2c	strb w9,[x8], #0x4
00c03d30	b 0x00c03d48
00c03d34	adrp x9,0xd27000
00c03d38	add x9,x9,#0xb10
00c03d3c	mov w10,#0x3
00c03d40	ldr x8,[x9, #0x8]
00c03d44	str x10,[x9]
00c03d48	mov x9,#0x4e
00c03d4c	mov w10,#0x76
00c03d50	movk x9,#0x6f, LSL #32
00c03d54	stp x9,x10,[x8]
00c03d58	adrp x8,0xd27000
00c03d5c	ldrb w8,[x8, #0xb20]
00c03d60	tbnz w8,#0x0,0x00c03d78
00c03d64	adrp x8,0xd27000
00c03d68	add x8,x8,#0xb20
00c03d6c	mov w9,#0x6
00c03d70	strb w9,[x8], #0x4
00c03d74	b 0x00c03d8c
00c03d78	adrp x9,0xd27000
00c03d7c	add x9,x9,#0xb28
00c03d80	mov w10,#0x3
00c03d84	ldr x8,[x9, #0x8]
00c03d88	str x10,[x9]
00c03d8c	mov x9,#0x44
00c03d90	mov w10,#0x63
00c03d94	movk x9,#0x65, LSL #32
00c03d98	stp x9,x10,[x8]
00c03d9c	ldp x20,x19,[sp, #0x10]
00c03da0	ldp x29,x30,[sp], #0x20
00c03da4	autiasp
00c03da8	ret
00c03dac	adrp x0,0xd27000
00c03db0	add x0,x0,#0xb38
00c03db4	bl 0x00c2fe90
00c03db8	cbz w0,0x00c038dc
00c03dbc	adrp x0,0xc0b000
00c03dc0	add x0,x0,#0x984
00c03dc4	nop
00c03dc8	adr x2,0xc48880
00c03dcc	mov x1,xzr
00c03dd0	bl 0x00c2fe70
00c03dd4	adrp x0,0xd27000
00c03dd8	add x0,x0,#0xb38
00c03ddc	bl 0x00c2fea0
00c03de0	b 0x00c038dc
