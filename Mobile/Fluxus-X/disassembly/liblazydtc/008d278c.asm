; LZ4_compress_fast_continue @ 008d278c
008d278c	sub sp,sp,#0x140
008d2790	stp x29,x30,[sp, #0xe0]
008d2794	stp x28,x27,[sp, #0xf0]
008d2798	stp x26,x25,[sp, #0x100]
008d279c	stp x24,x23,[sp, #0x110]
008d27a0	stp x22,x21,[sp, #0x120]
008d27a4	stp x20,x19,[sp, #0x130]
008d27a8	add x29,sp,#0xe0
008d27ac	add x19,x0,#0x4, LSL #12
008d27b0	mov w23,w3
008d27b4	mov x3,x0
008d27b8	ldr w8,[x19, #0x18]
008d27bc	mov x25,x2
008d27c0	cbz w8,0x008d27d0
008d27c4	ldr x9,[x3, #0x4000]
008d27c8	add x9,x9,x8
008d27cc	b 0x008d27d4
008d27d0	mov x9,xzr
008d27d4	ldr w2,[x19, #0x10]
008d27d8	orr w11,wzr,#0x80000001
008d27dc	add w10,w2,w23
008d27e0	cmp w10,w11
008d27e4	b.cc 0x008d2844
008d27e8	sub w10,w2,#0x10, LSL #12
008d27ec	add x11,x3,#0x10
008d27f0	mov w12,#0x1000
008d27f4	dup v0.4S,w10
008d27f8	ldr x10,[x3, #0x4000]
008d27fc	ldp q1,q2,[x11, #-0x10]
008d2800	subs x12,x12,#0x8
008d2804	uqsub v1.4S,v1.4S,v0.4S
008d2808	uqsub v2.4S,v2.4S,v0.4S
008d280c	stp q1,q2,[x11, #-0x10]
008d2810	add x11,x11,#0x20
008d2814	b.ne 0x008d27fc
008d2818	add x10,x10,x8
008d281c	ldr w8,[x19, #0x18]
008d2820	mov w11,#0x10000
008d2824	str w11,[x19, #0x10]
008d2828	cmp w8,#0x10, LSL #12
008d282c	b.ls 0x008d2838
008d2830	mov w8,#0x10000
008d2834	str w11,[x19, #0x18]
008d2838	sub x10,x10,w8, UXTW 
008d283c	mov w2,#0x10000
008d2840	str x10,[x3, #0x4000]
008d2844	cmp w5,#0x1
008d2848	orr w11,wzr,#0x10001
008d284c	csinc w10,w5,wzr,gt
008d2850	cmp w10,#0x10, LSL #12
008d2854	csel w26,w10,w11,le
008d2858	cmp w8,#0x3
008d285c	b.hi 0x008d2888
008d2860	cmp w23,#0x1
008d2864	b.lt 0x008d2888
008d2868	cmp x9,x1
008d286c	b.eq 0x008d2888
008d2870	ldr x10,[x3, #0x4008]
008d2874	cbnz x10,0x008d2888
008d2878	mov w8,wzr
008d287c	mov x9,x1
008d2880	str wzr,[x19, #0x18]
008d2884	str x1,[x3, #0x4000]
008d2888	add x10,x1,w23, SXTW 
008d288c	ldr x11,[x3, #0x4000]
008d2890	cmp x10,x11
008d2894	b.ls 0x008d28c4
008d2898	cmp x10,x9
008d289c	b.cs 0x008d28c4
008d28a0	sub w8,w9,w10
008d28a4	mov w10,#0x10000
008d28a8	cmp w8,#0x10, LSL #12
008d28ac	csel w10,w8,w10,cc
008d28b0	cmp w8,#0x4
008d28b4	csel w8,wzr,w10,cc
008d28b8	sub x11,x9,x8
008d28bc	str w8,[x19, #0x18]
008d28c0	str x11,[x3, #0x4000]
008d28c4	cmp x9,x1
008d28c8	stp x3,x1,[x29, #-0x18]
008d28cc	b.eq 0x008d2920
008d28d0	ldr x5,[x3, #0x4008]
008d28d4	stur w23,[x29, #-0x30]
008d28d8	stur x19,[x29, #-0x28]
008d28dc	cbz x5,0x008d29c8
008d28e0	mov w19,w4
008d28e4	cmp w23,#0x1, LSL #12
008d28e8	b.le 0x008d2adc
008d28ec	mov x0,x3
008d28f0	mov x1,x5
008d28f4	mov w2,#0x4020
008d28f8	mov x21,x3
008d28fc	bl 0x00c2ffd0
008d2900	mov w8,#0x7e000000
008d2904	cmp w23,w8
008d2908	b.ls 0x008d2c70
008d290c	ldur x1,[x29, #-0x10]
008d2910	ldur x19,[x29, #-0x28]
008d2914	mov w0,wzr
008d2918	mov x3,x21
008d291c	b 0x008d597c
008d2920	lsr w9,w8,#0x10
008d2924	cbnz w9,0x008d2af4
008d2928	subs w27,w2,w8
008d292c	b.ls 0x008d2af4
008d2930	mov w9,#0x7e000000
008d2934	cmp w23,w9
008d2938	b.hi 0x008d4858
008d293c	cbz w23,0x008d35b8
008d2940	mov w11,w23
008d2944	add x24,x25,w4, SXTW 
008d2948	add w9,w8,w23
008d294c	add w10,w2,w23
008d2950	stp x11,x25,[x29, #-0x60]
008d2954	add x11,x1,x11
008d2958	str w9,[x19, #0x18]
008d295c	mov w9,#0x2
008d2960	cmp w23,#0xd
008d2964	mov x23,x25
008d2968	mov x28,x1
008d296c	stur x11,[x29, #-0x38]
008d2970	stp w10,w9,[x19, #0x10]
008d2974	b.cs 0x008d4344
008d2978	ldur x8,[x29, #-0x38]
008d297c	orr x9,xzr,#-0x7f7f7f7f7f7f7f80
008d2980	movk x9,#0x8081
008d2984	sub x21,x8,x28
008d2988	add x8,x21,#0xf0
008d298c	umulh x8,x8,x9
008d2990	add x9,x23,x21
008d2994	add x8,x9,x8, LSR #0x7
008d2998	add x8,x8,#0x1
008d299c	cmp x8,x24
008d29a0	b.hi 0x008d4858
008d29a4	subs x8,x21,#0xf
008d29a8	b.cc 0x008d4860
008d29ac	mov w9,#0xf0
008d29b0	mov x0,x23
008d29b4	cmp x8,#0xff
008d29b8	strb w9,[x0], #0x1
008d29bc	b.cc 0x008d2bc8
008d29c0	ldur x8,[x29, #-0x60]
008d29c4	b 0x008d2b90
008d29c8	lsr w9,w8,#0x10
008d29cc	cbnz w9,0x008d2bd4
008d29d0	subs w5,w2,w8
008d29d4	b.ls 0x008d2bd4
008d29d8	mov w9,#0x7e000000
008d29dc	cmp w23,w9
008d29e0	b.hi 0x008d3644
008d29e4	cbz w23,0x008d363c
008d29e8	add x9,x11,w8, UXTW 
008d29ec	mov w10,w2
008d29f0	mov w13,w23
008d29f4	cmp x11,#0x0
008d29f8	add x4,x25,w4, SXTW 
008d29fc	add w8,w8,w23
008d2a00	sub x12,x9,x10
008d2a04	stur x11,[x29, #-0x38]
008d2a08	add w11,w2,w23
008d2a0c	str x13,[sp, #0x58]
008d2a10	add x13,x1,x13
008d2a14	csel x6,xzr,x12,eq
008d2a18	str w8,[x19, #0x18]
008d2a1c	mov w8,#0x2
008d2a20	cmp w23,#0xd
008d2a24	mov x24,x25
008d2a28	mov x21,x1
008d2a2c	str x13,[sp, #0x70]
008d2a30	stp w11,w8,[x19, #0x10]
008d2a34	stur x25,[x29, #-0x58]
008d2a38	b.cs 0x008d5090
008d2a3c	ldr x8,[sp, #0x70]
008d2a40	orr x9,xzr,#-0x7f7f7f7f7f7f7f80
008d2a44	movk x9,#0x8081
008d2a48	sub x19,x8,x21
008d2a4c	add x8,x19,#0xf0
008d2a50	umulh x8,x8,x9
008d2a54	add x9,x24,x19
008d2a58	add x8,x9,x8, LSR #0x7
008d2a5c	add x8,x8,#0x1
008d2a60	cmp x8,x4
008d2a64	b.hi 0x008d35b0
008d2a68	subs x8,x19,#0xf
008d2a6c	b.cc 0x008d5948
008d2a70	ldur x22,[x29, #-0x58]
008d2a74	mov w9,#0xf0
008d2a78	mov x0,x24
008d2a7c	cmp x8,#0xff
008d2a80	strb w9,[x0], #0x1
008d2a84	b.cc 0x008d2acc
008d2a88	ldr x8,[sp, #0x58]
008d2a8c	mov x23,x21
008d2a90	add x8,x1,x8
008d2a94	mov w1,#0xff
008d2a98	sub x8,x8,x21
008d2a9c	sub x20,x8,#0x10e
008d2aa0	orr x8,xzr,#-0x7f7f7f7f7f7f7f80
008d2aa4	movk x8,#0x8081
008d2aa8	umulh x8,x20,x8
008d2aac	lsr x21,x8,#0x7
008d2ab0	add x2,x21,#0x1
008d2ab4	bl 0x00c301c0
008d2ab8	sub x8,x21,x21, LSL #0x8
008d2abc	add x9,x24,x21
008d2ac0	mov x21,x23
008d2ac4	add x0,x9,#0x2
008d2ac8	add x8,x8,x20
008d2acc	ldur w23,[x29, #-0x30]
008d2ad0	strb w8,[x0]
008d2ad4	mov x24,x0
008d2ad8	b 0x008d5958
008d2adc	mov w8,#0x7e000000
008d2ae0	cmp w23,w8
008d2ae4	b.ls 0x008d348c
008d2ae8	ldur x19,[x29, #-0x28]
008d2aec	mov w0,wzr
008d2af0	b 0x008d597c
008d2af4	mov w9,#0x7e000000
008d2af8	cmp w23,w9
008d2afc	b.hi 0x008d4858
008d2b00	cbz w23,0x008d35b8
008d2b04	mov w11,w23
008d2b08	add x16,x25,w4, SXTW 
008d2b0c	add w9,w8,w23
008d2b10	add w10,w2,w23
008d2b14	stur x11,[x29, #-0x40]
008d2b18	add x11,x1,x11
008d2b1c	str w9,[x19, #0x18]
008d2b20	mov w9,#0x2
008d2b24	cmp w23,#0xd
008d2b28	mov x23,x25
008d2b2c	mov x28,x1
008d2b30	stur w26,[x29, #-0x44]
008d2b34	stur x11,[x29, #-0x28]
008d2b38	stp w10,w9,[x19, #0x10]
008d2b3c	stur x25,[x29, #-0x58]
008d2b40	b.cs 0x008d3e68
008d2b44	ldur x8,[x29, #-0x28]
008d2b48	orr x9,xzr,#-0x7f7f7f7f7f7f7f80
008d2b4c	movk x9,#0x8081
008d2b50	sub x21,x8,x28
008d2b54	add x8,x21,#0xf0
008d2b58	umulh x8,x8,x9
008d2b5c	add x9,x23,x21
008d2b60	add x8,x9,x8, LSR #0x7
008d2b64	add x8,x8,#0x1
008d2b68	cmp x8,x16
008d2b6c	b.hi 0x008d4858
008d2b70	subs x8,x21,#0xf
008d2b74	b.cc 0x008d4860
008d2b78	mov w9,#0xf0
008d2b7c	mov x0,x23
008d2b80	cmp x8,#0xff
008d2b84	strb w9,[x0], #0x1
008d2b88	b.cc 0x008d2bc8
008d2b8c	ldur x8,[x29, #-0x40]
008d2b90	add x8,x1,x8
008d2b94	mov w1,#0xff
008d2b98	sub x8,x8,x28
008d2b9c	sub x19,x8,#0x10e
008d2ba0	orr x8,xzr,#-0x7f7f7f7f7f7f7f80
008d2ba4	movk x8,#0x8081
008d2ba8	umulh x8,x19,x8
008d2bac	lsr x20,x8,#0x7
008d2bb0	add x2,x20,#0x1
008d2bb4	bl 0x00c301c0
008d2bb8	sub x8,x20,x20, LSL #0x8
008d2bbc	add x9,x23,x20
008d2bc0	add x0,x9,#0x2
008d2bc4	add x8,x8,x19
008d2bc8	strb w8,[x0]
008d2bcc	mov x23,x0
008d2bd0	b 0x008d4868
008d2bd4	mov w9,#0x7e000000
008d2bd8	cmp w23,w9
008d2bdc	b.hi 0x008d3644
008d2be0	cbz w23,0x008d363c
008d2be4	add x9,x11,w8, UXTW 
008d2be8	mov w10,w2
008d2bec	mov w13,w23
008d2bf0	cmp x11,#0x0
008d2bf4	add x4,x25,w4, SXTW 
008d2bf8	add w8,w8,w23
008d2bfc	sub x12,x9,x10
008d2c00	stur w26,[x29, #-0x44]
008d2c04	mov x26,x25
008d2c08	stur x11,[x29, #-0x38]
008d2c0c	add w11,w2,w23
008d2c10	csel x5,xzr,x12,eq
008d2c14	str x13,[sp, #0x60]
008d2c18	add x13,x1,x13
008d2c1c	cmp w23,#0xd
008d2c20	str w8,[x19, #0x18]
008d2c24	mov w8,#0x2
008d2c28	mov x16,x1
008d2c2c	stur x13,[x29, #-0x68]
008d2c30	stp w11,w8,[x19, #0x10]
008d2c34	stur x25,[x29, #-0x58]
008d2c38	b.cs 0x008d48b8
008d2c3c	ldur x8,[x29, #-0x68]
008d2c40	orr x9,xzr,#-0x7f7f7f7f7f7f7f80
008d2c44	movk x9,#0x8081
008d2c48	sub x24,x8,x16
008d2c4c	add x8,x24,#0xf0
008d2c50	umulh x8,x8,x9
008d2c54	add x9,x26,x24
008d2c58	add x8,x9,x8, LSR #0x7
008d2c5c	add x8,x8,#0x1
008d2c60	cmp x8,x4
008d2c64	b.ls 0x008d5870
008d2c68	mov w0,wzr
008d2c6c	b 0x008d5940
008d2c70	ldur x1,[x29, #-0x10]
008d2c74	mov x2,#0xbb000000
008d2c78	ldur x14,[x29, #-0x28]
008d2c7c	movk x2,#0xbcdc, LSL #32
008d2c80	ldr x6,[x21, #0x4000]
008d2c84	mov w15,w23
008d2c88	mov x9,x1
008d2c8c	movk x2,#0xcf1b, LSL #48
008d2c90	mov w11,#0x1
008d2c94	ldr x8,[x9], #0x8
008d2c98	stur x9,[x29, #-0x60]
008d2c9c	ldr w9,[x14, #0x18]
008d2ca0	mov w13,w23
008d2ca4	mov w10,#0x2
008d2ca8	mul x12,x8,x2
008d2cac	str x15,[sp, #0x30]
008d2cb0	add x15,x1,x15
008d2cb4	orr w16,w11,w26, LSL #0x6
008d2cb8	add x11,x6,x9
008d2cbc	add w9,w9,w13
008d2cc0	ldr w4,[x14, #0x10]
008d2cc4	stp w10,w9,[x14, #0x14]
008d2cc8	add x5,x25,w19, SXTW 
008d2ccc	cmp x6,#0x0
008d2cd0	mov w0,#0x8081
008d2cd4	add x8,x1,#0x2
008d2cd8	mov x19,x25
008d2cdc	add x23,x1,#0x1
008d2ce0	sub x20,x1,x4
008d2ce4	lsr x9,x12,#0x32
008d2ce8	sub x12,x15,#0x8
008d2cec	sub x7,x15,#0xb
008d2cf0	str x12,[sp, #0x40]
008d2cf4	sub x12,x15,#0x6
008d2cf8	sub x17,x15,#0x5
008d2cfc	str x12,[sp, #0x38]
008d2d00	sub x12,x11,x4
008d2d04	add w13,w4,w13
008d2d08	add w27,w4,#0x1
008d2d0c	sub x28,x15,#0xc
008d2d10	and x9,x9,#0x3ffc
008d2d14	csel x10,xzr,x11,eq
008d2d18	csel x25,xzr,x12,eq
008d2d1c	mov w30,#0xffff
008d2d20	movk w0,#0x8080, LSL #16
008d2d24	mov x22,x1
008d2d28	mov x3,x21
008d2d2c	stur x17,[x29, #-0x38]
008d2d30	str x15,[sp, #0x70]
008d2d34	str w13,[x14, #0x10]
008d2d38	stur x10,[x29, #-0x40]
008d2d3c	str w4,[x21, x9#0x0]
008d2d40	stp x19,x5,[x29, #-0x58]
008d2d44	stur w26,[x29, #-0x44]
008d2d48	stur w16,[x29, #-0x68]
008d2d4c	b 0x008d2d6c
008d2d50	add x8,x22,#0x2
008d2d54	add x23,x22,#0x1
008d2d58	ldur w26,[x29, #-0x44]
008d2d5c	ldur w16,[x29, #-0x68]
008d2d60	cmp x8,x7
008d2d64	sub w27,w23,w20
008d2d68	b.hi 0x008d3584
008d2d6c	ldur x11,[x22, #0x1]
008d2d70	mov w9,w26
008d2d74	mov w10,w16
008d2d78	b 0x008d2d98
008d2d7c	add x8,x12,w9, UXTW 
008d2d80	lsr w9,w10,#0x6
008d2d84	add w10,w10,#0x1
008d2d88	sub w27,w12,w20
008d2d8c	mov x23,x12
008d2d90	cmp x8,x7
008d2d94	b.hi 0x008d3584
008d2d98	mul x11,x11,x2
008d2d9c	mov x12,x8
008d2da0	lsr x11,x11,#0x32
008d2da4	and x13,x11,#0x3ffc
008d2da8	ldr x11,[x12]
008d2dac	ldr w21,[x3, x13#0x0]
008d2db0	str w27,[x3, x13#0x0]
008d2db4	add w8,w21,w30
008d2db8	cmp w8,w27
008d2dbc	b.cc 0x008d2d7c
008d2dc0	cmp w21,w4
008d2dc4	ldr w14,[x23]
008d2dc8	csel x8,x25,x20,cc
008d2dcc	ldr w13,[x8, x21#0x0]
008d2dd0	cmp w13,w14
008d2dd4	b.ne 0x008d2d7c
008d2dd8	cmp w21,w4
008d2ddc	add x24,x8,x21
008d2de0	csel x26,x6,x1,cc
008d2de4	cmp x24,x26
008d2de8	b.ls 0x008d2dfc
008d2dec	ldurb w9,[x23, #-0x1]
008d2df0	ldurb w10,[x24, #-0x1]
008d2df4	cmp w9,w10
008d2df8	b.eq 0x008d344c
008d2dfc	sub x8,x23,x22
008d2e00	stur x22,[x29, #-0x20]
008d2e04	mov w11,#0x8081
008d2e08	mov w22,w8
008d2e0c	movk w11,#0x8080, LSL #16
008d2e10	umull x9,w22,w0
008d2e14	add x0,x19,#0x1
008d2e18	add x10,x0,x22
008d2e1c	add x9,x10,x9, LSR #0x27
008d2e20	add x9,x9,#0x8
008d2e24	cmp x9,x5
008d2e28	b.hi 0x008d35b0
008d2e2c	subs w9,w8,#0xf
008d2e30	b.cc 0x008d2eb4
008d2e34	cmp w9,#0xff
008d2e38	mov w8,#0xf0
008d2e3c	strb w8,[x19]
008d2e40	b.cc 0x008d2eac
008d2e44	ldur x8,[x29, #-0x20]
008d2e48	mov w1,#0xff
008d2e4c	stp x6,x4,[sp, #0x60]
008d2e50	str x7,[sp, #0x58]
008d2e54	sub w8,w23,w8
008d2e58	sub w8,w8,#0x10e
008d2e5c	str w8,[sp, #0x50]
008d2e60	umull x8,w8,w11
008d2e64	lsr x8,x8,#0x27
008d2e68	add x2,x8,#0x1
008d2e6c	str x8,[sp, #0x48]
008d2e70	bl 0x00c301c0
008d2e74	ldr x9,[sp, #0x48]
008d2e78	ldp x7,x6,[sp, #0x58]
008d2e7c	mov x2,#0xbb000000
008d2e80	ldp x3,x1,[x29, #-0x18]
008d2e84	sub w8,w9,w9, LSL #0x8
008d2e88	add x10,x19,x9
008d2e8c	ldr w9,[sp, #0x50]
008d2e90	ldur x5,[x29, #-0x50]
008d2e94	ldr x4,[sp, #0x68]
008d2e98	movk x2,#0xbcdc, LSL #32
008d2e9c	mov w30,#0xffff
008d2ea0	movk x2,#0xcf1b, LSL #48
008d2ea4	add w9,w9,w8
008d2ea8	add x0,x10,#0x2
008d2eac	strb w9,[x0], #0x1
008d2eb0	b 0x008d2ebc
008d2eb4	lsl w8,w8,#0x4
008d2eb8	strb w8,[x19]
008d2ebc	cmp x22,#0x8
008d2ec0	mov w8,#0x8
008d2ec4	csel x9,x22,x8,hi
008d2ec8	cmp x22,#0x19
008d2ecc	add x8,x0,x22
008d2ed0	b.cc 0x008d2f40
008d2ed4	ldur x14,[x29, #-0x20]
008d2ed8	sub x10,x0,x14
008d2edc	cmp x10,#0x20
008d2ee0	b.cc 0x008d2f38
008d2ee4	sub x9,x9,#0x1
008d2ee8	add x13,x0,#0x10
008d2eec	lsr x9,x9,#0x3
008d2ef0	add x11,x9,#0x1
008d2ef4	and x12,x11,#0x3ffffffffffffffc
008d2ef8	lsl x10,x12,#0x3
008d2efc	mov x15,x12
008d2f00	add x9,x14,x10
008d2f04	add x10,x0,x10
008d2f08	add x14,x14,#0x10
008d2f0c	ldp q0,q1,[x14, #-0x10]
008d2f10	subs x15,x15,#0x4
008d2f14	add x14,x14,#0x20
008d2f18	stp q0,q1,[x13, #-0x10]
008d2f1c	add x13,x13,#0x20
008d2f20	b.ne 0x008d2f0c
008d2f24	mov w0,#0x8081
008d2f28	cmp x11,x12
008d2f2c	movk w0,#0x8080, LSL #16
008d2f30	b.ne 0x008d2f50
008d2f34	b 0x008d2f60
008d2f38	mov x9,x14
008d2f3c	b 0x008d2f44
008d2f40	ldur x9,[x29, #-0x20]
008d2f44	mov x10,x0
008d2f48	mov w0,#0x8081
008d2f4c	movk w0,#0x8080, LSL #16
008d2f50	ldr x11,[x9], #0x8
008d2f54	str x11,[x10], #0x8
008d2f58	cmp x10,x8
008d2f5c	b.cc 0x008d2f50
008d2f60	sub w10,w27,w21
008d2f64	mov x9,x19
008d2f68	mov x22,x23
008d2f6c	mov x19,x8
008d2f70	cmp x26,x6
008d2f74	strh w10,[x19], #0x2
008d2f78	b.eq 0x008d3050
008d2f7c	add x10,x22,#0x4
008d2f80	add x12,x24,#0x4
008d2f84	cmp x10,x28
008d2f88	b.cs 0x008d342c
008d2f8c	ldr x11,[x12]
008d2f90	ldr x12,[x10]
008d2f94	cmp x11,x12
008d2f98	b.ne 0x008d3130
008d2f9c	add x11,x22,#0xc
008d2fa0	add x12,x24,#0xc
008d2fa4	cmp x11,x28
008d2fa8	b.cs 0x008d2fd8
008d2fac	sub w13,w11,w22
008d2fb0	sub w13,w13,#0x4
008d2fb4	ldr x14,[x12]
008d2fb8	ldr x15,[x11]
008d2fbc	cmp x14,x15
008d2fc0	b.ne 0x008d3144
008d2fc4	add x11,x11,#0x8
008d2fc8	add x12,x12,#0x8
008d2fcc	add w13,w13,#0x8
008d2fd0	cmp x11,x28
008d2fd4	b.cc 0x008d2fb4
008d2fd8	ldr x13,[sp, #0x40]
008d2fdc	cmp x11,x13
008d2fe0	b.cs 0x008d3000
008d2fe4	ldr w13,[x12]
008d2fe8	ldr w14,[x11]
008d2fec	cmp w13,w14
008d2ff0	add x13,x11,#0x4
008d2ff4	add x14,x12,#0x4
008d2ff8	csel x12,x12,x14,ne
008d2ffc	csel x11,x11,x13,ne
008d3000	ldr x13,[sp, #0x38]
008d3004	cmp x11,x13
008d3008	b.cs 0x008d3028
008d300c	ldrh w13,[x12]
008d3010	ldrh w14,[x11]
008d3014	cmp w13,w14
008d3018	add x13,x11,#0x2
008d301c	add x14,x12,#0x2
008d3020	csel x12,x12,x14,ne
008d3024	csel x11,x11,x13,ne
008d3028	ldur x13,[x29, #-0x38]
008d302c	cmp x11,x13
008d3030	b.cs 0x008d3048
008d3034	mov x13,x11
008d3038	ldrb w12,[x12]
008d303c	ldrb w14,[x13], #0x1
008d3040	cmp w12,w14
008d3044	csel x11,x11,x13,ne
008d3048	sub w11,w11,w10
008d304c	b 0x008d3158
008d3050	ldp x10,x11,[x29, #-0x40]
008d3054	add x13,x24,#0x4
008d3058	sub x10,x10,x24
008d305c	add x10,x22,x10
008d3060	cmp x10,x11
008d3064	csel x10,x11,x10,hi
008d3068	add x11,x22,#0x4
008d306c	sub x14,x10,#0x7
008d3070	cmp x11,x14
008d3074	b.cs 0x008d343c
008d3078	ldr x12,[x13]
008d307c	ldr x13,[x11]
008d3080	cmp x12,x13
008d3084	b.ne 0x008d3164
008d3088	add x12,x22,#0xc
008d308c	add x13,x24,#0xc
008d3090	cmp x12,x14
008d3094	b.cs 0x008d30c4
008d3098	sub w15,w12,w22
008d309c	sub w15,w15,#0x4
008d30a0	ldr x16,[x13]
008d30a4	ldr x17,[x12]
008d30a8	cmp x16,x17
008d30ac	b.ne 0x008d3178
008d30b0	add x12,x12,#0x8
008d30b4	add x13,x13,#0x8
008d30b8	add w15,w15,#0x8
008d30bc	cmp x12,x14
008d30c0	b.cc 0x008d30a0
008d30c4	sub x14,x10,#0x3
008d30c8	cmp x12,x14
008d30cc	b.cs 0x008d30e8
008d30d0	ldr w14,[x13]
008d30d4	ldr w15,[x12]
008d30d8	cmp w14,w15
008d30dc	b.ne 0x008d30e8
008d30e0	add x12,x12,#0x4
008d30e4	add x13,x13,#0x4
008d30e8	sub x14,x10,#0x1
008d30ec	cmp x12,x14
008d30f0	b.cs 0x008d310c
008d30f4	ldrh w14,[x13]
008d30f8	ldrh w15,[x12]
008d30fc	cmp w14,w15
008d3100	b.ne 0x008d310c
008d3104	add x12,x12,#0x2
008d3108	add x13,x13,#0x2
008d310c	cmp x12,x10
008d3110	b.cs 0x008d3128
008d3114	mov x14,x12
008d3118	ldrb w13,[x13]
008d311c	ldrb w15,[x14], #0x1
008d3120	cmp w13,w15
008d3124	csel x12,x12,x14,ne
008d3128	sub w11,w12,w11
008d312c	b 0x008d318c
008d3130	eor x10,x12,x11
008d3134	rbit x10,x10
008d3138	clz x10,x10
008d313c	lsr w11,w10,#0x3
008d3140	b 0x008d3158
008d3144	eor x10,x15,x14
008d3148	rbit x10,x10
008d314c	clz x10,x10
008d3150	lsr x10,x10,#0x3
008d3154	add w11,w10,w13
008d3158	add x10,x22,w11, UXTW 
008d315c	add x22,x10,#0x4
008d3160	b 0x008d32b8
008d3164	eor x11,x13,x12
008d3168	rbit x11,x11
008d316c	clz x11,x11
008d3170	lsr w11,w11,#0x3
008d3174	b 0x008d318c
008d3178	eor x11,x17,x16
008d317c	rbit x11,x11
008d3180	clz x11,x11
008d3184	lsr x11,x11,#0x3
008d3188	add w11,w11,w15
008d318c	add x12,x22,w11, UXTW 
008d3190	add x12,x12,#0x4
008d3194	cmp x12,x10
008d3198	b.eq 0x008d31a4
008d319c	mov x22,x12
008d31a0	b 0x008d32b8
008d31a4	cmp x10,x28
008d31a8	mov x14,x1
008d31ac	mov x13,x10
008d31b0	b.cs 0x008d31cc
008d31b4	ldr x13,[x1]
008d31b8	ldr x14,[x10]
008d31bc	cmp x13,x14
008d31c0	b.ne 0x008d3288
008d31c4	ldur x14,[x29, #-0x60]
008d31c8	add x13,x10,#0x8
008d31cc	cmp x13,x28
008d31d0	b.cs 0x008d3210
008d31d4	ldp x15,x16,[x29, #-0x40]
008d31d8	add x15,x15,x22
008d31dc	sub x15,x15,x24
008d31e0	cmp x15,x16
008d31e4	csel x15,x15,x16,cc
008d31e8	sub w15,w13,w15
008d31ec	ldr x16,[x14]
008d31f0	ldr x17,[x13]
008d31f4	cmp x16,x17
008d31f8	b.ne 0x008d329c
008d31fc	add x13,x13,#0x8
008d3200	add x14,x14,#0x8
008d3204	add w15,w15,#0x8
008d3208	cmp x13,x28
008d320c	b.cc 0x008d31ec
008d3210	ldr x15,[sp, #0x40]
008d3214	cmp x13,x15
008d3218	b.cs 0x008d3238
008d321c	ldr w15,[x14]
008d3220	ldr w16,[x13]
008d3224	cmp w15,w16
008d3228	add x15,x13,#0x4
008d322c	add x16,x14,#0x4
008d3230	csel x14,x14,x16,ne
008d3234	csel x13,x13,x15,ne
008d3238	ldr x15,[sp, #0x38]
008d323c	cmp x13,x15
008d3240	b.cs 0x008d3260
008d3244	ldrh w15,[x14]
008d3248	ldrh w16,[x13]
008d324c	cmp w15,w16
008d3250	add x15,x13,#0x2
008d3254	add x16,x14,#0x2
008d3258	csel x14,x14,x16,ne
008d325c	csel x13,x13,x15,ne
008d3260	ldur x15,[x29, #-0x38]
008d3264	cmp x13,x15
008d3268	b.cs 0x008d3280
008d326c	mov x15,x13
008d3270	ldrb w14,[x14]
008d3274	ldrb w16,[x15], #0x1
008d3278	cmp w14,w16
008d327c	csel x13,x13,x15,ne
008d3280	sub w10,w13,w10
008d3284	b 0x008d32b0
008d3288	eor x10,x14,x13
008d328c	rbit x10,x10
008d3290	clz x10,x10
008d3294	lsr w10,w10,#0x3
008d3298	b 0x008d32b0
008d329c	eor x10,x17,x16
008d32a0	rbit x10,x10
008d32a4	clz x10,x10
008d32a8	lsr x10,x10,#0x3
008d32ac	add w10,w10,w15
008d32b0	add x22,x12,w10, UXTW 
008d32b4	add w11,w10,w11
008d32b8	add w10,w11,#0xf0
008d32bc	umull x10,w10,w0
008d32c0	add x10,x8,x10, LSR #0x27
008d32c4	add x10,x10,#0x8
008d32c8	cmp x10,x5
008d32cc	b.hi 0x008d59a4
008d32d0	ldrb w12,[x9]
008d32d4	subs w10,w11,#0xf
008d32d8	b.cc 0x008d33a4
008d32dc	add w12,w12,#0xf
008d32e0	cmp w10,#0x3fc
008d32e4	strb w12,[x9]
008d32e8	mov w9,#0xffffffff
008d32ec	str w9,[x19]
008d32f0	b.cc 0x008d337c
008d32f4	sub w19,w11,#0x40b
008d32f8	stur x22,[x29, #-0x20]
008d32fc	add x24,x8,#0x6
008d3300	umull x9,w19,w0
008d3304	mov x0,x24
008d3308	mov w1,#0xff
008d330c	mov x27,x4
008d3310	mov x23,x6
008d3314	mov x26,x28
008d3318	mov x28,x25
008d331c	mov x25,x20
008d3320	mov x20,x7
008d3324	lsr x21,x9,#0x29
008d3328	lsl w22,w21,#0x2
008d332c	add x2,x22,#0x4
008d3330	bl 0x00c301c0
008d3334	mov w8,#0x3fc
008d3338	mov x2,#0xbb000000
008d333c	mov w0,#0x8081
008d3340	ldp x3,x1,[x29, #-0x18]
008d3344	msub w10,w21,w8,w19
008d3348	ldur x5,[x29, #-0x50]
008d334c	movk x2,#0xbcdc, LSL #32
008d3350	add x19,x24,x22
008d3354	ldur x22,[x29, #-0x20]
008d3358	movk w0,#0x8080, LSL #16
008d335c	mov w30,#0xffff
008d3360	mov x7,x20
008d3364	mov x20,x25
008d3368	mov x25,x28
008d336c	mov x28,x26
008d3370	mov x6,x23
008d3374	mov x4,x27
008d3378	movk x2,#0xcf1b, LSL #48
008d337c	and w8,w10,#0xffff
008d3380	mov w9,#0x8081
008d3384	mul w8,w8,w9
008d3388	lsr w8,w8,#0x17
008d338c	add x19,x19,x8
008d3390	add w8,w10,w8
008d3394	strb w8,[x19], #0x1
008d3398	cmp x22,x7
008d339c	b.cc 0x008d33b4
008d33a0	b 0x008d3584
008d33a4	add w8,w12,w11
008d33a8	strb w8,[x9]
008d33ac	cmp x22,x7
008d33b0	b.cs 0x008d3584
008d33b4	mov x8,x22
008d33b8	ldr x10,[x22]
008d33bc	ldr x9,[x8, #-0x2]!
008d33c0	mul x10,x10,x2
008d33c4	sub w8,w8,w20
008d33c8	mul x9,x9,x2
008d33cc	lsr x10,x10,#0x32
008d33d0	lsr x9,x9,#0x32
008d33d4	and x11,x10,#0x3ffc
008d33d8	sub w10,w22,w20
008d33dc	and x9,x9,#0x3ffc
008d33e0	str w8,[x3, x9#0x0]
008d33e4	ldr w9,[x3, x11#0x0]
008d33e8	str w10,[x3, x11#0x0]
008d33ec	cmp w9,w4
008d33f0	add w12,w9,w30
008d33f4	csel x8,x25,x20,cc
008d33f8	csel x26,x6,x1,cc
008d33fc	cmp w12,w10
008d3400	b.cc 0x008d2d50
008d3404	add x24,x8,x9
008d3408	ldr w11,[x22]
008d340c	ldr w8,[x24]
008d3410	cmp w8,w11
008d3414	b.ne 0x008d2d50
008d3418	mov x8,x19
008d341c	sub w10,w10,w9
008d3420	mov x9,x19
008d3424	strb wzr,[x8], #0x1
008d3428	b 0x008d2f6c
008d342c	mov x11,x10
008d3430	cmp x11,x28
008d3434	b.cc 0x008d2fac
008d3438	b 0x008d2fd8
008d343c	mov x12,x11
008d3440	cmp x12,x14
008d3444	b.cc 0x008d3098
008d3448	b 0x008d30c4
008d344c	add x8,x8,x21
008d3450	sub x9,x8,#0x1
008d3454	sub x8,x23,#0x1
008d3458	mov x24,x9
008d345c	cmp x9,x26
008d3460	mov x23,x8
008d3464	b.ls 0x008d2dfc
008d3468	cmp x23,x22
008d346c	b.ls 0x008d2dfc
008d3470	mov x8,x23
008d3474	mov x9,x24
008d3478	ldrb w10,[x8, #-0x1]!
008d347c	ldrb w11,[x9, #-0x1]!
008d3480	cmp w10,w11
008d3484	b.eq 0x008d3458
008d3488	b 0x008d2dfc
008d348c	cbz w23,0x008d364c
008d3490	add x8,x5,#0x4, LSL #12
008d3494	ldr x6,[x5, #0x4000]
008d3498	mov w12,w23
008d349c	ldr w9,[x8, #0x18]
008d34a0	ldr w8,[x8, #0x10]
008d34a4	str x12,[sp, #0x50]
008d34a8	add x12,x1,x12
008d34ac	add x4,x25,w19, SXTW 
008d34b0	cmp x6,#0x0
008d34b4	add x9,x6,x9
008d34b8	str x12,[sp, #0x68]
008d34bc	ldur x12,[x29, #-0x28]
008d34c0	sub x11,x9,x8
008d34c4	add w10,w2,w23
008d34c8	mov x16,x1
008d34cc	csel x22,xzr,x11,eq
008d34d0	mov w11,#0x2
008d34d4	cmp w23,#0xd
008d34d8	str xzr,[x3, #0x4008]
008d34dc	str w10,[x12, #0x10]
008d34e0	stp w11,w23,[x12, #0x14]
008d34e4	stur x25,[x29, #-0x58]
008d34e8	b.cs 0x008d3664
008d34ec	ldr x8,[sp, #0x68]
008d34f0	orr x9,xzr,#-0x7f7f7f7f7f7f7f80
008d34f4	movk x9,#0x8081
008d34f8	sub x19,x8,x16
008d34fc	add x8,x19,#0xf0
008d3500	umulh x8,x8,x9
008d3504	add x9,x25,x19
008d3508	add x8,x9,x8, LSR #0x7
008d350c	add x8,x8,#0x1
008d3510	cmp x8,x4
008d3514	b.hi 0x008d35b0
008d3518	subs x8,x19,#0xf
008d351c	b.cc 0x008d58e0
008d3520	mov w9,#0xf0
008d3524	mov x0,x25
008d3528	cmp x8,#0xff
008d352c	strb w9,[x0], #0x1
008d3530	b.cc 0x008d3578
008d3534	ldr x8,[sp, #0x50]
008d3538	mov x22,x16
008d353c	add x8,x1,x8
008d3540	mov w1,#0xff
008d3544	sub x8,x8,x16
008d3548	sub x20,x8,#0x10e
008d354c	orr x8,xzr,#-0x7f7f7f7f7f7f7f80
008d3550	movk x8,#0x8081
008d3554	umulh x8,x20,x8
008d3558	lsr x21,x8,#0x7
008d355c	add x2,x21,#0x1
008d3560	bl 0x00c301c0
008d3564	sub x8,x21,x21, LSL #0x8
008d3568	add x9,x25,x21
008d356c	mov x16,x22
008d3570	add x0,x9,#0x2
008d3574	add x8,x8,x20
008d3578	strb w8,[x0]
008d357c	mov x25,x0
008d3580	b 0x008d58e8
008d3584	ldr x8,[sp, #0x70]
008d3588	orr x9,xzr,#-0x7f7f7f7f7f7f7f80
008d358c	movk x9,#0x8081
008d3590	sub x24,x8,x22
008d3594	add x8,x24,#0xf0
008d3598	umulh x8,x8,x9
008d359c	add x9,x19,x24
008d35a0	add x8,x9,x8, LSR #0x7
008d35a4	add x8,x8,#0x1
008d35a8	cmp x8,x5
008d35ac	b.ls 0x008d35cc
008d35b0	mov w0,wzr
008d35b4	b 0x008d590c
008d35b8	cmp w4,#0x1
008d35bc	b.lt 0x008d4858
008d35c0	strb wzr,[x25]
008d35c4	mov w0,#0x1
008d35c8	b 0x008d5984
008d35cc	mov x25,x22
008d35d0	subs x8,x24,#0xf
008d35d4	b.cc 0x008d488c
008d35d8	ldur x22,[x29, #-0x58]
008d35dc	mov w9,#0xf0
008d35e0	mov x0,x19
008d35e4	cmp x8,#0xff
008d35e8	strb w9,[x0], #0x1
008d35ec	b.cc 0x008d362c
008d35f0	ldr x8,[sp, #0x30]
008d35f4	add x8,x1,x8
008d35f8	mov w1,#0xff
008d35fc	sub x8,x8,x25
008d3600	sub x20,x8,#0x10e
008d3604	orr x8,xzr,#-0x7f7f7f7f7f7f7f80
008d3608	movk x8,#0x8081
008d360c	umulh x8,x20,x8
008d3610	lsr x21,x8,#0x7
008d3614	add x2,x21,#0x1
008d3618	bl 0x00c301c0
008d361c	sub x8,x21,x21, LSL #0x8
008d3620	add x9,x19,x21
008d3624	add x0,x9,#0x2
008d3628	add x8,x8,x20
008d362c	ldur w23,[x29, #-0x30]
008d3630	strb w8,[x0]
008d3634	mov x19,x0
008d3638	b 0x008d489c
008d363c	cmp w4,#0x1
008d3640	b.ge 0x008d3658
008d3644	mov w0,wzr
008d3648	b 0x008d597c
008d364c	cmp w19,#0x1
008d3650	b.lt 0x008d2ae8
008d3654	ldur x19,[x29, #-0x28]
008d3658	strb wzr,[x25]
008d365c	mov w0,#0x1
008d3660	b 0x008d597c
008d3664	mov x11,x1
008d3668	mov x23,#0xbb000000
008d366c	ldr x12,[sp, #0x68]
008d3670	ldr x10,[x11], #0x8
008d3674	movk x23,#0xbcdc, LSL #32
008d3678	movk x23,#0xcf1b, LSL #48
008d367c	str x11,[sp, #0x60]
008d3680	mov w11,#0x1
008d3684	mul x10,x10,x23
008d3688	sub x19,x1,w2, UXTW 
008d368c	sub w7,w2,w8
008d3690	sub x8,x12,#0x5
008d3694	cmp x6,#0x0
008d3698	mov w14,#0x8081
008d369c	orr w11,w11,w26, LSL #0x6
008d36a0	ldur x25,[x29, #-0x58]
008d36a4	sub x30,x12,#0xb
008d36a8	stur x8,[x29, #-0x38]
008d36ac	add x8,x1,#0x2
008d36b0	add x24,x1,#0x1
008d36b4	add w20,w2,#0x1
008d36b8	sub x0,x12,#0xc
008d36bc	sub x13,x12,#0x8
008d36c0	lsr x10,x10,#0x32
008d36c4	sub x12,x12,#0x6
008d36c8	mov w21,#0xffff
008d36cc	movk w14,#0x8080, LSL #16
008d36d0	csel x9,xzr,x9,eq
008d36d4	mov x16,x1
008d36d8	and x10,x10,#0x3ffc
008d36dc	stp x12,x13,[sp, #0x8]
008d36e0	stur x9,[x29, #-0x40]
008d36e4	str w2,[x3, x10#0x0]
008d36e8	stp x19,x4,[x29, #-0x68]
008d36ec	stur w26,[x29, #-0x44]
008d36f0	stur w2,[x29, #-0x20]
008d36f4	stur x0,[x29, #-0x50]
008d36f8	str w11,[sp, #0x58]
008d36fc	str x22,[sp, #0x70]
008d3700	b 0x008d3724
008d3704	mov w14,#0x8081
008d3708	add x8,x16,#0x2
008d370c	add x24,x16,#0x1
008d3710	ldr w11,[sp, #0x58]
008d3714	movk w14,#0x8080, LSL #16
008d3718	cmp x8,x30
008d371c	sub w20,w24,w19
008d3720	b.hi 0x008d34ec
008d3724	ldur x12,[x16, #0x1]
008d3728	mov w9,w26
008d372c	mov w10,w11
008d3730	b 0x008d3750
008d3734	add x8,x11,w9, UXTW 
008d3738	lsr w9,w10,#0x6
008d373c	add w10,w10,#0x1
008d3740	sub w20,w11,w19
008d3744	mov x24,x11
008d3748	cmp x8,x30
008d374c	b.hi 0x008d34ec
008d3750	mul x11,x12,x23
008d3754	lsr x13,x11,#0x34
008d3758	mov x11,x8
008d375c	ldr w26,[x3, x13, LSL #0x2]
008d3760	cmp w26,w2
008d3764	b.cs 0x008d377c
008d3768	ldr w8,[x5, x13, LSL #0x2]
008d376c	mov x28,x6
008d3770	add x27,x22,x8
008d3774	add w26,w8,w7
008d3778	b 0x008d3784
008d377c	add x27,x19,x26
008d3780	mov x28,x1
008d3784	add w8,w26,w21
008d3788	ldr x12,[x11]
008d378c	str w20,[x3, x13, LSL #0x2]
008d3790	cmp w8,w20
008d3794	b.cc 0x008d3734
008d3798	ldr w8,[x27]
008d379c	ldr w13,[x24]
008d37a0	cmp w8,w13
008d37a4	b.ne 0x008d3734
008d37a8	cmp x27,x28
008d37ac	b.ls 0x008d37c0
008d37b0	ldurb w8,[x24, #-0x1]
008d37b4	ldurb w9,[x27, #-0x1]
008d37b8	cmp w8,w9
008d37bc	b.eq 0x008d3e2c
008d37c0	sub x8,x24,x16
008d37c4	add x0,x25,#0x1
008d37c8	mov w21,w8
008d37cc	umull x9,w21,w14
008d37d0	add x10,x0,x21
008d37d4	add x9,x10,x9, LSR #0x27
008d37d8	add x9,x9,#0x8
008d37dc	cmp x9,x4
008d37e0	b.hi 0x008d35b0
008d37e4	subs w9,w8,#0xf
008d37e8	b.cc 0x008d3864
008d37ec	cmp w9,#0xff
008d37f0	mov w8,#0xf0
008d37f4	strb w8,[x25]
008d37f8	b.cc 0x008d385c
008d37fc	sub w8,w24,w16
008d3800	mov w1,#0xff
008d3804	stp x6,x5,[sp, #0x40]
008d3808	sub w8,w8,#0x10e
008d380c	str w7,[sp, #0x38]
008d3810	str w8,[sp, #0x24]
008d3814	umull x8,w8,w14
008d3818	stp x16,x30,[sp, #0x28]
008d381c	lsr x8,x8,#0x27
008d3820	add x2,x8,#0x1
008d3824	str x8,[sp, #0x18]
008d3828	bl 0x00c301c0
008d382c	ldr x9,[sp, #0x18]
008d3830	ldp x16,x30,[sp, #0x28]
008d3834	ldp x6,x5,[sp, #0x40]
008d3838	ldr w7,[sp, #0x38]
008d383c	sub w8,w9,w9, LSL #0x8
008d3840	add x10,x25,x9
008d3844	ldr w9,[sp, #0x24]
008d3848	ldp x3,x1,[x29, #-0x18]
008d384c	add x0,x10,#0x2
008d3850	ldur x4,[x29, #-0x60]
008d3854	add w9,w9,w8
008d3858	ldur w2,[x29, #-0x20]
008d385c	strb w9,[x0], #0x1
008d3860	b 0x008d386c
008d3864	lsl w8,w8,#0x4
008d3868	strb w8,[x25]
008d386c	cmp x21,#0x8
008d3870	mov w8,#0x8
008d3874	csel x9,x21,x8,hi
008d3878	cmp x21,#0x19
008d387c	add x8,x0,x21
008d3880	b.cc 0x008d38f4
008d3884	sub x10,x0,x16
008d3888	mov w21,#0xffff
008d388c	cmp x10,#0x20
008d3890	b.cc 0x008d38e4
008d3894	sub x9,x9,#0x1
008d3898	add x13,x0,#0x10
008d389c	add x14,x16,#0x10
008d38a0	lsr x9,x9,#0x3
008d38a4	add x11,x9,#0x1
008d38a8	and x12,x11,#0x3ffffffffffffffc
008d38ac	lsl x10,x12,#0x3
008d38b0	mov x15,x12
008d38b4	add x9,x16,x10
008d38b8	add x10,x0,x10
008d38bc	ldp q0,q1,[x14, #-0x10]
008d38c0	subs x15,x15,#0x4
008d38c4	add x14,x14,#0x20
008d38c8	stp q0,q1,[x13, #-0x10]
008d38cc	add x13,x13,#0x20
008d38d0	b.ne 0x008d38bc
008d38d4	ldur x0,[x29, #-0x50]
008d38d8	cmp x11,x12
008d38dc	b.ne 0x008d3904
008d38e0	b 0x008d3914
008d38e4	mov x10,x0
008d38e8	ldur x0,[x29, #-0x50]
008d38ec	mov x9,x16
008d38f0	b 0x008d3904
008d38f4	mov x10,x0
008d38f8	ldur x0,[x29, #-0x50]
008d38fc	mov x9,x16
008d3900	mov w21,#0xffff
008d3904	ldr x11,[x9], #0x8
008d3908	str x11,[x10], #0x8
008d390c	cmp x10,x8
008d3910	b.cc 0x008d3904
008d3914	sub w10,w20,w26
008d3918	mov x16,x24
008d391c	ldur w26,[x29, #-0x44]
008d3920	mov w24,#0x8081
008d3924	mov x9,x25
008d3928	movk w24,#0x8080, LSL #16
008d392c	mov x25,x8
008d3930	cmp x28,x6
008d3934	strh w10,[x25], #0x2
008d3938	b.eq 0x008d3a10
008d393c	add x10,x16,#0x4
008d3940	add x12,x27,#0x4
008d3944	cmp x10,x0
008d3948	b.cs 0x008d3d94
008d394c	ldr x11,[x12]
008d3950	ldr x12,[x10]
008d3954	cmp x11,x12
008d3958	b.ne 0x008d3a8c
008d395c	add x11,x16,#0xc
008d3960	add x12,x27,#0xc
008d3964	cmp x11,x0
008d3968	b.cs 0x008d3998
008d396c	sub w13,w11,w16
008d3970	sub w13,w13,#0x4
008d3974	ldr x14,[x12]
008d3978	ldr x15,[x11]
008d397c	cmp x14,x15
008d3980	b.ne 0x008d3aa0
008d3984	add x11,x11,#0x8
008d3988	add x12,x12,#0x8
008d398c	add w13,w13,#0x8
008d3990	cmp x11,x0
008d3994	b.cc 0x008d3974
008d3998	ldr x13,[sp, #0x10]
008d399c	cmp x11,x13
008d39a0	b.cs 0x008d39c0
008d39a4	ldr w13,[x12]
008d39a8	ldr w14,[x11]
008d39ac	cmp w13,w14
008d39b0	add x13,x11,#0x4
008d39b4	add x14,x12,#0x4
008d39b8	csel x12,x12,x14,ne
008d39bc	csel x11,x11,x13,ne
008d39c0	ldr x13,[sp, #0x8]
008d39c4	cmp x11,x13
008d39c8	b.cs 0x008d39e8
008d39cc	ldrh w13,[x12]
008d39d0	ldrh w14,[x11]
008d39d4	cmp w13,w14
008d39d8	add x13,x11,#0x2
008d39dc	add x14,x12,#0x2
008d39e0	csel x12,x12,x14,ne
008d39e4	csel x11,x11,x13,ne
008d39e8	ldur x13,[x29, #-0x38]
008d39ec	cmp x11,x13
008d39f0	b.cs 0x008d3a08
008d39f4	mov x13,x11
008d39f8	ldrb w12,[x12]
008d39fc	ldrb w14,[x13], #0x1
008d3a00	cmp w12,w14
008d3a04	csel x11,x11,x13,ne
008d3a08	sub w11,w11,w10
008d3a0c	b 0x008d3ab4
008d3a10	ldp x10,x11,[x29, #-0x40]
008d3a14	add x13,x27,#0x4
008d3a18	sub x10,x10,x27
008d3a1c	add x10,x16,x10
008d3a20	cmp x10,x11
008d3a24	csel x10,x11,x10,hi
008d3a28	add x11,x16,#0x4
008d3a2c	sub x14,x10,#0x7
008d3a30	cmp x11,x14
008d3a34	b.cs 0x008d3da4
008d3a38	ldr x12,[x13]
008d3a3c	ldr x13,[x11]
008d3a40	cmp x12,x13
008d3a44	b.ne 0x008d3ac0
008d3a48	add x12,x16,#0xc
008d3a4c	add x13,x27,#0xc
008d3a50	cmp x12,x14
008d3a54	b.cs 0x008d3db0
008d3a58	sub w15,w12,w16
008d3a5c	mov x20,x16
008d3a60	sub w15,w15,#0x4
008d3a64	ldr x16,[x13]
008d3a68	ldr x17,[x12]
008d3a6c	cmp x16,x17
008d3a70	b.ne 0x008d3ad4
008d3a74	add x12,x12,#0x8
008d3a78	add x13,x13,#0x8
008d3a7c	add w15,w15,#0x8
008d3a80	cmp x12,x14
008d3a84	b.cc 0x008d3a64
008d3a88	b 0x008d3db4
008d3a8c	eor x10,x12,x11
008d3a90	rbit x10,x10
008d3a94	clz x10,x10
008d3a98	lsr w11,w10,#0x3
008d3a9c	b 0x008d3ab4
008d3aa0	eor x10,x15,x14
008d3aa4	rbit x10,x10
008d3aa8	clz x10,x10
008d3aac	lsr x10,x10,#0x3
008d3ab0	add w11,w10,w13
008d3ab4	add x10,x16,w11, UXTW 
008d3ab8	add x16,x10,#0x4
008d3abc	b 0x008d3c14
008d3ac0	eor x11,x13,x12
008d3ac4	rbit x11,x11
008d3ac8	clz x11,x11
008d3acc	lsr w11,w11,#0x3
008d3ad0	b 0x008d3aec
008d3ad4	eor x11,x17,x16
008d3ad8	mov x16,x20
008d3adc	rbit x11,x11
008d3ae0	clz x11,x11
008d3ae4	lsr x11,x11,#0x3
008d3ae8	add w11,w11,w15
008d3aec	add x12,x16,w11, UXTW 
008d3af0	add x12,x12,#0x4
008d3af4	cmp x12,x10
008d3af8	b.eq 0x008d3b04
008d3afc	mov x16,x12
008d3b00	b 0x008d3c14
008d3b04	cmp x10,x0
008d3b08	mov x14,x1
008d3b0c	mov x13,x10
008d3b10	b.cs 0x008d3b2c
008d3b14	ldr x13,[x1]
008d3b18	ldr x14,[x10]
008d3b1c	cmp x13,x14
008d3b20	b.ne 0x008d3be4
008d3b24	ldr x14,[sp, #0x60]
008d3b28	add x13,x10,#0x8
008d3b2c	cmp x13,x0
008d3b30	b.cs 0x008d3b74
008d3b34	ldur x15,[x29, #-0x40]
008d3b38	add x15,x15,x16
008d3b3c	ldur x16,[x29, #-0x38]
008d3b40	sub x15,x15,x27
008d3b44	cmp x15,x16
008d3b48	csel x15,x15,x16,cc
008d3b4c	sub w15,w13,w15
008d3b50	ldr x16,[x14]
008d3b54	ldr x17,[x13]
008d3b58	cmp x16,x17
008d3b5c	b.ne 0x008d3bf8
008d3b60	add x13,x13,#0x8
008d3b64	add x14,x14,#0x8
008d3b68	add w15,w15,#0x8
008d3b6c	cmp x13,x0
008d3b70	b.cc 0x008d3b50
008d3b74	ldr x15,[sp, #0x10]
008d3b78	cmp x13,x15
008d3b7c	b.cs 0x008d3b98
008d3b80	ldr w15,[x14]
008d3b84	ldr w16,[x13]
008d3b88	cmp w15,w16
008d3b8c	b.ne 0x008d3b98
008d3b90	add x13,x13,#0x4
008d3b94	add x14,x14,#0x4
008d3b98	ldr x15,[sp, #0x8]
008d3b9c	cmp x13,x15
008d3ba0	b.cs 0x008d3bbc
008d3ba4	ldrh w15,[x14]
008d3ba8	ldrh w16,[x13]
008d3bac	cmp w15,w16
008d3bb0	b.ne 0x008d3bbc
008d3bb4	add x13,x13,#0x2
008d3bb8	add x14,x14,#0x2
008d3bbc	ldur x15,[x29, #-0x38]
008d3bc0	cmp x13,x15
008d3bc4	b.cs 0x008d3bdc
008d3bc8	mov x15,x13
008d3bcc	ldrb w14,[x14]
008d3bd0	ldrb w16,[x15], #0x1
008d3bd4	cmp w14,w16
008d3bd8	csel x13,x13,x15,ne
008d3bdc	sub w10,w13,w10
008d3be0	b 0x008d3c0c
008d3be4	eor x10,x14,x13
008d3be8	rbit x10,x10
008d3bec	clz x10,x10
008d3bf0	lsr w10,w10,#0x3
008d3bf4	b 0x008d3c0c
008d3bf8	eor x10,x17,x16
008d3bfc	rbit x10,x10
008d3c00	clz x10,x10
008d3c04	lsr x10,x10,#0x3
008d3c08	add w10,w10,w15
008d3c0c	add x16,x12,w10, UXTW 
008d3c10	add w11,w10,w11
008d3c14	add w10,w11,#0xf0
008d3c18	umull x10,w10,w24
008d3c1c	add x10,x8,x10, LSR #0x27
008d3c20	add x10,x10,#0x8
008d3c24	cmp x10,x4
008d3c28	b.hi 0x008d35b0
008d3c2c	ldrb w12,[x9]
008d3c30	subs w10,w11,#0xf
008d3c34	b.cc 0x008d3cfc
008d3c38	add w12,w12,#0xf
008d3c3c	cmp w10,#0x3fc
008d3c40	strb w12,[x9]
008d3c44	mov w9,#0xffffffff
008d3c48	str w9,[x25]
008d3c4c	b.cc 0x008d3cdc
008d3c50	sub w20,w11,#0x40b
008d3c54	add x25,x8,#0x6
008d3c58	mov w1,#0xff
008d3c5c	umull x9,w20,w24
008d3c60	mov x0,x25
008d3c64	mov x28,x5
008d3c68	mov w22,w26
008d3c6c	mov x26,x6
008d3c70	mov w27,w7
008d3c74	mov x19,x30
008d3c78	mov x23,x16
008d3c7c	lsr x21,x9,#0x29
008d3c80	lsl w24,w21,#0x2
008d3c84	add x2,x24,#0x4
008d3c88	bl 0x00c301c0
008d3c8c	mov w8,#0x3fc
008d3c90	mov x16,x23
008d3c94	mov x30,x19
008d3c98	mov x23,#0xbb000000
008d3c9c	ldp x19,x4,[x29, #-0x68]
008d3ca0	ldp x3,x1,[x29, #-0x18]
008d3ca4	msub w10,w21,w8,w20
008d3ca8	ldur x0,[x29, #-0x50]
008d3cac	mov x6,x26
008d3cb0	mov w26,w22
008d3cb4	ldr x22,[sp, #0x70]
008d3cb8	movk x23,#0xbcdc, LSL #32
008d3cbc	ldur w2,[x29, #-0x20]
008d3cc0	add x25,x25,x24
008d3cc4	mov w24,#0x8081
008d3cc8	mov w7,w27
008d3ccc	movk x23,#0xcf1b, LSL #48
008d3cd0	mov x5,x28
008d3cd4	mov w21,#0xffff
008d3cd8	movk w24,#0x8080, LSL #16
008d3cdc	and w8,w10,#0xffff
008d3ce0	mov w9,#0x8081
008d3ce4	mul w8,w8,w9
008d3ce8	lsr w8,w8,#0x17
008d3cec	add x25,x25,x8
008d3cf0	add w8,w10,w8
008d3cf4	strb w8,[x25], #0x1
008d3cf8	b 0x008d3d04
008d3cfc	add w8,w12,w11
008d3d00	strb w8,[x9]
008d3d04	cmp x16,x30
008d3d08	b.cs 0x008d34ec
008d3d0c	mov x9,x16
008d3d10	ldr x10,[x16]
008d3d14	ldr x8,[x9, #-0x2]!
008d3d18	mul x10,x10,x23
008d3d1c	sub w9,w9,w19
008d3d20	mul x8,x8,x23
008d3d24	lsr x8,x8,#0x32
008d3d28	and x11,x8,#0x3ffc
008d3d2c	lsr x8,x10,#0x34
008d3d30	str w9,[x3, x11#0x0]
008d3d34	ldr w9,[x3, x8, LSL #0x2]
008d3d38	cmp w9,w2
008d3d3c	b.cs 0x008d3d54
008d3d40	ldr w9,[x5, x8, LSL #0x2]
008d3d44	mov x28,x6
008d3d48	add x27,x22,x9
008d3d4c	add w9,w9,w7
008d3d50	b 0x008d3d5c
008d3d54	add x27,x19,x9
008d3d58	mov x28,x1
008d3d5c	sub w10,w16,w19
008d3d60	add w11,w9,w21
008d3d64	str w10,[x3, x8, LSL #0x2]
008d3d68	cmp w11,w10
008d3d6c	b.cc 0x008d3704
008d3d70	ldr w8,[x27]
008d3d74	ldr w11,[x16]
008d3d78	cmp w8,w11
008d3d7c	b.ne 0x008d3704
008d3d80	mov x8,x25
008d3d84	sub w10,w10,w9
008d3d88	mov x9,x25
008d3d8c	strb wzr,[x8], #0x1
008d3d90	b 0x008d392c
008d3d94	mov x11,x10
008d3d98	cmp x11,x0
008d3d9c	b.cc 0x008d396c
008d3da0	b 0x008d3998
008d3da4	mov x12,x11
008d3da8	cmp x12,x14
008d3dac	b.cc 0x008d3a58
008d3db0	mov x20,x16
008d3db4	sub x14,x10,#0x3
008d3db8	cmp x12,x14
008d3dbc	b.cs 0x008d3dd8
008d3dc0	ldr w14,[x13]
008d3dc4	ldr w15,[x12]
008d3dc8	cmp w14,w15
008d3dcc	b.ne 0x008d3dd8
008d3dd0	add x12,x12,#0x4
008d3dd4	add x13,x13,#0x4
008d3dd8	sub x14,x10,#0x1
008d3ddc	cmp x12,x14
008d3de0	b.cs 0x008d3e04
008d3de4	ldrh w14,[x13]
008d3de8	ldrh w15,[x12]
008d3dec	mov x16,x20
008d3df0	cmp w14,w15
008d3df4	b.ne 0x008d3e08
008d3df8	add x12,x12,#0x2
008d3dfc	add x13,x13,#0x2
008d3e00	b 0x008d3e08
008d3e04	mov x16,x20
008d3e08	cmp x12,x10
008d3e0c	b.cs 0x008d3e24
008d3e10	mov x14,x12
008d3e14	ldrb w13,[x13]
008d3e18	ldrb w15,[x14], #0x1
008d3e1c	cmp w13,w15
008d3e20	csel x12,x12,x14,ne
008d3e24	sub w11,w12,w11
008d3e28	b 0x008d3aec
008d3e2c	sub x9,x27,#0x1
008d3e30	sub x8,x24,#0x1
008d3e34	mov x27,x9
008d3e38	cmp x9,x28
008d3e3c	mov x24,x8
008d3e40	b.ls 0x008d37c0
008d3e44	cmp x24,x16
008d3e48	b.ls 0x008d37c0
008d3e4c	mov x8,x24
008d3e50	mov x9,x27
008d3e54	ldrb w10,[x8, #-0x1]!
008d3e58	ldrb w11,[x9, #-0x1]!
008d3e5c	cmp w10,w11
008d3e60	b.eq 0x008d3e34
008d3e64	b 0x008d37c0
008d3e68	mov x22,x1
008d3e6c	mov x25,#0xbb000000
008d3e70	ldur x12,[x29, #-0x28]
008d3e74	ldr x9,[x22], #0x1
008d3e78	movk x25,#0xbcdc, LSL #32
008d3e7c	movk x25,#0xcf1b, LSL #48
008d3e80	sub x26,x12,#0xb
008d3e84	sub x11,x12,#0x5
008d3e88	mul x9,x9,x25
008d3e8c	sub x27,x12,#0xc
008d3e90	sub x13,x12,#0x8
008d3e94	sub x12,x12,#0x6
008d3e98	mov w10,w2
008d3e9c	stur x11,[x29, #-0x50]
008d3ea0	stp x12,x13,[x29, #-0x68]
008d3ea4	ldur w12,[x29, #-0x44]
008d3ea8	sub x8,x1,w8, UXTW 
008d3eac	mov w11,#0x1
008d3eb0	mov w17,#0x8081
008d3eb4	sub x24,x1,x10
008d3eb8	mvn x10,x10
008d3ebc	orr w0,w11,w12, LSL #0x6
008d3ec0	ldur x23,[x29, #-0x58]
008d3ec4	lsr x9,x9,#0x32
008d3ec8	stur x8,[x29, #-0x30]
008d3ecc	add x8,x1,#0x2
008d3ed0	mov w19,#0xffff
008d3ed4	movk w17,#0x8080, LSL #16
008d3ed8	add x10,x10,x1
008d3edc	and x9,x9,#0x3ffc
008d3ee0	mov x28,x1
008d3ee4	str x10,[sp, #0x60]
008d3ee8	str w2,[x3, x9#0x0]
008d3eec	stur x16,[x29, #-0x20]
008d3ef0	stur w0,[x29, #-0x38]
008d3ef4	b 0x008d3f0c
008d3ef8	add x8,x9,#0x6
008d3efc	ldur w0,[x29, #-0x38]
008d3f00	add x22,x9,#0x5
008d3f04	cmp x8,x26
008d3f08	b.hi 0x008d2b44
008d3f0c	ldr x11,[x22]
008d3f10	ldur w9,[x29, #-0x44]
008d3f14	mov w10,w0
008d3f18	b 0x008d3f34
008d3f1c	add x8,x13,w9, UXTW 
008d3f20	lsr w9,w10,#0x6
008d3f24	add w10,w10,#0x1
008d3f28	mov x22,x13
008d3f2c	cmp x8,x26
008d3f30	b.hi 0x008d2b44
008d3f34	mul x11,x11,x25
008d3f38	mov x13,x8
008d3f3c	sub w8,w22,w24
008d3f40	lsr x11,x11,#0x32
008d3f44	and x14,x11,#0x3ffc
008d3f48	ldr x11,[x13]
008d3f4c	ldr w12,[x3, x14#0x0]
008d3f50	str w8,[x3, x14#0x0]
008d3f54	add w15,w12,w19
008d3f58	cmp w15,w8
008d3f5c	b.cc 0x008d3f1c
008d3f60	ldr w8,[x24, x12#0x0]
008d3f64	ldr w14,[x22]
008d3f68	cmp w8,w14
008d3f6c	b.ne 0x008d3f1c
008d3f70	ldur x8,[x29, #-0x30]
008d3f74	add x20,x24,x12
008d3f78	cmp x20,x8
008d3f7c	b.ls 0x008d3f90
008d3f80	ldurb w8,[x22, #-0x1]
008d3f84	ldurb w9,[x20, #-0x1]
008d3f88	cmp w8,w9
008d3f8c	b.eq 0x008d42f4
008d3f90	mov x8,x22
008d3f94	sub x9,x8,x28
008d3f98	add x0,x23,#0x1
008d3f9c	mov w21,w9
008d3fa0	umull x10,w21,w17
008d3fa4	add x11,x0,x21
008d3fa8	add x10,x11,x10, LSR #0x27
008d3fac	add x10,x10,#0x8
008d3fb0	cmp x10,x16
008d3fb4	b.hi 0x008d4858
008d3fb8	subs w10,w9,#0xf
008d3fbc	b.cc 0x008d4024
008d3fc0	cmp w10,#0xff
008d3fc4	mov w9,#0xf0
008d3fc8	strb w9,[x23]
008d3fcc	b.cc 0x008d401c
008d3fd0	sub w8,w8,w28
008d3fd4	mov w1,#0xff
008d3fd8	sub w8,w8,#0x10e
008d3fdc	str w8,[sp, #0x70]
008d3fe0	umull x8,w8,w17
008d3fe4	lsr x8,x8,#0x27
008d3fe8	add x2,x8,#0x1
008d3fec	str x8,[sp, #0x68]
008d3ff0	bl 0x00c301c0
008d3ff4	ldr x9,[sp, #0x68]
008d3ff8	ldp x16,x3,[x29, #-0x20]
008d3ffc	ldr w10,[sp, #0x70]
008d4000	mov w17,#0x8081
008d4004	ldur x1,[x29, #-0x10]
008d4008	sub w8,w9,w9, LSL #0x8
008d400c	add x9,x23,x9
008d4010	movk w17,#0x8080, LSL #16
008d4014	add x0,x9,#0x2
008d4018	add w10,w10,w8
008d401c	strb w10,[x0], #0x1
008d4020	b 0x008d402c
008d4024	lsl w8,w9,#0x4
008d4028	strb w8,[x23]
008d402c	cmp x21,#0x8
008d4030	mov w8,#0x8
008d4034	csel x9,x21,x8,hi
008d4038	cmp x21,#0x19
008d403c	add x8,x0,x21
008d4040	b.cc 0x008d409c
008d4044	sub x10,x0,x28
008d4048	cmp x10,#0x20
008d404c	b.cc 0x008d409c
008d4050	sub x9,x9,#0x1
008d4054	add x13,x0,#0x10
008d4058	add x14,x28,#0x10
008d405c	lsr x9,x9,#0x3
008d4060	add x11,x9,#0x1
008d4064	and x12,x11,#0x3ffffffffffffffc
008d4068	lsl x10,x12,#0x3
008d406c	mov x15,x12
008d4070	add x9,x28,x10
008d4074	add x10,x0,x10
008d4078	ldp q0,q1,[x14, #-0x10]
008d407c	subs x15,x15,#0x4
008d4080	add x14,x14,#0x20
008d4084	stp q0,q1,[x13, #-0x10]
008d4088	add x13,x13,#0x20
008d408c	b.ne 0x008d4078
008d4090	cmp x11,x12
008d4094	b.ne 0x008d40a4
008d4098	b 0x008d40b4
008d409c	mov x9,x28
008d40a0	mov x10,x0
008d40a4	ldr x11,[x9], #0x8
008d40a8	str x11,[x10], #0x8
008d40ac	cmp x10,x8
008d40b0	b.cc 0x008d40a4
008d40b4	mov x9,x23
008d40b8	mov x28,x22
008d40bc	add x10,x28,#0x4
008d40c0	sub w11,w28,w20
008d40c4	mov x23,x8
008d40c8	cmp x10,x27
008d40cc	add x12,x20,#0x4
008d40d0	strh w11,[x23], #0x2
008d40d4	b.cs 0x008d42e4
008d40d8	ldr x11,[x12]
008d40dc	ldr x12,[x10]
008d40e0	cmp x11,x12
008d40e4	b.ne 0x008d419c
008d40e8	add x11,x28,#0xc
008d40ec	add x12,x20,#0xc
008d40f0	cmp x11,x27
008d40f4	b.cs 0x008d4124
008d40f8	sub w13,w11,w28
008d40fc	sub w13,w13,#0x4
008d4100	ldr x14,[x12]
008d4104	ldr x15,[x11]
008d4108	cmp x14,x15
008d410c	b.ne 0x008d41b0
008d4110	add x11,x11,#0x8
008d4114	add x12,x12,#0x8
008d4118	add w13,w13,#0x8
008d411c	cmp x11,x27
008d4120	b.cc 0x008d4100
008d4124	ldur x13,[x29, #-0x60]
008d4128	cmp x11,x13
008d412c	b.cs 0x008d414c
008d4130	ldr w13,[x12]
008d4134	ldr w14,[x11]
008d4138	cmp w13,w14
008d413c	add x13,x11,#0x4
008d4140	add x14,x12,#0x4
008d4144	csel x12,x12,x14,ne
008d4148	csel x11,x11,x13,ne
008d414c	ldur x13,[x29, #-0x68]
008d4150	cmp x11,x13
008d4154	b.cs 0x008d4174
008d4158	ldrh w13,[x12]
008d415c	ldrh w14,[x11]
008d4160	cmp w13,w14
008d4164	add x13,x11,#0x2
008d4168	add x14,x12,#0x2
008d416c	csel x12,x12,x14,ne
008d4170	csel x11,x11,x13,ne
008d4174	ldur x13,[x29, #-0x50]
008d4178	cmp x11,x13
008d417c	b.cs 0x008d4194
008d4180	mov x13,x11
008d4184	ldrb w12,[x12]
008d4188	ldrb w14,[x13], #0x1
008d418c	cmp w12,w14
008d4190	csel x11,x11,x13,ne
008d4194	sub w20,w11,w10
008d4198	b 0x008d41c4
008d419c	eor x10,x12,x11
008d41a0	rbit x10,x10
008d41a4	clz x10,x10
008d41a8	lsr w20,w10,#0x3
008d41ac	b 0x008d41c4
008d41b0	eor x10,x15,x14
008d41b4	rbit x10,x10
008d41b8	clz x10,x10
008d41bc	lsr x10,x10,#0x3
008d41c0	add w20,w10,w13
008d41c4	add w10,w20,#0xf0
008d41c8	umull x10,w10,w17
008d41cc	add x10,x8,x10, LSR #0x27
008d41d0	add x10,x10,#0x8
008d41d4	cmp x10,x16
008d41d8	b.hi 0x008d4858
008d41dc	ldrb w11,[x9]
008d41e0	subs w10,w20,#0xf
008d41e4	b.cc 0x008d4264
008d41e8	add w11,w11,#0xf
008d41ec	cmp w10,#0x3fc
008d41f0	strb w11,[x9]
008d41f4	mov w9,#0xffffffff
008d41f8	str w9,[x23]
008d41fc	b.cc 0x008d4244
008d4200	sub w21,w20,#0x40b
008d4204	add x23,x8,#0x6
008d4208	mov w1,#0xff
008d420c	umull x9,w21,w17
008d4210	mov x0,x23
008d4214	lsr x22,x9,#0x29
008d4218	lsl w19,w22,#0x2
008d421c	add x2,x19,#0x4
008d4220	bl 0x00c301c0
008d4224	mov w8,#0x3fc
008d4228	ldp x16,x3,[x29, #-0x20]
008d422c	msub w10,w22,w8,w21
008d4230	mov w17,#0x8081
008d4234	ldur x1,[x29, #-0x10]
008d4238	movk w17,#0x8080, LSL #16
008d423c	add x23,x23,x19
008d4240	mov w19,#0xffff
008d4244	and w8,w10,#0xffff
008d4248	mov w9,#0x8081
008d424c	mul w8,w8,w9
008d4250	lsr w8,w8,#0x17
008d4254	add x23,x23,x8
008d4258	add w8,w10,w8
008d425c	strb w8,[x23], #0x1
008d4260	b 0x008d426c
008d4264	add w8,w11,w20
008d4268	strb w8,[x9]
008d426c	add x9,x28,w20, UXTW 
008d4270	add x28,x9,#0x4
008d4274	cmp x28,x26
008d4278	b.cs 0x008d2b44
008d427c	mov x8,x9
008d4280	ldr x10,[x8, #0x2]!
008d4284	ldur x11,[x8, #0x2]
008d4288	sub w8,w8,w24
008d428c	mul x10,x10,x25
008d4290	mul x11,x11,x25
008d4294	lsr x10,x10,#0x32
008d4298	lsr x11,x11,#0x32
008d429c	and x10,x10,#0x3ffc
008d42a0	str w8,[x3, x10#0x0]
008d42a4	and x10,x11,#0x3ffc
008d42a8	sub w11,w28,w24
008d42ac	ldr w8,[x3, x10#0x0]
008d42b0	str w11,[x3, x10#0x0]
008d42b4	add w12,w8,w19
008d42b8	cmp w12,w11
008d42bc	b.cc 0x008d3ef8
008d42c0	add x20,x24,x8
008d42c4	ldr w10,[x28]
008d42c8	ldr w8,[x20]
008d42cc	cmp w8,w10
008d42d0	b.ne 0x008d3ef8
008d42d4	mov x8,x23
008d42d8	mov x9,x23
008d42dc	strb wzr,[x8], #0x1
008d42e0	b 0x008d40bc
008d42e4	mov x11,x10
008d42e8	cmp x11,x27
008d42ec	b.cc 0x008d40f8
008d42f0	b 0x008d4124
008d42f4	ldr x8,[sp, #0x60]
008d42f8	sub x11,x22,#0x1
008d42fc	mov x9,x11
008d4300	add x10,x8,x12
008d4304	ldur x8,[x29, #-0x30]
008d4308	mov x20,x10
008d430c	mov x22,x9
008d4310	cmp x10,x8
008d4314	mov x8,x11
008d4318	b.ls 0x008d3f94
008d431c	cmp x22,x28
008d4320	b.ls 0x008d3f94
008d4324	mov x9,x22
008d4328	mov x10,x20
008d432c	ldrb w11,[x9, #-0x1]!
008d4330	ldrb w12,[x10, #-0x1]!
008d4334	cmp w11,w12
008d4338	sub x11,x8,#0x1
008d433c	b.eq 0x008d4304
008d4340	b 0x008d3f94
008d4344	mov x22,x1
008d4348	mov x16,#0xbb000000
008d434c	ldur x12,[x29, #-0x38]
008d4350	ldr x9,[x22], #0x1
008d4354	movk x16,#0xbcdc, LSL #32
008d4358	movk x16,#0xcf1b, LSL #48
008d435c	sub x11,x12,#0x5
008d4360	mov w10,w2
008d4364	mul x9,x9,x16
008d4368	stur x11,[x29, #-0x68]
008d436c	sub x8,x1,w8, UXTW 
008d4370	mov w11,#0x1
008d4374	mov w5,#0x8081
008d4378	sub x20,x1,x10
008d437c	mvn x10,x10
008d4380	orr w0,w11,w26, LSL #0x6
008d4384	ldur x23,[x29, #-0x58]
008d4388	sub x17,x12,#0xb
008d438c	stur x8,[x29, #-0x40]
008d4390	add x8,x1,#0x2
008d4394	sub x19,x12,#0xc
008d4398	sub x13,x12,#0x8
008d439c	sub x12,x12,#0x6
008d43a0	lsr x9,x9,#0x32
008d43a4	mov w4,#0xffff
008d43a8	movk w5,#0x8080, LSL #16
008d43ac	add x10,x10,x1
008d43b0	mov x28,x1
008d43b4	stp x12,x13,[sp, #0x68]
008d43b8	and x9,x9,#0x3ffc
008d43bc	str x10,[sp, #0x50]
008d43c0	str w2,[x3, x9#0x0]
008d43c4	stur w26,[x29, #-0x44]
008d43c8	stur w27,[x29, #-0x28]
008d43cc	stur x24,[x29, #-0x30]
008d43d0	stur w0,[x29, #-0x50]
008d43d4	b 0x008d43ec
008d43d8	add x8,x9,#0x6
008d43dc	ldur w0,[x29, #-0x50]
008d43e0	add x22,x9,#0x5
008d43e4	cmp x8,x17
008d43e8	b.hi 0x008d2978
008d43ec	ldr x11,[x22]
008d43f0	mov w9,w26
008d43f4	mov w10,w0
008d43f8	b 0x008d4414
008d43fc	add x8,x13,w9, UXTW 
008d4400	lsr w9,w10,#0x6
008d4404	add w10,w10,#0x1
008d4408	mov x22,x13
008d440c	cmp x8,x17
008d4410	b.hi 0x008d2978
008d4414	mul x11,x11,x16
008d4418	mov x13,x8
008d441c	sub w8,w22,w20
008d4420	lsr x11,x11,#0x32
008d4424	and x14,x11,#0x3ffc
008d4428	ldr x11,[x13]
008d442c	ldr w12,[x3, x14#0x0]
008d4430	str w8,[x3, x14#0x0]
008d4434	add w15,w12,w4
008d4438	cmp w12,w27
008d443c	ccmp w15,w8,#0x0,cs
008d4440	b.cc 0x008d43fc
008d4444	ldr w8,[x20, x12#0x0]
008d4448	ldr w14,[x22]
008d444c	cmp w8,w14
008d4450	b.ne 0x008d43fc
008d4454	ldur x8,[x29, #-0x40]
008d4458	add x25,x20,x12
008d445c	cmp x25,x8
008d4460	b.ls 0x008d4474
008d4464	ldurb w8,[x22, #-0x1]
008d4468	ldurb w9,[x25, #-0x1]
008d446c	cmp w8,w9
008d4470	b.eq 0x008d4808
008d4474	mov x8,x22
008d4478	sub x9,x8,x28
008d447c	add x0,x23,#0x1
008d4480	mov w21,w9
008d4484	umull x10,w21,w5
008d4488	add x11,x0,x21
008d448c	add x10,x11,x10, LSR #0x27
008d4490	add x10,x10,#0x8
008d4494	cmp x10,x24
008d4498	b.hi 0x008d4858
008d449c	subs w10,w9,#0xf
008d44a0	b.cc 0x008d451c
008d44a4	cmp w10,#0xff
008d44a8	mov w9,#0xf0
008d44ac	strb w9,[x23]
008d44b0	b.cc 0x008d4514
008d44b4	sub w8,w8,w28
008d44b8	mov w1,#0xff
008d44bc	stur x17,[x29, #-0x20]
008d44c0	sub w8,w8,#0x10e
008d44c4	str w8,[sp, #0x60]
008d44c8	umull x8,w8,w5
008d44cc	lsr x8,x8,#0x27
008d44d0	add x2,x8,#0x1
008d44d4	str x8,[sp, #0x58]
008d44d8	bl 0x00c301c0
008d44dc	ldr x9,[sp, #0x58]
008d44e0	ldp x17,x3,[x29, #-0x20]
008d44e4	mov x16,#0xbb000000
008d44e8	ldr w10,[sp, #0x60]
008d44ec	mov w5,#0x8081
008d44f0	sub w8,w9,w9, LSL #0x8
008d44f4	movk x16,#0xbcdc, LSL #32
008d44f8	ldur x1,[x29, #-0x10]
008d44fc	add x9,x23,x9
008d4500	movk w5,#0x8080, LSL #16
008d4504	mov w4,#0xffff
008d4508	movk x16,#0xcf1b, LSL #48
008d450c	add w10,w10,w8
008d4510	add x0,x9,#0x2
008d4514	strb w10,[x0], #0x1
008d4518	b 0x008d4524
008d451c	lsl w8,w9,#0x4
008d4520	strb w8,[x23]
008d4524	cmp x21,#0x8
008d4528	mov w8,#0x8
008d452c	csel x9,x21,x8,hi
008d4530	cmp x21,#0x19
008d4534	add x8,x0,x21
008d4538	b.cc 0x008d4594
008d453c	sub x10,x0,x28
008d4540	cmp x10,#0x20
008d4544	b.cc 0x008d4594
008d4548	sub x9,x9,#0x1
008d454c	add x13,x0,#0x10
008d4550	add x14,x28,#0x10
008d4554	lsr x9,x9,#0x3
008d4558	add x11,x9,#0x1
008d455c	and x12,x11,#0x3ffffffffffffffc
008d4560	lsl x10,x12,#0x3
008d4564	mov x15,x12
008d4568	add x9,x28,x10
008d456c	add x10,x0,x10
008d4570	ldp q0,q1,[x14, #-0x10]
008d4574	subs x15,x15,#0x4
008d4578	add x14,x14,#0x20
008d457c	stp q0,q1,[x13, #-0x10]
008d4580	add x13,x13,#0x20
008d4584	b.ne 0x008d4570
008d4588	cmp x11,x12
008d458c	b.ne 0x008d459c
008d4590	b 0x008d45ac
008d4594	mov x9,x28
008d4598	mov x10,x0
008d459c	ldr x11,[x9], #0x8
008d45a0	str x11,[x10], #0x8
008d45a4	cmp x10,x8
008d45a8	b.cc 0x008d459c
008d45ac	mov x9,x23
008d45b0	mov x28,x22
008d45b4	add x10,x28,#0x4
008d45b8	sub w11,w28,w25
008d45bc	mov x23,x8
008d45c0	cmp x10,x19
008d45c4	add x12,x25,#0x4
008d45c8	strh w11,[x23], #0x2
008d45cc	b.cs 0x008d47f8
008d45d0	ldr x11,[x12]
008d45d4	ldr x12,[x10]
008d45d8	cmp x11,x12
008d45dc	b.ne 0x008d4694
008d45e0	add x11,x28,#0xc
008d45e4	add x12,x25,#0xc
008d45e8	cmp x11,x19
008d45ec	b.cs 0x008d461c
008d45f0	sub w13,w11,w28
008d45f4	sub w13,w13,#0x4
008d45f8	ldr x14,[x12]
008d45fc	ldr x15,[x11]
008d4600	cmp x14,x15
008d4604	b.ne 0x008d46a8
008d4608	add x11,x11,#0x8
008d460c	add x12,x12,#0x8
008d4610	add w13,w13,#0x8
008d4614	cmp x11,x19
008d4618	b.cc 0x008d45f8
008d461c	ldr x13,[sp, #0x70]
008d4620	cmp x11,x13
008d4624	b.cs 0x008d4644
008d4628	ldr w13,[x12]
008d462c	ldr w14,[x11]
008d4630	cmp w13,w14
008d4634	add x13,x11,#0x4
008d4638	add x14,x12,#0x4
008d463c	csel x12,x12,x14,ne
008d4640	csel x11,x11,x13,ne
008d4644	ldr x13,[sp, #0x68]
008d4648	cmp x11,x13
008d464c	b.cs 0x008d466c
008d4650	ldrh w13,[x12]
008d4654	ldrh w14,[x11]
008d4658	cmp w13,w14
008d465c	add x13,x11,#0x2
008d4660	add x14,x12,#0x2
008d4664	csel x12,x12,x14,ne
008d4668	csel x11,x11,x13,ne
008d466c	ldur x13,[x29, #-0x68]
008d4670	cmp x11,x13
008d4674	b.cs 0x008d468c
008d4678	mov x13,x11
008d467c	ldrb w12,[x12]
008d4680	ldrb w14,[x13], #0x1
008d4684	cmp w12,w14
008d4688	csel x11,x11,x13,ne
008d468c	sub w21,w11,w10
008d4690	b 0x008d46bc
008d4694	eor x10,x12,x11
008d4698	rbit x10,x10
008d469c	clz x10,x10
008d46a0	lsr w21,w10,#0x3
008d46a4	b 0x008d46bc
008d46a8	eor x10,x15,x14
008d46ac	rbit x10,x10
008d46b0	clz x10,x10
008d46b4	lsr x10,x10,#0x3
008d46b8	add w21,w10,w13
008d46bc	add w10,w21,#0xf0
008d46c0	umull x10,w10,w5
008d46c4	add x10,x8,x10, LSR #0x27
008d46c8	add x10,x10,#0x8
008d46cc	cmp x10,x24
008d46d0	b.hi 0x008d4858
008d46d4	ldrb w11,[x9]
008d46d8	subs w10,w21,#0xf
008d46dc	b.cc 0x008d4774
008d46e0	add w11,w11,#0xf
008d46e4	cmp w10,#0x3fc
008d46e8	strb w11,[x9]
008d46ec	mov w9,#0xffffffff
008d46f0	str w9,[x23]
008d46f4	b.cc 0x008d4754
008d46f8	sub w22,w21,#0x40b
008d46fc	add x23,x8,#0x6
008d4700	mov w1,#0xff
008d4704	umull x9,w22,w5
008d4708	mov x0,x23
008d470c	mov x27,x16
008d4710	mov x24,x17
008d4714	lsr x25,x9,#0x29
008d4718	lsl w26,w25,#0x2
008d471c	add x2,x26,#0x4
008d4720	bl 0x00c301c0
008d4724	mov w8,#0x3fc
008d4728	ldp x3,x1,[x29, #-0x18]
008d472c	msub w10,w25,w8,w22
008d4730	mov w5,#0x8081
008d4734	mov x17,x24
008d4738	mov x16,x27
008d473c	add x23,x23,x26
008d4740	ldur w26,[x29, #-0x44]
008d4744	ldur x24,[x29, #-0x30]
008d4748	ldur w27,[x29, #-0x28]
008d474c	movk w5,#0x8080, LSL #16
008d4750	mov w4,#0xffff
008d4754	and w8,w10,#0xffff
008d4758	mov w9,#0x8081
008d475c	mul w8,w8,w9
008d4760	lsr w8,w8,#0x17
008d4764	add x23,x23,x8
008d4768	add w8,w10,w8
008d476c	strb w8,[x23], #0x1
008d4770	b 0x008d477c
008d4774	add w8,w11,w21
008d4778	strb w8,[x9]
008d477c	add x9,x28,w21, UXTW 
008d4780	add x28,x9,#0x4
008d4784	cmp x28,x17
008d4788	b.cs 0x008d2978
008d478c	mov x8,x9
008d4790	ldr x10,[x8, #0x2]!
008d4794	ldur x11,[x8, #0x2]
008d4798	sub w8,w8,w20
008d479c	mul x10,x10,x16
008d47a0	mul x11,x11,x16
008d47a4	lsr x10,x10,#0x32
008d47a8	lsr x11,x11,#0x32
008d47ac	and x10,x10,#0x3ffc
008d47b0	str w8,[x3, x10#0x0]
008d47b4	and x10,x11,#0x3ffc
008d47b8	sub w11,w28,w20
008d47bc	ldr w8,[x3, x10#0x0]
008d47c0	str w11,[x3, x10#0x0]
008d47c4	add w12,w8,w4
008d47c8	cmp w8,w27
008d47cc	ccmp w12,w11,#0x0,cs
008d47d0	b.cc 0x008d43d8
008d47d4	add x25,x20,x8
008d47d8	ldr w10,[x28]
008d47dc	ldr w8,[x25]
008d47e0	cmp w8,w10
008d47e4	b.ne 0x008d43d8
008d47e8	mov x8,x23
008d47ec	mov x9,x23
008d47f0	strb wzr,[x8], #0x1
008d47f4	b 0x008d45b4
008d47f8	mov x11,x10
008d47fc	cmp x11,x19
008d4800	b.cc 0x008d45f0
008d4804	b 0x008d461c
008d4808	ldr x8,[sp, #0x50]
008d480c	sub x11,x22,#0x1
008d4810	mov x9,x11
008d4814	add x10,x8,x12
008d4818	ldur x8,[x29, #-0x40]
008d481c	mov x25,x10
008d4820	mov x22,x9
008d4824	cmp x10,x8
008d4828	mov x8,x11
008d482c	b.ls 0x008d4478
008d4830	cmp x22,x28
008d4834	b.ls 0x008d4478
008d4838	mov x9,x22
008d483c	mov x10,x25
008d4840	ldrb w11,[x9, #-0x1]!
008d4844	ldrb w12,[x10, #-0x1]!
008d4848	cmp w11,w12
008d484c	sub x11,x8,#0x1
008d4850	b.eq 0x008d4818
008d4854	b 0x008d4478
008d4858	mov w0,wzr
008d485c	b 0x008d5984
008d4860	lsl w8,w21,#0x4
008d4864	strb w8,[x23]
008d4868	add x19,x23,#0x1
008d486c	mov x1,x28
008d4870	mov x2,x21
008d4874	mov x0,x19
008d4878	bl 0x00c2ffd0
008d487c	ldur x9,[x29, #-0x58]
008d4880	add w8,w19,w21
008d4884	sub w0,w8,w9
008d4888	b 0x008d5984
008d488c	lsl w8,w24,#0x4
008d4890	ldur x22,[x29, #-0x58]
008d4894	ldur w23,[x29, #-0x30]
008d4898	strb w8,[x19]
008d489c	add x19,x19,#0x1
008d48a0	mov x1,x25
008d48a4	mov x2,x24
008d48a8	mov x0,x19
008d48ac	bl 0x00c2ffd0
008d48b0	add w8,w19,w24
008d48b4	b 0x008d5970
008d48b8	mov x11,x1
008d48bc	mov x6,#0xbb000000
008d48c0	ldur x12,[x29, #-0x68]
008d48c4	ldr x8,[x11], #0x8
008d48c8	movk x6,#0xbcdc, LSL #32
008d48cc	movk x6,#0xcf1b, LSL #48
008d48d0	str x11,[sp, #0x70]
008d48d4	sub x27,x1,x10
008d48d8	mul x11,x8,x6
008d48dc	sub x8,x12,#0x5
008d48e0	mov w10,#0x1
008d48e4	stur x8,[x29, #-0x40]
008d48e8	ldur x8,[x29, #-0x38]
008d48ec	mov w30,#0x8081
008d48f0	ldur x26,[x29, #-0x58]
008d48f4	sub x7,x12,#0xb
008d48f8	add x28,x1,#0x1
008d48fc	cmp x8,#0x0
008d4900	add x8,x1,#0x2
008d4904	add w25,w2,#0x1
008d4908	csel x9,xzr,x9,eq
008d490c	sub x22,x12,#0xc
008d4910	sub x13,x12,#0x8
008d4914	stur x9,[x29, #-0x50]
008d4918	ldur w9,[x29, #-0x44]
008d491c	lsr x11,x11,#0x32
008d4920	sub x12,x12,#0x6
008d4924	mov w23,#0xffff
008d4928	movk w30,#0x8080, LSL #16
008d492c	orr w15,w10,w9, LSL #0x6
008d4930	and x11,x11,#0x3ffc
008d4934	mov x16,x1
008d4938	stp x12,x13,[sp, #0x28]
008d493c	str w2,[x3, x11#0x0]
008d4940	stur x4,[x29, #-0x60]
008d4944	stur w2,[x29, #-0x20]
008d4948	str w15,[sp, #0x68]
008d494c	b 0x008d4968
008d4950	add x8,x16,#0x2
008d4954	add x28,x16,#0x1
008d4958	ldr w15,[sp, #0x68]
008d495c	cmp x8,x7
008d4960	sub w25,w28,w27
008d4964	b.hi 0x008d2c3c
008d4968	ldur x11,[x16, #0x1]
008d496c	ldur w9,[x29, #-0x44]
008d4970	mov w10,w15
008d4974	b 0x008d4994
008d4978	add x8,x12,w9, UXTW 
008d497c	lsr w9,w10,#0x6
008d4980	add w10,w10,#0x1
008d4984	sub w25,w12,w27
008d4988	mov x28,x12
008d498c	cmp x8,x7
008d4990	b.hi 0x008d2c3c
008d4994	mul x11,x11,x6
008d4998	mov x12,x8
008d499c	lsr x11,x11,#0x32
008d49a0	and x13,x11,#0x3ffc
008d49a4	ldr x11,[x12]
008d49a8	ldr w21,[x3, x13#0x0]
008d49ac	str w25,[x3, x13#0x0]
008d49b0	add w8,w21,w23
008d49b4	cmp w8,w25
008d49b8	b.cc 0x008d4978
008d49bc	cmp w21,w2
008d49c0	ldr w14,[x28]
008d49c4	csel x8,x5,x27,cc
008d49c8	ldr w13,[x8, x21#0x0]
008d49cc	cmp w13,w14
008d49d0	b.ne 0x008d4978
008d49d4	ldur x9,[x29, #-0x38]
008d49d8	cmp w21,w2
008d49dc	add x24,x8,x21
008d49e0	csel x20,x9,x1,cc
008d49e4	cmp x24,x20
008d49e8	b.ls 0x008d49fc
008d49ec	ldurb w9,[x28, #-0x1]
008d49f0	ldurb w10,[x24, #-0x1]
008d49f4	cmp w9,w10
008d49f8	b.eq 0x008d5050
008d49fc	sub x8,x28,x16
008d4a00	add x0,x26,#0x1
008d4a04	mov w19,w8
008d4a08	umull x9,w19,w30
008d4a0c	add x10,x0,x19
008d4a10	add x9,x10,x9, LSR #0x27
008d4a14	add x9,x9,#0x8
008d4a18	cmp x9,x4
008d4a1c	b.hi 0x008d35b0
008d4a20	subs w9,w8,#0xf
008d4a24	b.cc 0x008d4aac
008d4a28	cmp w9,#0xff
008d4a2c	mov w8,#0xf0
008d4a30	strb w8,[x26]
008d4a34	b.cc 0x008d4aa4
008d4a38	sub w8,w28,w16
008d4a3c	mov w1,#0xff
008d4a40	stp x7,x5,[sp, #0x50]
008d4a44	sub w8,w8,#0x10e
008d4a48	str x16,[sp, #0x48]
008d4a4c	str w8,[sp, #0x40]
008d4a50	umull x8,w8,w30
008d4a54	lsr x8,x8,#0x27
008d4a58	add x2,x8,#0x1
008d4a5c	str x8,[sp, #0x38]
008d4a60	bl 0x00c301c0
008d4a64	ldr x9,[sp, #0x38]
008d4a68	ldp x16,x7,[sp, #0x48]
008d4a6c	mov x6,#0xbb000000
008d4a70	ldp x3,x1,[x29, #-0x18]
008d4a74	sub w8,w9,w9, LSL #0x8
008d4a78	add x10,x26,x9
008d4a7c	ldr w9,[sp, #0x40]
008d4a80	mov w30,#0x8081
008d4a84	movk x6,#0xbcdc, LSL #32
008d4a88	ldr x5,[sp, #0x58]
008d4a8c	ldur x4,[x29, #-0x60]
008d4a90	ldur w2,[x29, #-0x20]
008d4a94	movk w30,#0x8080, LSL #16
008d4a98	movk x6,#0xcf1b, LSL #48
008d4a9c	add w9,w9,w8
008d4aa0	add x0,x10,#0x2
008d4aa4	strb w9,[x0], #0x1
008d4aa8	b 0x008d4ab4
008d4aac	lsl w8,w8,#0x4
008d4ab0	strb w8,[x26]
008d4ab4	cmp x19,#0x8
008d4ab8	mov w8,#0x8
008d4abc	csel x9,x19,x8,hi
008d4ac0	cmp x19,#0x19
008d4ac4	add x8,x0,x19
008d4ac8	b.cc 0x008d4b34
008d4acc	sub x10,x0,x16
008d4ad0	ldur x19,[x29, #-0x28]
008d4ad4	cmp x10,#0x20
008d4ad8	b.cc 0x008d4b28
008d4adc	sub x9,x9,#0x1
008d4ae0	add x13,x0,#0x10
008d4ae4	add x14,x16,#0x10
008d4ae8	lsr x9,x9,#0x3
008d4aec	add x11,x9,#0x1
008d4af0	and x12,x11,#0x3ffffffffffffffc
008d4af4	lsl x10,x12,#0x3
008d4af8	mov x15,x12
008d4afc	add x9,x16,x10
008d4b00	add x10,x0,x10
008d4b04	ldp q0,q1,[x14, #-0x10]
008d4b08	subs x15,x15,#0x4
008d4b0c	add x14,x14,#0x20
008d4b10	stp q0,q1,[x13, #-0x10]
008d4b14	add x13,x13,#0x20
008d4b18	b.ne 0x008d4b04
008d4b1c	cmp x11,x12
008d4b20	b.ne 0x008d4b40
008d4b24	b 0x008d4b50
008d4b28	mov x9,x16
008d4b2c	mov x10,x0
008d4b30	b 0x008d4b40
008d4b34	ldur x19,[x29, #-0x28]
008d4b38	mov x9,x16
008d4b3c	mov x10,x0
008d4b40	ldr x11,[x9], #0x8
008d4b44	str x11,[x10], #0x8
008d4b48	cmp x10,x8
008d4b4c	b.cc 0x008d4b40
008d4b50	sub w10,w25,w21
008d4b54	ldur x21,[x29, #-0x38]
008d4b58	mov x9,x26
008d4b5c	mov x16,x28
008d4b60	mov x26,x8
008d4b64	cmp x20,x21
008d4b68	strh w10,[x26], #0x2
008d4b6c	b.eq 0x008d4c44
008d4b70	add x10,x16,#0x4
008d4b74	add x12,x24,#0x4
008d4b78	cmp x10,x22
008d4b7c	b.cs 0x008d4fb8
008d4b80	ldr x11,[x12]
008d4b84	ldr x12,[x10]
008d4b88	cmp x11,x12
008d4b8c	b.ne 0x008d4cc4
008d4b90	add x11,x16,#0xc
008d4b94	add x12,x24,#0xc
008d4b98	cmp x11,x22
008d4b9c	b.cs 0x008d4bcc
008d4ba0	sub w13,w11,w16
008d4ba4	sub w13,w13,#0x4
008d4ba8	ldr x14,[x12]
008d4bac	ldr x15,[x11]
008d4bb0	cmp x14,x15
008d4bb4	b.ne 0x008d4cd8
008d4bb8	add x11,x11,#0x8
008d4bbc	add x12,x12,#0x8
008d4bc0	add w13,w13,#0x8
008d4bc4	cmp x11,x22
008d4bc8	b.cc 0x008d4ba8
008d4bcc	ldr x13,[sp, #0x30]
008d4bd0	cmp x11,x13
008d4bd4	b.cs 0x008d4bf4
008d4bd8	ldr w13,[x12]
008d4bdc	ldr w14,[x11]
008d4be0	cmp w13,w14
008d4be4	add x13,x11,#0x4
008d4be8	add x14,x12,#0x4
008d4bec	csel x12,x12,x14,ne
008d4bf0	csel x11,x11,x13,ne
008d4bf4	ldr x13,[sp, #0x28]
008d4bf8	cmp x11,x13
008d4bfc	b.cs 0x008d4c1c
008d4c00	ldrh w13,[x12]
008d4c04	ldrh w14,[x11]
008d4c08	cmp w13,w14
008d4c0c	add x13,x11,#0x2
008d4c10	add x14,x12,#0x2
008d4c14	csel x12,x12,x14,ne
008d4c18	csel x11,x11,x13,ne
008d4c1c	ldur x13,[x29, #-0x40]
008d4c20	cmp x11,x13
008d4c24	b.cs 0x008d4c3c
008d4c28	mov x13,x11
008d4c2c	ldrb w12,[x12]
008d4c30	ldrb w14,[x13], #0x1
008d4c34	cmp w12,w14
008d4c38	csel x11,x11,x13,ne
008d4c3c	sub w11,w11,w10
008d4c40	b 0x008d4cec
008d4c44	ldur x10,[x29, #-0x50]
008d4c48	ldur x11,[x29, #-0x40]
008d4c4c	add x13,x24,#0x4
008d4c50	sub x10,x10,x24
008d4c54	add x10,x16,x10
008d4c58	cmp x10,x11
008d4c5c	csel x10,x11,x10,hi
008d4c60	add x11,x16,#0x4
008d4c64	sub x14,x10,#0x7
008d4c68	cmp x11,x14
008d4c6c	b.cs 0x008d4fc8
008d4c70	ldr x12,[x13]
008d4c74	ldr x13,[x11]
008d4c78	cmp x12,x13
008d4c7c	b.ne 0x008d4cf8
008d4c80	add x12,x16,#0xc
008d4c84	add x13,x24,#0xc
008d4c88	cmp x12,x14
008d4c8c	b.cs 0x008d4fd4
008d4c90	sub w15,w12,w16
008d4c94	mov x0,x16
008d4c98	sub w15,w15,#0x4
008d4c9c	ldr x16,[x13]
008d4ca0	ldr x17,[x12]
008d4ca4	cmp x16,x17
008d4ca8	b.ne 0x008d4d0c
008d4cac	add x12,x12,#0x8
008d4cb0	add x13,x13,#0x8
008d4cb4	add w15,w15,#0x8
008d4cb8	cmp x12,x14
008d4cbc	b.cc 0x008d4c9c
008d4cc0	b 0x008d4fd8
008d4cc4	eor x10,x12,x11
008d4cc8	rbit x10,x10
008d4ccc	clz x10,x10
008d4cd0	lsr w11,w10,#0x3
008d4cd4	b 0x008d4cec
008d4cd8	eor x10,x15,x14
008d4cdc	rbit x10,x10
008d4ce0	clz x10,x10
008d4ce4	lsr x10,x10,#0x3
008d4ce8	add w11,w10,w13
008d4cec	add x10,x16,w11, UXTW 
008d4cf0	add x16,x10,#0x4
008d4cf4	b 0x008d4e54
008d4cf8	eor x11,x13,x12
008d4cfc	rbit x11,x11
008d4d00	clz x11,x11
008d4d04	lsr w11,w11,#0x3
008d4d08	b 0x008d4d24
008d4d0c	eor x11,x17,x16
008d4d10	mov x16,x0
008d4d14	rbit x11,x11
008d4d18	clz x11,x11
008d4d1c	lsr x11,x11,#0x3
008d4d20	add w11,w11,w15
008d4d24	add x12,x16,w11, UXTW 
008d4d28	add x12,x12,#0x4
008d4d2c	cmp x12,x10
008d4d30	b.eq 0x008d4d3c
008d4d34	mov x16,x12
008d4d38	b 0x008d4e54
008d4d3c	cmp x10,x22
008d4d40	mov x14,x1
008d4d44	mov x13,x10
008d4d48	b.cs 0x008d4d64
008d4d4c	ldr x13,[x1]
008d4d50	ldr x14,[x10]
008d4d54	cmp x13,x14
008d4d58	b.ne 0x008d4e24
008d4d5c	ldr x14,[sp, #0x70]
008d4d60	add x13,x10,#0x8
008d4d64	cmp x13,x22
008d4d68	b.cs 0x008d4dac
008d4d6c	ldur x15,[x29, #-0x50]
008d4d70	add x15,x15,x16
008d4d74	ldur x16,[x29, #-0x40]
008d4d78	sub x15,x15,x24
008d4d7c	cmp x15,x16
008d4d80	csel x15,x15,x16,cc
008d4d84	sub w15,w13,w15
008d4d88	ldr x16,[x14]
008d4d8c	ldr x17,[x13]
008d4d90	cmp x16,x17
008d4d94	b.ne 0x008d4e38
008d4d98	add x13,x13,#0x8
008d4d9c	add x14,x14,#0x8
008d4da0	add w15,w15,#0x8
008d4da4	cmp x13,x22
008d4da8	b.cc 0x008d4d88
008d4dac	ldr x15,[sp, #0x30]
008d4db0	cmp x13,x15
008d4db4	b.cs 0x008d4dd4
008d4db8	ldr w15,[x14]
008d4dbc	ldr w16,[x13]
008d4dc0	cmp w15,w16
008d4dc4	add x15,x13,#0x4
008d4dc8	add x16,x14,#0x4
008d4dcc	csel x14,x14,x16,ne
008d4dd0	csel x13,x13,x15,ne
008d4dd4	ldr x15,[sp, #0x28]
008d4dd8	cmp x13,x15
008d4ddc	b.cs 0x008d4dfc
008d4de0	ldrh w15,[x14]
008d4de4	ldrh w16,[x13]
008d4de8	cmp w15,w16
008d4dec	add x15,x13,#0x2
008d4df0	add x16,x14,#0x2
008d4df4	csel x14,x14,x16,ne
008d4df8	csel x13,x13,x15,ne
008d4dfc	ldur x15,[x29, #-0x40]
008d4e00	cmp x13,x15
008d4e04	b.cs 0x008d4e1c
008d4e08	mov x15,x13
008d4e0c	ldrb w14,[x14]
008d4e10	ldrb w16,[x15], #0x1
008d4e14	cmp w14,w16
008d4e18	csel x13,x13,x15,ne
008d4e1c	sub w10,w13,w10
008d4e20	b 0x008d4e4c
008d4e24	eor x10,x14,x13
008d4e28	rbit x10,x10
008d4e2c	clz x10,x10
008d4e30	lsr w10,w10,#0x3
008d4e34	b 0x008d4e4c
008d4e38	eor x10,x17,x16
008d4e3c	rbit x10,x10
008d4e40	clz x10,x10
008d4e44	lsr x10,x10,#0x3
008d4e48	add w10,w10,w15
008d4e4c	add x16,x12,w10, UXTW 
008d4e50	add w11,w10,w11
008d4e54	add w10,w11,#0xf0
008d4e58	umull x10,w10,w30
008d4e5c	add x10,x8,x10, LSR #0x27
008d4e60	add x10,x10,#0x8
008d4e64	cmp x10,x4
008d4e68	b.hi 0x008d2c68
008d4e6c	ldrb w12,[x9]
008d4e70	subs w10,w11,#0xf
008d4e74	b.cc 0x008d4f30
008d4e78	add w12,w12,#0xf
008d4e7c	cmp w10,#0x3fc
008d4e80	strb w12,[x9]
008d4e84	mov w9,#0xffffffff
008d4e88	str w9,[x26]
008d4e8c	b.cc 0x008d4f10
008d4e90	sub w19,w11,#0x40b
008d4e94	add x24,x8,#0x6
008d4e98	mov w1,#0xff
008d4e9c	umull x9,w19,w30
008d4ea0	mov x0,x24
008d4ea4	mov x26,x5
008d4ea8	mov x28,x6
008d4eac	mov x23,x27
008d4eb0	mov x27,x7
008d4eb4	mov x25,x22
008d4eb8	mov x22,x16
008d4ebc	lsr x20,x9,#0x29
008d4ec0	lsl w21,w20,#0x2
008d4ec4	add x2,x21,#0x4
008d4ec8	bl 0x00c301c0
008d4ecc	mov w8,#0x3fc
008d4ed0	ldp x3,x1,[x29, #-0x18]
008d4ed4	msub w10,w20,w8,w19
008d4ed8	mov w30,#0x8081
008d4edc	mov x5,x26
008d4ee0	ldur x4,[x29, #-0x60]
008d4ee4	ldur w2,[x29, #-0x20]
008d4ee8	ldur x19,[x29, #-0x28]
008d4eec	add x26,x24,x21
008d4ef0	ldur x21,[x29, #-0x38]
008d4ef4	mov x16,x22
008d4ef8	mov x22,x25
008d4efc	movk w30,#0x8080, LSL #16
008d4f00	mov x7,x27
008d4f04	mov x27,x23
008d4f08	mov w23,#0xffff
008d4f0c	mov x6,x28
008d4f10	and w8,w10,#0xffff
008d4f14	mov w9,#0x8081
008d4f18	mul w8,w8,w9
008d4f1c	lsr w8,w8,#0x17
008d4f20	add x26,x26,x8
008d4f24	add w8,w10,w8
008d4f28	strb w8,[x26], #0x1
008d4f2c	b 0x008d4f38
008d4f30	add w8,w12,w11
008d4f34	strb w8,[x9]
008d4f38	cmp x16,x7
008d4f3c	b.cs 0x008d2c3c
008d4f40	mov x8,x16
008d4f44	ldr x10,[x16]
008d4f48	ldr x9,[x8, #-0x2]!
008d4f4c	mul x10,x10,x6
008d4f50	sub w8,w8,w27
008d4f54	mul x9,x9,x6
008d4f58	lsr x10,x10,#0x32
008d4f5c	lsr x9,x9,#0x32
008d4f60	and x11,x10,#0x3ffc
008d4f64	sub w10,w16,w27
008d4f68	and x9,x9,#0x3ffc
008d4f6c	str w8,[x3, x9#0x0]
008d4f70	ldr w9,[x3, x11#0x0]
008d4f74	str w10,[x3, x11#0x0]
008d4f78	cmp w9,w2
008d4f7c	add w12,w9,w23
008d4f80	csel x8,x5,x27,cc
008d4f84	csel x20,x21,x1,cc
008d4f88	cmp w12,w10
008d4f8c	b.cc 0x008d4950
008d4f90	add x24,x8,x9
008d4f94	ldr w11,[x16]
008d4f98	ldr w8,[x24]
008d4f9c	cmp w8,w11
008d4fa0	b.ne 0x008d4950
008d4fa4	mov x8,x26
008d4fa8	sub w10,w10,w9
008d4fac	mov x9,x26
008d4fb0	strb wzr,[x8], #0x1
008d4fb4	b 0x008d4b60
008d4fb8	mov x11,x10
008d4fbc	cmp x11,x22
008d4fc0	b.cc 0x008d4ba0
008d4fc4	b 0x008d4bcc
008d4fc8	mov x12,x11
008d4fcc	cmp x12,x14
008d4fd0	b.cc 0x008d4c90
008d4fd4	mov x0,x16
008d4fd8	sub x14,x10,#0x3
008d4fdc	cmp x12,x14
008d4fe0	b.cs 0x008d4ffc
008d4fe4	ldr w14,[x13]
008d4fe8	ldr w15,[x12]
008d4fec	cmp w14,w15
008d4ff0	b.ne 0x008d4ffc
008d4ff4	add x12,x12,#0x4
008d4ff8	add x13,x13,#0x4
008d4ffc	sub x14,x10,#0x1
008d5000	cmp x12,x14
008d5004	b.cs 0x008d5028
008d5008	ldrh w14,[x13]
008d500c	ldrh w15,[x12]
008d5010	mov x16,x0
008d5014	cmp w14,w15
008d5018	b.ne 0x008d502c
008d501c	add x12,x12,#0x2
008d5020	add x13,x13,#0x2
008d5024	b 0x008d502c
008d5028	mov x16,x0
008d502c	cmp x12,x10
008d5030	b.cs 0x008d5048
008d5034	mov x14,x12
008d5038	ldrb w13,[x13]
008d503c	ldrb w15,[x14], #0x1
008d5040	cmp w13,w15
008d5044	csel x12,x12,x14,ne
008d5048	sub w11,w12,w11
008d504c	b 0x008d4d24
008d5050	add x8,x8,x21
008d5054	sub x9,x8,#0x1
008d5058	sub x8,x28,#0x1
008d505c	mov x24,x9
008d5060	cmp x9,x20
008d5064	mov x28,x8
008d5068	b.ls 0x008d49fc
008d506c	cmp x28,x16
008d5070	b.ls 0x008d49fc
008d5074	mov x8,x28
008d5078	mov x9,x24
008d507c	ldrb w10,[x8, #-0x1]!
008d5080	ldrb w11,[x9, #-0x1]!
008d5084	cmp w10,w11
008d5088	b.eq 0x008d505c
008d508c	b 0x008d49fc
008d5090	mov x11,x1
008d5094	mov x7,#0xbb000000
008d5098	ldr x12,[sp, #0x70]
008d509c	ldr x8,[x11], #0x8
008d50a0	movk x7,#0xbcdc, LSL #32
008d50a4	movk x7,#0xcf1b, LSL #48
008d50a8	str x11,[sp, #0x68]
008d50ac	sub x19,x1,x10
008d50b0	mul x11,x8,x7
008d50b4	sub x8,x12,#0x5
008d50b8	mov w10,#0x1
008d50bc	stur x8,[x29, #-0x50]
008d50c0	ldur x8,[x29, #-0x38]
008d50c4	mov w0,#0x8081
008d50c8	orr w15,w10,w26, LSL #0x6
008d50cc	ldur x24,[x29, #-0x58]
008d50d0	sub x25,x12,#0xb
008d50d4	cmp x8,#0x0
008d50d8	add x8,x1,#0x2
008d50dc	add x23,x1,#0x1
008d50e0	add w28,w2,#0x1
008d50e4	sub x22,x12,#0xc
008d50e8	sub x13,x12,#0x8
008d50ec	lsr x11,x11,#0x32
008d50f0	sub x12,x12,#0x6
008d50f4	mov w30,#0xffff
008d50f8	movk w0,#0x8080, LSL #16
008d50fc	csel x9,xzr,x9,eq
008d5100	mov x21,x1
008d5104	and x11,x11,#0x3ffc
008d5108	stp x12,x13,[sp, #0x28]
008d510c	stp x4,x9,[x29, #-0x68]
008d5110	str w2,[x3, x11#0x0]
008d5114	stur w26,[x29, #-0x44]
008d5118	stur w2,[x29, #-0x20]
008d511c	str w15,[sp, #0x60]
008d5120	b 0x008d5140
008d5124	add x8,x21,#0x2
008d5128	add x23,x21,#0x1
008d512c	ldur w26,[x29, #-0x44]
008d5130	ldr w15,[sp, #0x60]
008d5134	cmp x8,x25
008d5138	sub w28,w23,w19
008d513c	b.hi 0x008d2a3c
008d5140	ldur x11,[x21, #0x1]
008d5144	mov w9,w26
008d5148	mov w10,w15
008d514c	b 0x008d516c
008d5150	add x8,x12,w9, UXTW 
008d5154	lsr w9,w10,#0x6
008d5158	add w10,w10,#0x1
008d515c	sub w28,w12,w19
008d5160	mov x23,x12
008d5164	cmp x8,x25
008d5168	b.hi 0x008d2a3c
008d516c	mul x11,x11,x7
008d5170	mov x12,x8
008d5174	lsr x11,x11,#0x32
008d5178	and x13,x11,#0x3ffc
008d517c	ldr x11,[x12]
008d5180	ldr w20,[x3, x13#0x0]
008d5184	str w28,[x3, x13#0x0]
008d5188	add w8,w20,w30
008d518c	cmp w20,w5
008d5190	ccmp w8,w28,#0x0,cs
008d5194	b.cc 0x008d5150
008d5198	cmp w20,w2
008d519c	ldr w14,[x23]
008d51a0	csel x8,x6,x19,cc
008d51a4	ldr w13,[x8, x20#0x0]
008d51a8	cmp w13,w14
008d51ac	b.ne 0x008d5150
008d51b0	ldur x9,[x29, #-0x38]
008d51b4	cmp w20,w2
008d51b8	add x27,x8,x20
008d51bc	csel x26,x9,x1,cc
008d51c0	cmp x27,x26
008d51c4	b.ls 0x008d51d8
008d51c8	ldurb w9,[x23, #-0x1]
008d51cc	ldurb w10,[x27, #-0x1]
008d51d0	cmp w9,w10
008d51d4	b.eq 0x008d5830
008d51d8	sub x8,x23,x21
008d51dc	stur x21,[x29, #-0x40]
008d51e0	mov w11,#0x8081
008d51e4	mov w21,w8
008d51e8	movk w11,#0x8080, LSL #16
008d51ec	umull x9,w21,w0
008d51f0	add x0,x24,#0x1
008d51f4	add x10,x0,x21
008d51f8	add x9,x10,x9, LSR #0x27
008d51fc	add x9,x9,#0x8
008d5200	cmp x9,x4
008d5204	b.hi 0x008d35b0
008d5208	subs w9,w8,#0xf
008d520c	b.cc 0x008d5294
008d5210	cmp w9,#0xff
008d5214	mov w8,#0xf0
008d5218	strb w8,[x24]
008d521c	b.cc 0x008d528c
008d5220	ldur x8,[x29, #-0x40]
008d5224	mov w1,#0xff
008d5228	str w5,[sp, #0x50]
008d522c	str x6,[sp, #0x48]
008d5230	sub w8,w23,w8
008d5234	sub w8,w8,#0x10e
008d5238	str w8,[sp, #0x40]
008d523c	umull x8,w8,w11
008d5240	lsr x8,x8,#0x27
008d5244	add x2,x8,#0x1
008d5248	str x8,[sp, #0x38]
008d524c	bl 0x00c301c0
008d5250	ldr x9,[sp, #0x38]
008d5254	mov x7,#0xbb000000
008d5258	ldr x6,[sp, #0x48]
008d525c	ldp x3,x1,[x29, #-0x18]
008d5260	movk x7,#0xbcdc, LSL #32
008d5264	sub w8,w9,w9, LSL #0x8
008d5268	add x10,x24,x9
008d526c	ldr w9,[sp, #0x40]
008d5270	ldur x4,[x29, #-0x68]
008d5274	ldr w5,[sp, #0x50]
008d5278	ldur w2,[x29, #-0x20]
008d527c	mov w30,#0xffff
008d5280	movk x7,#0xcf1b, LSL #48
008d5284	add w9,w9,w8
008d5288	add x0,x10,#0x2
008d528c	strb w9,[x0], #0x1
008d5290	b 0x008d529c
008d5294	lsl w8,w8,#0x4
008d5298	strb w8,[x24]
008d529c	cmp x21,#0x8
008d52a0	mov w8,#0x8
008d52a4	csel x9,x21,x8,hi
008d52a8	cmp x21,#0x19
008d52ac	add x8,x0,x21
008d52b0	b.cc 0x008d5320
008d52b4	ldur x14,[x29, #-0x40]
008d52b8	sub x10,x0,x14
008d52bc	cmp x10,#0x20
008d52c0	b.cc 0x008d5318
008d52c4	sub x9,x9,#0x1
008d52c8	add x13,x0,#0x10
008d52cc	lsr x9,x9,#0x3
008d52d0	add x11,x9,#0x1
008d52d4	and x12,x11,#0x3ffffffffffffffc
008d52d8	lsl x10,x12,#0x3
008d52dc	mov x15,x12
008d52e0	add x9,x14,x10
008d52e4	add x10,x0,x10
008d52e8	add x14,x14,#0x10
008d52ec	ldp q0,q1,[x14, #-0x10]
008d52f0	subs x15,x15,#0x4
008d52f4	add x14,x14,#0x20
008d52f8	stp q0,q1,[x13, #-0x10]
008d52fc	add x13,x13,#0x20
008d5300	b.ne 0x008d52ec
008d5304	mov w0,#0x8081
008d5308	cmp x11,x12
008d530c	movk w0,#0x8080, LSL #16
008d5310	b.ne 0x008d5330
008d5314	b 0x008d5340
008d5318	mov x9,x14
008d531c	b 0x008d5324
008d5320	ldur x9,[x29, #-0x40]
008d5324	mov x10,x0
008d5328	mov w0,#0x8081
008d532c	movk w0,#0x8080, LSL #16
008d5330	ldr x11,[x9], #0x8
008d5334	str x11,[x10], #0x8
008d5338	cmp x10,x8
008d533c	b.cc 0x008d5330
008d5340	sub w10,w28,w20
008d5344	ldur x20,[x29, #-0x38]
008d5348	mov x9,x24
008d534c	mov x21,x23
008d5350	ldur w23,[x29, #-0x30]
008d5354	mov x24,x8
008d5358	cmp x26,x20
008d535c	strh w10,[x24], #0x2
008d5360	b.eq 0x008d5438
008d5364	add x10,x21,#0x4
008d5368	add x12,x27,#0x4
008d536c	cmp x10,x22
008d5370	b.cs 0x008d5810
008d5374	ldr x11,[x12]
008d5378	ldr x12,[x10]
008d537c	cmp x11,x12
008d5380	b.ne 0x008d551c
008d5384	add x11,x21,#0xc
008d5388	add x12,x27,#0xc
008d538c	cmp x11,x22
008d5390	b.cs 0x008d53c0
008d5394	sub w13,w11,w21
008d5398	sub w13,w13,#0x4
008d539c	ldr x14,[x12]
008d53a0	ldr x15,[x11]
008d53a4	cmp x14,x15
008d53a8	b.ne 0x008d5530
008d53ac	add x11,x11,#0x8
008d53b0	add x12,x12,#0x8
008d53b4	add w13,w13,#0x8
008d53b8	cmp x11,x22
008d53bc	b.cc 0x008d539c
008d53c0	ldr x13,[sp, #0x30]
008d53c4	cmp x11,x13
008d53c8	b.cs 0x008d53e8
008d53cc	ldr w13,[x12]
008d53d0	ldr w14,[x11]
008d53d4	cmp w13,w14
008d53d8	add x13,x11,#0x4
008d53dc	add x14,x12,#0x4
008d53e0	csel x12,x12,x14,ne
008d53e4	csel x11,x11,x13,ne
008d53e8	ldr x13,[sp, #0x28]
008d53ec	cmp x11,x13
008d53f0	b.cs 0x008d5410
008d53f4	ldrh w13,[x12]
008d53f8	ldrh w14,[x11]
008d53fc	cmp w13,w14
008d5400	add x13,x11,#0x2
008d5404	add x14,x12,#0x2
008d5408	csel x12,x12,x14,ne
008d540c	csel x11,x11,x13,ne
008d5410	ldur x13,[x29, #-0x50]
008d5414	cmp x11,x13
008d5418	b.cs 0x008d5430
008d541c	mov x13,x11
008d5420	ldrb w12,[x12]
008d5424	ldrb w14,[x13], #0x1
008d5428	cmp w12,w14
008d542c	csel x11,x11,x13,ne
008d5430	sub w11,w11,w10
008d5434	b 0x008d5544
008d5438	ldur x10,[x29, #-0x60]
008d543c	ldur x11,[x29, #-0x50]
008d5440	add x13,x27,#0x4
008d5444	sub x10,x10,x27
008d5448	add x10,x21,x10
008d544c	cmp x10,x11
008d5450	csel x10,x11,x10,hi
008d5454	add x11,x21,#0x4
008d5458	sub x14,x10,#0x7
008d545c	cmp x11,x14
008d5460	b.cs 0x008d5820
008d5464	ldr x12,[x13]
008d5468	ldr x13,[x11]
008d546c	cmp x12,x13
008d5470	b.ne 0x008d5550
008d5474	add x12,x21,#0xc
008d5478	add x13,x27,#0xc
008d547c	cmp x12,x14
008d5480	b.cs 0x008d54b0
008d5484	sub w15,w12,w21
008d5488	sub w15,w15,#0x4
008d548c	ldr x16,[x13]
008d5490	ldr x17,[x12]
008d5494	cmp x16,x17
008d5498	b.ne 0x008d5564
008d549c	add x12,x12,#0x8
008d54a0	add x13,x13,#0x8
008d54a4	add w15,w15,#0x8
008d54a8	cmp x12,x14
008d54ac	b.cc 0x008d548c
008d54b0	sub x14,x10,#0x3
008d54b4	cmp x12,x14
008d54b8	b.cs 0x008d54d4
008d54bc	ldr w14,[x13]
008d54c0	ldr w15,[x12]
008d54c4	cmp w14,w15
008d54c8	b.ne 0x008d54d4
008d54cc	add x12,x12,#0x4
008d54d0	add x13,x13,#0x4
008d54d4	sub x14,x10,#0x1
008d54d8	cmp x12,x14
008d54dc	b.cs 0x008d54f8
008d54e0	ldrh w14,[x13]
008d54e4	ldrh w15,[x12]
008d54e8	cmp w14,w15
008d54ec	b.ne 0x008d54f8
008d54f0	add x12,x12,#0x2
008d54f4	add x13,x13,#0x2
008d54f8	cmp x12,x10
008d54fc	b.cs 0x008d5514
008d5500	mov x14,x12
008d5504	ldrb w13,[x13]
008d5508	ldrb w15,[x14], #0x1
008d550c	cmp w13,w15
008d5510	csel x12,x12,x14,ne
008d5514	sub w11,w12,w11
008d5518	b 0x008d5578
008d551c	eor x10,x12,x11
008d5520	rbit x10,x10
008d5524	clz x10,x10
008d5528	lsr w11,w10,#0x3
008d552c	b 0x008d5544
008d5530	eor x10,x15,x14
008d5534	rbit x10,x10
008d5538	clz x10,x10
008d553c	lsr x10,x10,#0x3
008d5540	add w11,w10,w13
008d5544	add x10,x21,w11, UXTW 
008d5548	add x21,x10,#0x4
008d554c	b 0x008d56a8
008d5550	eor x11,x13,x12
008d5554	rbit x11,x11
008d5558	clz x11,x11
008d555c	lsr w11,w11,#0x3
008d5560	b 0x008d5578
008d5564	eor x11,x17,x16
008d5568	rbit x11,x11
008d556c	clz x11,x11
008d5570	lsr x11,x11,#0x3
008d5574	add w11,w11,w15
008d5578	add x12,x21,w11, UXTW 
008d557c	add x12,x12,#0x4
008d5580	cmp x12,x10
008d5584	b.eq 0x008d5590
008d5588	mov x21,x12
008d558c	b 0x008d56a8
008d5590	cmp x10,x22
008d5594	mov x14,x1
008d5598	mov x13,x10
008d559c	b.cs 0x008d55b8
008d55a0	ldr x13,[x1]
008d55a4	ldr x14,[x10]
008d55a8	cmp x13,x14
008d55ac	b.ne 0x008d5678
008d55b0	ldr x14,[sp, #0x68]
008d55b4	add x13,x10,#0x8
008d55b8	cmp x13,x22
008d55bc	b.cs 0x008d5600
008d55c0	ldur x15,[x29, #-0x60]
008d55c4	ldur x16,[x29, #-0x50]
008d55c8	add x15,x15,x21
008d55cc	sub x15,x15,x27
008d55d0	cmp x15,x16
008d55d4	csel x15,x15,x16,cc
008d55d8	sub w15,w13,w15
008d55dc	ldr x16,[x14]
008d55e0	ldr x17,[x13]
008d55e4	cmp x16,x17
008d55e8	b.ne 0x008d568c
008d55ec	add x13,x13,#0x8
008d55f0	add x14,x14,#0x8
008d55f4	add w15,w15,#0x8
008d55f8	cmp x13,x22
008d55fc	b.cc 0x008d55dc
008d5600	ldr x15,[sp, #0x30]
008d5604	cmp x13,x15
008d5608	b.cs 0x008d5628
008d560c	ldr w15,[x14]
008d5610	ldr w16,[x13]
008d5614	cmp w15,w16
008d5618	add x15,x13,#0x4
008d561c	add x16,x14,#0x4
008d5620	csel x14,x14,x16,ne
008d5624	csel x13,x13,x15,ne
008d5628	ldr x15,[sp, #0x28]
008d562c	cmp x13,x15
008d5630	b.cs 0x008d5650
008d5634	ldrh w15,[x14]
008d5638	ldrh w16,[x13]
008d563c	cmp w15,w16
008d5640	add x15,x13,#0x2
008d5644	add x16,x14,#0x2
008d5648	csel x14,x14,x16,ne
008d564c	csel x13,x13,x15,ne
008d5650	ldur x15,[x29, #-0x50]
008d5654	cmp x13,x15
008d5658	b.cs 0x008d5670
008d565c	mov x15,x13
008d5660	ldrb w14,[x14]
008d5664	ldrb w16,[x15], #0x1
008d5668	cmp w14,w16
008d566c	csel x13,x13,x15,ne
008d5670	sub w10,w13,w10
008d5674	b 0x008d56a0
008d5678	eor x10,x14,x13
008d567c	rbit x10,x10
008d5680	clz x10,x10
008d5684	lsr w10,w10,#0x3
008d5688	b 0x008d56a0
008d568c	eor x10,x17,x16
008d5690	rbit x10,x10
008d5694	clz x10,x10
008d5698	lsr x10,x10,#0x3
008d569c	add w10,w10,w15
008d56a0	add x21,x12,w10, UXTW 
008d56a4	add w11,w10,w11
008d56a8	add w10,w11,#0xf0
008d56ac	umull x10,w10,w0
008d56b0	add x10,x8,x10, LSR #0x27
008d56b4	add x10,x10,#0x8
008d56b8	cmp x10,x4
008d56bc	b.hi 0x008d2ae8
008d56c0	ldrb w12,[x9]
008d56c4	subs w10,w11,#0xf
008d56c8	b.cc 0x008d5784
008d56cc	add w12,w12,#0xf
008d56d0	cmp w10,#0x3fc
008d56d4	strb w12,[x9]
008d56d8	mov w9,#0xffffffff
008d56dc	str w9,[x24]
008d56e0	b.cc 0x008d5764
008d56e4	sub w20,w11,#0x40b
008d56e8	stur x21,[x29, #-0x40]
008d56ec	add x24,x8,#0x6
008d56f0	umull x9,w20,w0
008d56f4	mov x0,x24
008d56f8	mov w1,#0xff
008d56fc	mov w27,w5
008d5700	mov x28,x6
008d5704	mov x26,x22
008d5708	mov x22,x25
008d570c	mov x25,x19
008d5710	mov x19,x7
008d5714	lsr x21,x9,#0x29
008d5718	lsl w23,w21,#0x2
008d571c	add x2,x23,#0x4
008d5720	bl 0x00c301c0
008d5724	mov w8,#0x3fc
008d5728	ldp x3,x1,[x29, #-0x18]
008d572c	msub w10,w21,w8,w20
008d5730	ldp x21,x20,[x29, #-0x40]
008d5734	mov w0,#0x8081
008d5738	ldur x4,[x29, #-0x68]
008d573c	ldur w2,[x29, #-0x20]
008d5740	movk w0,#0x8080, LSL #16
008d5744	mov w30,#0xffff
008d5748	mov x7,x19
008d574c	mov x19,x25
008d5750	mov x25,x22
008d5754	mov x22,x26
008d5758	mov x6,x28
008d575c	mov w5,w27
008d5760	add x24,x24,x23
008d5764	and w8,w10,#0xffff
008d5768	mov w9,#0x8081
008d576c	mul w8,w8,w9
008d5770	lsr w8,w8,#0x17
008d5774	add x24,x24,x8
008d5778	add w8,w10,w8
008d577c	strb w8,[x24], #0x1
008d5780	b 0x008d578c
008d5784	add w8,w12,w11
008d5788	strb w8,[x9]
008d578c	cmp x21,x25
008d5790	b.cs 0x008d2a3c
008d5794	mov x8,x21
008d5798	ldr x10,[x21]
008d579c	ldr x9,[x8, #-0x2]!
008d57a0	mul x10,x10,x7
008d57a4	sub w8,w8,w19
008d57a8	mul x9,x9,x7
008d57ac	lsr x10,x10,#0x32
008d57b0	lsr x9,x9,#0x32
008d57b4	and x11,x10,#0x3ffc
008d57b8	sub w10,w21,w19
008d57bc	and x9,x9,#0x3ffc
008d57c0	str w8,[x3, x9#0x0]
008d57c4	ldr w9,[x3, x11#0x0]
008d57c8	str w10,[x3, x11#0x0]
008d57cc	cmp w9,w2
008d57d0	add w12,w9,w30
008d57d4	csel x8,x6,x19,cc
008d57d8	csel x26,x20,x1,cc
008d57dc	cmp w9,w5
008d57e0	ccmp w12,w10,#0x0,cs
008d57e4	b.cc 0x008d5124
008d57e8	add x27,x8,x9
008d57ec	ldr w11,[x21]
008d57f0	ldr w8,[x27]
008d57f4	cmp w8,w11
008d57f8	b.ne 0x008d5124
008d57fc	mov x8,x24
008d5800	sub w10,w10,w9
008d5804	mov x9,x24
008d5808	strb wzr,[x8], #0x1
008d580c	b 0x008d5350
008d5810	mov x11,x10
008d5814	cmp x11,x22
008d5818	b.cc 0x008d5394
008d581c	b 0x008d53c0
008d5820	mov x12,x11
008d5824	cmp x12,x14
008d5828	b.cc 0x008d5484
008d582c	b 0x008d54b0
008d5830	add x8,x8,x20
008d5834	sub x9,x8,#0x1
008d5838	sub x8,x23,#0x1
008d583c	mov x27,x9
008d5840	cmp x9,x26
008d5844	mov x23,x8
008d5848	b.ls 0x008d51d8
008d584c	cmp x23,x21
008d5850	b.ls 0x008d51d8
008d5854	mov x8,x23
008d5858	mov x9,x27
008d585c	ldrb w10,[x8, #-0x1]!
008d5860	ldrb w11,[x9, #-0x1]!
008d5864	cmp w10,w11
008d5868	b.eq 0x008d583c
008d586c	b 0x008d51d8
008d5870	subs x8,x24,#0xf
008d5874	b.cc 0x008d5914
008d5878	mov w9,#0xf0
008d587c	mov x0,x26
008d5880	cmp x8,#0xff
008d5884	strb w9,[x0], #0x1
008d5888	b.cc 0x008d58d4
008d588c	ldr x8,[sp, #0x60]
008d5890	mov x21,x16
008d5894	add x8,x1,x8
008d5898	mov w1,#0xff
008d589c	sub x8,x8,x16
008d58a0	sub x19,x8,#0x10e
008d58a4	orr x8,xzr,#-0x7f7f7f7f7f7f7f80
008d58a8	movk x8,#0x8081
008d58ac	umulh x8,x19,x8
008d58b0	lsr x20,x8,#0x7
008d58b4	add x2,x20,#0x1
008d58b8	bl 0x00c301c0
008d58bc	sub x8,x20,x20, LSL #0x8
008d58c0	add x9,x26,x20
008d58c4	mov x16,x21
008d58c8	add x0,x9,#0x2
008d58cc	add x8,x8,x19
008d58d0	ldur x19,[x29, #-0x28]
008d58d4	strb w8,[x0]
008d58d8	mov x26,x0
008d58dc	b 0x008d591c
008d58e0	lsl w8,w19,#0x4
008d58e4	strb w8,[x25]
008d58e8	add x25,x25,#0x1
008d58ec	mov x1,x16
008d58f0	mov x2,x19
008d58f4	mov x0,x25
008d58f8	bl 0x00c2ffd0
008d58fc	ldur x9,[x29, #-0x58]
008d5900	ldp x3,x1,[x29, #-0x18]
008d5904	add w8,w25,w19
008d5908	sub w0,w8,w9
008d590c	ldur w23,[x29, #-0x30]
008d5910	b 0x008d5978
008d5914	lsl w8,w24,#0x4
008d5918	strb w8,[x26]
008d591c	add x25,x26,#0x1
008d5920	mov x1,x16
008d5924	mov x2,x24
008d5928	mov x0,x25
008d592c	bl 0x00c2ffd0
008d5930	ldur x9,[x29, #-0x58]
008d5934	ldp x3,x1,[x29, #-0x18]
008d5938	add w8,w25,w24
008d593c	sub w0,w8,w9
008d5940	ldur w23,[x29, #-0x30]
008d5944	b 0x008d597c
008d5948	lsl w8,w19,#0x4
008d594c	ldur x22,[x29, #-0x58]
008d5950	ldur w23,[x29, #-0x30]
008d5954	strb w8,[x24]
008d5958	add x20,x24,#0x1
008d595c	mov x1,x21
008d5960	mov x2,x19
008d5964	mov x0,x20
008d5968	bl 0x00c2ffd0
008d596c	add w8,w20,w19
008d5970	ldp x3,x1,[x29, #-0x18]
008d5974	sub w0,w8,w22
008d5978	ldur x19,[x29, #-0x28]
008d597c	str x1,[x3, #0x4000]
008d5980	str w23,[x19, #0x18]
008d5984	ldp x20,x19,[sp, #0x130]
008d5988	ldp x22,x21,[sp, #0x120]
008d598c	ldp x24,x23,[sp, #0x110]
008d5990	ldp x26,x25,[sp, #0x100]
008d5994	ldp x28,x27,[sp, #0xf0]
008d5998	ldp x29,x30,[sp, #0xe0]
008d599c	add sp,sp,#0x140
008d59a0	ret
008d59a4	ldur x19,[x29, #-0x28]
008d59a8	mov w0,wzr
008d59ac	b 0x008d5940
