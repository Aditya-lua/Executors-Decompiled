; tls1_export_keying_material @ 009c09f0
009c09f0	sub sp,sp,#0xa0
009c09f4	add x8,x6,#0x2
009c09f8	cmp w7,#0x0
009c09fc	stp x22,x21,[sp, #0x70]
009c0a00	add x22,x4,#0x40
009c0a04	csel x8,x8,xzr,ne
009c0a08	stp x20,x19,[sp, #0x80]
009c0a0c	str x1,[sp, #0x38]
009c0a10	add x19,x8,x22
009c0a14	adrp x1,0x2d7000
009c0a18	stp x24,x23,[sp, #0x60]
009c0a1c	mov x23,x2
009c0a20	mov x21,x0
009c0a24	add x1,x1,#0xa4c
009c0a28	mov w2,#0x2d4
009c0a2c	mov x0,x19
009c0a30	stp x28,x27,[sp, #0x40]
009c0a34	stp x26,x25,[sp, #0x50]
009c0a38	stp x29,x30,[sp, #0x90]
009c0a3c	add x29,sp,#0x90
009c0a40	mov w27,w7
009c0a44	mov x24,x6
009c0a48	mov x25,x5
009c0a4c	mov x26,x4
009c0a50	mov x28,x3
009c0a54	bl 0x00c32320
009c0a58	mov x20,x0
009c0a5c	cbz x0,0x009c0bac
009c0a60	mov x0,x20
009c0a64	mov x1,x28
009c0a68	mov x2,x26
009c0a6c	bl 0x00c2ffd0
009c0a70	ldr q0,[x21, #0x170]
009c0a74	add x8,x20,x26
009c0a78	str q0,[x8, #0x10]
009c0a7c	ldr q0,[x21, #0x160]
009c0a80	str q0,[x8]
009c0a84	ldr q0,[x21, #0x140]
009c0a88	str q0,[x8, #0x20]
009c0a8c	ldr q0,[x21, #0x150]
009c0a90	str q0,[x8, #0x30]
009c0a94	cbz w27,0x009c0ac0
009c0a98	lsr x9,x24,#0x8
009c0a9c	strb w9,[x20, x22]
009c0aa0	strb w24,[x8, #0x41]
009c0aa4	cbnz x25,0x009c0aac
009c0aa8	cbz x24,0x009c0ac0
009c0aac	add x8,x20,x26
009c0ab0	add x0,x8,#0x42
009c0ab4	mov x1,x25
009c0ab8	mov x2,x24
009c0abc	bl 0x00c2ffd0
009c0ac0	adrp x1,0x2af000
009c0ac4	add x1,x1,#0x813
009c0ac8	orr w2,wzr,#0xf
009c0acc	mov x0,x20
009c0ad0	bl 0x00c300b0
009c0ad4	cbz w0,0x009c0b84
009c0ad8	adrp x1,0x2d3000
009c0adc	add x1,x1,#0x433
009c0ae0	orr w2,wzr,#0xf
009c0ae4	mov x0,x20
009c0ae8	bl 0x00c300b0
009c0aec	cbz w0,0x009c0b84
009c0af0	adrp x1,0x2bd000
009c0af4	add x1,x1,#0x649
009c0af8	mov w2,#0xd
009c0afc	mov x0,x20
009c0b00	bl 0x00c300b0
009c0b04	cbz w0,0x009c0b84
009c0b08	adrp x1,0x2cd000
009c0b0c	add x1,x1,#0x6d2
009c0b10	mov w2,#0x16
009c0b14	mov x0,x20
009c0b18	bl 0x00c300b0
009c0b1c	cbz w0,0x009c0b84
009c0b20	adrp x1,0x29d000
009c0b24	add x1,x1,#0xe20
009c0b28	mov w2,#0xd
009c0b2c	mov x0,x20
009c0b30	bl 0x00c300b0
009c0b34	cbz w0,0x009c0b84
009c0b38	ldr x8,[x21, #0x918]
009c0b3c	mov x0,x21
009c0b40	mov x1,x20
009c0b44	mov x2,x19
009c0b48	ldr x9,[x8, #0x8]
009c0b4c	add x8,x8,#0x50
009c0b50	mov x3,xzr
009c0b54	mov x4,xzr
009c0b58	stp x8,x9,[sp, #0x8]
009c0b5c	ldr x9,[sp, #0x38]
009c0b60	mov x5,xzr
009c0b64	mov x6,xzr
009c0b68	mov x7,xzr
009c0b6c	str wzr,[sp, #0x28]
009c0b70	stp x9,x23,[sp, #0x18]
009c0b74	str xzr,[sp]
009c0b78	bl 0x009c0598
009c0b7c	mov w21,w0
009c0b80	b 0x009c0be0
009c0b84	bl 0x00c342a0
009c0b88	adrp x0,0x2d7000
009c0b8c	adrp x2,0x2ab000
009c0b90	add x0,x0,#0xa4c
009c0b94	add x2,x2,#0xd24
009c0b98	mov w1,#0x309
009c0b9c	bl 0x00c342b0
009c0ba0	mov w0,#0x14
009c0ba4	mov w1,#0x16f
009c0ba8	b 0x009c0bd4
009c0bac	bl 0x00c342a0
009c0bb0	adrp x0,0x2d7000
009c0bb4	adrp x2,0x2ab000
009c0bb8	add x0,x0,#0xa4c
009c0bbc	add x2,x2,#0xd24
009c0bc0	mov w1,#0x30d
009c0bc4	bl 0x00c342b0
009c0bc8	mov w1,#0x100
009c0bcc	mov w0,#0x14
009c0bd0	movk w1,#0xc, LSL #16
009c0bd4	mov x2,xzr
009c0bd8	bl 0x00c342c0
009c0bdc	mov w21,wzr
009c0be0	adrp x2,0x2d7000
009c0be4	add x2,x2,#0xa4c
009c0be8	mov w3,#0x310
009c0bec	mov x0,x20
009c0bf0	mov x1,x19
009c0bf4	bl 0x00c345e0
009c0bf8	mov w0,w21
009c0bfc	ldp x29,x30,[sp, #0x90]
009c0c00	ldp x20,x19,[sp, #0x80]
009c0c04	ldp x22,x21,[sp, #0x70]
009c0c08	ldp x24,x23,[sp, #0x60]
009c0c0c	ldp x26,x25,[sp, #0x50]
009c0c10	ldp x28,x27,[sp, #0x40]
009c0c14	add sp,sp,#0xa0
009c0c18	ret
