; bn_compute_wNAF @ 00a18afc
00a18afc	sub sp,sp,#0x80
00a18b00	stp x28,x27,[sp, #0x20]
00a18b04	stp x26,x25,[sp, #0x30]
00a18b08	stp x24,x23,[sp, #0x40]
00a18b0c	stp x22,x21,[sp, #0x50]
00a18b10	stp x20,x19,[sp, #0x60]
00a18b14	stp x29,x30,[sp, #0x70]
00a18b18	add x29,sp,#0x70
00a18b1c	mov x20,x2
00a18b20	mov w23,w1
00a18b24	mov x21,x0
00a18b28	bl 0x00c369b0
00a18b2c	cbz w0,0x00a18b5c
00a18b30	adrp x1,0x2af000
00a18b34	add x1,x1,#0xdb8
00a18b38	mov w0,#0x1
00a18b3c	orr w2,wzr,#0x1f
00a18b40	bl 0x00c32320
00a18b44	mov x19,x0
00a18b48	cbz x0,0x00a18b84
00a18b4c	mov w8,#0x1
00a18b50	strb wzr,[x19]
00a18b54	str x8,[x20]
00a18b58	b 0x00a18d78
00a18b5c	sub w8,w23,#0x1
00a18b60	cmp w8,#0x7
00a18b64	b.cc 0x00a18bbc
00a18b68	bl 0x00c342a0
00a18b6c	adrp x0,0x2af000
00a18b70	adrp x2,0x29f000
00a18b74	add x0,x0,#0xdb8
00a18b78	add x2,x2,#0xfbf
00a18b7c	mov w1,#0x2b
00a18b80	b 0x00a18d44
00a18b84	bl 0x00c342a0
00a18b88	adrp x0,0x2af000
00a18b8c	adrp x2,0x29f000
00a18b90	add x0,x0,#0xdb8
00a18b94	add x2,x2,#0xfbf
00a18b98	mov w1,#0x21
00a18b9c	bl 0x00c342b0
00a18ba0	mov w8,#0x103
00a18ba4	movk w8,#0xc, LSL #16
00a18ba8	sub w1,w8,#0x3
00a18bac	orr w0,wzr,#0x3
00a18bb0	mov x2,xzr
00a18bb4	bl 0x00c342c0
00a18bb8	b 0x00a18d60
00a18bbc	mov x0,x21
00a18bc0	mov w22,#0x1
00a18bc4	bl 0x00c37f40
00a18bc8	ldr x8,[x21]
00a18bcc	cmp w0,#0x0
00a18bd0	cneg w24,w22,ne
00a18bd4	cbz x8,0x00a18d2c
00a18bd8	ldr w8,[x21, #0x8]
00a18bdc	cbz w8,0x00a18d2c
00a18be0	mov x0,x21
00a18be4	bl 0x00c322f0
00a18be8	sxtw x8,w0
00a18bec	add x25,x8,#0x1
00a18bf0	adrp x1,0x2af000
00a18bf4	add x1,x1,#0xdb8
00a18bf8	orr w2,wzr,#0x3c
00a18bfc	mov x0,x25
00a18c00	str x8,[sp, #0x18]
00a18c04	bl 0x00c32320
00a18c08	mov x19,x0
00a18c0c	cbz x0,0x00a18d9c
00a18c10	ldr x9,[x21]
00a18c14	lsl w27,w22,w23
00a18c18	mov w26,w23
00a18c1c	sxtw x10,w23
00a18c20	ldr w9,[x9]
00a18c24	lsl w23,w27,#0x1
00a18c28	neg w11,w27
00a18c2c	str w11,[sp, #0x14]
00a18c30	sub w11,w23,#0x1
00a18c34	mov x8,xzr
00a18c38	asr w12,w11,#0x1
00a18c3c	and w28,w11,w9
00a18c40	add x22,x10,#0x1
00a18c44	str x25,[sp, #0x8]
00a18c48	str w12,[sp, #0x10]
00a18c4c	cbz w28,0x00a18c5c
00a18c50	tbnz w28,#0x0,0x00a18c74
00a18c54	mov w9,wzr
00a18c58	b 0x00a18ce0
00a18c5c	ldr x10,[sp, #0x18]
00a18c60	add x9,x22,x8
00a18c64	cmp x9,x10
00a18c68	mov w9,wzr
00a18c6c	b.cc 0x00a18ce0
00a18c70	b 0x00a18db8
00a18c74	tst w28,w27
00a18c78	b.eq 0x00a18ca8
00a18c7c	ldr w11,[sp, #0x10]
00a18c80	ldr x12,[sp, #0x18]
00a18c84	add x10,x22,x8
00a18c88	sub w9,w28,w23
00a18c8c	and w11,w28,w11
00a18c90	cmp x10,x12
00a18c94	csel w9,w9,w11,cc
00a18c98	and w10,w9,#0x1
00a18c9c	cmp w9,w27
00a18ca0	b.lt 0x00a18cb8
00a18ca4	b 0x00a18de0
00a18ca8	mov w10,#0x1
00a18cac	mov w9,w28
00a18cb0	cmp w9,w27
00a18cb4	b.ge 0x00a18de0
00a18cb8	ldr w11,[sp, #0x14]
00a18cbc	cmp w9,w11
00a18cc0	b.le 0x00a18de0
00a18cc4	cbz w10,0x00a18de0
00a18cc8	sub w28,w28,w9
00a18ccc	cmp w28,w27
00a18cd0	b.eq 0x00a18ce0
00a18cd4	cbz w28,0x00a18ce0
00a18cd8	cmp w28,w23
00a18cdc	b.ne 0x00a18dfc
00a18ce0	add w10,w26,w8
00a18ce4	mul w9,w9,w24
00a18ce8	add w1,w10,#0x1
00a18cec	mov x0,x21
00a18cf0	add x25,x8,#0x1
00a18cf4	strb w9,[x19, x8]
00a18cf8	bl 0x00c38d00
00a18cfc	lsl w8,w0,w26
00a18d00	add w28,w8,w28, ASR #0x1
00a18d04	cmp w28,w23
00a18d08	mov x8,x25
00a18d0c	b.le 0x00a18c4c
00a18d10	bl 0x00c342a0
00a18d14	adrp x0,0x2af000
00a18d18	adrp x2,0x29f000
00a18d1c	add x0,x0,#0xdb8
00a18d20	add x2,x2,#0xfbf
00a18d24	orr w1,wzr,#0x7c
00a18d28	b 0x00a18e14
00a18d2c	bl 0x00c342a0
00a18d30	adrp x0,0x2af000
00a18d34	adrp x2,0x29f000
00a18d38	add x0,x0,#0xdb8
00a18d3c	add x2,x2,#0xfbf
00a18d40	mov w1,#0x37
00a18d44	bl 0x00c342b0
00a18d48	mov w1,#0x103
00a18d4c	orr w0,wzr,#0x3
00a18d50	movk w1,#0xc, LSL #16
00a18d54	mov x2,xzr
00a18d58	bl 0x00c342c0
00a18d5c	mov x19,xzr
00a18d60	adrp x1,0x2af000
00a18d64	add x1,x1,#0xdb8
00a18d68	mov w2,#0x89
00a18d6c	mov x0,x19
00a18d70	bl 0x00c32310
00a18d74	mov x19,xzr
00a18d78	mov x0,x19
00a18d7c	ldp x29,x30,[sp, #0x70]
00a18d80	ldp x20,x19,[sp, #0x60]
00a18d84	ldp x22,x21,[sp, #0x50]
00a18d88	ldp x24,x23,[sp, #0x40]
00a18d8c	ldp x26,x25,[sp, #0x30]
00a18d90	ldp x28,x27,[sp, #0x20]
00a18d94	add sp,sp,#0x80
00a18d98	ret
00a18d9c	bl 0x00c342a0
00a18da0	adrp x0,0x2af000
00a18da4	adrp x2,0x29f000
00a18da8	add x0,x0,#0xdb8
00a18dac	add x2,x2,#0xfbf
00a18db0	mov w1,#0x42
00a18db4	b 0x00a18b9c
00a18db8	ldr x9,[sp, #0x8]
00a18dbc	cmp x8,x9
00a18dc0	b.ls 0x00a18b54
00a18dc4	bl 0x00c342a0
00a18dc8	adrp x0,0x2af000
00a18dcc	adrp x2,0x29f000
00a18dd0	add x0,x0,#0xdb8
00a18dd4	add x2,x2,#0xfbf
00a18dd8	mov w1,#0x82
00a18ddc	b 0x00a18e14
00a18de0	bl 0x00c342a0
00a18de4	adrp x0,0x2af000
00a18de8	adrp x2,0x29f000
00a18dec	add x0,x0,#0xdb8
00a18df0	add x2,x2,#0xfbf
00a18df4	mov w1,#0x65
00a18df8	b 0x00a18e14
00a18dfc	bl 0x00c342a0
00a18e00	adrp x0,0x2af000
00a18e04	adrp x2,0x29f000
00a18e08	add x0,x0,#0xdb8
00a18e0c	add x2,x2,#0xfbf
00a18e10	mov w1,#0x71
00a18e14	bl 0x00c342b0
00a18e18	mov w1,#0x103
00a18e1c	orr w0,wzr,#0x3
00a18e20	movk w1,#0xc, LSL #16
00a18e24	b 0x00a18bb0
