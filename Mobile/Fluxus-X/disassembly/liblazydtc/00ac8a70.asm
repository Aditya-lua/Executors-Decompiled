; FUN_00ac8a70 @ 00ac8a70
00ac8a70	stp x28,x27,[sp, #-0x60]!
00ac8a74	stp x22,x21,[sp, #0x30]
00ac8a78	mov x21,x0
00ac8a7c	mov x0,x1
00ac8a80	stp x26,x25,[sp, #0x10]
00ac8a84	stp x24,x23,[sp, #0x20]
00ac8a88	stp x20,x19,[sp, #0x40]
00ac8a8c	stp x29,x30,[sp, #0x50]
00ac8a90	add x29,sp,#0x50
00ac8a94	mov x20,x1
00ac8a98	bl 0x00c39490
00ac8a9c	adrp x2,0xc7c000
00ac8aa0	add x2,x2,#0xa38
00ac8aa4	mov w1,#0x5
00ac8aa8	bl 0x00c3b520
00ac8aac	mov x19,x0
00ac8ab0	mov x0,x21
00ac8ab4	bl 0x00c39520
00ac8ab8	mov x1,x0
00ac8abc	mov x0,x20
00ac8ac0	bl 0x00c394b0
00ac8ac4	cbz x0,0x00ac8d38
00ac8ac8	cbz x19,0x00ac8d64
00ac8acc	mov x20,x0
00ac8ad0	bl 0x00c325e0
00ac8ad4	cmp w0,#0x1
00ac8ad8	b.lt 0x00ac8d88
00ac8adc	adrp x23,0x2a2000
00ac8ae0	adrp x24,0x2da000
00ac8ae4	adrp x25,0x2ad000
00ac8ae8	adrp x26,0x29d000
00ac8aec	adrp x27,0x2d3000
00ac8af0	mov w21,wzr
00ac8af4	mov w22,#0x1
00ac8af8	add x23,x23,#0xc1d
00ac8afc	add x24,x24,#0x554
00ac8b00	add x25,x25,#0x804
00ac8b04	add x26,x26,#0xe2e
00ac8b08	add x27,x27,#0x7c2
00ac8b0c	mov x0,x20
00ac8b10	mov w1,w21
00ac8b14	bl 0x00c32610
00ac8b18	mov x28,x0
00ac8b1c	ldr x0,[x0, #0x8]
00ac8b20	mov x1,x23
00ac8b24	bl 0x00c35ee0
00ac8b28	cbz w0,0x00ac8bbc
00ac8b2c	ldr x0,[x28, #0x8]
00ac8b30	mov x1,x25
00ac8b34	bl 0x00c35ee0
00ac8b38	cbz w0,0x00ac8bdc
00ac8b3c	ldr x0,[x28, #0x8]
00ac8b40	mov x1,x26
00ac8b44	bl 0x00c35ee0
00ac8b48	cbz w0,0x00ac8bfc
00ac8b4c	ldr x0,[x28, #0x8]
00ac8b50	mov x1,x27
00ac8b54	bl 0x00c35ee0
00ac8b58	cbz w0,0x00ac8c38
00ac8b5c	ldr x0,[x28, #0x8]
00ac8b60	adrp x1,0x2bb000
00ac8b64	add x1,x1,#0x864
00ac8b68	bl 0x00c35ee0
00ac8b6c	cbz w0,0x00ac8c74
00ac8b70	ldr x0,[x28, #0x8]
00ac8b74	adrp x1,0x2bc000
00ac8b78	add x1,x1,#0x3a2
00ac8b7c	bl 0x00c35ee0
00ac8b80	cbz w0,0x00ac8cb0
00ac8b84	bl 0x00c342a0
00ac8b88	adrp x2,0x2aa000
00ac8b8c	mov w1,#0x31d
00ac8b90	mov x0,x24
00ac8b94	add x2,x2,#0x8e7
00ac8b98	bl 0x00c342b0
00ac8b9c	ldp x3,x4,[x28, #0x8]
00ac8ba0	adrp x2,0x2cb000
00ac8ba4	orr w0,wzr,#0xf
00ac8ba8	orr w1,wzr,#0x78
00ac8bac	add x2,x2,#0x74d
00ac8bb0	bl 0x00c342c0
00ac8bb4	mov w22,wzr
00ac8bb8	b 0x00ac8d20
00ac8bbc	ldr x0,[x28, #0x10]
00ac8bc0	cbz x0,0x00ac8c1c
00ac8bc4	mov w2,#0x2e6
00ac8bc8	mov x1,x24
00ac8bcc	bl 0x00c34600
00ac8bd0	mov x28,x0
00ac8bd4	cbnz x0,0x00ac8c20
00ac8bd8	b 0x00ac8d90
00ac8bdc	ldr x0,[x28, #0x10]
00ac8be0	cbz x0,0x00ac8c58
00ac8be4	mov w2,#0x2e6
00ac8be8	mov x1,x24
00ac8bec	bl 0x00c34600
00ac8bf0	mov x28,x0
00ac8bf4	cbnz x0,0x00ac8c5c
00ac8bf8	b 0x00ac8d90
00ac8bfc	ldr x0,[x28, #0x10]
00ac8c00	cbz x0,0x00ac8c94
00ac8c04	mov w2,#0x2e6
00ac8c08	mov x1,x24
00ac8c0c	bl 0x00c34600
00ac8c10	mov x28,x0
00ac8c14	cbnz x0,0x00ac8c98
00ac8c18	b 0x00ac8d90
00ac8c1c	mov x28,xzr
00ac8c20	ldr x0,[x19, #0x20]
00ac8c24	mov w2,#0x2ec
00ac8c28	mov x1,x24
00ac8c2c	bl 0x00c32310
00ac8c30	str x28,[x19, #0x20]
00ac8c34	b 0x00ac8d20
00ac8c38	ldr x0,[x28, #0x10]
00ac8c3c	cbz x0,0x00ac8cd0
00ac8c40	mov w2,#0x2e6
00ac8c44	mov x1,x24
00ac8c48	bl 0x00c34600
00ac8c4c	mov x28,x0
00ac8c50	cbnz x0,0x00ac8cd4
00ac8c54	b 0x00ac8d90
00ac8c58	mov x28,xzr
00ac8c5c	ldr x0,[x19, #0x28]
00ac8c60	mov w2,#0x2ec
00ac8c64	mov x1,x24
00ac8c68	bl 0x00c32310
00ac8c6c	str x28,[x19, #0x28]
00ac8c70	b 0x00ac8d20
00ac8c74	ldr x0,[x28, #0x10]
00ac8c78	cbz x0,0x00ac8cec
00ac8c7c	mov w2,#0x2e6
00ac8c80	mov x1,x24
00ac8c84	bl 0x00c34600
00ac8c88	mov x28,x0
00ac8c8c	cbnz x0,0x00ac8cf0
00ac8c90	b 0x00ac8d90
00ac8c94	mov x28,xzr
00ac8c98	ldr x0,[x19, #0x30]
00ac8c9c	mov w2,#0x2ec
00ac8ca0	mov x1,x24
00ac8ca4	bl 0x00c32310
00ac8ca8	str x28,[x19, #0x30]
00ac8cac	b 0x00ac8d20
00ac8cb0	ldr x0,[x28, #0x10]
00ac8cb4	cbz x0,0x00ac8d08
00ac8cb8	mov w2,#0x2e6
00ac8cbc	mov x1,x24
00ac8cc0	bl 0x00c34600
00ac8cc4	mov x28,x0
00ac8cc8	cbnz x0,0x00ac8d0c
00ac8ccc	b 0x00ac8d90
00ac8cd0	mov x28,xzr
00ac8cd4	ldr x0,[x19, #0x38]
00ac8cd8	mov w2,#0x2ec
00ac8cdc	mov x1,x24
00ac8ce0	bl 0x00c32310
00ac8ce4	str x28,[x19, #0x38]
00ac8ce8	b 0x00ac8d20
00ac8cec	mov x28,xzr
00ac8cf0	ldr x0,[x19, #0x40]
00ac8cf4	mov w2,#0x2ec
00ac8cf8	mov x1,x24
00ac8cfc	bl 0x00c32310
00ac8d00	str x28,[x19, #0x40]
00ac8d04	b 0x00ac8d20
00ac8d08	mov x28,xzr
00ac8d0c	ldr x0,[x19, #0x48]
00ac8d10	mov w2,#0x2ec
00ac8d14	mov x1,x24
00ac8d18	bl 0x00c32310
00ac8d1c	str x28,[x19, #0x48]
00ac8d20	mov x0,x20
00ac8d24	add w21,w21,#0x1
00ac8d28	bl 0x00c325e0
00ac8d2c	cmp w21,w0
00ac8d30	b.lt 0x00ac8b0c
00ac8d34	b 0x00ac8d68
00ac8d38	bl 0x00c342a0
00ac8d3c	adrp x0,0x2da000
00ac8d40	adrp x2,0x2aa000
00ac8d44	add x0,x0,#0x554
00ac8d48	add x2,x2,#0x8e7
00ac8d4c	mov w1,#0x301
00ac8d50	bl 0x00c342b0
00ac8d54	orr w0,wzr,#0xf
00ac8d58	mov w1,#0x77
00ac8d5c	mov x2,xzr
00ac8d60	bl 0x00c342c0
00ac8d64	mov w22,wzr
00ac8d68	mov w0,w22
00ac8d6c	ldp x29,x30,[sp, #0x50]
00ac8d70	ldp x20,x19,[sp, #0x40]
00ac8d74	ldp x22,x21,[sp, #0x30]
00ac8d78	ldp x24,x23,[sp, #0x20]
00ac8d7c	ldp x26,x25,[sp, #0x10]
00ac8d80	ldp x28,x27,[sp], #0x60
00ac8d84	ret
00ac8d88	mov w22,#0x1
00ac8d8c	b 0x00ac8d68
00ac8d90	bl 0x00c342a0
00ac8d94	adrp x0,0x2da000
00ac8d98	adrp x2,0x2a0000
00ac8d9c	add x0,x0,#0x554
00ac8da0	add x2,x2,#0xb70
00ac8da4	mov w1,#0x2e8
00ac8da8	bl 0x00c342b0
00ac8dac	mov w1,#0x100
00ac8db0	orr w0,wzr,#0xf
00ac8db4	movk w1,#0xc, LSL #16
00ac8db8	b 0x00ac8d5c
