; FUN_00a4cdd0 @ 00a4cdd0
00a4cdd0	sub sp,sp,#0xa0
00a4cdd4	stp x28,x27,[sp, #0x40]
00a4cdd8	stp x26,x25,[sp, #0x50]
00a4cddc	stp x24,x23,[sp, #0x60]
00a4cde0	stp x22,x21,[sp, #0x70]
00a4cde4	stp x20,x19,[sp, #0x80]
00a4cde8	stp x29,x30,[sp, #0x90]
00a4cdec	ldr x21,[x1]
00a4cdf0	stp xzr,xzr,[sp, #0x8]
00a4cdf4	ldrb w8,[x1, #0x20]
00a4cdf8	movi v0.2D,#0x0
00a4cdfc	mov x19,x1
00a4ce00	add x29,sp,#0x90
00a4ce04	orr w8,w8,#0x1
00a4ce08	strb w8,[x1, #0x20]
00a4ce0c	stp q0,q0,[sp, #0x20]
00a4ce10	str x21,[sp, #0x18]
00a4ce14	ldr x8,[x1, #0x18]
00a4ce18	add x8,x8,#0x1
00a4ce1c	str x8,[sp, #0x30]
00a4ce20	cbz x0,0x00a4ce44
00a4ce24	mov x23,x19
00a4ce28	mov x22,x0
00a4ce2c	ldr x0,[x21, #0x18]
00a4ce30	ldr w1,[x23, #0x10]!
00a4ce34	bl 0x00c32610
00a4ce38	cbz x0,0x00a4ce5c
00a4ce3c	ldr x20,[x0]
00a4ce40	b 0x00a4ce60
00a4ce44	cbz x21,0x00a4cf4c
00a4ce48	ldr x0,[x21, #0x18]
00a4ce4c	cbz x0,0x00a4cf4c
00a4ce50	bl 0x00c325e0
00a4ce54	sxtw x8,w0
00a4ce58	b 0x00a4cf50
00a4ce5c	mov x20,xzr
00a4ce60	ldrb w8,[x19, #0x20]
00a4ce64	and w8,w8,#0xfffffffd
00a4ce68	strb w8,[x19, #0x20]
00a4ce6c	ldr x8,[x21, #0x20]
00a4ce70	cbz x8,0x00a4cea0
00a4ce74	ldr x2,[x21, #0x30]
00a4ce78	mov x1,x22
00a4ce7c	blr x8
00a4ce80	cmp w0,#0x1
00a4ce84	b.lt 0x00a4cea0
00a4ce88	ldrb w8,[x19, #0x20]
00a4ce8c	mov x22,xzr
00a4ce90	mov w23,#0x1
00a4ce94	orr w8,w8,#0x2
00a4ce98	strb w8,[x19, #0x20]
00a4ce9c	b 0x00a4d150
00a4cea0	adrp x1,0x2d1000
00a4cea4	add x1,x1,#0x67a
00a4cea8	mov x0,x22
00a4ceac	bl 0x00c36530
00a4ceb0	cbz x0,0x00a4d148
00a4ceb4	ldr w8,[x0, #0x8]
00a4ceb8	cmp w8,#0x5
00a4cebc	b.ne 0x00a4d148
00a4cec0	ldr x8,[x0, #0x10]
00a4cec4	ldr w1,[x0, #0x18]
00a4cec8	mov x0,x8
00a4cecc	bl 0x00c31a50
00a4ced0	str x0,[sp, #0x20]
00a4ced4	cbz x0,0x00a4d148
00a4ced8	adrp x1,0x2a4000
00a4cedc	mov x25,x0
00a4cee0	add x1,x1,#0x18
00a4cee4	mov x0,x22
00a4cee8	bl 0x00c36530
00a4ceec	cbz x0,0x00a4cefc
00a4cef0	add x1,sp,#0x10
00a4cef4	bl 0x00c3b420
00a4cef8	cbz w0,0x00a4d148
00a4cefc	adrp x1,0x2ad000
00a4cf00	add x1,x1,#0xb85
00a4cf04	mov x0,x22
00a4cf08	bl 0x00c36530
00a4cf0c	cbz x0,0x00a4cf1c
00a4cf10	add x1,sp,#0x8
00a4cf14	bl 0x00c3b420
00a4cf18	cbz w0,0x00a4d148
00a4cf1c	ldr x8,[sp, #0x10]
00a4cf20	cbz x8,0x00a4cf40
00a4cf24	ldr x0,[sp, #0x8]
00a4cf28	cbz x0,0x00a4cf40
00a4cf2c	adrp x1,0x2ab000
00a4cf30	add x1,x1,#0xdf0
00a4cf34	bl 0x00c35ee0
00a4cf38	cbnz w0,0x00a4cf40
00a4cf3c	str xzr,[sp, #0x8]
00a4cf40	ldr x8,[x23]
00a4cf44	cbnz x8,0x00a4cf64
00a4cf48	b 0x00a4d148
00a4cf4c	mov x8,xzr
00a4cf50	mov x23,x19
00a4cf54	str x8,[x23, #0x10]!
00a4cf58	ldur x25,[x23, #-0x8]
00a4cf5c	mov x20,xzr
00a4cf60	cbz x8,0x00a4d148
00a4cf64	mov w1,#0x85
00a4cf68	mov x0,x25
00a4cf6c	mov x2,xzr
00a4cf70	mov x3,xzr
00a4cf74	bl 0x00c321a0
00a4cf78	mov x24,x0
00a4cf7c	tbnz w24,#0x1f,0x00a4d118
00a4cf80	mov x0,x25
00a4cf84	bl 0x00c38860
00a4cf88	mov x22,x0
00a4cf8c	cbz x0,0x00a4d184
00a4cf90	ldr x8,[x23]
00a4cf94	cbz x8,0x00a4d1b4
00a4cf98	str x25,[sp]
00a4cf9c	mov w23,wzr
00a4cfa0	sxtw x24,w24
00a4cfa4	sub x25,x8,#0x1
00a4cfa8	ldr x0,[x21, #0x18]
00a4cfac	mov w1,w25
00a4cfb0	bl 0x00c32610
00a4cfb4	cbz x0,0x00a4cfd4
00a4cfb8	ldp x26,x28,[x0]
00a4cfbc	ldp x1,x27,[x0, #0x10]
00a4cfc0	cbz x20,0x00a4cfe8
00a4cfc4	mov x0,x20
00a4cfc8	bl 0x00c3b400
00a4cfcc	cbnz w0,0x00a4cff8
00a4cfd0	b 0x00a4d108
00a4cfd4	mov x1,xzr
00a4cfd8	mov x26,xzr
00a4cfdc	mov x28,xzr
00a4cfe0	mov x27,xzr
00a4cfe4	cbnz x20,0x00a4cfc4
00a4cfe8	ldr x0,[x21]
00a4cfec	cbz x0,0x00a4cff8
00a4cff0	bl 0x00c35ee0
00a4cff4	cbnz w0,0x00a4d108
00a4cff8	ldr x1,[sp, #0x10]
00a4cffc	cbz x1,0x00a4d00c
00a4d000	mov x0,x26
00a4d004	bl 0x00c3b400
00a4d008	cbz w0,0x00a4d108
00a4d00c	ldr x0,[sp, #0x8]
00a4d010	cbz x0,0x00a4d024
00a4d014	cbz x27,0x00a4d108
00a4d018	mov x1,x27
00a4d01c	bl 0x00c35ee0
00a4d020	cbnz w0,0x00a4d108
00a4d024	ldrb w8,[x19, #0x20]
00a4d028	tbnz w8,#0x2,0x00a4d050
00a4d02c	cbz x27,0x00a4d050
00a4d030	ldr x9,[x21, #0x8]
00a4d034	cbz x9,0x00a4d050
00a4d038	orr w8,w8,#0x4
00a4d03c	strb w8,[x19, #0x20]
00a4d040	ldr x1,[x21, #0x8]
00a4d044	mov x0,x27
00a4d048	bl 0x00c35ee0
00a4d04c	cbnz w0,0x00a4d108
00a4d050	ldr x27,[sp]
00a4d054	mov w1,#0x80
00a4d058	mov x2,x24
00a4d05c	mov x3,xzr
00a4d060	mov x0,x27
00a4d064	bl 0x00c321a0
00a4d068	mov w1,#0x85
00a4d06c	mov x0,x27
00a4d070	mov x2,xzr
00a4d074	mov x3,xzr
00a4d078	bl 0x00c321a0
00a4d07c	sxtw x8,w0
00a4d080	cmp x8,x24
00a4d084	b.ne 0x00a4d150
00a4d088	bl 0x00c35250
00a4d08c	str x25,[sp, #0x28]
00a4d090	ldrb w8,[x19, #0x20]
00a4d094	ldrb w9,[sp, #0x38]
00a4d098	adrp x5,0xcb5000
00a4d09c	adrp x3,0xa4c000
00a4d0a0	and w8,w8,#0x4
00a4d0a4	and w9,w9,#0xfffffffb
00a4d0a8	orr w8,w9,w8
00a4d0ac	strb w8,[sp, #0x38]
00a4d0b0	ldr x8,[sp, #0x18]
00a4d0b4	ldr x9,[x26, #0x70]
00a4d0b8	add x4,sp,#0x18
00a4d0bc	mov x0,x28
00a4d0c0	ldr w2,[x8, #0x10]
00a4d0c4	ldr x5,[x5, #0x5a0]
00a4d0c8	add x6,x8,#0x38
00a4d0cc	mov x1,x22
00a4d0d0	add x3,x3,#0xdd0
00a4d0d4	blr x9
00a4d0d8	ldrb w8,[sp, #0x38]
00a4d0dc	ldrb w9,[x19, #0x20]
00a4d0e0	mov w23,w0
00a4d0e4	and w8,w8,#0x2
00a4d0e8	and w9,w9,#0xfffffffd
00a4d0ec	orr w9,w9,w8
00a4d0f0	strb w9,[x19, #0x20]
00a4d0f4	cbz w0,0x00a4d1bc
00a4d0f8	cbnz w8,0x00a4d1bc
00a4d0fc	bl 0x00c35240
00a4d100	ldrb w8,[sp, #0x38]
00a4d104	tbnz w8,#0x0,0x00a4d150
00a4d108	sub x25,x25,#0x1
00a4d10c	cmn x25,#0x1
00a4d110	b.ne 0x00a4cfa8
00a4d114	b 0x00a4d150
00a4d118	bl 0x00c342a0
00a4d11c	adrp x0,0x2bd000
00a4d120	adrp x2,0x2b5000
00a4d124	add x0,x0,#0x9db
00a4d128	add x2,x2,#0xbda
00a4d12c	mov w1,#0x330
00a4d130	bl 0x00c342b0
00a4d134	mov w1,#0x20
00a4d138	orr w0,wzr,#0x3c
00a4d13c	movk w1,#0x8, LSL #16
00a4d140	mov x2,xzr
00a4d144	bl 0x00c342c0
00a4d148	mov w23,wzr
00a4d14c	mov x22,xzr
00a4d150	mov x0,x22
00a4d154	bl 0x00c38850
00a4d158	ldr x0,[sp, #0x20]
00a4d15c	bl 0x00c31a40
00a4d160	mov w0,w23
00a4d164	ldp x29,x30,[sp, #0x90]
00a4d168	ldp x20,x19,[sp, #0x80]
00a4d16c	ldp x22,x21,[sp, #0x70]
00a4d170	ldp x24,x23,[sp, #0x60]
00a4d174	ldp x26,x25,[sp, #0x50]
00a4d178	ldp x28,x27,[sp, #0x40]
00a4d17c	add sp,sp,#0xa0
00a4d180	ret
00a4d184	bl 0x00c342a0
00a4d188	adrp x0,0x2bd000
00a4d18c	adrp x2,0x2b5000
00a4d190	add x0,x0,#0x9db
00a4d194	add x2,x2,#0xbda
00a4d198	mov w1,#0x335
00a4d19c	bl 0x00c342b0
00a4d1a0	mov w1,#0x100
00a4d1a4	orr w0,wzr,#0x3c
00a4d1a8	movk w1,#0xc, LSL #16
00a4d1ac	mov x2,xzr
00a4d1b0	bl 0x00c342c0
00a4d1b4	mov w23,wzr
00a4d1b8	b 0x00a4d150
00a4d1bc	bl 0x00c35ed0
00a4d1c0	b 0x00a4d150
