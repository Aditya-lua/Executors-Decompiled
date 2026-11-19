; X509_PUBKEY_set @ 00b1ce9c
00b1ce9c	sub sp,sp,#0x50
00b1cea0	str x23,[sp, #0x10]
00b1cea4	stp x22,x21,[sp, #0x20]
00b1cea8	stp x20,x19,[sp, #0x30]
00b1ceac	stp x29,x30,[sp, #0x40]
00b1ceb0	add x29,sp,#0x40
00b1ceb4	cbz x0,0x00b1cf04
00b1ceb8	mov x20,x1
00b1cebc	cbz x1,0x00b1cf04
00b1cec0	ldr x8,[x20, #0x8]
00b1cec4	mov x21,x0
00b1cec8	cbz x8,0x00b1cf3c
00b1cecc	adrp x0,0xc82000
00b1ced0	add x0,x0,#0x640
00b1ced4	bl 0x00c372e0
00b1ced8	mov x19,x0
00b1cedc	cbz x0,0x00b1cfac
00b1cee0	ldr x8,[x20, #0x8]
00b1cee4	ldr x8,[x8, #0x28]
00b1cee8	cbz x8,0x00b1cfd8
00b1ceec	mov x0,x19
00b1cef0	mov x1,x20
00b1cef4	blr x8
00b1cef8	cbz w0,0x00b1d000
00b1cefc	mov x23,x19
00b1cf00	b 0x00b1d050
00b1cf04	bl 0x00c342a0
00b1cf08	adrp x0,0x2bc000
00b1cf0c	adrp x2,0x2ae000
00b1cf10	add x0,x0,#0x79f
00b1cf14	add x2,x2,#0x887
00b1cf18	mov w1,#0x142
00b1cf1c	bl 0x00c342b0
00b1cf20	mov w8,#0x100
00b1cf24	movk w8,#0xc, LSL #16
00b1cf28	add w1,w8,#0x2
00b1cf2c	mov w0,#0xb
00b1cf30	mov x2,xzr
00b1cf34	bl 0x00c342c0
00b1cf38	b 0x00b1d100
00b1cf3c	ldr x8,[x20, #0x60]
00b1cf40	cbz x8,0x00b1d088
00b1cf44	adrp x2,0x2b7000
00b1cf48	adrp x3,0x2a2000
00b1cf4c	add x2,x2,#0x291
00b1cf50	add x3,x3,#0xb58
00b1cf54	mov w1,#0x86
00b1cf58	mov x0,x20
00b1cf5c	mov x4,xzr
00b1cf60	str xzr,[sp, #0x18]
00b1cf64	str xzr,[sp, #0x8]
00b1cf68	bl 0x00c3b960
00b1cf6c	add x1,sp,#0x18
00b1cf70	add x2,sp,#0x8
00b1cf74	mov x22,x0
00b1cf78	bl 0x00c3b870
00b1cf7c	cbz w0,0x00b1d028
00b1cf80	ldr x8,[sp, #0x18]
00b1cf84	ldr x2,[sp, #0x8]
00b1cf88	adrp x3,0xc82000
00b1cf8c	add x3,x3,#0x640
00b1cf90	mov x1,sp
00b1cf94	mov x0,xzr
00b1cf98	str x8,[sp]
00b1cf9c	bl 0x00c36150
00b1cfa0	mov x19,x0
00b1cfa4	mov x23,x0
00b1cfa8	b 0x00b1d030
00b1cfac	bl 0x00c342a0
00b1cfb0	adrp x0,0x2bc000
00b1cfb4	adrp x2,0x2ae000
00b1cfb8	add x0,x0,#0x79f
00b1cfbc	add x2,x2,#0x887
00b1cfc0	mov w1,#0x148
00b1cfc4	bl 0x00c342b0
00b1cfc8	mov w1,#0x100
00b1cfcc	mov w0,#0xb
00b1cfd0	movk w1,#0xc, LSL #16
00b1cfd4	b 0x00b1d0e8
00b1cfd8	bl 0x00c342a0
00b1cfdc	adrp x0,0x2bc000
00b1cfe0	adrp x2,0x2ae000
00b1cfe4	add x0,x0,#0x79f
00b1cfe8	add x2,x2,#0x887
00b1cfec	mov w1,#0x151
00b1cff0	bl 0x00c342b0
00b1cff4	mov w0,#0xb
00b1cff8	orr w1,wzr,#0x7c
00b1cffc	b 0x00b1d0e8
00b1d000	bl 0x00c342a0
00b1d004	adrp x0,0x2bc000
00b1d008	adrp x2,0x2ae000
00b1d00c	add x0,x0,#0x79f
00b1d010	add x2,x2,#0x887
00b1d014	mov w1,#0x14d
00b1d018	bl 0x00c342b0
00b1d01c	mov w0,#0xb
00b1d020	orr w1,wzr,#0x7e
00b1d024	b 0x00b1d0e8
00b1d028	mov x19,xzr
00b1d02c	mov x23,xzr
00b1d030	mov x0,x22
00b1d034	bl 0x00c3b890
00b1d038	ldr x0,[sp, #0x18]
00b1d03c	adrp x1,0x2bc000
00b1d040	add x1,x1,#0x79f
00b1d044	mov w2,#0x163
00b1d048	bl 0x00c32310
00b1d04c	cbz x23,0x00b1d088
00b1d050	ldr x0,[x21]
00b1d054	adrp x1,0xc82000
00b1d058	add x1,x1,#0x640
00b1d05c	bl 0x00c36160
00b1d060	mov x0,x20
00b1d064	bl 0x00c34730
00b1d068	cbz w0,0x00b1d0bc
00b1d06c	str x23,[x21]
00b1d070	ldr x0,[x23, #0x10]
00b1d074	cbz x0,0x00b1d07c
00b1d078	bl 0x00c32450
00b1d07c	mov w0,#0x1
00b1d080	str x20,[x23, #0x10]
00b1d084	b 0x00b1d104
00b1d088	bl 0x00c342a0
00b1d08c	adrp x0,0x2bc000
00b1d090	adrp x2,0x2ae000
00b1d094	add x0,x0,#0x79f
00b1d098	add x2,x2,#0x887
00b1d09c	mov w1,#0x167
00b1d0a0	bl 0x00c342b0
00b1d0a4	mov w0,#0xb
00b1d0a8	mov w1,#0x6f
00b1d0ac	mov x2,xzr
00b1d0b0	bl 0x00c342c0
00b1d0b4	mov x19,xzr
00b1d0b8	b 0x00b1d0f0
00b1d0bc	bl 0x00c342a0
00b1d0c0	adrp x0,0x2bc000
00b1d0c4	adrp x2,0x2ae000
00b1d0c8	add x0,x0,#0x79f
00b1d0cc	add x2,x2,#0x887
00b1d0d0	mov w1,#0x16d
00b1d0d4	bl 0x00c342b0
00b1d0d8	mov w8,#0x100
00b1d0dc	movk w8,#0xc, LSL #16
00b1d0e0	add w1,w8,#0x3
00b1d0e4	mov w0,#0xb
00b1d0e8	mov x2,xzr
00b1d0ec	bl 0x00c342c0
00b1d0f0	adrp x1,0xc82000
00b1d0f4	add x1,x1,#0x640
00b1d0f8	mov x0,x19
00b1d0fc	bl 0x00c36160
00b1d100	mov w0,wzr
00b1d104	ldp x29,x30,[sp, #0x40]
00b1d108	ldp x20,x19,[sp, #0x30]
00b1d10c	ldp x22,x21,[sp, #0x20]
00b1d110	ldr x23,[sp, #0x10]
00b1d114	add sp,sp,#0x50
00b1d118	ret
