; mbedtls_md_setup @ 00b78a30
00b78a30	stp x22,x21,[sp, #-0x30]!
00b78a34	stp x20,x19,[sp, #0x10]
00b78a38	stp x29,x30,[sp, #0x20]
00b78a3c	add x29,sp,#0x20
00b78a40	mov w21,w2
00b78a44	mov x20,x1
00b78a48	mov x19,x0
00b78a4c	mov w0,#0xffffaf00
00b78a50	cbz x19,0x00b78b7c
00b78a54	cbz x20,0x00b78b7c
00b78a58	mov x22,x19
00b78a5c	str x20,[x19]
00b78a60	str xzr,[x22, #0x8]!
00b78a64	str xzr,[x19, #0x10]
00b78a68	ldr w8,[x20]
00b78a6c	mov w0,#0xffffaf00
00b78a70	sub w8,w8,#0x3
00b78a74	cmp w8,#0x10
00b78a78	b.hi 0x00b78b7c
00b78a7c	adrp x9,0x77f000
00b78a80	add x9,x9,#0xab8
00b78a84	ldrsw x8,[x9, x8, LSL #0x2]
00b78a88	add x8,x8,x9
00b78a8c	br x8
00b78a90	mov w0,#0x1
00b78a94	mov w1,#0xd0
00b78a98	bl 0x00c30a30
00b78a9c	str x0,[x22]
00b78aa0	cbz x0,0x00b78b78
00b78aa4	bl 0x00c42b10
00b78aa8	cbz w21,0x00b78af0
00b78aac	ldrb w1,[x20, #0x5]
00b78ab0	mov w0,#0x2
00b78ab4	bl 0x00c30a30
00b78ab8	mov x8,x0
00b78abc	mov w0,wzr
00b78ac0	str x8,[x19, #0x10]
00b78ac4	cbnz x8,0x00b78b7c
00b78ac8	mov x0,x19
00b78acc	bl 0x00c42830
00b78ad0	b 0x00b78b78
00b78ad4	mov w0,#0x1
00b78ad8	mov w1,#0x6c
00b78adc	bl 0x00c30a30
00b78ae0	str x0,[x22]
00b78ae4	cbz x0,0x00b78b78
00b78ae8	bl 0x00c42ab0
00b78aec	cbnz w21,0x00b78aac
00b78af0	mov w0,wzr
00b78af4	b 0x00b78b7c
00b78af8	mov w0,#0x1
00b78afc	mov w1,#0xd8
00b78b00	bl 0x00c30a30
00b78b04	str x0,[x22]
00b78b08	cbz x0,0x00b78b78
00b78b0c	bl 0x00c42b80
00b78b10	cbnz w21,0x00b78aac
00b78b14	b 0x00b78af0
00b78b18	mov w0,#0x1
00b78b1c	mov w1,#0x58
00b78b20	bl 0x00c30a30
00b78b24	str x0,[x22]
00b78b28	cbz x0,0x00b78b78
00b78b2c	bl 0x00c42920
00b78b30	cbnz w21,0x00b78aac
00b78b34	b 0x00b78af0
00b78b38	mov w0,#0x1
00b78b3c	mov w1,#0x5c
00b78b40	bl 0x00c30a30
00b78b44	str x0,[x22]
00b78b48	cbz x0,0x00b78b78
00b78b4c	bl 0x00c429d0
00b78b50	cbnz w21,0x00b78aac
00b78b54	b 0x00b78af0
00b78b58	mov w0,#0x1
00b78b5c	mov w1,#0x5c
00b78b60	bl 0x00c30a30
00b78b64	str x0,[x22]
00b78b68	cbz x0,0x00b78b78
00b78b6c	bl 0x00c42a40
00b78b70	cbnz w21,0x00b78aac
00b78b74	b 0x00b78af0
00b78b78	mov w0,#0xffffae80
00b78b7c	ldp x29,x30,[sp, #0x20]
00b78b80	ldp x20,x19,[sp, #0x10]
00b78b84	ldp x22,x21,[sp], #0x30
00b78b88	ret
