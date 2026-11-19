; FUN_00a70a34 @ 00a70a34
00a70a34	stp x29,x30,[sp, #-0x10]!
00a70a38	sub w8,w0,#0x7
00a70a3c	cmp w8,#0x2
00a70a40	mov x29,sp
00a70a44	b.cc 0x00a70a78
00a70a48	cmp w0,#0x4
00a70a4c	b.eq 0x00a70a98
00a70a50	cmp w0,#0x1
00a70a54	b.ne 0x00a70ac4
00a70a58	cbz x1,0x00a70b08
00a70a5c	ldr x8,[x1, #0x28]
00a70a60	cbz x8,0x00a70b40
00a70a64	ldr w8,[x1, #0x30]
00a70a68	cbz w8,0x00a70b40
00a70a6c	mov w0,#0x1
00a70a70	ldp x29,x30,[sp], #0x10
00a70a74	ret
00a70a78	cbz x1,0x00a70ad0
00a70a7c	ldr w8,[x1, #0x10]
00a70a80	cbz w8,0x00a70aec
00a70a84	ldr w8,[x1, #0x30]
00a70a88	cbz w8,0x00a70aec
00a70a8c	mov w0,#0x1
00a70a90	ldp x29,x30,[sp], #0x10
00a70a94	ret
00a70a98	cbz x1,0x00a70b7c
00a70a9c	ldr w8,[x1]
00a70aa0	cmp w8,#0x1
00a70aa4	b.ne 0x00a70b88
00a70aa8	bl 0x00c342a0
00a70aac	adrp x0,0x2b9000
00a70ab0	adrp x2,0x2cd000
00a70ab4	add x0,x0,#0xe99
00a70ab8	add x2,x2,#0xb29
00a70abc	mov w1,#0x13c
00a70ac0	b 0x00a70b20
00a70ac4	mov w0,#0x1
00a70ac8	ldp x29,x30,[sp], #0x10
00a70acc	ret
00a70ad0	bl 0x00c342a0
00a70ad4	adrp x0,0x2b9000
00a70ad8	adrp x2,0x2cd000
00a70adc	add x0,x0,#0xe99
00a70ae0	add x2,x2,#0xb29
00a70ae4	mov w1,#0x149
00a70ae8	b 0x00a70b20
00a70aec	bl 0x00c342a0
00a70af0	adrp x0,0x2b9000
00a70af4	adrp x2,0x2cd000
00a70af8	add x0,x0,#0xe99
00a70afc	add x2,x2,#0xb29
00a70b00	mov w1,#0x14e
00a70b04	b 0x00a70b58
00a70b08	bl 0x00c342a0
00a70b0c	adrp x0,0x2b9000
00a70b10	adrp x2,0x2cd000
00a70b14	add x0,x0,#0xe99
00a70b18	add x2,x2,#0xb29
00a70b1c	mov w1,#0x12a
00a70b20	bl 0x00c342b0
00a70b24	orr w0,wzr,#0x6
00a70b28	mov w1,#0x93
00a70b2c	mov x2,xzr
00a70b30	bl 0x00c342c0
00a70b34	orr w0,wzr,#0xfffffffe
00a70b38	ldp x29,x30,[sp], #0x10
00a70b3c	ret
00a70b40	bl 0x00c342a0
00a70b44	adrp x0,0x2b9000
00a70b48	adrp x2,0x2cd000
00a70b4c	add x0,x0,#0xe99
00a70b50	add x2,x2,#0xb29
00a70b54	mov w1,#0x12f
00a70b58	bl 0x00c342b0
00a70b5c	mov w1,#0x103
00a70b60	orr w0,wzr,#0x6
00a70b64	movk w1,#0xc, LSL #16
00a70b68	mov x2,xzr
00a70b6c	bl 0x00c342c0
00a70b70	mov w0,#0xffffffff
00a70b74	ldp x29,x30,[sp], #0x10
00a70b78	ret
00a70b7c	mov w0,#0x1
00a70b80	ldp x29,x30,[sp], #0x10
00a70b84	ret
00a70b88	ldr x8,[x1, #0x28]
00a70b8c	cbz x8,0x00a70ba4
00a70b90	ldr w8,[x1, #0x30]
00a70b94	cbz w8,0x00a70ba4
00a70b98	mov w0,#0x1
00a70b9c	ldp x29,x30,[sp], #0x10
00a70ba0	ret
00a70ba4	bl 0x00c342a0
00a70ba8	adrp x0,0x2b9000
00a70bac	adrp x2,0x2cd000
00a70bb0	add x0,x0,#0xe99
00a70bb4	add x2,x2,#0xb29
00a70bb8	mov w1,#0x141
00a70bbc	bl 0x00c342b0
00a70bc0	mov w1,#0x103
00a70bc4	orr w0,wzr,#0x6
00a70bc8	movk w1,#0xc, LSL #16
00a70bcc	mov x2,xzr
00a70bd0	bl 0x00c342c0
00a70bd4	mov w0,wzr
00a70bd8	ldp x29,x30,[sp], #0x10
00a70bdc	ret
