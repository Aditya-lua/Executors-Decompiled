; mbedtls_internal_aes_decrypt @ 00b6ea38
00b6ea38	sub sp,sp,#0x50
00b6ea3c	str x19,[sp, #0x30]
00b6ea40	stp x29,x30,[sp, #0x40]
00b6ea44	add x29,sp,#0x40
00b6ea48	mrs x19,tpidr_el0
00b6ea4c	ldr x8,[x19, #0x28]
00b6ea50	adrp x9,0xd23000
00b6ea54	adrp x11,0xd23000
00b6ea58	adrp x12,0xd24000
00b6ea5c	stur x8,[x29, #-0x18]
00b6ea60	ldr x8,[x0, #0x8]
00b6ea64	ldr d0,[x1]
00b6ea68	adrp x14,0xd24000
00b6ea6c	add x9,x9,#0xa08
00b6ea70	add x8,x0,x8, LSL #0x2
00b6ea74	ldp d1,d2,[x8, #0x10]
00b6ea78	add x11,x11,#0xe08
00b6ea7c	add x12,x12,#0x208
00b6ea80	add x8,x8,#0x3c
00b6ea84	eor v0.8B,v1.8B,v0.8B
00b6ea88	ldr d1,[x1, #0x8]
00b6ea8c	fmov w17,s0
00b6ea90	add x14,x14,#0x608
00b6ea94	eor v1.8B,v2.8B,v1.8B
00b6ea98	stp d0,d1,[sp, #0x8]
00b6ea9c	ldr w10,[x0]
00b6eaa0	mov w0,v0.S[0x1]
00b6eaa4	mov w18,v1.S[0x1]
00b6eaa8	fmov w16,s1
00b6eaac	asr w13,w10,#0x1
00b6eab0	b 0x00b6eb90
00b6eab4	ldr w0,[x9, x0, LSL #0x2]
00b6eab8	ubfx w1,w18,#0x8,#0x8
00b6eabc	ubfx w3,w16,#0x10,#0x8
00b6eac0	ldr w1,[x11, w1, UXTW #0x2]
00b6eac4	lsr w4,w15,#0x18
00b6eac8	ldr w3,[x12, w3, UXTW #0x2]
00b6eacc	ldr w4,[x14, w4, UXTW #0x2]
00b6ead0	eor w17,w0,w17
00b6ead4	eor w17,w17,w1
00b6ead8	eor w17,w17,w3
00b6eadc	eor w17,w17,w4
00b6eae0	and w5,w15,#0xff
00b6eae4	str w17,[sp, #0x8]
00b6eae8	ubfx w0,w10,#0x8,#0x8
00b6eaec	ldr w5,[x9, w5, UXTW #0x2]
00b6eaf0	ldur w1,[x8, #-0x8]
00b6eaf4	ubfx w3,w18,#0x10,#0x8
00b6eaf8	ldr w0,[x11, w0, UXTW #0x2]
00b6eafc	lsr w4,w16,#0x18
00b6eb00	ldr w3,[x12, w3, UXTW #0x2]
00b6eb04	ldr w4,[x14, w4, UXTW #0x2]
00b6eb08	eor w1,w5,w1
00b6eb0c	eor w0,w1,w0
00b6eb10	eor w0,w0,w3
00b6eb14	eor w0,w0,w4
00b6eb18	and w5,w16,#0xff
00b6eb1c	str w0,[sp, #0xc]
00b6eb20	ubfx w1,w15,#0x8,#0x8
00b6eb24	ldr w5,[x9, w5, UXTW #0x2]
00b6eb28	ldur w3,[x8, #-0x4]
00b6eb2c	ldr w1,[x11, w1, UXTW #0x2]
00b6eb30	ubfx w4,w10,#0x10,#0x8
00b6eb34	ldr w4,[x12, w4, UXTW #0x2]
00b6eb38	eor w3,w5,w3
00b6eb3c	eor w1,w3,w1
00b6eb40	lsr w3,w18,#0x18
00b6eb44	eor w1,w1,w4
00b6eb48	ubfx w4,w16,#0x8,#0x8
00b6eb4c	ldr w16,[x14, w3, UXTW #0x2]
00b6eb50	and w18,w18,#0xff
00b6eb54	ldr w18,[x9, w18, UXTW #0x2]
00b6eb58	ubfx w15,w15,#0x10,#0x8
00b6eb5c	eor w16,w1,w16
00b6eb60	str w16,[sp, #0x10]
00b6eb64	ldr w1,[x8], #0x20
00b6eb68	ldr w3,[x11, w4, UXTW #0x2]
00b6eb6c	lsr w10,w10,#0x18
00b6eb70	ldr w15,[x12, w15, UXTW #0x2]
00b6eb74	ldr w10,[x14, w10, UXTW #0x2]
00b6eb78	eor w18,w18,w1
00b6eb7c	eor w18,w18,w3
00b6eb80	eor w15,w18,w15
00b6eb84	eor w18,w15,w10
00b6eb88	sub w13,w13,#0x1
00b6eb8c	str w18,[sp, #0x14]
00b6eb90	and w15,w17,#0xff
00b6eb94	ldur w10,[x8, #-0x1c]
00b6eb98	ubfx w1,w18,#0x8,#0x8
00b6eb9c	ldr w15,[x9, w15, UXTW #0x2]
00b6eba0	ubfx w3,w16,#0x10,#0x8
00b6eba4	ldr w1,[x11, w1, UXTW #0x2]
00b6eba8	lsr w4,w0,#0x18
00b6ebac	ldr w3,[x12, w3, UXTW #0x2]
00b6ebb0	ldr w4,[x14, w4, UXTW #0x2]
00b6ebb4	eor w10,w15,w10
00b6ebb8	eor w10,w10,w1
00b6ebbc	eor w10,w10,w3
00b6ebc0	eor w10,w10,w4
00b6ebc4	and w5,w0,#0xff
00b6ebc8	str w10,[sp, #0x18]
00b6ebcc	ubfx w15,w17,#0x8,#0x8
00b6ebd0	ldr w5,[x9, w5, UXTW #0x2]
00b6ebd4	ldur w1,[x8, #-0x18]
00b6ebd8	ubfx w3,w18,#0x10,#0x8
00b6ebdc	ldr w15,[x11, w15, UXTW #0x2]
00b6ebe0	lsr w4,w16,#0x18
00b6ebe4	ldr w3,[x12, w3, UXTW #0x2]
00b6ebe8	ldr w4,[x14, w4, UXTW #0x2]
00b6ebec	eor w1,w5,w1
00b6ebf0	eor w15,w1,w15
00b6ebf4	eor w15,w15,w3
00b6ebf8	eor w15,w15,w4
00b6ebfc	and w5,w16,#0xff
00b6ec00	str w15,[sp, #0x1c]
00b6ec04	ubfx w1,w0,#0x8,#0x8
00b6ec08	ldr w5,[x9, w5, UXTW #0x2]
00b6ec0c	ldur w4,[x8, #-0x14]
00b6ec10	ubfx w3,w17,#0x10,#0x8
00b6ec14	ldr w1,[x11, w1, UXTW #0x2]
00b6ec18	ldr w3,[x12, w3, UXTW #0x2]
00b6ec1c	eor w4,w5,w4
00b6ec20	ubfx w16,w16,#0x8,#0x8
00b6ec24	eor w1,w4,w1
00b6ec28	eor w1,w1,w3
00b6ec2c	lsr w3,w18,#0x18
00b6ec30	ldr w3,[x14, w3, UXTW #0x2]
00b6ec34	ldr w4,[x11, w16, UXTW #0x2]
00b6ec38	and w18,w18,#0xff
00b6ec3c	ldr w18,[x9, w18, UXTW #0x2]
00b6ec40	eor w16,w1,w3
00b6ec44	str w16,[sp, #0x20]
00b6ec48	ldur w1,[x8, #-0x10]
00b6ec4c	ubfx w0,w0,#0x10,#0x8
00b6ec50	ldr w0,[x12, w0, UXTW #0x2]
00b6ec54	lsr w17,w17,#0x18
00b6ec58	ldr w17,[x14, w17, UXTW #0x2]
00b6ec5c	eor w18,w18,w1
00b6ec60	eor w18,w18,w4
00b6ec64	eor w18,w18,w0
00b6ec68	eor w18,w18,w17
00b6ec6c	str w18,[sp, #0x24]
00b6ec70	ldur w17,[x8, #-0xc]
00b6ec74	cmp w13,#0x2
00b6ec78	and w0,w10,#0xff
00b6ec7c	b.ge 0x00b6eab4
00b6ec80	adrp x9,0xd25000
00b6ec84	add x9,x9,#0xa08
00b6ec88	ubfx w11,w18,#0x8,#0x8
00b6ec8c	ldrb w12,[x9, x0]
00b6ec90	ubfx w13,w16,#0x10,#0x8
00b6ec94	ldrb w11,[x9, w11, UXTW ]
00b6ec98	lsr w14,w15,#0x18
00b6ec9c	ldrb w13,[x9, w13, UXTW ]
00b6eca0	ldrb w14,[x9, w14, UXTW ]
00b6eca4	eor w12,w17,w12
00b6eca8	eor w11,w12,w11, LSL #0x8
00b6ecac	eor w11,w11,w13, LSL #0x10
00b6ecb0	eor w11,w11,w14, LSL #0x18
00b6ecb4	and w0,w15,#0xff
00b6ecb8	str w11,[sp, #0x8]
00b6ecbc	ubfx w17,w10,#0x8,#0x8
00b6ecc0	ldrb w0,[x9, w0, UXTW ]
00b6ecc4	ldur w12,[x8, #-0x8]
00b6ecc8	ubfx w13,w18,#0x10,#0x8
00b6eccc	ldrb w17,[x9, w17, UXTW ]
00b6ecd0	lsr w14,w16,#0x18
00b6ecd4	ldrb w13,[x9, w13, UXTW ]
00b6ecd8	ldrb w14,[x9, w14, UXTW ]
00b6ecdc	eor w12,w12,w0
00b6ece0	eor w12,w12,w17, LSL #0x8
00b6ece4	eor w12,w12,w13, LSL #0x10
00b6ece8	eor w12,w12,w14, LSL #0x18
00b6ecec	and w0,w16,#0xff
00b6ecf0	str w12,[sp, #0xc]
00b6ecf4	ubfx w17,w15,#0x8,#0x8
00b6ecf8	ldrb w0,[x9, w0, UXTW ]
00b6ecfc	ldur w14,[x8, #-0x4]
00b6ed00	ubfx w13,w10,#0x10,#0x8
00b6ed04	ldrb w17,[x9, w17, UXTW ]
00b6ed08	ldrb w13,[x9, w13, UXTW ]
00b6ed0c	eor w14,w14,w0
00b6ed10	ubfx w16,w16,#0x8,#0x8
00b6ed14	eor w14,w14,w17, LSL #0x8
00b6ed18	eor w13,w14,w13, LSL #0x10
00b6ed1c	lsr w14,w18,#0x18
00b6ed20	ldrb w14,[x9, w14, UXTW ]
00b6ed24	and w17,w18,#0xff
00b6ed28	ldrb w17,[x9, w17, UXTW ]
00b6ed2c	ubfx w15,w15,#0x10,#0x8
00b6ed30	eor w13,w13,w14, LSL #0x18
00b6ed34	str w13,[sp, #0x10]
00b6ed38	ldr w8,[x8]
00b6ed3c	ldrb w14,[x9, w16, UXTW ]
00b6ed40	lsr w10,w10,#0x18
00b6ed44	ldrb w15,[x9, w15, UXTW ]
00b6ed48	ldrb w9,[x9, w10, UXTW ]
00b6ed4c	eor w8,w8,w17
00b6ed50	eor w8,w8,w14, LSL #0x8
00b6ed54	eor w8,w8,w15, LSL #0x10
00b6ed58	eor w8,w8,w9, LSL #0x18
00b6ed5c	add x0,sp,#0x8
00b6ed60	mov w1,#0x20
00b6ed64	str w8,[sp, #0x14]
00b6ed68	stp w11,w12,[x2]
00b6ed6c	stp w13,w8,[x2, #0x8]
00b6ed70	bl 0x00c42220
00b6ed74	ldr x8,[x19, #0x28]
00b6ed78	ldur x9,[x29, #-0x18]
00b6ed7c	cmp x8,x9
00b6ed80	b.ne 0x00b6ed98
00b6ed84	ldp x29,x30,[sp, #0x40]
00b6ed88	ldr x19,[sp, #0x30]
00b6ed8c	mov w0,wzr
00b6ed90	add sp,sp,#0x50
00b6ed94	ret
00b6ed98	bl 0x00c2fec0
