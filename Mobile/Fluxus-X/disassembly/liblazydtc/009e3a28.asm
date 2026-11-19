; tls_construct_finished @ 009e3a28
009e3a28	stp x22,x21,[sp, #-0x30]!
009e3a2c	stp x20,x19,[sp, #0x10]
009e3a30	stp x29,x30,[sp, #0x20]
009e3a34	ldr w8,[x0, #0x38]
009e3a38	mov x19,x0
009e3a3c	mov x20,x1
009e3a40	add x29,sp,#0x20
009e3a44	cbnz w8,0x009e3a5c
009e3a48	ldr w9,[x19, #0xba8]
009e3a4c	cmp w9,#0x4
009e3a50	b.eq 0x009e3a5c
009e3a54	mov w9,#0x1
009e3a58	str w9,[x19, #0x70]
009e3a5c	ldr x10,[x19, #0x8]
009e3a60	ldr x9,[x10, #0xc0]
009e3a64	ldrb w11,[x9, #0x60]
009e3a68	tbnz w11,#0x3,0x009e3aac
009e3a6c	ldr w10,[x10]
009e3a70	cmp w10,#0x304
009e3a74	b.lt 0x009e3aac
009e3a78	cmp w10,#0x10, LSL #12
009e3a7c	b.eq 0x009e3aac
009e3a80	cbnz w8,0x009e3aac
009e3a84	ldr w10,[x19, #0x2f0]
009e3a88	cbnz w10,0x009e3aac
009e3a8c	ldr x8,[x9, #0x20]
009e3a90	mov w1,#0x92
009e3a94	mov x0,x19
009e3a98	blr x8
009e3a9c	cbz w0,0x009e3be0
009e3aa0	ldr x9,[x19, #0x8]
009e3aa4	ldr w8,[x19, #0x38]
009e3aa8	ldr x9,[x9, #0xc0]
009e3aac	cmp w8,#0x0
009e3ab0	mov w8,#0x40
009e3ab4	orr w10,wzr,#0x30
009e3ab8	mov w11,#0x48
009e3abc	orr w12,wzr,#0x38
009e3ac0	csel x8,x10,x8,eq
009e3ac4	csel x10,x12,x11,eq
009e3ac8	ldr x2,[x9, x10#0x0]
009e3acc	ldr x1,[x9, x8#0x0]
009e3ad0	ldr x8,[x9, #0x28]
009e3ad4	add x21,x19,#0x1c0
009e3ad8	mov x0,x19
009e3adc	mov x3,x21
009e3ae0	blr x8
009e3ae4	cbz x0,0x009e3be0
009e3ae8	mov x22,x0
009e3aec	str x0,[x19, #0x240]
009e3af0	mov x0,x20
009e3af4	mov x1,x21
009e3af8	mov x2,x22
009e3afc	bl 0x00c34390
009e3b00	cbz w0,0x009e3b70
009e3b04	ldr x8,[x19, #0x8]
009e3b08	ldr x9,[x8, #0xc0]
009e3b0c	ldrb w9,[x9, #0x60]
009e3b10	tbnz w9,#0x3,0x009e3b28
009e3b14	ldr w8,[x8]
009e3b18	cmp w8,#0x304
009e3b1c	b.lt 0x009e3b28
009e3b20	cmp w8,#0x10, LSL #12
009e3b24	b.ne 0x009e3b48
009e3b28	ldr x8,[x19, #0x918]
009e3b2c	adrp x1,0x2a7000
009e3b30	add x1,x1,#0xcd4
009e3b34	mov x0,x19
009e3b38	ldr x3,[x8, #0x8]
009e3b3c	add x2,x8,#0x50
009e3b40	bl 0x00c35e00
009e3b44	cbz w0,0x009e3be0
009e3b48	cmp x22,#0x41
009e3b4c	b.cs 0x009e3b8c
009e3b50	ldr w8,[x19, #0x38]
009e3b54	cbz w8,0x009e3bc8
009e3b58	add x0,x19,#0x438
009e3b5c	mov x1,x21
009e3b60	mov x2,x22
009e3b64	bl 0x00c2ffd0
009e3b68	str x22,[x19, #0x478]
009e3b6c	b 0x009e3bdc
009e3b70	bl 0x00c342a0
009e3b74	adrp x0,0x2bb000
009e3b78	adrp x2,0x2b7000
009e3b7c	add x0,x0,#0x912
009e3b80	add x2,x2,#0x867
009e3b84	mov w1,#0x25f
009e3b88	b 0x009e3ba4
009e3b8c	bl 0x00c342a0
009e3b90	adrp x0,0x2bb000
009e3b94	adrp x2,0x2b7000
009e3b98	add x0,x0,#0x912
009e3b9c	add x2,x2,#0x867
009e3ba0	mov w1,#0x272
009e3ba4	bl 0x00c342b0
009e3ba8	mov w2,#0x103
009e3bac	mov w1,#0x50
009e3bb0	movk w2,#0xc, LSL #16
009e3bb4	mov x0,x19
009e3bb8	mov x3,xzr
009e3bbc	bl 0x00c34410
009e3bc0	mov w0,wzr
009e3bc4	b 0x009e3be0
009e3bc8	add x0,x19,#0x3f0
009e3bcc	mov x1,x21
009e3bd0	mov x2,x22
009e3bd4	bl 0x00c2ffd0
009e3bd8	str x22,[x19, #0x430]
009e3bdc	mov w0,#0x1
009e3be0	ldp x29,x30,[sp, #0x20]
009e3be4	ldp x20,x19,[sp, #0x10]
009e3be8	ldp x22,x21,[sp], #0x30
009e3bec	ret
