; d2i_ECPrivateKey @ 00a25b7c
00a25b7c	sub sp,sp,#0x50
00a25b80	stp x24,x23,[sp, #0x10]
00a25b84	stp x22,x21,[sp, #0x20]
00a25b88	stp x20,x19,[sp, #0x30]
00a25b8c	stp x29,x30,[sp, #0x40]
00a25b90	ldr x8,[x1]
00a25b94	adrp x3,0xc5b000
00a25b98	mov x22,x1
00a25b9c	mov x20,x0
00a25ba0	add x3,x3,#0x2e0
00a25ba4	add x1,sp,#0x8
00a25ba8	mov x0,xzr
00a25bac	add x29,sp,#0x40
00a25bb0	str x8,[sp, #0x8]
00a25bb4	bl 0x00c36150
00a25bb8	cbz x0,0x00a25d7c
00a25bbc	mov x19,x0
00a25bc0	cbz x20,0x00a25bcc
00a25bc4	ldr x21,[x20]
00a25bc8	cbnz x21,0x00a25bd8
00a25bcc	bl 0x00c3a830
00a25bd0	mov x21,x0
00a25bd4	cbz x0,0x00a25cfc
00a25bd8	ldr x8,[x19, #0x10]
00a25bdc	ldr x0,[x21, #0x18]
00a25be0	cbz x8,0x00a25c10
00a25be4	bl 0x00c3a770
00a25be8	ldr x0,[x19, #0x10]
00a25bec	bl 0x00a258d0
00a25bf0	str x0,[x21, #0x18]
00a25bf4	cbz x0,0x00a25cd0
00a25bf8	ldr x8,[x19, #0x10]
00a25bfc	ldr w8,[x8]
00a25c00	cmp w8,#0x1
00a25c04	b.ne 0x00a25c14
00a25c08	str w8,[x0, #0x28]
00a25c0c	b 0x00a25c14
00a25c10	cbz x0,0x00a25cd0
00a25c14	ldr w8,[x19]
00a25c18	str w8,[x21, #0x10]
00a25c1c	ldr x23,[x19, #0x8]
00a25c20	cbz x23,0x00a25d28
00a25c24	mov x0,x23
00a25c28	bl 0x00c32130
00a25c2c	mov x24,x0
00a25c30	mov x0,x23
00a25c34	bl 0x00c32140
00a25c38	sxtw x2,w0
00a25c3c	mov x0,x21
00a25c40	mov x1,x24
00a25c44	bl 0x00c3ab30
00a25c48	cbz w0,0x00a25d54
00a25c4c	ldr x0,[x21, #0x18]
00a25c50	bl 0x00c36870
00a25c54	cmp w0,#0x494
00a25c58	b.ne 0x00a25c68
00a25c5c	mov w1,#0x4
00a25c60	mov x0,x21
00a25c64	bl 0x00c3ab40
00a25c68	ldr x0,[x21, #0x20]
00a25c6c	bl 0x00c3ab50
00a25c70	ldr x0,[x21, #0x18]
00a25c74	bl 0x00c3ab70
00a25c78	str x0,[x21, #0x20]
00a25c7c	cbz x0,0x00a25d9c
00a25c80	ldr x0,[x19, #0x18]
00a25c84	cbz x0,0x00a25db8
00a25c88	bl 0x00c32130
00a25c8c	ldr x8,[x19, #0x18]
00a25c90	mov x23,x0
00a25c94	mov x0,x8
00a25c98	bl 0x00c32140
00a25c9c	sxtw x2,w0
00a25ca0	mov x0,x21
00a25ca4	mov x1,x23
00a25ca8	mov x3,xzr
00a25cac	bl 0x00c3a850
00a25cb0	cbnz w0,0x00a25de0
00a25cb4	bl 0x00c342a0
00a25cb8	adrp x0,0x2af000
00a25cbc	adrp x2,0x2cf000
00a25cc0	add x0,x0,#0xe09
00a25cc4	add x2,x2,#0xa1c
00a25cc8	mov w1,#0x3e4
00a25ccc	b 0x00a25ce8
00a25cd0	bl 0x00c342a0
00a25cd4	adrp x0,0x2af000
00a25cd8	adrp x2,0x2cf000
00a25cdc	add x0,x0,#0xe09
00a25ce0	add x2,x2,#0xa1c
00a25ce4	mov w1,#0x3c3
00a25ce8	bl 0x00c342b0
00a25cec	mov w1,#0x10
00a25cf0	mov w0,#0x10
00a25cf4	movk w1,#0x8, LSL #16
00a25cf8	b 0x00a25d4c
00a25cfc	bl 0x00c342a0
00a25d00	adrp x0,0x2af000
00a25d04	adrp x2,0x2cf000
00a25d08	add x0,x0,#0xe09
00a25d0c	add x2,x2,#0xa1c
00a25d10	mov w1,#0x3b4
00a25d14	bl 0x00c342b0
00a25d18	mov w1,#0x100
00a25d1c	mov w0,#0x10
00a25d20	movk w1,#0xc, LSL #16
00a25d24	b 0x00a25d4c
00a25d28	bl 0x00c342a0
00a25d2c	adrp x0,0x2af000
00a25d30	adrp x2,0x2cf000
00a25d34	add x0,x0,#0xe09
00a25d38	add x2,x2,#0xa1c
00a25d3c	mov w1,#0x3cf
00a25d40	bl 0x00c342b0
00a25d44	mov w0,#0x10
00a25d48	mov w1,#0x7d
00a25d4c	mov x2,xzr
00a25d50	bl 0x00c342c0
00a25d54	cbz x20,0x00a25d64
00a25d58	ldr x8,[x20]
00a25d5c	cmp x8,x21
00a25d60	b.eq 0x00a25d6c
00a25d64	mov x0,x21
00a25d68	bl 0x00c3a7c0
00a25d6c	adrp x1,0xc5b000
00a25d70	add x1,x1,#0x2e0
00a25d74	mov x0,x19
00a25d78	bl 0x00c36160
00a25d7c	mov x21,xzr
00a25d80	mov x0,x21
00a25d84	ldp x29,x30,[sp, #0x40]
00a25d88	ldp x20,x19,[sp, #0x30]
00a25d8c	ldp x22,x21,[sp, #0x20]
00a25d90	ldp x24,x23,[sp, #0x10]
00a25d94	add sp,sp,#0x50
00a25d98	ret
00a25d9c	bl 0x00c342a0
00a25da0	adrp x0,0x2af000
00a25da4	adrp x2,0x2cf000
00a25da8	add x0,x0,#0xe09
00a25dac	add x2,x2,#0xa1c
00a25db0	mov w1,#0x3d9
00a25db4	b 0x00a25ce8
00a25db8	ldr x8,[x21, #0x18]
00a25dbc	ldr x8,[x8]
00a25dc0	ldr x8,[x8, #0x158]
00a25dc4	cbz x8,0x00a25d54
00a25dc8	mov x0,x21
00a25dcc	blr x8
00a25dd0	cbz w0,0x00a25d54
00a25dd4	ldr w8,[x21, #0x30]
00a25dd8	orr w8,w8,#0x2
00a25ddc	str w8,[x21, #0x30]
00a25de0	cbz x20,0x00a25de8
00a25de4	str x21,[x20]
00a25de8	adrp x1,0xc5b000
00a25dec	add x1,x1,#0x2e0
00a25df0	mov x0,x19
00a25df4	bl 0x00c36160
00a25df8	ldr x8,[sp, #0x8]
00a25dfc	str x8,[x22]
00a25e00	ldr x8,[x21, #0x68]
00a25e04	add x8,x8,#0x1
00a25e08	str x8,[x21, #0x68]
00a25e0c	b 0x00a25d80
