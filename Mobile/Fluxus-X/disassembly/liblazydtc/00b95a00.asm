; FUN_00b95a00 @ 00b95a00
00b95a00	sub sp,sp,#0x80
00b95a04	stp x28,x27,[sp, #0x20]
00b95a08	stp x26,x25,[sp, #0x30]
00b95a0c	stp x24,x23,[sp, #0x40]
00b95a10	stp x22,x21,[sp, #0x50]
00b95a14	stp x20,x19,[sp, #0x60]
00b95a18	stp x29,x30,[sp, #0x70]
00b95a1c	add x29,sp,#0x70
00b95a20	mrs x26,tpidr_el0
00b95a24	ldr x8,[x26, #0x28]
00b95a28	mov x19,x2
00b95a2c	mov x28,x1
00b95a30	mov x21,x0
00b95a34	cmp x2,#0x1
00b95a38	str x8,[sp, #0x18]
00b95a3c	b.hi 0x00b95a60
00b95a40	ldr x1,[x28]
00b95a44	mov x0,x21
00b95a48	bl 0x00b93e20
00b95a4c	ldr x8,[x26, #0x28]
00b95a50	ldr x9,[sp, #0x18]
00b95a54	cmp x8,x9
00b95a58	b.eq 0x00b95b50
00b95a5c	b 0x00b95cc0
00b95a60	mov w1,#0x10
00b95a64	mov x0,x19
00b95a68	bl 0x00c30a30
00b95a6c	mov x20,x0
00b95a70	cbz x0,0x00b95b38
00b95a74	add x0,sp,#0x8
00b95a78	bl 0x00c41c00
00b95a7c	mov x22,x19
00b95a80	mov x0,x20
00b95a84	sub x22,x22,#0x1
00b95a88	add x23,x0,#0x10
00b95a8c	bl 0x00c41c00
00b95a90	mov x0,x23
00b95a94	cbnz x22,0x00b95a84
00b95a98	ldr x8,[x28]
00b95a9c	mov x0,x20
00b95aa0	add x1,x8,#0x20
00b95aa4	bl 0x00c41b60
00b95aa8	mov w24,w0
00b95aac	cbnz w0,0x00b95b0c
00b95ab0	cmp x19,#0x2
00b95ab4	b.cc 0x00b95af0
00b95ab8	mov w22,#0x1
00b95abc	mov x2,x20
00b95ac0	ldr x8,[x28, x22, LSL #0x3]
00b95ac4	add x23,x2,#0x10
00b95ac8	mov x0,x21
00b95acc	mov x1,x23
00b95ad0	add x3,x8,#0x20
00b95ad4	bl 0x00b953d4
00b95ad8	mov w24,w0
00b95adc	cbnz w0,0x00b95b0c
00b95ae0	add x22,x22,#0x1
00b95ae4	cmp x22,x19
00b95ae8	mov x2,x23
00b95aec	b.cc 0x00b95ac0
00b95af0	add x22,x20,x19, LSL #0x4
00b95af4	sub x0,x22,#0x10
00b95af8	add x2,x21,#0x8
00b95afc	mov x1,x0
00b95b00	bl 0x00c41c10
00b95b04	mov w24,w0
00b95b08	cbz w0,0x00b95b70
00b95b0c	add x0,sp,#0x8
00b95b10	bl 0x00c41bb0
00b95b14	mov x0,x20
00b95b18	sub x19,x19,#0x1
00b95b1c	add x21,x0,#0x10
00b95b20	bl 0x00c41bb0
00b95b24	mov x0,x21
00b95b28	cbnz x19,0x00b95b18
00b95b2c	mov x0,x20
00b95b30	bl 0x00c30960
00b95b34	b 0x00b95b3c
00b95b38	mov w24,#0xffffb280
00b95b3c	ldr x8,[x26, #0x28]
00b95b40	ldr x9,[sp, #0x18]
00b95b44	cmp x8,x9
00b95b48	b.ne 0x00b95cc0
00b95b4c	mov w0,w24
00b95b50	ldp x29,x30,[sp, #0x70]
00b95b54	ldp x20,x19,[sp, #0x60]
00b95b58	ldp x22,x21,[sp, #0x50]
00b95b5c	ldp x24,x23,[sp, #0x40]
00b95b60	ldp x26,x25,[sp, #0x30]
00b95b64	ldp x28,x27,[sp, #0x20]
00b95b68	add sp,sp,#0x80
00b95b6c	ret
00b95b70	mov w8,#0x1
00b95b74	lsl x9,x19,#0x3
00b95b78	sub x23,x22,#0x20
00b95b7c	sub x27,x8,x19
00b95b80	sub x22,x9,#0x8
00b95b84	str x22,[sp]
00b95b88	cbz x27,0x00b95bd4
00b95b8c	add x25,x23,#0x10
00b95b90	add x1,sp,#0x8
00b95b94	mov x0,x21
00b95b98	mov x2,x25
00b95b9c	mov x3,x23
00b95ba0	bl 0x00b953d4
00b95ba4	mov w24,w0
00b95ba8	cbnz w0,0x00b95b0c
00b95bac	add x22,x28,x22
00b95bb0	ldr x8,[x22]
00b95bb4	mov x0,x21
00b95bb8	mov x1,x23
00b95bbc	mov x2,x25
00b95bc0	add x3,x8,#0x20
00b95bc4	bl 0x00b953d4
00b95bc8	mov w24,w0
00b95bcc	cbz w0,0x00b95bec
00b95bd0	b 0x00b95b0c
00b95bd4	add x0,sp,#0x8
00b95bd8	mov x1,x20
00b95bdc	bl 0x00c41b60
00b95be0	mov w24,w0
00b95be4	mov x22,x28
00b95be8	cbnz w0,0x00b95b0c
00b95bec	ldr x8,[x22]
00b95bf0	add x3,sp,#0x8
00b95bf4	mov x0,x21
00b95bf8	add x1,x8,#0x10
00b95bfc	mov x2,x1
00b95c00	bl 0x00b953d4
00b95c04	mov w24,w0
00b95c08	cbnz w0,0x00b95b0c
00b95c0c	add x1,sp,#0x8
00b95c10	add x2,sp,#0x8
00b95c14	add x3,sp,#0x8
00b95c18	mov x0,x21
00b95c1c	bl 0x00b953d4
00b95c20	mov w24,w0
00b95c24	cbnz w0,0x00b95b0c
00b95c28	ldr x1,[x22]
00b95c2c	add x3,sp,#0x8
00b95c30	mov x0,x21
00b95c34	mov x2,x1
00b95c38	bl 0x00b953d4
00b95c3c	mov w24,w0
00b95c40	cbnz w0,0x00b95b0c
00b95c44	ldr x8,[x22]
00b95c48	add x3,sp,#0x8
00b95c4c	mov x0,x21
00b95c50	add x1,x8,#0x10
00b95c54	mov x2,x1
00b95c58	bl 0x00b953d4
00b95c5c	mov w24,w0
00b95c60	cbnz w0,0x00b95b0c
00b95c64	ldr x0,[x22]
00b95c68	ldrh w1,[x21, #0x12]
00b95c6c	bl 0x00c41d20
00b95c70	mov w24,w0
00b95c74	cbnz w0,0x00b95b0c
00b95c78	ldr x8,[x22]
00b95c7c	ldrh w1,[x21, #0x12]
00b95c80	add x0,x8,#0x10
00b95c84	bl 0x00c41d20
00b95c88	mov w24,w0
00b95c8c	cbnz w0,0x00b95b0c
00b95c90	ldr x8,[x22]
00b95c94	mov w1,#0x1
00b95c98	add x0,x8,#0x20
00b95c9c	bl 0x00c41c40
00b95ca0	mov w24,w0
00b95ca4	cbz x27,0x00b95b0c
00b95ca8	ldr x22,[sp]
00b95cac	sub x23,x23,#0x10
00b95cb0	add x27,x27,#0x1
00b95cb4	sub x22,x22,#0x8
00b95cb8	cbz w24,0x00b95b84
00b95cbc	b 0x00b95b0c
00b95cc0	bl 0x00c2fec0
