; CMAC_Init @ 00b53ab8
00b53ab8	stp x22,x21,[sp, #-0x30]!
00b53abc	stp x20,x19,[sp, #0x10]
00b53ac0	mov x21,x2
00b53ac4	mov x20,x1
00b53ac8	mov x19,x0
00b53acc	stp x29,x30,[sp, #0x20]
00b53ad0	add x29,sp,#0x20
00b53ad4	cbnz x2,0x00b53b34
00b53ad8	cbnz x20,0x00b53b34
00b53adc	cbnz x3,0x00b53b34
00b53ae0	cbnz x4,0x00b53b34
00b53ae4	ldr w8,[x19, #0x88]
00b53ae8	cmn w8,#0x1
00b53aec	b.eq 0x00b53c44
00b53af0	ldr x0,[x19]
00b53af4	adrp x4,0x77c000
00b53af8	add x4,x4,#0x208
00b53afc	mov x1,xzr
00b53b00	mov x2,xzr
00b53b04	mov x3,xzr
00b53b08	bl 0x00c37300
00b53b0c	cbz w0,0x00b53d0c
00b53b10	ldr x0,[x19]
00b53b14	add x20,x19,#0x48
00b53b18	bl 0x00c36d40
00b53b1c	sxtw x2,w0
00b53b20	mov x0,x20
00b53b24	mov w1,wzr
00b53b28	bl 0x00c301c0
00b53b2c	str wzr,[x19, #0x88]
00b53b30	b 0x00b53d08
00b53b34	cbz x3,0x00b53b74
00b53b38	mov w8,#0xffffffff
00b53b3c	mov x22,x19
00b53b40	str w8,[x22, #0x88]!
00b53b44	ldr x0,[x19]
00b53b48	mov x1,x3
00b53b4c	mov x2,x4
00b53b50	mov x3,xzr
00b53b54	mov x4,xzr
00b53b58	bl 0x00c37300
00b53b5c	cmp w0,#0x0
00b53b60	mov w8,w0
00b53b64	cset w0,ne
00b53b68	cbz w8,0x00b53d0c
00b53b6c	cbnz x20,0x00b53b7c
00b53b70	b 0x00b53d0c
00b53b74	cbz x20,0x00b53d08
00b53b78	add x22,x19,#0x88
00b53b7c	mov w8,#0xffffffff
00b53b80	str w8,[x22]
00b53b84	ldr x0,[x19]
00b53b88	bl 0x00c34b80
00b53b8c	cbz x0,0x00b53d0c
00b53b90	ldr x0,[x19]
00b53b94	mov w1,w21
00b53b98	bl 0x00c3ccc0
00b53b9c	cmp w0,#0x1
00b53ba0	b.lt 0x00b53c44
00b53ba4	ldr x0,[x19]
00b53ba8	adrp x4,0x77c000
00b53bac	add x4,x4,#0x208
00b53bb0	mov x1,xzr
00b53bb4	mov x2,xzr
00b53bb8	mov x3,x20
00b53bbc	bl 0x00c37300
00b53bc0	cbz w0,0x00b53d0c
00b53bc4	ldr x0,[x19]
00b53bc8	bl 0x00c36d40
00b53bcc	mov w21,w0
00b53bd0	tbnz w0,#0x1f,0x00b53c44
00b53bd4	mov x20,x19
00b53bd8	ldr x0,[x20], #0x48
00b53bdc	adrp x2,0x77c000
00b53be0	add x2,x2,#0x208
00b53be4	mov w3,w21
00b53be8	mov x1,x20
00b53bec	bl 0x00c36d60
00b53bf0	cmp w0,#0x1
00b53bf4	b.lt 0x00b53c44
00b53bf8	ldrb w10,[x19, #0x48]
00b53bfc	add x8,x19,#0x8
00b53c00	cmp w21,#0x2
00b53c04	lsr w9,w10,#0x7
00b53c08	lsl w10,w10,#0x1
00b53c0c	b.lt 0x00b53c4c
00b53c10	sub w11,w21,#0x1
00b53c14	add x12,x19,#0x49
00b53c18	mov x13,x11
00b53c1c	ldrb w14,[x12]
00b53c20	subs x13,x13,#0x1
00b53c24	orr w15,w10,w14, LSR #0x7
00b53c28	lsl w10,w14,#0x1
00b53c2c	sturb w15,[x12, #-0x41]
00b53c30	add x12,x12,#0x1
00b53c34	b.ne 0x00b53c1c
00b53c38	add x11,x19,x11
00b53c3c	add x11,x11,#0x8
00b53c40	b 0x00b53c50
00b53c44	mov w0,wzr
00b53c48	b 0x00b53d0c
00b53c4c	mov x11,x8
00b53c50	neg w12,w9
00b53c54	cmp w21,#0x10
00b53c58	mov w9,#0x1b
00b53c5c	mov w13,#0x87
00b53c60	csel w9,w13,w9,eq
00b53c64	and w12,w9,w12
00b53c68	eor w10,w10,w12
00b53c6c	strb w10,[x11]
00b53c70	ldrb w8,[x8]
00b53c74	cmp w21,#0x2
00b53c78	lsr w10,w8,#0x7
00b53c7c	lsl w8,w8,#0x1
00b53c80	b.lt 0x00b53cac
00b53c84	sub w11,w21,#0x1
00b53c88	add x12,x19,#0x28
00b53c8c	mov x13,x11
00b53c90	ldurb w14,[x12, #-0x1f]
00b53c94	subs x13,x13,#0x1
00b53c98	orr w15,w8,w14, LSR #0x7
00b53c9c	lsl w8,w14,#0x1
00b53ca0	strb w15,[x12], #0x1
00b53ca4	b.ne 0x00b53c90
00b53ca8	b 0x00b53cb0
00b53cac	mov x11,xzr
00b53cb0	neg w10,w10
00b53cb4	and w9,w9,w10
00b53cb8	sxtw x21,w21
00b53cbc	add x11,x19,x11
00b53cc0	eor w8,w8,w9
00b53cc4	mov x0,x20
00b53cc8	mov x1,x21
00b53ccc	strb w8,[x11, #0x28]
00b53cd0	bl 0x00c34750
00b53cd4	ldr x0,[x19]
00b53cd8	adrp x4,0x77c000
00b53cdc	add x4,x4,#0x208
00b53ce0	mov x1,xzr
00b53ce4	mov x2,xzr
00b53ce8	mov x3,xzr
00b53cec	bl 0x00c37300
00b53cf0	cbz w0,0x00b53d0c
00b53cf4	mov x0,x20
00b53cf8	mov w1,wzr
00b53cfc	mov x2,x21
00b53d00	bl 0x00c301c0
00b53d04	str wzr,[x22]
00b53d08	mov w0,#0x1
00b53d0c	ldp x29,x30,[sp, #0x20]
00b53d10	ldp x20,x19,[sp, #0x10]
00b53d14	ldp x22,x21,[sp], #0x30
00b53d18	ret
