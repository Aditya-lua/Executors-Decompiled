; DES_decrypt3 @ 00a16d00
00a16d00	str x21,[sp, #-0x30]!
00a16d04	stp x20,x19,[sp, #0x10]
00a16d08	stp x29,x30,[sp, #0x20]
00a16d0c	ldp w8,w9,[x0]
00a16d10	mov x20,x2
00a16d14	mov x21,x1
00a16d18	mov x1,x3
00a16d1c	eor w10,w8,w9, LSR #0x4
00a16d20	and w10,w10,#0xf0f0f0f
00a16d24	eor w9,w9,w10, LSL #0x4
00a16d28	eor w8,w10,w8
00a16d2c	and w10,w9,#0xffff
00a16d30	eor w10,w10,w8, LSR #0x10
00a16d34	eor w9,w10,w9
00a16d38	eor w8,w8,w10, LSL #0x10
00a16d3c	eor w10,w8,w9, LSR #0x2
00a16d40	and w10,w10,#0x33333333
00a16d44	eor w8,w10,w8
00a16d48	eor w9,w9,w10, LSL #0x2
00a16d4c	eor w10,w9,w8, LSR #0x8
00a16d50	and w10,w10,#0xff00ff
00a16d54	eor w9,w10,w9
00a16d58	eor w8,w8,w10, LSL #0x8
00a16d5c	eor w10,w8,w9, LSR #0x1
00a16d60	and w10,w10,#0x55555555
00a16d64	eor w8,w10,w8
00a16d68	eor w9,w9,w10, LSL #0x1
00a16d6c	mov w2,wzr
00a16d70	add x29,sp,#0x20
00a16d74	mov x19,x0
00a16d78	stp w8,w9,[x0]
00a16d7c	bl 0x00a15dc0
00a16d80	mov w2,#0x1
00a16d84	mov x0,x19
00a16d88	mov x1,x20
00a16d8c	bl 0x00a15dc0
00a16d90	mov x0,x19
00a16d94	mov x1,x21
00a16d98	mov w2,wzr
00a16d9c	bl 0x00a15dc0
00a16da0	ldp w8,w9,[x19]
00a16da4	eor w10,w8,w9, LSR #0x1
00a16da8	and w10,w10,#0x55555555
00a16dac	eor w8,w10,w8
00a16db0	eor w9,w9,w10, LSL #0x1
00a16db4	eor w10,w9,w8, LSR #0x8
00a16db8	and w10,w10,#0xff00ff
00a16dbc	eor w9,w10,w9
00a16dc0	eor w8,w8,w10, LSL #0x8
00a16dc4	eor w10,w8,w9, LSR #0x2
00a16dc8	and w10,w10,#0x33333333
00a16dcc	eor w9,w9,w10, LSL #0x2
00a16dd0	eor w8,w10,w8
00a16dd4	and w10,w9,#0xffff
00a16dd8	eor w10,w10,w8, LSR #0x10
00a16ddc	eor w9,w10,w9
00a16de0	eor w8,w8,w10, LSL #0x10
00a16de4	eor w10,w8,w9, LSR #0x4
00a16de8	and w10,w10,#0xf0f0f0f
00a16dec	eor w8,w10,w8
00a16df0	eor w9,w9,w10, LSL #0x4
00a16df4	stp w8,w9,[x19]
00a16df8	ldp x29,x30,[sp, #0x20]
00a16dfc	ldp x20,x19,[sp, #0x10]
00a16e00	ldr x21,[sp], #0x30
00a16e04	ret
