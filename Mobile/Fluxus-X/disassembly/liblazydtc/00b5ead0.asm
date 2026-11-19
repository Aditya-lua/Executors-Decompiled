; FUN_00b5ead0 @ 00b5ead0
00b5ead0	sub sp,sp,#0x50
00b5ead4	stp x24,x23,[sp, #0x10]
00b5ead8	stp x22,x21,[sp, #0x20]
00b5eadc	stp x20,x19,[sp, #0x30]
00b5eae0	stp x29,x30,[sp, #0x40]
00b5eae4	add x29,sp,#0x40
00b5eae8	mov x21,x4
00b5eaec	mov x19,x3
00b5eaf0	mov x22,x2
00b5eaf4	mov x23,x1
00b5eaf8	mov x20,x0
00b5eafc	bl 0x00c41000
00b5eb00	cbz w0,0x00b5ed50
00b5eb04	ldr x0,[x20, #0x20]
00b5eb08	cbz x0,0x00b5eb64
00b5eb0c	ldr w8,[x20, #0x68]
00b5eb10	cmp w8,#0x6
00b5eb14	b.eq 0x00b5ebbc
00b5eb18	cmp w8,#0x5
00b5eb1c	b.eq 0x00b5ec44
00b5eb20	cmp w8,#0x1
00b5eb24	b.ne 0x00b5ecc0
00b5eb28	ldr w0,[x20, #0x30]
00b5eb2c	ldr x5,[x20, #0x10]
00b5eb30	mov x1,x19
00b5eb34	mov w2,w21
00b5eb38	mov x3,x23
00b5eb3c	mov w4,w22
00b5eb40	bl 0x00c40010
00b5eb44	cbnz w0,0x00b5ec3c
00b5eb48	bl 0x00c342a0
00b5eb4c	adrp x0,0x2a3000
00b5eb50	adrp x2,0x2a1000
00b5eb54	add x0,x0,#0x265
00b5eb58	add x2,x2,#0x108
00b5eb5c	mov w1,#0x306
00b5eb60	b 0x00b5ed08
00b5eb64	ldr x2,[x20, #0xb8]
00b5eb68	cbnz x2,0x00b5eb94
00b5eb6c	ldr x0,[x20, #0x10]
00b5eb70	bl 0x00c3fab0
00b5eb74	adrp x1,0x2a3000
00b5eb78	sxtw x0,w0
00b5eb7c	add x1,x1,#0x265
00b5eb80	mov w2,#0x1e7
00b5eb84	bl 0x00c32320
00b5eb88	mov x2,x0
00b5eb8c	str x0,[x20, #0xb8]
00b5eb90	cbz x0,0x00b5ed1c
00b5eb94	ldr x3,[x20, #0x10]
00b5eb98	ldr w4,[x20, #0x68]
00b5eb9c	mov w0,w22
00b5eba0	mov x1,x23
00b5eba4	bl 0x00c3fdf0
00b5eba8	cmp w0,#0x0
00b5ebac	b.le 0x00b5ecf0
00b5ebb0	sxtw x8,w0
00b5ebb4	str x8,[sp, #0x8]
00b5ebb8	b 0x00b5ec98
00b5ebbc	bl 0x00c34c20
00b5ebc0	sxtw x24,w0
00b5ebc4	cmp x24,x21
00b5ebc8	b.ne 0x00b5ed68
00b5ebcc	ldr x2,[x20, #0xb8]
00b5ebd0	cbnz x2,0x00b5ebfc
00b5ebd4	ldr x0,[x20, #0x10]
00b5ebd8	bl 0x00c3fab0
00b5ebdc	adrp x1,0x2a3000
00b5ebe0	sxtw x0,w0
00b5ebe4	add x1,x1,#0x265
00b5ebe8	mov w2,#0x1e7
00b5ebec	bl 0x00c32320
00b5ebf0	mov x2,x0
00b5ebf4	str x0,[x20, #0xb8]
00b5ebf8	cbz x0,0x00b5ed1c
00b5ebfc	ldr x3,[x20, #0x10]
00b5ec00	orr w4,wzr,#0x3
00b5ec04	mov w0,w22
00b5ec08	mov x1,x23
00b5ec0c	bl 0x00c3fdf0
00b5ec10	cmp w0,#0x0
00b5ec14	b.le 0x00b5eda4
00b5ec18	ldr x0,[x20, #0x10]
00b5ec1c	ldr x2,[x20, #0x20]
00b5ec20	ldr x3,[x20, #0x70]
00b5ec24	ldr x4,[x20, #0xb8]
00b5ec28	ldr w5,[x20, #0xb0]
00b5ec2c	mov x1,x19
00b5ec30	bl 0x00c40020
00b5ec34	cmp w0,#0x0
00b5ec38	b.le 0x00b5edc0
00b5ec3c	mov w0,#0x1
00b5ec40	b 0x00b5ed50
00b5ec44	ldr x1,[x20, #0xb8]
00b5ec48	cbnz x1,0x00b5ec74
00b5ec4c	ldr x0,[x20, #0x10]
00b5ec50	bl 0x00c3fab0
00b5ec54	adrp x1,0x2a3000
00b5ec58	sxtw x0,w0
00b5ec5c	add x1,x1,#0x265
00b5ec60	mov w2,#0x1e7
00b5ec64	bl 0x00c32320
00b5ec68	mov x1,x0
00b5ec6c	str x0,[x20, #0xb8]
00b5ec70	cbz x0,0x00b5ed1c
00b5ec74	add x2,sp,#0x8
00b5ec78	mov x0,x20
00b5ec7c	mov x3,xzr
00b5ec80	mov x4,x23
00b5ec84	mov x5,x22
00b5ec88	bl 0x00b5ee30
00b5ec8c	cmp w0,#0x1
00b5ec90	b.lt 0x00b5ed4c
00b5ec94	ldr x8,[sp, #0x8]
00b5ec98	cmp x8,x21
00b5ec9c	mov w0,wzr
00b5eca0	b.ne 0x00b5ed50
00b5eca4	ldr x1,[x20, #0xb8]
00b5eca8	mov x0,x19
00b5ecac	mov x2,x21
00b5ecb0	bl 0x00c300b0
00b5ecb4	cmp w0,#0x0
00b5ecb8	cset w0,eq
00b5ecbc	b 0x00b5ed50
00b5ecc0	bl 0x00c342a0
00b5ecc4	adrp x0,0x2a3000
00b5ecc8	adrp x2,0x2a1000
00b5eccc	add x0,x0,#0x265
00b5ecd0	add x2,x2,#0x108
00b5ecd4	mov w1,#0x335
00b5ecd8	bl 0x00c342b0
00b5ecdc	adrp x2,0x2b6000
00b5ece0	add x2,x2,#0xa2c
00b5ece4	mov w0,#0x39
00b5ece8	mov w1,#0xa8
00b5ecec	b 0x00b5ed48
00b5ecf0	bl 0x00c342a0
00b5ecf4	adrp x0,0x2a3000
00b5ecf8	adrp x2,0x2a1000
00b5ecfc	add x0,x0,#0x265
00b5ed00	add x2,x2,#0x108
00b5ed04	mov w1,#0x341
00b5ed08	bl 0x00c342b0
00b5ed0c	mov w1,#0x4
00b5ed10	mov w0,#0x39
00b5ed14	movk w1,#0x8, LSL #16
00b5ed18	b 0x00b5ed44
00b5ed1c	bl 0x00c342a0
00b5ed20	adrp x0,0x2a3000
00b5ed24	adrp x2,0x2c2000
00b5ed28	add x0,x0,#0x265
00b5ed2c	add x2,x2,#0x3a7
00b5ed30	mov w1,#0x1e8
00b5ed34	bl 0x00c342b0
00b5ed38	mov w1,#0x100
00b5ed3c	mov w0,#0x39
00b5ed40	movk w1,#0xc, LSL #16
00b5ed44	mov x2,xzr
00b5ed48	bl 0x00c342c0
00b5ed4c	mov w0,wzr
00b5ed50	ldp x29,x30,[sp, #0x40]
00b5ed54	ldp x20,x19,[sp, #0x30]
00b5ed58	ldp x22,x21,[sp, #0x20]
00b5ed5c	ldp x24,x23,[sp, #0x10]
00b5ed60	add sp,sp,#0x50
00b5ed64	ret
00b5ed68	bl 0x00c342a0
00b5ed6c	adrp x0,0x2a3000
00b5ed70	adrp x2,0x2a1000
00b5ed74	add x0,x0,#0x265
00b5ed78	add x2,x2,#0x108
00b5ed7c	mov w1,#0x31c
00b5ed80	bl 0x00c342b0
00b5ed84	adrp x2,0x29e000
00b5ed88	add x2,x2,#0xf86
00b5ed8c	mov w0,#0x39
00b5ed90	mov w1,#0xa6
00b5ed94	mov x3,x24
00b5ed98	mov x4,x21
00b5ed9c	bl 0x00c342c0
00b5eda0	b 0x00b5ed4c
00b5eda4	bl 0x00c342a0
00b5eda8	adrp x0,0x2a3000
00b5edac	adrp x2,0x2a1000
00b5edb0	add x0,x0,#0x265
00b5edb4	add x2,x2,#0x108
00b5edb8	mov w1,#0x327
00b5edbc	b 0x00b5ed08
00b5edc0	bl 0x00c342a0
00b5edc4	adrp x0,0x2a3000
00b5edc8	adrp x2,0x2a1000
00b5edcc	add x0,x0,#0x265
00b5edd0	add x2,x2,#0x108
00b5edd4	mov w1,#0x32f
00b5edd8	b 0x00b5ed08
