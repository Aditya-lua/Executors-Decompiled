; dtls1_read_bytes @ 009c9858
009c9858	sub sp,sp,#0xf0
009c985c	stp x28,x27,[sp, #0x90]
009c9860	stp x26,x25,[sp, #0xa0]
009c9864	stp x24,x23,[sp, #0xb0]
009c9868	stp x22,x21,[sp, #0xc0]
009c986c	stp x20,x19,[sp, #0xd0]
009c9870	stp x29,x30,[sp, #0xe0]
009c9874	ldr x8,[x0, #0xc78]
009c9878	mov x20,x6
009c987c	mov w21,w5
009c9880	mov x23,x4
009c9884	mov x22,x3
009c9888	mov x24,x2
009c988c	mov x19,x0
009c9890	mov w25,w1
009c9894	add x29,sp,#0xe0
009c9898	cbnz x8,0x009c98a8
009c989c	mov x0,x19
009c98a0	bl 0x00c344a0
009c98a4	cbz w0,0x009c9908
009c98a8	cmp w25,#0x17
009c98ac	b.hi 0x009c98d4
009c98b0	mov w8,#0x1
009c98b4	mov w9,#0x1
009c98b8	lsl w8,w8,w25
009c98bc	movk w9,#0xc0, LSL #16
009c98c0	tst w8,w9
009c98c4	b.eq 0x009c98d4
009c98c8	cmp w25,#0x17
009c98cc	b.eq 0x009c992c
009c98d0	cbz w21,0x009c992c
009c98d4	bl 0x00c342a0
009c98d8	adrp x0,0x2a3000
009c98dc	adrp x2,0x2cb000
009c98e0	add x0,x0,#0xcf1
009c98e4	add x2,x2,#0x5b6
009c98e8	mov w1,#0x16a
009c98ec	bl 0x00c342b0
009c98f0	mov w2,#0x103
009c98f4	mov w1,#0x50
009c98f8	movk w2,#0xc, LSL #16
009c98fc	mov x0,x19
009c9900	mov x3,xzr
009c9904	bl 0x00c34410
009c9908	mov w0,#0xffffffff
009c990c	ldp x29,x30,[sp, #0xe0]
009c9910	ldp x20,x19,[sp, #0xd0]
009c9914	ldp x22,x21,[sp, #0xc0]
009c9918	ldp x24,x23,[sp, #0xb0]
009c991c	ldp x26,x25,[sp, #0xa0]
009c9920	ldp x28,x27,[sp, #0x90]
009c9924	add sp,sp,#0xf0
009c9928	ret
009c992c	mov x0,x19
009c9930	bl 0x00c34510
009c9934	cbz w0,0x009c9c90
009c9938	mov w8,#0x1ca8
009c993c	mov w9,#0x12a8
009c9940	add x8,x19,x8
009c9944	mov w10,#0x1cfa
009c9948	mov w11,#0x12f0
009c994c	str x8,[sp, #0x30]
009c9950	add x8,x19,x9
009c9954	stp x22,x20,[sp, #0x8]
009c9958	mov x20,xzr
009c995c	add x26,x19,#0xc78
009c9960	mov w22,#0x1
009c9964	stp x23,x8,[sp, #0x20]
009c9968	add x23,x19,x10
009c996c	add x28,x19,x11
009c9970	str x20,[sp, #0x18]
009c9974	b 0x009c9980
009c9978	str xzr,[x19, #0x12b0]
009c997c	str w22,[x19, #0x12e0]
009c9980	mov x0,x19
009c9984	str w22,[x19, #0x28]
009c9988	bl 0x00c35a60
009c998c	cbz w0,0x009c9a18
009c9990	ldr x8,[x19, #0x12b0]
009c9994	cbnz x8,0x009c9a18
009c9998	ldr x8,[x19, #0x1d10]
009c999c	ldr x0,[x8, #0x50]
009c99a0	bl 0x00c34460
009c99a4	cbz x0,0x009c9a18
009c99a8	ldr x27,[x0, #0x8]
009c99ac	mov x20,x0
009c99b0	mov x0,x26
009c99b4	bl 0x00c36b00
009c99b8	ldr q0,[x27]
009c99bc	ldp x0,x8,[sp, #0x28]
009c99c0	add x1,x27,#0x40
009c99c4	mov w2,#0x50
009c99c8	str q0,[x8]
009c99cc	ldr q0,[x27, #0x30]
009c99d0	str q0,[x26, #0x20]
009c99d4	ldr q0,[x27, #0x20]
009c99d8	str q0,[x26, #0x10]
009c99dc	ldr q0,[x27, #0x10]
009c99e0	str q0,[x26]
009c99e4	bl 0x00c2ffd0
009c99e8	ldr x8,[x27]
009c99ec	adrp x1,0x2a3000
009c99f0	mov w2,#0x196
009c99f4	add x1,x1,#0xcf1
009c99f8	ldurh w9,[x8, #0x9]
009c99fc	strh w9,[x23, #0x4]
009c9a00	ldur w8,[x8, #0x5]
009c9a04	str w8,[x23]
009c9a08	ldr x0,[x20, #0x8]
009c9a0c	bl 0x00c32310
009c9a10	mov x0,x20
009c9a14	bl 0x00c34430
009c9a18	mov x0,x19
009c9a1c	bl 0x00c34100
009c9a20	cmp w0,#0x0
009c9a24	b.gt 0x009c9980
009c9a28	mov x0,x19
009c9a2c	bl 0x00c35ce0
009c9a30	cbnz w0,0x009c9908
009c9a34	ldr x8,[x19, #0x12b0]
009c9a38	cbz x8,0x009c9a48
009c9a3c	ldr w8,[x19, #0xc64]
009c9a40	cmp w8,#0xf1
009c9a44	b.ne 0x009c9a60
009c9a48	mov x0,x19
009c9a4c	str xzr,[x19, #0xc68]
009c9a50	bl 0x00c36b40
009c9a54	cmp w0,#0x0
009c9a58	b.le 0x009c9b6c
009c9a5c	str x22,[x19, #0xc68]
009c9a60	ldr w8,[x19, #0x12ac]
009c9a64	cmp w8,#0x15
009c9a68	b.eq 0x009c9a78
009c9a6c	ldr x9,[x19, #0x12b0]
009c9a70	cbz x9,0x009c9a78
009c9a74	str wzr,[x19, #0x1d0c]
009c9a78	cmp w8,#0x16
009c9a7c	b.eq 0x009c9aa4
009c9a80	ldr w9,[x19, #0x198]
009c9a84	cbz w9,0x009c9aa4
009c9a88	ldr x8,[x19, #0x1d10]
009c9a8c	mov x0,x19
009c9a90	mov x2,x28
009c9a94	add x1,x8,#0x48
009c9a98	bl 0x009c9374
009c9a9c	tbz w0,#0x1f,0x009c9978
009c9aa0	b 0x009c9908
009c9aa4	ldr w9,[x19, #0x44]
009c9aa8	tbnz w9,#0x1,0x009c9d20
009c9aac	cmp w8,w25
009c9ab0	b.eq 0x009c9cb4
009c9ab4	cbz x24,0x009c9ac8
009c9ab8	cmp w25,#0x16
009c9abc	b.ne 0x009c9ac8
009c9ac0	cmp w8,#0x14
009c9ac4	b.eq 0x009c9cb4
009c9ac8	cmp w8,#0x15
009c9acc	b.eq 0x009c9bb8
009c9ad0	tbnz w9,#0x0,0x009c9d38
009c9ad4	cmp w8,#0x14
009c9ad8	b.eq 0x009c9978
009c9adc	cmp w8,#0x16
009c9ae0	b.ne 0x009c9d6c
009c9ae4	mov x0,x19
009c9ae8	bl 0x00c34510
009c9aec	cbnz w0,0x009c9d68
009c9af0	ldr x8,[x19, #0x1d10]
009c9af4	ldr x9,[x19, #0x12e8]
009c9af8	ldrh w8,[x8]
009c9afc	cmp x9,x8
009c9b00	b.ne 0x009c9978
009c9b04	ldr x8,[x19, #0x12b0]
009c9b08	cmp x8,#0xb
009c9b0c	b.ls 0x009c9978
009c9b10	ldr x0,[x19, #0x12c8]
009c9b14	add x1,sp,#0x38
009c9b18	bl 0x00c36b30
009c9b1c	ldrb w8,[sp, #0x38]
009c9b20	mov x0,x19
009c9b24	cmp w8,#0x14
009c9b28	b.ne 0x009c9b84
009c9b2c	bl 0x00c340d0
009c9b30	tbnz w0,#0x1f,0x009c9908
009c9b34	mov x0,x19
009c9b38	bl 0x00c343e0
009c9b3c	cmp w0,#0x0
009c9b40	b.gt 0x009c9b50
009c9b44	mov x0,x19
009c9b48	bl 0x00c35ce0
009c9b4c	cbnz w0,0x009c9908
009c9b50	ldrb w8,[x19, #0x9f0]
009c9b54	str xzr,[x19, #0x12b0]
009c9b58	str w22,[x19, #0x12e0]
009c9b5c	tbnz w8,#0x2,0x009c9980
009c9b60	ldr x8,[x19, #0xc98]
009c9b64	cbnz x8,0x009c9980
009c9b68	b 0x009c9edc
009c9b6c	mov w1,w0
009c9b70	mov x0,x19
009c9b74	bl 0x00c36b70
009c9b78	cmp w0,#0x1
009c9b7c	b.ge 0x009c9980
009c9b80	b 0x009c990c
009c9b84	bl 0x00c35a60
009c9b88	cbz w0,0x009c9ec0
009c9b8c	mov w1,#0x1
009c9b90	mov x0,x19
009c9b94	bl 0x00c35cf0
009c9b98	ldr x8,[x19, #0x30]
009c9b9c	mov x0,x19
009c9ba0	blr x8
009c9ba4	tbnz w0,#0x1f,0x009c990c
009c9ba8	cbz w0,0x009c9908
009c9bac	ldrb w8,[x19, #0x9f0]
009c9bb0	tbnz w8,#0x2,0x009c9980
009c9bb4	b 0x009c9b60
009c9bb8	ldr x8,[x19, #0x12b0]
009c9bbc	cmp x8,#0x1
009c9bc0	b.lt 0x009c9e98
009c9bc4	b.eq 0x009c9e98
009c9bc8	cmp x8,#0x2
009c9bcc	b.ne 0x009c9e98
009c9bd0	ldr x9,[x19, #0x12c8]
009c9bd4	ldr x10,[x19, #0x12c0]
009c9bd8	ldr x8,[x19, #0x4c0]
009c9bdc	add x3,x9,x10
009c9be0	ldrb w10,[x3]
009c9be4	ldrb w27,[x3, #0x1]
009c9be8	cbz x8,0x009c9c10
009c9bec	ldr w1,[x19]
009c9bf0	ldr x6,[x19, #0x4c8]
009c9bf4	mov w2,#0x15
009c9bf8	mov w4,#0x2
009c9bfc	mov w0,wzr
009c9c00	mov x5,x19
009c9c04	mov w20,w10
009c9c08	blr x8
009c9c0c	mov w10,w20
009c9c10	ldr x20,[x19, #0x978]
009c9c14	str w27,[sp, #0x4]
009c9c18	cbnz x20,0x009c9c34
009c9c1c	ldr x8,[x19, #0x9a8]
009c9c20	ldr x9,[sp, #0x18]
009c9c24	ldr x8,[x8, #0x120]
009c9c28	cmp x8,#0x0
009c9c2c	csel x20,x9,x8,eq
009c9c30	cbz x20,0x009c9c50
009c9c34	mov w2,w27
009c9c38	bfm w2,w10,#0x18,#0x7
009c9c3c	mov w1,#0x4004
009c9c40	mov x0,x19
009c9c44	mov w27,w10
009c9c48	blr x20
009c9c4c	mov w10,w27
009c9c50	cmp w10,#0x1
009c9c54	b.ne 0x009c9f08
009c9c58	ldr w8,[x19, #0x1d0c]
009c9c5c	ldr w9,[sp, #0x4]
009c9c60	str w22,[x19, #0x12e0]
009c9c64	add w8,w8,#0x1
009c9c68	cmp w8,#0x5
009c9c6c	str w9,[x19, #0x19c]
009c9c70	str w8,[x19, #0x1d0c]
009c9c74	b.eq 0x009c9f7c
009c9c78	cbnz w9,0x009c9970
009c9c7c	ldr w8,[x19, #0x44]
009c9c80	mov w0,wzr
009c9c84	orr w8,w8,#0x2
009c9c88	str w8,[x19, #0x44]
009c9c8c	b 0x009c990c
009c9c90	mov x0,x19
009c9c94	bl 0x00c344e0
009c9c98	cbz w0,0x009c9938
009c9c9c	ldr x8,[x19, #0x30]
009c9ca0	mov x0,x19
009c9ca4	blr x8
009c9ca8	tbnz w0,#0x1f,0x009c990c
009c9cac	cbnz w0,0x009c9938
009c9cb0	b 0x009c9908
009c9cb4	mov x0,x19
009c9cb8	bl 0x00c344e0
009c9cbc	cmp w25,#0x17
009c9cc0	b.ne 0x009c9cd0
009c9cc4	cbz w0,0x009c9cd0
009c9cc8	ldr x8,[x19, #0x848]
009c9ccc	cbz x8,0x009c9dfc
009c9cd0	cbz x24,0x009c9cdc
009c9cd4	ldr w8,[x19, #0x12ac]
009c9cd8	str w8,[x24]
009c9cdc	ldr x8,[x19, #0x12b0]
009c9ce0	ldr x11,[sp, #0x20]
009c9ce4	cbz x11,0x009c9d50
009c9ce8	ldr x9,[x19, #0x12c8]
009c9cec	ldr x10,[x19, #0x12c0]
009c9cf0	ldr x0,[sp, #0x8]
009c9cf4	cmp x8,x11
009c9cf8	csel x23,x8,x11,cc
009c9cfc	add x1,x9,x10
009c9d00	mov x2,x23
009c9d04	bl 0x00c2ffd0
009c9d08	cbz w21,0x009c9da0
009c9d0c	ldr x8,[x19, #0x12b0]
009c9d10	cbnz x8,0x009c9dec
009c9d14	mov w8,#0x1
009c9d18	str w8,[x19, #0x12e0]
009c9d1c	b 0x009c9dec
009c9d20	mov w8,#0x1
009c9d24	mov w0,wzr
009c9d28	str xzr,[x19, #0x12b0]
009c9d2c	str w8,[x19, #0x12e0]
009c9d30	str w8,[x19, #0x28]
009c9d34	b 0x009c990c
009c9d38	mov w8,#0x1
009c9d3c	mov w0,wzr
009c9d40	str xzr,[x19, #0x12b0]
009c9d44	str w8,[x19, #0x28]
009c9d48	str w8,[x19, #0x12e0]
009c9d4c	b 0x009c990c
009c9d50	mov w0,wzr
009c9d54	cbnz x8,0x009c990c
009c9d58	mov w8,#0x1
009c9d5c	mov w0,wzr
009c9d60	str w8,[x19, #0x12e0]
009c9d64	b 0x009c990c
009c9d68	ldr w8,[x19, #0x12ac]
009c9d6c	sub w9,w8,#0x14
009c9d70	cmp w9,#0x3
009c9d74	b.cs 0x009c9e24
009c9d78	bl 0x00c342a0
009c9d7c	adrp x0,0x2a3000
009c9d80	adrp x2,0x2cb000
009c9d84	add x0,x0,#0xcf1
009c9d88	add x2,x2,#0x5b6
009c9d8c	mov w1,#0x2ef
009c9d90	bl 0x00c342b0
009c9d94	mov w2,#0x103
009c9d98	mov w1,#0xa
009c9d9c	b 0x009c98f8
009c9da0	ldrb w8,[x19, #0x9e8]
009c9da4	tbz w8,#0x1,0x009c9dbc
009c9da8	ldr x8,[x19, #0x12c8]
009c9dac	ldr x9,[x19, #0x12c0]
009c9db0	mov x1,x23
009c9db4	add x0,x8,x9
009c9db8	bl 0x00c34750
009c9dbc	ldr x8,[x19, #0x12b0]
009c9dc0	ldr x9,[x19, #0x12c0]
009c9dc4	subs x8,x8,x23
009c9dc8	add x9,x9,x23
009c9dcc	str x8,[x19, #0x12b0]
009c9dd0	str x9,[x19, #0x12c0]
009c9dd4	b.ne 0x009c9dec
009c9dd8	orr w8,wzr,#0xf0
009c9ddc	mov w9,#0x1
009c9de0	str xzr,[x19, #0x12c0]
009c9de4	str w8,[x19, #0xc64]
009c9de8	str w9,[x19, #0x12e0]
009c9dec	ldr x8,[sp, #0x10]
009c9df0	mov w0,#0x1
009c9df4	str x23,[x8]
009c9df8	b 0x009c990c
009c9dfc	bl 0x00c342a0
009c9e00	adrp x0,0x2a3000
009c9e04	adrp x2,0x2cb000
009c9e08	add x0,x0,#0xcf1
009c9e0c	add x2,x2,#0x5b6
009c9e10	mov w1,#0x1ec
009c9e14	bl 0x00c342b0
009c9e18	mov w1,#0xa
009c9e1c	mov w2,#0x64
009c9e20	b 0x009c98fc
009c9e24	cmp w8,#0x17
009c9e28	b.ne 0x009c9e54
009c9e2c	ldr w8,[x19, #0x1b8]
009c9e30	cbz w8,0x009c9e70
009c9e34	ldr w8,[x19, #0x1b0]
009c9e38	cbz w8,0x009c9e70
009c9e3c	mov x0,x19
009c9e40	bl 0x00c36ba0
009c9e44	cbz w0,0x009c9e70
009c9e48	mov w8,#0x2
009c9e4c	str w8,[x19, #0x1b8]
009c9e50	b 0x009c9908
009c9e54	bl 0x00c342a0
009c9e58	adrp x0,0x2a3000
009c9e5c	adrp x2,0x2cb000
009c9e60	add x0,x0,#0xcf1
009c9e64	add x2,x2,#0x5b6
009c9e68	mov w1,#0x2e5
009c9e6c	b 0x009c9e88
009c9e70	bl 0x00c342a0
009c9e74	adrp x0,0x2a3000
009c9e78	adrp x2,0x2cb000
009c9e7c	add x0,x0,#0xcf1
009c9e80	add x2,x2,#0x5b6
009c9e84	mov w1,#0x2ff
009c9e88	bl 0x00c342b0
009c9e8c	mov w1,#0xa
009c9e90	mov w2,#0xf5
009c9e94	b 0x009c98fc
009c9e98	bl 0x00c342a0
009c9e9c	adrp x0,0x2a3000
009c9ea0	adrp x2,0x2cb000
009c9ea4	add x0,x0,#0xcf1
009c9ea8	add x2,x2,#0x5b6
009c9eac	mov w1,#0x232
009c9eb0	bl 0x00c342b0
009c9eb4	mov w1,#0xa
009c9eb8	mov w2,#0xcd
009c9ebc	b 0x009c98fc
009c9ec0	bl 0x00c342a0
009c9ec4	adrp x0,0x2a3000
009c9ec8	adrp x2,0x2cb000
009c9ecc	add x0,x0,#0xcf1
009c9ed0	add x2,x2,#0x5b6
009c9ed4	mov w1,#0x2c1
009c9ed8	b 0x009c98ec
009c9edc	orr w8,wzr,#0x3
009c9ee0	mov x0,x19
009c9ee4	str w8,[x19, #0x28]
009c9ee8	bl 0x00c34300
009c9eec	orr w1,wzr,#0xf
009c9ef0	mov x19,x0
009c9ef4	bl 0x00c32190
009c9ef8	mov w1,#0x9
009c9efc	mov x0,x19
009c9f00	bl 0x00c322a0
009c9f04	b 0x009c9908
009c9f08	ldr w21,[sp, #0x4]
009c9f0c	cmp w10,#0x2
009c9f10	b.ne 0x009c9fa4
009c9f14	mov w20,#0x1
009c9f18	str w20,[x19, #0x28]
009c9f1c	str w21,[x19, #0x1a0]
009c9f20	bl 0x00c342a0
009c9f24	adrp x0,0x2a3000
009c9f28	adrp x2,0x2cb000
009c9f2c	add x0,x0,#0xcf1
009c9f30	add x2,x2,#0x5b6
009c9f34	mov w1,#0x265
009c9f38	bl 0x00c342b0
009c9f3c	adrp x3,0x2a7000
009c9f40	add w2,w21,#0x3e8
009c9f44	add x3,x3,#0xb93
009c9f48	mov w1,#0xffffffff
009c9f4c	mov x0,x19
009c9f50	mov w4,w21
009c9f54	bl 0x00c34410
009c9f58	ldr w8,[x19, #0x44]
009c9f5c	ldr x0,[x19, #0xb88]
009c9f60	ldr x1,[x19, #0x918]
009c9f64	str w20,[x19, #0x12e0]
009c9f68	orr w8,w8,#0x2
009c9f6c	str w8,[x19, #0x44]
009c9f70	bl 0x00c34cd0
009c9f74	mov w0,wzr
009c9f78	b 0x009c990c
009c9f7c	bl 0x00c342a0
009c9f80	adrp x0,0x2a3000
009c9f84	adrp x2,0x2cb000
009c9f88	add x0,x0,#0xcf1
009c9f8c	add x2,x2,#0x5b6
009c9f90	mov w1,#0x24b
009c9f94	bl 0x00c342b0
009c9f98	mov w1,#0xa
009c9f9c	mov w2,#0x199
009c9fa0	b 0x009c98fc
009c9fa4	bl 0x00c342a0
009c9fa8	adrp x0,0x2a3000
009c9fac	adrp x2,0x2cb000
009c9fb0	add x0,x0,#0xcf1
009c9fb4	add x2,x2,#0x5b6
009c9fb8	mov w1,#0x26d
009c9fbc	bl 0x00c342b0
009c9fc0	mov w1,#0x2f
009c9fc4	mov w2,#0xf6
009c9fc8	b 0x009c98fc
