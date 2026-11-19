; FUN_00b4cea0 @ 00b4cea0
00b4cea0	stp x22,x21,[sp, #-0x30]!
00b4cea4	stp x20,x19,[sp, #0x10]
00b4cea8	stp x29,x30,[sp, #0x20]
00b4ceac	add x29,sp,#0x20
00b4ceb0	cbz x0,0x00b4cff4
00b4ceb4	mov x20,x1
00b4ceb8	cbz x1,0x00b4cfb8
00b4cebc	adrp x1,0x2ce000
00b4cec0	mov x19,x0
00b4cec4	add x1,x1,#0xcd9
00b4cec8	mov x0,x20
00b4cecc	bl 0x00c36530
00b4ced0	cbz x0,0x00b4cf3c
00b4ced4	ldr w8,[x0, #0x8]
00b4ced8	cmp w8,#0x4
00b4cedc	b.ne 0x00b4cf14
00b4cee0	ldr x22,[x0, #0x10]
00b4cee4	ldr w21,[x19, #0x70]
00b4cee8	adrp x1,0x2c1000
00b4ceec	add x1,x1,#0x1ad
00b4cef0	mov x0,x22
00b4cef4	bl 0x00c301f0
00b4cef8	cbz w0,0x00b4cf30
00b4cefc	mov x0,x22
00b4cf00	mov w1,w21
00b4cf04	bl 0x00c3c140
00b4cf08	cmn w0,#0x1
00b4cf0c	str w0,[x19, #0x3c]
00b4cf10	b.ne 0x00b4cf3c
00b4cf14	bl 0x00c342a0
00b4cf18	adrp x0,0x2b0000
00b4cf1c	adrp x2,0x2c2000
00b4cf20	add x0,x0,#0xe65
00b4cf24	add x2,x2,#0xafa
00b4cf28	mov w1,#0x21a
00b4cf2c	b 0x00b4cfd8
00b4cf30	cmp w21,#0x1, LSL #12
00b4cf34	cset w8,eq
00b4cf38	str w8,[x19, #0x3c]
00b4cf3c	adrp x1,0x2a2000
00b4cf40	add x1,x1,#0x238
00b4cf44	mov x0,x20
00b4cf48	bl 0x00c36530
00b4cf4c	cbz x0,0x00b4cf78
00b4cf50	ldr w8,[x0, #0x8]
00b4cf54	cmp w8,#0x4
00b4cf58	b.ne 0x00b4cfc0
00b4cf5c	ldr x0,[x0, #0x10]
00b4cf60	cbz x0,0x00b4cfc0
00b4cf64	bl 0x00c3dca0
00b4cf68	cbz x0,0x00b4cfc0
00b4cf6c	bl 0x00c39f20
00b4cf70	str w0,[x19, #0x14]
00b4cf74	cbz w0,0x00b4cfc0
00b4cf78	adrp x1,0x2aa000
00b4cf7c	add x1,x1,#0x16b
00b4cf80	mov x0,x20
00b4cf84	bl 0x00c36530
00b4cf88	cbz x0,0x00b4cf98
00b4cf8c	add x1,x19,#0x18
00b4cf90	bl 0x00c3e920
00b4cf94	cbz w0,0x00b4cff4
00b4cf98	adrp x1,0x2a5000
00b4cf9c	add x1,x1,#0xce7
00b4cfa0	mov x0,x20
00b4cfa4	bl 0x00c36530
00b4cfa8	cbz x0,0x00b4cfb8
00b4cfac	add x1,x19,#0x4c
00b4cfb0	bl 0x00c36510
00b4cfb4	cbz w0,0x00b4cff4
00b4cfb8	mov w0,#0x1
00b4cfbc	b 0x00b4cff4
00b4cfc0	bl 0x00c342a0
00b4cfc4	adrp x0,0x2b0000
00b4cfc8	adrp x2,0x2c2000
00b4cfcc	add x0,x0,#0xe65
00b4cfd0	add x2,x2,#0xafa
00b4cfd4	mov w1,#0x227
00b4cfd8	bl 0x00c342b0
00b4cfdc	mov w1,#0x106
00b4cfe0	mov w0,#0x39
00b4cfe4	movk w1,#0x8, LSL #16
00b4cfe8	mov x2,xzr
00b4cfec	bl 0x00c342c0
00b4cff0	mov w0,wzr
00b4cff4	ldp x29,x30,[sp, #0x20]
00b4cff8	ldp x20,x19,[sp, #0x10]
00b4cffc	ldp x22,x21,[sp], #0x30
00b4d000	ret
