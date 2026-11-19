; FUN_00b00934 @ 00b00934
00b00934	stp x28,x25,[sp, #-0x50]!
00b00938	stp x24,x23,[sp, #0x10]
00b0093c	stp x22,x21,[sp, #0x20]
00b00940	stp x20,x19,[sp, #0x30]
00b00944	stp x29,x30,[sp, #0x40]
00b00948	add x29,sp,#0x40
00b0094c	sub sp,sp,#0x810
00b00950	ldr x22,[x0, #0x8]
00b00954	mov x23,x1
00b00958	adrp x1,0x2b6000
00b0095c	mov x20,x0
00b00960	add x1,x1,#0x578
00b00964	mov x0,x22
00b00968	mov x19,x3
00b0096c	mov x21,x2
00b00970	bl 0x00c301f0
00b00974	cbz w0,0x00b009b0
00b00978	adrp x1,0x2c2000
00b0097c	add x1,x1,#0x4f1
00b00980	mov x0,x22
00b00984	bl 0x00c301f0
00b00988	cbz w0,0x00b009e0
00b0098c	adrp x1,0x2d6000
00b00990	add x1,x1,#0x6cc
00b00994	mov x0,x22
00b00998	bl 0x00c301f0
00b0099c	cbnz w0,0x00b00e84
00b009a0	ldr x21,[x19]
00b009a4	cbz x21,0x00b00a84
00b009a8	mov w25,wzr
00b009ac	b 0x00b00a98
00b009b0	ldr x8,[x23]
00b009b4	cbz x8,0x00b00a10
00b009b8	bl 0x00c342a0
00b009bc	adrp x0,0x2d8000
00b009c0	adrp x2,0x2c0000
00b009c4	add x0,x0,#0x8f8
00b009c8	add x2,x2,#0x663
00b009cc	mov w1,#0x5d
00b009d0	bl 0x00c342b0
00b009d4	mov w0,#0x22
00b009d8	mov w1,#0x9b
00b009dc	b 0x00b00bf4
00b009e0	ldr x8,[x21]
00b009e4	cbz x8,0x00b00a4c
00b009e8	bl 0x00c342a0
00b009ec	adrp x0,0x2d8000
00b009f0	adrp x2,0x2c0000
00b009f4	add x0,x0,#0x8f8
00b009f8	add x2,x2,#0x663
00b009fc	mov w1,#0x69
00b00a00	bl 0x00c342b0
00b00a04	mov w0,#0x22
00b00a08	mov w1,#0x9d
00b00a0c	b 0x00b00bf4
00b00a10	ldr x0,[x20, #0x10]
00b00a14	mov w1,wzr
00b00a18	bl 0x00c39690
00b00a1c	str x0,[x23]
00b00a20	cbnz x0,0x00b00e84
00b00a24	bl 0x00c342a0
00b00a28	adrp x0,0x2d8000
00b00a2c	adrp x2,0x2c0000
00b00a30	add x0,x0,#0x8f8
00b00a34	add x2,x2,#0x663
00b00a38	mov w1,#0x62
00b00a3c	bl 0x00c342b0
00b00a40	mov w0,#0x22
00b00a44	mov w1,#0x6e
00b00a48	b 0x00b00bf4
00b00a4c	mov x0,x20
00b00a50	mov x1,x21
00b00a54	bl 0x00c408f0
00b00a58	cbnz w0,0x00b00e84
00b00a5c	bl 0x00c342a0
00b00a60	adrp x0,0x2d8000
00b00a64	adrp x2,0x2c0000
00b00a68	add x0,x0,#0x8f8
00b00a6c	add x2,x2,#0x663
00b00a70	mov w1,#0x6e
00b00a74	bl 0x00c342b0
00b00a78	mov w0,#0x22
00b00a7c	mov w1,#0x9c
00b00a80	b 0x00b00bf4
00b00a84	bl 0x00c38170
00b00a88	str x0,[x19]
00b00a8c	cbz x0,0x00b00bcc
00b00a90	mov x21,x0
00b00a94	mov w25,#0x1
00b00a98	ldr x22,[x20, #0x10]
00b00a9c	adrp x1,0x2ac000
00b00aa0	add x1,x1,#0x87d
00b00aa4	mov w2,#0x4
00b00aa8	mov x0,x22
00b00aac	bl 0x00c31bb0
00b00ab0	cbz w0,0x00b00b0c
00b00ab4	adrp x1,0x2b2000
00b00ab8	add x1,x1,#0xcce
00b00abc	mov w2,#0x5
00b00ac0	mov x0,x22
00b00ac4	bl 0x00c31bb0
00b00ac8	cbz w0,0x00b00ba4
00b00acc	adrp x1,0x2d0000
00b00ad0	add x1,x1,#0x4cc
00b00ad4	mov w2,#0x5
00b00ad8	mov x0,x22
00b00adc	bl 0x00c31bb0
00b00ae0	cbz w0,0x00b00c2c
00b00ae4	bl 0x00c342a0
00b00ae8	adrp x0,0x2d8000
00b00aec	adrp x2,0x2c0000
00b00af0	add x0,x0,#0x8f8
00b00af4	add x2,x2,#0x663
00b00af8	mov w1,#0xdc
00b00afc	bl 0x00c342b0
00b00b00	mov w0,#0x22
00b00b04	mov w1,#0x98
00b00b08	b 0x00b00f0c
00b00b0c	add x0,x22,#0x4
00b00b10	sub x1,x29,#0x48
00b00b14	bl 0x00c396a0
00b00b18	cbz x0,0x00b00f14
00b00b1c	ldr x8,[x19]
00b00b20	ldur x10,[x29, #-0x48]
00b00b24	mov x21,x0
00b00b28	adrp x2,0x2d8000
00b00b2c	ldrsw x9,[x8]
00b00b30	ldr x0,[x8, #0x8]
00b00b34	add x2,x2,#0x8f8
00b00b38	mov w3,#0x89
00b00b3c	add x8,x9,x10
00b00b40	add x1,x8,#0x1
00b00b44	bl 0x00c356f0
00b00b48	cbz x0,0x00b00ca8
00b00b4c	ldr x8,[x19]
00b00b50	mov x1,x21
00b00b54	str x0,[x8, #0x8]
00b00b58	ldr x8,[x19]
00b00b5c	ldur x2,[x29, #-0x48]
00b00b60	ldr x9,[x8, #0x8]
00b00b64	ldrsw x8,[x8]
00b00b68	add x0,x9,x8
00b00b6c	bl 0x00c2ffd0
00b00b70	ldr x8,[x19]
00b00b74	ldur w9,[x29, #-0x48]
00b00b78	adrp x1,0x2d8000
00b00b7c	add x1,x1,#0x8f8
00b00b80	ldr w10,[x8]
00b00b84	ldr x11,[x8, #0x8]
00b00b88	mov w2,#0x9d
00b00b8c	mov x0,x21
00b00b90	add w9,w10,w9
00b00b94	str w9,[x8]
00b00b98	strb wzr,[x11, w9, SXTW ]
00b00b9c	bl 0x00c32310
00b00ba0	b 0x00b00e84
00b00ba4	adrp x1,0x2c8000
00b00ba8	add x0,x22,#0x5
00b00bac	add x1,x1,#0xcc8
00b00bb0	bl 0x00c387e0
00b00bb4	cbz x0,0x00b00cfc
00b00bb8	adrp x22,0x2d8000
00b00bbc	mov x21,x0
00b00bc0	mov x23,xzr
00b00bc4	add x22,x22,#0x8f8
00b00bc8	b 0x00b00d58
00b00bcc	bl 0x00c342a0
00b00bd0	adrp x0,0x2d8000
00b00bd4	adrp x2,0x2c0000
00b00bd8	add x0,x0,#0x8f8
00b00bdc	add x2,x2,#0x663
00b00be0	mov w1,#0x79
00b00be4	bl 0x00c342b0
00b00be8	mov w1,#0x100
00b00bec	mov w0,#0x22
00b00bf0	movk w1,#0xc, LSL #16
00b00bf4	mov x2,xzr
00b00bf8	bl 0x00c342c0
00b00bfc	ldp x2,x4,[x20]
00b00c00	ldr x6,[x20, #0x10]
00b00c04	adrp x1,0x2da000
00b00c08	adrp x3,0x2c0000
00b00c0c	adrp x5,0x2b8000
00b00c10	add x1,x1,#0x6a2
00b00c14	add x3,x3,#0x62e
00b00c18	add x5,x5,#0x723
00b00c1c	orr w0,wzr,#0x6
00b00c20	bl 0x00c37fb0
00b00c24	mov w0,wzr
00b00c28	b 0x00b00e88
00b00c2c	add x0,x22,#0x5
00b00c30	bl 0x00c2ff50
00b00c34	stur x0,[x29, #-0x48]
00b00c38	ldrsw x8,[x21]
00b00c3c	mov x22,x0
00b00c40	ldr x0,[x21, #0x8]
00b00c44	adrp x2,0x2d8000
00b00c48	add x8,x22,x8
00b00c4c	add x1,x8,#0x1
00b00c50	add x2,x2,#0x8f8
00b00c54	mov w3,#0xc8
00b00c58	bl 0x00c356f0
00b00c5c	ldr x8,[x19]
00b00c60	cbz x0,0x00b00ea4
00b00c64	str x0,[x8, #0x8]
00b00c68	ldr x8,[x19]
00b00c6c	ldr x10,[x20, #0x10]
00b00c70	mov x2,x22
00b00c74	ldr x9,[x8, #0x8]
00b00c78	ldrsw x8,[x8]
00b00c7c	add x1,x10,#0x5
00b00c80	add x0,x9,x8
00b00c84	bl 0x00c2ffd0
00b00c88	ldr x8,[x19]
00b00c8c	mov w0,#0x1
00b00c90	ldr w9,[x8]
00b00c94	ldr x10,[x8, #0x8]
00b00c98	add w9,w9,w22
00b00c9c	str w9,[x8]
00b00ca0	strb wzr,[x10, w9, SXTW ]
00b00ca4	b 0x00b00e88
00b00ca8	adrp x22,0x2d8000
00b00cac	add x22,x22,#0x8f8
00b00cb0	mov w2,#0x91
00b00cb4	mov x0,x21
00b00cb8	mov x1,x22
00b00cbc	bl 0x00c32310
00b00cc0	ldr x8,[x19]
00b00cc4	mov w2,#0x96
00b00cc8	mov x1,x22
00b00ccc	ldr x0,[x8, #0x8]
00b00cd0	bl 0x00c32310
00b00cd4	ldr x8,[x19]
00b00cd8	str xzr,[x8, #0x8]
00b00cdc	ldr x8,[x19]
00b00ce0	str wzr,[x8]
00b00ce4	bl 0x00c342a0
00b00ce8	adrp x2,0x2c0000
00b00cec	add x2,x2,#0x663
00b00cf0	mov w1,#0x99
00b00cf4	mov x0,x22
00b00cf8	b 0x00b00efc
00b00cfc	bl 0x00c342a0
00b00d00	adrp x0,0x2d8000
00b00d04	adrp x2,0x2c0000
00b00d08	add x0,x0,#0x8f8
00b00d0c	add x2,x2,#0x663
00b00d10	mov w1,#0xa3
00b00d14	b 0x00b00e64
00b00d18	str x0,[x8, #0x8]
00b00d1c	ldr x8,[x19]
00b00d20	sxtw x24,w24
00b00d24	mov x23,x0
00b00d28	add x1,sp,#0x8
00b00d2c	ldr x9,[x8, #0x8]
00b00d30	ldrsw x8,[x8]
00b00d34	mov x2,x24
00b00d38	add x0,x9,x8
00b00d3c	bl 0x00c2ffd0
00b00d40	ldr x8,[x19]
00b00d44	ldrsw x9,[x8]
00b00d48	ldr x10,[x8, #0x8]
00b00d4c	add x9,x9,x24
00b00d50	str w9,[x8]
00b00d54	strb wzr,[x10, x9]
00b00d58	add x1,sp,#0x8
00b00d5c	mov w2,#0x800
00b00d60	mov x0,x21
00b00d64	bl 0x00c34220
00b00d68	mov w24,w0
00b00d6c	cmp w0,#0x0
00b00d70	b.gt 0x00b00d8c
00b00d74	cbnz w24,0x00b00e44
00b00d78	mov w1,#0x8
00b00d7c	mov x0,x21
00b00d80	bl 0x00c34230
00b00d84	cbnz w0,0x00b00d58
00b00d88	b 0x00b00e78
00b00d8c	ldr x8,[x19]
00b00d90	mov w3,#0xad
00b00d94	mov x2,x22
00b00d98	ldr w9,[x8]
00b00d9c	ldr x0,[x8, #0x8]
00b00da0	add w8,w24,w9
00b00da4	add w8,w8,#0x1
00b00da8	sxtw x1,w8
00b00dac	bl 0x00c356f0
00b00db0	ldr x8,[x19]
00b00db4	cbnz x0,0x00b00d18
00b00db8	ldr x0,[x8, #0x8]
00b00dbc	adrp x22,0x2d8000
00b00dc0	add x22,x22,#0x8f8
00b00dc4	mov w2,#0xb0
00b00dc8	mov x1,x22
00b00dcc	bl 0x00c32310
00b00dd0	ldr x8,[x19]
00b00dd4	str xzr,[x8, #0x8]
00b00dd8	ldr x8,[x19]
00b00ddc	str wzr,[x8]
00b00de0	bl 0x00c342a0
00b00de4	adrp x2,0x2c0000
00b00de8	add x2,x2,#0x663
00b00dec	mov w1,#0xb3
00b00df0	mov x0,x22
00b00df4	bl 0x00c342b0
00b00df8	mov w1,#0x100
00b00dfc	mov w0,#0x22
00b00e00	movk w1,#0xc, LSL #16
00b00e04	mov x2,xzr
00b00e08	bl 0x00c342c0
00b00e0c	ldp x2,x4,[x20]
00b00e10	ldr x6,[x20, #0x10]
00b00e14	adrp x1,0x2da000
00b00e18	adrp x3,0x2c0000
00b00e1c	adrp x5,0x2b8000
00b00e20	add x1,x1,#0x6a2
00b00e24	add x3,x3,#0x62e
00b00e28	add x5,x5,#0x723
00b00e2c	orr w0,wzr,#0x6
00b00e30	bl 0x00c37fb0
00b00e34	mov x0,x21
00b00e38	bl 0x00c355e0
00b00e3c	cbnz w25,0x00b00f40
00b00e40	b 0x00b00c24
00b00e44	mov x0,x21
00b00e48	bl 0x00c355e0
00b00e4c	bl 0x00c342a0
00b00e50	adrp x0,0x2d8000
00b00e54	adrp x2,0x2c0000
00b00e58	add x0,x0,#0x8f8
00b00e5c	add x2,x2,#0x663
00b00e60	mov w1,#0xc1
00b00e64	bl 0x00c342b0
00b00e68	mov w1,#0x20
00b00e6c	mov w0,#0x22
00b00e70	movk w1,#0x8, LSL #16
00b00e74	b 0x00b00f0c
00b00e78	mov x0,x21
00b00e7c	bl 0x00c355e0
00b00e80	cbz x23,0x00b00ee4
00b00e84	mov w0,#0x1
00b00e88	add sp,sp,#0x810
00b00e8c	ldp x29,x30,[sp, #0x40]
00b00e90	ldp x20,x19,[sp, #0x30]
00b00e94	ldp x22,x21,[sp, #0x20]
00b00e98	ldp x24,x23,[sp, #0x10]
00b00e9c	ldp x28,x25,[sp], #0x50
00b00ea0	ret
00b00ea4	ldr x0,[x8, #0x8]
00b00ea8	adrp x21,0x2d8000
00b00eac	add x21,x21,#0x8f8
00b00eb0	mov w2,#0xd4
00b00eb4	mov x1,x21
00b00eb8	bl 0x00c32310
00b00ebc	ldr x8,[x19]
00b00ec0	str xzr,[x8, #0x8]
00b00ec4	ldr x8,[x19]
00b00ec8	str wzr,[x8]
00b00ecc	bl 0x00c342a0
00b00ed0	adrp x2,0x2c0000
00b00ed4	add x2,x2,#0x663
00b00ed8	mov w1,#0xd7
00b00edc	mov x0,x21
00b00ee0	b 0x00b00efc
00b00ee4	bl 0x00c342a0
00b00ee8	adrp x0,0x2d8000
00b00eec	adrp x2,0x2c0000
00b00ef0	add x0,x0,#0x8f8
00b00ef4	add x2,x2,#0x663
00b00ef8	mov w1,#0xe1
00b00efc	bl 0x00c342b0
00b00f00	mov w1,#0x100
00b00f04	mov w0,#0x22
00b00f08	movk w1,#0xc, LSL #16
00b00f0c	mov x2,xzr
00b00f10	bl 0x00c342c0
00b00f14	ldp x2,x4,[x20]
00b00f18	ldr x6,[x20, #0x10]
00b00f1c	adrp x1,0x2da000
00b00f20	adrp x3,0x2c0000
00b00f24	adrp x5,0x2b8000
00b00f28	add x1,x1,#0x6a2
00b00f2c	add x3,x3,#0x62e
00b00f30	add x5,x5,#0x723
00b00f34	orr w0,wzr,#0x6
00b00f38	bl 0x00c37fb0
00b00f3c	cbz w25,0x00b00c24
00b00f40	ldr x0,[x19]
00b00f44	bl 0x00c35530
00b00f48	mov w0,wzr
00b00f4c	str xzr,[x19]
00b00f50	b 0x00b00e88
