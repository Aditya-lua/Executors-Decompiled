; FUN_00a60a68 @ 00a60a68
00a60a68	sub sp,sp,#0xa0
00a60a6c	stp x26,x25,[sp, #0x50]
00a60a70	stp x24,x23,[sp, #0x60]
00a60a74	stp x22,x21,[sp, #0x70]
00a60a78	stp x20,x19,[sp, #0x80]
00a60a7c	stp x29,x30,[sp, #0x90]
00a60a80	mov x22,x0
00a60a84	ldr x0,[x0]
00a60a88	mov x21,x2
00a60a8c	adrp x2,0xc5d000
00a60a90	mov w20,w1
00a60a94	add x2,x2,#0x818
00a60a98	mov w1,#0xa
00a60a9c	add x29,sp,#0x90
00a60aa0	mov x19,x3
00a60aa4	bl 0x00c3b520
00a60aa8	ldr x8,[x22]
00a60aac	mov x24,x0
00a60ab0	mov x0,x8
00a60ab4	bl 0x00c3b650
00a60ab8	adrp x8,0x2ab000
00a60abc	add x8,x8,#0x32c
00a60ac0	cmp x19,#0x0
00a60ac4	csel x25,x8,x19,eq
00a60ac8	str xzr,[sp, #0x48]
00a60acc	cbz x24,0x00a60b0c
00a60ad0	mov x23,x0
00a60ad4	cbz x0,0x00a60b0c
00a60ad8	cbz w20,0x00a60b5c
00a60adc	cbz x21,0x00a60b5c
00a60ae0	bl 0x00c342a0
00a60ae4	adrp x0,0x2d3000
00a60ae8	adrp x2,0x2bb000
00a60aec	add x0,x0,#0xb3c
00a60af0	add x2,x2,#0xc87
00a60af4	mov w1,#0x187
00a60af8	bl 0x00c342b0
00a60afc	mov w1,#0x103
00a60b00	mov w0,#0x3b
00a60b04	movk w1,#0xc, LSL #16
00a60b08	b 0x00a60b34
00a60b0c	bl 0x00c342a0
00a60b10	adrp x0,0x2d3000
00a60b14	adrp x2,0x2bb000
00a60b18	add x0,x0,#0xb3c
00a60b1c	add x2,x2,#0xc87
00a60b20	mov w1,#0x17e
00a60b24	bl 0x00c342b0
00a60b28	mov w1,#0x106
00a60b2c	mov w0,#0x3b
00a60b30	movk w1,#0x8, LSL #16
00a60b34	mov x2,xzr
00a60b38	bl 0x00c342c0
00a60b3c	mov x0,xzr
00a60b40	ldp x29,x30,[sp, #0x90]
00a60b44	ldp x20,x19,[sp, #0x80]
00a60b48	ldp x22,x21,[sp, #0x70]
00a60b4c	ldp x24,x23,[sp, #0x60]
00a60b50	ldp x26,x25,[sp, #0x50]
00a60b54	add sp,sp,#0xa0
00a60b58	ret
00a60b5c	cbnz w20,0x00a60b74
00a60b60	mov x0,x23
00a60b64	mov x1,x21
00a60b68	bl 0x00c3b620
00a60b6c	mov w20,w0
00a60b70	cbz w0,0x00a60ba0
00a60b74	add x4,sp,#0x48
00a60b78	mov x0,x24
00a60b7c	mov x1,xzr
00a60b80	mov w2,w20
00a60b84	mov x3,x25
00a60b88	bl 0x00c3b580
00a60b8c	cbz w0,0x00a60b98
00a60b90	mov w8,wzr
00a60b94	b 0x00a60c4c
00a60b98	mov w26,wzr
00a60b9c	b 0x00a60ba4
00a60ba0	mov w26,#0x1
00a60ba4	adrp x8,0xc5d000
00a60ba8	add x8,x8,#0x7e0
00a60bac	ldp q1,q0,[x8, #0x10]
00a60bb0	ldr q2,[x8]
00a60bb4	ldr x8,[x8, #0x30]
00a60bb8	str xzr,[sp, #0x8]
00a60bbc	stp q1,q0,[sp, #0x20]
00a60bc0	str q2,[sp, #0x10]
00a60bc4	str x8,[sp, #0x40]
00a60bc8	ldrb w8,[x22, #0x28]
00a60bcc	ldr x0,[x22]
00a60bd0	mov w1,#0x14
00a60bd4	add x2,sp,#0x8
00a60bd8	and w8,w8,#0xfe
00a60bdc	add x4,sp,#0x10
00a60be0	mov w3,wzr
00a60be4	mov x5,x22
00a60be8	str w20,[x22, #0x8]
00a60bec	stp x21,x25,[x22, #0x10]
00a60bf0	strb w8,[x22, #0x28]
00a60bf4	bl 0x00c3b540
00a60bf8	str x0,[sp, #0x48]
00a60bfc	cbz x0,0x00a60c40
00a60c00	mov x4,x0
00a60c04	cbz w26,0x00a60c1c
00a60c08	mov x0,x23
00a60c0c	mov x1,x21
00a60c10	bl 0x00c3b620
00a60c14	ldr x4,[sp, #0x48]
00a60c18	mov w20,w0
00a60c1c	ldr x1,[sp, #0x8]
00a60c20	adrp x5,0xa61000
00a60c24	adrp x6,0xa61000
00a60c28	add x5,x5,#0x998
00a60c2c	add x6,x6,#0x9b4
00a60c30	mov x0,x24
00a60c34	mov w2,w20
00a60c38	mov x3,x25
00a60c3c	bl 0x00c3b590
00a60c40	ldrb w8,[x22, #0x28]
00a60c44	mvn w8,w8
00a60c48	and w8,w8,#0x1
00a60c4c	ldr x0,[sp, #0x48]
00a60c50	cmp w20,#0x0
00a60c54	ccmp x21,#0x0,#0x0,eq
00a60c58	b.eq 0x00a60b40
00a60c5c	cbnz x0,0x00a60b40
00a60c60	mov w9,#0x106
00a60c64	movk w9,#0x8, LSL #16
00a60c68	add w10,w9,#0x6
00a60c6c	add w9,w9,#0x7
00a60c70	cmp w8,#0x0
00a60c74	csel w24,w9,w10,eq
00a60c78	cbnz x21,0x00a60c90
00a60c7c	mov x0,x23
00a60c80	mov w1,w20
00a60c84	mov x2,xzr
00a60c88	bl 0x00c3b640
00a60c8c	mov x21,x0
00a60c90	bl 0x00c342a0
00a60c94	adrp x0,0x2d3000
00a60c98	adrp x2,0x2bb000
00a60c9c	add x0,x0,#0xb3c
00a60ca0	add x2,x2,#0xc87
00a60ca4	mov w1,#0x1c1
00a60ca8	bl 0x00c342b0
00a60cac	ldr x0,[x22]
00a60cb0	bl 0x00c3b530
00a60cb4	adrp x8,0x2cb000
00a60cb8	add x8,x8,#0x889
00a60cbc	cmp x21,#0x0
00a60cc0	csel x4,x8,x21,eq
00a60cc4	cmp x19,#0x0
00a60cc8	adrp x2,0x2a7000
00a60ccc	mov x3,x0
00a60cd0	csel x6,x8,x19,eq
00a60cd4	add x2,x2,#0xeca
00a60cd8	mov w0,#0x3b
00a60cdc	mov w1,w24
00a60ce0	mov w5,w20
00a60ce4	bl 0x00c342c0
00a60ce8	ldr x0,[sp, #0x48]
00a60cec	b 0x00a60b40
