; FUN_00b909c8 @ 00b909c8
00b909c8	cmp w2,w1
00b909cc	b.ne 0x00b909dc
00b909d0	mov w8,#0x1
00b909d4	mov w0,w8
00b909d8	ret
00b909dc	mov w9,#0x8ff
00b909e0	and w8,w2,#0xffffff00
00b909e4	movk w9,#0x600, LSL #16
00b909e8	cmp w8,w9
00b909ec	b.gt 0x00b90a08
00b909f0	mov w9,#0x200
00b909f4	movk w9,#0x600, LSL #16
00b909f8	cmp w8,w9
00b909fc	b.eq 0x00b90a3c
00b90a00	mov w9,#0x300
00b90a04	b 0x00b90a1c
00b90a08	mov w9,#0x900
00b90a0c	movk w9,#0x600, LSL #16
00b90a10	cmp w8,w9
00b90a14	b.eq 0x00b90a3c
00b90a18	mov w9,#0x1300
00b90a1c	movk w9,#0x600, LSL #16
00b90a20	cmp w8,w9
00b90a24	b.eq 0x00b90a3c
00b90a28	lsr w9,w2,#0x9
00b90a2c	orr w9,w9,#0x1
00b90a30	orr w10,wzr,#0x30003
00b90a34	cmp w9,w10
00b90a38	b.ne 0x00b90ad0
00b90a3c	mov w10,#0x8ff
00b90a40	and w9,w1,#0xffffff00
00b90a44	movk w10,#0x600, LSL #16
00b90a48	cmp w9,w10
00b90a4c	b.gt 0x00b90a68
00b90a50	mov w10,#0x200
00b90a54	movk w10,#0x600, LSL #16
00b90a58	cmp w9,w10
00b90a5c	b.eq 0x00b90a9c
00b90a60	mov w10,#0x300
00b90a64	b 0x00b90a7c
00b90a68	mov w10,#0x900
00b90a6c	movk w10,#0x600, LSL #16
00b90a70	cmp w9,w10
00b90a74	b.eq 0x00b90a9c
00b90a78	mov w10,#0x1300
00b90a7c	movk w10,#0x600, LSL #16
00b90a80	cmp w9,w10
00b90a84	b.eq 0x00b90a9c
00b90a88	lsr w10,w1,#0x9
00b90a8c	orr w10,w10,#0x1
00b90a90	orr w11,wzr,#0x30003
00b90a94	cmp w10,w11
00b90a98	b.ne 0x00b90ad0
00b90a9c	tst w1,#0xff
00b90aa0	b.eq 0x00b90ad0
00b90aa4	mov w11,#0x13
00b90aa8	mov w10,#0x2000000
00b90aac	movk w11,#0x200, LSL #16
00b90ab0	bfxil w10,w1,#0x0,#0x8
00b90ab4	add w11,w11,#0xec
00b90ab8	cmp w10,w11
00b90abc	b.ne 0x00b90ad0
00b90ac0	cmp w9,w8
00b90ac4	cset w8,eq
00b90ac8	mov w0,w8
00b90acc	ret
00b90ad0	and w8,w1,#0x7f000000
00b90ad4	mov w10,#0x5000000
00b90ad8	cmp w8,w10
00b90adc	and w9,w2,#0x7f000000
00b90ae0	b.ne 0x00b90b18
00b90ae4	cmp w9,w10
00b90ae8	b.ne 0x00b90b18
00b90aec	tbz w1,#0xf,0x00b90bf0
00b90af0	eor w8,w2,w1
00b90af4	and w9,w8,#0xffc07fff
00b90af8	mov w8,wzr
00b90afc	cbnz w9,0x00b90ac8
00b90b00	ubfx w8,w1,#0x10,#0x6
00b90b04	ubfx w9,w2,#0x10,#0x6
00b90b08	cmp w8,w9
00b90b0c	cset w8,ls
00b90b10	mov w0,w8
00b90b14	ret
00b90b18	orr w10,wzr,#0x3000000
00b90b1c	cmp w8,w10
00b90b20	b.ne 0x00b90bac
00b90b24	cmp w9,w10
00b90b28	b.ne 0x00b90bac
00b90b2c	eor w8,w2,w1
00b90b30	tst w8,#0xffc07fff
00b90b34	mov w8,wzr
00b90b38	b.ne 0x00b90ac8
00b90b3c	and w8,w0,#0xffff
00b90b40	mov w9,#0x1100
00b90b44	cmp w8,w9
00b90b48	and w8,w1,#0x7fc00000
00b90b4c	b.ne 0x00b90bf8
00b90b50	orr w9,wzr,#0x3800000
00b90b54	cmp w8,w9
00b90b58	b.ne 0x00b90bf8
00b90b5c	ands w8,w2,#0x3f0000
00b90b60	b.eq 0x00b90c2c
00b90b64	lsr w9,w8,#0x10
00b90b68	and w10,w2,#0x7fc00000
00b90b6c	and w10,w10,#0x7fffffff
00b90b70	orr w11,wzr,#0x3800000
00b90b74	cmp w10,w11
00b90b78	b.eq 0x00b90d1c
00b90b7c	orr w11,wzr,#0x3c00000
00b90b80	cmp w10,w11
00b90b84	mov w10,wzr
00b90b88	b.eq 0x00b90cc0
00b90b8c	ubfx w11,w1,#0x10,#0x6
00b90b90	cbz w11,0x00b90ce4
00b90b94	cbnz w8,0x00b90c88
00b90b98	cmp w11,w10
00b90b9c	b.ne 0x00b90c88
00b90ba0	mov w8,#0x1
00b90ba4	mov w0,w8
00b90ba8	ret
00b90bac	mov w10,#0x9000000
00b90bb0	cmp w8,w10
00b90bb4	mov w8,wzr
00b90bb8	b.ne 0x00b90ac8
00b90bbc	and w8,w1,#0xfe00ffff
00b90bc0	orr w8,w8,#0x8000000
00b90bc4	mov w11,#0x8000000
00b90bc8	cmp w8,w11
00b90bcc	b.ne 0x00b90c24
00b90bd0	cmp w9,w10
00b90bd4	mov w8,wzr
00b90bd8	b.ne 0x00b90ac8
00b90bdc	mov w8,#0xf6ff0000
00b90be0	and w8,w2,w8
00b90be4	orr w8,w8,w10
00b90be8	cmp w8,w1
00b90bec	b 0x00b90ac4
00b90bf0	mov w0,wzr
00b90bf4	ret
00b90bf8	orr w9,wzr,#0x3c00000
00b90bfc	cmp w8,w9
00b90c00	mov w8,wzr
00b90c04	b.ne 0x00b90ac8
00b90c08	and w8,w0,#0x7000
00b90c0c	cmp w8,#0x2, LSL #12
00b90c10	b.ne 0x00b90d04
00b90c14	and w9,w0,#0x700
00b90c18	mov w8,wzr
00b90c1c	cbnz w9,0x00b90b5c
00b90c20	b 0x00b90ac8
00b90c24	mov w0,wzr
00b90c28	ret
00b90c2c	and w10,w2,#0x7fc00000
00b90c30	orr w9,wzr,#0x3c00000
00b90c34	cmp w10,w9
00b90c38	b.eq 0x00b90ca0
00b90c3c	orr w9,wzr,#0x3800000
00b90c40	cmp w10,w9
00b90c44	b.ne 0x00b90cfc
00b90c48	sub w9,w2,#0x3
00b90c4c	and w10,w9,#0xff
00b90c50	cmp w10,#0x10
00b90c54	b.cs 0x00b90c68
00b90c58	and x10,x9,#0xff
00b90c5c	mov w11,#0xe7e7
00b90c60	lsr w10,w11,w10
00b90c64	tbnz w10,#0x0,0x00b90d0c
00b90c68	mov w9,#0x2000000
00b90c6c	mov w10,#0x13
00b90c70	bfxil w9,w2,#0x0,#0x8
00b90c74	movk w10,#0x200, LSL #16
00b90c78	cmp w9,w10
00b90c7c	cset w9,eq
00b90c80	lsl w9,w9,#0x6
00b90c84	b 0x00b90d1c
00b90c88	cmp w11,w9
00b90c8c	and w8,w1,#0x8000
00b90c90	cset w9,ls
00b90c94	and w8,w9,w8, LSR #0xf
00b90c98	mov w0,w8
00b90c9c	ret
00b90ca0	and w9,w0,#0x7000
00b90ca4	cmp w9,#0x2, LSL #12
00b90ca8	mov w9,wzr
00b90cac	b.ne 0x00b90cc0
00b90cb0	and w9,w0,#0xffff
00b90cb4	ubfx w9,w9,#0x8,#0x3
00b90cb8	mov w10,#0x1
00b90cbc	lsl w9,w10,w9
00b90cc0	and w10,w0,#0x7000
00b90cc4	cmp w10,#0x2, LSL #12
00b90cc8	b.ne 0x00b90cec
00b90ccc	and w10,w0,#0xffff
00b90cd0	ubfx w10,w10,#0x8,#0x3
00b90cd4	mov w11,#0x1
00b90cd8	lsl w10,w11,w10
00b90cdc	ubfx w11,w1,#0x10,#0x6
00b90ce0	cbnz w11,0x00b90b94
00b90ce4	cmp w9,w10
00b90ce8	b 0x00b90ac4
00b90cec	mov w10,wzr
00b90cf0	ubfx w11,w1,#0x10,#0x6
00b90cf4	cbnz w11,0x00b90b94
00b90cf8	b 0x00b90ce4
00b90cfc	mov w9,wzr
00b90d00	b 0x00b90b6c
00b90d04	mov w0,wzr
00b90d08	ret
00b90d0c	adrp x10,0x780000
00b90d10	sxtb x9,w9
00b90d14	add x10,x10,#0xa30
00b90d18	ldr w9,[x10, x9, LSL #0x2]
00b90d1c	and w10,w2,#0xff
00b90d20	sub w10,w10,#0x3
00b90d24	cmp w10,#0xf
00b90d28	b.hi 0x00b90d84
00b90d2c	adrp x11,0x780000
00b90d30	add x11,x11,#0x848
00b90d34	ldrsw x10,[x11, x10, LSL #0x2]
00b90d38	add x11,x10,x11
00b90d3c	mov w10,#0x10
00b90d40	br x11
00b90d44	orr w10,wzr,#0x1c
00b90d48	ubfx w11,w1,#0x10,#0x6
00b90d4c	cbnz w11,0x00b90b94
00b90d50	b 0x00b90ce4
00b90d54	mov w10,#0x14
00b90d58	ubfx w11,w1,#0x10,#0x6
00b90d5c	cbnz w11,0x00b90b94
00b90d60	b 0x00b90ce4
00b90d64	mov w10,#0x20
00b90d68	ubfx w11,w1,#0x10,#0x6
00b90d6c	cbnz w11,0x00b90b94
00b90d70	b 0x00b90ce4
00b90d74	orr w10,wzr,#0x30
00b90d78	ubfx w11,w1,#0x10,#0x6
00b90d7c	cbnz w11,0x00b90b94
00b90d80	b 0x00b90ce4
00b90d84	mov w10,#0x2000000
00b90d88	mov w11,#0x13
00b90d8c	bfxil w10,w2,#0x0,#0x8
00b90d90	movk w11,#0x200, LSL #16
00b90d94	cmp w10,w11
00b90d98	cset w10,eq
00b90d9c	lsl w10,w10,#0x6
00b90da0	ubfx w11,w1,#0x10,#0x6
00b90da4	cbnz w11,0x00b90b94
00b90da8	b 0x00b90ce4
00b90dac	mov w10,#0x40
00b90db0	ubfx w11,w1,#0x10,#0x6
00b90db4	cbnz w11,0x00b90b94
00b90db8	b 0x00b90ce4
00b90dbc	mov w10,#0x20
00b90dc0	ubfx w11,w1,#0x10,#0x6
00b90dc4	cbnz w11,0x00b90b94
00b90dc8	b 0x00b90ce4
