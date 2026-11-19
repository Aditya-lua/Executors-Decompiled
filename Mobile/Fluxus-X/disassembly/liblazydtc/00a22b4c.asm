; DSO_convert_filename @ 00a22b4c
00a22b4c	str x19,[sp, #-0x20]!
00a22b50	stp x29,x30,[sp, #0x10]
00a22b54	add x29,sp,#0x10
00a22b58	cbz x0,0x00a22bd8
00a22b5c	mov x19,x1
00a22b60	cbnz x1,0x00a22b6c
00a22b64	ldr x19,[x0, #0x38]
00a22b68	cbz x19,0x00a22c08
00a22b6c	ldrb w8,[x0, #0x14]
00a22b70	tbnz w8,#0x0,0x00a22b94
00a22b74	ldr x8,[x0, #0x28]
00a22b78	cbnz x8,0x00a22b88
00a22b7c	ldr x8,[x0]
00a22b80	ldr x8,[x8, #0x28]
00a22b84	cbz x8,0x00a22b94
00a22b88	mov x1,x19
00a22b8c	blr x8
00a22b90	cbnz x0,0x00a22c38
00a22b94	adrp x1,0x2a7000
00a22b98	add x1,x1,#0xdd6
00a22b9c	mov w2,#0x123
00a22ba0	mov x0,x19
00a22ba4	bl 0x00c34600
00a22ba8	cbnz x0,0x00a22c38
00a22bac	bl 0x00c342a0
00a22bb0	adrp x0,0x2a7000
00a22bb4	adrp x2,0x2bf000
00a22bb8	add x0,x0,#0xdd6
00a22bbc	add x2,x2,#0xb43
00a22bc0	mov w1,#0x125
00a22bc4	bl 0x00c342b0
00a22bc8	mov w1,#0x100
00a22bcc	mov w0,#0x25
00a22bd0	movk w1,#0xc, LSL #16
00a22bd4	b 0x00a22c2c
00a22bd8	bl 0x00c342a0
00a22bdc	adrp x0,0x2a7000
00a22be0	adrp x2,0x2bf000
00a22be4	add x0,x0,#0xdd6
00a22be8	add x2,x2,#0xb43
00a22bec	mov w1,#0x113
00a22bf0	bl 0x00c342b0
00a22bf4	mov w8,#0x100
00a22bf8	movk w8,#0xc, LSL #16
00a22bfc	add w1,w8,#0x2
00a22c00	mov w0,#0x25
00a22c04	b 0x00a22c2c
00a22c08	bl 0x00c342a0
00a22c0c	adrp x0,0x2a7000
00a22c10	adrp x2,0x2bf000
00a22c14	add x0,x0,#0xdd6
00a22c18	add x2,x2,#0xb43
00a22c1c	mov w1,#0x119
00a22c20	bl 0x00c342b0
00a22c24	mov w0,#0x25
00a22c28	mov w1,#0x6f
00a22c2c	mov x2,xzr
00a22c30	bl 0x00c342c0
00a22c34	mov x0,xzr
00a22c38	ldp x29,x30,[sp, #0x10]
00a22c3c	ldr x19,[sp], #0x20
00a22c40	ret
