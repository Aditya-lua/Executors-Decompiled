; FUN_00a5cd0c @ 00a5cd0c
00a5cd0c	stp x24,x23,[sp, #-0x40]!
00a5cd10	stp x22,x21,[sp, #0x10]
00a5cd14	stp x20,x19,[sp, #0x20]
00a5cd18	stp x29,x30,[sp, #0x30]
00a5cd1c	ldr x24,[x1, #0x10]
00a5cd20	mov x21,x1
00a5cd24	adrp x1,0x2a5000
00a5cd28	mov x20,x2
00a5cd2c	mov w22,w0
00a5cd30	add x1,x1,#0xf9d
00a5cd34	mov w0,#0x100
00a5cd38	mov w2,#0x5c5
00a5cd3c	add x29,sp,#0x30
00a5cd40	bl 0x00c34250
00a5cd44	cbz x0,0x00a5cf80
00a5cd48	mov x19,x0
00a5cd4c	bl 0x00c34d50
00a5cd50	str x0,[x19, #0x88]
00a5cd54	cbz x0,0x00a5cf6c
00a5cd58	adrp x2,0xa5d000
00a5cd5c	add x23,x19,#0x80
00a5cd60	mov w8,#0x1
00a5cd64	add x2,x2,#0x2f0
00a5cd68	mov x0,x20
00a5cd6c	mov w1,w22
00a5cd70	mov x3,x19
00a5cd74	stlr w8,[x23]
00a5cd78	str wzr,[x19]
00a5cd7c	bl 0x00c3bfa0
00a5cd80	cbz w0,0x00a5cf10
00a5cd84	ldr w8,[x19]
00a5cd88	cmn w8,#0x1
00a5cd8c	b.eq 0x00a5cf10
00a5cd90	mov x0,x21
00a5cd94	str w22,[x19, #0x60]
00a5cd98	bl 0x00c3b4e0
00a5cd9c	str x0,[x19, #0x68]
00a5cda0	cbz x0,0x00a5cfe0
00a5cda4	ldr x11,[x21, #0x18]
00a5cda8	mov w9,wzr
00a5cdac	mov w8,wzr
00a5cdb0	add x10,x24,#0x8
00a5cdb4	str x11,[x19, #0x70]
00a5cdb8	adrp x11,0x766000
00a5cdbc	add x11,x11,#0x28c
00a5cdc0	b 0x00a5cdc8
00a5cdc4	add x10,x10,#0x10
00a5cdc8	ldur w12,[x10, #-0x8]
00a5cdcc	cmp w12,#0xe
00a5cdd0	b.hi 0x00a5cdc4
00a5cdd4	ldrsw x12,[x11, x12, LSL #0x2]
00a5cdd8	add x12,x12,x11
00a5cddc	br x12
00a5cde0	ldr x12,[x19, #0x90]
00a5cde4	cbnz x12,0x00a5cdc4
00a5cde8	ldr x12,[x10], #0x10
00a5cdec	add w8,w8,#0x1
00a5cdf0	str x12,[x19, #0x90]
00a5cdf4	b 0x00a5cdc8
00a5cdf8	ldr x12,[x19, #0x98]
00a5cdfc	cbnz x12,0x00a5cdc4
00a5ce00	ldr x12,[x10], #0x10
00a5ce04	add w9,w9,#0x1
00a5ce08	str x12,[x19, #0x98]
00a5ce0c	b 0x00a5cdc8
00a5ce10	ldr x12,[x19, #0xa0]
00a5ce14	cbnz x12,0x00a5cdc4
00a5ce18	ldr x12,[x10], #0x10
00a5ce1c	add w9,w9,#0x1
00a5ce20	str x12,[x19, #0xa0]
00a5ce24	b 0x00a5cdc8
00a5ce28	ldr x12,[x19, #0xa8]
00a5ce2c	cbnz x12,0x00a5cdc4
00a5ce30	ldr x12,[x10], #0x10
00a5ce34	add w9,w9,#0x1
00a5ce38	str x12,[x19, #0xa8]
00a5ce3c	b 0x00a5cdc8
00a5ce40	ldr x12,[x19, #0xb0]
00a5ce44	cbnz x12,0x00a5cdc4
00a5ce48	ldr x12,[x10], #0x10
00a5ce4c	add w9,w9,#0x1
00a5ce50	str x12,[x19, #0xb0]
00a5ce54	b 0x00a5cdc8
00a5ce58	ldr x12,[x19, #0xb8]
00a5ce5c	cbnz x12,0x00a5cdc4
00a5ce60	ldr x12,[x10], #0x10
00a5ce64	str x12,[x19, #0xb8]
00a5ce68	b 0x00a5cdc8
00a5ce6c	ldr x12,[x19, #0xc0]
00a5ce70	cbnz x12,0x00a5cdc4
00a5ce74	ldr x12,[x10], #0x10
00a5ce78	add w8,w8,#0x1
00a5ce7c	str x12,[x19, #0xc0]
00a5ce80	b 0x00a5cdc8
00a5ce84	ldr x12,[x19, #0xc8]
00a5ce88	cbnz x12,0x00a5cdc4
00a5ce8c	ldr x12,[x10], #0x10
00a5ce90	str x12,[x19, #0xc8]
00a5ce94	b 0x00a5cdc8
00a5ce98	ldr x12,[x19, #0xd0]
00a5ce9c	cbnz x12,0x00a5cdc4
00a5cea0	ldr x12,[x10], #0x10
00a5cea4	str x12,[x19, #0xd0]
00a5cea8	b 0x00a5cdc8
00a5ceac	ldr x12,[x19, #0xd8]
00a5ceb0	cbnz x12,0x00a5cdc4
00a5ceb4	ldr x12,[x10], #0x10
00a5ceb8	str x12,[x19, #0xd8]
00a5cebc	b 0x00a5cdc8
00a5cec0	ldr x12,[x19, #0xe0]
00a5cec4	cbnz x12,0x00a5cdc4
00a5cec8	ldr x12,[x10], #0x10
00a5cecc	str x12,[x19, #0xe0]
00a5ced0	b 0x00a5cdc8
00a5ced4	ldr x12,[x19, #0xe8]
00a5ced8	cbnz x12,0x00a5cdc4
00a5cedc	ldr x12,[x10], #0x10
00a5cee0	str x12,[x19, #0xe8]
00a5cee4	b 0x00a5cdc8
00a5cee8	ldr x12,[x19, #0xf0]
00a5ceec	cbnz x12,0x00a5cdc4
00a5cef0	ldr x12,[x10], #0x10
00a5cef4	str x12,[x19, #0xf0]
00a5cef8	b 0x00a5cdc8
00a5cefc	ldr x12,[x19, #0xf8]
00a5cf00	cbnz x12,0x00a5cdc4
00a5cf04	ldr x12,[x10]
00a5cf08	str x12,[x19, #0xf8]
00a5cf0c	b 0x00a5cdc4
00a5cf10	bl 0x00c342a0
00a5cf14	adrp x0,0x2a5000
00a5cf18	adrp x2,0x2af000
00a5cf1c	add x0,x0,#0xf9d
00a5cf20	add x2,x2,#0xf60
00a5cf24	mov w1,#0x602
00a5cf28	bl 0x00c342b0
00a5cf2c	mov w8,#0x100
00a5cf30	movk w8,#0xc, LSL #16
00a5cf34	add w1,w8,#0x3
00a5cf38	orr w0,wzr,#0x6
00a5cf3c	mov x2,xzr
00a5cf40	bl 0x00c342c0
00a5cf44	ldr w8,[x19, #0x18]
00a5cf48	mov x0,xzr
00a5cf4c	cbnz w8,0x00a5cfb4
00a5cf50	ldxr w8,[x23]
00a5cf54	subs w9,w8,#0x1
00a5cf58	stxr w10,w9,[x23]
00a5cf5c	cbnz w10,0x00a5cf50
00a5cf60	b.ne 0x00a5d068
00a5cf64	dmb ISHLD
00a5cf68	b 0x00a5d074
00a5cf6c	adrp x1,0x2a5000
00a5cf70	add x1,x1,#0xf9d
00a5cf74	mov w2,#0x5ca
00a5cf78	mov x0,x19
00a5cf7c	bl 0x00c32310
00a5cf80	bl 0x00c342a0
00a5cf84	adrp x0,0x2a5000
00a5cf88	adrp x2,0x2af000
00a5cf8c	add x0,x0,#0xf9d
00a5cf90	add x2,x2,#0xf60
00a5cf94	mov w1,#0x5fa
00a5cf98	bl 0x00c342b0
00a5cf9c	mov w1,#0x100
00a5cfa0	orr w0,wzr,#0x6
00a5cfa4	movk w1,#0xc, LSL #16
00a5cfa8	mov x2,xzr
00a5cfac	bl 0x00c342c0
00a5cfb0	mov x0,xzr
00a5cfb4	ldp x29,x30,[sp, #0x30]
00a5cfb8	ldp x20,x19,[sp, #0x20]
00a5cfbc	ldp x22,x21,[sp, #0x10]
00a5cfc0	ldp x24,x23,[sp], #0x40
00a5cfc4	ret
00a5cfc8	sub w10,w9,#0x3
00a5cfcc	cmp w10,#0x2
00a5cfd0	b.cs 0x00a5d008
00a5cfd4	cmp w8,#0x2
00a5cfd8	b.eq 0x00a5d01c
00a5cfdc	b 0x00a5d040
00a5cfe0	ldr w8,[x19, #0x18]
00a5cfe4	cbnz w8,0x00a5cfb4
00a5cfe8	ldxr w9,[x23]
00a5cfec	subs w8,w9,#0x1
00a5cff0	stxr w10,w8,[x23]
00a5cff4	cbnz w10,0x00a5cfe8
00a5cff8	b.ne 0x00a5d138
00a5cffc	dmb ISHLD
00a5d000	ldr x8,[x19, #0x68]
00a5d004	b 0x00a5d148
00a5d008	cbnz w9,0x00a5d040
00a5d00c	cmp w8,#0x2
00a5d010	b.ne 0x00a5d040
00a5d014	ldr x8,[x19, #0xb8]
00a5d018	cbz x8,0x00a5d040
00a5d01c	str x20,[x19, #0x78]
00a5d020	cbz x20,0x00a5d02c
00a5d024	mov x0,x20
00a5d028	bl 0x00c3b6a0
00a5d02c	mov x0,x19
00a5d030	bl 0x00c3cd30
00a5d034	cbz w0,0x00a5d0b0
00a5d038	mov x0,x19
00a5d03c	b 0x00a5cfb4
00a5d040	ldr w8,[x19, #0x18]
00a5d044	cbnz w8,0x00a5d110
00a5d048	ldxr w8,[x23]
00a5d04c	subs w9,w8,#0x1
00a5d050	stxr w10,w9,[x23]
00a5d054	cbnz w10,0x00a5d048
00a5d058	b.ne 0x00a5d0d4
00a5d05c	dmb ISHLD
00a5d060	ldr x0,[x19, #0x68]
00a5d064	b 0x00a5d0dc
00a5d068	cmp w8,#0x1
00a5d06c	mov x0,xzr
00a5d070	b.gt 0x00a5cfb4
00a5d074	ldr x0,[x19, #0x68]
00a5d078	adrp x20,0x2a5000
00a5d07c	add x20,x20,#0xf9d
00a5d080	mov w2,#0x69b
00a5d084	mov x1,x20
00a5d088	bl 0x00c32310
00a5d08c	ldr x0,[x19, #0x78]
00a5d090	bl 0x00c3b690
00a5d094	ldr x0,[x19, #0x88]
00a5d098	bl 0x00c34d40
00a5d09c	mov w2,#0x69e
00a5d0a0	mov x0,x19
00a5d0a4	mov x1,x20
00a5d0a8	bl 0x00c32310
00a5d0ac	b 0x00a5cfb0
00a5d0b0	ldr w8,[x19, #0x18]
00a5d0b4	cbnz w8,0x00a5d19c
00a5d0b8	ldxr w8,[x23]
00a5d0bc	subs w9,w8,#0x1
00a5d0c0	stxr w10,w9,[x23]
00a5d0c4	cbnz w10,0x00a5d0b8
00a5d0c8	b.ne 0x00a5d15c
00a5d0cc	dmb ISHLD
00a5d0d0	b 0x00a5d164
00a5d0d4	cmp w8,#0x1
00a5d0d8	b.gt 0x00a5d110
00a5d0dc	adrp x20,0x2a5000
00a5d0e0	add x20,x20,#0xf9d
00a5d0e4	mov w2,#0x69b
00a5d0e8	mov x1,x20
00a5d0ec	bl 0x00c32310
00a5d0f0	ldr x0,[x19, #0x78]
00a5d0f4	bl 0x00c3b690
00a5d0f8	ldr x0,[x19, #0x88]
00a5d0fc	bl 0x00c34d40
00a5d100	mov w2,#0x69e
00a5d104	mov x0,x19
00a5d108	mov x1,x20
00a5d10c	bl 0x00c32310
00a5d110	bl 0x00c342a0
00a5d114	adrp x0,0x2a5000
00a5d118	adrp x2,0x2af000
00a5d11c	add x0,x0,#0xf9d
00a5d120	add x2,x2,#0xf60
00a5d124	mov w1,#0x66b
00a5d128	bl 0x00c342b0
00a5d12c	orr w0,wzr,#0x6
00a5d130	mov w1,#0xc1
00a5d134	b 0x00a5cfa8
00a5d138	mov x8,xzr
00a5d13c	cmp w9,#0x1
00a5d140	mov x0,xzr
00a5d144	b.gt 0x00a5cfb4
00a5d148	adrp x20,0x2a5000
00a5d14c	add x20,x20,#0xf9d
00a5d150	mov w2,#0x69b
00a5d154	mov x0,x8
00a5d158	b 0x00a5d084
00a5d15c	cmp w8,#0x1
00a5d160	b.gt 0x00a5d19c
00a5d164	ldr x0,[x19, #0x68]
00a5d168	adrp x20,0x2a5000
00a5d16c	add x20,x20,#0xf9d
00a5d170	mov w2,#0x69b
00a5d174	mov x1,x20
00a5d178	bl 0x00c32310
00a5d17c	ldr x0,[x19, #0x78]
00a5d180	bl 0x00c3b690
00a5d184	ldr x0,[x19, #0x88]
00a5d188	bl 0x00c34d40
00a5d18c	mov w2,#0x69e
00a5d190	mov x0,x19
00a5d194	mov x1,x20
00a5d198	bl 0x00c32310
00a5d19c	bl 0x00c342a0
00a5d1a0	adrp x0,0x2a5000
00a5d1a4	adrp x2,0x2af000
00a5d1a8	add x0,x0,#0xf9d
00a5d1ac	add x2,x2,#0xf60
00a5d1b0	mov w1,#0x674
00a5d1b4	bl 0x00c342b0
00a5d1b8	orr w0,wzr,#0x6
00a5d1bc	mov w1,#0xe1
00a5d1c0	b 0x00a5cfa8
