; ossl_statem_server_pre_work @ 009e6b00
009e6b00	str x19,[sp, #-0x20]!
009e6b04	stp x29,x30,[sp, #0x10]
009e6b08	ldr w8,[x0, #0x5c]
009e6b0c	mov x19,x0
009e6b10	mov w0,#0x2
009e6b14	add x29,sp,#0x10
009e6b18	sub w8,w8,#0x1
009e6b1c	cmp w8,#0x2d
009e6b20	b.hi 0x009e6cb0
009e6b24	adrp x9,0x74d000
009e6b28	add x9,x9,#0xabc
009e6b2c	ldrsw x8,[x9, x8, LSL #0x2]
009e6b30	add x8,x8,x9
009e6b34	br x8
009e6b38	ldr x8,[x19, #0x8]
009e6b3c	str wzr,[x19, #0x44]
009e6b40	ldr x8,[x8, #0xc0]
009e6b44	ldrb w8,[x8, #0x60]
009e6b48	tbz w8,#0x3,0x009e6cac
009e6b4c	mov x0,x19
009e6b50	bl 0x00c340f0
009e6b54	b 0x009e6cac
009e6b58	ldr x8,[x19, #0x8]
009e6b5c	str wzr,[x19, #0x44]
009e6b60	ldr x8,[x8, #0xc0]
009e6b64	ldrb w8,[x8, #0x60]
009e6b68	tbz w8,#0x3,0x009e6cac
009e6b6c	mov x0,x19
009e6b70	bl 0x00c340f0
009e6b74	b 0x009e6ca8
009e6b78	ldr x8,[x19, #0x8]
009e6b7c	ldr x8,[x8, #0xc0]
009e6b80	ldrb w8,[x8, #0x60]
009e6b84	tbz w8,#0x3,0x009e6cac
009e6b88	mov w8,#0x1
009e6b8c	str w8,[x19, #0x78]
009e6b90	b 0x009e6cac
009e6b94	ldr x8,[x19, #0x8]
009e6b98	ldr x9,[x8, #0xc0]
009e6b9c	ldrb w9,[x9, #0x60]
009e6ba0	tbnz w9,#0x3,0x009e6ca8
009e6ba4	ldr w8,[x8]
009e6ba8	mov w0,#0x2
009e6bac	cmp w8,#0x304
009e6bb0	b.lt 0x009e6cb0
009e6bb4	cmp w8,#0x10, LSL #12
009e6bb8	b.eq 0x009e6cb0
009e6bbc	ldr x8,[x19, #0x1d78]
009e6bc0	cbnz x8,0x009e6cac
009e6bc4	ldr w8,[x19, #0xa9c]
009e6bc8	cbnz w8,0x009e6cac
009e6bcc	mov x0,x19
009e6bd0	mov w2,wzr
009e6bd4	mov w3,wzr
009e6bd8	b 0x009e6c74
009e6bdc	ldr x9,[x19, #0x8]
009e6be0	ldr x8,[x9, #0xc0]
009e6be4	ldrb w10,[x8, #0x60]
009e6be8	tbnz w10,#0x3,0x009e6c00
009e6bec	ldr w9,[x9]
009e6bf0	cmp w9,#0x304
009e6bf4	b.lt 0x009e6c00
009e6bf8	cmp w9,#0x10, LSL #12
009e6bfc	b.ne 0x009e6cac
009e6c00	ldr x9,[x19, #0x918]
009e6c04	ldr x10,[x9, #0x2f8]
009e6c08	cbz x10,0x009e6c80
009e6c0c	ldr x9,[x19, #0x2e0]
009e6c10	cmp x10,x9
009e6c14	b.eq 0x009e6c88
009e6c18	bl 0x00c342a0
009e6c1c	adrp x0,0x2bd000
009e6c20	adrp x2,0x2cf000
009e6c24	add x0,x0,#0x74c
009e6c28	add x2,x2,#0x8a7
009e6c2c	mov w1,#0x2f1
009e6c30	bl 0x00c342b0
009e6c34	mov w2,#0x103
009e6c38	mov w1,#0x50
009e6c3c	movk w2,#0xc, LSL #16
009e6c40	mov x0,x19
009e6c44	mov x3,xzr
009e6c48	bl 0x00c34410
009e6c4c	mov w0,wzr
009e6c50	b 0x009e6cb0
009e6c54	ldr w8,[x19, #0x84]
009e6c58	cmp w8,#0x9
009e6c5c	b.eq 0x009e6c68
009e6c60	ldrb w8,[x19, #0xa9]
009e6c64	tbz w8,#0x3,0x009e6cac
009e6c68	mov w2,#0x1
009e6c6c	mov w3,#0x1
009e6c70	mov x0,x19
009e6c74	ldp x29,x30,[sp, #0x10]
009e6c78	ldr x19,[sp], #0x20
009e6c7c	b 0x00c371e0
009e6c80	ldr x10,[x19, #0x2e0]
009e6c84	str x10,[x9, #0x2f8]
009e6c88	ldr x8,[x8, #0x10]
009e6c8c	mov x0,x19
009e6c90	blr x8
009e6c94	cbz w0,0x009e6cb0
009e6c98	ldr x8,[x19, #0x8]
009e6c9c	ldr x8,[x8, #0xc0]
009e6ca0	ldrb w8,[x8, #0x60]
009e6ca4	tbz w8,#0x3,0x009e6cac
009e6ca8	str wzr,[x19, #0x78]
009e6cac	mov w0,#0x2
009e6cb0	ldp x29,x30,[sp, #0x10]
009e6cb4	ldr x19,[sp], #0x20
009e6cb8	ret
