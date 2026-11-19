; ssl_update_cache @ 009b6ac4
009b6ac4	stp x22,x21,[sp, #-0x30]!
009b6ac8	stp x20,x19,[sp, #0x10]
009b6acc	stp x29,x30,[sp, #0x20]
009b6ad0	ldr x8,[x0, #0x918]
009b6ad4	add x29,sp,#0x20
009b6ad8	ldr x9,[x8, #0x250]
009b6adc	cbz x9,0x009b6ae8
009b6ae0	ldr w9,[x8, #0x2b0]
009b6ae4	cbz w9,0x009b6af8
009b6ae8	ldp x29,x30,[sp, #0x20]
009b6aec	ldp x20,x19,[sp, #0x10]
009b6af0	ldp x22,x21,[sp], #0x30
009b6af4	ret
009b6af8	ldr w9,[x0, #0x38]
009b6afc	mov x19,x0
009b6b00	mov w20,w1
009b6b04	cbz w9,0x009b6b18
009b6b08	ldr x10,[x8, #0x278]
009b6b0c	cbnz x10,0x009b6b18
009b6b10	ldrb w10,[x19, #0x968]
009b6b14	tbnz w10,#0x0,0x009b6ae8
009b6b18	ldr x0,[x19, #0xb88]
009b6b1c	ldr w22,[x0, #0x50]
009b6b20	ands w21,w22,w20
009b6b24	b.eq 0x009b6bdc
009b6b28	ldr w10,[x19, #0x4d0]
009b6b2c	cbz w10,0x009b6b54
009b6b30	ldr x10,[x19, #0x8]
009b6b34	ldr x11,[x10, #0xc0]
009b6b38	ldrb w11,[x11, #0x60]
009b6b3c	tbnz w11,#0x3,0x009b6bdc
009b6b40	ldr w10,[x10]
009b6b44	cmp w10,#0x304
009b6b48	b.lt 0x009b6bdc
009b6b4c	cmp w10,#0x10, LSL #12
009b6b50	b.eq 0x009b6bdc
009b6b54	tbnz w22,#0x9,0x009b6bac
009b6b58	ldr x10,[x19, #0x8]
009b6b5c	ldr x11,[x10, #0xc0]
009b6b60	ldrb w11,[x11, #0x60]
009b6b64	tbnz w11,#0x3,0x009b6ba0
009b6b68	cbz w9,0x009b6ba0
009b6b6c	ldr w9,[x10]
009b6b70	cmp w9,#0x304
009b6b74	b.lt 0x009b6ba0
009b6b78	cmp w9,#0x10, LSL #12
009b6b7c	b.eq 0x009b6ba0
009b6b80	ldr w9,[x19, #0x1d40]
009b6b84	cbz w9,0x009b6b90
009b6b88	ldrb w9,[x19, #0x9eb]
009b6b8c	tbz w9,#0x0,0x009b6ba0
009b6b90	ldr x9,[x0, #0x68]
009b6b94	cbnz x9,0x009b6ba0
009b6b98	ldrb w9,[x19, #0x9e9]
009b6b9c	tbz w9,#0x6,0x009b6bac
009b6ba0	mov x1,x8
009b6ba4	bl 0x00c35960
009b6ba8	ldr x0,[x19, #0xb88]
009b6bac	ldr x8,[x0, #0x60]
009b6bb0	cbz x8,0x009b6bdc
009b6bb4	ldr x0,[x19, #0x918]
009b6bb8	bl 0x00c359f0
009b6bbc	ldr x8,[x19, #0xb88]
009b6bc0	ldr x1,[x19, #0x918]
009b6bc4	mov x0,x19
009b6bc8	ldr x8,[x8, #0x60]
009b6bcc	blr x8
009b6bd0	cbnz w0,0x009b6bdc
009b6bd4	ldr x0,[x19, #0x918]
009b6bd8	bl 0x00c32870
009b6bdc	tbnz w22,#0x7,0x009b6ae8
009b6be0	cmp w21,w20
009b6be4	b.ne 0x009b6ae8
009b6be8	ldr x19,[x19, #0xb88]
009b6bec	tst w20,#0x1
009b6bf0	mov w8,#0x80
009b6bf4	mov w9,#0x8c
009b6bf8	csel x8,x9,x8,eq
009b6bfc	ldr w8,[x19, x8#0x0]
009b6c00	mvn w8,w8
009b6c04	tst w8,#0xff
009b6c08	b.ne 0x009b6ae8
009b6c0c	mov x0,xzr
009b6c10	bl 0x00c30970
009b6c14	mov x1,x0
009b6c18	mov x0,x19
009b6c1c	ldp x29,x30,[sp, #0x20]
009b6c20	ldp x20,x19,[sp, #0x10]
009b6c24	ldp x22,x21,[sp], #0x30
009b6c28	b 0x00c35990
