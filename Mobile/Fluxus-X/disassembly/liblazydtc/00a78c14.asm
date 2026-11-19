; DH_generate_parameters_ex @ 00a78c14
00a78c14	str x25,[sp, #-0x50]!
00a78c18	stp x24,x23,[sp, #0x10]
00a78c1c	stp x22,x21,[sp, #0x20]
00a78c20	stp x20,x19,[sp, #0x30]
00a78c24	stp x29,x30,[sp, #0x40]
00a78c28	ldr x8,[x0, #0xb8]
00a78c2c	mov x21,x3
00a78c30	mov w25,w2
00a78c34	mov x20,x0
00a78c38	ldr x4,[x8, #0x40]
00a78c3c	mov w22,w1
00a78c40	add x29,sp,#0x40
00a78c44	cbz x4,0x00a78c70
00a78c48	mov x0,x20
00a78c4c	mov w1,w22
00a78c50	mov x3,x21
00a78c54	ldp x29,x30,[sp, #0x40]
00a78c58	ldp x20,x19,[sp, #0x30]
00a78c5c	ldp x22,x21,[sp, #0x20]
00a78c60	ldp x24,x23,[sp, #0x10]
00a78c64	mov w2,w25
00a78c68	ldr x25,[sp], #0x50
00a78c6c	br x4
00a78c70	mov w8,#0x2711
00a78c74	cmp w22,w8
00a78c78	b.lt 0x00a78ca4
00a78c7c	bl 0x00c342a0
00a78c80	adrp x0,0x2cd000
00a78c84	adrp x2,0x2a0000
00a78c88	add x0,x0,#0xba6
00a78c8c	add x2,x2,#0x38c
00a78c90	mov w1,#0xa3
00a78c94	bl 0x00c342b0
00a78c98	mov w0,#0x5
00a78c9c	mov w1,#0x67
00a78ca0	b 0x00a78cd0
00a78ca4	cmp w22,#0x1ff
00a78ca8	b.gt 0x00a78ce0
00a78cac	bl 0x00c342a0
00a78cb0	adrp x0,0x2cd000
00a78cb4	adrp x2,0x2a0000
00a78cb8	add x0,x0,#0xba6
00a78cbc	add x2,x2,#0x38c
00a78cc0	mov w1,#0xa8
00a78cc4	bl 0x00c342b0
00a78cc8	mov w0,#0x5
00a78ccc	orr w1,wzr,#0x7e
00a78cd0	mov x2,xzr
00a78cd4	bl 0x00c342c0
00a78cd8	mov w20,wzr
00a78cdc	b 0x00a78db4
00a78ce0	ldr x0,[x20, #0xb0]
00a78ce4	bl 0x00c38a60
00a78ce8	mov x19,x0
00a78cec	cbz x0,0x00a78d70
00a78cf0	mov x0,x19
00a78cf4	bl 0x00c38a90
00a78cf8	mov x0,x19
00a78cfc	bl 0x00c38a40
00a78d00	mov x23,x0
00a78d04	mov x0,x19
00a78d08	bl 0x00c38a40
00a78d0c	cbz x0,0x00a78d70
00a78d10	ldr x8,[x20, #0x8]
00a78d14	mov x24,x0
00a78d18	cbnz x8,0x00a78d28
00a78d1c	bl 0x00c37710
00a78d20	str x0,[x20, #0x8]
00a78d24	cbz x0,0x00a78d70
00a78d28	ldr x8,[x20, #0x18]
00a78d2c	cbnz x8,0x00a78d3c
00a78d30	bl 0x00c37710
00a78d34	str x0,[x20, #0x18]
00a78d38	cbz x0,0x00a78d70
00a78d3c	cmp w25,#0x1
00a78d40	b.gt 0x00a78dd0
00a78d44	bl 0x00c342a0
00a78d48	adrp x0,0x2cd000
00a78d4c	adrp x2,0x2a0000
00a78d50	add x0,x0,#0xba6
00a78d54	add x2,x2,#0x38c
00a78d58	mov w1,#0xbc
00a78d5c	bl 0x00c342b0
00a78d60	mov w0,#0x5
00a78d64	mov w1,#0x65
00a78d68	mov x2,xzr
00a78d6c	bl 0x00c342c0
00a78d70	bl 0x00c342a0
00a78d74	adrp x0,0x2cd000
00a78d78	adrp x2,0x2a0000
00a78d7c	add x0,x0,#0xba6
00a78d80	add x2,x2,#0x38c
00a78d84	mov w1,#0xe2
00a78d88	bl 0x00c342b0
00a78d8c	mov w1,#0x3
00a78d90	mov w0,#0x5
00a78d94	movk w1,#0x8, LSL #16
00a78d98	mov x2,xzr
00a78d9c	bl 0x00c342c0
00a78da0	mov w20,wzr
00a78da4	mov x0,x19
00a78da8	bl 0x00c38a20
00a78dac	mov x0,x19
00a78db0	bl 0x00c38a30
00a78db4	mov w0,w20
00a78db8	ldp x29,x30,[sp, #0x40]
00a78dbc	ldp x20,x19,[sp, #0x30]
00a78dc0	ldp x22,x21,[sp, #0x20]
00a78dc4	ldp x24,x23,[sp, #0x10]
00a78dc8	ldr x25,[sp], #0x50
00a78dcc	ret
00a78dd0	cmp w25,#0x5
00a78dd4	b.eq 0x00a78e08
00a78dd8	cmp w25,#0x2
00a78ddc	b.ne 0x00a78e30
00a78de0	orr w1,wzr,#0x18
00a78de4	mov x0,x23
00a78de8	bl 0x00c37720
00a78dec	cbz w0,0x00a78d70
00a78df0	mov w1,#0x17
00a78df4	mov x0,x24
00a78df8	bl 0x00c37720
00a78dfc	cbz w0,0x00a78d70
00a78e00	mov w25,#0x2
00a78e04	b 0x00a78e54
00a78e08	orr w1,wzr,#0x3c
00a78e0c	mov x0,x23
00a78e10	bl 0x00c37720
00a78e14	cbz w0,0x00a78d70
00a78e18	mov w1,#0x3b
00a78e1c	mov x0,x24
00a78e20	bl 0x00c37720
00a78e24	cbz w0,0x00a78d70
00a78e28	mov w25,#0x5
00a78e2c	b 0x00a78e54
00a78e30	orr w1,wzr,#0xc
00a78e34	mov x0,x23
00a78e38	bl 0x00c37720
00a78e3c	cbz w0,0x00a78d70
00a78e40	mov w1,#0xb
00a78e44	mov x0,x24
00a78e48	bl 0x00c37720
00a78e4c	cbz w0,0x00a78d70
00a78e50	sxtw x25,w25
00a78e54	ldr x0,[x20, #0x8]
00a78e58	mov w2,#0x1
00a78e5c	mov w1,w22
00a78e60	mov x3,x23
00a78e64	mov x4,x24
00a78e68	mov x5,x21
00a78e6c	mov x6,x19
00a78e70	bl 0x00c39120
00a78e74	cbz w0,0x00a78d70
00a78e78	orr w1,wzr,#0x3
00a78e7c	mov x0,x21
00a78e80	mov w2,wzr
00a78e84	bl 0x00c39100
00a78e88	cbz w0,0x00a78d70
00a78e8c	ldr x0,[x20, #0x18]
00a78e90	mov x1,x25
00a78e94	bl 0x00c37720
00a78e98	cbz w0,0x00a78d70
00a78e9c	ldr x8,[x20, #0xc8]
00a78ea0	add x8,x8,#0x1
00a78ea4	str x8,[x20, #0xc8]
00a78ea8	mov w20,#0x1
00a78eac	b 0x00a78da4
