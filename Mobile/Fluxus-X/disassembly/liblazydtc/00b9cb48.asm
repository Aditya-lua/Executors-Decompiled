; mbedtls_hmac_drbg_self_test @ 00b9cb48
00b9cb48	stp x28,x27,[sp, #-0x60]!
00b9cb4c	stp x26,x25,[sp, #0x10]
00b9cb50	stp x24,x23,[sp, #0x20]
00b9cb54	stp x22,x21,[sp, #0x30]
00b9cb58	stp x20,x19,[sp, #0x40]
00b9cb5c	stp x29,x30,[sp, #0x50]
00b9cb60	add x29,sp,#0x50
00b9cb64	sub sp,sp,#0x260
00b9cb68	mrs x25,tpidr_el0
00b9cb6c	ldr x8,[x25, #0x28]
00b9cb70	mov w19,w0
00b9cb74	mov w0,#0x5
00b9cb78	stur x8,[x29, #-0x60]
00b9cb7c	bl 0x00c30210
00b9cb80	mov x20,x0
00b9cb84	add x0,sp,#0x50
00b9cb88	mov w2,#0x80
00b9cb8c	mov w1,wzr
00b9cb90	bl 0x00c301c0
00b9cb94	mov w8,#0x2710
00b9cb98	str w8,[sp, #0xbc]
00b9cb9c	cbz w19,0x00b9cbac
00b9cba0	adrp x0,0x2d2000
00b9cba4	add x0,x0,#0x93c
00b9cba8	bl 0x00c41af0
00b9cbac	adrp x26,0xd26000
00b9cbb0	add x0,sp,#0x50
00b9cbb4	mov w2,#0x1
00b9cbb8	mov x1,x20
00b9cbbc	str xzr,[x26, #0x20]
00b9cbc0	add x21,sp,#0x50
00b9cbc4	bl 0x00c42850
00b9cbc8	cbnz w0,0x00b9ce2c
00b9cbcc	mov x0,x20
00b9cbd0	bl 0x00c302d0
00b9cbd4	and x23,x0,#0xff
00b9cbd8	add x21,x21,#0x18
00b9cbdc	add x0,sp,#0x50
00b9cbe0	mov x1,x21
00b9cbe4	mov x2,x23
00b9cbe8	bl 0x00c42970
00b9cbec	cbnz w0,0x00b9ce2c
00b9cbf0	mov w1,#0x1
00b9cbf4	mov x0,x21
00b9cbf8	mov x2,x23
00b9cbfc	bl 0x00c301c0
00b9cc00	ldr x22,[sp, #0xb0]
00b9cc04	adrp x8,0xb9d000
00b9cc08	adrp x28,0x786000
00b9cc0c	add x8,x8,#0x8
00b9cc10	add x28,x28,#0x85c
00b9cc14	stp x8,x28,[sp, #0xc0]
00b9cc18	cbnz x22,0x00b9cc3c
00b9cc1c	cmp w23,#0x1d
00b9cc20	mov w8,#0x20
00b9cc24	orr w9,wzr,#0x18
00b9cc28	csel x8,x9,x8,cc
00b9cc2c	cmp w23,#0x15
00b9cc30	mov w9,#0x10
00b9cc34	csel x22,x9,x8,cc
00b9cc38	str x22,[sp, #0xb0]
00b9cc3c	add x8,x22,x22, LSL #0x1
00b9cc40	cmp x8,#0x301
00b9cc44	b.hi 0x00b9ce2c
00b9cc48	ldr x27,[x26, #0x20]
00b9cc4c	orr w8,wzr,#0x180
00b9cc50	add x9,sp,#0xd0
00b9cc54	cmp x22,#0x17f
00b9cc58	sub x8,x8,x22
00b9cc5c	add x24,x9,x22
00b9cc60	csel x2,xzr,x8,hi
00b9cc64	mov x0,x24
00b9cc68	mov w1,wzr
00b9cc6c	add x23,x28,x27
00b9cc70	bl 0x00c301c0
00b9cc74	add x0,sp,#0xd0
00b9cc78	mov x1,x23
00b9cc7c	mov x2,x22
00b9cc80	bl 0x00c2ffd0
00b9cc84	add x27,x27,x22
00b9cc88	lsr x23,x22,#0x1
00b9cc8c	add x1,x28,x27
00b9cc90	mov x0,x24
00b9cc94	mov x2,x23
00b9cc98	bl 0x00c2ffd0
00b9cc9c	add x22,x23,x22
00b9cca0	add x8,x27,x23
00b9cca4	add x0,sp,#0x50
00b9cca8	add x1,sp,#0xd0
00b9ccac	mov x2,x22
00b9ccb0	str x8,[x26, #0x20]
00b9ccb4	bl 0x00c428c0
00b9ccb8	cbz w0,0x00b9ccd0
00b9ccbc	add x0,sp,#0xd0
00b9ccc0	mov x1,x22
00b9ccc4	bl 0x00c42220
00b9ccc8	cbnz w19,0x00b9ce30
00b9cccc	b 0x00b9ce3c
00b9ccd0	mov w23,#0x1
00b9ccd4	add x0,sp,#0xd0
00b9ccd8	mov x1,x22
00b9ccdc	str w23,[sp, #0xa8]
00b9cce0	bl 0x00c42220
00b9cce4	add x0,sp,#0x50
00b9cce8	mov x1,sp
00b9ccec	mov w2,#0x50
00b9ccf0	mov x3,xzr
00b9ccf4	mov x4,xzr
00b9ccf8	str w23,[sp, #0xb8]
00b9ccfc	bl 0x00c428a0
00b9cd00	cbnz w0,0x00b9ce2c
00b9cd04	add x0,sp,#0x50
00b9cd08	mov x1,sp
00b9cd0c	mov w2,#0x50
00b9cd10	mov x3,xzr
00b9cd14	mov x4,xzr
00b9cd18	bl 0x00c428a0
00b9cd1c	cbnz w0,0x00b9ce2c
00b9cd20	adrp x1,0x786000
00b9cd24	add x1,x1,#0x894
00b9cd28	mov x0,sp
00b9cd2c	mov w2,#0x50
00b9cd30	bl 0x00c300b0
00b9cd34	cbnz w0,0x00b9ce2c
00b9cd38	add x0,sp,#0x50
00b9cd3c	bl 0x00c42830
00b9cd40	add x0,sp,#0x50
00b9cd44	mov w1,#0x80
00b9cd48	bl 0x00c42220
00b9cd4c	mov w22,#0x2710
00b9cd50	add x0,sp,#0x50
00b9cd54	str w22,[sp, #0xbc]
00b9cd58	bl 0x00c42830
00b9cd5c	add x0,sp,#0x50
00b9cd60	mov w1,#0x80
00b9cd64	bl 0x00c42220
00b9cd68	str w22,[sp, #0xbc]
00b9cd6c	cbz w19,0x00b9cd88
00b9cd70	adrp x0,0x77c000
00b9cd74	add x0,x0,#0x87c
00b9cd78	bl 0x00c30760
00b9cd7c	adrp x0,0x2ba000
00b9cd80	add x0,x0,#0xbe6
00b9cd84	bl 0x00c41af0
00b9cd88	add x0,sp,#0x50
00b9cd8c	mov w2,#0x80
00b9cd90	mov w1,wzr
00b9cd94	bl 0x00c301c0
00b9cd98	add x0,sp,#0x50
00b9cd9c	mov w2,#0x1
00b9cda0	mov x1,x20
00b9cda4	str w22,[sp, #0xbc]
00b9cda8	str xzr,[x26, #0x20]
00b9cdac	bl 0x00c42850
00b9cdb0	cbnz w0,0x00b9ce2c
00b9cdb4	mov x0,x20
00b9cdb8	bl 0x00c302d0
00b9cdbc	and x22,x0,#0xff
00b9cdc0	add x0,sp,#0x50
00b9cdc4	mov x1,x21
00b9cdc8	mov x2,x22
00b9cdcc	bl 0x00c42970
00b9cdd0	cbnz w0,0x00b9ce2c
00b9cdd4	mov w1,#0x1
00b9cdd8	mov x0,x21
00b9cddc	mov x2,x22
00b9cde0	bl 0x00c301c0
00b9cde4	ldr x20,[sp, #0xb0]
00b9cde8	adrp x8,0xb9d000
00b9cdec	adrp x23,0x786000
00b9cdf0	add x8,x8,#0x8
00b9cdf4	add x23,x23,#0x8e4
00b9cdf8	stp x8,x23,[sp, #0xc0]
00b9cdfc	cbnz x20,0x00b9ce20
00b9ce00	cmp w22,#0x1d
00b9ce04	mov w8,#0x20
00b9ce08	orr w9,wzr,#0x18
00b9ce0c	csel x8,x9,x8,cc
00b9ce10	cmp w22,#0x15
00b9ce14	mov w9,#0x10
00b9ce18	csel x20,x9,x8,cc
00b9ce1c	str x20,[sp, #0xb0]
00b9ce20	add x8,x20,x20, LSL #0x1
00b9ce24	cmp x8,#0x301
00b9ce28	b.ls 0x00b9ce70
00b9ce2c	cbz w19,0x00b9ce3c
00b9ce30	adrp x0,0x77c000
00b9ce34	add x0,x0,#0x854
00b9ce38	bl 0x00c30760
00b9ce3c	mov w0,#0x1
00b9ce40	ldr x8,[x25, #0x28]
00b9ce44	ldur x9,[x29, #-0x60]
00b9ce48	cmp x8,x9
00b9ce4c	b.ne 0x00b9d004
00b9ce50	add sp,sp,#0x260
00b9ce54	ldp x29,x30,[sp, #0x50]
00b9ce58	ldp x20,x19,[sp, #0x40]
00b9ce5c	ldp x22,x21,[sp, #0x30]
00b9ce60	ldp x24,x23,[sp, #0x20]
00b9ce64	ldp x26,x25,[sp, #0x10]
00b9ce68	ldp x28,x27,[sp], #0x60
00b9ce6c	ret
00b9ce70	ldr x24,[x26, #0x20]
00b9ce74	orr w8,wzr,#0x180
00b9ce78	add x9,sp,#0xd0
00b9ce7c	cmp x20,#0x17f
00b9ce80	sub x8,x8,x20
00b9ce84	add x22,x9,x20
00b9ce88	csel x2,xzr,x8,hi
00b9ce8c	mov x0,x22
00b9ce90	mov w1,wzr
00b9ce94	add x21,x23,x24
00b9ce98	bl 0x00c301c0
00b9ce9c	add x0,sp,#0xd0
00b9cea0	mov x1,x21
00b9cea4	mov x2,x20
00b9cea8	bl 0x00c2ffd0
00b9ceac	add x24,x24,x20
00b9ceb0	lsr x21,x20,#0x1
00b9ceb4	add x1,x23,x24
00b9ceb8	mov x0,x22
00b9cebc	mov x2,x21
00b9cec0	bl 0x00c2ffd0
00b9cec4	add x20,x21,x20
00b9cec8	add x8,x24,x21
00b9cecc	add x0,sp,#0x50
00b9ced0	add x1,sp,#0xd0
00b9ced4	mov x2,x20
00b9ced8	str x8,[x26, #0x20]
00b9cedc	bl 0x00c428c0
00b9cee0	cbz w0,0x00b9cef0
00b9cee4	add x0,sp,#0xd0
00b9cee8	mov x1,x20
00b9ceec	b 0x00b9ccc4
00b9cef0	mov w8,#0x1
00b9cef4	add x0,sp,#0xd0
00b9cef8	mov x1,x20
00b9cefc	str w8,[sp, #0xa8]
00b9cf00	bl 0x00c42220
00b9cf04	ldr x20,[sp, #0xb0]
00b9cf08	cmp x20,#0x180
00b9cf0c	b.hi 0x00b9ce2c
00b9cf10	add x0,sp,#0xd0
00b9cf14	orr w2,wzr,#0x180
00b9cf18	mov w1,wzr
00b9cf1c	bl 0x00c301c0
00b9cf20	ldp x8,x0,[sp, #0xc0]
00b9cf24	add x1,sp,#0xd0
00b9cf28	mov x2,x20
00b9cf2c	blr x8
00b9cf30	cbnz w0,0x00b9ce2c
00b9cf34	ldr x20,[sp, #0xb0]
00b9cf38	add x0,sp,#0x50
00b9cf3c	add x1,sp,#0xd0
00b9cf40	mov x2,x20
00b9cf44	bl 0x00c428c0
00b9cf48	cbnz w0,0x00b9cee4
00b9cf4c	mov w8,#0x1
00b9cf50	add x0,sp,#0xd0
00b9cf54	mov x1,x20
00b9cf58	str w8,[sp, #0xa8]
00b9cf5c	bl 0x00c42220
00b9cf60	add x0,sp,#0x50
00b9cf64	mov x1,sp
00b9cf68	mov w2,#0x50
00b9cf6c	mov x3,xzr
00b9cf70	mov x4,xzr
00b9cf74	bl 0x00c428a0
00b9cf78	cbnz w0,0x00b9ce2c
00b9cf7c	add x0,sp,#0x50
00b9cf80	mov x1,sp
00b9cf84	mov w2,#0x50
00b9cf88	mov x3,xzr
00b9cf8c	mov x4,xzr
00b9cf90	bl 0x00c428a0
00b9cf94	cbnz w0,0x00b9ce2c
00b9cf98	adrp x1,0x786000
00b9cf9c	add x1,x1,#0x90c
00b9cfa0	mov x0,sp
00b9cfa4	mov w2,#0x50
00b9cfa8	bl 0x00c300b0
00b9cfac	cbnz w0,0x00b9ce2c
00b9cfb0	add x0,sp,#0x50
00b9cfb4	bl 0x00c42830
00b9cfb8	add x0,sp,#0x50
00b9cfbc	mov w1,#0x80
00b9cfc0	bl 0x00c42220
00b9cfc4	mov w20,#0x2710
00b9cfc8	add x0,sp,#0x50
00b9cfcc	str w20,[sp, #0xbc]
00b9cfd0	bl 0x00c42830
00b9cfd4	add x0,sp,#0x50
00b9cfd8	mov w1,#0x80
00b9cfdc	bl 0x00c42220
00b9cfe0	str w20,[sp, #0xbc]
00b9cfe4	cbz w19,0x00b9cffc
00b9cfe8	adrp x0,0x77c000
00b9cfec	add x0,x0,#0x87c
00b9cff0	bl 0x00c30760
00b9cff4	mov w0,#0xa
00b9cff8	bl 0x00c42240
00b9cffc	mov w0,wzr
00b9d000	b 0x00b9ce40
00b9d004	bl 0x00c2fec0
