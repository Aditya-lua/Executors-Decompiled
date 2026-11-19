; EVP_DigestSignUpdate @ 00a679f4
00a679f4	stp x22,x21,[sp, #-0x30]!
00a679f8	stp x20,x19,[sp, #0x10]
00a679fc	stp x29,x30,[sp, #0x20]
00a67a00	ldr x22,[x0, #0x28]
00a67a04	mov x19,x2
00a67a08	mov x21,x0
00a67a0c	mov x20,x1
00a67a10	add x29,sp,#0x20
00a67a14	cbz x22,0x00a67a80
00a67a18	ldr w8,[x22]
00a67a1c	cmp w8,#0x80
00a67a20	b.ne 0x00a67a54
00a67a24	ldr x0,[x22, #0x30]
00a67a28	cbz x0,0x00a67a54
00a67a2c	ldr x8,[x22, #0x28]
00a67a30	cbz x8,0x00a67a54
00a67a34	ldr x3,[x8, #0x70]
00a67a38	cbz x3,0x00a67a9c
00a67a3c	mov x1,x20
00a67a40	mov x2,x19
00a67a44	ldp x29,x30,[sp, #0x20]
00a67a48	ldp x20,x19,[sp, #0x10]
00a67a4c	ldp x22,x21,[sp], #0x30
00a67a50	br x3
00a67a54	ldrb w8,[x22, #0xa0]
00a67a58	tbz w8,#0x0,0x00a67a78
00a67a5c	ldr x8,[x22, #0x78]
00a67a60	mov x0,x22
00a67a64	mov x1,x21
00a67a68	ldr x8,[x8, #0xf8]
00a67a6c	blr x8
00a67a70	cbz w0,0x00a67acc
00a67a74	ldrb w8,[x22, #0xa0]
00a67a78	and w8,w8,#0xfe
00a67a7c	strb w8,[x22, #0xa0]
00a67a80	mov x1,x20
00a67a84	mov x2,x19
00a67a88	ldp x29,x30,[sp, #0x20]
00a67a8c	ldp x20,x19,[sp, #0x10]
00a67a90	mov x0,x21
00a67a94	ldp x22,x21,[sp], #0x30
00a67a98	b 0x00c31f80
00a67a9c	bl 0x00c342a0
00a67aa0	adrp x0,0x2c3000
00a67aa4	adrp x2,0x2b5000
00a67aa8	add x0,x0,#0xa2d
00a67aac	add x2,x2,#0xc89
00a67ab0	mov w1,#0x1a2
00a67ab4	bl 0x00c342b0
00a67ab8	mov w1,#0x101
00a67abc	orr w0,wzr,#0x6
00a67ac0	movk w1,#0xc, LSL #16
00a67ac4	mov x2,xzr
00a67ac8	bl 0x00c342c0
00a67acc	ldp x29,x30,[sp, #0x20]
00a67ad0	ldp x20,x19,[sp, #0x10]
00a67ad4	mov w0,wzr
00a67ad8	ldp x22,x21,[sp], #0x30
00a67adc	ret
