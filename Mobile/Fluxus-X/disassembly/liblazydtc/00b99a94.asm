; mbedtls_psa_rsa_sign_hash @ 00b99a94
00b99a94	sub sp,sp,#0x60
00b99a98	stp x26,x25,[sp, #0x10]
00b99a9c	stp x24,x23,[sp, #0x20]
00b99aa0	stp x22,x21,[sp, #0x30]
00b99aa4	stp x20,x19,[sp, #0x40]
00b99aa8	stp x29,x30,[sp, #0x50]
00b99aac	add x29,sp,#0x50
00b99ab0	mrs x25,tpidr_el0
00b99ab4	ldr x8,[x25, #0x28]
00b99ab8	mov w23,w3
00b99abc	mov x3,sp
00b99ac0	mov x22,x7
00b99ac4	str x8,[sp, #0x8]
00b99ac8	str xzr,[sp]
00b99acc	ldrh w0,[x0]
00b99ad0	mov x19,x6
00b99ad4	mov x21,x5
00b99ad8	mov x20,x4
00b99adc	bl 0x00c43150
00b99ae0	mov w24,w0
00b99ae4	cbnz w0,0x00b99c84
00b99ae8	mov w8,#0x8ff
00b99aec	and w26,w23,#0xffffff00
00b99af0	movk w8,#0x600, LSL #16
00b99af4	cmp w26,w8
00b99af8	b.gt 0x00b99b14
00b99afc	mov w8,#0x200
00b99b00	movk w8,#0x600, LSL #16
00b99b04	cmp w26,w8
00b99b08	b.eq 0x00b99b48
00b99b0c	mov w8,#0x300
00b99b10	b 0x00b99b28
00b99b14	mov w8,#0x900
00b99b18	movk w8,#0x600, LSL #16
00b99b1c	cmp w26,w8
00b99b20	b.eq 0x00b99b48
00b99b24	mov w8,#0x1300
00b99b28	movk w8,#0x600, LSL #16
00b99b2c	cmp w26,w8
00b99b30	b.eq 0x00b99b48
00b99b34	lsr w8,w23,#0x9
00b99b38	orr w8,w8,#0x1
00b99b3c	orr w9,wzr,#0x30003
00b99b40	cmp w8,w9
00b99b44	b.ne 0x00b99b5c
00b99b48	and w24,w23,#0xff
00b99b4c	lsr x8,x21,#0x20
00b99b50	cbz x8,0x00b99b68
00b99b54	mov w24,#0xffffff79
00b99b58	b 0x00b99c84
00b99b5c	mov w24,wzr
00b99b60	lsr x8,x21,#0x20
00b99b64	cbnz x8,0x00b99b54
00b99b68	mov w8,#0x200
00b99b6c	movk w8,#0x600, LSL #16
00b99b70	cmp w23,w8
00b99b74	b.eq 0x00b99b94
00b99b78	cbz w24,0x00b99c20
00b99b7c	mov w0,w24
00b99b80	bl 0x00c30210
00b99b84	bl 0x00c302d0
00b99b88	and x8,x0,#0xff
00b99b8c	cmp x8,x21
00b99b90	b.ne 0x00b99b54
00b99b94	ldr x23,[sp]
00b99b98	mov x0,x23
00b99b9c	bl 0x00c432f0
00b99ba0	cmp x0,x22
00b99ba4	b.ls 0x00b99bb0
00b99ba8	mov w24,#0xffffff76
00b99bac	b 0x00b99c84
00b99bb0	mov w8,#0x1300
00b99bb4	movk w8,#0x600, LSL #16
00b99bb8	cmp w26,w8
00b99bbc	b.eq 0x00b99c28
00b99bc0	mov w8,#0x300
00b99bc4	movk w8,#0x600, LSL #16
00b99bc8	cmp w26,w8
00b99bcc	b.eq 0x00b99c28
00b99bd0	mov w8,#0x200
00b99bd4	movk w8,#0x600, LSL #16
00b99bd8	cmp w26,w8
00b99bdc	b.ne 0x00b99b54
00b99be0	mov x0,x23
00b99be4	mov w1,wzr
00b99be8	mov w2,wzr
00b99bec	bl 0x00c433b0
00b99bf0	cbnz w0,0x00b99c7c
00b99bf4	adrp x1,0xcb5000
00b99bf8	ldr x1,[x1, #0xac0]
00b99bfc	mov x0,x23
00b99c00	mov x2,xzr
00b99c04	mov w3,w24
00b99c08	mov w4,w21
00b99c0c	mov x5,x20
00b99c10	mov x6,x19
00b99c14	bl 0x00c43350
00b99c18	cbnz w0,0x00b99c7c
00b99c1c	b 0x00b99c64
00b99c20	mov w24,#0xffffff7a
00b99c24	b 0x00b99c84
00b99c28	mov w1,#0x1
00b99c2c	mov x0,x23
00b99c30	mov w2,w24
00b99c34	bl 0x00c433b0
00b99c38	cbnz w0,0x00b99c7c
00b99c3c	adrp x1,0xcb5000
00b99c40	ldr x1,[x1, #0xac0]
00b99c44	mov x0,x23
00b99c48	mov x2,xzr
00b99c4c	mov w3,wzr
00b99c50	mov w4,w21
00b99c54	mov x5,x20
00b99c58	mov x6,x19
00b99c5c	bl 0x00c43390
00b99c60	cbnz w0,0x00b99c7c
00b99c64	ldr x19,[x29, #0x10]
00b99c68	mov x0,x23
00b99c6c	bl 0x00c432f0
00b99c70	mov x8,x0
00b99c74	mov w0,wzr
00b99c78	str x8,[x19]
00b99c7c	bl 0x00c42bf0
00b99c80	mov w24,w0
00b99c84	ldr x19,[sp]
00b99c88	mov x0,x19
00b99c8c	bl 0x00c432d0
00b99c90	mov x0,x19
00b99c94	bl 0x00c30960
00b99c98	ldr x8,[x25, #0x28]
00b99c9c	ldr x9,[sp, #0x8]
00b99ca0	cmp x8,x9
00b99ca4	b.ne 0x00b99cc8
00b99ca8	mov w0,w24
00b99cac	ldp x29,x30,[sp, #0x50]
00b99cb0	ldp x20,x19,[sp, #0x40]
00b99cb4	ldp x22,x21,[sp, #0x30]
00b99cb8	ldp x24,x23,[sp, #0x20]
00b99cbc	ldp x26,x25,[sp, #0x10]
00b99cc0	add sp,sp,#0x60
00b99cc4	ret
00b99cc8	bl 0x00c2fec0
