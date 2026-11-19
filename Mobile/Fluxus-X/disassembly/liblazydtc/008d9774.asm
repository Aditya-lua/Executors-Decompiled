; LZ4_decompress_safe_partial_forceExtDict @ 008d9774
008d9774	sub sp,sp,#0xd0
008d9778	stp x29,x30,[sp, #0x70]
008d977c	stp x28,x27,[sp, #0x80]
008d9780	stp x26,x25,[sp, #0x90]
008d9784	stp x24,x23,[sp, #0xa0]
008d9788	stp x22,x21,[sp, #0xb0]
008d978c	stp x20,x19,[sp, #0xc0]
008d9790	add x29,sp,#0x70
008d9794	cmp w3,w4
008d9798	mov x22,x0
008d979c	mov w0,#0xffffffff
008d97a0	csel w8,w3,w4,lt
008d97a4	stur x6,[x29, #-0x18]
008d97a8	cbz x22,0x008da278
008d97ac	tbnz w8,#0x1f,0x008da278
008d97b0	ldur x9,[x29, #-0x18]
008d97b4	cmp x5,#0x0
008d97b8	add x9,x5,x9
008d97bc	csel x9,xzr,x9,eq
008d97c0	stur x9,[x29, #-0x20]
008d97c4	cbz w8,0x008d9d38
008d97c8	cbz w2,0x008da278
008d97cc	add x16,x1,w8, UXTW 
008d97d0	cmp w8,#0x40
008d97d4	ldur x8,[x29, #-0x18]
008d97d8	add x19,x22,w2, SXTW 
008d97dc	mov x20,x1
008d97e0	mov x23,x1
008d97e4	lsr x8,x8,#0x10
008d97e8	sub x28,x16,#0x20
008d97ec	str x22,[sp, #0x30]
008d97f0	sub x21,x19,#0x10
008d97f4	stur x16,[x29, #-0x8]
008d97f8	stur x8,[x29, #-0x10]
008d97fc	b.cc 0x008da204
008d9800	ldr x22,[sp, #0x30]
008d9804	cmp w2,#0x12
008d9808	mov x9,x22
008d980c	ldrb w26,[x9], #0x1
008d9810	lsr x8,x26,#0x4
008d9814	b.ge 0x008d982c
008d9818	mov x23,x20
008d981c	cmp x8,#0xf
008d9820	mov x22,x9
008d9824	b.eq 0x008d9dcc
008d9828	b 0x008d9e00
008d982c	sub x11,x19,#0xf
008d9830	sub x10,x16,#0x5
008d9834	sub x15,x19,#0x11
008d9838	stur x11,[x29, #-0x28]
008d983c	sub x11,x19,#0x40
008d9840	sub x17,x16,#0x40
008d9844	str x11,[sp, #0x38]
008d9848	sub x11,x19,#0x6
008d984c	mov x23,x20
008d9850	stur x11,[x29, #-0x30]
008d9854	add x11,x20,#0x1
008d9858	stp x11,x10,[sp, #0x10]
008d985c	add x11,x20,#0x10
008d9860	str x11,[sp, #0x8]
008d9864	stp x17,x15,[sp, #0x20]
008d9868	b 0x008d9898
008d986c	ldr x8,[x25]
008d9870	str x8,[x24]
008d9874	ldr x8,[x25, #0x8]
008d9878	str x8,[x24, #0x8]
008d987c	ldrh w8,[x25, #0x10]
008d9880	strh w8,[x24, #0x10]
008d9884	mov x9,x22
008d9888	ldrb w26,[x9], #0x1
008d988c	cmp x9,x15
008d9890	lsr x8,x26,#0x4
008d9894	b.hi 0x008d981c
008d9898	cmp x8,#0xf
008d989c	b.ne 0x008d9900
008d98a0	ldur x8,[x29, #-0x28]
008d98a4	cmp x9,x8
008d98a8	b.cs 0x008d9d30
008d98ac	ldrb w8,[x9]
008d98b0	add x22,x22,#0x2
008d98b4	cmp x8,#0xff
008d98b8	b.eq 0x008d9b14
008d98bc	add x8,x8,#0xf
008d98c0	cmn x22,x8
008d98c4	b.cs 0x008d9d40
008d98c8	add x24,x23,x8
008d98cc	cmp x24,x17
008d98d0	b.hi 0x008d9e04
008d98d4	ldr x10,[sp, #0x38]
008d98d8	add x9,x22,x8
008d98dc	cmp x9,x10
008d98e0	b.hi 0x008d9e04
008d98e4	ldp q1,q0,[x22, #0x20]
008d98e8	ldp q2,q3,[x22], #0x40
008d98ec	stp q1,q0,[x23, #0x20]
008d98f0	stp q2,q3,[x23], #0x40
008d98f4	cmp x23,x24
008d98f8	b.cc 0x008d98e4
008d98fc	b 0x008d9910
008d9900	ldr q0,[x9]
008d9904	add x9,x9,x8
008d9908	add x24,x23,x8
008d990c	str q0,[x23]
008d9910	mov x22,x9
008d9914	and x8,x26,#0xf
008d9918	ldrh w27,[x22], #0x2
008d991c	cmp x8,#0xf
008d9920	sub x25,x24,x27
008d9924	b.ne 0x008d9960
008d9928	ldur x8,[x29, #-0x30]
008d992c	cmp x22,x8
008d9930	b.cs 0x008d9d40
008d9934	ldrb w8,[x9, #0x2]
008d9938	add x22,x9,#0x3
008d993c	cmp x8,#0xff
008d9940	b.eq 0x008d9b3c
008d9944	add x26,x8,#0x13
008d9948	cmn x24,x26
008d994c	b.cs 0x008d9d40
008d9950	add x8,x24,x26
008d9954	cmp x8,x17
008d9958	b.cc 0x008d9980
008d995c	b 0x008d9f54
008d9960	add x26,x8,#0x4
008d9964	add x23,x24,x26
008d9968	cmp x23,x17
008d996c	b.cs 0x008d9f54
008d9970	cmp x25,x20
008d9974	b.cc 0x008d9980
008d9978	cmp w27,#0x8
008d997c	b.cs 0x008d986c
008d9980	ldur x8,[x29, #-0x10]
008d9984	cbnz x8,0x008d9998
008d9988	ldur x8,[x29, #-0x18]
008d998c	add x8,x25,x8
008d9990	cmp x8,x20
008d9994	b.cc 0x008d9d40
008d9998	cmp x25,x20
008d999c	add x23,x24,x26
008d99a0	b.cs 0x008d9a60
008d99a4	ldr x8,[sp, #0x18]
008d99a8	cmp x23,x8
008d99ac	b.hi 0x008d9b64
008d99b0	sub x23,x20,x25
008d99b4	subs x25,x26,x23
008d99b8	b.ls 0x008d9a94
008d99bc	ldur x8,[x29, #-0x20]
008d99c0	mov x0,x24
008d99c4	mov x2,x23
008d99c8	sub x1,x8,x23
008d99cc	bl 0x00c2ffd0
008d99d0	add x23,x24,x23
008d99d4	sub x8,x23,x20
008d99d8	cmp x25,x8
008d99dc	b.ls 0x008d9ad4
008d99e0	ldr x9,[sp, #0x10]
008d99e4	add x8,x24,x26
008d99e8	add x10,x20,x27
008d99ec	add x9,x9,x27
008d99f0	cmp x9,x8
008d99f4	csel x9,x9,x8,hi
008d99f8	sub x10,x9,x10
008d99fc	cmp x10,#0x20
008d9a00	b.cc 0x008d9af4
008d9a04	ldp x17,x15,[sp, #0x20]
008d9a08	cmp w27,#0x20
008d9a0c	ldur x16,[x29, #-0x8]
008d9a10	mov x9,x20
008d9a14	b.cc 0x008d9b00
008d9a18	ldr x14,[sp, #0x8]
008d9a1c	and x11,x10,#-0x20
008d9a20	sub x13,x27,x24
008d9a24	add x23,x23,x11
008d9a28	add x9,x20,x11
008d9a2c	add x12,x24,x14
008d9a30	add x12,x12,x13
008d9a34	mov x13,x14
008d9a38	mov x14,x11
008d9a3c	ldp q0,q1,[x13, #-0x10]
008d9a40	subs x14,x14,#0x20
008d9a44	add x13,x13,#0x20
008d9a48	stp q0,q1,[x12, #-0x10]
008d9a4c	add x12,x12,#0x20
008d9a50	b.ne 0x008d9a3c
008d9a54	cmp x10,x11
008d9a58	b.ne 0x008d9b00
008d9a5c	b 0x008d9884
008d9a60	cmp w27,#0xf
008d9a64	b.ls 0x008d9b74
008d9a68	cmp w27,#0x3f
008d9a6c	neg x8,x27
008d9a70	b.ls 0x008d9aac
008d9a74	add x9,x24,x8
008d9a78	ldp q1,q0,[x9, #0x20]
008d9a7c	ldp q2,q3,[x9]
008d9a80	stp q1,q0,[x24, #0x20]
008d9a84	stp q2,q3,[x24], #0x40
008d9a88	cmp x24,x23
008d9a8c	b.cc 0x008d9a74
008d9a90	b 0x008d9884
008d9a94	ldur x8,[x29, #-0x20]
008d9a98	mov x0,x24
008d9a9c	mov x2,x26
008d9aa0	sub x1,x8,x23
008d9aa4	bl 0x00c2ff60
008d9aa8	b 0x008d9ae4
008d9aac	add x8,x24,x8
008d9ab0	add x8,x8,#0x10
008d9ab4	ldur q0,[x8, #-0x10]
008d9ab8	str q0,[x24]
008d9abc	ldr q0,[x8], #0x20
008d9ac0	str q0,[x24, #0x10]
008d9ac4	add x24,x24,#0x20
008d9ac8	cmp x24,x23
008d9acc	b.cc 0x008d9ab4
008d9ad0	b 0x008d9884
008d9ad4	mov x0,x23
008d9ad8	mov x1,x20
008d9adc	mov x2,x25
008d9ae0	bl 0x00c2ffd0
008d9ae4	ldp x17,x15,[sp, #0x20]
008d9ae8	add x23,x24,x26
008d9aec	ldur x16,[x29, #-0x8]
008d9af0	b 0x008d9884
008d9af4	ldp x17,x15,[sp, #0x20]
008d9af8	mov x9,x20
008d9afc	ldur x16,[x29, #-0x8]
008d9b00	ldrb w10,[x9], #0x1
008d9b04	strb w10,[x23], #0x1
008d9b08	cmp x23,x8
008d9b0c	b.cc 0x008d9b00
008d9b10	b 0x008d9884
008d9b14	ldur x9,[x29, #-0x28]
008d9b18	cmp x22,x9
008d9b1c	b.cs 0x008d9d40
008d9b20	ldrb w9,[x22], #0x1
008d9b24	cmp x9,#0xff
008d9b28	add x8,x8,x9
008d9b2c	b.eq 0x008d9b14
008d9b30	cmn x8,#0x1
008d9b34	b.ne 0x008d98bc
008d9b38	b 0x008d9d40
008d9b3c	ldur x9,[x29, #-0x30]
008d9b40	cmp x22,x9
008d9b44	b.cs 0x008d9d40
008d9b48	ldrb w9,[x22], #0x1
008d9b4c	cmp x9,#0xff
008d9b50	add x8,x8,x9
008d9b54	b.eq 0x008d9b3c
008d9b58	cmn x8,#0x1
008d9b5c	b.ne 0x008d9944
008d9b60	b 0x008d9d40
008d9b64	sub x8,x16,x24
008d9b68	cmp x26,x8
008d9b6c	csel x26,x26,x8,cc
008d9b70	b 0x008d99b0
008d9b74	cmp w27,#0x4
008d9b78	b.eq 0x008d9bb0
008d9b7c	cmp w27,#0x2
008d9b80	b.eq 0x008d9ba0
008d9b84	cmp w27,#0x1
008d9b88	b.ne 0x008d9c44
008d9b8c	ldrb w9,[x25]
008d9b90	orr w10,wzr,#0x1010101
008d9b94	orr x8,x9,x9, LSL #0x8
008d9b98	mul w9,w9,w10
008d9b9c	b 0x008d9ba8
008d9ba0	ldrh w8,[x25]
008d9ba4	orr w9,w8,w8, LSL #0x10
008d9ba8	mov x10,x8
008d9bac	b 0x008d9bc0
008d9bb0	ldr w9,[x25]
008d9bb4	lsr w10,w9,#0x10
008d9bb8	and x8,x9,#0xffff
008d9bbc	mov w10,w10
008d9bc0	orr x8,x8,x10, LSL #0x10
008d9bc4	cmp x26,#0x9
008d9bc8	orr x8,x8,x9, LSL #0x20
008d9bcc	str x8,[x24]
008d9bd0	b.cc 0x008d9884
008d9bd4	add x9,x26,x24
008d9bd8	add x10,x24,#0x10
008d9bdc	cmp x9,x10
008d9be0	csel x9,x9,x10,hi
008d9be4	sub x9,x9,x24
008d9be8	sub x10,x9,#0x9
008d9bec	add x9,x24,#0x8
008d9bf0	cmp x10,#0x18
008d9bf4	b.cc 0x008d9c34
008d9bf8	lsr x10,x10,#0x3
008d9bfc	dup v0.2D,x8
008d9c00	add x12,x24,#0x18
008d9c04	add x10,x10,#0x1
008d9c08	and x11,x10,#0x3ffffffffffffffc
008d9c0c	add x9,x9,x11, LSL #0x3
008d9c10	mov x13,x11
008d9c14	subs x13,x13,#0x4
008d9c18	stp q0,q0,[x12, #-0x10]
008d9c1c	add x12,x12,#0x20
008d9c20	b.ne 0x008d9c14
008d9c24	ldur x16,[x29, #-0x8]
008d9c28	ldr x15,[sp, #0x28]
008d9c2c	cmp x10,x11
008d9c30	b.eq 0x008d9884
008d9c34	str x8,[x9], #0x8
008d9c38	cmp x9,x23
008d9c3c	b.cc 0x008d9c34
008d9c40	b 0x008d9884
008d9c44	cmp w27,#0x7
008d9c48	b.hi 0x008d9c8c
008d9c4c	str wzr,[x24]
008d9c50	ldrh w8,[x25]
008d9c54	strh w8,[x24]
008d9c58	ldrh w8,[x25, #0x2]
008d9c5c	strh w8,[x24, #0x2]
008d9c60	adrp x8,0x364000
008d9c64	add x8,x8,#0xe30
008d9c68	ldr w8,[x8, x27, LSL #0x2]
008d9c6c	add x8,x25,x8
008d9c70	ldr w9,[x8]
008d9c74	str w9,[x24, #0x4]
008d9c78	adrp x9,0x364000
008d9c7c	add x9,x9,#0xdd0
008d9c80	ldrsw x9,[x9, x27, LSL #0x2]
008d9c84	sub x25,x8,x9
008d9c88	b 0x008d9c94
008d9c8c	ldr x8,[x25], #0x8
008d9c90	str x8,[x24]
008d9c94	add x8,x26,x24
008d9c98	add x9,x24,#0x10
008d9c9c	cmp x8,x9
008d9ca0	csel x8,x8,x9,hi
008d9ca4	sub x8,x8,x24
008d9ca8	sub x9,x8,#0x9
008d9cac	add x8,x24,#0x8
008d9cb0	cmp x9,#0x18
008d9cb4	b.cc 0x008d9cc8
008d9cb8	sub x10,x24,x25
008d9cbc	add x10,x10,#0x8
008d9cc0	cmp x10,#0x20
008d9cc4	b.cs 0x008d9ce8
008d9cc8	mov x9,x25
008d9ccc	ldr x10,[x9], #0x8
008d9cd0	str x10,[x8], #0x8
008d9cd4	cmp x8,x23
008d9cd8	b.cc 0x008d9ccc
008d9cdc	ldur x16,[x29, #-0x8]
008d9ce0	ldr x15,[sp, #0x28]
008d9ce4	b 0x008d9884
008d9ce8	lsr x9,x9,#0x3
008d9cec	add x13,x25,#0x10
008d9cf0	add x10,x9,#0x1
008d9cf4	and x11,x10,#0x3ffffffffffffffc
008d9cf8	lsl x12,x11,#0x3
008d9cfc	mov x14,x11
008d9d00	add x9,x25,x12
008d9d04	add x8,x8,x12
008d9d08	add x12,x24,#0x18
008d9d0c	ldp q0,q1,[x13, #-0x10]
008d9d10	subs x14,x14,#0x4
008d9d14	add x13,x13,#0x20
008d9d18	stp q0,q1,[x12, #-0x10]
008d9d1c	add x12,x12,#0x20
008d9d20	b.ne 0x008d9d0c
008d9d24	cmp x10,x11
008d9d28	b.ne 0x008d9ccc
008d9d2c	b 0x008d9cdc
008d9d30	mov x22,x9
008d9d34	b 0x008d9d40
008d9d38	mov w0,wzr
008d9d3c	b 0x008da278
008d9d40	ldr x9,[sp, #0x30]
008d9d44	mvn w8,w22
008d9d48	add w0,w8,w9
008d9d4c	b 0x008da278
008d9d50	cmp x22,x21
008d9d54	b.cs 0x008d9e00
008d9d58	cmp x23,x28
008d9d5c	b.hi 0x008d9e00
008d9d60	ldr q0,[x22]
008d9d64	add x9,x22,x8
008d9d68	and x10,x26,#0xf
008d9d6c	mov x22,x9
008d9d70	add x24,x23,x8
008d9d74	cmp x10,#0xf
008d9d78	str q0,[x23]
008d9d7c	ldrh w27,[x22], #0x2
008d9d80	sub x25,x24,x27
008d9d84	b.eq 0x008d9f10
008d9d88	cmp w27,#0x8
008d9d8c	b.cc 0x008d9f10
008d9d90	cmp x25,x20
008d9d94	b.cc 0x008d9f10
008d9d98	ldr x8,[x25]
008d9d9c	add x10,x24,x10
008d9da0	add x22,x9,#0x3
008d9da4	add x23,x10,#0x4
008d9da8	str x8,[x24]
008d9dac	ldr x8,[x25, #0x8]
008d9db0	str x8,[x24, #0x8]
008d9db4	ldrh w8,[x25, #0x10]
008d9db8	strh w8,[x24, #0x10]
008d9dbc	ldrb w26,[x9, #0x2]
008d9dc0	lsr x8,x26,#0x4
008d9dc4	cmp x8,#0xf
008d9dc8	b.ne 0x008d9d50
008d9dcc	sub x9,x19,#0xf
008d9dd0	cmp x22,x9
008d9dd4	b.cs 0x008d9d40
008d9dd8	ldrb w8,[x22], #0x1
008d9ddc	cmp x8,#0xff
008d9de0	b.eq 0x008da298
008d9de4	add x8,x8,#0xf
008d9de8	cmn x23,x8
008d9dec	cset w10,cs
008d9df0	cmn x22,x8
008d9df4	cset w9,cs
008d9df8	tbnz w10,#0x0,0x008d9d40
008d9dfc	tbnz w9,#0x0,0x008d9d40
008d9e00	add x24,x23,x8
008d9e04	sub x9,x16,#0xc
008d9e08	cmp x24,x9
008d9e0c	b.hi 0x008d9e20
008d9e10	add x9,x22,x8
008d9e14	sub x10,x19,#0x8
008d9e18	cmp x9,x10
008d9e1c	b.ls 0x008d9e78
008d9e20	add x9,x22,x8
008d9e24	sub x10,x19,x22
008d9e28	add x11,x23,x10
008d9e2c	cmp x9,x19
008d9e30	csel x24,x11,x24,hi
008d9e34	cmp x24,x16
008d9e38	b.hi 0x008da260
008d9e3c	cmp x9,x19
008d9e40	mov x0,x23
008d9e44	mov x1,x22
008d9e48	csel x25,x10,x8,hi
008d9e4c	mov x2,x25
008d9e50	bl 0x00c2ff60
008d9e54	ldur x16,[x29, #-0x8]
008d9e58	cmp x24,x16
008d9e5c	add x24,x23,x25
008d9e60	b.eq 0x008da274
008d9e64	add x9,x22,x25
008d9e68	sub x8,x19,#0x2
008d9e6c	cmp x9,x8
008d9e70	b.cc 0x008d9f00
008d9e74	b 0x008da274
008d9e78	add x8,x23,#0x8
008d9e7c	mvn x10,x23
008d9e80	cmp x24,x8
008d9e84	csel x8,x24,x8,hi
008d9e88	add x8,x8,x10
008d9e8c	cmp x8,#0x18
008d9e90	b.cc 0x008d9ee8
008d9e94	sub x10,x23,x22
008d9e98	cmp x10,#0x20
008d9e9c	b.cc 0x008d9ee8
008d9ea0	lsr x8,x8,#0x3
008d9ea4	add x13,x23,#0x10
008d9ea8	add x14,x22,#0x10
008d9eac	add x11,x8,#0x1
008d9eb0	and x12,x11,#0x3ffffffffffffffc
008d9eb4	lsl x10,x12,#0x3
008d9eb8	mov x15,x12
008d9ebc	add x8,x22,x10
008d9ec0	add x10,x23,x10
008d9ec4	ldp q0,q1,[x14, #-0x10]
008d9ec8	subs x15,x15,#0x4
008d9ecc	add x14,x14,#0x20
008d9ed0	stp q0,q1,[x13, #-0x10]
008d9ed4	add x13,x13,#0x20
008d9ed8	b.ne 0x008d9ec4
008d9edc	cmp x11,x12
008d9ee0	b.ne 0x008d9ef0
008d9ee4	b 0x008d9f00
008d9ee8	mov x8,x22
008d9eec	mov x10,x23
008d9ef0	ldr x11,[x8], #0x8
008d9ef4	str x11,[x10], #0x8
008d9ef8	cmp x10,x24
008d9efc	b.cc 0x008d9ef0
008d9f00	ldrh w27,[x9], #0x2
008d9f04	and x10,x26,#0xf
008d9f08	mov x22,x9
008d9f0c	sub x25,x24,x27
008d9f10	cmp x10,#0xf
008d9f14	b.ne 0x008d9f50
008d9f18	sub x9,x19,#0x6
008d9f1c	cmp x22,x9
008d9f20	b.cs 0x008d9d40
008d9f24	ldrb w8,[x22], #0x1
008d9f28	cmp x8,#0xff
008d9f2c	b.eq 0x008da2bc
008d9f30	add x10,x8,#0xf
008d9f34	cmn x24,x10
008d9f38	cset w9,cs
008d9f3c	cmn x8,#0x1
008d9f40	mov w8,#0xf
008d9f44	csel x10,x8,x10,eq
008d9f48	b.eq 0x008d9d40
008d9f4c	tbnz w9,#0x0,0x008d9d40
008d9f50	add x26,x10,#0x4
008d9f54	ldur x8,[x29, #-0x10]
008d9f58	cbnz x8,0x008d9f6c
008d9f5c	ldur x8,[x29, #-0x18]
008d9f60	add x8,x25,x8
008d9f64	cmp x8,x20
008d9f68	b.cc 0x008d9d40
008d9f6c	cmp x25,x20
008d9f70	add x23,x24,x26
008d9f74	b.cs 0x008da038
008d9f78	sub x8,x16,x24
008d9f7c	sub x9,x16,#0x5
008d9f80	cmp x26,x8
008d9f84	csel x8,x26,x8,cc
008d9f88	cmp x23,x9
008d9f8c	sub x23,x20,x25
008d9f90	csel x26,x26,x8,ls
008d9f94	subs x27,x26,x23
008d9f98	b.ls 0x008da10c
008d9f9c	ldur x8,[x29, #-0x20]
008d9fa0	mov x0,x24
008d9fa4	mov x2,x23
008d9fa8	sub x1,x8,x23
008d9fac	bl 0x00c2ffd0
008d9fb0	add x23,x24,x23
008d9fb4	sub x9,x23,x20
008d9fb8	cmp x27,x9
008d9fbc	b.ls 0x008da194
008d9fc0	add x10,x24,x20
008d9fc4	add x8,x24,x26
008d9fc8	sub x11,x10,x25
008d9fcc	add x12,x11,#0x1
008d9fd0	cmp x12,x8
008d9fd4	csinc x11,x8,x11,ls
008d9fd8	add x11,x11,x25
008d9fdc	sub x10,x11,x10
008d9fe0	cmp x10,#0x20
008d9fe4	b.cc 0x008da1ec
008d9fe8	ldur x16,[x29, #-0x8]
008d9fec	cmp x9,#0x20
008d9ff0	mov x9,x20
008d9ff4	b.cc 0x008da1f4
008d9ff8	add x12,x20,#0x10
008d9ffc	and x11,x10,#-0x20
008da000	sub x13,x12,x25
008da004	add x23,x23,x11
008da008	add x9,x20,x11
008da00c	add x13,x24,x13
008da010	mov x14,x11
008da014	ldp q0,q1,[x12, #-0x10]
008da018	subs x14,x14,#0x20
008da01c	add x12,x12,#0x20
008da020	stp q0,q1,[x13, #-0x10]
008da024	add x13,x13,#0x20
008da028	b.ne 0x008da014
008da02c	cmp x10,x11
008da030	b.ne 0x008da1f4
008da034	b 0x008da204
008da038	sub x8,x16,#0xc
008da03c	cmp x23,x8
008da040	b.ls 0x008da124
008da044	sub x8,x16,x24
008da048	cmp x26,x8
008da04c	csel x2,x26,x8,cc
008da050	add x8,x25,x2
008da054	add x23,x24,x2
008da058	cmp x8,x24
008da05c	b.ls 0x008da1b0
008da060	cbz x2,0x008da1dc
008da064	add x8,x2,x24
008da068	add x9,x24,#0x1
008da06c	cmp x8,x9
008da070	csinc x8,x8,x24,hi
008da074	sub x8,x8,x24
008da078	cmp x8,#0x8
008da07c	b.cc 0x008da1c4
008da080	sub x9,x24,x25
008da084	cmp x9,#0x20
008da088	b.cc 0x008da1c4
008da08c	cmp x8,#0x20
008da090	mov x11,xzr
008da094	b.cc 0x008da0d8
008da098	and x11,x8,#-0x20
008da09c	add x9,x25,#0x10
008da0a0	add x10,x24,#0x10
008da0a4	mov x12,x11
008da0a8	ldp q0,q1,[x9, #-0x10]
008da0ac	subs x12,x12,#0x20
008da0b0	add x9,x9,#0x20
008da0b4	stp q0,q1,[x10, #-0x10]
008da0b8	add x10,x10,#0x20
008da0bc	b.ne 0x008da0a8
008da0c0	cmp x8,x11
008da0c4	b.eq 0x008da1dc
008da0c8	tst x8,#0x18
008da0cc	add x9,x24,x11
008da0d0	add x10,x25,x11
008da0d4	b.eq 0x008da1cc
008da0d8	and x12,x8,#-0x8
008da0dc	add x13,x25,x11
008da0e0	add x14,x24,x11
008da0e4	add x9,x24,x12
008da0e8	add x10,x25,x12
008da0ec	sub x11,x11,x12
008da0f0	ldr d0,[x13], #0x8
008da0f4	adds x11,x11,#0x8
008da0f8	str d0,[x14], #0x8
008da0fc	b.ne 0x008da0f0
008da100	cmp x8,x12
008da104	b.ne 0x008da1cc
008da108	b 0x008da1dc
008da10c	ldur x8,[x29, #-0x20]
008da110	mov x0,x24
008da114	mov x2,x26
008da118	sub x1,x8,x23
008da11c	bl 0x00c2ff60
008da120	b 0x008da1a4
008da124	cmp x27,#0x7
008da128	b.ls 0x008da2d8
008da12c	ldr x8,[x25], #0x8
008da130	str x8,[x24]
008da134	ldr x8,[x25]
008da138	cmp x26,#0x11
008da13c	str x8,[x24, #0x8]
008da140	b.cc 0x008da204
008da144	add x8,x26,x24
008da148	add x9,x24,#0x18
008da14c	cmp x8,x9
008da150	csel x8,x8,x9,hi
008da154	sub x8,x8,x24
008da158	sub x9,x8,#0x11
008da15c	add x8,x24,#0x10
008da160	cmp x9,#0x28
008da164	b.cc 0x008da178
008da168	sub x10,x24,x25
008da16c	add x10,x10,#0x8
008da170	cmp x10,#0x20
008da174	b.cs 0x008da218
008da178	mov x9,x25
008da17c	add x9,x9,#0x8
008da180	ldr x10,[x9], #0x8
008da184	str x10,[x8], #0x8
008da188	cmp x8,x23
008da18c	b.cc 0x008da180
008da190	b 0x008da204
008da194	mov x0,x23
008da198	mov x1,x20
008da19c	mov x2,x27
008da1a0	bl 0x00c2ffd0
008da1a4	ldur x16,[x29, #-0x8]
008da1a8	add x23,x24,x26
008da1ac	b 0x008da204
008da1b0	mov x0,x24
008da1b4	mov x1,x25
008da1b8	bl 0x00c2ffd0
008da1bc	ldur x16,[x29, #-0x8]
008da1c0	b 0x008da1dc
008da1c4	mov x9,x24
008da1c8	mov x10,x25
008da1cc	ldrb w8,[x10], #0x1
008da1d0	strb w8,[x9], #0x1
008da1d4	cmp x9,x23
008da1d8	b.cc 0x008da1cc
008da1dc	cmp x23,x16
008da1e0	b.ne 0x008da204
008da1e4	mov x24,x16
008da1e8	b 0x008da274
008da1ec	ldur x16,[x29, #-0x8]
008da1f0	mov x9,x20
008da1f4	ldrb w10,[x9], #0x1
008da1f8	strb w10,[x23], #0x1
008da1fc	cmp x23,x8
008da200	b.cc 0x008da1f4
008da204	ldrb w26,[x22], #0x1
008da208	lsr x8,x26,#0x4
008da20c	cmp x8,#0xf
008da210	b.ne 0x008d9d50
008da214	b 0x008d9dcc
008da218	lsr x9,x9,#0x3
008da21c	add x13,x25,#0x18
008da220	add x10,x9,#0x1
008da224	and x11,x10,#0x3ffffffffffffffc
008da228	lsl x12,x11,#0x3
008da22c	mov x14,x11
008da230	add x9,x25,x12
008da234	add x8,x8,x12
008da238	add x12,x24,#0x20
008da23c	ldp q0,q1,[x13, #-0x10]
008da240	subs x14,x14,#0x4
008da244	add x13,x13,#0x20
008da248	stp q0,q1,[x12, #-0x10]
008da24c	add x12,x12,#0x20
008da250	b.ne 0x008da23c
008da254	cmp x10,x11
008da258	b.eq 0x008da204
008da25c	b 0x008da17c
008da260	sub x2,x16,x23
008da264	mov x0,x23
008da268	mov x1,x22
008da26c	mov x24,x16
008da270	bl 0x00c2ff60
008da274	sub w0,w24,w20
008da278	ldp x20,x19,[sp, #0xc0]
008da27c	ldp x22,x21,[sp, #0xb0]
008da280	ldp x24,x23,[sp, #0xa0]
008da284	ldp x26,x25,[sp, #0x90]
008da288	ldp x28,x27,[sp, #0x80]
008da28c	ldp x29,x30,[sp, #0x70]
008da290	add sp,sp,#0xd0
008da294	ret
008da298	cmp x22,x9
008da29c	b.cs 0x008d9d40
008da2a0	ldrb w10,[x22], #0x1
008da2a4	cmp x10,#0xff
008da2a8	add x8,x8,x10
008da2ac	b.eq 0x008da298
008da2b0	cmn x8,#0x1
008da2b4	b.ne 0x008d9de4
008da2b8	b 0x008d9d40
008da2bc	cmp x22,x9
008da2c0	b.cs 0x008d9d40
008da2c4	ldrb w10,[x22], #0x1
008da2c8	cmp x10,#0xff
008da2cc	add x8,x8,x10
008da2d0	b.eq 0x008da2bc
008da2d4	b 0x008d9f30
008da2d8	str wzr,[x24]
008da2dc	ldrb w8,[x25]
008da2e0	strb w8,[x24]
008da2e4	ldrb w8,[x25, #0x1]
008da2e8	strb w8,[x24, #0x1]
008da2ec	ldrb w8,[x25, #0x2]
008da2f0	strb w8,[x24, #0x2]
008da2f4	ldrb w8,[x25, #0x3]
008da2f8	strb w8,[x24, #0x3]
008da2fc	adrp x8,0x364000
008da300	add x8,x8,#0xe30
008da304	ldr w8,[x8, x27, LSL #0x2]
008da308	add x8,x25,x8
008da30c	ldr w9,[x8]
008da310	str w9,[x24, #0x4]
008da314	adrp x9,0x364000
008da318	add x9,x9,#0xdd0
008da31c	ldrsw x9,[x9, x27, LSL #0x2]
008da320	sub x25,x8,x9
008da324	b 0x008da134
