; FUN_00af89bc @ 00af89bc
00af89bc	sub sp,sp,#0x40
00af89c0	stp x22,x21,[sp, #0x10]
00af89c4	stp x20,x19,[sp, #0x20]
00af89c8	stp x29,x30,[sp, #0x30]
00af89cc	str x2,[sp, #0x8]
00af89d0	ldr x8,[x1]
00af89d4	mov x19,x2
00af89d8	mov x20,x1
00af89dc	add x29,sp,#0x30
00af89e0	cbz x8,0x00af8a50
00af89e4	ldr x0,[x8, #0x8]
00af89e8	ldrsw x1,[x8]
00af89ec	bl 0x00c3e830
00af89f0	cbz x0,0x00af8ac0
00af89f4	mov x22,x20
00af89f8	ldr x8,[x22, #0x8]!
00af89fc	mov x21,x0
00af8a00	adrp x0,0x2dc000
00af8a04	add x0,x0,#0xa54
00af8a08	cbnz x8,0x00af8a18
00af8a0c	ldr x8,[x20, #0x10]
00af8a10	cmp x8,#0x0
00af8a14	csel x0,xzr,x0,eq
00af8a18	add x2,sp,#0x8
00af8a1c	mov x1,x21
00af8a20	bl 0x00c408c0
00af8a24	cbz w0,0x00af8af4
00af8a28	adrp x1,0x2b2000
00af8a2c	add x1,x1,#0xc50
00af8a30	mov w2,#0x3a
00af8a34	mov x0,x21
00af8a38	bl 0x00c32310
00af8a3c	ldr x1,[x22]
00af8a40	cbnz x1,0x00af8a5c
00af8a44	ldr x8,[x20, #0x10]
00af8a48	cbnz x8,0x00af8a78
00af8a4c	b 0x00af8ab8
00af8a50	add x22,x20,#0x8
00af8a54	ldr x1,[x22]
00af8a58	cbz x1,0x00af8a44
00af8a5c	ldr x2,[sp, #0x8]
00af8a60	mov x0,xzr
00af8a64	bl 0x00c408d0
00af8a68	cbz x0,0x00af8b24
00af8a6c	str x0,[sp, #0x8]
00af8a70	ldr x8,[x20, #0x10]
00af8a74	cbz x8,0x00af8ab8
00af8a78	ldr x0,[x8, #0x8]
00af8a7c	ldrsw x1,[x8]
00af8a80	bl 0x00c3e830
00af8a84	cbz x0,0x00af8b50
00af8a88	mov x20,x0
00af8a8c	adrp x0,0x2d2000
00af8a90	add x0,x0,#0x274
00af8a94	add x2,sp,#0x8
00af8a98	mov x1,x20
00af8a9c	bl 0x00c408c0
00af8aa0	adrp x1,0x2b2000
00af8aa4	add x1,x1,#0xc50
00af8aa8	cbz w0,0x00af8bb0
00af8aac	mov w2,#0x4e
00af8ab0	mov x0,x20
00af8ab4	bl 0x00c32310
00af8ab8	ldr x0,[sp, #0x8]
00af8abc	b 0x00af8b9c
00af8ac0	bl 0x00c342a0
00af8ac4	adrp x0,0x2b2000
00af8ac8	adrp x2,0x2d6000
00af8acc	add x0,x0,#0xc50
00af8ad0	add x2,x2,#0x670
00af8ad4	mov w1,#0x31
00af8ad8	bl 0x00c342b0
00af8adc	mov w1,#0x100
00af8ae0	mov w0,#0x22
00af8ae4	movk w1,#0xc, LSL #16
00af8ae8	mov x2,xzr
00af8aec	bl 0x00c342c0
00af8af0	b 0x00af8b98
00af8af4	adrp x20,0x2b2000
00af8af8	add x20,x20,#0xc50
00af8afc	mov w2,#0x36
00af8b00	mov x0,x21
00af8b04	mov x1,x20
00af8b08	bl 0x00c32310
00af8b0c	bl 0x00c342a0
00af8b10	adrp x2,0x2d6000
00af8b14	add x2,x2,#0x670
00af8b18	mov w1,#0x37
00af8b1c	mov x0,x20
00af8b20	b 0x00af8b3c
00af8b24	bl 0x00c342a0
00af8b28	adrp x0,0x2b2000
00af8b2c	adrp x2,0x2d6000
00af8b30	add x0,x0,#0xc50
00af8b34	add x2,x2,#0x670
00af8b38	orr w1,wzr,#0x3f
00af8b3c	bl 0x00c342b0
00af8b40	mov w1,#0xb
00af8b44	mov w0,#0x22
00af8b48	movk w1,#0x8, LSL #16
00af8b4c	b 0x00af8b78
00af8b50	bl 0x00c342a0
00af8b54	adrp x0,0x2b2000
00af8b58	adrp x2,0x2d6000
00af8b5c	add x0,x0,#0xc50
00af8b60	add x2,x2,#0x670
00af8b64	mov w1,#0x47
00af8b68	bl 0x00c342b0
00af8b6c	mov w1,#0x100
00af8b70	mov w0,#0x22
00af8b74	movk w1,#0xc, LSL #16
00af8b78	mov x2,xzr
00af8b7c	bl 0x00c342c0
00af8b80	mov x0,xzr
00af8b84	cbnz x19,0x00af8b9c
00af8b88	adrp x1,0xcb5000
00af8b8c	ldr x0,[sp, #0x8]
00af8b90	ldr x1,[x1, #0x4b0]
00af8b94	bl 0x00c32600
00af8b98	mov x0,xzr
00af8b9c	ldp x29,x30,[sp, #0x30]
00af8ba0	ldp x20,x19,[sp, #0x20]
00af8ba4	ldp x22,x21,[sp, #0x10]
00af8ba8	add sp,sp,#0x40
00af8bac	ret
00af8bb0	mov w2,#0x4b
00af8bb4	mov x0,x20
00af8bb8	bl 0x00c32310
00af8bbc	mov x0,xzr
00af8bc0	cbnz x19,0x00af8b9c
00af8bc4	b 0x00af8b88
