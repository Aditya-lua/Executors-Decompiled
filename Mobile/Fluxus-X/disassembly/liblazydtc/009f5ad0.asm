; ossl_i2c_ASN1_BIT_STRING @ 009f5ad0
009f5ad0	str x23,[sp, #-0x40]!
009f5ad4	stp x22,x21,[sp, #0x10]
009f5ad8	stp x20,x19,[sp, #0x20]
009f5adc	stp x29,x30,[sp, #0x30]
009f5ae0	add x29,sp,#0x30
009f5ae4	cbz x0,0x009f5b68
009f5ae8	ldr w8,[x0]
009f5aec	mov x19,x1
009f5af0	cmp w8,#0x1
009f5af4	b.lt 0x009f5b70
009f5af8	ldr x9,[x0, #0x10]
009f5afc	tbnz w9,#0x3,0x009f5b80
009f5b00	ldr x9,[x0, #0x8]
009f5b04	sxtw x11,w8
009f5b08	orr x10,xzr,#-0x100000000
009f5b0c	add x13,x10,x11, LSL #0x20
009f5b10	mov x8,x11
009f5b14	subs x11,x11,#0x1
009f5b18	mov x12,x13
009f5b1c	b.lt 0x009f5b30
009f5b20	add x13,x9,x8
009f5b24	ldurb w14,[x13, #-0x1]
009f5b28	add x13,x12,x10
009f5b2c	cbz w14,0x009f5b10
009f5b30	asr x10,x12,#0x20
009f5b34	ldrb w9,[x9, x10]
009f5b38	tbnz w9,#0x0,0x009f5b70
009f5b3c	tbnz w9,#0x1,0x009f5b90
009f5b40	tbnz w9,#0x2,0x009f5ba0
009f5b44	tbnz w9,#0x3,0x009f5bb0
009f5b48	tbnz w9,#0x4,0x009f5bc0
009f5b4c	tbnz w9,#0x5,0x009f5bd0
009f5b50	tbnz w9,#0x6,0x009f5be0
009f5b54	sbfx w9,w9,#0x7,#0x1
009f5b58	and w23,w9,#0x7
009f5b5c	add w20,w8,#0x1
009f5b60	cbnz x19,0x009f5bec
009f5b64	b 0x009f5c2c
009f5b68	mov w20,wzr
009f5b6c	b 0x009f5c2c
009f5b70	mov w23,wzr
009f5b74	add w20,w8,#0x1
009f5b78	cbnz x19,0x009f5bec
009f5b7c	b 0x009f5c2c
009f5b80	and w23,w9,#0x7
009f5b84	add w20,w8,#0x1
009f5b88	cbnz x19,0x009f5bec
009f5b8c	b 0x009f5c2c
009f5b90	mov w23,#0x1
009f5b94	add w20,w8,#0x1
009f5b98	cbnz x19,0x009f5bec
009f5b9c	b 0x009f5c2c
009f5ba0	mov w23,#0x2
009f5ba4	add w20,w8,#0x1
009f5ba8	cbnz x19,0x009f5bec
009f5bac	b 0x009f5c2c
009f5bb0	orr w23,wzr,#0x3
009f5bb4	add w20,w8,#0x1
009f5bb8	cbnz x19,0x009f5bec
009f5bbc	b 0x009f5c2c
009f5bc0	mov w23,#0x4
009f5bc4	add w20,w8,#0x1
009f5bc8	cbnz x19,0x009f5bec
009f5bcc	b 0x009f5c2c
009f5bd0	mov w23,#0x5
009f5bd4	add w20,w8,#0x1
009f5bd8	cbnz x19,0x009f5bec
009f5bdc	b 0x009f5c2c
009f5be0	orr w23,wzr,#0x6
009f5be4	add w20,w8,#0x1
009f5be8	cbz x19,0x009f5c2c
009f5bec	ldr x21,[x19]
009f5bf0	cmp w8,#0x1
009f5bf4	strb w23,[x21], #0x1
009f5bf8	b.lt 0x009f5c28
009f5bfc	ldr x1,[x0, #0x8]
009f5c00	sxtw x22,w8
009f5c04	mov x0,x21
009f5c08	mov x2,x22
009f5c0c	bl 0x00c2ffd0
009f5c10	add x21,x21,x22
009f5c14	ldurb w8,[x21, #-0x1]
009f5c18	orr w9,wzr,#0xff
009f5c1c	lsl w9,w9,w23
009f5c20	and w8,w8,w9
009f5c24	sturb w8,[x21, #-0x1]
009f5c28	str x21,[x19]
009f5c2c	mov w0,w20
009f5c30	ldp x29,x30,[sp, #0x30]
009f5c34	ldp x20,x19,[sp, #0x20]
009f5c38	ldp x22,x21,[sp, #0x10]
009f5c3c	ldr x23,[sp], #0x40
009f5c40	ret
