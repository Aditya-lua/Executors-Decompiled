; tls_choose_sigalg @ 009c5818
009c5818	sub sp,sp,#0xa0
009c581c	stp x28,x27,[sp, #0x40]
009c5820	stp x26,x25,[sp, #0x50]
009c5824	stp x24,x23,[sp, #0x60]
009c5828	stp x22,x21,[sp, #0x70]
009c582c	stp x20,x19,[sp, #0x80]
009c5830	stp x29,x30,[sp, #0x90]
009c5834	ldr x9,[x0, #0x8]
009c5838	str xzr,[x0, #0x388]
009c583c	str xzr,[x0, #0x380]
009c5840	mov x19,x0
009c5844	ldr x8,[x9, #0xc0]
009c5848	mov w20,w1
009c584c	add x29,sp,#0x90
009c5850	ldr w8,[x8, #0x60]
009c5854	tbnz w8,#0x3,0x009c58a4
009c5858	ldr w9,[x9]
009c585c	cmp w9,#0x304
009c5860	b.lt 0x009c58a4
009c5864	cmp w9,#0x10, LSL #12
009c5868	b.eq 0x009c58a4
009c586c	mov x0,x19
009c5870	mov x1,xzr
009c5874	mov x2,xzr
009c5878	bl 0x009c4f6c
009c587c	mov x21,x0
009c5880	cbnz x0,0x009c58d8
009c5884	cbz w20,0x009c5d14
009c5888	bl 0x00c342a0
009c588c	adrp x0,0x2c3000
009c5890	adrp x2,0x2c1000
009c5894	add x0,x0,#0x5d8
009c5898	add x2,x2,#0x7d5
009c589c	mov w1,#0xcb6
009c58a0	b 0x009c5c50
009c58a4	ldr x9,[x19, #0x2e0]
009c58a8	mov w10,#0xab
009c58ac	ldrb w9,[x9, #0x20]
009c58b0	tst w9,w10
009c58b4	b.eq 0x009c5d14
009c58b8	ldr w9,[x19, #0x38]
009c58bc	cbz w9,0x009c58fc
009c58c0	tbnz w8,#0x1,0x009c594c
009c58c4	mov w1,#0xffffffff
009c58c8	mov x0,x19
009c58cc	bl 0x009c1dc4
009c58d0	mov x21,x0
009c58d4	cbz x0,0x009c5998
009c58d8	ldr w8,[x21, #0x18]
009c58dc	ldr x9,[x19, #0x898]
009c58e0	mov w10,#0x28
009c58e4	smaddl x8,w8,w10,x9
009c58e8	add x8,x8,#0x20
009c58ec	str x8,[x19, #0x388]
009c58f0	str x8,[x9]
009c58f4	str x21,[x19, #0x380]
009c58f8	b 0x009c5d14
009c58fc	ldr x9,[x19, #0x898]
009c5900	mov x10,x9
009c5904	ldr x11,[x10], #0x20
009c5908	sub x10,x11,x10
009c590c	orr x11,xzr,#-0x3333333333333334
009c5910	asr x10,x10,#0x3
009c5914	movk x11,#0xcccd
009c5918	mul x10,x10,x11
009c591c	cmp w10,#0x8
009c5920	b.hi 0x009c5d14
009c5924	mov w11,#0x28
009c5928	smaddl x11,w10,w11,x9
009c592c	ldr x11,[x11, #0x20]
009c5930	cbz x11,0x009c5d14
009c5934	sxtw x10,w10
009c5938	mov w11,#0x28
009c593c	madd x9,x10,x11,x9
009c5940	ldr x9,[x9, #0x28]
009c5944	cbnz x9,0x009c58c0
009c5948	b 0x009c5d14
009c594c	ldr x8,[x19, #0x390]
009c5950	cbz x8,0x009c59c0
009c5954	ldr x8,[x19, #0x898]
009c5958	ldrb w9,[x8, #0x1e]
009c595c	tst w9,#0x3
009c5960	b.eq 0x009c5a0c
009c5964	ldr x0,[x8, #0xa0]
009c5968	add x1,sp,#0xc
009c596c	mov w2,#0x32
009c5970	mov x3,xzr
009c5974	bl 0x00c324a0
009c5978	cmp w0,#0x1
009c597c	b.lt 0x009c5a1c
009c5980	add x0,sp,#0xc
009c5984	bl 0x00c364a0
009c5988	mov w22,w0
009c598c	ldr x8,[x19, #0x1db0]
009c5990	cbnz x8,0x009c5a28
009c5994	b 0x009c5bac
009c5998	cbz w20,0x009c5d14
009c599c	bl 0x00c342a0
009c59a0	adrp x0,0x2c3000
009c59a4	adrp x2,0x2c1000
009c59a8	add x0,x0,#0x5d8
009c59ac	add x2,x2,#0x7d5
009c59b0	mov w1,#0xd25
009c59b4	bl 0x00c342b0
009c59b8	mov w1,#0x50
009c59bc	b 0x009c5c58
009c59c0	mov w1,#0xffffffff
009c59c4	mov x0,x19
009c59c8	bl 0x009c1dc4
009c59cc	cbz x0,0x009c5c14
009c59d0	ldr x8,[x19, #0x898]
009c59d4	adrp x22,0x74c000
009c59d8	mov x21,x0
009c59dc	add x22,x22,#0xd8c
009c59e0	ldr w9,[x8, #0x1c]
009c59e4	and w9,w9,#0x30000
009c59e8	cmp w9,#0x30, LSL #12
009c59ec	b.eq 0x009c5c70
009c59f0	cmp w9,#0x20, LSL #12
009c59f4	b.eq 0x009c5c78
009c59f8	cmp w9,#0x10, LSL #12
009c59fc	b.ne 0x009c5d38
009c5a00	adrp x22,0x74c000
009c5a04	add x22,x22,#0xd8c
009c5a08	b 0x009c5c7c
009c5a0c	mov w22,#0xffffffff
009c5a10	ldr x8,[x19, #0x1db0]
009c5a14	cbnz x8,0x009c5a28
009c5a18	b 0x009c5bac
009c5a1c	mov w22,wzr
009c5a20	ldr x8,[x19, #0x1db0]
009c5a24	cbz x8,0x009c5bac
009c5a28	mov w26,#0xcccd
009c5a2c	mov x25,xzr
009c5a30	movk w26,#0xcccc, LSL #16
009c5a34	mov w27,#0x28
009c5a38	ldr x8,[x19, #0x1da8]
009c5a3c	ldr w9,[x19, #0x38]
009c5a40	ldr x21,[x8, x25, LSL #0x3]
009c5a44	cbz w9,0x009c5aa0
009c5a48	ldr w28,[x21, #0x18]
009c5a4c	sxtw x23,w28
009c5a50	mov x0,x23
009c5a54	bl 0x00c35130
009c5a58	cbz x0,0x009c5b6c
009c5a5c	ldr x8,[x19, #0x2e0]
009c5a60	ldr w9,[x0, #0x4]
009c5a64	ldr w10,[x8, #0x20]
009c5a68	tst w10,w9
009c5a6c	b.eq 0x009c5b6c
009c5a70	ldr w9,[x0]
009c5a74	cmp w9,#0x390
009c5a78	b.ne 0x009c5a84
009c5a7c	ldrb w8,[x8, #0x1c]
009c5a80	tbnz w8,#0x0,0x009c5b6c
009c5a84	cmn w28,#0x1
009c5a88	mov w8,#0xffffffff
009c5a8c	b.eq 0x009c5b70
009c5a90	add x9,x19,x23, LSL #0x2
009c5a94	ldr w9,[x9, #0x3b8]
009c5a98	tbnz w9,#0x0,0x009c5ac8
009c5a9c	b 0x009c5b70
009c5aa0	ldr x9,[x19, #0x898]
009c5aa4	ldr x10,[x9], #0x20
009c5aa8	ldr w8,[x21, #0x18]
009c5aac	sub x9,x10,x9
009c5ab0	lsr x9,x9,#0x3
009c5ab4	mul w28,w9,w26
009c5ab8	cmp w8,w28
009c5abc	b.ne 0x009c5b70
009c5ac0	cmn w28,#0x1
009c5ac4	b.eq 0x009c5b6c
009c5ac8	cmp w28,#0x8
009c5acc	b.hi 0x009c5b64
009c5ad0	ldr x8,[x19, #0x898]
009c5ad4	nop
009c5ad8	smaddl x9,w28,w27,x8
009c5adc	ldr x2,[x9, #0x20]
009c5ae0	cbz x2,0x009c5b64
009c5ae4	sxtw x23,w28
009c5ae8	madd x8,x23,x27,x8
009c5aec	ldr x3,[x8, #0x28]
009c5af0	cbz x3,0x009c5b64
009c5af4	mov x0,x19
009c5af8	mov x1,x21
009c5afc	bl 0x009c6514
009c5b00	cbz w0,0x009c5b64
009c5b04	ldr w8,[x21, #0x14]
009c5b08	cmp w8,#0x390
009c5b0c	b.ne 0x009c5b84
009c5b10	ldr x8,[x19, #0x898]
009c5b14	nop
009c5b18	madd x8,x23,x27,x8
009c5b1c	ldr x23,[x8, #0x28]
009c5b20	cbz x23,0x009c5b64
009c5b24	ldr w8,[x21, #0xc]
009c5b28	cbz w8,0x009c5b64
009c5b2c	ldr x0,[x19, #0x9a8]
009c5b30	ldr w1,[x21, #0x10]
009c5b34	bl 0x00c34a20
009c5b38	cbz x0,0x009c5b64
009c5b3c	mov x24,x0
009c5b40	mov x0,x23
009c5b44	bl 0x00c36440
009c5b48	mov w23,w0
009c5b4c	mov x0,x24
009c5b50	bl 0x00c34c20
009c5b54	lsl w8,w0,#0x1
009c5b58	add w8,w8,#0x2
009c5b5c	cmp w23,w8
009c5b60	b.ge 0x009c5b84
009c5b64	mov w8,w28
009c5b68	b 0x009c5b70
009c5b6c	mov w8,#0xffffffff
009c5b70	ldr x9,[x19, #0x1db0]
009c5b74	add x25,x25,#0x1
009c5b78	cmp x25,x9
009c5b7c	b.cc 0x009c5a38
009c5b80	b 0x009c5ba0
009c5b84	cmn w22,#0x1
009c5b88	b.eq 0x009c5b9c
009c5b8c	ldr w8,[x21, #0x20]
009c5b90	cmp w8,w22
009c5b94	mov w8,w28
009c5b98	b.ne 0x009c5b70
009c5b9c	mov w8,w28
009c5ba0	ldr x9,[x19, #0x1db0]
009c5ba4	cmp x25,x9
009c5ba8	b.ne 0x009c5be0
009c5bac	ldr x8,[x19, #0x2e0]
009c5bb0	mov w9,#0xa0
009c5bb4	ldrb w8,[x8, #0x20]
009c5bb8	tst w8,w9
009c5bbc	b.eq 0x009c5be8
009c5bc0	mov w1,#0xffffffff
009c5bc4	mov x0,x19
009c5bc8	bl 0x009c1dc4
009c5bcc	cbz x0,0x009c5c34
009c5bd0	ldr w8,[x0, #0x18]
009c5bd4	ldr x9,[x19, #0x1db0]
009c5bd8	mov x21,x0
009c5bdc	mov x25,xzr
009c5be0	cmp x25,x9
009c5be4	b.ne 0x009c5c08
009c5be8	cbz w20,0x009c5d14
009c5bec	bl 0x00c342a0
009c5bf0	adrp x0,0x2c3000
009c5bf4	adrp x2,0x2c1000
009c5bf8	add x0,x0,#0x5d8
009c5bfc	add x2,x2,#0x7d5
009c5c00	mov w1,#0xcff
009c5c04	b 0x009c5c50
009c5c08	cmn w8,#0x1
009c5c0c	b.ne 0x009c58dc
009c5c10	b 0x009c58d8
009c5c14	cbz w20,0x009c5d14
009c5c18	bl 0x00c342a0
009c5c1c	adrp x0,0x2c3000
009c5c20	adrp x2,0x2c1000
009c5c24	add x0,x0,#0x5d8
009c5c28	add x2,x2,#0x7d5
009c5c2c	mov w1,#0xd0d
009c5c30	b 0x009c5c50
009c5c34	cbz w20,0x009c5d14
009c5c38	bl 0x00c342a0
009c5c3c	adrp x0,0x2c3000
009c5c40	adrp x2,0x2c1000
009c5c44	add x0,x0,#0x5d8
009c5c48	add x2,x2,#0x7d5
009c5c4c	mov w1,#0xcf3
009c5c50	bl 0x00c342b0
009c5c54	mov w1,#0x28
009c5c58	mov w2,#0x76
009c5c5c	mov x0,x19
009c5c60	mov x3,xzr
009c5c64	bl 0x00c34410
009c5c68	mov w0,wzr
009c5c6c	b 0x009c5d18
009c5c70	mov w23,#0x2
009c5c74	b 0x009c5c80
009c5c78	add x22,x22,#0x2
009c5c7c	mov w23,#0x1
009c5c80	mov x24,xzr
009c5c84	mov w25,#0x28
009c5c88	ldrh w8,[x21, #0x8]
009c5c8c	ldrh w9,[x22, x24, LSL #0x1]
009c5c90	cmp w8,w9
009c5c94	b.ne 0x009c5cd4
009c5c98	ldrsw x8,[x21, #0x18]
009c5c9c	cmp w8,#0x8
009c5ca0	b.hi 0x009c5cd4
009c5ca4	ldr x9,[x19, #0x898]
009c5ca8	nop
009c5cac	madd x10,x8,x25,x9
009c5cb0	ldr x2,[x10, #0x20]
009c5cb4	cbz x2,0x009c5cd4
009c5cb8	madd x8,x8,x25,x9
009c5cbc	ldr x3,[x8, #0x28]
009c5cc0	cbz x3,0x009c5cd4
009c5cc4	mov x0,x19
009c5cc8	mov x1,x21
009c5ccc	bl 0x009c6514
009c5cd0	cbnz w0,0x009c5ce0
009c5cd4	add x24,x24,#0x1
009c5cd8	cmp x24,x23
009c5cdc	b.cc 0x009c5c88
009c5ce0	cmp x24,x23
009c5ce4	b.ne 0x009c58d8
009c5ce8	cbz w20,0x009c5d14
009c5cec	bl 0x00c342a0
009c5cf0	adrp x0,0x2c3000
009c5cf4	adrp x2,0x2c1000
009c5cf8	add x0,x0,#0x5d8
009c5cfc	add x2,x2,#0x7d5
009c5d00	mov w1,#0xd1c
009c5d04	bl 0x00c342b0
009c5d08	mov w1,#0x28
009c5d0c	mov w2,#0x172
009c5d10	b 0x009c5c5c
009c5d14	mov w0,#0x1
009c5d18	ldp x29,x30,[sp, #0x90]
009c5d1c	ldp x20,x19,[sp, #0x80]
009c5d20	ldp x22,x21,[sp, #0x70]
009c5d24	ldp x24,x23,[sp, #0x60]
009c5d28	ldp x26,x25,[sp, #0x50]
009c5d2c	ldp x28,x27,[sp, #0x40]
009c5d30	add sp,sp,#0xa0
009c5d34	ret
009c5d38	ldr w9,[x19, #0x38]
009c5d3c	cmp w9,#0x1
009c5d40	b.ne 0x009c5d5c
009c5d44	ldr x22,[x8, #0x1a8]
009c5d48	cbz x22,0x009c5d5c
009c5d4c	add x8,x8,#0x1b0
009c5d50	ldr x23,[x8]
009c5d54	cbnz x23,0x009c5c80
009c5d58	b 0x009c5d70
009c5d5c	ldr x22,[x8, #0x198]
009c5d60	cbz x22,0x009c5d80
009c5d64	add x8,x8,#0x1a0
009c5d68	ldr x23,[x8]
009c5d6c	cbnz x23,0x009c5c80
009c5d70	mov x24,xzr
009c5d74	cmp x24,x23
009c5d78	b.ne 0x009c58d8
009c5d7c	b 0x009c5ce8
009c5d80	adrp x22,0x74c000
009c5d84	add x22,x22,#0xd90
009c5d88	orr w23,wzr,#0x1c
009c5d8c	b 0x009c5c80
