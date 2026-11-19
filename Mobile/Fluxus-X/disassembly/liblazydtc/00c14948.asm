; FUN_00c14948 @ 00c14948
00c14948	paciasp
00c1494c	sub sp,sp,#0x70
00c14950	stp x29,x30,[sp, #0x10]
00c14954	stp x28,x27,[sp, #0x20]
00c14958	stp x26,x25,[sp, #0x30]
00c1495c	stp x24,x23,[sp, #0x40]
00c14960	stp x22,x21,[sp, #0x50]
00c14964	stp x20,x19,[sp, #0x60]
00c14968	add x29,sp,#0x10
00c1496c	ldp x8,x23,[x0]
00c14970	cmp x8,x23
00c14974	b.eq 0x00c14d30
00c14978	ldrb w9,[x8]
00c1497c	cmp w9,#0x49
00c14980	b.ne 0x00c14d30
00c14984	mov x19,x0
00c14988	mov w20,w1
00c1498c	add x22,x8,#0x1
00c14990	str x22,[x0]
00c14994	tbz w1,#0x0,0x00c149f8
00c14998	ldr x0,[x19, #0x298]
00c1499c	ldr x8,[x19, #0x2a8]
00c149a0	cmp x0,x8
00c149a4	str x0,[x19, #0x2a0]
00c149a8	b.ne 0x00c149e4
00c149ac	add x8,x19,#0x2b0
00c149b0	cmp x0,x8
00c149b4	b.eq 0x00c149d0
00c149b8	mov x1,xzr
00c149bc	bl 0x00c30950
00c149c0	str x0,[x19, #0x298]
00c149c4	cbz x0,0x00c14e04
00c149c8	ldp x22,x23,[x19]
00c149cc	b 0x00c149e0
00c149d0	mov x0,xzr
00c149d4	bl 0x00c308d0
00c149d8	cbz x0,0x00c14e08
00c149dc	str x0,[x19, #0x298]
00c149e0	str x0,[x19, #0x2a8]
00c149e4	ldr x9,[x19, #0x240]
00c149e8	add x8,x19,#0x240
00c149ec	str x8,[x0], #0x8
00c149f0	str x0,[x19, #0x2a0]
00c149f4	str x9,[x19, #0x248]
00c149f8	ldp x9,x8,[x19, #0x10]
00c149fc	add x26,x19,#0x28
00c14a00	add x27,x19,#0x258
00c14a04	mov w21,#0x28
00c14a08	mov w28,#0xa80
00c14a0c	sub x8,x8,x9
00c14a10	asr x8,x8,#0x3
00c14a14	str x8,[sp, #0x8]
00c14a18	cmp x22,x23
00c14a1c	b.eq 0x00c14a2c
00c14a20	ldrb w8,[x22]
00c14a24	cmp w8,#0x45
00c14a28	b.eq 0x00c14d58
00c14a2c	mov x0,x19
00c14a30	bl 0x00c12c94
00c14a34	mov x22,x0
00c14a38	tbz w20,#0x0,0x00c14a74
00c14a3c	cbz x22,0x00c14d30
00c14a40	ldp x25,x8,[x19, #0x18]
00c14a44	cmp x25,x8
00c14a48	b.ne 0x00c14ae8
00c14a4c	ldr x24,[x19, #0x10]
00c14a50	sub x23,x25,x24
00c14a54	cmp x24,x26
00c14a58	lsl x1,x23,#0x1
00c14a5c	b.eq 0x00c14aac
00c14a60	mov x0,x24
00c14a64	bl 0x00c30950
00c14a68	str x0,[x19, #0x10]
00c14a6c	cbnz x0,0x00c14ad8
00c14a70	b 0x00c14dec
00c14a74	cbz x22,0x00c14d30
00c14a78	ldp x25,x8,[x19, #0x18]
00c14a7c	cmp x25,x8
00c14a80	b.ne 0x00c14c88
00c14a84	ldr x24,[x19, #0x10]
00c14a88	sub x23,x25,x24
00c14a8c	cmp x24,x26
00c14a90	lsl x1,x23,#0x1
00c14a94	b.eq 0x00c14c4c
00c14a98	mov x0,x24
00c14a9c	bl 0x00c30950
00c14aa0	str x0,[x19, #0x10]
00c14aa4	cbnz x0,0x00c14c78
00c14aa8	b 0x00c14de8
00c14aac	mov x0,x1
00c14ab0	bl 0x00c308d0
00c14ab4	cbz x0,0x00c14e00
00c14ab8	cmp x25,x26
00c14abc	b.eq 0x00c14ad4
00c14ac0	mov x1,x24
00c14ac4	mov x2,x23
00c14ac8	mov x25,x0
00c14acc	bl 0x00c2ff60
00c14ad0	mov x0,x25
00c14ad4	str x0,[x19, #0x10]
00c14ad8	asr x8,x23,#0x2
00c14adc	add x25,x0,x23
00c14ae0	add x8,x0,x8, LSL #0x3
00c14ae4	str x8,[x19, #0x20]
00c14ae8	ldrb w8,[x22, #0x8]
00c14aec	str x22,[x25], #0x8
00c14af0	str x25,[x19, #0x18]
00c14af4	cmp w8,#0x29
00c14af8	b.eq 0x00c14b0c
00c14afc	cmp w8,#0x22
00c14b00	b.ne 0x00c14c14
00c14b04	ldr x22,[x22, #0x18]
00c14b08	b 0x00c14c14
00c14b0c	ldr x25,[x19, #0x1330]
00c14b10	ldp x23,x24,[x22, #0x10]
00c14b14	ldr x8,[x25, #0x8]
00c14b18	sub x9,x8,#0xfd0
00c14b1c	cmn x9,#0xff1
00c14b20	b.hi 0x00c14b40
00c14b24	mov w0,#0x1000
00c14b28	bl 0x00c308d0
00c14b2c	cbz x0,0x00c14df4
00c14b30	mov x8,xzr
00c14b34	stp x25,xzr,[x0]
00c14b38	mov x25,x0
00c14b3c	str x0,[x19, #0x1330]
00c14b40	add x9,x8,#0x20
00c14b44	add x22,x25,x8
00c14b48	adrp x8,0xcb3000
00c14b4c	add x8,x8,#0x4d0
00c14b50	str x9,[x25, #0x8]
00c14b54	lsl x9,x24,#0x3
00c14b58	str x8,[x22, #0x10]!
00c14b5c	ldurh w8,[x22, #0x9]
00c14b60	strb w21,[x22, #0x8]
00c14b64	and w10,w8,#0xfffff000
00c14b68	stp x23,x24,[x22, #0x10]
00c14b6c	orr w8,w10,w28
00c14b70	sturh w8,[x22, #0x9]
00c14b74	cbz x24,0x00c14ba0
00c14b78	mov x11,x9
00c14b7c	mov x12,x23
00c14b80	ldr x13,[x12]
00c14b84	ldurh w13,[x13, #0x9]
00c14b88	and w13,w13,#0x300
00c14b8c	cmp w13,#0x100
00c14b90	b.ne 0x00c14bac
00c14b94	subs x11,x11,#0x8
00c14b98	add x12,x12,#0x8
00c14b9c	b.ne 0x00c14b80
00c14ba0	mov w8,#0x980
00c14ba4	orr w8,w10,w8
00c14ba8	sturh w8,[x22, #0x9]
00c14bac	cbz x24,0x00c14bd8
00c14bb0	mov x10,x9
00c14bb4	mov x11,x23
00c14bb8	ldr x12,[x11]
00c14bbc	ldurh w12,[x12, #0x9]
00c14bc0	and w12,w12,#0xc00
00c14bc4	cmp w12,#0x400
00c14bc8	b.ne 0x00c14be4
00c14bcc	subs x10,x10,#0x8
00c14bd0	add x11,x11,#0x8
00c14bd4	b.ne 0x00c14bb8
00c14bd8	and w8,w8,#0xfffff3ff
00c14bdc	orr w8,w8,#0x400
00c14be0	sturh w8,[x22, #0x9]
00c14be4	cbz x24,0x00c14c08
00c14be8	ldr x10,[x23]
00c14bec	ldurh w10,[x10, #0x9]
00c14bf0	and w10,w10,#0xc0
00c14bf4	cmp w10,#0x40
00c14bf8	b.ne 0x00c14c14
00c14bfc	subs x9,x9,#0x8
00c14c00	add x23,x23,#0x8
00c14c04	b.ne 0x00c14be8
00c14c08	and w8,w8,#0xffffff7f
00c14c0c	orr w8,w8,#0x40
00c14c10	sturh w8,[x22, #0x9]
00c14c14	ldr x25,[x19, #0x248]
00c14c18	ldr x8,[x19, #0x250]
00c14c1c	cmp x25,x8
00c14c20	b.ne 0x00c14cd0
00c14c24	ldr x24,[x19, #0x240]
00c14c28	sub x23,x25,x24
00c14c2c	cmp x24,x27
00c14c30	lsl x1,x23,#0x1
00c14c34	b.eq 0x00c14c94
00c14c38	mov x0,x24
00c14c3c	bl 0x00c30950
00c14c40	str x0,[x19, #0x240]
00c14c44	cbnz x0,0x00c14cc0
00c14c48	b 0x00c14df0
00c14c4c	mov x0,x1
00c14c50	bl 0x00c308d0
00c14c54	cbz x0,0x00c14df8
00c14c58	cmp x25,x26
00c14c5c	b.eq 0x00c14c74
00c14c60	mov x1,x24
00c14c64	mov x2,x23
00c14c68	mov x25,x0
00c14c6c	bl 0x00c2ff60
00c14c70	mov x0,x25
00c14c74	str x0,[x19, #0x10]
00c14c78	asr x8,x23,#0x2
00c14c7c	add x25,x0,x23
00c14c80	add x8,x0,x8, LSL #0x3
00c14c84	str x8,[x19, #0x20]
00c14c88	str x22,[x25], #0x8
00c14c8c	str x25,[x19, #0x18]
00c14c90	b 0x00c14cd8
00c14c94	mov x0,x1
00c14c98	bl 0x00c308d0
00c14c9c	cbz x0,0x00c14dfc
00c14ca0	cmp x25,x27
00c14ca4	b.eq 0x00c14cbc
00c14ca8	mov x1,x24
00c14cac	mov x2,x23
00c14cb0	mov x25,x0
00c14cb4	bl 0x00c2ff60
00c14cb8	mov x0,x25
00c14cbc	str x0,[x19, #0x240]
00c14cc0	asr x8,x23,#0x2
00c14cc4	add x25,x0,x23
00c14cc8	add x8,x0,x8, LSL #0x3
00c14ccc	str x8,[x19, #0x250]
00c14cd0	str x22,[x25], #0x8
00c14cd4	str x25,[x19, #0x248]
00c14cd8	ldp x22,x23,[x19]
00c14cdc	cmp x22,x23
00c14ce0	b.eq 0x00c14a18
00c14ce4	ldrb w8,[x22]
00c14ce8	cmp w8,#0x51
00c14cec	b.ne 0x00c14a18
00c14cf0	ldrb w21,[x19, #0x30a]
00c14cf4	add x8,x22,#0x1
00c14cf8	mov w9,#0x1
00c14cfc	str x8,[x19]
00c14d00	strb w9,[x19, #0x30a]
00c14d04	mov x0,x19
00c14d08	bl 0x00c16098
00c14d0c	mov x20,x0
00c14d10	strb w21,[x19, #0x30a]
00c14d14	cbz x0,0x00c14d30
00c14d18	ldp x22,x8,[x19]
00c14d1c	cmp x22,x8
00c14d20	b.eq 0x00c14d30
00c14d24	ldrb w8,[x22]
00c14d28	cmp w8,#0x45
00c14d2c	b.eq 0x00c14d5c
00c14d30	mov x0,xzr
00c14d34	ldp x20,x19,[sp, #0x60]
00c14d38	ldp x22,x21,[sp, #0x50]
00c14d3c	ldp x24,x23,[sp, #0x40]
00c14d40	ldp x26,x25,[sp, #0x30]
00c14d44	ldp x28,x27,[sp, #0x20]
00c14d48	ldp x29,x30,[sp, #0x10]
00c14d4c	add sp,sp,#0x70
00c14d50	autiasp
00c14d54	ret
00c14d58	mov x20,xzr
00c14d5c	ldr x1,[sp, #0x8]
00c14d60	add x8,x22,#0x1
00c14d64	mov x0,x19
00c14d68	str x8,[x19]
00c14d6c	bl 0x00c13140
00c14d70	ldr x23,[x19, #0x1330]
00c14d74	mov x21,x0
00c14d78	mov x22,x1
00c14d7c	ldr x8,[x23, #0x8]
00c14d80	sub x9,x8,#0xfc0
00c14d84	cmn x9,#0xff1
00c14d88	b.hi 0x00c14da8
00c14d8c	mov w0,#0x1000
00c14d90	bl 0x00c308d0
00c14d94	cbz x0,0x00c14df4
00c14d98	mov x8,xzr
00c14d9c	stp x23,xzr,[x0]
00c14da0	mov x23,x0
00c14da4	str x0,[x19, #0x1330]
00c14da8	add x9,x8,#0x30
00c14dac	add x0,x23,x8
00c14db0	adrp x8,0xcb3000
00c14db4	add x8,x8,#0x548
00c14db8	str x9,[x23, #0x8]
00c14dbc	mov w9,#0x2b
00c14dc0	str x8,[x0, #0x10]!
00c14dc4	ldurh w8,[x0, #0x9]
00c14dc8	strb w9,[x0, #0x8]
00c14dcc	mov w9,#0x540
00c14dd0	and w8,w8,#0xf000
00c14dd4	stp x21,x22,[x0, #0x10]
00c14dd8	orr w8,w8,w9
00c14ddc	str x20,[x0, #0x20]
00c14de0	sturh w8,[x0, #0x9]
00c14de4	b 0x00c14d34
00c14de8	bl 0x00c30b40
00c14dec	bl 0x00c30b40
00c14df0	bl 0x00c30b40
00c14df4	bl 0x00c2fff0
00c14df8	bl 0x00c30b40
00c14dfc	bl 0x00c30b40
00c14e00	bl 0x00c30b40
00c14e04	bl 0x00c30b40
00c14e08	bl 0x00c30b40
