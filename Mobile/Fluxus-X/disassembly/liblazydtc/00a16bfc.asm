; DES_encrypt3 @ 00a16bfc
00a16bfc	str x21,[sp, #-0x30]!
00a16c00	stp x20,x19,[sp, #0x10]
00a16c04	stp x29,x30,[sp, #0x20]
00a16c08	ldp w8,w9,[x0]
00a16c0c	mov x21,x2
00a16c10	mov w2,#0x1
00a16c14	add x29,sp,#0x20
00a16c18	eor w10,w8,w9, LSR #0x4
00a16c1c	and w10,w10,#0xf0f0f0f
00a16c20	eor w9,w9,w10, LSL #0x4
00a16c24	eor w8,w10,w8
00a16c28	and w10,w9,#0xffff
00a16c2c	eor w10,w10,w8, LSR #0x10
00a16c30	eor w9,w10,w9
00a16c34	eor w8,w8,w10, LSL #0x10
00a16c38	eor w10,w8,w9, LSR #0x2
00a16c3c	and w10,w10,#0x33333333
00a16c40	eor w8,w10,w8
00a16c44	eor w9,w9,w10, LSL #0x2
00a16c48	eor w10,w9,w8, LSR #0x8
00a16c4c	and w10,w10,#0xff00ff
00a16c50	eor w9,w10,w9
00a16c54	eor w8,w8,w10, LSL #0x8
00a16c58	eor w10,w8,w9, LSR #0x1
00a16c5c	and w10,w10,#0x55555555
00a16c60	eor w8,w10,w8
00a16c64	eor w9,w9,w10, LSL #0x1
00a16c68	mov x20,x3
00a16c6c	mov x19,x0
00a16c70	stp w8,w9,[x0]
00a16c74	bl 0x00a15dc0
00a16c78	mov x0,x19
00a16c7c	mov x1,x21
00a16c80	mov w2,wzr
00a16c84	bl 0x00a15dc0
00a16c88	mov w2,#0x1
00a16c8c	mov x0,x19
00a16c90	mov x1,x20
00a16c94	bl 0x00a15dc0
00a16c98	ldp w8,w9,[x19]
00a16c9c	eor w10,w8,w9, LSR #0x1
00a16ca0	and w10,w10,#0x55555555
00a16ca4	eor w8,w10,w8
00a16ca8	eor w9,w9,w10, LSL #0x1
00a16cac	eor w10,w9,w8, LSR #0x8
00a16cb0	and w10,w10,#0xff00ff
00a16cb4	eor w9,w10,w9
00a16cb8	eor w8,w8,w10, LSL #0x8
00a16cbc	eor w10,w8,w9, LSR #0x2
00a16cc0	and w10,w10,#0x33333333
00a16cc4	eor w9,w9,w10, LSL #0x2
00a16cc8	eor w8,w10,w8
00a16ccc	and w10,w9,#0xffff
00a16cd0	eor w10,w10,w8, LSR #0x10
00a16cd4	eor w9,w10,w9
00a16cd8	eor w8,w8,w10, LSL #0x10
00a16cdc	eor w10,w8,w9, LSR #0x4
00a16ce0	and w10,w10,#0xf0f0f0f
00a16ce4	eor w8,w10,w8
00a16ce8	eor w9,w9,w10, LSL #0x4
00a16cec	stp w8,w9,[x19]
00a16cf0	ldp x29,x30,[sp, #0x20]
00a16cf4	ldp x20,x19,[sp, #0x10]
00a16cf8	ldr x21,[sp], #0x30
00a16cfc	ret
