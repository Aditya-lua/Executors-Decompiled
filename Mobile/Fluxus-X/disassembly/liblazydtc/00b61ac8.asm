; FUN_00b61ac8 @ 00b61ac8
00b61ac8	sub sp,sp,#0x70
00b61acc	stp x28,x27,[sp, #0x10]
00b61ad0	stp x26,x25,[sp, #0x20]
00b61ad4	stp x24,x23,[sp, #0x30]
00b61ad8	stp x22,x21,[sp, #0x40]
00b61adc	stp x20,x19,[sp, #0x50]
00b61ae0	stp x29,x30,[sp, #0x60]
00b61ae4	add x29,sp,#0x60
00b61ae8	mov x20,x5
00b61aec	mov x28,x4
00b61af0	mov x25,x3
00b61af4	mov x27,x2
00b61af8	mov x26,x1
00b61afc	mov x21,x0
00b61b00	bl 0x00c31fa0
00b61b04	mov x19,x0
00b61b08	mov x0,x21
00b61b0c	bl 0x00c34c20
00b61b10	mov w22,w0
00b61b14	mov x0,x26
00b61b18	bl 0x00c3ad30
00b61b1c	mov x23,x0
00b61b20	mov x0,x26
00b61b24	bl 0x00c3ad20
00b61b28	tbnz w22,#0x1f,0x00b61c28
00b61b2c	stp x28,x20,[sp]
00b61b30	sxtw x28,w22
00b61b34	adrp x1,0x2a8000
00b61b38	mov x24,x0
00b61b3c	add x1,x1,#0xdb3
00b61b40	mov w2,#0xa7
00b61b44	mov x0,x28
00b61b48	bl 0x00c34250
00b61b4c	mov x20,x0
00b61b50	cbz x19,0x00b61c64
00b61b54	cbz x20,0x00b61c64
00b61b58	mov x0,x21
00b61b5c	bl 0x00c36230
00b61b60	mov x1,x0
00b61b64	mov x0,x23
00b61b68	mov x2,x24
00b61b6c	bl 0x00c357f0
00b61b70	mov x21,x0
00b61b74	cbz x0,0x00b61ca0
00b61b78	mov x0,x20
00b61b7c	mov x1,x21
00b61b80	mov x2,x27
00b61b84	mov x3,x25
00b61b88	mov x4,x26
00b61b8c	bl 0x00b6157c
00b61b90	cbz w0,0x00b61cfc
00b61b94	mov x0,x19
00b61b98	mov x1,x21
00b61b9c	bl 0x00c32430
00b61ba0	cbz w0,0x00b61ccc
00b61ba4	mov x0,x19
00b61ba8	mov x1,x20
00b61bac	mov x2,x28
00b61bb0	bl 0x00c31f80
00b61bb4	cbz w0,0x00b61ccc
00b61bb8	ldp x1,x2,[sp]
00b61bbc	mov x0,x19
00b61bc0	bl 0x00c31f80
00b61bc4	cbz w0,0x00b61ccc
00b61bc8	mov x0,x19
00b61bcc	mov x1,x20
00b61bd0	mov x2,xzr
00b61bd4	bl 0x00c3c150
00b61bd8	cbz w0,0x00b61ccc
00b61bdc	mov x0,x20
00b61be0	mov w1,w22
00b61be4	mov x2,xzr
00b61be8	bl 0x00c36970
00b61bec	mov x22,x0
00b61bf0	cbnz x0,0x00b61d00
00b61bf4	bl 0x00c342a0
00b61bf8	adrp x0,0x2a8000
00b61bfc	adrp x2,0x2c2000
00b61c00	add x0,x0,#0xdb3
00b61c04	add x2,x2,#0xb32
00b61c08	mov w1,#0xc3
00b61c0c	bl 0x00c342b0
00b61c10	mov w1,#0x103
00b61c14	mov w0,#0x35
00b61c18	movk w1,#0xc, LSL #16
00b61c1c	mov x2,xzr
00b61c20	bl 0x00c342c0
00b61c24	b 0x00b61d00
00b61c28	bl 0x00c342a0
00b61c2c	adrp x0,0x2a8000
00b61c30	adrp x2,0x2c2000
00b61c34	add x0,x0,#0xdb3
00b61c38	add x2,x2,#0xb32
00b61c3c	mov w1,#0xa3
00b61c40	bl 0x00c342b0
00b61c44	mov w0,#0x35
00b61c48	mov w1,#0x66
00b61c4c	mov x2,xzr
00b61c50	bl 0x00c342c0
00b61c54	mov x21,xzr
00b61c58	mov x22,xzr
00b61c5c	mov x20,xzr
00b61c60	b 0x00b61d00
00b61c64	bl 0x00c342a0
00b61c68	adrp x0,0x2a8000
00b61c6c	adrp x2,0x2c2000
00b61c70	add x0,x0,#0xdb3
00b61c74	add x2,x2,#0xb32
00b61c78	mov w1,#0xa9
00b61c7c	bl 0x00c342b0
00b61c80	mov w8,#0x103
00b61c84	movk w8,#0xc, LSL #16
00b61c88	sub w1,w8,#0x3
00b61c8c	mov w0,#0x35
00b61c90	mov x2,xzr
00b61c94	bl 0x00c342c0
00b61c98	mov x21,xzr
00b61c9c	b 0x00b61cfc
00b61ca0	bl 0x00c342a0
00b61ca4	adrp x0,0x2a8000
00b61ca8	adrp x2,0x2c2000
00b61cac	add x0,x0,#0xdb3
00b61cb0	add x2,x2,#0xb32
00b61cb4	mov w1,#0xaf
00b61cb8	bl 0x00c342b0
00b61cbc	mov w1,#0x103
00b61cc0	mov w0,#0x35
00b61cc4	movk w1,#0xc, LSL #16
00b61cc8	b 0x00b61cf4
00b61ccc	bl 0x00c342a0
00b61cd0	adrp x0,0x2a8000
00b61cd4	adrp x2,0x2c2000
00b61cd8	add x0,x0,#0xdb3
00b61cdc	add x2,x2,#0xb32
00b61ce0	mov w1,#0xbd
00b61ce4	bl 0x00c342b0
00b61ce8	mov w1,#0x6
00b61cec	mov w0,#0x35
00b61cf0	movk w1,#0x8, LSL #16
00b61cf4	mov x2,xzr
00b61cf8	bl 0x00c342c0
00b61cfc	mov x22,xzr
00b61d00	mov x0,x21
00b61d04	bl 0x00c35800
00b61d08	adrp x1,0x2a8000
00b61d0c	add x1,x1,#0xdb3
00b61d10	mov w2,#0xc7
00b61d14	mov x0,x20
00b61d18	bl 0x00c32310
00b61d1c	mov x0,x19
00b61d20	bl 0x00c31f90
00b61d24	mov x0,x22
00b61d28	ldp x29,x30,[sp, #0x60]
00b61d2c	ldp x20,x19,[sp, #0x50]
00b61d30	ldp x22,x21,[sp, #0x40]
00b61d34	ldp x24,x23,[sp, #0x30]
00b61d38	ldp x26,x25,[sp, #0x20]
00b61d3c	ldp x28,x27,[sp, #0x10]
00b61d40	add sp,sp,#0x70
00b61d44	ret
