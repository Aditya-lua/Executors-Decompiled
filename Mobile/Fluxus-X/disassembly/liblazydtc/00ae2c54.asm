; ossl_sm3_block_data_order @ 00ae2c54
00ae2c54	sub sp,sp,#0x160
00ae2c58	stp x28,x27,[sp, #0x100]
00ae2c5c	stp x26,x25,[sp, #0x110]
00ae2c60	stp x24,x23,[sp, #0x120]
00ae2c64	stp x22,x21,[sp, #0x130]
00ae2c68	stp x20,x19,[sp, #0x140]
00ae2c6c	stp x29,x30,[sp, #0x150]
00ae2c70	str x0,[sp, #0x8]
00ae2c74	cbz x2,0x00ae50ac
00ae2c78	ldr x8,[sp, #0x8]
00ae2c7c	ldr w9,[x8, #0x8]
00ae2c80	ldp w14,w16,[x8]
00ae2c84	ldr w17,[x8, #0x1c]
00ae2c88	str w9,[sp, #0xe8]
00ae2c8c	ldp w9,w29,[x8, #0xc]
00ae2c90	str w9,[sp, #0xec]
00ae2c94	ldp w30,w4,[x8, #0x14]
00ae2c98	stp w14,w16,[sp, #0xf8]
00ae2c9c	ldrb w8,[x1, #0xd]
00ae2ca0	ldrb w9,[x1, #0xc]
00ae2ca4	ldrb w10,[x1, #0x10]
00ae2ca8	str x2,[sp, #0xc8]
00ae2cac	str w8,[sp, #0xf0]
00ae2cb0	ldrb w8,[x1, #0xe]
00ae2cb4	stp w9,w10,[sp, #0x88]
00ae2cb8	ror w28,w14,#0x14
00ae2cbc	mov w18,w29
00ae2cc0	str w8,[sp, #0xf4]
00ae2cc4	ldrb w8,[x1, #0x11]
00ae2cc8	eor w29,w30,w29
00ae2ccc	eor w29,w29,w4
00ae2cd0	add w29,w29,w17
00ae2cd4	stp w8,w30,[sp, #0xe0]
00ae2cd8	ldrb w11,[x1, #0x14]
00ae2cdc	ldrb w2,[x1, #0x18]
00ae2ce0	ldrb w8,[x1, #0x15]
00ae2ce4	add w30,w28,w18
00ae2ce8	stp w2,w11,[sp, #0xb4]
00ae2cec	str w8,[sp, #0xdc]
00ae2cf0	ldrb w8,[x1, #0x19]
00ae2cf4	ldrb w12,[x1, #0x1c]
00ae2cf8	ldrb w3,[x1, #0x20]
00ae2cfc	str w8,[sp, #0xd8]
00ae2d00	ldrb w8,[x1, #0x1d]
00ae2d04	stp w3,w12,[sp, #0xac]
00ae2d08	ldrb w7,[x1, #0x24]
00ae2d0c	ldrb w15,[x1, #0x28]
00ae2d10	str w8,[sp, #0xd4]
00ae2d14	mov w8,#0x4519
00ae2d18	movk w8,#0x79cc, LSL #16
00ae2d1c	add w30,w30,w8
00ae2d20	ldr w8,[sp, #0xf0]
00ae2d24	ror w30,w30,#0x19
00ae2d28	eor w28,w30,w28
00ae2d2c	add w30,w29,w30
00ae2d30	lsl w29,w9,#0x18
00ae2d34	bfm w29,w8,#0x10,#0x7
00ae2d38	ldr w8,[sp, #0xe0]
00ae2d3c	lsl w9,w10,#0x18
00ae2d40	lsl w10,w11,#0x18
00ae2d44	ldrb w19,[x1, #0x21]
00ae2d48	bfm w9,w8,#0x10,#0x7
00ae2d4c	ldr w8,[sp, #0xdc]
00ae2d50	ldrb w21,[x1, #0x25]
00ae2d54	stp w15,w7,[sp, #0xa4]
00ae2d58	ldrb w13,[x1, #0x2c]
00ae2d5c	bfm w10,w8,#0x10,#0x7
00ae2d60	ldr w8,[sp, #0xd8]
00ae2d64	ldrb w20,[x1, #0x30]
00ae2d68	lsl w11,w2,#0x18
00ae2d6c	ldrb w22,[x1, #0x29]
00ae2d70	bfm w11,w8,#0x10,#0x7
00ae2d74	lsl w8,w12,#0x18
00ae2d78	ldr w12,[sp, #0xd4]
00ae2d7c	ldrb w23,[x1, #0x2d]
00ae2d80	stp w20,w13,[sp, #0x9c]
00ae2d84	ldrb w6,[x1, #0x34]
00ae2d88	ldrb w5,[x1, #0x38]
00ae2d8c	bfm w8,w12,#0x10,#0x7
00ae2d90	lsl w12,w3,#0x18
00ae2d94	ldrb w24,[x1, #0x31]
00ae2d98	bfm w12,w19,#0x10,#0x7
00ae2d9c	lsl w19,w7,#0x18
00ae2da0	ldrb w25,[x1, #0x35]
00ae2da4	stp w5,w6,[sp, #0x94]
00ae2da8	bfm w19,w21,#0x10,#0x7
00ae2dac	lsl w21,w15,#0x18
00ae2db0	ldrb w26,[x1, #0x39]
00ae2db4	bfm w21,w22,#0x10,#0x7
00ae2db8	lsl w22,w13,#0x18
00ae2dbc	bfm w22,w23,#0x10,#0x7
00ae2dc0	lsl w23,w20,#0x18
00ae2dc4	bfm w23,w24,#0x10,#0x7
00ae2dc8	lsl w24,w6,#0x18
00ae2dcc	bfm w24,w25,#0x10,#0x7
00ae2dd0	lsl w25,w5,#0x18
00ae2dd4	bfm w25,w26,#0x10,#0x7
00ae2dd8	eor w26,w16,w14
00ae2ddc	ldp w15,w14,[sp, #0xe8]
00ae2de0	ldrb w0,[x1, #0x3c]
00ae2de4	ldrb w27,[x1, #0x3d]
00ae2de8	stp w4,w17,[sp, #0xc0]
00ae2dec	eor w26,w26,w15
00ae2df0	mov w17,w15
00ae2df4	ldr w15,[sp, #0xf4]
00ae2df8	add w26,w26,w14
00ae2dfc	add w14,w26,w28
00ae2e00	ldrb w26,[x1, #0x12]
00ae2e04	bfm w29,w15,#0x18,#0x7
00ae2e08	ldrb w15,[x1, #0x1a]
00ae2e0c	lsl w13,w0,#0x18
00ae2e10	bfm w13,w27,#0x10,#0x7
00ae2e14	ldrb w27,[x1, #0x16]
00ae2e18	bfm w9,w26,#0x18,#0x7
00ae2e1c	ldrb w26,[x1, #0x1e]
00ae2e20	bfm w11,w15,#0x18,#0x7
00ae2e24	ldrb w15,[x1, #0x22]
00ae2e28	bfm w10,w27,#0x18,#0x7
00ae2e2c	ldrb w27,[x1, #0x26]
00ae2e30	bfm w8,w26,#0x18,#0x7
00ae2e34	ldrb w26,[x1, #0x2a]
00ae2e38	bfm w12,w15,#0x18,#0x7
00ae2e3c	ldrb w15,[x1, #0x2e]
00ae2e40	bfm w19,w27,#0x18,#0x7
00ae2e44	ldrb w27,[x1, #0xf]
00ae2e48	bfm w21,w26,#0x18,#0x7
00ae2e4c	ldrb w26,[x1, #0x32]
00ae2e50	bfm w22,w15,#0x18,#0x7
00ae2e54	ldrb w15,[x1, #0x13]
00ae2e58	orr w28,w29,w27
00ae2e5c	ldrb w27,[x1, #0x17]
00ae2e60	bfm w23,w26,#0x18,#0x7
00ae2e64	orr w26,w9,w15
00ae2e68	ldrb w15,[x1, #0x1b]
00ae2e6c	orr w5,w10,w27
00ae2e70	ldrb w27,[x1, #0x23]
00ae2e74	str w0,[sp, #0x90]
00ae2e78	orr w0,w11,w15
00ae2e7c	ldrb w15,[x1, #0x27]
00ae2e80	ldrb w29,[x1, #0x1f]
00ae2e84	orr w20,w12,w27
00ae2e88	ldrb w12,[x1, #0x2b]
00ae2e8c	orr w7,w19,w15
00ae2e90	ldrb w15,[x1, #0x33]
00ae2e94	orr w16,w8,w29
00ae2e98	ldrb w29,[x1, #0x2f]
00ae2e9c	orr w6,w21,w12
00ae2ea0	ldrb w12,[x1, #0x36]
00ae2ea4	orr w19,w23,w15
00ae2ea8	ldrb w15,[x1, #0x3a]
00ae2eac	ldrb w21,[x1, #0x3e]
00ae2eb0	orr w27,w22,w29
00ae2eb4	mov w22,w24
00ae2eb8	ldp w23,w10,[x1]
00ae2ebc	ldrb w9,[x1, #0x3f]
00ae2ec0	bfm w22,w12,#0x18,#0x7
00ae2ec4	mov w12,w25
00ae2ec8	bfm w12,w15,#0x18,#0x7
00ae2ecc	mov w15,w13
00ae2ed0	bfm w15,w21,#0x18,#0x7
00ae2ed4	rev w23,w23
00ae2ed8	ldrb w8,[x1, #0x3b]
00ae2edc	orr w2,w15,w9
00ae2ee0	ldr w9,[sp, #0xe4]
00ae2ee4	add w21,w30,w23
00ae2ee8	ldrb w30,[x1, #0x37]
00ae2eec	eor w29,w21,w21, ROR #0x17
00ae2ef0	orr w11,w12,w8
00ae2ef4	eor w8,w26,w23
00ae2ef8	ror w9,w9,#0xd
00ae2efc	eor w21,w29,w21, ROR #0xf
00ae2f00	orr w3,w22,w30
00ae2f04	add w22,w14,w8
00ae2f08	rev w8,w10
00ae2f0c	eor w10,w9,w18
00ae2f10	eor w10,w10,w21
00ae2f14	add w12,w8,w4
00ae2f18	add w10,w12,w10
00ae2f1c	eor w12,w16,w23
00ae2f20	extr w14,w3,w24,#0x11
00ae2f24	eor w12,w12,w14
00ae2f28	ldr w14,[x1, #0x8]
00ae2f2c	extr w15,w11,w25,#0x11
00ae2f30	eor w23,w20,w8
00ae2f34	eor w15,w23,w15
00ae2f38	rev w14,w14
00ae2f3c	extr w13,w2,w13,#0x11
00ae2f40	eor w23,w7,w14
00ae2f44	eor w23,w23,w13
00ae2f48	add w13,w14,w9
00ae2f4c	eor w9,w0,w14
00ae2f50	ldp w24,w14,[sp, #0xf8]
00ae2f54	eor w8,w5,w8
00ae2f58	mov w25,w2
00ae2f5c	mov w4,w3
00ae2f60	ror w14,w14,#0x17
00ae2f64	add w9,w9,w14
00ae2f68	eor w14,w14,w24
00ae2f6c	eor w14,w14,w22
00ae2f70	add w14,w14,w17
00ae2f74	add w8,w14,w8
00ae2f78	ldr w14,[sp, #0x88]
00ae2f7c	stp w3,w11,[sp, #0xf0]
00ae2f80	str w5,[sp, #0x84]
00ae2f84	mov w30,w27
00ae2f88	lsr w14,w14,#0x1
00ae2f8c	bfm w14,w28,#0x19,#0x18
00ae2f90	eor w14,w6,w14
00ae2f94	eor w14,w14,w12
00ae2f98	eor w14,w14,w12, ROR #0x11
00ae2f9c	eor w24,w14,w12, ROR #0x9
00ae2fa0	ldr w12,[sp, #0x8c]
00ae2fa4	mov w29,w7
00ae2fa8	str w18,[sp, #0xbc]
00ae2fac	mov w7,w11
00ae2fb0	lsr w12,w12,#0x1
00ae2fb4	bfm w12,w26,#0x19,#0x18
00ae2fb8	eor w12,w27,w12
00ae2fbc	eor w12,w12,w15
00ae2fc0	eor w12,w12,w15, ROR #0x11
00ae2fc4	eor w2,w12,w15, ROR #0x9
00ae2fc8	ldr w12,[sp, #0xb8]
00ae2fcc	mov w15,#0x8a32
00ae2fd0	movk w15,#0xf398, LSL #16
00ae2fd4	str w16,[sp, #0x5c]
00ae2fd8	lsr w12,w12,#0x1
00ae2fdc	bfm w12,w5,#0x19,#0x18
00ae2fe0	eor w12,w19,w12
00ae2fe4	eor w12,w12,w23
00ae2fe8	eor w12,w12,w23, ROR #0x11
00ae2fec	eor w17,w12,w23, ROR #0x9
00ae2ff0	ror w12,w22,#0x14
00ae2ff4	add w14,w21,w12
00ae2ff8	add w14,w14,w15
00ae2ffc	ror w14,w14,#0x19
00ae3000	eor w12,w14,w12
00ae3004	add w10,w10,w14
00ae3008	add w15,w8,w12
00ae300c	eor w8,w10,w10, ROR #0x17
00ae3010	eor w12,w8,w10, ROR #0xf
00ae3014	ldr w8,[sp, #0xf8]
00ae3018	eor w10,w16,w28
00ae301c	mov w23,w2
00ae3020	str w20,[sp, #0x50]
00ae3024	ror w8,w8,#0x17
00ae3028	add w10,w10,w8
00ae302c	eor w8,w22,w8
00ae3030	eor w8,w8,w15
00ae3034	add w8,w9,w8
00ae3038	ldr w9,[sp, #0xb4]
00ae303c	str w10,[sp, #0x8c]
00ae3040	eor w10,w6,w28
00ae3044	eor w10,w10,w24, ROR #0x11
00ae3048	lsr w9,w9,#0x1
00ae304c	bfm w9,w0,#0x19,#0x18
00ae3050	eor w9,w3,w9
00ae3054	eor w9,w9,w10
00ae3058	eor w9,w9,w10, ROR #0x11
00ae305c	eor w3,w9,w10, ROR #0x9
00ae3060	ldr w9,[sp, #0xb0]
00ae3064	eor w10,w27,w26
00ae3068	eor w10,w10,w2, ROR #0x11
00ae306c	mov w2,w17
00ae3070	lsr w9,w9,#0x1
00ae3074	bfm w9,w16,#0x19,#0x18
00ae3078	eor w9,w11,w9
00ae307c	eor w9,w9,w10
00ae3080	eor w9,w9,w10, ROR #0x11
00ae3084	eor w14,w9,w10, ROR #0x9
00ae3088	ldr w9,[sp, #0xac]
00ae308c	eor w10,w19,w5
00ae3090	eor w10,w10,w17, ROR #0x11
00ae3094	mov w17,w12
00ae3098	lsr w9,w9,#0x1
00ae309c	bfm w9,w20,#0x19,#0x18
00ae30a0	eor w9,w25,w9
00ae30a4	eor w9,w9,w10
00ae30a8	eor w9,w9,w10, ROR #0x11
00ae30ac	eor w5,w9,w10, ROR #0x9
00ae30b0	ror w9,w18,#0xd
00ae30b4	add w10,w28,w9
00ae30b8	eor w9,w21,w9
00ae30bc	eor w9,w9,w12
00ae30c0	str w10,[sp, #0x88]
00ae30c4	add w9,w13,w9
00ae30c8	ror w10,w15,#0x14
00ae30cc	mov w13,#0x1465
00ae30d0	add w12,w10,w12
00ae30d4	movk w13,#0xe731, LSL #16
00ae30d8	add w12,w12,w13
00ae30dc	ror w12,w12,#0x19
00ae30e0	eor w10,w12,w10
00ae30e4	mov w27,w19
00ae30e8	add w19,w8,w10
00ae30ec	ldr w8,[sp, #0xa8]
00ae30f0	add w13,w9,w12
00ae30f4	eor w9,w4,w0
00ae30f8	eor w9,w9,w3, ROR #0x11
00ae30fc	lsr w8,w8,#0x1
00ae3100	bfm w8,w29,#0x19,#0x18
00ae3104	eor w8,w24,w8
00ae3108	eor w8,w8,w9
00ae310c	eor w8,w8,w9, ROR #0x11
00ae3110	eor w18,w8,w9, ROR #0x9
00ae3114	ldr w8,[sp, #0xa4]
00ae3118	eor w9,w7,w16
00ae311c	eor w9,w9,w14, ROR #0x11
00ae3120	mov w12,w5
00ae3124	lsr w8,w8,#0x1
00ae3128	bfm w8,w6,#0x19,#0x18
00ae312c	eor w8,w23,w8
00ae3130	eor w8,w8,w9
00ae3134	eor w8,w8,w9, ROR #0x11
00ae3138	eor w28,w8,w9, ROR #0x9
00ae313c	ldr w8,[sp, #0xa0]
00ae3140	eor w9,w25,w20
00ae3144	eor w9,w9,w5, ROR #0x11
00ae3148	mov w11,w29
00ae314c	lsr w8,w8,#0x1
00ae3150	bfm w8,w30,#0x19,#0x18
00ae3154	eor w8,w2,w8
00ae3158	eor w8,w8,w9
00ae315c	eor w8,w8,w9, ROR #0x11
00ae3160	eor w5,w8,w9, ROR #0x9
00ae3164	eor w8,w13,w13, ROR #0x17
00ae3168	mov w29,w2
00ae316c	eor w2,w8,w13, ROR #0xf
00ae3170	ror w8,w22,#0x17
00ae3174	eor w9,w20,w26
00ae3178	add w4,w9,w8
00ae317c	ldr w9,[sp, #0x8c]
00ae3180	eor w8,w15,w8
00ae3184	eor w8,w8,w19
00ae3188	str w17,[sp, #0x7c]
00ae318c	add w7,w9,w8
00ae3190	ror w8,w21,#0xd
00ae3194	add w9,w26,w8
00ae3198	str w9,[sp, #0x80]
00ae319c	ldr w9,[sp, #0x88]
00ae31a0	eor w8,w17,w8
00ae31a4	eor w8,w8,w2
00ae31a8	mov w20,w11
00ae31ac	add w13,w9,w8
00ae31b0	ldr w8,[sp, #0x9c]
00ae31b4	eor w9,w24,w11
00ae31b8	eor w9,w9,w18, ROR #0x11
00ae31bc	str w11,[sp, #0x4c]
00ae31c0	lsr w8,w8,#0x1
00ae31c4	bfm w8,w27,#0x19,#0x18
00ae31c8	eor w8,w3,w8
00ae31cc	eor w8,w8,w9
00ae31d0	eor w8,w8,w9, ROR #0x11
00ae31d4	eor w16,w8,w9, ROR #0x9
00ae31d8	ldr w8,[sp, #0x98]
00ae31dc	ldp w11,w17,[sp, #0xf0]
00ae31e0	mov w10,w14
00ae31e4	eor w9,w23,w6
00ae31e8	lsr w8,w8,#0x1
00ae31ec	bfm w8,w11,#0x19,#0x18
00ae31f0	eor w8,w10,w8
00ae31f4	eor w9,w9,w28, ROR #0x11
00ae31f8	eor w8,w8,w9
00ae31fc	eor w8,w8,w9, ROR #0x11
00ae3200	stp w6,w30,[sp, #0xd4]
00ae3204	eor w6,w8,w9, ROR #0x9
00ae3208	ldr w8,[sp, #0x94]
00ae320c	eor w9,w29,w30
00ae3210	eor w9,w9,w5, ROR #0x11
00ae3214	mov w26,w10
00ae3218	lsr w8,w8,#0x1
00ae321c	bfm w8,w17,#0x19,#0x18
00ae3220	eor w8,w12,w8
00ae3224	eor w8,w8,w9
00ae3228	eor w8,w8,w9, ROR #0x11
00ae322c	eor w21,w8,w9, ROR #0x9
00ae3230	ror w8,w19,#0x14
00ae3234	mov w10,#0x28cb
00ae3238	add w9,w8,w2
00ae323c	movk w10,#0xce62, LSL #16
00ae3240	add w9,w9,w10
00ae3244	ror w9,w9,#0x19
00ae3248	eor w8,w9,w8
00ae324c	add w9,w13,w9
00ae3250	ldr w13,[sp, #0x84]
00ae3254	mov w14,w18
00ae3258	add w18,w7,w8
00ae325c	eor w8,w9,w9, ROR #0x17
00ae3260	eor w30,w8,w9, ROR #0xf
00ae3264	ror w9,w15,#0x17
00ae3268	eor w8,w20,w13
00ae326c	add w8,w8,w9
00ae3270	eor w9,w19,w9
00ae3274	eor w9,w9,w18
00ae3278	mov w22,w24
00ae327c	mov w24,w12
00ae3280	mov w12,w5
00ae3284	add w5,w4,w9
00ae3288	ldr w9,[sp, #0x90]
00ae328c	eor w10,w3,w27
00ae3290	eor w10,w10,w16, ROR #0x11
00ae3294	str w0,[sp, #0x78]
00ae3298	lsr w9,w9,#0x1
00ae329c	bfm w9,w25,#0x19,#0x18
00ae32a0	eor w9,w14,w9
00ae32a4	eor w9,w9,w10
00ae32a8	eor w9,w9,w10, ROR #0x11
00ae32ac	eor w7,w9,w10, ROR #0x9
00ae32b0	eor w9,w26,w11
00ae32b4	eor w9,w9,w6, ROR #0x11
00ae32b8	eor w10,w28,w22, ROR #0x19
00ae32bc	eor w10,w10,w9
00ae32c0	eor w10,w10,w9, ROR #0x11
00ae32c4	mov w0,w23
00ae32c8	eor w15,w10,w9, ROR #0x9
00ae32cc	eor w9,w24,w17
00ae32d0	eor w9,w9,w21, ROR #0x11
00ae32d4	eor w10,w12,w0, ROR #0x19
00ae32d8	eor w10,w10,w9
00ae32dc	eor w10,w10,w9, ROR #0x11
00ae32e0	str w8,[sp, #0x74]
00ae32e4	mov w8,w19
00ae32e8	mov w19,w14
00ae32ec	mov w14,w6
00ae32f0	eor w6,w10,w9, ROR #0x9
00ae32f4	ldp w9,w10,[sp, #0x7c]
00ae32f8	mov w23,w22
00ae32fc	str w22,[sp, #0xe0]
00ae3300	mov w22,w24
00ae3304	ror w9,w9,#0xd
00ae3308	add w4,w9,w13
00ae330c	eor w9,w2,w9
00ae3310	eor w9,w9,w30
00ae3314	add w9,w10,w9
00ae3318	ror w10,w18,#0x14
00ae331c	mov w13,#0x5197
00ae3320	mov w24,w0
00ae3324	str w0,[sp, #0x60]
00ae3328	mov w0,w12
00ae332c	add w12,w10,w30
00ae3330	movk w13,#0x9cc4, LSL #16
00ae3334	add w12,w12,w13
00ae3338	ror w12,w12,#0x19
00ae333c	eor w10,w12,w10
00ae3340	add w13,w9,w12
00ae3344	eor w9,w19,w25
00ae3348	add w12,w5,w10
00ae334c	eor w9,w9,w7, ROR #0x11
00ae3350	eor w10,w16,w29, ROR #0x19
00ae3354	eor w10,w10,w9
00ae3358	eor w10,w10,w9, ROR #0x11
00ae335c	eor w20,w10,w9, ROR #0x9
00ae3360	eor w9,w28,w23
00ae3364	eor w9,w9,w15, ROR #0x11
00ae3368	eor w10,w14,w3, ROR #0x19
00ae336c	eor w10,w10,w9
00ae3370	eor w10,w10,w9, ROR #0x11
00ae3374	eor w23,w10,w9, ROR #0x9
00ae3378	eor w9,w0,w24
00ae337c	eor w9,w9,w6, ROR #0x11
00ae3380	eor w10,w21,w26, ROR #0x19
00ae3384	eor w10,w10,w9
00ae3388	eor w10,w10,w9, ROR #0x11
00ae338c	eor w24,w10,w9, ROR #0x9
00ae3390	eor w9,w13,w13, ROR #0x17
00ae3394	str w25,[sp, #0xd0]
00ae3398	mov w25,w14
00ae339c	eor w14,w9,w13, ROR #0xf
00ae33a0	ror w9,w8,#0x17
00ae33a4	ldr w10,[sp, #0xd4]
00ae33a8	ldp w8,w11,[sp, #0x74]
00ae33ac	stp w3,w29,[sp, #0xb4]
00ae33b0	mov w5,w3
00ae33b4	str w27,[sp, #0xdc]
00ae33b8	eor w10,w10,w11
00ae33bc	add w3,w10,w9
00ae33c0	eor w9,w18,w9
00ae33c4	eor w9,w9,w12
00ae33c8	mov w27,w19
00ae33cc	mov w19,w16
00ae33d0	add w16,w8,w9
00ae33d4	ror w8,w2,#0xd
00ae33d8	add w9,w8,w11
00ae33dc	eor w8,w30,w8
00ae33e0	eor w8,w8,w14
00ae33e4	add w11,w4,w8
00ae33e8	eor w8,w19,w29
00ae33ec	str w9,[sp, #0x58]
00ae33f0	eor w8,w8,w20, ROR #0x11
00ae33f4	eor w9,w7,w22, ROR #0x19
00ae33f8	eor w9,w9,w8
00ae33fc	eor w9,w9,w8, ROR #0x11
00ae3400	eor w17,w9,w8, ROR #0x9
00ae3404	eor w8,w25,w5
00ae3408	eor w8,w8,w23, ROR #0x11
00ae340c	eor w9,w15,w27, ROR #0x19
00ae3410	eor w9,w9,w8
00ae3414	eor w9,w9,w8, ROR #0x11
00ae3418	eor w5,w9,w8, ROR #0x9
00ae341c	eor w8,w21,w26
00ae3420	eor w8,w8,w24, ROR #0x11
00ae3424	eor w9,w6,w28, ROR #0x19
00ae3428	eor w9,w9,w8
00ae342c	eor w9,w9,w8, ROR #0x11
00ae3430	mov w29,w21
00ae3434	eor w21,w9,w8, ROR #0x9
00ae3438	ror w8,w12,#0x14
00ae343c	mov w10,#0xa32f
00ae3440	add w9,w8,w14
00ae3444	movk w10,#0x3988, LSL #16
00ae3448	add w9,w9,w10
00ae344c	ror w9,w9,#0x19
00ae3450	eor w8,w9,w8
00ae3454	add w9,w11,w9
00ae3458	add w16,w16,w8
00ae345c	eor w8,w9,w9, ROR #0x17
00ae3460	eor w2,w8,w9, ROR #0xf
00ae3464	ldr w9,[sp, #0xd8]
00ae3468	ldr w10,[sp, #0x5c]
00ae346c	ror w8,w18,#0x17
00ae3470	str w26,[sp, #0xb0]
00ae3474	stp w27,w22,[sp, #0xa8]
00ae3478	eor w9,w9,w10
00ae347c	add w9,w8,w9
00ae3480	eor w8,w12,w8
00ae3484	eor w8,w8,w16
00ae3488	add w13,w3,w8
00ae348c	eor w8,w7,w22
00ae3490	str w9,[sp, #0x48]
00ae3494	eor w8,w8,w17, ROR #0x11
00ae3498	eor w9,w20,w0, ROR #0x19
00ae349c	eor w9,w9,w8
00ae34a0	eor w9,w9,w8, ROR #0x11
00ae34a4	eor w26,w9,w8, ROR #0x9
00ae34a8	eor w8,w15,w27
00ae34ac	eor w8,w8,w5, ROR #0x11
00ae34b0	eor w9,w23,w19, ROR #0x19
00ae34b4	eor w9,w9,w8
00ae34b8	eor w9,w9,w8, ROR #0x11
00ae34bc	stp w19,w0,[sp, #0x9c]
00ae34c0	mov w22,w19
00ae34c4	eor w19,w9,w8, ROR #0x9
00ae34c8	eor w8,w6,w28
00ae34cc	eor w8,w8,w21, ROR #0x11
00ae34d0	eor w9,w24,w25, ROR #0x19
00ae34d4	eor w9,w9,w8
00ae34d8	eor w9,w9,w8, ROR #0x11
00ae34dc	str w28,[sp, #0xa4]
00ae34e0	eor w28,w9,w8, ROR #0x9
00ae34e4	ldr w9,[sp, #0x58]
00ae34e8	ror w8,w30,#0xd
00ae34ec	mov w27,w15
00ae34f0	add w15,w8,w10
00ae34f4	eor w8,w14,w8
00ae34f8	eor w8,w8,w2
00ae34fc	add w8,w9,w8
00ae3500	ror w9,w16,#0x14
00ae3504	mov w18,#0x465e
00ae3508	add w10,w9,w2
00ae350c	movk w18,#0x7311, LSL #16
00ae3510	add w10,w10,w18
00ae3514	ror w10,w10,#0x19
00ae3518	eor w9,w10,w9
00ae351c	add w10,w8,w10
00ae3520	eor w8,w20,w0
00ae3524	mov w30,w2
00ae3528	add w2,w13,w9
00ae352c	eor w8,w8,w26, ROR #0x11
00ae3530	eor w9,w17,w29, ROR #0x19
00ae3534	eor w9,w9,w8
00ae3538	eor w9,w9,w8, ROR #0x11
00ae353c	mov w4,w7
00ae3540	mov w3,w24
00ae3544	eor w24,w9,w8, ROR #0x9
00ae3548	eor w8,w23,w22
00ae354c	eor w8,w8,w19, ROR #0x11
00ae3550	eor w9,w5,w4, ROR #0x19
00ae3554	eor w9,w9,w8
00ae3558	mov w11,w6
00ae355c	mov w6,w25
00ae3560	eor w9,w9,w8, ROR #0x11
00ae3564	str w25,[sp, #0x98]
00ae3568	eor w25,w9,w8, ROR #0x9
00ae356c	eor w8,w3,w6
00ae3570	eor w8,w8,w28, ROR #0x11
00ae3574	eor w9,w21,w27, ROR #0x19
00ae3578	eor w9,w9,w8
00ae357c	eor w9,w9,w8, ROR #0x11
00ae3580	mov w7,w23
00ae3584	eor w23,w9,w8, ROR #0x9
00ae3588	eor w8,w10,w10, ROR #0x17
00ae358c	eor w0,w8,w10, ROR #0xf
00ae3590	ldr w9,[sp, #0xdc]
00ae3594	ldr w10,[sp, #0x50]
00ae3598	ror w8,w12,#0x17
00ae359c	eor w13,w26,w11, ROR #0x19
00ae35a0	mov w6,w3
00ae35a4	eor w9,w9,w10
00ae35a8	add w18,w8,w9
00ae35ac	ldr w9,[sp, #0x48]
00ae35b0	eor w8,w16,w8
00ae35b4	eor w8,w8,w2
00ae35b8	mov w3,w21
00ae35bc	add w12,w9,w8
00ae35c0	ror w8,w14,#0xd
00ae35c4	add w9,w8,w10
00ae35c8	eor w8,w30,w8
00ae35cc	eor w8,w8,w0
00ae35d0	str w9,[sp, #0x3c]
00ae35d4	add w9,w15,w8
00ae35d8	eor w8,w17,w29
00ae35dc	eor w8,w8,w24, ROR #0x11
00ae35e0	eor w13,w13,w8
00ae35e4	eor w13,w13,w8, ROR #0x11
00ae35e8	eor w21,w13,w8, ROR #0x9
00ae35ec	eor w8,w5,w4
00ae35f0	eor w8,w8,w25, ROR #0x11
00ae35f4	eor w13,w19,w20, ROR #0x19
00ae35f8	eor w13,w13,w8
00ae35fc	eor w13,w13,w8, ROR #0x11
00ae3600	mov w22,w17
00ae3604	eor w17,w13,w8, ROR #0x9
00ae3608	eor w8,w3,w27
00ae360c	eor w8,w8,w23, ROR #0x11
00ae3610	eor w13,w28,w7, ROR #0x19
00ae3614	eor w13,w13,w8
00ae3618	eor w13,w13,w8, ROR #0x11
00ae361c	str w27,[sp, #0x8c]
00ae3620	mov w27,w3
00ae3624	mov w3,w7
00ae3628	str w7,[sp, #0x80]
00ae362c	eor w7,w13,w8, ROR #0x9
00ae3630	ror w8,w2,#0x14
00ae3634	mov w14,#0x8cbc
00ae3638	add w13,w8,w0
00ae363c	movk w14,#0xe622, LSL #16
00ae3640	add w13,w13,w14
00ae3644	ror w13,w13,#0x19
00ae3648	eor w8,w13,w8
00ae364c	add w9,w9,w13
00ae3650	add w12,w12,w8
00ae3654	eor w8,w9,w9, ROR #0x17
00ae3658	mov w10,w30
00ae365c	mov w30,w28
00ae3660	eor w28,w8,w9, ROR #0xf
00ae3664	ror w8,w16,#0x17
00ae3668	ldr w9,[sp, #0xf0]
00ae366c	ldr w16,[sp, #0x4c]
00ae3670	eor w15,w24,w6, ROR #0x19
00ae3674	mov w13,w6
00ae3678	stp w22,w6,[sp, #0x78]
00ae367c	eor w9,w9,w16
00ae3680	add w9,w8,w9
00ae3684	eor w8,w2,w8
00ae3688	eor w8,w8,w12
00ae368c	str w9,[sp, #0x38]
00ae3690	add w9,w18,w8
00ae3694	eor w8,w26,w11
00ae3698	eor w8,w8,w21, ROR #0x11
00ae369c	eor w15,w15,w8
00ae36a0	eor w15,w15,w8, ROR #0x11
00ae36a4	eor w6,w15,w8, ROR #0x9
00ae36a8	eor w8,w19,w20
00ae36ac	eor w8,w8,w17, ROR #0x11
00ae36b0	eor w15,w25,w22, ROR #0x19
00ae36b4	eor w15,w15,w8
00ae36b8	eor w15,w15,w8, ROR #0x11
00ae36bc	stp w4,w29,[sp, #0x90]
00ae36c0	mov w29,w5
00ae36c4	eor w5,w15,w8, ROR #0x9
00ae36c8	eor w8,w30,w3
00ae36cc	eor w8,w8,w7, ROR #0x11
00ae36d0	eor w15,w23,w29, ROR #0x19
00ae36d4	stp w20,w11,[sp, #0x84]
00ae36d8	eor w15,w15,w8
00ae36dc	ror w11,w10,#0xd
00ae36e0	ldr w10,[sp, #0x3c]
00ae36e4	eor w15,w15,w8, ROR #0x11
00ae36e8	eor w18,w15,w8, ROR #0x9
00ae36ec	add w8,w11,w16
00ae36f0	eor w11,w0,w11
00ae36f4	eor w11,w11,w28
00ae36f8	add w10,w10,w11
00ae36fc	ror w11,w12,#0x14
00ae3700	mov w16,#0x1979
00ae3704	add w15,w11,w28
00ae3708	movk w16,#0xcc45, LSL #16
00ae370c	add w15,w15,w16
00ae3710	ror w15,w15,#0x19
00ae3714	eor w11,w15,w11
00ae3718	add w20,w9,w11
00ae371c	eor w9,w24,w13
00ae3720	add w10,w10,w15
00ae3724	eor w9,w9,w6, ROR #0x11
00ae3728	eor w15,w21,w27, ROR #0x19
00ae372c	eor w15,w15,w9
00ae3730	eor w15,w15,w9, ROR #0x11
00ae3734	mov w14,w2
00ae3738	eor w2,w15,w9, ROR #0x9
00ae373c	eor w9,w25,w22
00ae3740	eor w9,w9,w5, ROR #0x11
00ae3744	eor w15,w17,w26, ROR #0x19
00ae3748	eor w15,w15,w9
00ae374c	eor w15,w15,w9, ROR #0x11
00ae3750	eor w11,w15,w9, ROR #0x9
00ae3754	eor w9,w23,w29
00ae3758	eor w9,w9,w18, ROR #0x11
00ae375c	eor w15,w7,w19, ROR #0x19
00ae3760	eor w15,w15,w9
00ae3764	eor w15,w15,w9, ROR #0x11
00ae3768	eor w13,w15,w9, ROR #0x9
00ae376c	ldr w15,[sp, #0xf4]
00ae3770	ldr w16,[sp, #0xd4]
00ae3774	eor w9,w10,w10, ROR #0x17
00ae3778	eor w4,w9,w10, ROR #0xf
00ae377c	ldr w10,[sp, #0x38]
00ae3780	ror w9,w14,#0x17
00ae3784	eor w15,w15,w16
00ae3788	add w22,w9,w15
00ae378c	eor w9,w12,w9
00ae3790	eor w9,w9,w20
00ae3794	add w14,w10,w9
00ae3798	ror w9,w0,#0xd
00ae379c	add w10,w9,w16
00ae37a0	eor w9,w28,w9
00ae37a4	eor w9,w9,w4
00ae37a8	add w8,w8,w9
00ae37ac	eor w9,w21,w27
00ae37b0	eor w9,w9,w2, ROR #0x11
00ae37b4	eor w16,w6,w30, ROR #0x19
00ae37b8	eor w16,w16,w9
00ae37bc	mov w3,w17
00ae37c0	eor w16,w16,w9, ROR #0x11
00ae37c4	eor w0,w16,w9, ROR #0x9
00ae37c8	eor w9,w3,w26
00ae37cc	eor w9,w9,w11, ROR #0x11
00ae37d0	eor w16,w5,w24, ROR #0x19
00ae37d4	eor w16,w16,w9
00ae37d8	eor w16,w16,w9, ROR #0x11
00ae37dc	stp w26,w27,[sp, #0x6c]
00ae37e0	mov w17,w18
00ae37e4	mov w27,w2
00ae37e8	eor w2,w16,w9, ROR #0x9
00ae37ec	eor w9,w7,w19
00ae37f0	eor w9,w9,w13, ROR #0x11
00ae37f4	eor w16,w17,w25, ROR #0x19
00ae37f8	eor w16,w16,w9
00ae37fc	eor w16,w16,w9, ROR #0x11
00ae3800	str w19,[sp, #0x68]
00ae3804	mov w26,w17
00ae3808	eor w17,w16,w9, ROR #0x9
00ae380c	ror w9,w20,#0x14
00ae3810	mov w19,#0x32f3
00ae3814	add w16,w9,w4
00ae3818	movk w19,#0x988a, LSL #16
00ae381c	add w16,w16,w19
00ae3820	ror w16,w16,#0x19
00ae3824	eor w9,w16,w9
00ae3828	add w8,w8,w16
00ae382c	mov w18,w7
00ae3830	add w7,w14,w9
00ae3834	eor w14,w8,w8, ROR #0x17
00ae3838	eor w15,w14,w8, ROR #0xf
00ae383c	eor w14,w6,w30
00ae3840	eor w14,w14,w0, ROR #0x11
00ae3844	eor w19,w27,w23, ROR #0x19
00ae3848	eor w19,w19,w14
00ae384c	eor w19,w19,w14, ROR #0x11
00ae3850	str w30,[sp, #0x64]
00ae3854	eor w30,w19,w14, ROR #0x9
00ae3858	eor w14,w5,w24
00ae385c	eor w14,w14,w2, ROR #0x11
00ae3860	eor w19,w11,w21, ROR #0x19
00ae3864	eor w19,w19,w14
00ae3868	eor w19,w19,w14, ROR #0x11
00ae386c	eor w16,w19,w14, ROR #0x9
00ae3870	eor w14,w26,w25
00ae3874	str w29,[sp, #0x74]
00ae3878	ldr w29,[sp, #0xd8]
00ae387c	ldr w9,[sp, #0xd0]
00ae3880	eor w14,w14,w17, ROR #0x11
00ae3884	eor w19,w13,w3, ROR #0x19
00ae3888	eor w19,w19,w14
00ae388c	str w10,[sp, #0x38]
00ae3890	eor w19,w19,w14, ROR #0x11
00ae3894	stp w25,w24,[sp, #0x58]
00ae3898	mov w24,w3
00ae389c	eor w3,w19,w14, ROR #0x9
00ae38a0	ldr w14,[sp, #0x38]
00ae38a4	ror w8,w12,#0x17
00ae38a8	eor w12,w9,w29
00ae38ac	mov w9,w13
00ae38b0	ror w13,w28,#0xd
00ae38b4	add w12,w8,w12
00ae38b8	eor w8,w20,w8
00ae38bc	add w29,w13,w29
00ae38c0	eor w13,w4,w13
00ae38c4	eor w8,w8,w7
00ae38c8	eor w13,w13,w15
00ae38cc	add w8,w22,w8
00ae38d0	add w13,w14,w13
00ae38d4	ror w14,w7,#0x14
00ae38d8	mov w22,#0x65e7
00ae38dc	mov w10,w15
00ae38e0	add w15,w14,w15
00ae38e4	movk w22,#0x3114, LSL #16
00ae38e8	add w15,w15,w22
00ae38ec	ror w15,w15,#0x19
00ae38f0	eor w14,w15,w14
00ae38f4	add w14,w8,w14
00ae38f8	eor w8,w27,w23
00ae38fc	add w13,w13,w15
00ae3900	eor w8,w8,w30, ROR #0x11
00ae3904	eor w15,w0,w18, ROR #0x19
00ae3908	eor w15,w15,w8
00ae390c	eor w15,w15,w8, ROR #0x11
00ae3910	eor w22,w15,w8, ROR #0x9
00ae3914	eor w8,w11,w21
00ae3918	eor w8,w8,w16, ROR #0x11
00ae391c	eor w15,w2,w6, ROR #0x19
00ae3920	eor w15,w15,w8
00ae3924	eor w15,w15,w8, ROR #0x11
00ae3928	eor w19,w15,w8, ROR #0x9
00ae392c	eor w8,w9,w24
00ae3930	eor w8,w8,w3, ROR #0x11
00ae3934	eor w15,w17,w5, ROR #0x19
00ae3938	eor w15,w15,w8
00ae393c	eor w15,w15,w8, ROR #0x11
00ae3940	stp w21,w23,[sp, #0x50]
00ae3944	mov w23,w11
00ae3948	mov w25,w9
00ae394c	eor w9,w15,w8, ROR #0x9
00ae3950	ldp w15,w11,[sp, #0xdc]
00ae3954	eor w8,w13,w13, ROR #0x17
00ae3958	eor w13,w8,w13, ROR #0xf
00ae395c	ror w8,w20,#0x17
00ae3960	eor w11,w11,w15
00ae3964	add w11,w8,w11
00ae3968	eor w8,w7,w8
00ae396c	mov w28,w10
00ae3970	eor w8,w8,w14
00ae3974	ror w10,w4,#0xd
00ae3978	add w8,w12,w8
00ae397c	add w12,w10,w15
00ae3980	str w12,[sp, #0x14]
00ae3984	eor w12,w0,w18
00ae3988	eor w12,w12,w22, ROR #0x11
00ae398c	eor w15,w30,w26, ROR #0x19
00ae3990	eor w15,w15,w12
00ae3994	eor w15,w15,w12, ROR #0x11
00ae3998	eor w10,w28,w10
00ae399c	mov w21,w28
00ae39a0	mov w28,w0
00ae39a4	stp w2,w0,[sp, #0x1c]
00ae39a8	eor w0,w15,w12, ROR #0x9
00ae39ac	eor w12,w2,w6
00ae39b0	eor w12,w12,w19, ROR #0x11
00ae39b4	eor w15,w16,w27, ROR #0x19
00ae39b8	eor w15,w15,w12
00ae39bc	eor w15,w15,w12, ROR #0x11
00ae39c0	stp w5,w6,[sp, #0x44]
00ae39c4	mov w6,w2
00ae39c8	mov w2,w19
00ae39cc	str w19,[sp, #0x34]
00ae39d0	eor w19,w15,w12, ROR #0x9
00ae39d4	eor w12,w17,w5
00ae39d8	eor w12,w12,w9, ROR #0x11
00ae39dc	eor w15,w3,w23, ROR #0x19
00ae39e0	eor w15,w15,w12
00ae39e4	eor w10,w10,w13
00ae39e8	eor w15,w15,w12, ROR #0x11
00ae39ec	add w10,w29,w10
00ae39f0	mov w20,w17
00ae39f4	eor w17,w15,w12, ROR #0x9
00ae39f8	ror w12,w14,#0x14
00ae39fc	mov w29,#0xcbce
00ae3a00	add w15,w12,w13
00ae3a04	movk w29,#0x6228, LSL #16
00ae3a08	add w15,w15,w29
00ae3a0c	ror w15,w15,#0x19
00ae3a10	eor w12,w15,w12
00ae3a14	add w15,w10,w15
00ae3a18	add w10,w8,w12
00ae3a1c	eor w8,w15,w15, ROR #0x17
00ae3a20	eor w12,w8,w15, ROR #0xf
00ae3a24	ror w8,w7,#0x17
00ae3a28	ldr w15,[sp, #0xf0]
00ae3a2c	ldr w7,[sp, #0x60]
00ae3a30	mov w5,w9
00ae3a34	stp w3,w9,[sp, #0x24]
00ae3a38	str w18,[sp, #0x10]
00ae3a3c	eor w9,w7,w15
00ae3a40	add w29,w8,w9
00ae3a44	eor w8,w14,w8
00ae3a48	mov w18,w26
00ae3a4c	eor w8,w8,w10
00ae3a50	stp w27,w26,[sp, #0x3c]
00ae3a54	add w26,w11,w8
00ae3a58	eor w8,w30,w18
00ae3a5c	eor w8,w8,w0, ROR #0x11
00ae3a60	eor w9,w22,w25, ROR #0x19
00ae3a64	eor w9,w9,w8
00ae3a68	eor w9,w9,w8, ROR #0x11
00ae3a6c	eor w18,w9,w8, ROR #0x9
00ae3a70	eor w8,w16,w27
00ae3a74	eor w9,w2,w28, ROR #0x19
00ae3a78	eor w8,w8,w19, ROR #0x11
00ae3a7c	eor w9,w9,w0
00ae3a80	eor w9,w9,w8
00ae3a84	eor w9,w9,w8, ROR #0x11
00ae3a88	eor w8,w9,w8, ROR #0x9
00ae3a8c	stp w8,w19,[sp, #0xd8]
00ae3a90	eor w8,w3,w23
00ae3a94	eor w9,w5,w6, ROR #0x19
00ae3a98	eor w8,w8,w17, ROR #0x11
00ae3a9c	eor w9,w9,w19
00ae3aa0	eor w9,w9,w8
00ae3aa4	eor w9,w9,w8, ROR #0x11
00ae3aa8	eor w8,w9,w8, ROR #0x9
00ae3aac	ldr w11,[sp, #0x14]
00ae3ab0	stp w8,w17,[sp, #0x2c]
00ae3ab4	ror w8,w21,#0xd
00ae3ab8	add w9,w8,w15
00ae3abc	eor w8,w13,w8
00ae3ac0	eor w8,w8,w12
00ae3ac4	str w16,[sp, #0x4c]
00ae3ac8	add w8,w11,w8
00ae3acc	ror w11,w10,#0x14
00ae3ad0	mov w16,#0x979c
00ae3ad4	add w15,w11,w12
00ae3ad8	movk w16,#0xc451, LSL #16
00ae3adc	add w15,w15,w16
00ae3ae0	ror w15,w15,#0x19
00ae3ae4	eor w11,w15,w11
00ae3ae8	add w15,w8,w15
00ae3aec	eor w8,w0,w20, ROR #0x19
00ae3af0	eor w16,w22,w25
00ae3af4	eor w8,w8,w17
00ae3af8	eor w16,w16,w18, ROR #0x11
00ae3afc	eor w8,w8,w16
00ae3b00	eor w8,w8,w16, ROR #0x11
00ae3b04	eor w8,w8,w16, ROR #0x9
00ae3b08	str w8,[sp, #0xf0]
00ae3b0c	ldr w17,[sp, #0xb8]
00ae3b10	ldr w8,[sp, #0xf4]
00ae3b14	eor w16,w15,w15, ROR #0x17
00ae3b18	ror w13,w13,#0xd
00ae3b1c	eor w15,w16,w15, ROR #0xf
00ae3b20	ror w14,w14,#0x17
00ae3b24	eor w16,w17,w8
00ae3b28	add w8,w13,w8
00ae3b2c	eor w13,w12,w13
00ae3b30	add w11,w26,w11
00ae3b34	add w16,w14,w16
00ae3b38	eor w14,w10,w14
00ae3b3c	eor w13,w13,w15
00ae3b40	str w30,[sp, #0xd4]
00ae3b44	eor w14,w14,w11
00ae3b48	add w9,w9,w13
00ae3b4c	ror w13,w11,#0x14
00ae3b50	mov w30,#0x2f39
00ae3b54	add w14,w29,w14
00ae3b58	add w29,w13,w15
00ae3b5c	movk w30,#0x88a3, LSL #16
00ae3b60	str w18,[sp, #0x38]
00ae3b64	add w29,w29,w30
00ae3b68	ldr w27,[sp, #0xd0]
00ae3b6c	ldr w18,[sp, #0xb4]
00ae3b70	ror w29,w29,#0x19
00ae3b74	eor w13,w29,w13
00ae3b78	add w9,w9,w29
00ae3b7c	add w13,w14,w13
00ae3b80	eor w14,w9,w9, ROR #0x17
00ae3b84	eor w9,w14,w9, ROR #0xf
00ae3b88	ror w10,w10,#0x17
00ae3b8c	eor w14,w18,w27
00ae3b90	add w14,w10,w14
00ae3b94	eor w10,w11,w10
00ae3b98	eor w10,w10,w13
00ae3b9c	ror w12,w12,#0xd
00ae3ba0	add w10,w16,w10
00ae3ba4	add w16,w12,w27
00ae3ba8	eor w12,w15,w12
00ae3bac	eor w12,w12,w9
00ae3bb0	add w8,w8,w12
00ae3bb4	ror w12,w13,#0x14
00ae3bb8	mov w30,#0x5e73
00ae3bbc	add w29,w12,w9
00ae3bc0	movk w30,#0x1146, LSL #16
00ae3bc4	mov w26,w0
00ae3bc8	add w29,w29,w30
00ae3bcc	ldr w27,[sp, #0xe0]
00ae3bd0	ldr w0,[sp, #0xb0]
00ae3bd4	ror w29,w29,#0x19
00ae3bd8	eor w12,w29,w12
00ae3bdc	add w8,w8,w29
00ae3be0	add w10,w10,w12
00ae3be4	eor w12,w8,w8, ROR #0x17
00ae3be8	eor w8,w12,w8, ROR #0xf
00ae3bec	ror w11,w11,#0x17
00ae3bf0	eor w12,w0,w27
00ae3bf4	add w12,w11,w12
00ae3bf8	eor w11,w13,w11
00ae3bfc	eor w11,w11,w10
00ae3c00	add w11,w14,w11
00ae3c04	ror w14,w15,#0xd
00ae3c08	add w15,w14,w27
00ae3c0c	eor w14,w9,w14
00ae3c10	eor w14,w14,w8
00ae3c14	add w14,w16,w14
00ae3c18	ror w16,w10,#0x14
00ae3c1c	mov w30,#0xbce6
00ae3c20	add w29,w16,w8
00ae3c24	movk w30,#0x228c, LSL #16
00ae3c28	add w29,w29,w30
00ae3c2c	ldr w19,[sp, #0xac]
00ae3c30	ror w29,w29,#0x19
00ae3c34	eor w16,w29,w16
00ae3c38	add w14,w14,w29
00ae3c3c	add w11,w11,w16
00ae3c40	eor w16,w14,w14, ROR #0x17
00ae3c44	ror w9,w9,#0xd
00ae3c48	eor w14,w16,w14, ROR #0xf
00ae3c4c	ror w13,w13,#0x17
00ae3c50	eor w16,w19,w7
00ae3c54	orr w29,w11,w10
00ae3c58	eor w30,w8,w9
00ae3c5c	add w16,w13,w16
00ae3c60	and w13,w29,w13
00ae3c64	and w29,w11,w10
00ae3c68	and w30,w14,w30
00ae3c6c	orr w13,w13,w29
00ae3c70	add w29,w9,w7
00ae3c74	eor w9,w30,w9
00ae3c78	add w9,w15,w9
00ae3c7c	mov w15,#0x7a87
00ae3c80	add w12,w12,w13
00ae3c84	ror w13,w11,#0x14
00ae3c88	movk w15,#0x9d8a, LSL #16
00ae3c8c	add w15,w13,w15
00ae3c90	add w15,w15,w14
00ae3c94	mov x3,x1
00ae3c98	ldr w1,[sp, #0xa8]
00ae3c9c	ror w15,w15,#0x19
00ae3ca0	eor w13,w15,w13
00ae3ca4	add w9,w9,w15
00ae3ca8	add w12,w12,w13
00ae3cac	eor w13,w9,w9, ROR #0x17
00ae3cb0	eor w9,w13,w9, ROR #0xf
00ae3cb4	ror w10,w10,#0x17
00ae3cb8	eor w13,w1,w17
00ae3cbc	orr w15,w12,w11
00ae3cc0	ror w8,w8,#0xd
00ae3cc4	add w13,w10,w13
00ae3cc8	and w10,w15,w10
00ae3ccc	and w15,w12,w11
00ae3cd0	eor w30,w14,w8
00ae3cd4	orr w10,w10,w15
00ae3cd8	add w15,w8,w17
00ae3cdc	and w30,w9,w30
00ae3ce0	mov w17,#0xf50f
00ae3ce4	eor w8,w30,w8
00ae3ce8	add w10,w16,w10
00ae3cec	ror w16,w12,#0x14
00ae3cf0	movk w17,#0x3b14, LSL #16
00ae3cf4	add w8,w29,w8
00ae3cf8	add w29,w16,w17
00ae3cfc	add w29,w29,w9
00ae3d00	ldr w2,[sp, #0xa4]
00ae3d04	ror w29,w29,#0x19
00ae3d08	eor w16,w29,w16
00ae3d0c	add w8,w8,w29
00ae3d10	add w10,w10,w16
00ae3d14	eor w16,w8,w8, ROR #0x17
00ae3d18	ror w14,w14,#0xd
00ae3d1c	eor w8,w16,w8, ROR #0xf
00ae3d20	ror w11,w11,#0x17
00ae3d24	eor w16,w2,w18
00ae3d28	orr w29,w10,w12
00ae3d2c	eor w30,w9,w14
00ae3d30	add w16,w11,w16
00ae3d34	and w11,w29,w11
00ae3d38	and w29,w10,w12
00ae3d3c	and w30,w8,w30
00ae3d40	orr w11,w11,w29
00ae3d44	add w29,w14,w18
00ae3d48	eor w14,w30,w14
00ae3d4c	add w11,w13,w11
00ae3d50	add w13,w15,w14
00ae3d54	mov w15,#0xea1e
00ae3d58	ror w14,w10,#0x14
00ae3d5c	movk w15,#0x7629, LSL #16
00ae3d60	add w15,w14,w15
00ae3d64	add w15,w15,w8
00ae3d68	ldr w18,[sp, #0xa0]
00ae3d6c	ror w15,w15,#0x19
00ae3d70	eor w14,w15,w14
00ae3d74	add w13,w13,w15
00ae3d78	add w11,w11,w14
00ae3d7c	eor w14,w13,w13, ROR #0x17
00ae3d80	eor w13,w14,w13, ROR #0xf
00ae3d84	ror w12,w12,#0x17
00ae3d88	eor w14,w18,w0
00ae3d8c	orr w15,w11,w10
00ae3d90	ror w9,w9,#0xd
00ae3d94	add w14,w12,w14
00ae3d98	and w12,w15,w12
00ae3d9c	and w15,w11,w10
00ae3da0	eor w30,w8,w9
00ae3da4	orr w12,w12,w15
00ae3da8	and w30,w13,w30
00ae3dac	mov w17,#0xd43c
00ae3db0	add w15,w9,w0
00ae3db4	eor w9,w30,w9
00ae3db8	add w12,w16,w12
00ae3dbc	ror w16,w11,#0x14
00ae3dc0	movk w17,#0xec53, LSL #16
00ae3dc4	add w9,w29,w9
00ae3dc8	add w29,w16,w17
00ae3dcc	add w29,w29,w13
00ae3dd0	ldr w27,[sp, #0x9c]
00ae3dd4	ror w29,w29,#0x19
00ae3dd8	eor w16,w29,w16
00ae3ddc	add w9,w9,w29
00ae3de0	add w12,w12,w16
00ae3de4	eor w16,w9,w9, ROR #0x17
00ae3de8	ror w8,w8,#0xd
00ae3dec	eor w9,w16,w9, ROR #0xf
00ae3df0	ror w10,w10,#0x17
00ae3df4	eor w16,w27,w19
00ae3df8	orr w29,w12,w11
00ae3dfc	eor w30,w13,w8
00ae3e00	add w16,w10,w16
00ae3e04	and w10,w29,w10
00ae3e08	and w29,w12,w11
00ae3e0c	and w30,w9,w30
00ae3e10	orr w10,w10,w29
00ae3e14	add w29,w8,w19
00ae3e18	eor w8,w30,w8
00ae3e1c	add w8,w15,w8
00ae3e20	mov w15,#0xa879
00ae3e24	add w10,w14,w10
00ae3e28	ror w14,w12,#0x14
00ae3e2c	movk w15,#0xd8a7, LSL #16
00ae3e30	add w15,w14,w15
00ae3e34	add w15,w15,w9
00ae3e38	ldr w0,[sp, #0x98]
00ae3e3c	ror w15,w15,#0x19
00ae3e40	mov w17,w19
00ae3e44	eor w14,w15,w14
00ae3e48	add w8,w8,w15
00ae3e4c	add w10,w10,w14
00ae3e50	eor w14,w8,w8, ROR #0x17
00ae3e54	mov w17,w1
00ae3e58	eor w8,w14,w8, ROR #0xf
00ae3e5c	ror w11,w11,#0x17
00ae3e60	eor w14,w0,w17
00ae3e64	orr w15,w10,w12
00ae3e68	ror w13,w13,#0xd
00ae3e6c	add w14,w11,w14
00ae3e70	and w11,w15,w11
00ae3e74	and w15,w10,w12
00ae3e78	eor w30,w9,w13
00ae3e7c	orr w11,w11,w15
00ae3e80	add w15,w13,w17
00ae3e84	and w30,w8,w30
00ae3e88	mov w17,#0x50f3
00ae3e8c	eor w13,w30,w13
00ae3e90	add w11,w16,w11
00ae3e94	ror w16,w10,#0x14
00ae3e98	movk w17,#0xb14f, LSL #16
00ae3e9c	add w13,w29,w13
00ae3ea0	add w29,w16,w17
00ae3ea4	add w29,w29,w8
00ae3ea8	mov w17,w2
00ae3eac	ldr w2,[sp, #0x94]
00ae3eb0	ror w29,w29,#0x19
00ae3eb4	eor w16,w29,w16
00ae3eb8	add w13,w13,w29
00ae3ebc	add w11,w11,w16
00ae3ec0	eor w16,w13,w13, ROR #0x17
00ae3ec4	ror w9,w9,#0xd
00ae3ec8	eor w13,w16,w13, ROR #0xf
00ae3ecc	ror w12,w12,#0x17
00ae3ed0	eor w16,w2,w17
00ae3ed4	orr w29,w11,w10
00ae3ed8	eor w30,w8,w9
00ae3edc	add w16,w12,w16
00ae3ee0	and w12,w29,w12
00ae3ee4	and w29,w11,w10
00ae3ee8	and w30,w13,w30
00ae3eec	orr w12,w12,w29
00ae3ef0	add w29,w9,w17
00ae3ef4	eor w9,w30,w9
00ae3ef8	add w9,w15,w9
00ae3efc	mov w15,#0xa1e7
00ae3f00	add w12,w14,w12
00ae3f04	ror w14,w11,#0x14
00ae3f08	movk w15,#0x629e, LSL #16
00ae3f0c	add w15,w14,w15
00ae3f10	add w15,w15,w13
00ae3f14	mov w17,w18
00ae3f18	ldr w18,[sp, #0x90]
00ae3f1c	ror w15,w15,#0x19
00ae3f20	eor w14,w15,w14
00ae3f24	add w9,w9,w15
00ae3f28	add w12,w12,w14
00ae3f2c	eor w14,w9,w9, ROR #0x17
00ae3f30	eor w9,w14,w9, ROR #0xf
00ae3f34	ror w10,w10,#0x17
00ae3f38	eor w14,w18,w17
00ae3f3c	orr w15,w12,w11
00ae3f40	ror w8,w8,#0xd
00ae3f44	add w14,w10,w14
00ae3f48	and w10,w15,w10
00ae3f4c	and w15,w12,w11
00ae3f50	eor w30,w13,w8
00ae3f54	orr w10,w10,w15
00ae3f58	add w15,w8,w17
00ae3f5c	and w30,w9,w30
00ae3f60	mov w17,#0x43ce
00ae3f64	eor w8,w30,w8
00ae3f68	add w10,w16,w10
00ae3f6c	ror w16,w12,#0x14
00ae3f70	movk w17,#0xc53d, LSL #16
00ae3f74	add w8,w29,w8
00ae3f78	add w29,w16,w17
00ae3f7c	add w29,w29,w9
00ae3f80	mov w17,w27
00ae3f84	ldr w27,[sp, #0x8c]
00ae3f88	ror w29,w29,#0x19
00ae3f8c	eor w16,w29,w16
00ae3f90	add w8,w8,w29
00ae3f94	add w10,w10,w16
00ae3f98	eor w16,w8,w8, ROR #0x17
00ae3f9c	ror w13,w13,#0xd
00ae3fa0	eor w8,w16,w8, ROR #0xf
00ae3fa4	ror w11,w11,#0x17
00ae3fa8	eor w16,w27,w17
00ae3fac	orr w29,w10,w12
00ae3fb0	eor w30,w9,w13
00ae3fb4	add w16,w11,w16
00ae3fb8	and w11,w29,w11
00ae3fbc	and w29,w10,w12
00ae3fc0	and w30,w8,w30
00ae3fc4	orr w11,w11,w29
00ae3fc8	add w29,w13,w17
00ae3fcc	eor w13,w30,w13
00ae3fd0	add w13,w15,w13
00ae3fd4	mov w15,#0x879d
00ae3fd8	add w11,w14,w11
00ae3fdc	ror w14,w10,#0x14
00ae3fe0	movk w15,#0x8a7a, LSL #16
00ae3fe4	add w15,w14,w15
00ae3fe8	add w15,w15,w8
00ae3fec	ldr w19,[sp, #0x88]
00ae3ff0	ror w15,w15,#0x19
00ae3ff4	eor w14,w15,w14
00ae3ff8	add w13,w13,w15
00ae3ffc	add w11,w11,w14
00ae4000	eor w14,w13,w13, ROR #0x17
00ae4004	mov w17,w0
00ae4008	eor w13,w14,w13, ROR #0xf
00ae400c	ror w12,w12,#0x17
00ae4010	eor w14,w19,w17
00ae4014	orr w15,w11,w10
00ae4018	ror w9,w9,#0xd
00ae401c	add w14,w12,w14
00ae4020	and w12,w15,w12
00ae4024	and w15,w11,w10
00ae4028	eor w30,w8,w9
00ae402c	orr w12,w12,w15
00ae4030	add w15,w9,w17
00ae4034	and w30,w13,w30
00ae4038	mov w17,#0xf3b
00ae403c	eor w9,w30,w9
00ae4040	add w12,w16,w12
00ae4044	ror w16,w11,#0x14
00ae4048	movk w17,#0x14f5, LSL #16
00ae404c	add w9,w29,w9
00ae4050	add w29,w16,w17
00ae4054	add w29,w29,w13
00ae4058	mov w17,w2
00ae405c	ldr w2,[sp, #0x84]
00ae4060	ror w29,w29,#0x19
00ae4064	eor w16,w29,w16
00ae4068	add w9,w9,w29
00ae406c	add w12,w12,w16
00ae4070	eor w16,w9,w9, ROR #0x17
00ae4074	ror w8,w8,#0xd
00ae4078	eor w9,w16,w9, ROR #0xf
00ae407c	ror w10,w10,#0x17
00ae4080	eor w16,w2,w17
00ae4084	orr w29,w12,w11
00ae4088	eor w30,w13,w8
00ae408c	add w16,w10,w16
00ae4090	and w10,w29,w10
00ae4094	and w29,w12,w11
00ae4098	and w30,w9,w30
00ae409c	orr w10,w10,w29
00ae40a0	add w29,w8,w17
00ae40a4	eor w8,w30,w8
00ae40a8	add w8,w15,w8
00ae40ac	mov w15,#0x1e76
00ae40b0	add w10,w14,w10
00ae40b4	ror w14,w12,#0x14
00ae40b8	movk w15,#0x29ea, LSL #16
00ae40bc	add w15,w14,w15
00ae40c0	add w15,w15,w9
00ae40c4	mov w17,w18
00ae40c8	ldr w18,[sp, #0x80]
00ae40cc	ror w15,w15,#0x19
00ae40d0	eor w14,w15,w14
00ae40d4	add w8,w8,w15
00ae40d8	add w10,w10,w14
00ae40dc	eor w14,w8,w8, ROR #0x17
00ae40e0	eor w8,w14,w8, ROR #0xf
00ae40e4	ror w11,w11,#0x17
00ae40e8	eor w14,w18,w17
00ae40ec	orr w15,w10,w12
00ae40f0	ror w13,w13,#0xd
00ae40f4	add w14,w11,w14
00ae40f8	and w11,w15,w11
00ae40fc	and w15,w10,w12
00ae4100	eor w30,w9,w13
00ae4104	orr w11,w11,w15
00ae4108	add w15,w13,w17
00ae410c	and w30,w8,w30
00ae4110	mov w17,#0x3cec
00ae4114	eor w13,w30,w13
00ae4118	add w11,w16,w11
00ae411c	ror w16,w10,#0x14
00ae4120	movk w17,#0x53d4, LSL #16
00ae4124	add w13,w29,w13
00ae4128	add w29,w16,w17
00ae412c	add w29,w29,w8
00ae4130	mov w17,w27
00ae4134	ldr w27,[sp, #0x7c]
00ae4138	ror w29,w29,#0x19
00ae413c	eor w16,w29,w16
00ae4140	add w13,w13,w29
00ae4144	add w11,w11,w16
00ae4148	eor w16,w13,w13, ROR #0x17
00ae414c	ror w9,w9,#0xd
00ae4150	eor w13,w16,w13, ROR #0xf
00ae4154	ror w12,w12,#0x17
00ae4158	eor w16,w27,w17
00ae415c	orr w29,w11,w10
00ae4160	eor w30,w8,w9
00ae4164	add w16,w12,w16
00ae4168	and w12,w29,w12
00ae416c	and w29,w11,w10
00ae4170	and w30,w13,w30
00ae4174	orr w12,w12,w29
00ae4178	add w29,w9,w17
00ae417c	eor w9,w30,w9
00ae4180	add w9,w15,w9
00ae4184	mov w15,#0x79d8
00ae4188	add w12,w14,w12
00ae418c	ror w14,w11,#0x14
00ae4190	movk w15,#0xa7a8, LSL #16
00ae4194	add w15,w14,w15
00ae4198	add w15,w15,w13
00ae419c	ldr w0,[sp, #0x78]
00ae41a0	ror w15,w15,#0x19
00ae41a4	eor w14,w15,w14
00ae41a8	add w9,w9,w15
00ae41ac	add w12,w12,w14
00ae41b0	eor w14,w9,w9, ROR #0x17
00ae41b4	mov w17,w19
00ae41b8	eor w9,w14,w9, ROR #0xf
00ae41bc	ror w10,w10,#0x17
00ae41c0	eor w14,w0,w17
00ae41c4	orr w15,w12,w11
00ae41c8	ror w8,w8,#0xd
00ae41cc	add w14,w10,w14
00ae41d0	and w10,w15,w10
00ae41d4	and w15,w12,w11
00ae41d8	eor w30,w13,w8
00ae41dc	orr w10,w10,w15
00ae41e0	add w15,w8,w17
00ae41e4	and w30,w9,w30
00ae41e8	mov w17,#0xf3b1
00ae41ec	eor w8,w30,w8
00ae41f0	add w10,w16,w10
00ae41f4	ror w16,w12,#0x14
00ae41f8	movk w17,#0x4f50, LSL #16
00ae41fc	add w8,w29,w8
00ae4200	add w29,w16,w17
00ae4204	add w29,w29,w9
00ae4208	mov w17,w2
00ae420c	ldr w2,[sp, #0x74]
00ae4210	ror w29,w29,#0x19
00ae4214	eor w16,w29,w16
00ae4218	add w8,w8,w29
00ae421c	add w10,w10,w16
00ae4220	eor w16,w8,w8, ROR #0x17
00ae4224	ror w13,w13,#0xd
00ae4228	eor w8,w16,w8, ROR #0xf
00ae422c	ror w11,w11,#0x17
00ae4230	eor w16,w2,w17
00ae4234	orr w29,w10,w12
00ae4238	eor w30,w9,w13
00ae423c	add w16,w11,w16
00ae4240	and w11,w29,w11
00ae4244	and w29,w10,w12
00ae4248	and w30,w8,w30
00ae424c	orr w11,w11,w29
00ae4250	add w29,w13,w17
00ae4254	eor w13,w30,w13
00ae4258	add w13,w15,w13
00ae425c	mov w15,#0xe762
00ae4260	add w11,w14,w11
00ae4264	ror w14,w10,#0x14
00ae4268	movk w15,#0x9ea1, LSL #16
00ae426c	add w15,w14,w15
00ae4270	add w15,w15,w8
00ae4274	mov w17,w18
00ae4278	ldr w18,[sp, #0x70]
00ae427c	ror w15,w15,#0x19
00ae4280	eor w14,w15,w14
00ae4284	add w13,w13,w15
00ae4288	add w11,w11,w14
00ae428c	eor w14,w13,w13, ROR #0x17
00ae4290	eor w13,w14,w13, ROR #0xf
00ae4294	ror w12,w12,#0x17
00ae4298	eor w14,w18,w17
00ae429c	orr w15,w11,w10
00ae42a0	ror w9,w9,#0xd
00ae42a4	add w14,w12,w14
00ae42a8	and w12,w15,w12
00ae42ac	and w15,w11,w10
00ae42b0	eor w30,w8,w9
00ae42b4	orr w12,w12,w15
00ae42b8	and w30,w13,w30
00ae42bc	mov w19,#0xcec5
00ae42c0	add w15,w9,w17
00ae42c4	eor w9,w30,w9
00ae42c8	add w12,w16,w12
00ae42cc	ror w16,w11,#0x14
00ae42d0	movk w19,#0x3d43, LSL #16
00ae42d4	add w9,w29,w9
00ae42d8	add w29,w16,w19
00ae42dc	add w29,w29,w13
00ae42e0	mov w17,w27
00ae42e4	ldr w27,[sp, #0x6c]
00ae42e8	ror w29,w29,#0x19
00ae42ec	eor w16,w29,w16
00ae42f0	add w9,w9,w29
00ae42f4	add w12,w12,w16
00ae42f8	eor w16,w9,w9, ROR #0x17
00ae42fc	eor w9,w16,w9, ROR #0xf
00ae4300	ror w10,w10,#0x17
00ae4304	eor w16,w27,w17
00ae4308	orr w29,w12,w11
00ae430c	ror w8,w8,#0xd
00ae4310	add w16,w10,w16
00ae4314	and w10,w29,w10
00ae4318	and w29,w12,w11
00ae431c	eor w30,w13,w8
00ae4320	orr w10,w10,w29
00ae4324	and w30,w9,w30
00ae4328	add w29,w8,w17
00ae432c	eor w8,w30,w8
00ae4330	add w10,w14,w10
00ae4334	ror w14,w12,#0x14
00ae4338	mov w30,#0x9d8a
00ae433c	add w8,w15,w8
00ae4340	add w15,w14,w9
00ae4344	movk w30,#0x7a87, LSL #16
00ae4348	add w15,w15,w30
00ae434c	mov w17,w0
00ae4350	ldr w0,[sp, #0x68]
00ae4354	ror w15,w15,#0x19
00ae4358	eor w14,w15,w14
00ae435c	add w8,w8,w15
00ae4360	add w10,w10,w14
00ae4364	eor w14,w8,w8, ROR #0x17
00ae4368	eor w8,w14,w8, ROR #0xf
00ae436c	ror w11,w11,#0x17
00ae4370	eor w14,w0,w17
00ae4374	orr w15,w10,w12
00ae4378	ror w13,w13,#0xd
00ae437c	add w14,w11,w14
00ae4380	and w11,w15,w11
00ae4384	and w15,w10,w12
00ae4388	eor w30,w9,w13
00ae438c	orr w11,w11,w15
00ae4390	and w30,w8,w30
00ae4394	add w15,w13,w17
00ae4398	eor w13,w30,w13
00ae439c	add w11,w16,w11
00ae43a0	ror w16,w10,#0x14
00ae43a4	mov w30,#0x3b14
00ae43a8	add w13,w29,w13
00ae43ac	add w29,w16,w8
00ae43b0	movk w30,#0xf50f, LSL #16
00ae43b4	add w29,w29,w30
00ae43b8	ldr w4,[sp, #0x64]
00ae43bc	ror w29,w29,#0x19
00ae43c0	eor w16,w29,w16
00ae43c4	add w13,w13,w29
00ae43c8	add w11,w11,w16
00ae43cc	eor w16,w13,w13, ROR #0x17
00ae43d0	eor w13,w16,w13, ROR #0xf
00ae43d4	ror w12,w12,#0x17
00ae43d8	eor w16,w4,w2
00ae43dc	orr w29,w11,w10
00ae43e0	ror w9,w9,#0xd
00ae43e4	add w16,w12,w16
00ae43e8	and w12,w29,w12
00ae43ec	and w29,w11,w10
00ae43f0	eor w30,w8,w9
00ae43f4	orr w12,w12,w29
00ae43f8	and w30,w13,w30
00ae43fc	add w29,w9,w2
00ae4400	eor w9,w30,w9
00ae4404	add w12,w14,w12
00ae4408	ror w14,w11,#0x14
00ae440c	mov w30,#0x7629
00ae4410	add w9,w15,w9
00ae4414	add w15,w14,w13
00ae4418	movk w30,#0xea1e, LSL #16
00ae441c	mov w17,w2
00ae4420	add w15,w15,w30
00ae4424	ldr w2,[sp, #0x5c]
00ae4428	ror w15,w15,#0x19
00ae442c	eor w14,w15,w14
00ae4430	add w9,w9,w15
00ae4434	add w12,w12,w14
00ae4438	eor w14,w9,w9, ROR #0x17
00ae443c	mov w17,w18
00ae4440	eor w9,w14,w9, ROR #0xf
00ae4444	ror w10,w10,#0x17
00ae4448	eor w14,w2,w17
00ae444c	orr w15,w12,w11
00ae4450	ror w8,w8,#0xd
00ae4454	add w14,w10,w14
00ae4458	and w10,w15,w10
00ae445c	and w15,w12,w11
00ae4460	eor w30,w13,w8
00ae4464	orr w10,w10,w15
00ae4468	and w30,w9,w30
00ae446c	add w15,w8,w17
00ae4470	eor w8,w30,w8
00ae4474	add w10,w16,w10
00ae4478	ror w16,w12,#0x14
00ae447c	mov w30,#0xec53
00ae4480	add w8,w29,w8
00ae4484	add w29,w16,w9
00ae4488	movk w30,#0xd43c, LSL #16
00ae448c	mov x1,x3
00ae4490	add w29,w29,w30
00ae4494	ldr w3,[sp, #0x58]
00ae4498	ror w29,w29,#0x19
00ae449c	eor w16,w29,w16
00ae44a0	add w8,w8,w29
00ae44a4	add w10,w10,w16
00ae44a8	eor w16,w8,w8, ROR #0x17
00ae44ac	eor w8,w16,w8, ROR #0xf
00ae44b0	ror w11,w11,#0x17
00ae44b4	eor w16,w3,w27
00ae44b8	orr w29,w10,w12
00ae44bc	ror w13,w13,#0xd
00ae44c0	add w16,w11,w16
00ae44c4	and w11,w29,w11
00ae44c8	and w29,w10,w12
00ae44cc	eor w30,w9,w13
00ae44d0	orr w11,w11,w29
00ae44d4	and w30,w8,w30
00ae44d8	add w29,w13,w27
00ae44dc	eor w13,w30,w13
00ae44e0	add w11,w14,w11
00ae44e4	ror w14,w10,#0x14
00ae44e8	mov w30,#0xd8a7
00ae44ec	mov w17,w27
00ae44f0	add w13,w15,w13
00ae44f4	add w15,w14,w8
00ae44f8	movk w30,#0xa879, LSL #16
00ae44fc	add w15,w15,w30
00ae4500	mov w17,w0
00ae4504	ldr w0,[sp, #0x54]
00ae4508	ror w15,w15,#0x19
00ae450c	eor w14,w15,w14
00ae4510	add w13,w13,w15
00ae4514	add w11,w11,w14
00ae4518	eor w14,w13,w13, ROR #0x17
00ae451c	eor w13,w14,w13, ROR #0xf
00ae4520	ror w12,w12,#0x17
00ae4524	eor w14,w0,w17
00ae4528	orr w15,w11,w10
00ae452c	ror w9,w9,#0xd
00ae4530	add w14,w12,w14
00ae4534	and w12,w15,w12
00ae4538	and w15,w11,w10
00ae453c	eor w30,w8,w9
00ae4540	orr w12,w12,w15
00ae4544	and w30,w13,w30
00ae4548	add w15,w9,w17
00ae454c	eor w9,w30,w9
00ae4550	add w12,w16,w12
00ae4554	ror w16,w11,#0x14
00ae4558	mov w27,#0xb14f
00ae455c	add w9,w29,w9
00ae4560	add w29,w16,w13
00ae4564	movk w27,#0x50f3, LSL #16
00ae4568	add w29,w29,w27
00ae456c	ldr w18,[sp, #0x50]
00ae4570	ror w29,w29,#0x19
00ae4574	eor w16,w29,w16
00ae4578	add w9,w9,w29
00ae457c	add w12,w12,w16
00ae4580	eor w16,w9,w9, ROR #0x17
00ae4584	eor w9,w16,w9, ROR #0xf
00ae4588	ror w10,w10,#0x17
00ae458c	eor w16,w18,w4
00ae4590	orr w29,w12,w11
00ae4594	add w16,w10,w16
00ae4598	and w10,w29,w10
00ae459c	and w29,w12,w11
00ae45a0	ror w8,w8,#0xd
00ae45a4	orr w10,w10,w29
00ae45a8	eor w29,w13,w8
00ae45ac	and w29,w9,w29
00ae45b0	add w28,w8,w4
00ae45b4	eor w8,w29,w8
00ae45b8	add w10,w14,w10
00ae45bc	ror w14,w12,#0x14
00ae45c0	mov w27,#0x629e
00ae45c4	add w8,w15,w8
00ae45c8	add w15,w14,w9
00ae45cc	movk w27,#0xa1e7, LSL #16
00ae45d0	add w15,w15,w27
00ae45d4	ror w15,w15,#0x19
00ae45d8	eor w14,w15,w14
00ae45dc	add w8,w8,w15
00ae45e0	add w10,w10,w14
00ae45e4	eor w14,w8,w8, ROR #0x17
00ae45e8	eor w8,w14,w8, ROR #0xf
00ae45ec	ror w11,w11,#0x17
00ae45f0	eor w14,w24,w2
00ae45f4	orr w15,w10,w12
00ae45f8	mov w17,w4
00ae45fc	add w14,w11,w14
00ae4600	and w11,w15,w11
00ae4604	and w15,w10,w12
00ae4608	ror w13,w13,#0xd
00ae460c	mov w17,w24
00ae4610	orr w11,w11,w15
00ae4614	eor w24,w9,w13
00ae4618	and w24,w8,w24
00ae461c	add w11,w16,w11
00ae4620	ror w16,w10,#0x14
00ae4624	mov w27,#0xc53d
00ae4628	add w15,w13,w2
00ae462c	eor w13,w24,w13
00ae4630	add w24,w16,w8
00ae4634	movk w27,#0x43ce, LSL #16
00ae4638	add w24,w24,w27
00ae463c	ldr w4,[sp, #0x10]
00ae4640	add w13,w28,w13
00ae4644	ror w24,w24,#0x19
00ae4648	eor w16,w24,w16
00ae464c	add w13,w13,w24
00ae4650	add w11,w11,w16
00ae4654	eor w16,w13,w13, ROR #0x17
00ae4658	eor w13,w16,w13, ROR #0xf
00ae465c	ror w12,w12,#0x17
00ae4660	eor w16,w4,w3
00ae4664	orr w24,w11,w10
00ae4668	ror w9,w9,#0xd
00ae466c	mov w5,w25
00ae4670	add w16,w12,w16
00ae4674	and w12,w24,w12
00ae4678	and w24,w11,w10
00ae467c	eor w25,w8,w9
00ae4680	orr w12,w12,w24
00ae4684	and w25,w13,w25
00ae4688	add w24,w9,w3
00ae468c	eor w9,w25,w9
00ae4690	add w12,w14,w12
00ae4694	ror w14,w11,#0x14
00ae4698	mov w25,#0x8a7a
00ae469c	add w9,w15,w9
00ae46a0	add w15,w14,w13
00ae46a4	movk w25,#0x879d, LSL #16
00ae46a8	mov w2,w3
00ae46ac	add w15,w15,w25
00ae46b0	ldr w3,[sp, #0x48]
00ae46b4	ror w15,w15,#0x19
00ae46b8	eor w14,w15,w14
00ae46bc	add w9,w9,w15
00ae46c0	add w12,w12,w14
00ae46c4	eor w14,w9,w9, ROR #0x17
00ae46c8	ror w8,w8,#0xd
00ae46cc	str w23,[sp, #0x18]
00ae46d0	eor w9,w14,w9, ROR #0xf
00ae46d4	ror w10,w10,#0x17
00ae46d8	eor w14,w3,w0
00ae46dc	orr w15,w12,w11
00ae46e0	eor w23,w13,w8
00ae46e4	add w14,w10,w14
00ae46e8	and w10,w15,w10
00ae46ec	and w15,w12,w11
00ae46f0	and w23,w9,w23
00ae46f4	orr w10,w10,w15
00ae46f8	add w15,w8,w0
00ae46fc	eor w8,w23,w8
00ae4700	add w10,w16,w10
00ae4704	add w8,w24,w8
00ae4708	ror w16,w12,#0x14
00ae470c	mov w24,#0x14f5
00ae4710	add w23,w16,w9
00ae4714	movk w24,#0xf3b, LSL #16
00ae4718	add w23,w23,w24
00ae471c	ldr w0,[sp, #0x44]
00ae4720	ror w23,w23,#0x19
00ae4724	eor w16,w23,w16
00ae4728	add w8,w8,w23
00ae472c	add w10,w10,w16
00ae4730	eor w16,w8,w8, ROR #0x17
00ae4734	eor w8,w16,w8, ROR #0xf
00ae4738	ror w11,w11,#0x17
00ae473c	eor w16,w0,w18
00ae4740	orr w23,w10,w12
00ae4744	add w16,w11,w16
00ae4748	and w11,w23,w11
00ae474c	and w23,w10,w12
00ae4750	ror w13,w13,#0xd
00ae4754	orr w11,w11,w23
00ae4758	eor w23,w9,w13
00ae475c	and w23,w8,w23
00ae4760	add w21,w13,w18
00ae4764	eor w13,w23,w13
00ae4768	add w11,w14,w11
00ae476c	ror w14,w10,#0x14
00ae4770	mov w23,#0x29ea
00ae4774	add w13,w15,w13
00ae4778	add w15,w14,w8
00ae477c	movk w23,#0x1e76, LSL #16
00ae4780	add w15,w15,w23
00ae4784	ldr w18,[sp, #0x40]
00ae4788	ror w15,w15,#0x19
00ae478c	eor w14,w15,w14
00ae4790	add w13,w13,w15
00ae4794	add w11,w11,w14
00ae4798	eor w14,w13,w13, ROR #0x17
00ae479c	eor w13,w14,w13, ROR #0xf
00ae47a0	ror w12,w12,#0x17
00ae47a4	eor w14,w18,w17
00ae47a8	orr w15,w11,w10
00ae47ac	ror w9,w9,#0xd
00ae47b0	add w14,w12,w14
00ae47b4	and w12,w15,w12
00ae47b8	and w15,w11,w10
00ae47bc	eor w23,w8,w9
00ae47c0	orr w12,w12,w15
00ae47c4	and w23,w13,w23
00ae47c8	add w15,w9,w17
00ae47cc	eor w9,w23,w9
00ae47d0	add w12,w16,w12
00ae47d4	ror w16,w11,#0x14
00ae47d8	mov w23,#0x53d4
00ae47dc	add w9,w21,w9
00ae47e0	add w21,w16,w13
00ae47e4	movk w23,#0x3cec, LSL #16
00ae47e8	add w21,w21,w23
00ae47ec	ldr w2,[sp, #0x3c]
00ae47f0	ror w21,w21,#0x19
00ae47f4	eor w16,w21,w16
00ae47f8	add w9,w9,w21
00ae47fc	add w12,w12,w16
00ae4800	eor w16,w9,w9, ROR #0x17
00ae4804	eor w9,w16,w9, ROR #0xf
00ae4808	ror w10,w10,#0x17
00ae480c	eor w16,w2,w4
00ae4810	orr w21,w12,w11
00ae4814	add w16,w10,w16
00ae4818	and w10,w21,w10
00ae481c	and w21,w12,w11
00ae4820	ror w8,w8,#0xd
00ae4824	orr w10,w10,w21
00ae4828	eor w21,w13,w8
00ae482c	and w21,w9,w21
00ae4830	add w7,w8,w4
00ae4834	eor w8,w21,w8
00ae4838	add w10,w14,w10
00ae483c	ror w14,w12,#0x14
00ae4840	mov w21,#0xa7a8
00ae4844	add w8,w15,w8
00ae4848	add w15,w14,w9
00ae484c	movk w21,#0x79d8, LSL #16
00ae4850	mov w17,w4
00ae4854	add w15,w15,w21
00ae4858	ldr w4,[sp, #0x18]
00ae485c	ror w15,w15,#0x19
00ae4860	eor w14,w15,w14
00ae4864	add w8,w8,w15
00ae4868	add w10,w10,w14
00ae486c	eor w14,w8,w8, ROR #0x17
00ae4870	mov w17,w3
00ae4874	ror w13,w13,#0xd
00ae4878	eor w8,w14,w8, ROR #0xf
00ae487c	ror w11,w11,#0x17
00ae4880	eor w14,w4,w17
00ae4884	orr w15,w10,w12
00ae4888	eor w6,w9,w13
00ae488c	add w14,w11,w14
00ae4890	and w11,w15,w11
00ae4894	and w15,w10,w12
00ae4898	and w6,w8,w6
00ae489c	orr w11,w11,w15
00ae48a0	add w15,w13,w17
00ae48a4	eor w13,w6,w13
00ae48a8	add w11,w16,w11
00ae48ac	add w13,w7,w13
00ae48b0	ror w16,w10,#0x14
00ae48b4	mov w7,#0x4f50
00ae48b8	add w6,w16,w8
00ae48bc	movk w7,#0xf3b1, LSL #16
00ae48c0	add w6,w6,w7
00ae48c4	ror w6,w6,#0x19
00ae48c8	eor w16,w6,w16
00ae48cc	add w13,w13,w6
00ae48d0	add w11,w11,w16
00ae48d4	eor w16,w13,w13, ROR #0x17
00ae48d8	eor w13,w16,w13, ROR #0xf
00ae48dc	eor w16,w5,w0
00ae48e0	ror w12,w12,#0x17
00ae48e4	orr w6,w11,w10
00ae48e8	add w16,w12,w16
00ae48ec	and w12,w6,w12
00ae48f0	and w6,w11,w10
00ae48f4	ror w9,w9,#0xd
00ae48f8	orr w12,w12,w6
00ae48fc	eor w6,w8,w9
00ae4900	and w6,w13,w6
00ae4904	mov w7,w5
00ae4908	add w5,w9,w0
00ae490c	eor w9,w6,w9
00ae4910	add w12,w14,w12
00ae4914	ror w14,w11,#0x14
00ae4918	mov w6,#0x9ea1
00ae491c	add w9,w15,w9
00ae4920	add w15,w14,w13
00ae4924	movk w6,#0xe762, LSL #16
00ae4928	mov w17,w0
00ae492c	add w15,w15,w6
00ae4930	ldr w0,[sp, #0x20]
00ae4934	ror w15,w15,#0x19
00ae4938	eor w14,w15,w14
00ae493c	add w9,w9,w15
00ae4940	mov w17,w18
00ae4944	add w12,w12,w14
00ae4948	eor w14,w9,w9, ROR #0x17
00ae494c	eor w15,w0,w17
00ae4950	ror w10,w10,#0x17
00ae4954	eor w9,w14,w9, ROR #0xf
00ae4958	orr w14,w12,w11
00ae495c	ror w8,w8,#0xd
00ae4960	add w15,w10,w15
00ae4964	and w10,w14,w10
00ae4968	and w14,w12,w11
00ae496c	orr w10,w10,w14
00ae4970	eor w14,w13,w8
00ae4974	and w14,w9,w14
00ae4978	add w3,w8,w17
00ae497c	eor w8,w14,w8
00ae4980	ror w14,w12,#0x14
00ae4984	add w8,w5,w8
00ae4988	mov w5,#0x3d43
00ae498c	add w10,w16,w10
00ae4990	add w16,w14,w9
00ae4994	movk w5,#0xcec5, LSL #16
00ae4998	add w16,w16,w5
00ae499c	ldr w5,[sp, #0x1c]
00ae49a0	ror w16,w16,#0x19
00ae49a4	eor w14,w16,w14
00ae49a8	add w8,w8,w16
00ae49ac	add w10,w10,w14
00ae49b0	eor w14,w8,w8, ROR #0x17
00ae49b4	eor w16,w5,w2
00ae49b8	ror w11,w11,#0x17
00ae49bc	eor w8,w14,w8, ROR #0xf
00ae49c0	orr w14,w10,w12
00ae49c4	ror w13,w13,#0xd
00ae49c8	add w16,w11,w16
00ae49cc	and w11,w14,w11
00ae49d0	and w14,w10,w12
00ae49d4	orr w11,w11,w14
00ae49d8	eor w14,w9,w13
00ae49dc	and w14,w8,w14
00ae49e0	add w11,w15,w11
00ae49e4	mov w15,#0x7a87
00ae49e8	mov w17,w2
00ae49ec	add w2,w13,w2
00ae49f0	eor w13,w14,w13
00ae49f4	ror w14,w10,#0x14
00ae49f8	movk w15,#0x9d8a, LSL #16
00ae49fc	add w15,w14,w15
00ae4a00	add w15,w15,w8
00ae4a04	add w13,w3,w13
00ae4a08	ror w15,w15,#0x19
00ae4a0c	eor w14,w15,w14
00ae4a10	add w13,w13,w15
00ae4a14	add w11,w11,w14
00ae4a18	eor w14,w13,w13, ROR #0x17
00ae4a1c	eor w15,w20,w4
00ae4a20	ror w12,w12,#0x17
00ae4a24	eor w13,w14,w13, ROR #0xf
00ae4a28	orr w14,w11,w10
00ae4a2c	ror w9,w9,#0xd
00ae4a30	add w15,w12,w15
00ae4a34	and w12,w14,w12
00ae4a38	and w14,w11,w10
00ae4a3c	orr w12,w12,w14
00ae4a40	eor w14,w8,w9
00ae4a44	and w14,w13,w14
00ae4a48	add w12,w16,w12
00ae4a4c	mov w16,#0xf50f
00ae4a50	add w18,w9,w4
00ae4a54	eor w9,w14,w9
00ae4a58	ror w14,w11,#0x14
00ae4a5c	movk w16,#0x3b14, LSL #16
00ae4a60	add w16,w14,w16
00ae4a64	mov w17,w4
00ae4a68	add w16,w16,w13
00ae4a6c	ldr w4,[sp, #0xd4]
00ae4a70	add w9,w2,w9
00ae4a74	ror w16,w16,#0x19
00ae4a78	eor w14,w16,w14
00ae4a7c	add w9,w9,w16
00ae4a80	add w12,w12,w14
00ae4a84	eor w14,w9,w9, ROR #0x17
00ae4a88	eor w16,w4,w7
00ae4a8c	ror w10,w10,#0x17
00ae4a90	eor w9,w14,w9, ROR #0xf
00ae4a94	orr w14,w12,w11
00ae4a98	ror w8,w8,#0xd
00ae4a9c	add w16,w10,w16
00ae4aa0	and w10,w14,w10
00ae4aa4	and w14,w12,w11
00ae4aa8	orr w10,w10,w14
00ae4aac	eor w14,w13,w8
00ae4ab0	mov w17,w7
00ae4ab4	and w14,w9,w14
00ae4ab8	add w10,w15,w10
00ae4abc	mov w15,#0xea1e
00ae4ac0	add w17,w8,w7
00ae4ac4	eor w8,w14,w8
00ae4ac8	ror w14,w12,#0x14
00ae4acc	movk w15,#0x7629, LSL #16
00ae4ad0	add w15,w14,w15
00ae4ad4	add w15,w15,w9
00ae4ad8	ldr w6,[sp, #0x4c]
00ae4adc	add w8,w18,w8
00ae4ae0	ror w15,w15,#0x19
00ae4ae4	eor w14,w15,w14
00ae4ae8	add w8,w8,w15
00ae4aec	add w10,w10,w14
00ae4af0	eor w14,w8,w8, ROR #0x17
00ae4af4	eor w15,w6,w0
00ae4af8	ror w11,w11,#0x17
00ae4afc	eor w8,w14,w8, ROR #0xf
00ae4b00	orr w14,w10,w12
00ae4b04	ror w13,w13,#0xd
00ae4b08	add w15,w11,w15
00ae4b0c	and w11,w14,w11
00ae4b10	and w14,w10,w12
00ae4b14	orr w11,w11,w14
00ae4b18	eor w14,w9,w13
00ae4b1c	mov w18,w0
00ae4b20	and w14,w8,w14
00ae4b24	add w11,w16,w11
00ae4b28	mov w16,#0xd43c
00ae4b2c	add w18,w13,w0
00ae4b30	eor w13,w14,w13
00ae4b34	ror w14,w10,#0x14
00ae4b38	movk w16,#0xec53, LSL #16
00ae4b3c	add w16,w14,w16
00ae4b40	add w16,w16,w8
00ae4b44	ldr w0,[sp, #0x24]
00ae4b48	add w13,w17,w13
00ae4b4c	ror w16,w16,#0x19
00ae4b50	eor w14,w16,w14
00ae4b54	add w13,w13,w16
00ae4b58	add w11,w11,w14
00ae4b5c	eor w14,w13,w13, ROR #0x17
00ae4b60	eor w16,w0,w5
00ae4b64	ror w12,w12,#0x17
00ae4b68	eor w13,w14,w13, ROR #0xf
00ae4b6c	orr w14,w11,w10
00ae4b70	ror w9,w9,#0xd
00ae4b74	add w16,w12,w16
00ae4b78	and w12,w14,w12
00ae4b7c	and w14,w11,w10
00ae4b80	orr w12,w12,w14
00ae4b84	eor w14,w8,w9
00ae4b88	mov w17,w5
00ae4b8c	and w14,w13,w14
00ae4b90	add w12,w15,w12
00ae4b94	mov w15,#0xa879
00ae4b98	add w17,w9,w5
00ae4b9c	eor w9,w14,w9
00ae4ba0	ror w14,w11,#0x14
00ae4ba4	movk w15,#0xd8a7, LSL #16
00ae4ba8	add w15,w14,w15
00ae4bac	add w15,w15,w13
00ae4bb0	add w9,w18,w9
00ae4bb4	ror w15,w15,#0x19
00ae4bb8	eor w14,w15,w14
00ae4bbc	add w9,w9,w15
00ae4bc0	add w12,w12,w14
00ae4bc4	eor w14,w9,w9, ROR #0x17
00ae4bc8	eor w15,w22,w20
00ae4bcc	ror w10,w10,#0x17
00ae4bd0	eor w9,w14,w9, ROR #0xf
00ae4bd4	orr w14,w12,w11
00ae4bd8	ror w8,w8,#0xd
00ae4bdc	add w15,w10,w15
00ae4be0	and w10,w14,w10
00ae4be4	and w14,w12,w11
00ae4be8	orr w10,w10,w14
00ae4bec	eor w14,w13,w8
00ae4bf0	and w14,w9,w14
00ae4bf4	add w10,w16,w10
00ae4bf8	mov w16,#0x50f3
00ae4bfc	add w18,w8,w20
00ae4c00	eor w8,w14,w8
00ae4c04	ror w14,w12,#0x14
00ae4c08	movk w16,#0xb14f, LSL #16
00ae4c0c	add w16,w14,w16
00ae4c10	add w16,w16,w9
00ae4c14	ldr w3,[sp, #0x34]
00ae4c18	add w8,w17,w8
00ae4c1c	ror w16,w16,#0x19
00ae4c20	eor w14,w16,w14
00ae4c24	add w8,w8,w16
00ae4c28	add w10,w10,w14
00ae4c2c	eor w14,w8,w8, ROR #0x17
00ae4c30	eor w16,w3,w4
00ae4c34	ror w11,w11,#0x17
00ae4c38	eor w8,w14,w8, ROR #0xf
00ae4c3c	orr w14,w10,w12
00ae4c40	ror w13,w13,#0xd
00ae4c44	add w16,w11,w16
00ae4c48	and w11,w14,w11
00ae4c4c	and w14,w10,w12
00ae4c50	orr w11,w11,w14
00ae4c54	eor w14,w9,w13
00ae4c58	mov w17,w4
00ae4c5c	and w14,w8,w14
00ae4c60	add w11,w15,w11
00ae4c64	mov w15,#0xa1e7
00ae4c68	add w17,w13,w4
00ae4c6c	eor w13,w14,w13
00ae4c70	ror w14,w10,#0x14
00ae4c74	movk w15,#0x629e, LSL #16
00ae4c78	add w15,w14,w15
00ae4c7c	add w15,w15,w8
00ae4c80	ldr w4,[sp, #0x28]
00ae4c84	add w13,w18,w13
00ae4c88	ror w15,w15,#0x19
00ae4c8c	eor w14,w15,w14
00ae4c90	add w13,w13,w15
00ae4c94	add w11,w11,w14
00ae4c98	eor w14,w13,w13, ROR #0x17
00ae4c9c	eor w15,w4,w6
00ae4ca0	ror w12,w12,#0x17
00ae4ca4	eor w13,w14,w13, ROR #0xf
00ae4ca8	orr w14,w11,w10
00ae4cac	ror w9,w9,#0xd
00ae4cb0	add w15,w12,w15
00ae4cb4	and w12,w14,w12
00ae4cb8	and w14,w11,w10
00ae4cbc	orr w12,w12,w14
00ae4cc0	eor w14,w8,w9
00ae4cc4	mov w18,w6
00ae4cc8	and w14,w13,w14
00ae4ccc	add w12,w16,w12
00ae4cd0	mov w16,#0x43ce
00ae4cd4	add w18,w9,w6
00ae4cd8	eor w9,w14,w9
00ae4cdc	ror w14,w11,#0x14
00ae4ce0	movk w16,#0xc53d, LSL #16
00ae4ce4	add w16,w14,w16
00ae4ce8	add w16,w16,w13
00ae4cec	add w9,w17,w9
00ae4cf0	ror w16,w16,#0x19
00ae4cf4	eor w14,w16,w14
00ae4cf8	add w9,w9,w16
00ae4cfc	add w12,w12,w14
00ae4d00	eor w14,w9,w9, ROR #0x17
00ae4d04	eor w16,w26,w0
00ae4d08	ror w10,w10,#0x17
00ae4d0c	eor w9,w14,w9, ROR #0xf
00ae4d10	orr w14,w12,w11
00ae4d14	ror w8,w8,#0xd
00ae4d18	add w16,w10,w16
00ae4d1c	and w10,w14,w10
00ae4d20	and w14,w12,w11
00ae4d24	orr w10,w10,w14
00ae4d28	eor w14,w13,w8
00ae4d2c	mov w17,w0
00ae4d30	and w14,w9,w14
00ae4d34	add w10,w15,w10
00ae4d38	mov w15,#0x879d
00ae4d3c	add w17,w8,w0
00ae4d40	eor w8,w14,w8
00ae4d44	ror w14,w12,#0x14
00ae4d48	movk w15,#0x8a7a, LSL #16
00ae4d4c	add w15,w14,w15
00ae4d50	add w15,w15,w9
00ae4d54	ldr w20,[sp, #0xdc]
00ae4d58	add w8,w18,w8
00ae4d5c	ror w15,w15,#0x19
00ae4d60	eor w14,w15,w14
00ae4d64	add w8,w8,w15
00ae4d68	add w10,w10,w14
00ae4d6c	eor w14,w8,w8, ROR #0x17
00ae4d70	eor w15,w20,w22
00ae4d74	ror w11,w11,#0x17
00ae4d78	eor w8,w14,w8, ROR #0xf
00ae4d7c	orr w14,w10,w12
00ae4d80	ror w13,w13,#0xd
00ae4d84	add w15,w11,w15
00ae4d88	and w11,w14,w11
00ae4d8c	and w14,w10,w12
00ae4d90	orr w11,w11,w14
00ae4d94	eor w14,w9,w13
00ae4d98	and w14,w8,w14
00ae4d9c	add w11,w16,w11
00ae4da0	mov w16,#0xf3b
00ae4da4	add w18,w13,w22
00ae4da8	eor w13,w14,w13
00ae4dac	ror w14,w10,#0x14
00ae4db0	movk w16,#0x14f5, LSL #16
00ae4db4	add w16,w14,w16
00ae4db8	add w16,w16,w8
00ae4dbc	ldr w0,[sp, #0x30]
00ae4dc0	add w13,w17,w13
00ae4dc4	ror w16,w16,#0x19
00ae4dc8	eor w14,w16,w14
00ae4dcc	add w13,w13,w16
00ae4dd0	mov w17,w3
00ae4dd4	add w11,w11,w14
00ae4dd8	eor w14,w13,w13, ROR #0x17
00ae4ddc	eor w16,w0,w17
00ae4de0	ror w12,w12,#0x17
00ae4de4	eor w13,w14,w13, ROR #0xf
00ae4de8	orr w14,w11,w10
00ae4dec	ror w9,w9,#0xd
00ae4df0	add w16,w12,w16
00ae4df4	and w12,w14,w12
00ae4df8	and w14,w11,w10
00ae4dfc	orr w12,w12,w14
00ae4e00	eor w14,w8,w9
00ae4e04	and w14,w13,w14
00ae4e08	add w12,w15,w12
00ae4e0c	mov w15,#0x1e76
00ae4e10	add w17,w9,w17
00ae4e14	eor w9,w14,w9
00ae4e18	ror w14,w11,#0x14
00ae4e1c	movk w15,#0x29ea, LSL #16
00ae4e20	add w15,w14,w15
00ae4e24	add w15,w15,w13
00ae4e28	add w9,w18,w9
00ae4e2c	ror w15,w15,#0x19
00ae4e30	eor w14,w15,w14
00ae4e34	add w9,w9,w15
00ae4e38	ldr w15,[sp, #0x38]
00ae4e3c	add w12,w12,w14
00ae4e40	eor w14,w9,w9, ROR #0x17
00ae4e44	ror w10,w10,#0x17
00ae4e48	eor w15,w15,w4
00ae4e4c	eor w9,w14,w9, ROR #0xf
00ae4e50	orr w14,w12,w11
00ae4e54	ror w8,w8,#0xd
00ae4e58	add w15,w10,w15
00ae4e5c	and w10,w14,w10
00ae4e60	and w14,w12,w11
00ae4e64	orr w10,w10,w14
00ae4e68	eor w14,w13,w8
00ae4e6c	mov w18,w4
00ae4e70	and w14,w9,w14
00ae4e74	add w10,w16,w10
00ae4e78	mov w16,#0x3cec
00ae4e7c	add w18,w8,w4
00ae4e80	eor w8,w14,w8
00ae4e84	ror w14,w12,#0x14
00ae4e88	movk w16,#0x53d4, LSL #16
00ae4e8c	add w16,w14,w16
00ae4e90	add w16,w16,w9
00ae4e94	add w8,w17,w8
00ae4e98	ror w16,w16,#0x19
00ae4e9c	eor w14,w16,w14
00ae4ea0	add w8,w8,w16
00ae4ea4	ldr w16,[sp, #0xd8]
00ae4ea8	add w10,w10,w14
00ae4eac	eor w14,w8,w8, ROR #0x17
00ae4eb0	ror w11,w11,#0x17
00ae4eb4	eor w8,w14,w8, ROR #0xf
00ae4eb8	orr w14,w10,w12
00ae4ebc	ror w13,w13,#0xd
00ae4ec0	add w16,w11,w16
00ae4ec4	and w11,w14,w11
00ae4ec8	and w14,w10,w12
00ae4ecc	orr w11,w11,w14
00ae4ed0	eor w14,w9,w13
00ae4ed4	and w14,w8,w14
00ae4ed8	add w11,w15,w11
00ae4edc	mov w15,#0x79d8
00ae4ee0	add w17,w13,w26
00ae4ee4	eor w13,w14,w13
00ae4ee8	ror w14,w10,#0x14
00ae4eec	movk w15,#0xa7a8, LSL #16
00ae4ef0	add w15,w14,w15
00ae4ef4	add w15,w15,w8
00ae4ef8	add w13,w18,w13
00ae4efc	ror w15,w15,#0x19
00ae4f00	eor w14,w15,w14
00ae4f04	add w13,w13,w15
00ae4f08	ldr w15,[sp, #0x2c]
00ae4f0c	add w11,w11,w14
00ae4f10	eor w14,w13,w13, ROR #0x17
00ae4f14	ror w12,w12,#0x17
00ae4f18	eor w13,w14,w13, ROR #0xf
00ae4f1c	orr w14,w11,w10
00ae4f20	ror w9,w9,#0xd
00ae4f24	add w15,w12,w15
00ae4f28	and w12,w14,w12
00ae4f2c	and w14,w11,w10
00ae4f30	orr w12,w12,w14
00ae4f34	eor w14,w8,w9
00ae4f38	and w14,w13,w14
00ae4f3c	add w12,w16,w12
00ae4f40	mov w16,#0xf3b1
00ae4f44	add w18,w9,w20
00ae4f48	eor w9,w14,w9
00ae4f4c	ror w14,w11,#0x14
00ae4f50	movk w16,#0x4f50, LSL #16
00ae4f54	add w16,w14,w16
00ae4f58	add w16,w16,w13
00ae4f5c	add w9,w17,w9
00ae4f60	ror w16,w16,#0x19
00ae4f64	eor w14,w16,w14
00ae4f68	add w9,w9,w16
00ae4f6c	ldr w16,[sp, #0xf0]
00ae4f70	add w12,w12,w14
00ae4f74	eor w14,w9,w9, ROR #0x17
00ae4f78	ror w10,w10,#0x17
00ae4f7c	eor w9,w14,w9, ROR #0xf
00ae4f80	orr w14,w12,w11
00ae4f84	ror w8,w8,#0xd
00ae4f88	add w16,w10,w16
00ae4f8c	and w10,w14,w10
00ae4f90	and w14,w12,w11
00ae4f94	orr w10,w10,w14
00ae4f98	eor w14,w13,w8
00ae4f9c	and w14,w9,w14
00ae4fa0	add w10,w15,w10
00ae4fa4	mov w15,#0xe762
00ae4fa8	add w17,w8,w0
00ae4fac	eor w8,w14,w8
00ae4fb0	ror w14,w12,#0x14
00ae4fb4	movk w15,#0x9ea1, LSL #16
00ae4fb8	add w15,w14,w15
00ae4fbc	add w15,w15,w9
00ae4fc0	add w8,w18,w8
00ae4fc4	ror w15,w15,#0x19
00ae4fc8	eor w14,w15,w14
00ae4fcc	add w8,w8,w15
00ae4fd0	ldp w18,w3,[sp, #0xe8]
00ae4fd4	ldr w15,[sp, #0xfc]
00ae4fd8	ldr w0,[sp, #0xc0]
00ae4fdc	ldr w30,[sp, #0xe4]
00ae4fe0	add w10,w10,w14
00ae4fe4	eor w14,w8,w8, ROR #0x17
00ae4fe8	ror w11,w11,#0x17
00ae4fec	ror w13,w13,#0xd
00ae4ff0	eor w18,w18,w12, ROR #0x17
00ae4ff4	eor w8,w14,w8, ROR #0xf
00ae4ff8	and w14,w10,w12
00ae4ffc	orr w12,w10,w12
00ae5000	eor w15,w10,w15
00ae5004	ror w10,w10,#0x14
00ae5008	eor w3,w11,w3
00ae500c	eor w0,w0,w9, ROR #0xd
00ae5010	eor w9,w9,w13
00ae5014	and w11,w12,w11
00ae5018	add w12,w10,w19
00ae501c	and w9,w8,w9
00ae5020	eor w30,w8,w30
00ae5024	add w8,w12,w8
00ae5028	orr w11,w11,w14
00ae502c	ldr w14,[sp, #0xf8]
00ae5030	eor w9,w9,w13
00ae5034	ror w8,w8,#0x19
00ae5038	add w11,w16,w11
00ae503c	add w9,w17,w9
00ae5040	eor w10,w8,w10
00ae5044	add w8,w9,w8
00ae5048	add w9,w11,w10
00ae504c	eor w14,w9,w14
00ae5050	ldr w9,[sp, #0xbc]
00ae5054	ldr w12,[sp, #0xc4]
00ae5058	ldr x2,[sp, #0xc8]
00ae505c	mov w16,w15
00ae5060	eor w9,w8,w9
00ae5064	eor w9,w9,w8, ROR #0x17
00ae5068	eor w29,w9,w8, ROR #0xf
00ae506c	ldr x8,[sp, #0x8]
00ae5070	eor w12,w13,w12
00ae5074	mov w9,w18
00ae5078	subs x2,x2,#0x1
00ae507c	mov w9,w3
00ae5080	mov w4,w0
00ae5084	mov w17,w12
00ae5088	add x1,x1,#0x40
00ae508c	str w15,[sp, #0xfc]
00ae5090	stp w18,w3,[sp, #0xe8]
00ae5094	stp w18,w3,[x8, #0x8]
00ae5098	mov w9,w0
00ae509c	stp w0,w12,[x8, #0x18]
00ae50a0	stp w14,w16,[x8]
00ae50a4	stp w29,w30,[x8, #0x10]
00ae50a8	b.ne 0x00ae2c98
00ae50ac	ldp x29,x30,[sp, #0x150]
00ae50b0	ldp x20,x19,[sp, #0x140]
00ae50b4	ldp x22,x21,[sp, #0x130]
00ae50b8	ldp x24,x23,[sp, #0x120]
00ae50bc	ldp x26,x25,[sp, #0x110]
00ae50c0	ldp x28,x27,[sp, #0x100]
00ae50c4	add sp,sp,#0x160
00ae50c8	ret
