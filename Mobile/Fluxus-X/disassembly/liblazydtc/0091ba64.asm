; FUN_0091ba64 @ 0091ba64
0091ba64	sub sp,sp,#0x60
0091ba68	stp x26,x25,[sp, #0x10]
0091ba6c	stp x24,x23,[sp, #0x20]
0091ba70	stp x22,x21,[sp, #0x30]
0091ba74	stp x20,x19,[sp, #0x40]
0091ba78	stp x29,x30,[sp, #0x50]
0091ba7c	add x29,sp,#0x50
0091ba80	mrs x25,tpidr_el0
0091ba84	ldr x8,[x25, #0x28]
0091ba88	mov w22,w2
0091ba8c	mov x19,x0
0091ba90	mov x20,x1
0091ba94	str x8,[sp, #0x8]
0091ba98	ldrb w8,[x0, #0x1b2]
0091ba9c	tbz w8,#0x5,0x0091bab0
0091baa0	mov x0,x19
0091baa4	bl 0x00924224
0091baa8	mov w23,w0
0091baac	cbnz w0,0x0091bd10
0091bab0	mov x0,x19
0091bab4	bl 0x00935f5c
0091bab8	sub w8,w22,#0x1
0091babc	mov x21,x0
0091bac0	cmp w8,#0x3
0091bac4	mov w24,wzr
0091bac8	b.hi 0x0091bc70
0091bacc	tbnz x21,#0x3f,0x0091bb14
0091bad0	add x8,x19,#0x1b1
0091bad4	ldr w8,[x8]
0091bad8	tbnz w8,#0xd,0x0091bb14
0091badc	tbnz w8,#0x10,0x0091baf8
0091bae0	adrp x1,0x2d2000
0091bae4	add x1,x1,#0xf10
0091bae8	orr w2,wzr,#0xe
0091baec	mov x0,x19
0091baf0	bl 0x00941e8c
0091baf4	cbnz x0,0x0091bb14
0091baf8	adrp x1,0x2c6000
0091bafc	add x1,x1,#0xdb5
0091bb00	mov x0,x20
0091bb04	mov x2,x21
0091bb08	bl 0x009048cc
0091bb0c	mov w23,w0
0091bb10	cbnz w0,0x0091bd10
0091bb14	orr w8,w22,#0x1
0091bb18	cmp w8,#0x3
0091bb1c	b.ne 0x0091bb58
0091bb20	ldr x8,[x19, #0x11d0]
0091bb24	cbz x8,0x0091bb58
0091bb28	ldr x26,[x8, #0x48]
0091bb2c	cbz x26,0x0091bb58
0091bb30	adrp x24,0x2d0000
0091bb34	add x24,x24,#0xdf4
0091bb38	ldr x2,[x26]
0091bb3c	mov x0,x20
0091bb40	mov x1,x24
0091bb44	bl 0x009048cc
0091bb48	mov w23,w0
0091bb4c	cbnz w0,0x0091bd10
0091bb50	ldr x26,[x26, #0x8]
0091bb54	cbnz x26,0x0091bb38
0091bb58	cmp w22,#0x1
0091bb5c	b.ne 0x0091bb78
0091bb60	adrp x1,0x2c2000
0091bb64	add x1,x1,#0xf9f
0091bb68	orr w2,wzr,#0xc
0091bb6c	mov x0,x19
0091bb70	bl 0x00941e8c
0091bb74	cbz x0,0x0091bbc0
0091bb78	ldr w8,[x19, #0x12c]
0091bb7c	mov w24,wzr
0091bb80	cbnz w8,0x0091bc70
0091bb84	adrp x1,0x2a9000
0091bb88	add x1,x1,#0x521
0091bb8c	orr w2,wzr,#0x6
0091bb90	mov x0,x19
0091bb94	bl 0x00941e8c
0091bb98	cbz x0,0x0091bbe0
0091bb9c	adrp x1,0x2cc000
0091bba0	adrp x3,0x2a7000
0091bba4	add x1,x1,#0xc83
0091bba8	add x3,x3,#0x3ab
0091bbac	orr w2,wzr,#0x7
0091bbb0	orr w4,wzr,#0xc
0091bbb4	bl 0x0091a870
0091bbb8	and w24,w0,#0x1
0091bbbc	b 0x0091bc70
0091bbc0	adrp x1,0x2d0000
0091bbc4	add x1,x1,#0xdf9
0091bbc8	mov w2,#0x31
0091bbcc	mov x0,x20
0091bbd0	bl 0x009045fc
0091bbd4	mov w23,w0
0091bbd8	cbnz w0,0x0091bd10
0091bbdc	b 0x0091bb78
0091bbe0	mov w8,#0x131c
0091bbe4	ldrb w8,[x19, x8]
0091bbe8	mov w24,wzr
0091bbec	tbnz w8,#0x7,0x0091bc70
0091bbf0	mov w8,#0x1319
0091bbf4	ldrb w8,[x19, x8]
0091bbf8	mov w24,wzr
0091bbfc	cmp w8,#0xa
0091bc00	b.eq 0x0091bc70
0091bc04	ldr x8,[x19, #0x20]
0091bc08	mov w24,wzr
0091bc0c	ldrb w8,[x8, #0x574]
0091bc10	cmp w8,#0xa
0091bc14	b.eq 0x0091bc70
0091bc18	cmp w8,#0x13
0091bc1c	b.hi 0x0091bc6c
0091bc20	mov w8,#0x1318
0091bc24	ldrb w8,[x19, x8]
0091bc28	mov w24,wzr
0091bc2c	cmp w8,#0x1
0091bc30	b.eq 0x0091bc70
0091bc34	mov x0,x19
0091bc38	bl 0x00935f78
0091bc3c	cmp x0,#0x100, LSL #12
0091bc40	mov w24,wzr
0091bc44	b.ls 0x0091bc70
0091bc48	adrp x1,0x2b9000
0091bc4c	add x1,x1,#0x19f
0091bc50	mov w2,#0x16
0091bc54	mov x0,x20
0091bc58	bl 0x009045fc
0091bc5c	mov w23,w0
0091bc60	cbnz w0,0x0091bd10
0091bc64	mov w24,#0x1
0091bc68	b 0x0091bc70
0091bc6c	mov w24,wzr
0091bc70	adrp x1,0x2b9000
0091bc74	add x1,x1,#0x17a
0091bc78	mov w2,#0x2
0091bc7c	mov x0,x20
0091bc80	bl 0x009045fc
0091bc84	mov w23,w0
0091bc88	cbnz w0,0x0091bd10
0091bc8c	mov x0,x19
0091bc90	mov x1,x21
0091bc94	bl 0x00931c50
0091bc98	cbz w24,0x0091bcf8
0091bc9c	adrp x2,0xc4f000
0091bca0	add x2,x2,#0x4b0
0091bca4	mov x0,sp
0091bca8	mov w3,#0x2
0091bcac	mov x1,x19
0091bcb0	str xzr,[sp]
0091bcb4	bl 0x009356e0
0091bcb8	mov w23,w0
0091bcbc	cbnz w0,0x0091bcd4
0091bcc0	ldr x1,[sp]
0091bcc4	mov x0,x19
0091bcc8	bl 0x00935a68
0091bccc	mov w23,w0
0091bcd0	cbz w0,0x0091bce8
0091bcd4	ldr x1,[sp]
0091bcd8	cbz x1,0x0091bd10
0091bcdc	mov x0,x19
0091bce0	bl 0x0093578c
0091bce4	b 0x0091bd10
0091bce8	ldr x8,[sp]
0091bcec	mov w9,#0x2
0091bcf0	ldr x8,[x8, #0x10]
0091bcf4	str w9,[x8, #0x30]
0091bcf8	orr w1,wzr,#0x3
0091bcfc	mov x2,#-0x1
0091bd00	mov w3,#0x1
0091bd04	mov x0,x19
0091bd08	bl 0x00943380
0091bd0c	mov w23,wzr
0091bd10	ldr x8,[x25, #0x28]
0091bd14	ldr x9,[sp, #0x8]
0091bd18	cmp x8,x9
0091bd1c	b.ne 0x0091bd40
0091bd20	mov w0,w23
0091bd24	ldp x29,x30,[sp, #0x50]
0091bd28	ldp x20,x19,[sp, #0x40]
0091bd2c	ldp x22,x21,[sp, #0x30]
0091bd30	ldp x24,x23,[sp, #0x20]
0091bd34	ldp x26,x25,[sp, #0x10]
0091bd38	add sp,sp,#0x60
0091bd3c	ret
0091bd40	bl 0x00c2fec0
