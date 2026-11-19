; std::__ndk1::num_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_get @ 00be2b70
00be2b70	paciasp
00be2b74	sub sp,sp,#0x110
00be2b78	stp x29,x30,[sp, #0xb0]
00be2b7c	stp x28,x27,[sp, #0xc0]
00be2b80	stp x26,x25,[sp, #0xd0]
00be2b84	stp x24,x23,[sp, #0xe0]
00be2b88	stp x22,x21,[sp, #0xf0]
00be2b8c	stp x20,x19,[sp, #0x100]
00be2b90	add x29,sp,#0xb0
00be2b94	mov x25,x5
00be2b98	mov x24,x4
00be2b9c	mov x0,x3
00be2ba0	mov x20,x2
00be2ba4	mov x21,x1
00be2ba8	add x8,sp,#0x28
00be2bac	bl 0x00c30070
00be2bb0	adrp x22,0xcb5000
00be2bb4	ldr x22,[x22, #0xb98]
00be2bb8	ldr x19,[sp, #0x28]
00be2bbc	stur x22,[x29, #-0x18]
00be2bc0	ldar x8,[x22]
00be2bc4	cmn x8,#0x1
00be2bc8	b.eq 0x00be2bf4
00be2bcc	sub x8,x29,#0x18
00be2bd0	add x9,sp,#0x10
00be2bd4	str x8,[sp, #0x10]
00be2bd8	stur x9,[x29, #-0x10]
00be2bdc	adrp x0,0xcb5000
00be2be0	nop
00be2be4	adr x2,0xc0bab0
00be2be8	ldr x0,[x0, #0xb98]
00be2bec	sub x1,x29,#0x10
00be2bf0	bl 0x00c305d0
00be2bf4	ldp x8,x10,[x19, #0x10]
00be2bf8	ldrsw x9,[x22, #0x8]
00be2bfc	sub x9,x9,#0x1
00be2c00	sub x10,x10,x8
00be2c04	cmp x9,x10, ASR #0x3
00be2c08	b.cs 0x00be300c
00be2c0c	ldr x0,[x8, x9, LSL #0x3]
00be2c10	cbz x0,0x00be300c
00be2c14	ldr x8,[x0]
00be2c18	ldr x8,[x8, #0x60]
00be2c1c	adrp x23,0xcb5000
00be2c20	add x3,sp,#0x30
00be2c24	ldr x23,[x23, #0xc08]
00be2c28	add x2,x23,#0x1a
00be2c2c	mov x1,x23
00be2c30	blr x8
00be2c34	add x0,sp,#0x28
00be2c38	stp x25,x24,[sp]
00be2c3c	bl 0x00c30090
00be2c40	stp xzr,xzr,[sp, #0x10]
00be2c44	str xzr,[sp, #0x20]
00be2c48	add x0,sp,#0x10
00be2c4c	mov w1,#0x16
00be2c50	mov w2,wzr
00be2c54	add x19,sp,#0x10
00be2c58	bl 0x00c30250
00be2c5c	ldrb w8,[sp, #0x10]
00be2c60	ldr x9,[sp, #0x20]
00be2c64	add x26,sp,#0x30
00be2c68	orr x25,x19,#0x1
00be2c6c	add x27,x26,#0x68
00be2c70	mov w28,#0x16
00be2c74	tst w8,#0x1
00be2c78	csinc x22,x9,x19,ne
00be2c7c	mov x19,x22
00be2c80	b 0x00be2c8c
00be2c84	add x8,x8,#0x4
00be2c88	str x8,[x21, #0x18]
00be2c8c	cbz x21,0x00be2ca4
00be2c90	ldp x8,x9,[x21, #0x18]
00be2c94	cmp x8,x9
00be2c98	b.eq 0x00be2cb4
00be2c9c	ldr w0,[x8]
00be2ca0	b 0x00be2cc4
00be2ca4	mov w24,#0x1
00be2ca8	cbnz x20,0x00be2cd4
00be2cac	tbz w24,#0x0,0x00be2d0c
00be2cb0	b 0x00be2ea4
00be2cb4	ldr x8,[x21]
00be2cb8	ldr x8,[x8, #0x48]
00be2cbc	mov x0,x21
00be2cc0	blr x8
00be2cc4	cmn w0,#0x1
00be2cc8	cset w24,eq
00be2ccc	csel x21,xzr,x21,eq
00be2cd0	cbz x20,0x00be2cac
00be2cd4	ldp x8,x9,[x20, #0x18]
00be2cd8	cmp x8,x9
00be2cdc	b.eq 0x00be2ce8
00be2ce0	ldr w0,[x8]
00be2ce4	b 0x00be2cf8
00be2ce8	ldr x8,[x20]
00be2cec	ldr x8,[x8, #0x48]
00be2cf0	mov x0,x20
00be2cf4	blr x8
00be2cf8	cmn w0,#0x1
00be2cfc	cset w8,eq
00be2d00	csel x20,xzr,x20,eq
00be2d04	cmp w24,w8
00be2d08	b.eq 0x00be2ea4
00be2d0c	ldrb w8,[sp, #0x10]
00be2d10	ldr x9,[sp, #0x18]
00be2d14	lsr x10,x8,#0x1
00be2d18	tst w8,#0x1
00be2d1c	csel x24,x10,x9,eq
00be2d20	add x9,x19,x24
00be2d24	cmp x22,x9
00be2d28	b.ne 0x00be2ddc
00be2d2c	cmp x24,#0x1
00be2d30	b.lt 0x00be2d48
00be2d34	add x0,sp,#0x10
00be2d38	mov x1,x24
00be2d3c	mov w2,wzr
00be2d40	bl 0x00c30250
00be2d44	b 0x00be2d6c
00be2d48	lsl x9,x24,#0x1
00be2d4c	tbnz w8,#0x0,0x00be2d60
00be2d50	lsl w8,w9,#0x1
00be2d54	strb w8,[sp, #0x10]
00be2d58	mov x8,x25
00be2d5c	b 0x00be2d68
00be2d60	ldr x8,[sp, #0x20]
00be2d64	str x9,[sp, #0x18]
00be2d68	strb wzr,[x8, x9]
00be2d6c	ldp x9,x10,[sp, #0x10]
00be2d70	ldrb w8,[sp, #0x10]
00be2d74	tst w8,#0x1
00be2d78	and x11,x9,#-0x2
00be2d7c	ubfx x12,x9,#0x1,#0x7
00be2d80	sub x11,x11,#0x1
00be2d84	csel x8,x28,x11,eq
00be2d88	tst x9,#0x1
00be2d8c	csel x10,x12,x10,eq
00be2d90	subs x1,x8,x10
00be2d94	b.ls 0x00be2da8
00be2d98	add x0,sp,#0x10
00be2d9c	mov w2,wzr
00be2da0	bl 0x00c30250
00be2da4	b 0x00be2dc8
00be2da8	tbnz w9,#0x0,0x00be2dbc
00be2dac	lsl w9,w8,#0x1
00be2db0	strb w9,[sp, #0x10]
00be2db4	mov x9,x25
00be2db8	b 0x00be2dc4
00be2dbc	ldr x9,[sp, #0x20]
00be2dc0	str x8,[sp, #0x18]
00be2dc4	strb wzr,[x9, x8]
00be2dc8	ldrb w8,[sp, #0x10]
00be2dcc	ldr x9,[sp, #0x20]
00be2dd0	tst w8,#0x1
00be2dd4	csel x19,x25,x9,eq
00be2dd8	add x22,x19,x24
00be2ddc	ldp x8,x9,[x21, #0x18]
00be2de0	cmp x8,x9
00be2de4	b.eq 0x00be2df0
00be2de8	ldr w1,[x8]
00be2dec	b 0x00be2e04
00be2df0	ldr x8,[x21]
00be2df4	ldr x8,[x8, #0x48]
00be2df8	mov x0,x21
00be2dfc	blr x8
00be2e00	mov w1,w0
00be2e04	cmp x22,x19
00be2e08	b.eq 0x00be2e5c
00be2e0c	add x0,sp,#0x30
00be2e10	mov w2,#0x1a
00be2e14	bl 0x00c43a60
00be2e18	cmp x0,#0x0
00be2e1c	csel x8,x27,x0,eq
00be2e20	sub x8,x8,x26
00be2e24	asr x8,x8,#0x2
00be2e28	cmp x8,#0x17
00be2e2c	b.gt 0x00be2ea4
00be2e30	cmp x8,#0x16
00be2e34	b.lt 0x00be2e54
00be2e38	subs x9,x22,x19
00be2e3c	b.eq 0x00be2ea4
00be2e40	cmp x9,#0x2
00be2e44	b.gt 0x00be2ea4
00be2e48	ldurb w9,[x22, #-0x1]
00be2e4c	cmp w9,#0x30
00be2e50	b.ne 0x00be2ea4
00be2e54	ldrb w8,[x23, x8]
00be2e58	b 0x00be2e80
00be2e5c	ldr w8,[sp, #0x90]
00be2e60	cmp w1,w8
00be2e64	b.ne 0x00be2e70
00be2e68	mov w8,#0x2b
00be2e6c	b 0x00be2e80
00be2e70	ldr w8,[sp, #0x94]
00be2e74	cmp w1,w8
00be2e78	b.ne 0x00be2e0c
00be2e7c	mov w8,#0x2d
00be2e80	strb w8,[x22], #0x1
00be2e84	ldp x8,x9,[x21, #0x18]
00be2e88	cmp x8,x9
00be2e8c	b.ne 0x00be2c84
00be2e90	ldr x8,[x21]
00be2e94	ldr x8,[x8, #0x50]
00be2e98	mov x0,x21
00be2e9c	blr x8
00be2ea0	b 0x00be2c8c
00be2ea4	ldrb w9,[sp, #0x10]
00be2ea8	ldr x10,[sp, #0x18]
00be2eac	sub x8,x22,x19
00be2eb0	ldr x22,[sp, #0x8]
00be2eb4	lsr x11,x9,#0x1
00be2eb8	tst w9,#0x1
00be2ebc	csel x10,x11,x10,eq
00be2ec0	subs x1,x8,x10
00be2ec4	b.ls 0x00be2ed8
00be2ec8	add x0,sp,#0x10
00be2ecc	mov w2,wzr
00be2ed0	bl 0x00c30250
00be2ed4	b 0x00be2ef8
00be2ed8	tbnz w9,#0x0,0x00be2eec
00be2edc	lsl w9,w8,#0x1
00be2ee0	strb w9,[sp, #0x10]
00be2ee4	mov x9,x25
00be2ee8	b 0x00be2ef4
00be2eec	ldr x9,[sp, #0x20]
00be2ef0	str x8,[sp, #0x18]
00be2ef4	strb wzr,[x9, x8]
00be2ef8	ldrb w8,[sp, #0x10]
00be2efc	ldr x9,[sp, #0x20]
00be2f00	adrp x10,0xd27000
00be2f04	add x10,x10,#0xf8
00be2f08	adrp x19,0xd27000
00be2f0c	ldarb w10,[x10]
00be2f10	tst w8,#0x1
00be2f14	csel x23,x25,x9,eq
00be2f18	tbz w10,#0x0,0x00be3010
00be2f1c	ldr x1,[x19, #0xf0]
00be2f20	ldr x3,[sp]
00be2f24	adrp x2,0x2ab000
00be2f28	add x2,x2,#0x219
00be2f2c	mov x0,x23
00be2f30	bl 0x00c0ca90
00be2f34	cmp w0,#0x1
00be2f38	b.eq 0x00be2f44
00be2f3c	mov w8,#0x4
00be2f40	str w8,[x22]
00be2f44	cbz x21,0x00be2f5c
00be2f48	ldp x8,x9,[x21, #0x18]
00be2f4c	cmp x8,x9
00be2f50	b.eq 0x00be2f6c
00be2f54	ldr w0,[x8]
00be2f58	b 0x00be2f7c
00be2f5c	mov w19,#0x1
00be2f60	cbnz x20,0x00be2f8c
00be2f64	tbnz w19,#0x0,0x00be2fc0
00be2f68	b 0x00be2fcc
00be2f6c	ldr x8,[x21]
00be2f70	ldr x8,[x8, #0x48]
00be2f74	mov x0,x21
00be2f78	blr x8
00be2f7c	cmn w0,#0x1
00be2f80	cset w19,eq
00be2f84	csel x21,xzr,x21,eq
00be2f88	cbz x20,0x00be2f64
00be2f8c	ldp x8,x9,[x20, #0x18]
00be2f90	cmp x8,x9
00be2f94	b.eq 0x00be2fa0
00be2f98	ldr w0,[x8]
00be2f9c	b 0x00be2fb0
00be2fa0	ldr x8,[x20]
00be2fa4	ldr x8,[x8, #0x48]
00be2fa8	mov x0,x20
00be2fac	blr x8
00be2fb0	cmn w0,#0x1
00be2fb4	cset w8,eq
00be2fb8	eor w8,w19,w8
00be2fbc	tbnz w8,#0x0,0x00be2fcc
00be2fc0	ldr w8,[x22]
00be2fc4	orr w8,w8,#0x2
00be2fc8	str w8,[x22]
00be2fcc	ldrb w8,[sp, #0x10]
00be2fd0	tbz w8,#0x0,0x00be2fe4
00be2fd4	ldr x8,[sp, #0x10]
00be2fd8	ldr x0,[sp, #0x20]
00be2fdc	and x1,x8,#-0x2
00be2fe0	bl 0x00c2fe80
00be2fe4	mov x0,x21
00be2fe8	ldp x20,x19,[sp, #0x100]
00be2fec	ldp x22,x21,[sp, #0xf0]
00be2ff0	ldp x24,x23,[sp, #0xe0]
00be2ff4	ldp x26,x25,[sp, #0xd0]
00be2ff8	ldp x28,x27,[sp, #0xc0]
00be2ffc	ldp x29,x30,[sp, #0xb0]
00be3000	add sp,sp,#0x110
00be3004	autiasp
00be3008	ret
00be300c	bl 0x00bd8968
00be3010	adrp x0,0xd27000
00be3014	add x0,x0,#0xf8
00be3018	bl 0x00c2fe90
00be301c	cbz w0,0x00be2f1c
00be3020	adrp x1,0x2c6000
00be3024	add x1,x1,#0xbfc
00be3028	mov w0,#0x1fbf
00be302c	mov x2,xzr
00be3030	bl 0x00c43890
00be3034	str x0,[x19, #0xf0]
00be3038	adrp x0,0xd27000
00be303c	add x0,x0,#0xf8
00be3040	bl 0x00c2fea0
00be3044	ldr x22,[sp, #0x8]
00be3048	b 0x00be2f1c
