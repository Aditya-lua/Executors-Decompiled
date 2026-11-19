; FUN_00a4ea54 @ 00a4ea54
00a4ea54	sub sp,sp,#0xa0
00a4ea58	stp x24,x23,[sp, #0x60]
00a4ea5c	stp x22,x21,[sp, #0x70]
00a4ea60	stp x20,x19,[sp, #0x80]
00a4ea64	stp x29,x30,[sp, #0x90]
00a4ea68	mov x22,x0
00a4ea6c	ldr x0,[x0]
00a4ea70	mov x21,x2
00a4ea74	adrp x2,0xc5d000
00a4ea78	mov w20,w1
00a4ea7c	add x2,x2,#0x58
00a4ea80	mov w1,#0xb
00a4ea84	str x25,[sp, #0x50]
00a4ea88	add x29,sp,#0x90
00a4ea8c	mov x19,x3
00a4ea90	bl 0x00c3b520
00a4ea94	ldr x8,[x22]
00a4ea98	mov x24,x0
00a4ea9c	mov x0,x8
00a4eaa0	bl 0x00c3b650
00a4eaa4	adrp x8,0x2ab000
00a4eaa8	add x8,x8,#0x32c
00a4eaac	cmp x19,#0x0
00a4eab0	csel x25,x8,x19,eq
00a4eab4	stur xzr,[x29, #-0x38]
00a4eab8	cbz x24,0x00a4eaf8
00a4eabc	mov x23,x0
00a4eac0	cbz x0,0x00a4eaf8
00a4eac4	cbz w20,0x00a4eb48
00a4eac8	cbz x21,0x00a4eb48
00a4eacc	bl 0x00c342a0
00a4ead0	adrp x0,0x2db000
00a4ead4	adrp x2,0x2b9000
00a4ead8	add x0,x0,#0xf32
00a4eadc	add x2,x2,#0xcd9
00a4eae0	mov w1,#0x17d
00a4eae4	bl 0x00c342b0
00a4eae8	mov w1,#0x103
00a4eaec	orr w0,wzr,#0x3c
00a4eaf0	movk w1,#0xc, LSL #16
00a4eaf4	b 0x00a4eb20
00a4eaf8	bl 0x00c342a0
00a4eafc	adrp x0,0x2db000
00a4eb00	adrp x2,0x2b9000
00a4eb04	add x0,x0,#0xf32
00a4eb08	add x2,x2,#0xcd9
00a4eb0c	mov w1,#0x174
00a4eb10	bl 0x00c342b0
00a4eb14	mov w1,#0x106
00a4eb18	orr w0,wzr,#0x3c
00a4eb1c	movk w1,#0x8, LSL #16
00a4eb20	mov x2,xzr
00a4eb24	bl 0x00c342c0
00a4eb28	mov x0,xzr
00a4eb2c	ldp x29,x30,[sp, #0x90]
00a4eb30	ldp x20,x19,[sp, #0x80]
00a4eb34	ldp x22,x21,[sp, #0x70]
00a4eb38	ldp x24,x23,[sp, #0x60]
00a4eb3c	ldr x25,[sp, #0x50]
00a4eb40	add sp,sp,#0xa0
00a4eb44	ret
00a4eb48	cbnz w20,0x00a4eb60
00a4eb4c	cbz x21,0x00a4eb60
00a4eb50	mov x0,x23
00a4eb54	mov x1,x21
00a4eb58	bl 0x00c3b620
00a4eb5c	mov w20,w0
00a4eb60	cbz w20,0x00a4eb88
00a4eb64	sub x4,x29,#0x38
00a4eb68	mov x0,x24
00a4eb6c	mov x1,xzr
00a4eb70	mov w2,w20
00a4eb74	mov x3,x25
00a4eb78	bl 0x00c3b580
00a4eb7c	cbz w0,0x00a4eb88
00a4eb80	mov w8,wzr
00a4eb84	b 0x00a4ec34
00a4eb88	adrp x8,0xc5d000
00a4eb8c	add x8,x8,#0x20
00a4eb90	ldp q1,q0,[x8, #0x10]
00a4eb94	ldr q2,[x8]
00a4eb98	ldr x8,[x8, #0x30]
00a4eb9c	str xzr,[sp, #0x8]
00a4eba0	stp q1,q0,[sp, #0x20]
00a4eba4	str q2,[sp, #0x10]
00a4eba8	str x8,[sp, #0x40]
00a4ebac	ldrb w8,[x22, #0x28]
00a4ebb0	ldr x0,[x22]
00a4ebb4	mov w1,#0x15
00a4ebb8	add x2,sp,#0x8
00a4ebbc	and w8,w8,#0xfe
00a4ebc0	add x4,sp,#0x10
00a4ebc4	mov w3,wzr
00a4ebc8	mov x5,x22
00a4ebcc	str w20,[x22, #0x8]
00a4ebd0	stp x21,x25,[x22, #0x10]
00a4ebd4	strb w8,[x22, #0x28]
00a4ebd8	bl 0x00c3b540
00a4ebdc	stur x0,[x29, #-0x38]
00a4ebe0	cbz x0,0x00a4ec28
00a4ebe4	cbz x21,0x00a4ebfc
00a4ebe8	cbnz w20,0x00a4ebfc
00a4ebec	mov x0,x23
00a4ebf0	mov x1,x21
00a4ebf4	bl 0x00c3b620
00a4ebf8	mov w20,w0
00a4ebfc	cbz w20,0x00a4ec28
00a4ec00	ldr x1,[sp, #0x8]
00a4ec04	ldur x4,[x29, #-0x38]
00a4ec08	adrp x5,0xa4f000
00a4ec0c	adrp x6,0xa4f000
00a4ec10	add x5,x5,#0x600
00a4ec14	add x6,x6,#0x61c
00a4ec18	mov x0,x24
00a4ec1c	mov w2,w20
00a4ec20	mov x3,x25
00a4ec24	bl 0x00c3b590
00a4ec28	ldrb w8,[x22, #0x28]
00a4ec2c	mvn w8,w8
00a4ec30	and w8,w8,#0x1
00a4ec34	ldur x0,[x29, #-0x38]
00a4ec38	cmp w20,#0x0
00a4ec3c	ccmp x21,#0x0,#0x0,eq
00a4ec40	b.eq 0x00a4eb2c
00a4ec44	cbnz x0,0x00a4eb2c
00a4ec48	mov w9,#0x106
00a4ec4c	movk w9,#0x8, LSL #16
00a4ec50	add w10,w9,#0x6
00a4ec54	add w9,w9,#0x7
00a4ec58	cmp w8,#0x0
00a4ec5c	csel w24,w9,w10,eq
00a4ec60	cbnz x21,0x00a4ec78
00a4ec64	mov x0,x23
00a4ec68	mov w1,w20
00a4ec6c	mov x2,xzr
00a4ec70	bl 0x00c3b640
00a4ec74	mov x21,x0
00a4ec78	bl 0x00c342a0
00a4ec7c	adrp x0,0x2db000
00a4ec80	adrp x2,0x2b9000
00a4ec84	add x0,x0,#0xf32
00a4ec88	add x2,x2,#0xcd9
00a4ec8c	mov w1,#0x1b8
00a4ec90	bl 0x00c342b0
00a4ec94	ldr x0,[x22]
00a4ec98	bl 0x00c3b530
00a4ec9c	adrp x8,0x2cb000
00a4eca0	add x8,x8,#0x889
00a4eca4	cmp x21,#0x0
00a4eca8	csel x4,x8,x21,eq
00a4ecac	cmp x19,#0x0
00a4ecb0	adrp x2,0x2a7000
00a4ecb4	mov x3,x0
00a4ecb8	csel x6,x8,x19,eq
00a4ecbc	add x2,x2,#0xeca
00a4ecc0	orr w0,wzr,#0x3c
00a4ecc4	mov w1,w24
00a4ecc8	mov w5,w20
00a4eccc	bl 0x00c342c0
00a4ecd0	ldur x0,[x29, #-0x38]
00a4ecd4	b 0x00a4eb2c
